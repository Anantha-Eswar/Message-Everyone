package com.anantheswar.messageeveryone;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

//Created by Anantha Eswar on 9/8/2015.

public class Message_Everyone extends AppCompatActivity {

    static InterstitialAd mInterstitialAd;
    private AdView mAdView;
    static int ButtonClicks = 0;
    Tracker t;
    private static final String PRIVATE_PREF = "myapp";
    private static final String VERSION_KEY = "version_number";
    private static final String totalSessions = "";
    static String shareBody = "Message Everyone app contains tons of messages collection with random message display feature, and you can easily share the messages that you like. Download and try this out from Play store \nhttps://play.google.com/store/apps/details?id=com.anantheswar.messageeveryone\nor Download directly from https://goo.gl/MhBYMm";
    SharedPreferences sharedPref;
    Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_everyone);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setLogo(R.mipmap.action_bar_icon);
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        // Admob Interstitial ads
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2658405203684206/5609871579");
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();


        // Admob Banner ads
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.bringToFront();
        mAdView.loadAd(adRequest);


        //Google Analytics
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Message_Everyone (Main Activity)");

            t.send(new HitBuilders.AppViewBuilder().build());
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        changeLog();


        //To Display the ad after the specified time
        //Use handler.postDelayed to display the ad again and again
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                if (Ad.AdDisplayed == 0) {
                    if (mInterstitialAd.isLoaded()) {

                        {
                            mInterstitialAd.show();
                        }
                    }
                    Ad.AdDisplayed++;
                }

                //handler.postDelayed(this, 60000); //Displays the ad for every specified milliseconds
            }
        }, 1000 * 60); //For initial display of ad */

        //To display the total number of messages in each category
        TextView birthdayTotal = (TextView) findViewById(R.id.birthdayTotalText);
        birthdayTotal.setText(Birthday.messages.length + " messages");
        TextView friendshipTotal = (TextView) findViewById(R.id.friendshipTotalText);
        friendshipTotal.setText(Friendship.messages.length + " messages");
        TextView loveTotal = (TextView) findViewById(R.id.loveTotalText);
        loveTotal.setText(Love.messages.length + " messages");
        TextView goodMorningTotal = (TextView) findViewById(R.id.goodMorningTotalText);
        goodMorningTotal.setText(GoodMorning.messages.length + " messages");
        TextView sorryTotal = (TextView) findViewById(R.id.sorryTotalText);
        sorryTotal.setText(Sorry.messages.length + " messages");
        TextView valentineTotal = (TextView) findViewById(R.id.valentineTotalText);
        valentineTotal.setText(ValentineDay.messages.length + " messages");
        TextView prayerTotal = (TextView) findViewById(R.id.prayerTotalText);
        prayerTotal.setText(Prayer.messages.length + " messages");
        TextView goodEveningTotal = (TextView) findViewById(R.id.goodEveningTotalText);
        goodEveningTotal.setText(GoodEvening.messages.length + " messages");
        TextView examTotal = (TextView) findViewById(R.id.examTotalText);
        examTotal.setText(Exam.messages.length + " messages");
        TextView forgetTotal = (TextView) findViewById(R.id.forgetTotalText);
        forgetTotal.setText(Forget.messages.length + " messages");
        TextView dreamTotal = (TextView) findViewById(R.id.dreamTotalText);
        dreamTotal.setText(Dream.messages.length + " messages");
        TextView angryTotal = (TextView) findViewById(R.id.angryTotalText);
        angryTotal.setText(Angry.messages.length + " messages");
        TextView diwaliTotal = (TextView) findViewById(R.id.diwaliTotalText);
        diwaliTotal.setText(Diwali.messages.length + " messages");
        TextView goodAfternoonTotal = (TextView) findViewById(R.id.goodAfternoonTotalText);
        goodAfternoonTotal.setText(GoodAfternoon.messages.length + " messages");
        TextView funnyTotal = (TextView) findViewById(R.id.funnyTotalText);
        funnyTotal.setText(Funny.messages.length + " messages");
        TextView emotionalTotal = (TextView) findViewById(R.id.emotionalTotalText);
        emotionalTotal.setText(Emotional.messages.length + " messages");
        TextView cuteTotal = (TextView) findViewById(R.id.cuteTotalText);
        cuteTotal.setText(Cute.messages.length + " messages");
        TextView goodNightTotal = (TextView) findViewById(R.id.goodNightTotalText);
        goodNightTotal.setText(GoodNight.messages.length + " messages");
        TextView missingYouTotal = (TextView) findViewById(R.id.missingYouTotalText);
        missingYouTotal.setText(MissingYou.messages.length + " messages");
        TextView adviceTotal = (TextView) findViewById(R.id.adviceTotalText);
        adviceTotal.setText(Advice.messages.length + " messages");
        TextView caringTotal = (TextView) findViewById(R.id.caringTotalText);
        caringTotal.setText(Caring.messages.length + " messages");
        TextView newYearTotal = (TextView) findViewById(R.id.newYearTotalText);
        newYearTotal.setText(NewYear.messages.length + " messages");
        TextView jokeTotal = (TextView) findViewById(R.id.jokeTotalText);
        jokeTotal.setText(Joke.messages.length + " messages");
        TextView christmasTotal = (TextView) findViewById(R.id.christmasTotalText);
        christmasTotal.setText(Christmas.messages.length + " messages");
        TextView abbreviationTotal = (TextView) findViewById(R.id.abbreviationTotalText);
        abbreviationTotal.setText(Abbreviation.messages.length + " messages");
    }

    //This function will be called if the Integer @ButtonClicks reaches to specified number(Specified in other Java classes). After executed, its value is initialized to 0.
    public static void randomButtonClicks() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
        ButtonClicks = 0;
    }

    //Requests for a new Interstitial ad if this function is called.
    public void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mInterstitialAd.loadAd(adRequest);
    }

    //OnClick methods to open Java files
    public void birthdayLayout(View view) {
        Intent intent = new Intent(this, Birthday.class);
        startActivity(intent);
    }

    public void friendshipLayout(View view) {
        Intent intent = new Intent(this, Friendship.class);
        startActivity(intent);
    }

    public void loveLayout(View view) {
        Intent intent = new Intent(this, Love.class);
        startActivity(intent);
    }

    public void goodMorningLayout(View view) {
        Intent intent = new Intent(this, GoodMorning.class);
        startActivity(intent);
    }

    public void sorryLayout(View view) {
        Intent intent = new Intent(this, Sorry.class);
        startActivity(intent);
    }

    public void goodEveningLayout(View view) {
        Intent intent = new Intent(this, GoodEvening.class);
        startActivity(intent);
    }

    public void valentineLayout(View view) {
        Intent intent = new Intent(this, ValentineDay.class);
        startActivity(intent);
    }

    public void prayerLayout(View view) {
        Intent intent = new Intent(this, Prayer.class);
        startActivity(intent);
    }

    public void examLayout(View view) {
        Intent intent = new Intent(this, Exam.class);
        startActivity(intent);
    }

    public void forgetLayout(View view) {
        Intent intent = new Intent(this, Forget.class);
        startActivity(intent);
    }

    public void dreamLayout(View view) {
        Intent intent = new Intent(this, Dream.class);
        startActivity(intent);
    }

    public void angryLayout(View view) {
        Intent intent = new Intent(this, Angry.class);
        startActivity(intent);
    }

    public void diwaliLayout(View view) {
        Intent intent = new Intent(this, Diwali.class);
        startActivity(intent);
    }

    public void goodAfternoonLayout(View view) {
        Intent intent = new Intent(this, GoodAfternoon.class);
        startActivity(intent);
    }

    public void funnyLayout(View view) {
        Intent intent = new Intent(this, Funny.class);
        startActivity(intent);
    }

    public void emotionalLayout(View view) {
        Intent intent = new Intent(this, Emotional.class);
        startActivity(intent);
    }

    public void cuteLayout(View view) {
        Intent intent = new Intent(this, Cute.class);
        startActivity(intent);
    }

    public void goodNightLayout(View view) {
        Intent intent = new Intent(this, GoodNight.class);
        startActivity(intent);
    }

    public void missingYouLayout(View view) {
        Intent intent = new Intent(this, MissingYou.class);
        startActivity(intent);
    }

    public void adviceLayout(View view) {
        Intent intent = new Intent(this, Advice.class);
        startActivity(intent);
    }

    public void caringLayout(View view) {
        Intent intent = new Intent(this, Caring.class);
        startActivity(intent);
    }

    public void newYearLayout(View view) {
        Intent intent = new Intent(this, NewYear.class);
        startActivity(intent);
    }

    public void jokeLayout(View view) {
        Intent intent = new Intent(this, Joke.class);
        startActivity(intent);
    }

    public void christmasLayout(View view) {
        Intent intent = new Intent(this, Christmas.class);
        startActivity(intent);
    }

    public void abbreviationLayout(View view) {
        Intent intent = new Intent(this, Abbreviation.class);
        startActivity(intent);
    }

    //Calls this function when Device/Software back button is pressed.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog.Builder alertbox = new AlertDialog.Builder(Message_Everyone.this);
            alertbox.setTitle("Do you want to exit ?");
            alertbox.setIcon(R.drawable.ic_exit_to_app_48pt);
            alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                    // Build and Send the Analytics Event.
                    t.send(new HitBuilders.EventBuilder()
                            .setCategory("Exit")
                            .setAction("YES")
                            .build());
                    finish();
                }
            });

            alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                    // Build and Send the Analytics Event.
                    t.send(new HitBuilders.EventBuilder()
                            .setCategory("Exit")
                            .setAction("NO")
                            .build());
                }
            });
            alertbox.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    //Calls this function when "Rate this App" icon is pressed
    public void showRateDialog(final Context context) {
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Message Everyone")
                .setAction("Rate this App icon")
                .build());

        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Rate this application")
                .setMessage("If you like this App!, Rate it 5 Stars at Play Store to support the developer.")
                .setPositiveButton("RATE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (context != null) {
                            String link = "market://details?id=";
                            try {
                                // play market available
                                context.getPackageManager()
                                        .getPackageInfo("com.android.vending", 0);
                                // not available
                            } catch (PackageManager.NameNotFoundException e) {
                                e.printStackTrace();
                                // should use browser
                                link = "https://play.google.com/store/apps/details?id=";
                            }
                            // starts external action
                            context.startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse(link + context.getPackageName())));
                            // Build and Send the Analytics Event.
                            t.send(new HitBuilders.EventBuilder()
                                    .setCategory("Message Everyone")
                                    .setAction("Rate this App RATE button")
                                    .build());
                        }
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        // Build and Send the Analytics Event.
                        t.send(new HitBuilders.EventBuilder()
                                .setCategory("Message Everyone")
                                .setAction("Rate this App CANCEL button")
                                .build());
                    }
                    });
        builder.show();
    }

    public void shareThisApp() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Try this app!");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share this app link via"));
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Message Everyone")
                .setAction("Share this App icon")
                .build());
    }

    //What's New Dialog box appears, when the updated app starts up first time.
    private void changeLog() {
        sharedPref = getSharedPreferences(PRIVATE_PREF, Context.MODE_PRIVATE);
        int currentVersionNumber = 0;
        int savedVersionNumber = sharedPref.getInt(VERSION_KEY, 0);

        try {
            PackageInfo pi = getPackageManager().getPackageInfo(getPackageName(), 0);
            currentVersionNumber = pi.versionCode;
        } catch (Exception e) {}

        if (currentVersionNumber > savedVersionNumber) {
            showWhatsNewDialog();
            editor = sharedPref.edit();
            editor.putInt(VERSION_KEY, currentVersionNumber);
            editor.apply();
            // Build and Send the Analytics Event.
            t.send(new HitBuilders.EventBuilder()
                    .setCategory("Message Everyone")
                    .setAction("What's New dialog")
                    .build());
        }
    }

    private void showWhatsNewDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.whats_new, null);
        Builder builder = new AlertDialog.Builder(this);
        builder.setView(view).setTitle("What's New")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        // Build and Send the Analytics Event.
                        t.send(new HitBuilders.EventBuilder()
                                .setCategory("Message Everyone")
                                .setAction("What's New OK button")
                                .build());
                    }
                });

        builder.create().show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
                return true;
            case R.id.action_rate:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                showRateDialog(this);
                return true;
            case R.id.action_share:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                shareThisApp();
                return true;
            case R.id.action_changelog:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent1 = new Intent(this, ChangeLog.class);
                startActivity(intent1);
                return true;

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        sharedPref = getSharedPreferences(PRIVATE_PREF, Context.MODE_PRIVATE);
        int savedSessionNumber = sharedPref.getInt(totalSessions, 0);
        int saved_shared_data = sharedPref.getInt(ShareThisApp.shared_data, 0);
        int totalsession = savedSessionNumber + 1;
        editor = sharedPref.edit();
        editor.putInt(totalSessions, totalsession);
        editor.apply();
        if((totalsession >= 10) && (saved_shared_data==0)){
            Intent localIntent = new Intent(this, ShareThisApp.class);
            this.startActivity(localIntent);
            finish();
        }

    }

}