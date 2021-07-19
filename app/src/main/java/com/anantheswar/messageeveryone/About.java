package com.anantheswar.messageeveryone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.plus.PlusOneButton;

/**
 * Created by Anantha Eswar on 9/29/2015.
 */
public class About extends AppCompatActivity {

    Tracker t;
    PlusOneButton mPbutton_standard;
    private static final int PLUS_ONE_REQUEST_CODE = 0;
    //app's Google plus page URL
    private static final String URL = "https://play.google.com/store/apps/details?id=com.anantheswar.messageeveryone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("About");

            t.send(new HitBuilders.AppViewBuilder().build());
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        mPbutton_standard = (PlusOneButton)findViewById(R.id.plus_one_button);

    }

    public void facebook(View view) {
        //Uri uri = Uri.parse("https://www.facebook.com/AnanthJustin?href=Message_Everyone");
        Uri uri = Uri.parse("https://www.facebook.com/AnanthPgrmr?href=Message_Everyone");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        Toast toast = Toast.makeText(this, "Opening", Toast.LENGTH_SHORT);
        toast.show();

        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("About")
                .setAction("FACEBOOK button")
                .build());
    }

    public void googlePlus(View view)
    {
        Uri uri = Uri.parse("https://plus.google.com/100391015363551246682?href=Message_Everyone");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        Toast toast = Toast.makeText(this, "Opening", Toast.LENGTH_SHORT);
        toast.show();
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("About")
                .setAction("GOOGLE PLUS button")
                .build());
    }

    public void email(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"ananth.androiddeveloper@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Message Everyone");
        try {
            startActivity(Intent.createChooser(i, "Send Email via"));
        } catch (android.content.ActivityNotFoundException ex) {
            showMessage("There are no email clients installed.");
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("About")
                .setAction("E-MAIL id")
                .build());
    }

    private void showMessage(String msg) {
        ViewGroup container = (ViewGroup) findViewById(R.id.snackbar_layout);
        Snackbar.make(container, msg, Snackbar.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        // Refresh the state of the +1 button each time the activity receives focus.
        mPbutton_standard.initialize(URL, PLUS_ONE_REQUEST_CODE);
    }
}