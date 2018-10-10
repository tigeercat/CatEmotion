package com.david.catemotion;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Initialization of the media plays for each emotion
         */
        final MediaPlayer sadsound = MediaPlayer.create(this, R.raw.sadcat);
        final MediaPlayer angrycat = MediaPlayer.create(this,R.raw.angrycat);
        final MediaPlayer playfulsound = MediaPlayer.create(this,R.raw.happycat);
        final MediaPlayer sleepysound = MediaPlayer.create(this, R.raw.sleepycat);
        /*
        Initialization of each ImageView
         */
        ImageView sadbut = findViewById(R.id.sad_button);
        ImageView playfulbut = findViewById(R.id.playful_button);
        ImageView sleepbut = findViewById(R.id.sleepy_button);
        ImageView scaredbut = findViewById(R.id.scared_button);
        /*
        NOTE: sadbut, playfulbut, sleepbut, scaredbut all have same things in onclicklistener just different
              images/text. One comment block for all.
              Each onClickListener creates an intent, to go to CatDetailsActivity
              An ArrayList is created
              Images and text are put into the ArrayList by creating a new CatDetailItem item
              Object is parceled up and sent to CatDetailsActivity
              Sound is played on button press
              Intent is called, and it goes to CatDetailsActivity
         */
        sadbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.sadcat, "This is Pepper, the big fat sad cat is sad" +
                        " because she balls on her head."));
                details.add(new CatDetailItem(R.drawable.sadcat2, "This is Meme the PooStache cat is sad, because" +
                        " she has a pooStache.."));
                details.add(new CatDetailItem(R.drawable.sadcat4, "This is Molly, the sleepy cold cat, she decided" +
                        " to sleep outside in the potplant!"));
                details.add(new CatDetailItem(R.drawable.sadcat5, "This is Molly, the sleepy cold cat, she decided"));
                details.add(new CatDetailItem(R.drawable.sadcat6, "This is Kimye, she is sad because" +
                        " she got woken up by her owner. :("));
                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Sad Cat");
                sadsound.start();
                startActivity(intent);

            }
        });
        playfulbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.playfulcat, "This is Molly, she" +
                        " decided to be playful and crazy and chase a little stick!"));
                details.add(new CatDetailItem(R.drawable.playfulcat2, "Here is Molly again" +
                        " she is rolling around in the garden with the bugs."));
                details.add(new CatDetailItem(R.drawable.playfulcatlucy, "This is Lucy," +
                        " she is trying to climb up her owners legs!"));
                details.add(new CatDetailItem(R.drawable.playfulcatlucy2, "Here is Lucy again," +
                        " she rolling around in her own paws!"));
                details.add(new CatDetailItem(R.drawable.playfularnoldneko, "This is Neko and Arnold," +
                        " they are young kittens, but decided to climb a tree?!"));
                details.add(new CatDetailItem(R.drawable.playfulneko, "Here is Neko again, but by" +
                        " herself, she is up a tree again!"));
                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Playful Cat");
                playfulsound.start();
                startActivity(intent);
            }
        });
        sleepbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.sleepycat2, "This is Grey, he had" +
                        " only just moved into this home and found a place to sleep."));
                details.add(new CatDetailItem(R.drawable.sleepycat3, "This is Molly, she had" +
                        " just come inside from the cold and found a place to sleep."));
                details.add(new CatDetailItem(R.drawable.sleepycatgrey, "Here is Grey again, he has" +
                        " been living at new place for a while now and loves to sleep on beds. "));
                details.add(new CatDetailItem(R.drawable.sleepycatlucy, "This is Lucy, her owners" +
                        " sister let her get into the catnip.. now she's sleepy."));
                details.add(new CatDetailItem(R.drawable.sleepycatlucy2, "Here is Lucy again," +
                        " she is sleeping with her cat friend. "));
                details.add(new CatDetailItem(R.drawable.sleepynekoarnold, "This is Arnold and Neko," +
                        " they are little kittens and are sleeping in a love heart shape. "));
                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Sleepy Cat");
                sleepysound.start();
                startActivity(intent);
            }
        });
        scaredbut.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CatDetailsActivity.class);
                ArrayList<CatDetailItem> details = new ArrayList<>();
                details.add(new CatDetailItem(R.drawable.scaredcat, "This is Grey, he" +
                        " had just moved from New Plymouth to Hamilton and was scared."));
                details.add(new CatDetailItem(R.drawable.scaredcat2, "This is , she" +
                        " is spooked because she saw a ghost."));
                details.add(new CatDetailItem(R.drawable.scaredcatlucy, "This is Lucy, she" +
                        " is scared because her mean owner made her wear HUMAN glasses. :("));
                details.add(new CatDetailItem(R.drawable.scaredgrey, "Here is Grey again," +
                        " once again he is moving, this time to a different part of Hamilton."));
                details.add(new CatDetailItem(R.drawable.scaredkiki, "This is Kiki, she " +
                        " is scared of people because they pick her up, she's still a kitten. "));
                intent.putParcelableArrayListExtra(CatDetailsActivity.ARGUMENT_CATS, details);
                intent.putExtra(CatDetailsActivity.ARGUMENT_TITLE, "Scared Cat");
                angrycat.start();
                startActivity(intent);
            }
        });
    }//end of onCreate
    /*
    This methods makes it so user needs to press 2x to exit app, a popup will appear also.
     */
    private static long back_pressed;
    @Override
    public void onBackPressed(){
        if (back_pressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }
        else{
            Toast.makeText(getBaseContext(), "Press once again to exit", Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();
        }
    }//end of onBackPressed
}



