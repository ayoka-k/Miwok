package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.word_list);
    ArrayList<Word> numbersWords = new ArrayList<>();
    numbersWords.add(new Word("lutti","one"));
    numbersWords.add(new Word("otiiko","two"));
    numbersWords.add(new Word("tolookosu", "three"));
    numbersWords.add(new Word("oyyisa", "four"));
    numbersWords.add(new Word("massokka","five"));
    numbersWords.add(new Word("temmokka","six"));
    numbersWords.add(new Word("kenekaku","seven"));
    numbersWords.add(new Word("kawinta","eight"));
    numbersWords.add(new Word("wo'e","nine"));
    numbersWords.add(new Word("na'aacha","ten"));


    // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
    // adapter knows how to create layouts for each item in the list, using the
    // simple_list_item_1.xml layout resource defined in the Android framework.
    // This list item layout contains a single {@link TextView}, which the adapter will set to
    // display a single word.
    WordAdapter adapter = new WordAdapter(this, numbersWords);

    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml file.
    ListView listView = (ListView) findViewById(R.id.list_view_layout);

    // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
    // {@link ListView} will display list items for each word in the list of words.
    // Do this by calling the setAdapter method on the {@link ListView} object and pass in
    // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
    listView.setAdapter(adapter);
  }
}
