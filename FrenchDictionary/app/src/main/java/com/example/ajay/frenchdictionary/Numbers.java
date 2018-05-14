package com.example.ajay.frenchdictionary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.ajay.frenchdictionary.R.id.list;

/**
 * Created by Ajay on 02-08-2017.
 */

public class Numbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one", "un", R.drawable.number_one));
        words.add(new word("two", "duex", R.drawable.number_two));
        words.add(new word("three", "trois", R.drawable.number_three));
        words.add(new word("four", "quatre", R.drawable.number_four));
        words.add(new word("five", "cinq", R.drawable.number_five));
        words.add(new word("six", "six", R.drawable.number_six));
        words.add(new word("seven", "Sept", R.drawable.number_seven));
        words.add(new word("eight", "huit", R.drawable.number_eight));
        words.add(new word("nine", "neuf", R.drawable.number_nine));
        words.add(new word("ten", "dix", R.drawable.number_ten));

        // The adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        // the ListView will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
