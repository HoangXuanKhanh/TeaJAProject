package com.example.teaja.Minnna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaja.R;
import com.example.teaja.myInterface.IcClickItemMinaThree;

import java.util.ArrayList;
import java.util.List;

public class item_minnaThree extends Fragment {

    View view;
    FragmentActivity mMinnaN3;
    private RecyclerView rc_mMinnaN3;
    private MinaThreeAdapter minaThreeAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_item_minna_three, container, false);
        mMinnaN3 = getActivity();
        rc_mMinnaN3 = view.findViewById(R.id.rcy_MinnaN3);

        minaThreeAdapter = new MinaThreeAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mMinnaN3, 4, RecyclerView.VERTICAL, false);
        rc_mMinnaN3.setLayoutManager(layoutManager);
        rc_mMinnaN3.setFocusable(false);
        rc_mMinnaN3.setNestedScrollingEnabled(false);
        rc_mMinnaN3.setAdapter(minaThreeAdapter);
        minaThreeAdapter.MinaThreeAdapter(getList(), new IcClickItemMinaThree() {
            @Override
            public void setOnClickItemListenerMinaThree(MinaThree minaThree) {

            }
        });

        return view;
    }

    private List<MinaThree> getList() {
        List<MinaThree> list = new ArrayList<>();
        list.add(new MinaThree(1, "Bài 1"));
        list.add(new MinaThree(2, "Bài 2"));
        list.add(new MinaThree(3, "Bài 3"));
        list.add(new MinaThree(4, "Bài 4"));
        list.add(new MinaThree(5, "Bài 5"));
        list.add(new MinaThree(6, "Bài 6"));
        list.add(new MinaThree(7, "Bài 7"));
        list.add(new MinaThree(8, "Bài 8"));
        list.add(new MinaThree(9, "Bài 9"));
        list.add(new MinaThree(10, "Bài 10"));
        list.add(new MinaThree(11, "Bài 11"));
        list.add(new MinaThree(12, "Bài 12"));
        list.add(new MinaThree(13, "Bài 13"));
        list.add(new MinaThree(14, "Bài 14"));
        list.add(new MinaThree(15, "Bài 15"));
        list.add(new MinaThree(16, "Bài 16"));
        list.add(new MinaThree(17, "Bài 17"));
        list.add(new MinaThree(18, "Bài 18"));
        list.add(new MinaThree(19, "Bài 19"));
        list.add(new MinaThree(20, "Bài 20"));
        list.add(new MinaThree(21, "Bài 21"));
        list.add(new MinaThree(22, "Bài 22"));
        list.add(new MinaThree(23, "Bài 23"));
        list.add(new MinaThree(24, "Bài 24"));
        list.add(new MinaThree(25, "Bài 25"));

        return list;
    }
}