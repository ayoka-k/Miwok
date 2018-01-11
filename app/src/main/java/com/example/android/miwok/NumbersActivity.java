package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> numbersWords = new ArrayList<>();
        numbersWords.add(new Word("lutti", "one", R.drawable.number_one, R.raw.number_one));
        numbersWords.add(new Word("otiiko", "two", R.drawable.number_two, R.raw.number_two));
        numbersWords.add(new Word("tolookosu", "three", R.drawable.number_three, R.raw.number_three));
        numbersWords.add(new Word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        numbersWords.add(new Word("massokka", "five", R.drawable.number_five, R.raw.number_five));
        numbersWords.add(new Word("temmokka", "six", R.drawable.number_six, R.raw.number_six));
        numbersWords.add(new Word("kenekaku", "seven", R.drawable.number_seven, R.raw.number_seven));
        numbersWords.add(new Word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        numbersWords.add(new Word("wo'e", "nine", R.drawable.number_nine, R.raw.number_nine));
        numbersWords.add(new Word("na'aacha", "ten", R.drawable.number_ten, R.raw.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, numbersWords, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = findViewById(R.id.list_view_layout);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = numbersWords.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
