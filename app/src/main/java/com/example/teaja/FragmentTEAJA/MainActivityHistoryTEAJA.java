package com.example.teaja.FragmentTEAJA;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
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

import com.example.teaja.HistoryAdapter;
import com.example.teaja.HistoryDetail.DetaiSoTay;
import com.example.teaja.HistoryDetail.DetailCongDong;
import com.example.teaja.HistoryDetail.DetaileDonHang;
import com.example.teaja.HistoryDetail.DetaileHocOnline;
import com.example.teaja.HistoryDetail.DetaileKhaiForm;
import com.example.teaja.HistoryDetail.DetaileLuyenDoc;
import com.example.teaja.HistoryDetail.DetaileLuyenNghe;
import com.example.teaja.HistoryDetail.DetaileLuyenThi;
import com.example.teaja.HistoryDetail.DetaileLuyenViet;
import com.example.teaja.HistoryDetail.DetaileShare;
import com.example.teaja.HistoryDetail.DetaileTraCuu;
import com.example.teaja.HistoryDetail.DetaileTroChuyen;
import com.example.teaja.HistoryDetail.DetaileTroGiup;
import com.example.teaja.HistoryDetail.DetaileTuyenSinh;
import com.example.teaja.HistoryView;
import com.example.teaja.R;
import com.example.teaja.RecycHistory;
import com.example.teaja.RecycHistoryAdapter;
import com.example.teaja.myInterface.IClickItemHistoryRecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import layoufavorite.DetaileCa1;
import layoufavorite.DetaileCa2;
import layoufavorite.DetaileCa3;
import layoufavorite.DetaileCa4;
import layoufavorite.DetaileCa5;
import layoufavorite.DetaileCa6;
import layoufavorite.DetaileCa7;
import layoufavorite.DetaileCa8;
import me.relex.circleindicator.CircleIndicator;

public class MainActivityHistoryTEAJA extends Fragment {
    View mView;
    FragmentActivity historyTEAJA;

    private ViewPager vpHis;
    private CircleIndicator crHis;
    private HistoryAdapter mAdapter;
    private List<HistoryView> list;
    private Timer mTimer;

    private RecyclerView rcyHistory1;
    private RecycHistoryAdapter mHistoryAdapter1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView =  inflater.inflate(R.layout.activity_main_history_teaja,container,false);
        historyTEAJA = getActivity();
        vpHis = mView.findViewById(R.id.vp_his);
        crHis = mView.findViewById(R.id.cir_his);
        rcyHistory1 = mView.findViewById(R.id.rcy_History);

        //review anh slide quang cao
        list = getListHisView();
        mAdapter = new HistoryAdapter(historyTEAJA, list);
        vpHis.setFocusable(false);
        vpHis.setNestedScrollingEnabled(false);
        vpHis.setAdapter(mAdapter);
        crHis.setViewPager(vpHis);
        mAdapter.registerDataSetObserver(crHis.getDataSetObserver());
        autoRunSlideHistory();
        //-----------------------hi-----------
        mHistoryAdapter1 = new RecycHistoryAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(historyTEAJA, 1, RecyclerView.VERTICAL, false);
        rcyHistory1.setLayoutManager(layoutManager);
        rcyHistory1.setFocusable(false);
        rcyHistory1.setNestedScrollingEnabled(false);
        rcyHistory1.setAdapter(mHistoryAdapter1);
        mHistoryAdapter1.RecycHistoryAdapter(getListRcView(), new IClickItemHistoryRecyclerView() {
            @Override
            public void setOnClickItemListenerHis(RecycHistory historyView) {
                onClickDetaileHistory(historyView);
            }
        });
        return  mView;
    }

    //---------------------------------------------------1
    private List<HistoryView> getListHisView() {
        List<HistoryView> mlist = new ArrayList<>();
        mlist.add(new HistoryView(R.drawable.ic_his3));
        mlist.add(new HistoryView(R.drawable.ic_his4));
        mlist.add(new HistoryView(R.drawable.ic_his5));
        return mlist;
    }
    private void autoRunSlideHistory() {
        if (list == null || list.isEmpty() || vpHis == null){
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
                        int mCurrenItem = vpHis.getCurrentItem();
                        int totalItem = list.size() - 1;
                        if (mCurrenItem < totalItem){
                            mCurrenItem++;
                            vpHis.setCurrentItem(mCurrenItem);
                        }else{
                            vpHis.setCurrentItem(0);
                        }
                    }
                });
            }
        },500,3000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mTimer != null){
            mTimer.cancel();
            mTimer = null;
        }
    }//------------------------------------------------------------

    private List<RecycHistory> getListRcView() {// recyclerView
        List<RecycHistory> Rlist = new ArrayList<>();
        Rlist.add(new RecycHistory(1,R.drawable.ic_sotay, "Sổ tay", "Lưu và học từ vựng của riêng bạn"));
        Rlist.add(new RecycHistory(2,R.drawable.ic_congdong, "Cộng đồng", "Hỏi đáp, chia sẻ, kết nối với mọi người"));
        Rlist.add(new RecycHistory(3,R.drawable.ic_luyendoc, "Luyện đọc", "Luyện đọc với các bài báo được tổng hợp từ NHK, CNN,..."));
        Rlist.add(new RecycHistory(4,R.drawable.ic_luyenviet, "Luyện viết", "Luyện viết chữ Kanji theo mẫu"));
        Rlist.add(new RecycHistory(5,R.drawable.ic_luyennghe, "Luyện nghe", "Xem video từ trung tâm giới thiệu đến bạn"));
        Rlist.add(new RecycHistory(6,R.drawable.ic_luyenthi, "Luyện thi", "thử sức mình với các bài thi JLPT"));
        Rlist.add(new RecycHistory(7,R.drawable.ic_tuyensinh, "Tuyển sinh", "Thông tin tuyển sinh từ các khóa học tiếng Nhật Bản, du học, xkld,..."));
        Rlist.add(new RecycHistory(8,R.drawable.ic_donhang, "Đơn hàng", "Tìm kiếm đơn hàng sang hoặc chuyển việc tại Nhật Bản"));
        Rlist.add(new RecycHistory(9,R.drawable.ic_khaiform, "Khai Form", "Đề xuất thông tin, tư vấn từ các đơn vị du học, xkld hàng đầu tại Việt Nam"));
        Rlist.add(new RecycHistory(10,R.drawable.ic_trochuyen, "Cuộc trò chuyện", "Cuộc trò chuyện giữa hai người"));
        Rlist.add(new RecycHistory(11,R.drawable.ic_hoconline, "Khóa học online", "Học qua video từ các khóa học được biên tập sẵn"));
        Rlist.add(new RecycHistory(12,R.drawable.ic_trogiup, "Trợ giúp và phản hồi", "Nếu bạn gặp lỗi hoặc có ý tưởng về tính năng mới hãy gửi mail ngay cho chúng tôi"));
        Rlist.add(new RecycHistory(13,R.drawable.ic_share, "Chia sẻ", "Nếu bạn thấy TeaJA hữu ich, hãy chia sẻ ngay với bạn bè"));
        Rlist.add(new RecycHistory(14,R.drawable.ic_tracuc, "Tra cứu online", "Truy cập website:https//teaja.net"));
        return Rlist;
    }
    private void onClickDetaileHistory(RecycHistory historyView) {
        if(historyView.getID() == 1){
            Intent intent = new Intent(historyTEAJA, DetaiSoTay.class);
            startActivity(intent);
        }else if (historyView.getID() == 2){
            Intent intent = new Intent(historyTEAJA, DetailCongDong.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 3){
            Intent intent = new Intent(historyTEAJA, DetaileLuyenDoc.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 4){
            Intent intent = new Intent(historyTEAJA, DetaileLuyenViet.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 5){
            Intent intent = new Intent(historyTEAJA, DetaileLuyenNghe.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 6){
            Intent intent = new Intent(historyTEAJA, DetaileLuyenThi.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 7){
            Intent intent = new Intent(historyTEAJA, DetaileTuyenSinh.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 8){
            Intent intent = new Intent(historyTEAJA, DetaileDonHang.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 9){
            Intent intent = new Intent(historyTEAJA, DetaileKhaiForm.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 10){
            Intent intent = new Intent(historyTEAJA, DetaileTroChuyen.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 11){
            Intent intent = new Intent(historyTEAJA, DetaileHocOnline.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 12){
            Intent intent = new Intent(historyTEAJA, DetaileTroGiup.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 13){
            Intent intent = new Intent(historyTEAJA, DetaileShare.class);
            startActivity(intent);
        }
        else if (historyView.getID() == 14){
            Intent intent = new Intent(historyTEAJA, DetaileTraCuu.class);
            startActivity(intent);
        }

    }
}