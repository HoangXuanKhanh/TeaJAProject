package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

import layoufavorite.Katagana;
import layoufavorite.kataganaAdapter;

public class DetaileKatakana extends Fragment {

    View mview;
    private RecyclerView rcKatakana;
    private kataganaAdapter mKataganaAdapter;
    FragmentActivity katakanaActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.activity_detaile_katakana, container, false);
        rcKatakana = mview.findViewById(R.id.rcy_katakana);
        katakanaActivity = getActivity();

        mKataganaAdapter = new kataganaAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(katakanaActivity, 5, RecyclerView.VERTICAL, false);
        rcKatakana.setLayoutManager(layoutManager);
        rcKatakana.setFocusable(false);
        rcKatakana.setNestedScrollingEnabled(false);
        rcKatakana.setAdapter(mKataganaAdapter);
        mKataganaAdapter.kataganaAdapter(getListKatakana());

        return mview;
    }

    private List<Katagana> getListKatakana() {
        List<Katagana> list = new ArrayList<>();
        list.add(new Katagana(1,"ア","a"));
        list.add(new Katagana(2,"イ","i"));
        list.add(new Katagana(3,"ウ","u"));
        list.add(new Katagana(4,"エ","e"));
        list.add(new Katagana(5,"オ","o"));
        list.add(new Katagana(6,"カ","ka"));
        list.add(new Katagana(7,"キ","ki"));
        list.add(new Katagana(8,"ク","ku"));
        list.add(new Katagana(9,"ケ","ke"));
        list.add(new Katagana(10,"コ","ko"));
        list.add(new Katagana(11,"サ","sa"));
        list.add(new Katagana(12,"シ","shi"));
        list.add(new Katagana(13,"ス","su"));
        list.add(new Katagana(14,"セ","se"));
        list.add(new Katagana(15,"ソ","so"));
        list.add(new Katagana(16,"タ","ta"));
        list.add(new Katagana(17,"チ","chi"));
        list.add(new Katagana(18,"ツ","tsu"));
        list.add(new Katagana(19,"テ","te"));
        list.add(new Katagana(20,"ト","to"));
        list.add(new Katagana(21,"ナ","na"));
        list.add(new Katagana(22,"ニ","ni"));
        list.add(new Katagana(23,"ヌ","nu"));
        list.add(new Katagana(24,"ネ","ne"));
        list.add(new Katagana(25,"ノ","no"));
        list.add(new Katagana(26,"ハ","ha"));
        list.add(new Katagana(27,"ヒ","hi"));
        list.add(new Katagana(28,"フ","fu"));
        list.add(new Katagana(29,"ヘ","he"));
        list.add(new Katagana(30,"ホ","ho"));
        list.add(new Katagana(31,"マ","ma"));
        list.add(new Katagana(31,"ミ","mi"));
        list.add(new Katagana(31,"ム","mu"));
        list.add(new Katagana(31,"メ","me"));
        list.add(new Katagana(31,"モ","mo"));
        list.add(new Katagana(31,"ヤ","ya"));
        list.add(new Katagana(31,"ユ","yu"));
        list.add(new Katagana(31,"ヨ","yo"));
        list.add(new Katagana(31,"ラ","ra"));
        list.add(new Katagana(31,"リ","ri"));
        list.add(new Katagana(31,"ル","ru"));
        list.add(new Katagana(31,"レ","re"));
        list.add(new Katagana(31,"ロ","ro"));
        list.add(new Katagana(31,"ワ","wa"));
        list.add(new Katagana(31,"ン","n"));
        list.add(new Katagana(31,"ヲ","wo"));
        list.add(new Katagana(31,"ガ","ga"));
        list.add(new Katagana(31,"ギ","gi"));
        list.add(new Katagana(31,"グ","gu"));
        list.add(new Katagana(31,"ゲ","ge"));
        list.add(new Katagana(31,"ゴ","go"));
        list.add(new Katagana(31,"ザ","za"));
        list.add(new Katagana(31,"ジ","ji"));
        list.add(new Katagana(31,"ズ","zu"));
        list.add(new Katagana(31,"ゼ","ze"));
        list.add(new Katagana(31,"ゾ","zo"));
        list.add(new Katagana(31,"ダ ","da"));
        list.add(new Katagana(31,"ヂ","ji"));
        list.add(new Katagana(31,"ヅ","zu"));
        list.add(new Katagana(31,"ヅ","de"));
        list.add(new Katagana(31,"ド","do"));
        list.add(new Katagana(31,"バ","ba"));
        list.add(new Katagana(31,"ビ","bi"));
        list.add(new Katagana(31,"ブ","bu"));
        list.add(new Katagana(31,"ベ","be"));
        list.add(new Katagana(31,"ボ","bo"));
        list.add(new Katagana(31,"パ","pa"));
        list.add(new Katagana(31,"ピ","pi"));
        list.add(new Katagana(31,"プ","pu"));
        list.add(new Katagana(31,"ペ","pe"));
        list.add(new Katagana(31,"ポ","po"));
        list.add(new Katagana(31,"キャ","kya"));
        list.add(new Katagana(31,"キュ","kyu"));
        list.add(new Katagana(31,"キョ","kyo"));
        list.add(new Katagana(31,"シャ","sha"));
        list.add(new Katagana(31,"シュ","shu"));
        list.add(new Katagana(31,"ショ","sho"));
        list.add(new Katagana(31,"チャ","cha"));
        list.add(new Katagana(31,"チュ","chu"));
        list.add(new Katagana(31,"チョ","cho"));
        list.add(new Katagana(31,"ニャ","nya"));
        list.add(new Katagana(31,"ニュ","nyu"));
        list.add(new Katagana(31,"ニョ","nyo"));
        list.add(new Katagana(31,"ヒャ","hya"));
        list.add(new Katagana(31,"ヒュ","hyu"));
        list.add(new Katagana(31,"ヒョ","hyo"));
        list.add(new Katagana(31,"ミャ","mya"));
        list.add(new Katagana(31,"ミュ","myu"));
        list.add(new Katagana(31,"ミョ","myo"));
        list.add(new Katagana(31,"リャ","rya"));
        list.add(new Katagana(31,"リュ","ryu"));
        list.add(new Katagana(31,"リョ ","ryo"));
        list.add(new Katagana(31,"ギャ","gya"));
        list.add(new Katagana(31,"ギュ","gyu"));
        list.add(new Katagana(31,"ギョ","gyo"));
        list.add(new Katagana(31,"ジャ","ja"));
        list.add(new Katagana(31,"ジュ ","ju"));
        list.add(new Katagana(31,"ジョ","jo"));
        list.add(new Katagana(31,"ビャ","bya"));
        list.add(new Katagana(31,"ビュ","byu"));
        list.add(new Katagana(31,"ビョ","byo"));
        list.add(new Katagana(31,"ピャ","pya"));
        list.add(new Katagana(31,"ピュ","pyu"));
        list.add(new Katagana(31,"ピョ","pyo"));
        return list;
    }
}