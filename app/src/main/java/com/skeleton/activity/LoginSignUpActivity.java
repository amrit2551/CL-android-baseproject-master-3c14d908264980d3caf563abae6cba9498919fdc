package com.skeleton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.skeleton.R;
import com.skeleton.adapter.PagerAdapter;
import com.skeleton.database.CommonData;
import com.skeleton.fragment.SignInFragment;
import com.skeleton.fragment.SignUpFragment;
import com.skeleton.modal.signupResponse.TheResponse;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin23 on 10/5/17.
 */

public class LoginSignUpActivity extends BaseActivity {
    private ViewPager viewPager;
    private List<Fragment> fList;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
//        tabLayout.addTab(tabLayout.newTab().setText("sign_up"));
//        tabLayout.addTab(tabLayout.newTab().setText("sign_in"));
        PagerAdapter pagerAdapter = new com.skeleton.adapter.PagerAdapter(getSupportFragmentManager(), fList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    /**
     * init
     */
    private void init() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tlSlide);
        fList = new ArrayList<>();
        fList.add(new SignUpFragment());
        fList.add(new SignInFragment());
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RC_OTP:
                if (resultCode == RESULT_OK) {
                    nextStep(CommonData.getAccessToken());
                }
                break;

            default:
                break;

        }
    }

    /**
     * nextStep takes to activity as per the profile completed
     *
     * @param mAccessToken token access user details
     */
    public void nextStep(final String mAccessToken) {
        if (mAccessToken != null) {
            RestClient.getApiInterface().getProfile("bearer " + mAccessToken).enqueue(new ResponseResolver<TheResponse>(this, true, true) {
                @Override
                public void success(final TheResponse theResponse) {
                    if (theResponse.getData().getUserDetails().getPhoneVerified()) {
                        startActivityForResult(new Intent(LoginSignUpActivity.this, OtpActivity.class), RC_OTP);
                    } else {
                        if (theResponse.getData().getUserDetails().getStep1CompleteOrSkip()
                                && theResponse.getData().getUserDetails().getStep2CompleteOrSkip()) {
                            startActivityForResult(new Intent(LoginSignUpActivity.this, HomeActivity.class)
                                    , RC_COMPLETE_PROFILE);
                        } else {
                            startActivityForResult(new Intent(LoginSignUpActivity.this, CompleteProfileActivity.class)
                                    , RC_HOME);
                        }
                    }
                }

                @Override
                public void failure(final APIError error) {

                }
            });
        }
    }
}