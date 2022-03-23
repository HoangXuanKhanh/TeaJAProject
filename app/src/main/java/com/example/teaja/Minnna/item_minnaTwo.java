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
import com.example.teaja.myInterface.IcClickItemMinaTwo;

import java.util.ArrayList;
import java.util.List;

public class item_minnaTwo extends Fragment {

    View view;
    FragmentActivity mMinnaN2;
    private RecyclerView rc_Minna2;
    private MinaTwoAdapter minaTwoAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_item_minna_two, container, false);
        mMinnaN2 = getActivity();
        rc_Minna2 = view.findViewById(R.id.rcy_MinnaN2);

        minaTwoAdapter = new MinaTwoAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mMinnaN2, 4, RecyclerView.VERTICAL, false);
        rc_Minna2.setLayoutManager(layoutManager);
        rc_Minna2.setFocusable(false);
        rc_Minna2.setNestedScrollingEnabled(false);
        rc_Minna2.setAdapter(minaTwoAdapter);
        minaTwoAdapter.MinaTwoAdapter(getList(), new IcClickItemMinaTwo() {
            @Override
            public void setOnClickItemListenerMinaTwo(MinaTwo minaTwo) {

            }
        });
        return view;
    }

    private List<MinaTwo> getList() {
        List<MinaTwo> list = new ArrayList<>();
        list.add(new MinaTwo(1, "Bài 1"));
        list.add(new MinaTwo(2, "Bài 2"));
        list.add(new MinaTwo(3, "Bài 3"));
        list.add(new MinaTwo(4, "Bài 4"));
        list.add(new MinaTwo(5, "Bài 5"));
        list.add(new MinaTwo(6, "Bài 6"));
        list.add(new MinaTwo(7, "Bài 7"));
        list.add(new MinaTwo(8, "Bài 8"));
        list.add(new MinaTwo(9, "Bài 9"));
        list.add(new MinaTwo(10, "Bài 10"));
        list.add(new MinaTwo(11, "Bài 11"));
        list.add(new MinaTwo(12, "Bài 12"));
        list.add(new MinaTwo(13, "Bài 13"));
        list.add(new MinaTwo(14, "Bài 14"));
        list.add(new MinaTwo(15, "Bài 15"));
        list.add(new MinaTwo(16, "Bài 16"));
        list.add(new MinaTwo(17, "Bài 17"));
        list.add(new MinaTwo(18, "Bài 18"));
        list.add(new MinaTwo(19, "Bài 19"));
        list.add(new MinaTwo(20, "Bài 20"));
        list.add(new MinaTwo(21, "Bài 21"));
        list.add(new MinaTwo(22, "Bài 22"));
        list.add(new MinaTwo(23, "Bài 23"));
        list.add(new MinaTwo(24, "Bài 24"));
        list.add(new MinaTwo(25, "Bài 25"));

        return list;
    }
}