package com.anantheswar.messageeveryone;

//Created by Anantha Eswar on 11/29/2015.

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class ShareThisApp extends AppCompatActivity {

    Tracker t;
    int total = 2;
    protected static final String shared_data = "0";
    private static final String PRIVATE_PREF = "myapp";
    static String shareBody = "Message Everyone app contains tons of messages collection with random message display feature, and you can easily share the messages that you like. Download and try this out from Play store \nhttps://play.google.com/store/apps/details?id=com.anantheswar.messageeveryone\nor Download directly from https://goo.gl/MhBYMm";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_this_app);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Share This App");

            t.send(new HitBuilders.AppViewBuilder().build());
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void share(View paramAnonymousView) {
        if (total == 0) {
            // Build and Send the Analytics Event.
            t.send(new HitBuilders.EventBuilder()
                    .setCategory("Share This App")
                    .setAction("Thanks for Sharing")
                    .build());
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
            localBuilder.setMessage("Thanks for Sharing.");
            localBuilder.setCancelable(false);
            localBuilder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int paramAnonymous2Int) {
                    Intent localIntent = new Intent(ShareThisApp.this, Message_Everyone.class);
                    startActivity(localIntent);
                    finish();
                    dialog.cancel();
                    int shared = 1;
                    SharedPreferences sharedPref = getSharedPreferences(PRIVATE_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt(shared_data, shared);
                    editor.apply();
                    finish();
                }
            });
            localBuilder.create().show();
            return;
        }
        sendtext();
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Share This App")
                .setAction("Share icon")
                .build());
        total = total - 1;
        final TextView text = (TextView) findViewById(R.id.textRemaining);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                text.setText("" + total);
            }
        }, 1000 * 5);
    }

    public void sendtext() {
        PackageManager localPackageManager = getPackageManager();
        try {
            Intent localIntent = new Intent("android.intent.action.SEND");
            localIntent.setType("text/plain");
            String str = Message_Everyone.shareBody;
            localPackageManager.getPackageInfo("com.whatsapp", 128);
            localIntent.setPackage("com.whatsapp");
            localIntent.putExtra("android.intent.extra.TEXT", str);
            startActivity(Intent.createChooser(localIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException localNameNotFoundException) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Try this app!");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share this app link via"));
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}