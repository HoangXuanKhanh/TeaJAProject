package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import layoufavorite.Hiragana;
import layoufavorite.HiraganaAdapter;

public class DetaileHiragana extends Fragment {

    View view;
    private RecyclerView rcHiragana;
    private HiraganaAdapter hiraganaAdapter;
    FragmentActivity HiraganaActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_detaile_hiragana, container, false);
        rcHiragana = view.findViewById(R.id.rcy_Hiragana);
        HiraganaActivity = getActivity();

        hiraganaAdapter = new HiraganaAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(HiraganaActivity, 5, RecyclerView.VERTICAL, false);
        rcHiragana.setLayoutManager(layoutManager);
        rcHiragana.setFocusable(false);
        rcHiragana.setNestedScrollingEnabled(false);
        rcHiragana.setAdapter(hiraganaAdapter);
        hiraganaAdapter.HiraganaAdapter(getLisHiragana());

        return view;
    }

    private List<Hiragana> getLisHiragana() {
        List<Hiragana> list = new ArrayList<>();
        list.add(new Hiragana(1,"あ","a"));
        list.add(new Hiragana(2,"い","i"));
        list.add(new Hiragana(3,"う","u"));
        list.add(new Hiragana(4,"え","e"));
        list.add(new Hiragana(5,"お","o"));
        list.add(new Hiragana(6,"か","ka"));
        list.add(new Hiragana(7,"き","ki"));
        list.add(new Hiragana(8,"く","ku"));
        list.add(new Hiragana(9,"け","ke"));
        list.add(new Hiragana(10,"こ","ko"));
        list.add(new Hiragana(11,"さ","sa"));
        list.add(new Hiragana(12,"し","shi"));
        list.add(new Hiragana(13,"す","su"));
        list.add(new Hiragana(14,"せ","se"));
        list.add(new Hiragana(15,"そ","so"));
        list.add(new Hiragana(16,"た","ta"));
        list.add(new Hiragana(17,"ち","chi"));
        list.add(new Hiragana(18,"つ","tsu"));
        list.add(new Hiragana(19,"て","te"));
        list.add(new Hiragana(20,"と","to"));
        list.add(new Hiragana(21,"な","na"));
        list.add(new Hiragana(22,"に","ni"));
        list.add(new Hiragana(23,"ぬ","nu"));
        list.add(new Hiragana(24,"ね","ne"));
        list.add(new Hiragana(25,"の","no"));
        list.add(new Hiragana(26,"は","ha"));
        list.add(new Hiragana(27,"ひ","hi"));
        list.add(new Hiragana(28,"ふ","fu"));
        list.add(new Hiragana(29,"へ","he"));
        list.add(new Hiragana(30,"ほ","ho"));
        list.add(new Hiragana(31,"ま","ma"));
        list.add(new Hiragana(31,"み","mi"));
        list.add(new Hiragana(31,"む","mu"));
        list.add(new Hiragana(31,"め","me"));
        list.add(new Hiragana(31,"も","mo"));
        list.add(new Hiragana(31,"や","ya"));
        list.add(new Hiragana(31,"ゆ","yu"));
        list.add(new Hiragana(31,"よ","yo"));
        list.add(new Hiragana(31,"ら","ra"));
        list.add(new Hiragana(31,"り","ri"));
        list.add(new Hiragana(31,"る","ru"));
        list.add(new Hiragana(31,"れ","re"));
        list.add(new Hiragana(31,"ろ","ro"));
        list.add(new Hiragana(31,"わ","wa"));
        list.add(new Hiragana(31,"ん","n"));
        list.add(new Hiragana(31,"を","wo"));
        list.add(new Hiragana(31,"が","ga"));
        list.add(new Hiragana(31,"ぎ","gi"));
        list.add(new Hiragana(31,"ぐ","gu"));
        list.add(new Hiragana(31,"げ","ge"));
        list.add(new Hiragana(31,"ご","go"));
        list.add(new Hiragana(31,"ざ","za"));
        list.add(new Hiragana(31,"じ","ji"));
        list.add(new Hiragana(31,"ず","zu"));
        list.add(new Hiragana(31,"ぜ","ze"));
        list.add(new Hiragana(31,"ぞ","zo"));
        list.add(new Hiragana(31,"だ","da"));
        list.add(new Hiragana(31,"ぢ","ji"));
        list.add(new Hiragana(31,"づ","zu"));
        list.add(new Hiragana(31,"で","de"));
        list.add(new Hiragana(31,"ど","do"));
        list.add(new Hiragana(31,"ば","ba"));
        list.add(new Hiragana(31,"び","bi"));
        list.add(new Hiragana(31,"ぶ","bu"));
        list.add(new Hiragana(31,"べ","be"));
        list.add(new Hiragana(31,"ぼ","bo"));
        list.add(new Hiragana(31,"ぱ","pa"));
        list.add(new Hiragana(31,"ぴ","pi"));
        list.add(new Hiragana(31,"ぷ","pu"));
        list.add(new Hiragana(31,"ぺ","pe"));
        list.add(new Hiragana(31,"ぽ","po"));
        list.add(new Hiragana(31,"きゃ","kya"));
        list.add(new Hiragana(31,"きゅ","kyu"));
        list.add(new Hiragana(31,"きょ","kyo"));
        list.add(new Hiragana(31,"しゃ","sha"));
        list.add(new Hiragana(31,"しゅ","shu"));
        list.add(new Hiragana(31,"しょ","sho"));
        list.add(new Hiragana(31,"ちゃ","cha"));
        list.add(new Hiragana(31,"ちゅ","chu"));
        list.add(new Hiragana(31,"ちょ","cho"));
        list.add(new Hiragana(31,"にや","nya"));
        list.add(new Hiragana(31,"にゅ","nyu"));
        list.add(new Hiragana(31,"にょ","nyo"));
        list.add(new Hiragana(31,"ひゃ","hya"));
        list.add(new Hiragana(31,"ひゅ","hyu"));
        list.add(new Hiragana(31,"ひょ","hyo"));
        list.add(new Hiragana(31,"みゃ","mya"));
        list.add(new Hiragana(31,"みゅ","myu"));
        list.add(new Hiragana(31,"みょ","myo"));
        list.add(new Hiragana(31,"りゃ","rya"));
        list.add(new Hiragana(31,"りゅ","ryu"));
        list.add(new Hiragana(31,"りょ","ryo"));
        list.add(new Hiragana(31,"ぎゃ","gya"));
        list.add(new Hiragana(31,"ぎゅ","gyu"));
        list.add(new Hiragana(31,"ぎょ","gyo"));
        list.add(new Hiragana(31,"じゃ","ja"));
        list.add(new Hiragana(31,"じゅ","ju"));
        list.add(new Hiragana(31,"じょ","jo"));
        list.add(new Hiragana(31,"びゃ","bya"));
        list.add(new Hiragana(31,"びゅ","byu"));
        list.add(new Hiragana(31,"びょ","byo"));
        list.add(new Hiragana(31,"ぴゃ","pya"));
        list.add(new Hiragana(31,"ぴゅ","pyu"));
        list.add(new Hiragana(31,"ぴょ","pyo"));

        return list;
    }
}