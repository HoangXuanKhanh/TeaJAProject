package com.example.teaja.FragmentTEAJA;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


import com.example.teaja.AppUserName;
import com.example.teaja.DetailListen;
import com.example.teaja.DetailRead;
import com.example.teaja.DetaileABC;
import com.example.teaja.DetaileVideo;
import com.example.teaja.HomeRecyclerView.ListUser;
import com.example.teaja.HomeRecyclerView.ListUserAdapter;
import com.example.teaja.HomeRecyclerView.Paner1;
import com.example.teaja.HomeRecyclerView.PanerAdapter;
import com.example.teaja.Learning.MainActivityBaiTap;
import com.example.teaja.Learning.MainActivityJLPT;
import com.example.teaja.Learning.MainActivityKanji;
import com.example.teaja.Learning.MainActivityMinna;
import com.example.teaja.Learning.MainActivityNguPhap;
import com.example.teaja.Learning.MainActivityTuVung;
import com.example.teaja.R;
import com.example.teaja.ReViewQC;
import com.example.teaja.ReViewQCAdapter;
import com.example.teaja.SearcherTK.SQLHeper;
import com.example.teaja.SearcherTK.TimKiem;
import com.example.teaja.myInterface.IClickItemListUser;
import com.example.teaja.myInterface.IClickItemPanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivityHomeTEAJA extends Fragment {

    View mview;
    TextView tvstrName;
    private RecyclerView recyclerViewPanner;
    private RecyclerView recyclerViewListUser;
    private PanerAdapter panerAdapter;
    private ListUserAdapter listuserAdapter;

    FragmentActivity HomemainActivity;

    AutoCompleteTextView autoCompleteTextViewTimKiem;
    private SQLHeper sqlHeper;
    private List<TimKiem> timKiemList;

    private ViewPager mViewPager;
    private CircleIndicator mCircleIndicator;
    private ReViewQCAdapter mReViewQCAdapter;
    private List<ReViewQC> mReViewListPhoto;
    private Timer mTimer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.activity_main_home_teaja, container, false);
        tvstrName = mview.findViewById(R.id.tv_NameSTr);
        recyclerViewPanner = mview.findViewById(R.id.Rcy_Paner1);
        recyclerViewListUser = mview.findViewById(R.id.rcy_listuser);
        autoCompleteTextViewTimKiem = mview.findViewById(R.id.act_timkiem);
        mViewPager = mview.findViewById(R.id.vpg_QCao);
        mCircleIndicator = mview.findViewById(R.id.cir_QCao);
        HomemainActivity = getActivity();

        tvstrName.setText(AppUserName.eUserName);
        String strName = tvstrName.getText().toString().trim(); //chuyển tên từ activity đăng nhập sang
        AppUserName.eUserName = strName;
        //-----------------------------------------------
        panerAdapter = new PanerAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(HomemainActivity,1, RecyclerView.HORIZONTAL, false );
        recyclerViewPanner.setLayoutManager(layoutManager);
        recyclerViewPanner.setAdapter(panerAdapter);
        panerAdapter.PanerAdapter(getListPanner(), new IClickItemPanner() {
            @Override
            public void setOnClickItemListenerPanner(Paner1 panner) {
                onClickItemPanner1(panner);
            }
        });//----------------------------------------------------;
        listuserAdapter = new ListUserAdapter();
        RecyclerView.LayoutManager manager = new GridLayoutManager(HomemainActivity, 3, RecyclerView.VERTICAL, false);
        recyclerViewListUser.setLayoutManager(manager);
        recyclerViewListUser.setAdapter(listuserAdapter);
        listuserAdapter.ListUserAdapter(getListUser(), new IClickItemListUser() {
            @Override
            public void setOnClickItemListenerListUser(ListUser user) {
                onClickItemLítUser(user);
            }
        });

        //autocompletextview
        final SQLHeper sqlHeper = new SQLHeper(HomemainActivity);
        final String[] myData = sqlHeper.SelectAllData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomemainActivity,
                android.R.layout.simple_dropdown_item_1line, myData);
        autoCompleteTextViewTimKiem.setAdapter(adapter);

        autoCompleteTextViewTimKiem.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                String name = autoCompleteTextViewTimKiem.getText().toString().toLowerCase().trim();
                TimKiem timKiem = new TimKiem(name);
                sqlHeper.addSearchName(timKiem);
            }
        });

        // review anh slide quang cao
        mReViewListPhoto = getListReViewQCao();
        mReViewQCAdapter = new ReViewQCAdapter(HomemainActivity, mReViewListPhoto);
        mViewPager.setAdapter(mReViewQCAdapter);
        mCircleIndicator.setViewPager(mViewPager);
        mReViewQCAdapter.registerDataSetObserver(mCircleIndicator.getDataSetObserver());
        autuRunSlideImage();
        return  mview;
    }

    private void onClickItemPanner1(Paner1 panner) {
        if(panner.getId() == 1){
            Intent intent = new Intent(HomemainActivity, DetaileABC.class);
            startActivity(intent);
        }else if (panner.getId() == 2){
            Intent intent = new Intent(HomemainActivity, DetaileVideo.class);
            startActivity(intent);
        }
        else if (panner.getId() == 3){
            Intent intent = new Intent(HomemainActivity, DetailListen.class);
            startActivity(intent);
        }
        else if (panner.getId() == 4){
            Intent intent = new Intent(HomemainActivity, DetailRead.class);
            startActivity(intent);
        }
    }
    private List<Paner1> getListPanner() {
        List<Paner1> list = new ArrayList<>();
        list.add(new Paner1(1,R.drawable.ic_abc,"abc"));
        list.add(new Paner1(2,R.drawable.ic_video,"video"));
        list.add(new Paner1(3,R.drawable.ic_nghe,"nghe"));
        list.add(new Paner1(4,R.drawable.ic_read,"đọc"));
        return list;
    }//-----------------------------1

    private void onClickItemLítUser(ListUser user) {
        if(user.getId() == 1){
            Intent intent = new Intent(HomemainActivity, MainActivityTuVung.class);
            startActivity(intent);
        } else if (user.getId() == 2){
            Intent intent = new Intent(HomemainActivity, MainActivityNguPhap.class);
            startActivity(intent);
        }else if (user.getId() == 3){
            Intent intent = new Intent(HomemainActivity, MainActivityBaiTap.class);
            startActivity(intent);
        }else if (user.getId() == 4){
            Intent intent = new Intent(HomemainActivity, MainActivityJLPT.class);
            startActivity(intent);
        }
        else if (user.getId() == 5){
            Intent intent = new Intent(HomemainActivity, MainActivityMinna.class);
            startActivity(intent);
        }
        else if (user.getId() == 6){
            Intent intent = new Intent(HomemainActivity, MainActivityKanji.class);
            startActivity(intent);
        }
    }
    private List<ListUser> getListUser() {
        List<ListUser> list = new ArrayList<>();
        list.add(new ListUser(1,R.drawable.ic_tuvung,"Từ Vựng"));
        list.add(new ListUser(2,R.drawable.ic_nguphap,"Ngữ Pháp"));
        list.add(new ListUser(3,R.drawable.ic_baitap,"Bài Tập"));
        list.add(new ListUser(4,R.drawable.ic_jlpt,"JLPT"));
        list.add(new ListUser(5,R.drawable.ic_minna,"Minna"));
        list.add(new ListUser(6,R.drawable.ic_kanji,"Kanji"));

        return list;
    }//-----------------------------2

    private List<ReViewQC> getListReViewQCao() {
        List<ReViewQC> list = new ArrayList<>();
        list.add(new ReViewQC(R.drawable.ic_view1));
        list.add(new ReViewQC(R.drawable.ic_view2));
        list.add(new ReViewQC(R.drawable.ic_view3));
        list.add(new ReViewQC(R.drawable.ic_view4));
        list.add(new ReViewQC(R.drawable.ic_view5));
        list.add(new ReViewQC(R.drawable.ic_view6));

        return  list;
    }

    private void autuRunSlideImage() {
        if(mReViewListPhoto == null || mReViewListPhoto.isEmpty() || mViewPager == null){
            return;
        }
        //khoi tao timer;
        if(mTimer == null){
            mTimer = new Timer();
        }
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        int mCurrentItem = mViewPager.getCurrentItem();
                        int totalItem = mReViewListPhoto.size() - 1;
                        if(mCurrentItem < totalItem){
                            mCurrentItem++;
                            mViewPager.setCurrentItem(mCurrentItem);
                        }else{
                            mViewPager.setCurrentItem(0);
                        }
                    }
                });
            }
        }, 500, 3000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mTimer != null){
            mTimer.cancel();
            mTimer = null;
        }
    }
}