package com.david.catemotion;


import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting an xml file to the activity
        setContentView(R.layout.activity_main);// activity_main is XML file

        //gives sad_button to sadbut
        Button sadbut = findViewById(R.id.sad_button);
        Button playfulbut = findViewById(R.id.playful_button);
        Button sleepbut = findViewById(R.id.sleepy_button);
        ImageView scaredbut = findViewById(R.id.scared_button);

        sadbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //tells what activity to go to sadcat is activity this button goes to
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.sadcat, "Sad cat 1"));
                details.add(new CatDetailItem(R.drawable.sadcat2, "sad cat 2"));
                details.add(new CatDetailItem(R.drawable.sadcat4, "sad cat 3"));

                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Sad Cat");

                startActivity(intent); // startActivity allow you to move

            }
        });
        playfulbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //tells what activity to go to sadcat is activity this button goes to
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.playfulcat, "playful cat 1"));
                details.add(new CatDetailItem(R.drawable.playfulcat2, "playful cat 2"));


                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Playful Cat");

                startActivity(intent); // startActivity allow you to move
            }
        });
        sleepbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //tells what activity to go to sadcat is activity this button goes to
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.sleepycat2, "playful cat 1"));
                details.add(new CatDetailItem(R.drawable.sleepycat3, "playful cat 2"));


                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Sleepy Cat");

                startActivity(intent); // startActivity allow you to move
            }
        });
        scaredbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //tells what activity to go to sadcat is activity this button goes to
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.scaredcat, "playful cat 1"));
//                details.add(new CatDetailItem(R.drawable.playfulcat2, "playful cat 2"));


                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Scared Cat");

                startActivity(intent); // startActivity allow you to move
            }
        });
    }

    @Override
    public void onBackPressed() {
        // do something on back.
        return;
    }

}

