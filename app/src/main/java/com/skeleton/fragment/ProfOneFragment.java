package com.skeleton.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.skeleton.R;
import com.skeleton.modal.signupResponse.userprofile.Response;
import com.skeleton.util.Log;
import com.skeleton.util.customview.MaterialEditText;

import java.util.List;

/**
 * Created by admin23 on 17/5/17.
 */

public class ProfOneFragment extends BaseFragment implements View.OnClickListener {
    private MaterialEditText etRelationship, etEthnicity, etReligion, etBodyType, etSmoking, etDrinking, etOrientation, etHeight;
    private View v1, v2, v3, v4, v5, v6, v7, v8;
    private Response responseFinal;
    private Button btnVerify;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_profile_one, container, false);
        init(view);
        return view;
    }

    /**
     * initialize
     *
     * @param view view
     */

    private void init(final View view) {
        etRelationship = (MaterialEditText) view.findViewById(R.id.etRelationship);
        etEthnicity = (MaterialEditText) view.findViewById(R.id.etEthnicity);
        etReligion = (MaterialEditText) view.findViewById(R.id.etReligion);
        etBodyType = (MaterialEditText) view.findViewById(R.id.etBodyType);
        etSmoking = (MaterialEditText) view.findViewById(R.id.etSmoking);
        etDrinking = (MaterialEditText) view.findViewById(R.id.etDrinking);
        etOrientation = (MaterialEditText) view.findViewById(R.id.etOrientation);
        etHeight = (MaterialEditText) view.findViewById(R.id.etHeight);
        btnVerify = (Button) view.findViewById(R.id.btnVerify);
        v1 = view.findViewById(R.id.vFirst);
        v2 = view.findViewById(R.id.vSecond);
        v3 = view.findViewById(R.id.vThird);
        v4 = view.findViewById(R.id.vFourth);
        v5 = view.findViewById(R.id.vFifth);
        v6 = view.findViewById(R.id.vSixth);
        v7 = view.findViewById(R.id.vSeventh);
        v8 = view.findViewById(R.id.eight);
        etRelationship.setOnClickListener(this);
        etEthnicity.setOnClickListener(this);
        etReligion.setOnClickListener(this);
        etBodyType.setOnClickListener(this);
        etSmoking.setOnClickListener(this);
        etDrinking.setOnClickListener(this);
        etOrientation.setOnClickListener(this);
        etHeight.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.etRelationship:
                Log.e("debug", "onclick Relation history");
                showdialog("relhistory",
                        etRelationship, responseFinal.getData().getRelationshipHistory(), v1);
                break;
            case R.id.etEthnicity:
                showdialog("ethnicity",
                        etEthnicity, responseFinal.getData().getEthnicity(), v2);
                break;
            case R.id.etReligion:
                showdialog("religion",
                        etReligion, responseFinal.getData().getReligion(), v3);
                break;
            case R.id.etHeight:
                showdialog("height",
                        etHeight, responseFinal.getData().getHeight(), v4);
                break;
            case R.id.etBodyType:
                showdialog("bodytype",
                        etBodyType, responseFinal.getData().getBodyType(), v5);
                break;
            case R.id.etSmoking:
                showdialog("somking",
                        etSmoking, responseFinal.getData().getSmoking(), v6);
                break;
            case R.id.etDrinking:
                showdialog("drinking",
                        etDrinking, responseFinal.getData().getDrinking(), v7);
                break;
            case R.id.etOrientation:
                showdialog("orientation",
                        etOrientation, responseFinal.getData().getOrientation(), v8);
                break;
            default:
                break;
        }
    }

    /**
     * @param header    title
     * @param met       material Edit Text
     * @param proflist  list
     * @param viewspace View
     */
    private void showdialog(final String header, final MaterialEditText met, final List<String> proflist, final View viewspace) {
        final CharSequence[] cs = proflist.toArray(new CharSequence[proflist.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(header);
        builder.setItems(cs, new DialogInterface.OnClickListener() {
            public void onClick(final DialogInterface dialog, final int item) {
                met.setText(cs[item]);
                viewspace.setBackgroundResource(R.color.green);
            }
        });
        AlertDialog alert = builder.create();
        alert.show();


    }


}
