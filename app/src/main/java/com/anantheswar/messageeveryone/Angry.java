package com.anantheswar.messageeveryone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.text.ClipboardManager;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.util.Random;

/*
* Created by Anantha Eswar on 9/27/2015.
*/
public class Angry extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angry);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Angry Messages");

            t.send(new HitBuilders.AppViewBuilder().build());
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(messages.length);
        random = messages[randomNumber];
        textView = (TextView) findViewById(R.id.randomTextView);
        textView.setText(random);
        TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setText("1. " + messages[0]);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setText("2. " + messages[1]);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setText("3. " + messages[2]);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setText("4. " + messages[3]);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        text5.setText("5. " + messages[4]);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setText("6. " + messages[5]);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        text7.setText("7. " + messages[6]);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setText("8. " + messages[7]);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        text9.setText("9. " + messages[8]);
        TextView text10 = (TextView) findViewById(R.id.textView10);
        text10.setText("10. " + messages[9]);
        TextView text11 = (TextView) findViewById(R.id.textView11);
        text11.setText("11. " + messages[10]);
        TextView text12 = (TextView) findViewById(R.id.textView12);
        text12.setText("12. " + messages[11]);
        TextView text13 = (TextView) findViewById(R.id.textView13);
        text13.setText("13. " + messages[12]);
        TextView text14 = (TextView) findViewById(R.id.textView14);
        text14.setText("14. " + messages[13]);
        TextView text15 = (TextView) findViewById(R.id.textView15);
        text15.setText("15. " + messages[14]);
        TextView text16 = (TextView) findViewById(R.id.textView16);
        text16.setText("16. " + messages[15]);
        TextView text17 = (TextView) findViewById(R.id.textView17);
        text17.setText("17. " + messages[16]);
        TextView text18 = (TextView) findViewById(R.id.textView18);
        text18.setText("18. " + messages[17]);
        TextView text19 = (TextView) findViewById(R.id.textView19);
        text19.setText("19. " + messages[18]);
        TextView text20 = (TextView) findViewById(R.id.textView20);
        text20.setText("20. " + messages[19]);
        TextView text21 = (TextView) findViewById(R.id.textView21);
        text21.setText("21. " + messages[20]);
        TextView text22 = (TextView) findViewById(R.id.textView22);
        text22.setText("22. " + messages[21]);
        TextView text23 = (TextView) findViewById(R.id.textView23);
        text23.setText("23. " + messages[22]);
        TextView text24 = (TextView) findViewById(R.id.textView24);
        text24.setText("24. " + messages[23]);
        TextView text25 = (TextView) findViewById(R.id.textView25);
        text25.setText("25. " + messages[24]);
        TextView text26 = (TextView) findViewById(R.id.textView26);
        text26.setText("26. " + messages[25]);
        TextView text27 = (TextView) findViewById(R.id.textView27);
        text27.setText("27. " + messages[26]);
        TextView text28 = (TextView) findViewById(R.id.textView28);
        text28.setText("28. " + messages[27]);
        TextView text29 = (TextView) findViewById(R.id.textView29);
        text29.setText("29. " + messages[28]);
        TextView text30 = (TextView) findViewById(R.id.textView30);
        text30.setText("30. " + messages[29]);
        TextView text31 = (TextView) findViewById(R.id.textView31);
        text31.setText("31. " + messages[30]);
        TextView text32 = (TextView) findViewById(R.id.textView32);
        text32.setText("32. " + messages[31]);
        TextView text33 = (TextView) findViewById(R.id.textView33);
        text33.setText("33. " + messages[32]);
        TextView text34 = (TextView) findViewById(R.id.textView34);
        text34.setText("34. " + messages[33]);
        TextView text35 = (TextView) findViewById(R.id.textView35);
        text35.setText("35. " + messages[34]);
        TextView text36 = (TextView) findViewById(R.id.textView36);
        text36.setText("36. " + messages[35]);
        TextView text37 = (TextView) findViewById(R.id.textView37);
        text37.setText("37. " + messages[36]);
        TextView text38 = (TextView) findViewById(R.id.textView38);
        text38.setText("38. " + messages[37]);
        TextView text39 = (TextView) findViewById(R.id.textView39);
        text39.setText("39. " + messages[38]);
        TextView text40 = (TextView) findViewById(R.id.textView40);
        text40.setText("40. " + messages[39]);
        TextView text41 = (TextView) findViewById(R.id.textView41);
        text41.setText("41. " + messages[40]);
        TextView text42 = (TextView) findViewById(R.id.textView42);
        text42.setText("42. " + messages[41]);
        TextView text43 = (TextView) findViewById(R.id.textView43);
        text43.setText("43. " + messages[42]);
        TextView text44 = (TextView) findViewById(R.id.textView44);
        text44.setText("44. " + messages[43]);
        TextView text45 = (TextView) findViewById(R.id.textView45);
        text45.setText("45. " + messages[44]);
        TextView text46 = (TextView) findViewById(R.id.textView46);
        text46.setText("46. " + messages[45]);
        TextView text47 = (TextView) findViewById(R.id.textView47);
        text47.setText("47. " + messages[46]);
        TextView text48 = (TextView) findViewById(R.id.textView48);
        text48.setText("48. " + messages[47]);
        TextView text49 = (TextView) findViewById(R.id.textView49);
        text49.setText("49. " + messages[48]);
        TextView text50 = (TextView) findViewById(R.id.textView50);
        text50.setText("50. " + messages[49]);
        TextView text51 = (TextView) findViewById(R.id.textView51);
        text51.setText("51. " + messages[50]);
        TextView text52 = (TextView) findViewById(R.id.textView52);
        text52.setText("52. " + messages[51]);
        TextView text53 = (TextView) findViewById(R.id.textView53);
        text53.setText("53. " + messages[52]);
        TextView text54 = (TextView) findViewById(R.id.textView54);
        text54.setText("54. " + messages[53]);
        TextView text55 = (TextView) findViewById(R.id.textView55);
        text55.setText("55. " + messages[54]);
        TextView text56 = (TextView) findViewById(R.id.textView56);
        text56.setText("56. " + messages[55]);
        TextView text57 = (TextView) findViewById(R.id.textView57);
        text57.setText("57. " + messages[56]);
        TextView text58 = (TextView) findViewById(R.id.textView58);
        text58.setText("58. " + messages[57]);
        TextView text59 = (TextView) findViewById(R.id.textView59);
        text59.setText("59. " + messages[58]);
        TextView text60 = (TextView) findViewById(R.id.textView60);
        text60.setText("60. " + messages[59]);
        TextView text61 = (TextView) findViewById(R.id.textView61);
        text61.setText("61. " + messages[60]);
        TextView text62 = (TextView) findViewById(R.id.textView62);
        text62.setText("62. " + messages[61]);
        TextView text63 = (TextView) findViewById(R.id.textView63);
        text63.setText("63. " + messages[62]);
        TextView text64 = (TextView) findViewById(R.id.textView64);
        text64.setText("64. " + messages[63]);
        TextView text65 = (TextView) findViewById(R.id.textView65);
        text65.setText("65. " + messages[64]);
        TextView text66 = (TextView) findViewById(R.id.textView66);
        text66.setText("66. " + messages[65]);
        TextView text67 = (TextView) findViewById(R.id.textView67);
        text67.setText("67. " + messages[66]);
        TextView text68 = (TextView) findViewById(R.id.textView68);
        text68.setText("68. " + messages[67]);
        TextView text69 = (TextView) findViewById(R.id.textView69);
        text69.setText("69. " + messages[68]);
        TextView text70 = (TextView) findViewById(R.id.textView70);
        text70.setText("70. " + messages[69]);
        TextView text71 = (TextView) findViewById(R.id.textView71);
        text71.setText("71. " + messages[70]);
        TextView text72 = (TextView) findViewById(R.id.textView72);
        text72.setText("72. " + messages[71]);
        TextView text73 = (TextView) findViewById(R.id.textView73);
        text73.setText("73. " + messages[72]);
        TextView text74 = (TextView) findViewById(R.id.textView74);
        text74.setText("74. " + messages[73]);
        TextView text75 = (TextView) findViewById(R.id.textView75);
        text75.setText("75. " + messages[74]);
        TextView text76 = (TextView) findViewById(R.id.textView76);
        text76.setText("76. " + messages[75]);
        TextView text77 = (TextView) findViewById(R.id.textView77);
        text77.setText("77. " + messages[76]);
        TextView text78 = (TextView) findViewById(R.id.textView78);
        text78.setText("78. " + messages[77]);
        TextView text79 = (TextView) findViewById(R.id.textView79);
        text79.setText("79. " + messages[78]);
        TextView text80 = (TextView) findViewById(R.id.textView80);
        text80.setText("80. " + messages[79]);
        TextView text81 = (TextView) findViewById(R.id.textView81);
        text81.setText("81. " + messages[80]);
        TextView text82 = (TextView) findViewById(R.id.textView82);
        text82.setText("82. " + messages[81]);
        TextView text83 = (TextView) findViewById(R.id.textView83);
        text83.setText("83. " + messages[82]);
        TextView text84 = (TextView) findViewById(R.id.textView84);
        text84.setText("84. " + messages[83]);
        TextView text85 = (TextView) findViewById(R.id.textView85);
        text85.setText("85. " + messages[84]);
        TextView text86 = (TextView) findViewById(R.id.textView86);
        text86.setText("86. " + messages[85]);
        TextView text87 = (TextView) findViewById(R.id.textView87);
        text87.setText("87. " + messages[86]);
        TextView text88 = (TextView) findViewById(R.id.textView88);
        text88.setText("88. " + messages[87]);
        TextView text89 = (TextView) findViewById(R.id.textView89);
        text89.setText("89. " + messages[88]);
        TextView text90 = (TextView) findViewById(R.id.textView90);
        text90.setText("90. " + messages[89]);
    }

    /*http://hamariweb.com/mobiles/angry_sms_messages51.aspx?page=3
    Latest new 1-50
     */
    public static String[] messages = {"If You Angry with your Loveable Friend,\n" +
            "Just Put aside you Egos.\n" +
            "Just Hug Each Other and Say:\n" +
            "I Need You Idiot, at least to Fight With Me.."
            , "There is nothing more galling to angry people than the coolness of those on whom they wish to vent their spleen.\n" +
            "anger comes alone"
            , "ANGER is just one letter away from D(ANGER).\n" +
            "So, have patience in all circumstances..!\n" +
            "That will help us to avoid all problems…"
            , "I never forget a face, but in your case I'll be glad to make an exception!"
            , "(‘-‘) Smiling\n" +
            "(!.!) Crying\n" +
            "(‘;’) Angry\n" +
            "(‘:’) Bored\n" +
            "(‘.’) Proud\n" +
            "(‘o’) Hungry\n" +
            "(‘?’) Confuse\n" +
            "(-.-) Sleepy\n" +
            "I like to accompany you in every mood"
            , "Sometimes when I’m angry I have the right to be angry,\n" +
            "but that doesn’t give me the right to be cruel"
            , "I feel the anger rise up in me.The same anger that makes me bleed inside In my heart and in my soul killing me."
            , " Patient Angry Doctor\n" +
            "\n" +
            "Doctor Implants A New Ear To A Man\n" +
            "Man: U Idiot, U Gave Me A Woman’s Ear\n" +
            "Doctor: It Makez No Differnce\n" +
            "Man: It Does,Now I Hear Everything\n" +
            "Bu8 Understand Nothing."
            , "Very beautiful quote on anger:\n" +
            "“if u r right then there is\n" +
            "no need 2 get angry” &\n" +
            "“if u r wrong then u don't\n" +
            "have any right 2 B angry”"
            , "When Someone Gets Angry With You\n" +
            "And Says…\n" +
            "I Will Never Talk To You… :(\n" +
            "And Later Comes Back To Inform\n" +
            "You…\n" +
            "“I AM STILL ANGRY”"
            , "Don't hold on to anger, hurt or pain. They steal your energy and keep you away from love."
            , "Only a person who got angry can understand & feel d dangers of anger."
            , "A person who has a lot of anger inside, definitely loves people more than anyone else.....\n" +
            "because if read colour indicates anger,\n" +
            "then it indicates love too!!." +
            "ANGER is only one letter shorter than DANGER."
            , "Not the fastest horse \n" +
            "can catch a word spoken in anger."
            , "If you kick a stone in anger, \n" +
            "you'll hurt your own foot."
            , "If You Are Angry with your Loveable Friend,\n" +
            "Just Put aside you Egos.\n" +
            "Just Hug Each Other and Say:\n" +
            "I Need You Idiot, at least to Fight With Me.."
            , "Silence is the fence around wisdom!!\n" +
            "If your foot slips,\n" +
            "You can always regain your balance..\n" +
            "But if your tongue slips,\n" +
            "You can never recall the words?\n" +
            "So think before saying anything in anger."
            , "ANGER is just one letter away from D(ANGER).\n" +
            "So, have patience in all circumstances..!\n" +
            "That will help us to avoid all problems?!"
            , "Reflection Cannot be seen in Boiling Water, The same way Truth cannot be seen in a state of Anger?So always keep your cool.?"
            , "As heat conserved is transmitted into energy, \n" +
            "so can anger controlled can be transmitted into a power which can move the world."
            , "Angry is the punishment \n" +
            "given to you by\n" +
            "yourself for others mistakes?.."
            , "Anger Blows Out The Lamp Of The Mind"
            , "Sit With Me When I Am Angry \n" +
            "Talk To Me When I Am Sad \n" +
            "Cry For Me When I Am Dead \n" +
            "But Don't Forget Me When I Am Alive!..."
            , "Whn Ur Angry At Some1 N Get Irritated Time 2 Time Bt \n" +
            "U Still Cnt Live Wthout Him/her Then Its True Relation..!!"
            , "When Anger Rises, Think Of The Consequences."
            , "An Angry Man Is Again Angry With Himself \n" +
            "When He Returns To Reason."
            , "Stay away from Anger as it shall hurt you only.\n" +
            "If you are right then there is no need to get angry;\n" +
            "And if you are wrong then you don't have any right to get angry!"
            , "Anger is a feeling \n" +
            "that makes your mouth \n" +
            "work faster than your mind."
            , "Anger is a condition in which the tongue work faster than the mind. \n" +
            "\n" +
            "Smile is an action which makes everything work faster except tongue."
            , "\"Don't miss understand the person \n" +
            "who shows anger on u.\n" +
            "B'coz anger is the most easiest & childish way to express the deep love in a good relation.\""
            , "Anger had MUTE button,\n" +
            "Mistake ahd BACK button,\n" +
            "Hard time had FAST FORWARD \n" +
            "button,\n" +
            "Good times had PAUSE button!...."
            , "It?s Better To Cry Than To Be\n" +
            "Angry Hurts Other While Tears\n" +
            "Flow Silently Through The Soul\n" +
            "and Cleanse The Heart.."
            , "Beautiful quote on anger:\n" +
            "\"If you r right then there is no need to get angry\" &\n" +
            "\"if u r wrong then you dont have any right to be angry\""
            , "A single word spoken at the time of anger is more poisonous,\n" +
            "which makes us forget the hundred loveble conversation within a minute\"\n" +
            "so be cool wen ur are angry..!"
            , "There are some people\n" +
            "who always seem angry\n" +
            "and continuously look\n" +
            "for conflict. Walk away;\n" +
            "the battle they are\n" +
            "fighting isn't with you, it\n" +
            "is with themselves."
            , "Don't let yourself become soo anger..!!\n" +
            "that you stop loving..!!\n" +
            "\n" +
            "becouse..!!\n" +
            "\n" +
            "one day you will wake up..!!\n" +
            "\n" +
            "from that anger..!!\n" +
            "\n" +
            "and the person you love will gone..!!"
            , "If you are right then there is\n" +
            "no need to get angry? and\n" +
            "If you are wrong then you dont\n" +
            "have any right to be angry."
            , "I hate the people who think they are the best.\n" +
            "I hate the people who show off.\n" +
            "I hate the people who lies to me.\n" +
            "I hate the people who dose not listen to me.\n" +
            "I hate the people who use my things.\n" +
            ".\n" +
            ".\n" +
            "THAT'S WHY I GET SO ANGRY.\n" +
            "I HATE THE PEOPLE WHO BREAK MY RULES."
            , "Anger can b understood by\n" +
            "the person on whom another\n" +
            "person is angry…"
            , "If you speak when you’re angry,\n" +
            "you will make the best speech you’ll ever regret"
            , "I don''t forgive people cause I''m weak I forgive them cause I''m strong enough to understand people make mistakes."
            , "If you would cure anger,\n" +
            "Do not feed it.\n" +
            "Say to yourself:\n" +
            "‘I used to be angry every day;\n" +
            "Then every other day;\n" +
            "Now only every third or fourth day.\n" +
            "‘When you reach thirty days offer a sacrifice of\n" +
            "thanksgiving to the gods."
            , "Forgive u again?\n" +
            "For all those times you made me cry?\n" +
            "For all those things you said about me?\n" +
            "For all those crap you started?\n" +
            "For stabing me in the back?\n" +
            "Now I Won’t 4give You,\n" +
            "Not This Time"
            , "As heat conserved is transmitted into energy, so can anger controlled can be transmitted into a power which can move the world."
            , "A wife comes home unexpectedly one day and finds her husband in bed with a lady midget. Upset and furious over his actions, the woman screams, \"You promised me two weeks ago that you would never cheat on me again!\" Trying his best to calm her down, the husband turns to his wife and says, \"Take it easy Dear, Can''t you see I''m trying to taper off?\""
            , "The angry wife met her husband at the door. His breath stunk of alcohol and his face was plastered with lipstick. \"I assume,\" she barked, \"there is a very good reason for you to come drifting in at six o''clock in the morning?\" \"There is!\" he replied, \"Breakfast.\""
            , "Holding on to anger, resentment and hurt only gives you tense muscles, a headache and a sore jaw from clenching your teeth. Forgiveness gives you back the laughter and the lightness in your life."
            , "If you would cure anger, do not feed it. Say to yourself: ''I used to be angry every day; then every other day; now only every third or fourth day.'' When you reach thirty days offer a sacrifice of thanksgiving to the gods."
            , "I have to be honest with myself. I think I am going to get booed badly. I am very well aware that some fans are very angry."
            , "When a man sends you an impudent letter, sit right down and give it back to him with interest ten times compounded, and then throw both letters in the wastebasket."
            , "Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one who gets burned."
            , "If you''re angry at a loved one, hug that person. And mean it. You may not want to hug - which is all the more reason to do so. It''s hard to stay angry when someone shows they love you, and that''s precisely what happens when we hug each other."
            , "In certain trying circumstances, urgent circumstances, desperate circumstances, profanity furnishes a relief denied even to prayer."
            , "Anger and jealousy \n" +
            "can no more bear\n" +
            "to lose \n" +
            "sight of their \n" +
            "objects than love."
            , "I feel the anger rize up in me The same anger That makes me bleed Inside In my heart and in my soul Killing me."
            , "Few minutes \n" +
            "of Anger \n" +
            "can ruin \n" +
            "few days \n" +
            "or \n" +
            "years of happiness"
            , "Anger \n" +
            "is the feeling \n" +
            "that makes \n" +
            "your mouth \n" +
            "work faster \n" +
            "than your mind."
            , "Speak when you are angry \n" +
            "and you will make \n" +
            "the best speech \n" +
            "you will ever regret."
            , "Care should be in Heart and not in Words?\n" +
            "\n" +
            "Anger should always be in Words and not in Heart?."
            , "?...Cute Relationship... ?\n" +
            "When Someone Gets Angry With You\n" +
            "And Says...\n" +
            "I Will Never Talk To You... :(\n" +
            "And Later Comes Back To Inform\n" +
            "You...\n" +
            "\"I AM STILL ANGRY\""
            , "Anger is the only dullness which makes love invisible.\n" +
            "And love is the only brightness which is visible even after you loss your temper."
            , "I'm not Angry that I Lost you,\n" +
            "I'm sad because I once Had you..\n" +
            "I'm not Angry that I can't Have you,\n" +
            "I'm sad because I Know what I'm\n" +
            "Missing..\n" +
            "I'm not Angry that you've moved on,\n" +
            "I'm Sad because I can't walk wid u.."
            , "ANGER & HAPPINESS are complimentary\n" +
            "Make your Anger so expensive so that on ONE can afford it.\n" +
            "& Make your Happiness so cheap that people get it free."
            , "ANGER Comes Alone\n" +
            "But TAKES AWAY all the GOOD\n" +
            "Qualities FROM Us.\n" +
            "PATIENCE Too Comes Alone,\n" +
            "But\n" +
            "BRINGS All the GOOD Qualities To Us.\n" +
            "So Be with It?."
            , "Anyone can become angry that is easy but to be angry with the right person at the right time, \n" +
            "and for the right purpose and in the right way that is not within everyone?s power and that is not easy."
            , "If you are patient in one moment of anger,\n" +
            "you will escape a hundred days of sorrow."
            , "You SHOULDN?T OPEN UR MOUTH IN TWO SITUATIONS?\n" +
            "ONCE WHILE SWIMMING AND THE OTHER WHEN YOU ARE ANGRY?"
            , "Forgive u again?\n" +
            "For all those times you made me cry?\n" +
            "For all those things you said about me?\n" +
            "For all those crap you started?\n" +
            "For stabbing me in the back?\n" +
            "Not won't 4give You,\n" +
            "\n" +
            "Not This Time\n" +
            "I am too angry with you??.."
            , "The worst-tempered people\n" +
            "I?ve ever met were people \n" +
            "who knew they were wrong."
            , "Doctor implants a New Ear to a man.\n" +
            "\n" +
            "Man: You idiot, you gave me a woman’s ear\n" +
            "\n" +
            "Doctor: It makes no difference\n" +
            "\n" +
            "Man: It does,Now I hear everything\n" +
            "\n" +
            "but understand nothing"
            , "Anger Makes The Tongue\n" +
            "Faster Than The Mind\n" +
            "\n" +
            "Smile Makes Everything Work Faster\n" +
            "Except The Tongue"
            , "How true my feelings were I found out to be The best thing in my life Was when you married me. Thank you my loving wife(loving Husband), For the years we share I know one thing for sure We make a wonderful pair"
            , "I feel the anger rise up in me.The same anger that makes me bleed inside In my heart and in my soul killing me."
            , "Don't Misunderstand The Person Who Shows Anger On You,\n" +
            "Because Anger Is The Most Easiest\n" +
            "& Childish Way To Express The Deep Love!"
            , "When someone stops getting angry on u, its clear that u hav lost ur importance 4m their Life..\n" +
            "Anger is sumthing more than Love...."
            , "anger is the only feeling that makes ur mouth work faster than ur mind\n" +
            ".....don't be in missunderstanding!luv ur luv so that u woun't loose ur luv ..........."
            , "Remember\n" +
            "When\n" +
            "We are in Anger\n" +
            "We are just One Letter Short of Danger\n" +
            "While\n" +
            "When we are\n" +
            "GOOD 2 others\n" +
            "We are\n" +
            "One Letter More than\n" +
            "GOD\n" +
            "Choice is Ours"
            , "A person who has a lot of anger inside, definitely loves people more than anyone else.....\n" +
            "because if read colour indicates anger,\n" +
            "then it indicates love too!!"
            , "'When Iron gets Hot you can mold it in any shape,\n" +
            "\n" +
            "Never loose your temper or else,\n" +
            "\n" +
            "Unless people will mold you the way they want..''"
            , "With anger we lose everything its takes u 2 seconds to draw a tender smile on your face and its takes u years to forget the pain causes from anger"
            , "ANGER Comes Alone\n" +
            "Bt TAKES AWAY all the GOOD\n" +
            "Qualities FROM Us.\n" +
            "\n" +
            "PATIENCE Too Comes Alone,\n" +
            "Bt\n" +
            "BRINGS All the GOOD Qualities To Us.\n" +
            "\n" +
            "So Be with It...."
            , "A Single Harsh Word Spoken\n" +
            "At The Time Of Anger Is So Poisonous\n" +
            "That It Makes Us To forget The\n" +
            "100 Lovable Conversations Within Seconds.\n" +
            "Never get angry,be Happy always!!!\n" +
            "Yeah, like this!"
            , "\"Anger is the only evil which makes love invisible for a minute.\n" +
            "And love is the only suspicious thing which is visible even after anger."
            , "ANGER is an acid that does more harm to the vessel in which it is stored, that to anything on which it is poured."
            , "There is nothing more galling to angry people than the coolness of those on whom they wish to vent their spleen."
            , "If you're angry at a loved one, hug that person. And mean it. You may not want to hug - which is all the more reason to do so. It's hard to stay angry when someone shows they love you, and that's precisely what happens when we hug each other."
            , "Anger is a killing thing: it kills the man who angers, for each rage leaves him less than he had been before - it takes something"
            , "It is impossible for you to be angry and laugh at the same time. Anger and laughter are mutually exclusive and you have the power to choose either."
            , "Events will take their course, it is no good of being angry at them; he is happiest who wisely turns them to the best account."
            , "Usually when people are sad, they don't do anything. They just cry over their condition. But when they get angry, they bring about a change."};


    // SET OF METHODS TO PERFORM COPY TO CLIPBOARD OPERATIONS
    public void randomCopy(View view) {
        String a = random;
        myVib.vibrate(50);
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        clipboard.setText(a);
        showMessage("Copied to Clipboard");
        Message_Everyone.ButtonClicks++;
        if (Message_Everyone.ButtonClicks == 15) {
            Message_Everyone.randomButtonClicks();
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Angry Messages")
                .setAction("Copy Button of Random Layout")
                .build());
    }

    public void copy1(View view) {
        String a = messages[0];
        copyToClipboard(a);
    }

    public void copy2(View view) {
        String a = messages[1];
        copyToClipboard(a);
    }

    public void copy3(View view) {
        String a = messages[2];
        copyToClipboard(a);
    }

    public void copy4(View view) {
        String a = messages[3];
        copyToClipboard(a);
    }

    public void copy5(View view) {
        String a = messages[4];
        copyToClipboard(a);
    }

    public void copy6(View view) {
        String a = messages[5];
        copyToClipboard(a);
    }

    public void copy7(View view) {
        String a = messages[6];
        copyToClipboard(a);
    }

    public void copy8(View view) {
        String a = messages[7];
        copyToClipboard(a);
    }

    public void copy9(View view) {
        String a = messages[8];
        copyToClipboard(a);
    }

    public void copy10(View view) {
        String a = messages[9];
        copyToClipboard(a);
    }

    public void copy11(View view) {
        String a = messages[10];
        copyToClipboard(a);
    }

    public void copy12(View view) {
        String a = messages[11];
        copyToClipboard(a);
    }

    public void copy13(View view) {
        String a = messages[12];
        copyToClipboard(a);
    }

    public void copy14(View view) {
        String a = messages[13];
        copyToClipboard(a);
    }

    public void copy15(View view) {
        String a = messages[14];
        copyToClipboard(a);
    }

    public void copy16(View view) {
        String a = messages[15];
        copyToClipboard(a);
    }

    public void copy17(View view) {
        String a = messages[16];
        copyToClipboard(a);
    }

    public void copy18(View view) {
        String a = messages[17];
        copyToClipboard(a);
    }

    public void copy19(View view) {
        String a = messages[18];
        copyToClipboard(a);
    }

    public void copy20(View view) {
        String a = messages[19];
        copyToClipboard(a);
    }

    public void copy21(View view) {
        String a = messages[20];
        copyToClipboard(a);
    }

    public void copy22(View view) {
        String a = messages[21];
        copyToClipboard(a);
    }

    public void copy23(View view) {
        String a = messages[22];
        copyToClipboard(a);
    }

    public void copy24(View view) {
        String a = messages[23];
        copyToClipboard(a);
    }

    public void copy25(View view) {
        String a = messages[24];
        copyToClipboard(a);
    }

    public void copy26(View view) {
        String a = messages[25];
        copyToClipboard(a);
    }

    public void copy27(View view) {
        String a = messages[26];
        copyToClipboard(a);
    }

    public void copy28(View view) {
        String a = messages[27];
        copyToClipboard(a);
    }

    public void copy29(View view) {
        String a = messages[28];
        copyToClipboard(a);
    }

    public void copy30(View view) {
        String a = messages[29];
        copyToClipboard(a);
    }

    public void copy31(View view) {
        String a = messages[30];
        copyToClipboard(a);
    }

    public void copy32(View view) {
        String a = messages[31];
        copyToClipboard(a);
    }

    public void copy33(View view) {
        String a = messages[32];
        copyToClipboard(a);
    }

    public void copy34(View view) {
        String a = messages[33];
        copyToClipboard(a);
    }

    public void copy35(View view) {
        String a = messages[34];
        copyToClipboard(a);
    }

    public void copy36(View view) {
        String a = messages[35];
        copyToClipboard(a);
    }

    public void copy37(View view) {
        String a = messages[36];
        copyToClipboard(a);
    }

    public void copy38(View view) {
        String a = messages[37];
        copyToClipboard(a);
    }

    public void copy39(View view) {
        String a = messages[38];
        copyToClipboard(a);
    }

    public void copy40(View view) {
        String a = messages[39];
        copyToClipboard(a);
    }

    public void copy41(View view) {
        String a = messages[40];
        copyToClipboard(a);
    }

    public void copy42(View view) {
        String a = messages[41];
        copyToClipboard(a);
    }

    public void copy43(View view) {
        String a = messages[42];
        copyToClipboard(a);
    }

    public void copy44(View view) {
        String a = messages[43];
        copyToClipboard(a);
    }

    public void copy45(View view) {
        String a = messages[44];
        copyToClipboard(a);
    }

    public void copy46(View view) {
        String a = messages[45];
        copyToClipboard(a);
    }

    public void copy47(View view) {
        String a = messages[46];
        copyToClipboard(a);
    }

    public void copy48(View view) {
        String a = messages[47];
        copyToClipboard(a);
    }

    public void copy49(View view) {
        String a = messages[48];
        copyToClipboard(a);
    }

    public void copy50(View view) {
        String a = messages[49];
        copyToClipboard(a);
    }

    public void copy51(View view) {
        String a = messages[50];
        copyToClipboard(a);
    }

    public void copy52(View view) {
        String a = messages[51];
        copyToClipboard(a);
    }

    public void copy53(View view) {
        String a = messages[52];
        copyToClipboard(a);
    }

    public void copy54(View view) {
        String a = messages[53];
        copyToClipboard(a);
    }

    public void copy55(View view) {
        String a = messages[54];
        copyToClipboard(a);
    }

    public void copy56(View view) {
        String a = messages[55];
        copyToClipboard(a);
    }

    public void copy57(View view) {
        String a = messages[56];
        copyToClipboard(a);
    }

    public void copy58(View view) {
        String a = messages[57];
        copyToClipboard(a);
    }

    public void copy59(View view) {
        String a = messages[58];
        copyToClipboard(a);
    }

    public void copy60(View view) {
        String a = messages[59];
        copyToClipboard(a);
    }

    public void copy61(View view) {
        String a = messages[60];
        copyToClipboard(a);
    }

    public void copy62(View view) {
        String a = messages[61];
        copyToClipboard(a);
    }

    public void copy63(View view) {
        String a = messages[62];
        copyToClipboard(a);
    }

    public void copy64(View view) {
        String a = messages[63];
        copyToClipboard(a);
    }

    public void copy65(View view) {
        String a = messages[64];
        copyToClipboard(a);
    }

    public void copy66(View view) {
        String a = messages[65];
        copyToClipboard(a);
    }

    public void copy67(View view) {
        String a = messages[66];
        copyToClipboard(a);
    }

    public void copy68(View view) {
        String a = messages[67];
        copyToClipboard(a);
    }

    public void copy69(View view) {
        String a = messages[68];
        copyToClipboard(a);
    }

    public void copy70(View view) {
        String a = messages[69];
        copyToClipboard(a);
    }

    public void copy71(View view) {
        String a = messages[70];
        copyToClipboard(a);
    }

    public void copy72(View view) {
        String a = messages[71];
        copyToClipboard(a);
    }

    public void copy73(View view) {
        String a = messages[72];
        copyToClipboard(a);
    }

    public void copy74(View view) {
        String a = messages[73];
        copyToClipboard(a);
    }

    public void copy75(View view) {
        String a = messages[74];
        copyToClipboard(a);
    }

    public void copy76(View view) {
        String a = messages[75];
        copyToClipboard(a);
    }

    public void copy77(View view) {
        String a = messages[76];
        copyToClipboard(a);
    }

    public void copy78(View view) {
        String a = messages[77];
        copyToClipboard(a);
    }

    public void copy79(View view) {
        String a = messages[78];
        copyToClipboard(a);
    }

    public void copy80(View view) {
        String a = messages[79];
        copyToClipboard(a);
    }

    public void copy81(View view) {
        String a = messages[80];
        copyToClipboard(a);
    }

    public void copy82(View view) {
        String a = messages[81];
        copyToClipboard(a);
    }

    public void copy83(View view) {
        String a = messages[82];
        copyToClipboard(a);
    }

    public void copy84(View view) {
        String a = messages[83];
        copyToClipboard(a);
    }

    public void copy85(View view) {
        String a = messages[84];
        copyToClipboard(a);
    }

    public void copy86(View view) {
        String a = messages[85];
        copyToClipboard(a);
    }

    public void copy87(View view) {
        String a = messages[86];
        copyToClipboard(a);
    }

    public void copy88(View view) {
        String a = messages[87];
        copyToClipboard(a);
    }

    public void copy89(View view) {
        String a = messages[88];
        copyToClipboard(a);
    }

    public void copy90(View view) {
        String a = messages[89];
        copyToClipboard(a);
    }

    public void copy91(View view) {
        String a = messages[90];
        copyToClipboard(a);
    }

    public void copy92(View view) {
        String a = messages[91];
        copyToClipboard(a);
    }

    public void copy93(View view) {
        String a = messages[92];
        copyToClipboard(a);
    }

    public void copy94(View view) {
        String a = messages[93];
        copyToClipboard(a);
    }

    public void copy95(View view) {
        String a = messages[94];
        copyToClipboard(a);
    }

    public void copy96(View view) {
        String a = messages[95];
        copyToClipboard(a);
    }

    public void copy97(View view) {
        String a = messages[96];
        copyToClipboard(a);
    }

    public void copy98(View view) {
        String a = messages[97];
        copyToClipboard(a);
    }

    public void copy99(View view) {
        String a = messages[98];
        copyToClipboard(a);
    }

    public void copy100(View view) {
        String a = messages[99];
        copyToClipboard(a);
    }


    // SET OF METHODS TO PERFORM SHARE INTENT OPERATIONS

    public void randomShare(View view) {
        String a = random;
        myVib.vibrate(50);
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, a);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
        Message_Everyone.ButtonClicks++;
        if (Message_Everyone.ButtonClicks == 15) {
            Message_Everyone.randomButtonClicks();
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Angry Messages")
                .setAction("Share Button of Random Layout")
                .build());
    }

    public void share1(View view) {
        String a = messages[0];
        shareIntent(a);
    }

    public void share2(View view) {
        String a = messages[1];
        shareIntent(a);
    }

    public void share3(View view) {
        String a = messages[2];
        shareIntent(a);
    }

    public void share4(View view) {
        String a = messages[3];
        shareIntent(a);
    }

    public void share5(View view) {
        String a = messages[4];
        shareIntent(a);
    }

    public void share6(View view) {
        String a = messages[5];
        shareIntent(a);
    }

    public void share7(View view) {
        String a = messages[6];
        shareIntent(a);
    }

    public void share8(View view) {
        String a = messages[7];
        shareIntent(a);
    }

    public void share9(View view) {
        String a = messages[8];
        shareIntent(a);
    }

    public void share10(View view) {
        String a = messages[9];
        shareIntent(a);
    }

    public void share11(View view) {
        String a = messages[10];
        shareIntent(a);
    }

    public void share12(View view) {
        String a = messages[11];
        shareIntent(a);
    }

    public void share13(View view) {
        String a = messages[12];
        shareIntent(a);
    }

    public void share14(View view) {
        String a = messages[13];
        shareIntent(a);
    }

    public void share15(View view) {
        String a = messages[14];
        shareIntent(a);
    }

    public void share16(View view) {
        String a = messages[15];
        shareIntent(a);
    }

    public void share17(View view) {
        String a = messages[16];
        shareIntent(a);
    }

    public void share18(View view) {
        String a = messages[17];
        shareIntent(a);
    }

    public void share19(View view) {
        String a = messages[18];
        shareIntent(a);
    }

    public void share20(View view) {
        String a = messages[19];
        shareIntent(a);
    }

    public void share21(View view) {
        String a = messages[20];
        shareIntent(a);
    }

    public void share22(View view) {
        String a = messages[21];
        shareIntent(a);
    }

    public void share23(View view) {
        String a = messages[22];
        shareIntent(a);
    }

    public void share24(View view) {
        String a = messages[23];
        shareIntent(a);
    }

    public void share25(View view) {
        String a = messages[24];
        shareIntent(a);
    }

    public void share26(View view) {
        String a = messages[25];
        shareIntent(a);
    }

    public void share27(View view) {
        String a = messages[26];
        shareIntent(a);
    }

    public void share28(View view) {
        String a = messages[27];
        shareIntent(a);
    }

    public void share29(View view) {
        String a = messages[28];
        shareIntent(a);
    }

    public void share30(View view) {
        String a = messages[29];
        shareIntent(a);
    }

    public void share31(View view) {
        String a = messages[30];
        shareIntent(a);
    }

    public void share32(View view) {
        String a = messages[31];
        shareIntent(a);
    }

    public void share33(View view) {
        String a = messages[32];
        shareIntent(a);
    }

    public void share34(View view) {
        String a = messages[33];
        shareIntent(a);
    }

    public void share35(View view) {
        String a = messages[34];
        shareIntent(a);
    }

    public void share36(View view) {
        String a = messages[35];
        shareIntent(a);
    }

    public void share37(View view) {
        String a = messages[36];
        shareIntent(a);
    }

    public void share38(View view) {
        String a = messages[37];
        shareIntent(a);
    }

    public void share39(View view) {
        String a = messages[38];
        shareIntent(a);
    }

    public void share40(View view) {
        String a = messages[39];
        shareIntent(a);
    }

    public void share41(View view) {
        String a = messages[40];
        shareIntent(a);
    }

    public void share42(View view) {
        String a = messages[41];
        shareIntent(a);
    }

    public void share43(View view) {
        String a = messages[42];
        shareIntent(a);
    }

    public void share44(View view) {
        String a = messages[43];
        shareIntent(a);
    }

    public void share45(View view) {
        String a = messages[44];
        shareIntent(a);
    }

    public void share46(View view) {
        String a = messages[45];
        shareIntent(a);
    }

    public void share47(View view) {
        String a = messages[46];
        shareIntent(a);
    }

    public void share48(View view) {
        String a = messages[47];
        shareIntent(a);
    }

    public void share49(View view) {
        String a = messages[48];
        shareIntent(a);
    }

    public void share50(View view) {
        String a = messages[49];
        shareIntent(a);
    }

    public void share51(View view) {
        String a = messages[50];
        shareIntent(a);
    }

    public void share52(View view) {
        String a = messages[51];
        shareIntent(a);
    }

    public void share53(View view) {
        String a = messages[52];
        shareIntent(a);
    }

    public void share54(View view) {
        String a = messages[53];
        shareIntent(a);
    }

    public void share55(View view) {
        String a = messages[54];
        shareIntent(a);
    }

    public void share56(View view) {
        String a = messages[55];
        shareIntent(a);
    }

    public void share57(View view) {
        String a = messages[56];
        shareIntent(a);
    }

    public void share58(View view) {
        String a = messages[57];
        shareIntent(a);
    }

    public void share59(View view) {
        String a = messages[58];
        shareIntent(a);
    }

    public void share60(View view) {
        String a = messages[59];
        shareIntent(a);
    }

    public void share61(View view) {
        String a = messages[60];
        shareIntent(a);
    }

    public void share62(View view) {
        String a = messages[61];
        shareIntent(a);
    }

    public void share63(View view) {
        String a = messages[62];
        shareIntent(a);
    }

    public void share64(View view) {
        String a = messages[63];
        shareIntent(a);
    }

    public void share65(View view) {
        String a = messages[64];
        shareIntent(a);
    }

    public void share66(View view) {
        String a = messages[65];
        shareIntent(a);
    }

    public void share67(View view) {
        String a = messages[66];
        shareIntent(a);
    }

    public void share68(View view) {
        String a = messages[67];
        shareIntent(a);
    }

    public void share69(View view) {
        String a = messages[68];
        shareIntent(a);
    }

    public void share70(View view) {
        String a = messages[69];
        shareIntent(a);
    }

    public void share71(View view) {
        String a = messages[70];
        shareIntent(a);
    }

    public void share72(View view) {
        String a = messages[71];
        shareIntent(a);
    }

    public void share73(View view) {
        String a = messages[72];
        shareIntent(a);
    }

    public void share74(View view) {
        String a = messages[73];
        shareIntent(a);
    }

    public void share75(View view) {
        String a = messages[74];
        shareIntent(a);
    }

    public void share76(View view) {
        String a = messages[75];
        shareIntent(a);
    }

    public void share77(View view) {
        String a = messages[76];
        shareIntent(a);
    }

    public void share78(View view) {
        String a = messages[77];
        shareIntent(a);
    }

    public void share79(View view) {
        String a = messages[78];
        shareIntent(a);
    }

    public void share80(View view) {
        String a = messages[79];
        shareIntent(a);
    }

    public void share81(View view) {
        String a = messages[80];
        shareIntent(a);
    }

    public void share82(View view) {
        String a = messages[81];
        shareIntent(a);
    }

    public void share83(View view) {
        String a = messages[82];
        shareIntent(a);
    }

    public void share84(View view) {
        String a = messages[83];
        shareIntent(a);
    }

    public void share85(View view) {
        String a = messages[84];
        shareIntent(a);
    }

    public void share86(View view) {
        String a = messages[85];
        shareIntent(a);
    }

    public void share87(View view) {
        String a = messages[86];
        shareIntent(a);
    }

    public void share88(View view) {
        String a = messages[87];
        shareIntent(a);
    }

    public void share89(View view) {
        String a = messages[88];
        shareIntent(a);
    }

    public void share90(View view) {
        String a = messages[89];
        shareIntent(a);
    }

    public void share91(View view) {
        String a = messages[90];
        shareIntent(a);
    }

    public void share92(View view) {
        String a = messages[91];
        shareIntent(a);
    }

    public void share93(View view) {
        String a = messages[92];
        shareIntent(a);
    }

    public void share94(View view) {
        String a = messages[93];
        shareIntent(a);
    }

    public void share95(View view) {
        String a = messages[94];
        shareIntent(a);
    }

    public void share96(View view) {
        String a = messages[95];
        shareIntent(a);
    }

    public void share97(View view) {
        String a = messages[96];
        shareIntent(a);
    }

    public void share98(View view) {
        String a = messages[97];
        shareIntent(a);
    }

    public void share99(View view) {
        String a = messages[98];
        shareIntent(a);
    }

    public void share100(View view) {
        String a = messages[99];
        shareIntent(a);
    }

    // METHOD TO DISPLAY NEW RANDOM MESSAGE WHEN A USER CLICKS THE BUTTON
    public void randomMessage(View view) {
        myVib.vibrate(50);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(messages.length);
        random = messages[randomNumber];
        textView = (TextView) findViewById(R.id.randomTextView);
        textView.setText(random);
        Message_Everyone.ButtonClicks++;
        if (Message_Everyone.ButtonClicks == 15) {
            Message_Everyone.randomButtonClicks();
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Angry Messages")
                .setAction("Random Button")
                .build());
    }

    public void copyToClipboard(String message) {
        myVib.vibrate(50);
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        clipboard.setText(message);
        showMessage("Copied to Clipboard");
        Message_Everyone.ButtonClicks++;
        if (Message_Everyone.ButtonClicks == 15) {
            Message_Everyone.randomButtonClicks();
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Angry Messages")
                .setAction("Copy Button")
                .build());
    }

    public void shareIntent(String message) {
        myVib.vibrate(50);
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
        Message_Everyone.ButtonClicks++;
        if (Message_Everyone.ButtonClicks == 15) {
            Message_Everyone.randomButtonClicks();
        }
        // Build and Send the Analytics Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Angry Messages")
                .setAction("Share Button")
                .build());
    }

    private void showMessage(String msg) {
        ViewGroup container = (ViewGroup) findViewById(R.id.snackbar_layout);
        Snackbar.make(container, msg, Snackbar.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activities, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

        }

        return super.onOptionsItemSelected(item);
    }
}