package com.example.teaja.FragmentTEAJA;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.teaja.R;
import com.example.teaja.myInterface.IClicItemCatalory1;
import com.example.teaja.myInterface.IClickItemCatalory;
import com.example.teaja.myInterface.IcClickItemCatalory2;

import java.util.ArrayList;
import java.util.List;

import layoufavorite.Catalory;
import layoufavorite.Catalory1;
import layoufavorite.Catalory2;
import layoufavorite.CataloryAdapter;
import layoufavorite.CataloryAdapterOne;
import layoufavorite.CataloryAdapterTwo;
import layoufavorite.CataloryOne.DetailCaTa1;
import layoufavorite.CataloryOne.DetaileCata2;
import layoufavorite.CataloryOne.DetaileCata3;
import layoufavorite.CataloryOne.DetaileCata4;
import layoufavorite.CataloryOne.DetaileCata5;
import layoufavorite.CataloryOne.DetaileCata6;
import layoufavorite.CataloryOne.DetaileCata7;
import layoufavorite.CataloryOne.DetaileCata8;
import layoufavorite.CatyTwo.DetailCaty1;
import layoufavorite.CatyTwo.DetailCaty2;
import layoufavorite.CatyTwo.DetailCaty3;
import layoufavorite.CatyTwo.DetailCaty4;
import layoufavorite.CatyTwo.DetailCaty5;
import layoufavorite.DetaileCa1;
import layoufavorite.DetaileCa2;
import layoufavorite.DetaileCa3;
import layoufavorite.DetaileCa4;
import layoufavorite.DetaileCa5;
import layoufavorite.DetaileCa6;
import layoufavorite.DetaileCa7;
import layoufavorite.DetaileCa8;


public class MainActivityFavoriteTEAJA extends Fragment {

    FragmentActivity FavoritefragmentActivity;
    View mView;
    private CataloryAdapter cataloryAdapter;
    private CataloryAdapterOne cataloryAdapterOne;
    private CataloryAdapterTwo cataloryAdapterTwo;

    private RecyclerView recyclerViewCata;
    private RecyclerView recyclerViewCata1;
    private RecyclerView recyclerViewCata2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.activity_main_favorite_teaja,container,false);
        FavoritefragmentActivity = getActivity();
        recyclerViewCata = mView.findViewById(R.id.rcy_catalory);
        recyclerViewCata1 = mView.findViewById(R.id.rcy_catalory2);
        recyclerViewCata2 = mView.findViewById(R.id.rcy_catalory3);

        //cataloryAdapter view 1
        cataloryAdapter = new CataloryAdapter();
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(FavoritefragmentActivity, 1, RecyclerView.HORIZONTAL, false);
        recyclerViewCata.setLayoutManager(gridLayoutManager);
        recyclerViewCata.setFocusable(false);
        recyclerViewCata.setNestedScrollingEnabled(false);
        recyclerViewCata.setAdapter(cataloryAdapter);
        cataloryAdapter.CataloryAdapter(getListCatalory(), new IClickItemCatalory() {
            @Override
            public void setOnClickItemListener(Catalory catalory) {
                onClickdetaiCata(catalory);
            }
        });

        //cataloryAdapter2 view 2
        cataloryAdapterOne = new CataloryAdapterOne();
        //LinearLayoutManager layoutManager = new LinearLayoutManager(FavoritefragmentActivity);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(FavoritefragmentActivity, 2, RecyclerView.VERTICAL, false);
        recyclerViewCata1.setLayoutManager(layoutManager);
        recyclerViewCata1.setFocusable(false);
        recyclerViewCata1.setNestedScrollingEnabled(false);
        recyclerViewCata1.setAdapter(cataloryAdapterOne);
       cataloryAdapterOne.CataloryAdapterOne(getListCataloryone(), new IClicItemCatalory1() {
           @Override
           public void setOnClickItemListener1(Catalory1 catalory1) {
               onClickdetaiCataOne(catalory1);
           }
       });

        //cataloryAdapter3 view 3
        cataloryAdapterTwo = new CataloryAdapterTwo();
        //LinearLayoutManager layoutManagertwo = new LinearLayoutManager(FavoritefragmentActivity);
        RecyclerView.LayoutManager layoutManagertwo = new GridLayoutManager(FavoritefragmentActivity, 1, RecyclerView.HORIZONTAL, false);
        recyclerViewCata2.setLayoutManager(layoutManagertwo);
        recyclerViewCata2.setFocusable(false);
        recyclerViewCata2.setNestedScrollingEnabled(false);
        recyclerViewCata2.setAdapter(cataloryAdapterTwo);
        cataloryAdapterTwo.CataloryAdapterTwo(getListCataloryTwo(), new IcClickItemCatalory2() {
            @Override
            public void setOnClickItemListener2(Catalory2 catalory2) {
                onClickdetaiCataTwo(catalory2);
            }
        });
        return  mView;
    }

    private void onClickdetaiCata(Catalory catalory) {//1
        if(catalory.getId() == 1){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa1.class);
            startActivity(intent);
        }else if (catalory.getId() == 2){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa2.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 3){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa3.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 4){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa4.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 5){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa5.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 6){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa6.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 7){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa7.class);
            startActivity(intent);
        }
        else if (catalory.getId() == 8){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCa8.class);
            startActivity(intent);
        }
    }
    private List<Catalory> getListCatalory() {//1
        List<Catalory> list = new ArrayList<>();
        list.add(new Catalory(1,R.drawable.ic_tracnghiem, "Trắc nghiệm"));
        list.add(new Catalory(2,R.drawable.ic_docsach, "Luyện đoc"));
        list.add(new Catalory(3,R.drawable.ic_viet, "Luyện viết"));
        list.add(new Catalory(4,R.drawable.ic_thi, "JLPT N5"));
        list.add(new Catalory(5,R.drawable.ic_thi, "JLPT N4"));
        list.add(new Catalory(6,R.drawable.ic_thi, "JLPT N3"));
        list.add(new Catalory(7,R.drawable.ic_thi, "JLPT N2"));
        list.add(new Catalory(8,R.drawable.ic_thi, "JLPT N1"));
        return  list;
    }//--------------------------------------------------------------------------
    private void onClickdetaiCataOne(Catalory1 catalory1) {//2
        if(catalory1.getId() == 1){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaTa1.class);
            startActivity(intent);
        }else if (catalory1.getId() == 2){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata2.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 3){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata3.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 4){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata4.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 5){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata5.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 6){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata6.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 7){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata7.class);
            startActivity(intent);
        }
        else if (catalory1.getId() == 8){
            Intent intent = new Intent(FavoritefragmentActivity, DetaileCata8.class);
            startActivity(intent);
        }
    }

    private List<Catalory1> getListCataloryone() {//2
        List<Catalory1> list1 = new ArrayList<>();
        list1.add(new Catalory1(1,R.drawable.ic_giaotiep, "Giao Tiếp"));
        list1.add(new Catalory1(2,R.drawable.ic_maucau, "Mẫu Câu"));
        list1.add(new Catalory1(3,R.drawable.ic_kaiwa, "Kaiwa"));
        list1.add(new Catalory1(4,R.drawable.ic_kiemtrakkk, "Kiểm tra"));
        list1.add(new Catalory1(5,R.drawable.ic_bunkei, "Bunkei"));
        list1.add(new Catalory1(6,R.drawable.ic_reibun, "Reibun"));
        list1.add(new Catalory1(7,R.drawable.ic_mondai, "Mondai"));
        list1.add(new Catalory1(8,R.drawable.ic_thankham, "Tham khảo"));
        return  list1;
    }//----------------------------------------------------------------------

    private List<Catalory2> getListCataloryTwo() {//3
        List<Catalory2> list2 = new ArrayList<>();
        list2.add(new Catalory2(1,R.drawable.ic_view1, "Du học sinh, Khám phá nước Nhật Bản đồng hành cùng TeaJA."));
        list2.add(new Catalory2(2,R.drawable.ic_kysu, "Kỹ sư IT java, php, android, .Net, Kỹ sư cơ khí, nông nghiệp."));
        list2.add(new Catalory2(3,R.drawable.ic_xuatkhau, "Thực tập sinh, trải nghiệm và lao động, cùng với hàng ngàn ưu đãi."));
        list2.add(new Catalory2(4,R.drawable.ic_nhatban, "Học tiếng Nhật mang lại lợi ích gì cho bạn nào?"));
        list2.add(new Catalory2(5,R.drawable.ic_japantea, "TeaJA nhà sáng lập cùng trung tâm sẽ giúp bạn có hành trang tốt nhất!"));
        return  list2;
    }

    private void onClickdetaiCataTwo(Catalory2 catalory2) {//3
        if(catalory2.getId() == 1){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaty1.class);
            startActivity(intent);
        }else if (catalory2.getId() == 2){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaty2.class);
            startActivity(intent);
        }
        else if (catalory2.getId() == 3){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaty3.class);
            startActivity(intent);
        }
        else if (catalory2.getId() == 4){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaty4.class);
            startActivity(intent);
        }
        else if (catalory2.getId() == 5){
            Intent intent = new Intent(FavoritefragmentActivity, DetailCaty5.class);
            startActivity(intent);
        }
    }
}