package com.example.ajay.frenchdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ajay on 02-08-2017.
 */

public class Family extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father", "père", R.drawable.family_father));
        words.add(new word("mother", "mère", R.drawable.family_mother));
        words.add(new word("son", "fils", R.drawable.family_son ));
        words.add(new word("daughter","fille", R.drawable.family_daughter));
        words.add(new word("older brother", "grand frère", R.drawable.family_older_brother));
        words.add(new word("younger brother", "frère cadet", R.drawable.family_younger_brother));
        words.add(new word("older sister", "soeur aînée", R.drawable.family_older_sister));
        words.add(new word("younger sister", "sœur cadette", R.drawable.family_younger_sister));
        words.add(new word("grandmother ", "grand-mère", R.drawable.family_grandmother));
        words.add(new word("grandfather", "grand-père", R.drawable.family_grandfather));


        // The adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, words, R.color.category_family);

       ListView listView = (ListView)findViewById(R.id.list);

        // the ListView will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);




    }
}
