package com.example.teaja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

public class ReViewQCAdapter extends PagerAdapter {

    private Context mContext;
    private List<ReViewQC> mQcList;

    public ReViewQCAdapter(Context mContext, List<ReViewQC> mQcList) {
        this.mContext = mContext;
        this.mQcList = mQcList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_review_quangcao, container, false);
        ImageView imgViewQC = view.findViewById(R.id.img_Item_ReviewQC);
        ReViewQC reViewQC = mQcList.get(position);

        if(reViewQC != null){
            Glide.with(mContext).load(reViewQC.getReviewSC()).into(imgViewQC);
        }

        container.addView(view); //add view vao viewgroup
        return view;
    }

    @Override
    public int getCount() {
        if(mQcList != null){
            return mQcList.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
