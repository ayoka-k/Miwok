package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.word_list);
    ArrayList<Word> familyWords = new ArrayList<>();
    familyWords.add(new Word("әpә", "father"));
    familyWords.add(new Word("әṭa", "mother"));
    familyWords.add(new Word("angsi", "son"));
    familyWords.add(new Word("tune", "daughter"));
    familyWords.add(new Word("taachi", "older brother"));
    familyWords.add(new Word("chalitti", "younger brother"));
    familyWords.add(new Word("teṭe", "older sister"));
    familyWords.add(new Word("kolliti", "younger sister"));
    familyWords.add(new Word("ama", "grandmother"));
    familyWords.add(new Word("paapa", "grandfather"));

    WordAdapter adapter = new WordAdapter(this, familyWords);
    ListView listView = (ListView) findViewById(R.id.list_view_layout);
    listView.setAdapter(adapter);
  }
}
