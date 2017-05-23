package com.skeleton.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.skeleton.R;
import com.skeleton.adapter.PagerAdapter;
import com.skeleton.database.CommonData;
import com.skeleton.fragment.ProfOneFragment;
import com.skeleton.fragment.ProfStepTwoFragment;
import com.skeleton.modal.signupResponse.TheResponse;
import com.skeleton.modal.signupResponse.UserDetails;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;
import com.skeleton.util.Log;
import com.skeleton.util.customview.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

import static com.skeleton.constant.AppConstant.RC_HOME;

/**
 * activity complete profile
 */
public class CompleteProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private CustomViewPager customViewPager;
    private List<Fragment> fragmentList;
    private Button btnSkip;
    private ImageView ivBack;
    private UserDetails muserInfo;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        init();
        adapter = new PagerAdapter(getSupportFragmentManager(), fragmentList);
        customViewPager.setAdapter(adapter);
        customViewPager.setPagingEnabled(false);
        customViewPager.setOffscreenPageLimit(2);


        if (muserInfo != null) {

            if (muserInfo.getStep1CompleteOrSkip()) {
                customViewPager.setCurrentItem(1);
            } else {
                customViewPager.setCurrentItem(0);
            }

        } else {
            Log.d("Debug", "userDetails object null");
        }
    }


        /**
         * @param item index of the view pager which is to be set
         */

    public void setCurrentPagerItem(final int item) {
        customViewPager.setCurrentItem(item);
    }


    /**
     * initialization
     */
    private void init() {
        fragmentList = new ArrayList<>();
        customViewPager = (CustomViewPager) findViewById(R.id.vpCProfile);
        btnSkip = (Button) findViewById(R.id.btnSkip);
        ivBack = (ImageView) findViewById(R.id.ivBck);
        fragmentList.add(new ProfOneFragment());
        fragmentList.add(new ProfStepTwoFragment());

    }

    /**
     *
     * @param fragmentNumber integerfragnumber
     */
    public void setFragment(final int fragmentNumber) {
        customViewPager.setCurrentItem(fragmentNumber);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.btnSkip:
                final int mCurrent = customViewPager.getCurrentItem() + 1;
                RestClient.getApiInterface().skipStep("bearer " + CommonData.getAccessToken(), mCurrent)
                        .enqueue(new ResponseResolver<TheResponse>(CompleteProfileActivity.this) {

                            @Override
                            public void success(final TheResponse theResponse) {
                                if (customViewPager.getCurrentItem() != 1) {
                                    customViewPager.setCurrentItem(1);
                                } else {
                                    Intent intent = new Intent(CompleteProfileActivity.this, HomeActivity.class);
                                    startActivityForResult(intent, RC_HOME);
                                }

                            }

                            @Override
                            public void failure(final APIError error) {

                            }
                        });
                break;
            case R.id.ivBck:
                if (customViewPager.getCurrentItem() != 0) {
                    customViewPager.setCurrentItem(customViewPager.getCurrentItem() - 1, false);
                } else {
                    finish();
                }

                break;
            default:
                break;
        }
    }
}
