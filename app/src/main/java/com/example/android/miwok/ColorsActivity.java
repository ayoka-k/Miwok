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
      colorsWords.add(new Word("weṭeṭṭi", "red"));
      colorsWords.add(new Word("chokokki", "green"));
      colorsWords.add(new Word("ṭakaakki", "brown"));
      colorsWords.add(new Word("ṭopoppi", "gray"));
      colorsWords.add(new Word("kululli", "black"));
      colorsWords.add(new Word("kelelli", "white"));
      colorsWords.add(new Word("ṭopiisә", "dusty yellow"));
      colorsWords.add(new Word("chiwiiṭә", "mustard yellow"));

      WordAdapter adapter = new WordAdapter(this, colorsWords);
      ListView listView = (ListView) findViewById(R.id.list_view_layout);
      listView.setAdapter(adapter);
  }
}
