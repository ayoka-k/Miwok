package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> colorsWords = new ArrayList<>();
        colorsWords.add(new Word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        colorsWords.add(new Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        colorsWords.add(new Word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        colorsWords.add(new Word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        colorsWords.add(new Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        colorsWords.add(new Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        colorsWords.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsWords.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, colorsWords, R.color.category_colors);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
    }
}
