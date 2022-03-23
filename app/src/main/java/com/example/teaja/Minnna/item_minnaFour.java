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
import com.example.teaja.myInterface.IcClickItemMinaFour;

import java.util.ArrayList;
import java.util.List;

public class item_minnaFour extends Fragment {

    View view;
    FragmentActivity mMinnaN2;
    private RecyclerView rc_Minna2;
    private MinaFourAdapter mMinaFourAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_item_minna_four, container, false);
        mMinnaN2 = getActivity();
        rc_Minna2 = view.findViewById(R.id.rcy_MinnaN4);

        mMinaFourAdapter = new MinaFourAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mMinnaN2, 4, RecyclerView.VERTICAL, false);
        rc_Minna2.setLayoutManager(layoutManager);
        rc_Minna2.setFocusable(false);
        rc_Minna2.setNestedScrollingEnabled(false);
        rc_Minna2.setAdapter(mMinaFourAdapter);
        mMinaFourAdapter.MinaFourAdapter(getList(), new IcClickItemMinaFour() {
            @Override
            public void setOnClickItemListenerMinaFour(MinaFour minaFour) {

            }
        });

        return view;
    }

    private List<MinaFour> getList() {
        List<MinaFour> list = new ArrayList<>();
        list.add(new MinaFour(1, "Bài 1"));
        list.add(new MinaFour(2, "Bài 2"));
        list.add(new MinaFour(3, "Bài 3"));
        list.add(new MinaFour(4, "Bài 4"));
        list.add(new MinaFour(5, "Bài 5"));
        list.add(new MinaFour(6, "Bài 6"));
        list.add(new MinaFour(7, "Bài 7"));
        list.add(new MinaFour(8, "Bài 8"));
        list.add(new MinaFour(9, "Bài 9"));
        list.add(new MinaFour(11, "Bài 11"));
        list.add(new MinaFour(12, "Bài 12"));
        list.add(new MinaFour(13, "Bài 13"));
        list.add(new MinaFour(14, "Bài 14"));
        list.add(new MinaFour(15, "Bài 15"));
        list.add(new MinaFour(16, "Bài 16"));
        list.add(new MinaFour(17, "Bài 17"));
        list.add(new MinaFour(18, "Bài 18"));
        list.add(new MinaFour(19, "Bài 19"));
        list.add(new MinaFour(20, "Bài 20"));
        list.add(new MinaFour(21, "Bài 21"));
        list.add(new MinaFour(22, "Bài 22"));
        list.add(new MinaFour(23, "Bài 23"));
        list.add(new MinaFour(24, "Bài 24"));
        list.add(new MinaFour(25, "Bài 25"));


        return list;
    }
}