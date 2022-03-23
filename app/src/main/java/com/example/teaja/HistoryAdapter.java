package com.example.teaja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

public class HistoryAdapter extends PagerAdapter {

    private Context mContext;
    private List<HistoryView> mHistoryViews;

    public HistoryAdapter(Context Context, List<HistoryView> HistoryViews) {
        this.mContext = Context;
        this.mHistoryViews = HistoryViews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_hisview, container, false);
        HistoryView historyView = mHistoryViews.get(position);
        ImageView imghis = view.findViewById(R.id.img_Item_His);
        if(historyView != null){
            Glide.with(mContext).load(historyView.getImg_His()).into(imghis);
        }
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        if (mHistoryViews != null){
            return mHistoryViews.size();
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
