package com.skeleton.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.skeleton.R;
import com.skeleton.modal.signupResponse.TheResponse;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.CommonParams;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.Log;
import com.skeleton.util.ValidateEditText;
import com.skeleton.util.customview.MaterialEditText;


/**
 * Created by admin23 on 10/5/17.
 */

public class SignInFragment extends BaseFragment {
    private MaterialEditText editTextEmail, editTextPassword;
    private Button buttonSignIn, buttonSignInWithFB;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_sign_in, container, false);
        init(view);
        return view;
    }

    /**
     * @param view inflated view
     */
    private void init(final View view) {
        editTextEmail = (MaterialEditText) view.findViewById(R.id.etEmail);
        editTextPassword = (MaterialEditText) view.findViewById(R.id.etPassword);
        buttonSignIn = (Button) view.findViewById(R.id.btnSignIn);
        buttonSignIn.setOnClickListener(this);
    }

    /**
     * @param v view clicked
     */
    public void onClick(final View v) {
        /**
         * switch case
         */
        switch (v.getId()) {
            case R.id.btnSignIn:
                if (validateinfo()) {
                    getData();
                }
                break;
            default:
        }

    }

    /**
     * getting user info
     */
    private void getData() {
        CommonParams params = new CommonParams.Builder()
                .add("email", editTextEmail.getText().toString())
                .add("password", editTextPassword.getText().toString())
                .add("deviceType", "ANDROID")
                .add("language", "EN")
                .add("deviceToken", "gdsxhskj")
                .add("flushPreviousSessions", true)
                .add("appVersion", 1)
                .build();
        RestClient.getApiInterface().login(null, params.getMap()).enqueue(new ResponseResolver<TheResponse>(getContext(), true, true) {

            @Override
            public void success(final TheResponse theResponse) {
                Log.i("app", "success");
            }

            @Override
            public void failure(final APIError error) {
                Log.i("app", "fail");
            }
        });
    }


    /**
     * @return boolean value
     */

    private boolean validateinfo() {
        if (!(ValidateEditText.checkEmail(editTextEmail))) {
            return false;
        } else if (!ValidateEditText.checkPassword(editTextPassword, false)) {
            return false;
        }
        return true;
    }
}
