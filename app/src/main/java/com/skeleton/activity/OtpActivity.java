package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.database.CommonData;
import com.skeleton.modal.signupResponse.TheResponse;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ApiInterface;
import com.skeleton.retrofit.CommonParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.ValidateEditText;
import com.skeleton.util.customview.MaterialEditText;

import io.paperdb.Paper;

/**
 * otp activity
 */
public class OtpActivity extends BaseActivity implements TextWatcher, View.OnClickListener {
    private MaterialEditText etFirst, etSecond, etThird, etFourth;
    private TextView tvPhoneNumberEdit, tvResendOTP, tvPhoneNumber;
    private Button btnVerify, btnSkip;
    private ValidateEditText validateEditText;
    private Intent intent = getIntent();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        init();
        tvPhoneNumber.setText(Paper.book().read("keycode") + "-" + Paper.book().read("keynumber"));
        btnVerify.setOnClickListener(this);
        btnSkip.setOnClickListener(this);
    }

    /**
     * initilization
     */
    private void init() {
        tvResendOTP = (TextView) findViewById(R.id.tvResendOTP);
        tvPhoneNumberEdit = (TextView) findViewById(R.id.tvEditNum);
        btnVerify = (Button) findViewById(R.id.btnVerify);
        etFirst = (MaterialEditText) findViewById(R.id.etDigitOne);
        etSecond = (MaterialEditText) findViewById(R.id.etDigitTwo);
        etThird = (MaterialEditText) findViewById(R.id.etDigitThree);
        etFourth = (MaterialEditText) findViewById(R.id.etDigitFour);
        tvPhoneNumber = (TextView) findViewById(R.id.tvPhoneNum);
        validateEditText = new ValidateEditText();
        etFirst.addTextChangedListener(this);
        etSecond.addTextChangedListener(this);
        etThird.addTextChangedListener(this);
        etFourth.addTextChangedListener(this);
    }


    @Override
    public void beforeTextChanged(final CharSequence s, final int start, final int count, final int after) {

    }

    @Override
    public void onTextChanged(final CharSequence s, final int start, final int before, final int count) {
        if (etFirst.getText().toString().length() == 1) {
            etSecond.requestFocus();
        }
        if (etSecond.getText().toString().length() == 1) {
            etThird.requestFocus();
        }
        if (etThird.getText().toString().length() == 1) {
            etFourth.requestFocus();
        }


    }

    @Override
    public void afterTextChanged(final Editable s) {

    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.btnVerify:
                if (validateEditText.genericEmpty(etFirst, "All fields are compulsory")
                        && validateEditText.genericEmpty(etSecond, "All fields are compulsory")
                        && validateEditText.genericEmpty(etThird, "All fields are compulsory")
                        && validateEditText.genericEmpty(etFourth, "All fields are compulsory")) {
                    chckOtp();
                } else {
                    Toast.makeText(getApplicationContext(), "fields empty", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.tvResendOTP:
                resendOTP();
                break;
            default:
                break;
        }

    }

    /**
     * to verifyotp
     */
    private void chckOtp() {
        CommonParams params = new CommonParams.Builder()
                .add("hcdsh", Paper.book().read("dashbd"))
                .add("cdjc", Paper.book().read("cjdcjd"))
                .add("otpc", etFirst.getText().toString()
                        + etSecond.getText().toString()
                        + etThird.getText().toString()
                        + etFourth.getText().toString()).build();
        ApiInterface apiInterface = RestClient.getApiInterface();
        apiInterface.chckOtp("bearer " + CommonData.getAccessToken(), params.getMap()).enqueue(new ResponseResolver<TheResponse>(this, true) {
            @Override
            public void success(final TheResponse theResponse) {
                if ("200".equals(theResponse.getStatusCode())) {
                    intent = new Intent(OtpActivity.this, CompleteProfileActivity.class);
                    startActivity(intent);
                } else {
                    intent = new Intent(OtpActivity.this, CompleteProfileActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void failure(final APIError error) {
                Log.d(OtpActivity.class.getName(), String.valueOf(error.getStatusCode()));
                Log.d(OtpActivity.class.getName(), error.getMessage());
            }
        });
    }


    /**
     * Send a request to server for sending the otp to the user
     */
    protected void resendOTP() {
        RestClient.getApiInterface().resendOTP("bearer " + CommonData.getAccessToken()).enqueue(new ResponseResolver<TheResponse>(this) {

            @Override
            public void success(final TheResponse theResponse) {

                if ("200".equals(theResponse.getStatusCode())) {
                    Log.e("debug", "OTP resend.");
                } else {
                    Log.e("debug", "OTP resend failed in Sucess.");
                }
            }


            @Override
            public void failure(final APIError error) {
                Log.d("00", String.valueOf(error.getStatusCode()));
                Log.d("00", error.getMessage());
            }
        });
    }

}