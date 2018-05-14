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

public class Colors extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "rouge", R.drawable.color_red));
        words.add(new word("brown", "marron", R.drawable.color_brown));
        words.add(new word("black", "noir", R.drawable.color_black));
        words.add(new word("mustard yellow","jaune moutarde", R.drawable.color_mustard_yellow));
        words.add(new word("dusty yellow","jaune poussiéreux", R.drawable.color_dusty_yellow));
        words.add(new word("green","vert", R.drawable.color_green));
        words.add(new word("gray", "gris", R.drawable.color_gray));
        words.add(new word("white", "blanc", R.drawable.color_white));


       // adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView )findViewById(R.id.list);

        // the ListView will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


            }
        }


