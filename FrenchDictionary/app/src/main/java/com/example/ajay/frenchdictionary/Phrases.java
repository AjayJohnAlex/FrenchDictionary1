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

public class Phrases  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Are you okay?", "\n" +"ESt ce que ça va ?"));
        words.add(new word("What is your name?", "comment vous appelez-vous ?"));
        words.add(new word("My name is...", "Mon nom est..."));
        words.add(new word("How are you feeling?", "Comment allez-vous?"));
        words.add(new word("I’m feeling good.", "je me sens bien"));
        words.add(new word("What do you love...", "Qu'aimes tu..."));
        words.add(new word("Yes, I’m coming.", "Oui, je viens"));
        words.add(new word("I’m coming.", "J'arrive"));
        words.add(new word("Go there", "Va là-bas"));
        words.add(new word("Long live France.", "Longue vie à la France"));


        //The adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, words, R.color.category_phrases);

        ListView listView;
        listView = (ListView)findViewById(R.id.list);

        // the ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);


    }
}
