package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.fragment.ProfStepTwoFragment;
import com.skeleton.modal.signupResponse.userproftwo.Category;
import com.skeleton.util.Log;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by admin23 on 19/5/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private int count = 0;
    private List<Category> categoryList;
    private Context context;
    private ArrayList<String> arrayList = new ArrayList<>();
    private ProfStepTwoFragment profStepTwoFragment;

    /**
     * @param context             context
     * @param categoryList        categories
     * @param profStepTwoFragment context
     */
    public RecyclerViewAdapter(final Context context,
                               final List<Category> categoryList,
                               final ProfStepTwoFragment profStepTwoFragment) {
        this.context = context;
        this.categoryList = categoryList;
        this.profStepTwoFragment = profStepTwoFragment;
    }


    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_layout_prof_two, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Category category = categoryList.get(position);
        holder.mtvInterest.setText(category.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (category.getChecked()) {
                    category.setChecked(false);
                    count--;
                    profStepTwoFragment.colorBar(arrayList.size());
                    arrayList.remove(category.getId());
                } else {
                    if (count == 5) {
                        Log.e("debug", "Success");
                    } else {
                        category.setChecked(true);
                        count++;
                        profStepTwoFragment.colorBar(arrayList.size());
                        arrayList.add(category.getId());
                    }
                }
                notifyDataSetChanged();
            }
        });

    }

    /**
     * @return return arraylist create in adapter
     */
    public ArrayList<String> parse() {
        return arrayList;
    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mtvInterest;
        private CircleImageView ivcheck, ivBlur;


        /**
         * @param itemView item view
         */
        public ViewHolder(final View itemView) {
            super(itemView);
//            mtvInterest = (TextView) itemView.findViewById(R.id.tvInterest);
//            ivBlur = (CircleImageView) itemView.findViewById(R.id.iv_image_blur);
//            ivcheck = (CircleImageView) itemView.findViewById(R.id.iv_check_mark);
        }


    }
}
