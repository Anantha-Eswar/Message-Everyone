package com.anantheswar.messageeveryone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.util.Random;

/**
 * Created by Anantha Eswar on 9/22/2015.
 */
public class Friendship extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendship);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Forget Messages");

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
        TextView text91 = (TextView) findViewById(R.id.textView91);
        text91.setText("91. " + messages[90]);
        TextView text92 = (TextView) findViewById(R.id.textView92);
        text92.setText("92. " + messages[91]);
        TextView text93 = (TextView) findViewById(R.id.textView93);
        text93.setText("93. " + messages[92]);
        TextView text94 = (TextView) findViewById(R.id.textView94);
        text94.setText("94. " + messages[93]);
        TextView text95 = (TextView) findViewById(R.id.textView95);
        text95.setText("95. " + messages[94]);
        TextView text96 = (TextView) findViewById(R.id.textView96);
        text96.setText("96. " + messages[95]);
        TextView text97 = (TextView) findViewById(R.id.textView97);
        text97.setText("97. " + messages[96]);
        TextView text98 = (TextView) findViewById(R.id.textView98);
        text98.setText("98. " + messages[97]);
        TextView text99 = (TextView) findViewById(R.id.textView99);
        text99.setText("99. " + messages[98]);
        TextView text100 = (TextView) findViewById(R.id.textView100);
        text100.setText("100. " + messages[99]);
    }

    public static String[] messages = {"Friendship needs\n" +
            "No promises\n" +
            "No demands and\n" +
            "No expectations\n" +
            "It just needs two people\n" +
            "ONE COOL LIKE ME AND ONE SWEET LIKE YOU.",
            "1 Advice - Don't change\n" +
                    "1 Request - Take care\n" +
                    "1 Wish - Don't forget me\n" +
                    "1 Lie - I hate u\n" +
                    "1 Truth - I miss u\n" +
                    "1 Hope - We'll always be Gud Friends.", "Thank you for touching my life in ways you may never know. My riches do not lie in material wealth but in having friends like you - a precious gift from God!",
            "Lovers are cold water;\n" +
                    "Enemies are salt water;\n" +
                    "Teachers are hot water;\n" +
                    "Parents are mineral water;\n" +
                    "But Friends are Beer bottle!", "If all my friends were to jump off a bridge, I wouldn't jump with them. I'd be at the bottom to catch them!",
            "Pure friendship is:\n" +
                    "Bright like sun;\n" +
                    "High like sky;\n" +
                    "Strong like diamond;\n" +
                    "Kind like mother;\n" +
                    "Cute like me;\n" +
                    "And Sweet like you!", "It takes half our life to find true friends and half of it keeping them. I am lucky to have spent less than half my life finding you and wish to spend the rest keeping you.",
            "Friends are a thorn in the Roses of life.\n" +
                    "And they're also a Rose in the thorns of life!\n" +
                    "Thanks for being one!\n", "Of all the friends I've ever met;\n" +
            "You're the one I won't ever forget.\n" +
            "And if I leave this world before you do;\n" +
            "I'll go to Heaven and wait for you!", "Sometimes having fun with your friend is all the therapy that you need!",
            "When you give me a hug,\n" +
                    "You make me forget,\n" +
                    "About all my bad luck,\n" +
                    "And all the pain I have met.", "Sometimes in life, we think we don't need anyone;\n" +
            "But sometime we don't have anyone when we need.\n" +
            "So don't let your best buddies ever leave you!", "Angels exist but sometimes they don't have wings! and are called friends!",
            "Friends like you don’t come around often.\n" +
                    "They’re pretty hard to find.\n" +
                    "I would do anything to keep you close to me.\n" +
                    "Because you are so sweet, loving and kind.\n", "Each of us has his own fear but\n" +
            "Sooner or later we must face it.\n" +
            "It takes a lot of guts to overcome it.\n" +
            "So don’t be afraid to face your fear.\n" +
            "Go ahead, take a bath.", "Do not love a friend who hurts you;\n" +
            "And do not hurt a friend who loves you.\n" +
            "Sacrifice everything for a true friend;\n" +
            "But do not ever sacrifice a friend for anything!", "To make a difference in some ones life you dont have to be brilliant, rich, handsome, beautiful or perfect. You just have to care.",
            "Best friends: The people you can get mad at only for a short period of time because you have important stuff to tell them!", "When i open my eyes every morning i pray to God\n" +
            "that everyone should have a friend like you…\n" +
            "Why should only i suffer!", "Happiness kill hungry,\n" +
            "Sadness kill peace,\n" +
            "Faith kill enemy,\n" +
            "Friends kill your stress.", "We met a few years ago.\n" +
            "Our friendship has grown stronger than ever.\n" +
            "We’re still friends now.\n" +
            "And will be best friends forever!", "Every life in this world is\n" +
            "written by god’s own hands,\n" +
            "That’s why I am thankful to god,\n" +
            "Because he wrote my life,\n" +
            "and included YOU as\n" +
            "A beautiful Friend like a Angle part of my life..!!", "Friendship is not about who you spend the most time with, it's about who you have the best time with!",
            "It Is Easy To Earn,\n" +
                    "Friendship Is Hard To Get;\n" +
                    "Wealthy Depreciates Everyday\n" +
                    "But Our Friendship Will Ever Appreciate And Be There Forever"
            , "As precious as u r to me,\n" +
            "As precious no one can ever be,\n" +
            "I know friends r hard to choose,\n" +
            "But u r a friend I never want to lose"
            , "Being ur friend is my gift.\n" +
            "Missing U is my bad luck.\n" +
            "Disturbing U with SMS is my way of thinking u.\n" +
            "but keeping our friendship is my aim.!"
            , "Friendship is not collection of hearts but it is selection of hearts!"
            , "If you're not losing friends then you're not growing up!"
            , "Friend: someone who tells you things while you are alive, things that others tell after you die."
            , "A daily thought…\n" +
            "A silent tear…\n" +
            "A Constant wish that u r near…\n" +
            "Words are few but thoughts r deep…\n" +
            "Memories of our friendship i’ll always keep!!"
            , "A best friend isn't someone who's just always there for you.\n" +
            "It's someone who understands you a bit more than you understand yourself!"
            , "I Find Rest In The Shadow Of Your Friendship.\n" +
            "You Always Know The Right Words\n" +
            "To Say Which Gives Me The Strength To Move On."
            , "A smile is a sign of joy;\n" +
            "A hug is a sign of love;\n" +
            "A laugh is a sign of happiness;\n" +
            "And a friend like me, well - that's a sign of good taste!"
            , "A friendly discussion is an argument in the early stages!"
            , "Birth is start of life;\n" +
            "Beauty is art of life;\n" +
            "Love is part of life;\n" +
            "Death is last of life;\n" +
            "But FRIENDSHIP is heart of life!"
            , "Our body is very wisely designed. We can neither 'pat' our own 'back' nor 'kick' our own 'ass' - for it, friends are needed!"
            , "When u rise up,\n" +
            "Your friend know who you are.\n" +
            "When you fall down,\n" +
            "You know who your friend are."
            , "Benefits of Friends:\n" +
            "Shitty jokes whenever you ask for them;\n" +
            "Useless jokes when you don't ask for them!"
            , "Wherever you go, whatever you do my friend, may God’s angels watch over you."
            , "In this world, where everything seems uncertain, only one thing is definite.\n" +
            "You'll always be my friend, beyond words, beyond time and beyond distance!"
            , "A FrIeNd OpEnS a CoNvErSaTiOn WiTh A fUlL nEwZ bUlLeTiN oN hIs LiFe …\n" +
            "BuT\n" +
            "A rEaL fRiEnD sAyZ:\n" +
            "“wHaT’s NeW wItH yOu ?” (:\n" +
            "EnJoY fRiEnDs On ThIs SpEcIaL dAy"
            , "A rupee is easy to earn;\n" +
            "But a friend is hard to find.\n" +
            "A rupee loses its value;\n" +
            "But a friend increases its worth.\n" +
            "It cost me to send you a message;\n" +
            "But I don't care since I got a friend like You!"
            , "We met, it was Luck.\n" +
            "We talked, it was Chance.\n" +
            "We became friends, it was Destiny\n" +
            "We are still friends, it is Faith.\n" +
            "We will always be friends, it's a PROMISE!"
            , "A true friend knows your weaknesses but shows you your strengths!"
            , "My heart is like an open BOOK\n" +
            "It depends on how you read ME\n" +
            "Don't judge me by my COVER\n" +
            "Look inside and discover i will be ur true friend 4EVER"
            , "Friendship is about …\n" +
            "bringing out the positive when everything seems negative,\n" +
            "being accepted for who you are,\n" +
            "being able to pick up right where you left off,\n" +
            "sharing, talking, and laughing.\n" +
            "Friendship is about us, and for that I’m grateful.\n" +
            "And I hope you have the best birthday ever, friend!"
            , "// T o D a Y z\n" +
            "T h O u G h T //\n" +
            "” If We ArE tO jUdGe oF lOvE\n" +
            "bY iTs CoNsEqUeNcEs,\n" +
            "It MoRe NeArLy ReSeMbLeS\n" +
            "HATRED\n" +
            "Than\n" +
            "FRIENDSHIP …”"
            , "“Every One In This\n" +
            "Beautiful World Has\n" +
            "An Individual Name.\n" +
            "” But, V All Together Have A\n" +
            "Common Name\n" +
            "Called\n" +
            "“F R I E N D S”\n" +
            "In Our Beautiful Hearts."
            , "Never Try Alone To Take The Weight Of Tear That Comes Out Of Ur Heart and Falls Through Ur Eyes\n" +
            "ALWAYS REMEMBER\n" +
            "A\n" +
            "FRIEND\n" +
            "IS\n" +
            "HERE\n" +
            "TO\n" +
            "SHaRE … !"
            , "Mising u,\n" +
            "is my ?HOBBY?\n" +
            "Care 4u,\n" +
            "is my ?JOB?\n" +
            "Make u happy,\n" +
            "is my?DREAM?\n" +
            "Pray 4 u,\n" +
            "is my ?DUTY?\n" +
            "AND\n" +
            "2keep frndship with u,\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Is my ?LIFE."
            , "Sometimes in life we think we do not need anyone.\n" +
            "And sometimes we do not have anyone when we need someone.\n" +
            "So do not let your best friends go away ever!"
            , "Strangers think I'm quiet,\n" +
            "My friends think I'm out-going,\n" +
            "My best-friends know that i'm completely insane!"
            , "A sincere FRIEND is an extension of my ownself\n" +
            "Without whom I m incomplete..\n" +
            "So,\n" +
            "Take Gud care of yourself..\n" +
            "B’coz I don't want to lose a part of myself"
            , "My heart's like an open book;\n" +
            "It depends on how you read me.\n" +
            "Don't judge me by my cover;\n" +
            "Look in and discover.\n" +
            "I will be your true friend for ever!"
            , "W h E r E v E r\n" +
            "Y o U\n" +
            "a R e ,\n" +
            "I t\n" +
            "I s\n" +
            "Y o U r\n" +
            "F r I e N d S\n" +
            "W h O\n" +
            "m A k E\n" +
            "y O u R\n" +
            "w O r L d …"
            , "Friend: someone who tells you things while you are alive, things that others tell after you die."
            , "Thank you for touching my life in ways you may never know. My riches do not lie in material wealth but in having friends like you – a precious gift from God"
            , "Frnz R D Smell Of Cigrates\n" +
            "Whch Stays In D\n" +
            "Finger Tips 4 A Short Time\n" +
            "Bt True Frnz R Lik D\n" +
            "Nicotine In D Cigrates\n" +
            "Which Stay In D Heart Til Death"
            , "Flowerz Of Friendship\n" +
            "Never Gives Up,\n" +
            "Its A Promise Made Forever.\n" +
            "It Brings Happiness To\n" +
            "The Heart and Mind\n" +
            "And\n" +
            "Makes Every\n" +
            "Dream Come Alive …"
            , "Life is not easy and it will never be, but you’ve got friends and one of them is me."
            , "Friendship is a network that needs:\n" +
            "No recharge\n" +
            "No charging\n" +
            "No roaming\n" +
            "No validity\n" +
            "No activation\n" +
            "No signal problems\n" +
            "Just don't switch off your Heart!"
            , "Tears of eyes are valuable;\n" +
            "Speech of lips is powerful;\n" +
            "Heart with love is beautiful,\n" +
            "But Life with FRIENDS is the most wonderful!"
            , "Friendship is about …\n" +
            "bringing out the positive when everything seems negative,\n" +
            "being accepted for who you are,\n" +
            "being able to pick up right where you left off,\n" +
            "sharing, talking, and laughing.\n" +
            "Friendship is about us, and for that I’m grateful.\n" +
            "And I hope you have the best birthday ever, friend!"
            , "1 Stone is enough 2 break a glass,\n" +
            "1 sentence is enough 2 break a heart,\n" +
            "1 word is enough to fall in love and\n" +
            "1 friend is enough to live in this world."
            , "Age appears2 b best in some things.\n" +
            "Old wood best 2 burn.\n" +
            "Old books best 2 read.\n" +
            "Old rice best 2 eat &\n" +
            "Old friends best 2 keep."
            , "It takes half our life to find true friends and half of it keeping them. I am lucky to have spent less than half my life finding you and wish to spend the rest keeping you."
            , "Road has speed limit;\n" +
            "Bank has money limit;\n" +
            "Exam has time limit;\n" +
            "Life has age limit;\n" +
            "But friendship has no limit!"
            , "Why Do I Always Forgive You?\n" +
            "I Let You Call Me So Many Names,\n" +
            "I Let You Treat Me Like Dirt,\n" +
            "Yet I’m Still Your Friend.\n" +
            "Am I Stupid?\n" +
            "Or Am I A\n" +
            "Good Friend?"
            , "You insult me? I can handle it.\n" +
            "But if u insult my best friend? You die\n" +
            "No one can insults my friend more than me."
            , "Friendship is not something you learn in school.\n" +
            "But if you have not learned the meaning of friendship,\n" +
            "you really haven't learned anything."
            , "They are not your friends\n" +
            "until they defend you in\n" +
            "your absence."
            , "Good times\n" +
            "+\n" +
            "Crazy friends\n" +
            "=\n" +
            "Amazing memories"
            , "Lines 4 my cute frnd\n" +
            "I'm not a perfct pencil \n" +
            "To write ur happiness\n" +
            "But I will be a nice \n" +
            "rubber To erase all ur sadness"
            , "To live a life i need heartbeat, 2 have heartbeat i need a heart, 2 have heart i need happiness, to have happiness i need a friend, and 4 a friend i need U.ALWAYS"
            , "People live People die\n" +
            "People Laugh People Cry\n" +
            "Some give up Some will try\n" +
            "Some say hi Some say bye\n" +
            "Others may forget you but never will I."
            , "Birth is from Mother,\n" +
            "Advice is from Father;\n" +
            "Knowledge is from Teacher,\n" +
            "Life is from Life Partner;\n" +
            "But joy, fun, jokes and lifelong smiles are only from Friends!"
            , "I Miss my friends…\n" +
            "\n" +
            "When I see some other gang sitting around, Caring, Slapping each other…\n" +
            "Their mischievous smiles switching to loud laughter…\n" +
            "Though strangers to me, they represent a part of my life I lost somewhere…\n" +
            "I miss my friends, I miss you all…"
            , "If you're angry with your friend, just put aside your ego. Hug your friend and say - I need you idiot... at least to fight with me!"
            , "Life can give us a number of beautiful friends... but only true friends can give you a beautiful life!"
            , "As a Friend:\n" +
            "I asked you for a leaf, you gave me a flower;\n" +
            "I asked you for a stone, you gave me a statue;\n" +
            "I asked your a hanky to wipe my tears but you gave your hand.\n" +
            "Are you really...\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "DEAF!"
            , "I am the kind of friend who will help you hide a dead body;\n" +
            "But if you betray me - just remember, I know how to hide a dead body!"
            , "Frnz R D Smell Of Cigrates\n" +
            "Whch Stays In D\n" +
            "Finger Tips 4 A Short Time\n" +
            "Bt True Frnz R Lik D\n" +
            "Nicotine In D Cigrates\n" +
            "Which Stay In D Heart Til Death.."
            , "A single candle can illuminate an entire room.\n" +
            "A true friend dazzles up an entire lifetime.\n" +
            "Thanks for gifting me the bright lights of your friendship.\n" +
            "Thank you very much!"
            , "Sugar melts in water.\n" +
            "So please don't walk in the rain... otherwise I may lose a sweet friend like you!"
            , "Have a heart that never hardens;\n" +
            "Have a smile that never fades;\n" +
            "Have a touch that never burnt;\n" +
            "And have friendship that never breaks!"
            , "Friendship is not about finding the right person but creating the right relation.\n" +
            "It's not how much we care in the beginning but how much we care till the end!"
            , "Real friends are like Zero.\n" +
            "When you add, they are same.\n" +
            "When you subtract, they are same.\n" +
            "When you multiply, they are same.\n" +
            "When you try to divide, they become infinite!"
            , "With passing years, friends naturally get scatter;\n" +
            "But when hearts are close, distance does not matter.\n" +
            "Thanks for always being there!"
            , "A smile makes us look younger;\n" +
            "While prayers make us feel stronger;\n" +
            "And friends they make us enjoy life forever.\n" +
            "Thank you for being my friend!"
            , "You are simply an animal!\n" +
            "Cute like a Dolphin\n" +
            "Sweet like a Panda\n" +
            "Majestic like a Lion\n" +
            "Faithful like a Dog\n" +
            "Smart like a Monkey\n" +
            "And hard-working like a Donkey\n" +
            "No doubt you are my good friend!"
            , "A lover will usually tell you that I will be with you in all you are troubles.\n" +
            "A true friend forever will say that you will never have troubles when I'm with you !"
            , "If you are a chocolate you are the sweetest,\n" +
            "If you are a Teddy Bear you are the most hug-gable,\n" +
            "If you are a Star you are the Brightest,\n" +
            "And since you are my \"FRIEND\" you are the \"BEST\"!"
            , "The greatest gift of life is friendship, and I have received it."
            , "Boys use the word friendship to start love;\n" +
            "But girls use the word friendship to end love!"
            , "One of the most beautiful qualities of true friendship is to understand and to be understood."
            , "Words begin with ABC.\n" +
            "Numbers begin with 123.\n" +
            "Music begins with Do, Re, Mi.\n" +
            "And friendship begins with you and me!"
            , "True friendship is a gift that is given without the expectation of anything in return.\n" +
            "Friendship in itself is a reward!"
            , "A ring is round\n" +
            "and has no end\n" +
            "and thats how long\n" +
            "i will be your friend"
            , "Relationships and Friendships are not exams... so why cheat!!"
            , "Making friends for the complete life is not important.\n" +
            "But having a friend who fills up the incompleteness in your life is the most Important!"
    };


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
                .setCategory("Friendship Messages")
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
                .setCategory("Friendship Messages")
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
                .setCategory("Friendship Messages")
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
                .setCategory("Friendship Messages")
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
                .setCategory("Friendship Messages")
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