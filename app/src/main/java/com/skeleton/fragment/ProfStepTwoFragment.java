package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.skeleton.R;
import com.skeleton.activity.HomeActivity;
import com.skeleton.adapter.RecyclerViewAdapter;
import com.skeleton.modal.signupResponse.userproftwo.Categories;
import com.skeleton.modal.signupResponse.userproftwo.Category;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin23 on 19/5/17.
 */

public class ProfStepTwoFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private List<Category> cList;
    private Button btnsaveAndcont, btnSkip;
    private ArrayList<String> arrayList = new ArrayList<>();
    private View v1, v2, v3, v4, v5;
    private Intent intent;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_prof_two, container, false);
        init(view);
        RestClient.getApiInterface().getCategories("auth")
                .enqueue(new ResponseResolver<Categories>(getContext()) {
                    @Override
                    public void success(final Categories categories) {
                        cList = categories.getData().getCategories();
                        RecyclerViewAdapter recyclerAdaptor = new RecyclerViewAdapter(getContext(), cList, ProfStepTwoFragment.this);
                        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
                        recyclerView.setAdapter(recyclerAdaptor);
                    }

                    @Override
                    public void failure(final APIError error) {

                    }
                });
        return view;
    }

    /**
     * initialize all variables
     *
     * @param view reference to view
     */
    private void init(final View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        v1 = view.findViewById(R.id.vFirst);
        v2 = view.findViewById(R.id.vSecond);
        v3 = view.findViewById(R.id.vThird);
        v4 = view.findViewById(R.id.vFourth);
        v5 = view.findViewById(R.id.vFifth);
        btnsaveAndcont = (Button) view.findViewById(R.id.btnSave_cont);
        btnsaveAndcont.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        intent = new Intent(getActivity(), HomeActivity.class);
        startActivity(intent);
    }

    /**
     * @param limit num of views to be filled
     */
    public void colorBar(final int limit) {
        setView(limit, v1, v2, v3, v4, v5);
    }

    /**
     * @param limit num of views to be filled
     * @param view  views to be filled
     */
    private void setView(final int limit, final View... view) {
        for (int i = 0; i < view.length; i++) {
            if (i < limit) {
                view[i].setBackgroundResource(R.color.colorPrimary);
            } else {
                view[i].setBackgroundResource(R.color.gray_light);
            }
        }
    }
}
