package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bumptech.glide.Glide;
import com.kbeanie.multipicker.api.entity.ChosenImage;
import com.skeleton.R;
import com.skeleton.modal.signupResponse.TheResponse;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.MultipartParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.Log;
import com.skeleton.util.ValidateEditText;
import com.skeleton.util.customview.MaterialEditText;
import com.skeleton.util.imagepicker.ImageChooser;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.paperdb.Paper;


/**
 * Created by admin23 on 10/5/17.
 */

public class SignUpFragment extends BaseFragment {
    private MaterialEditText editTextName, editTextPhone, editTextEmail,
            editTextDOB, editTextPassword, editTextConfirmPassword;
    private Button btnSignUp;
    private ImageChooser imageChooser;
    private ImageView ivdisplaypicture;
    private RadioGroup radioGroup;
    private RadioButton radioButtonFemale, radioButtonMale;
    private Date date = new Date();
    private CheckBox checkBox;
    private int gender;
    private File imagefile;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_sign_up, container, false);
        init(view);
        Paper.init(getContext());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(final RadioGroup group, @IdRes final int checkedId) {
                if (checkedId == R.id.rbtnFemale) {
                    gender = 1;
                } else {
                    gender = 0;
                }

            }
        });
        return view;
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        imageChooser.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions,
                                           @NonNull final int[] grantResults) {
        imageChooser.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /**
     * @param view inflated view
     */
    private void init(final View view) {

        editTextName = (MaterialEditText) view.findViewById(R.id.etName);
        editTextPhone = (MaterialEditText) view.findViewById(R.id.etPhoneNum);
        //ivdisplaypicture = (ImageView) view.findViewById(R.id.iv_Dp);
        editTextEmail = (MaterialEditText) view.findViewById(R.id.etEmail);
        editTextDOB = (MaterialEditText) view.findViewById(R.id.etDOB);
        editTextPassword = (MaterialEditText) view.findViewById(R.id.etPassword);
        editTextConfirmPassword = (MaterialEditText) view.findViewById(R.id.etConfirmPassword);
        radioGroup = (RadioGroup) view.findViewById(R.id.rgGender);
        radioButtonFemale = (RadioButton) view.findViewById(R.id.rbtnFemale);
        radioButtonMale = (RadioButton) view.findViewById(R.id.rbtnMale);
        checkBox = (CheckBox) view.findViewById(R.id.cb);
        btnSignUp = (Button) view.findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);
        //ivdisplaypicture.setOnClickListener(this);
        radioButtonFemale.setChecked(true);
        gender = 1;
    }

    /**
     * @param v view
     */
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.btnSignUp:
                if (validateData()) {
                    post();
                }
                break;
            case R.id.iv_Dp:
                selectImage();
                break;
            default:
                return;
        }
    }

    /**
     * @return boolean
     */
    private boolean validateData() {
        if (!ValidateEditText.checkName(editTextName, true)) {
            return false;
        } else if (!ValidateEditText.checkPhoneNumber(editTextPhone)) {
            return false;
        } else if (!ValidateEditText.checkEmail(editTextEmail)) {
            return false;
        } else if (!ValidateEditText.checkPassword(editTextPassword, false)) {
            return false;
        } else if (!ValidateEditText.checkPassword(editTextConfirmPassword, true)) {
            return false;
        } else if (!ValidateEditText.comparePassword(editTextPassword, editTextConfirmPassword)) {
            return false;
        } else if (!checkBox.isChecked()) {
            return false;
        }
        return true;
    }

    /**
     * @param editText et containing dob
     * @return boolean true if valid, else returns false
     */
    private boolean checkDOB(final EditText editText) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = editText.getText().toString();
        try {
            date = df.parse(s);
            return true;

        } catch (ParseException e) {
            editText.setError(getString(R.string.error_date));
            return false;
        }
    }

    /**
     * signup info
     */
    private void post() {
        MultipartParams params = new MultipartParams.Builder()
                .add("firstName", editTextName.getText().toString().trim())
                .add("dob", editTextDOB.getText().toString().trim())
                .add("countryCode", "+91")
                .add("phoneNo", editTextPhone.getText().toString().trim())
                .add("email", editTextEmail.getText().toString().trim())
                .add("password", editTextPassword.getText().toString().trim())
                .add("gender", gender)
                .add("deviceToken", "gshfcdujh")
                .add("appVersion", "1")
                .add("language", "EN")
                .add("deviceType", "ANDROID")
                .addFile("profilePic", imagefile).build();
        RestClient.getApiInterface().register(params.getMap()).enqueue(new ResponseResolver<TheResponse>(getContext(), true) {
            @Override
            public void success(final TheResponse registerResponse) {
                Paper.book().write("accesstoken", "bearer " + registerResponse.getData().getAccessToken());
                Log.i("app", "success");
            }

            @Override
            public void failure(final APIError error) {
                Log.i("app", "fail");
            }

        });
    }


    /**
     * choose image
     */
    private void selectImage() {
        imageChooser = new ImageChooser.Builder(SignUpFragment.this).build();
        imageChooser.selectImage(new ImageChooser.OnImageSelectListener() {
            @Override
            public void loadImage(final List<ChosenImage> list) {
                imagefile = new File(list.get(0).getOriginalPath());
                Glide.with(SignUpFragment.this)
                        .load(list.get(0).getQueryUri())
                        .into(ivdisplaypicture);
            }

            @Override
            public void croppedImage(final File mCroppedImage) {

            }
        });


    }
}
