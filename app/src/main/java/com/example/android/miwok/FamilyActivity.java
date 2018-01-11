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
        familyWords.add(new Word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        familyWords.add(new Word("әṭa", "mother", R.drawable.family_mother, R.raw.family_mother));
        familyWords.add(new Word("angsi", "son", R.drawable.family_son, R.raw.family_son));
        familyWords.add(new Word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        familyWords.add(new Word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyWords.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyWords.add(new Word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyWords.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyWords.add(new Word("ama", "grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyWords.add(new Word("paapa", "grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, familyWords, R.color.category_family);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
    }
}
