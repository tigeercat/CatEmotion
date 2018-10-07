package com.david.catemotion;


import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
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
        //initiliationiation of media players
        final MediaPlayer sadsound = MediaPlayer.create(this, R.raw.sadcat);
        final MediaPlayer angrycat = MediaPlayer.create(this,R.raw.angrycat);
        final MediaPlayer playfulsound = MediaPlayer.create(this,R.raw.happycat);
        //gives sad_button to sadbut
        ImageView sadbut = findViewById(R.id.sad_button);
        ImageView playfulbut = findViewById(R.id.playful_button);
        ImageView sleepbut = findViewById(R.id.sleepy_button);
        ImageView scaredbut = findViewById(R.id.scared_button);

       // each SetonclickListener is the same just different items are put in

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
                sadsound.start();

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
                playfulsound.start();
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
                angrycat.start();
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

