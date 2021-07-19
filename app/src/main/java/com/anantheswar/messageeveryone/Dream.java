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
public class Dream extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dream);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Dream Messages");

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
        TextView text101 = (TextView) findViewById(R.id.textView101);
        text101.setText("101. "+messages[100]);
        TextView text102 = (TextView) findViewById(R.id.textView102);
        text102.setText("102. "+messages[101]);
        TextView text103 = (TextView) findViewById(R.id.textView103);
        text103.setText("103. "+messages[102]);
        TextView text104 = (TextView) findViewById(R.id.textView104);
        text104.setText("104. "+messages[103]);
        TextView text105 = (TextView) findViewById(R.id.textView105);
        text105.setText("105. "+messages[104]);
    }

    /*http://www.txt2nite.com/message/love-sms/dreams
    Latest new 1-75
     */
    public static String[] messages = {"Since ur eyes are\n" +
            "looking tired? Let ur\n" +
            "eye lashes hug each\n" +
            "other for few hours.\n" +
            "Happy journey into the\n" +
            "world of dreams, Good night"
            , "Once Upon A Time,\n" +
            "It Happened 2 Me\n" +
            "The Sweetest Thing\n" +
            "That Cud Ever B\n" +
            "It Was A Fantasy\n" +
            "A Dream Come True\n" +
            "It Was d Day\n" +
            "I Came To Know\n" +
            "Some1 Like ?YOU? .\n" +
            "sweet Dreams????"
            , "LyinG oN mY BeD,\n" +
            "LoOkiNg @ ThE CloCk,\n" +
            "I nOe tAt iTs TimE 2 zZz.\n" +
            "I WonDeR HoW hAv U bEEn todaY?\n" +
            "HopE Tat EvErYTHinG is FInE..\n" +
            "WiSh u SwEeT dReaMz n SleEp TiGhT!"
            , "Even though it might seem easy to interpret ur friend's dream\n" +
            "when it comes to self interpretation the task is daunting."
            , "Darkness is everywhere,\n" +
            "The Birds r back 2 ?HOMES?\n" +
            "Roads r ?QUITE?\n" +
            "Everybody\n" +
            "SLEEPING?but I'm not\n" +
            "U know y? Just want say 2 U?\n" +
            "Sweet Dreams?"
            , "We All Have Our Time Machines ?\n" +
            "Some Take Us Back, They Are Called Memories?\n" +
            "Some Take Us Forward, They Are Called Dreams..\n" +
            "So Sleep Well and have Sweet Dreams."
            , "Dreams are lke\n" +
            "stars...you\n" +
            "may never\n" +
            "touch them,\n" +
            "but if you follow\n" +
            "them they will\n" +
            "lead you to your\n" +
            "DESTINY."
            , "Dear God, I've Tried My\n" +
            "Best But If Today I Lose\n" +
            "My Hope. Please Remind\n" +
            "Me That Your Plans Are\n" +
            "Better Than My Dreams.."
            , "In My Dreams U Give Me Ur Heart,\n" +
            "In My Dreams We Were Never Apart..\n" +
            "In My Dreams U Kept Me Close,\n" +
            "In My Dreams U Loved Me The Most..\n" +
            "In My Dreams We're Always Together,\n" +
            "Might As Well Be Dreaming Forever..!\n" +
            "Good Night."
            , "Without a dream there is no reason to work............\n" +
            "&\n" +
            "without work there is no reason to dream."
            , "Dreams Give Support To Hope.\n" +
            "Hope Inspires Efforts.\n" +
            "Effort Results In Success.\n" +
            "So Dreams R Root Of Success.\n" +
            "May All Ur Dreams Come True."
            , "When You Find A Dream Inside Your Heart\n" +
            "don't Ever Let It Go?.\n" +
            "For Dreams Are The Tiny Seeds\n" +
            "From Which Beautiful Tomorrows Grow\n" +
            "God Bless You"
            , "I had a dream and it was about you ... \n" +
            "I smiled and recalled the memories we had ... \n" +
            "then I noticed a tear fell from my eyes ... \n" +
            "you know why? \n" +
            "\n" +
            "bcoz in my dream you kissed me and said goodbye ...:(:("
            , "When we are dreaming alone \n" +
            "it is just a dream. \n" +
            "But When we are dreaming with other people,\n" +
            "it is the beginning of the reality."
            , "don't keep your\n" +
            "dreams in your eyes,\n" +
            "they may fall as tears.\n" +
            "Keep them in your\n" +
            "heart so that\n" +
            "every heartbeat\n" +
            "may remind YOU\n" +
            "about YOUR dream."
            , "I have seen you million times in dreams\n" +
            "\n" +
            "Every time I fall in love with you\n" +
            "\n" +
            "When you come closer to me,\n" +
            "\n" +
            "When you hug me,\n" +
            "\n" +
            "When you touch me,\n" +
            "\n" +
            "When you kiss me,\n" +
            "\n" +
            "My heart melts\n" +
            "\n" +
            "And my love for you\n" +
            "\n" +
            "Become stronger\n" +
            "\n" +
            "that never ends."
            , "Heart Touching Lines By\n" +
            "A True Lover 2 His Love\n" +
            "In My Dream U R Mine.\n" +
            "But In My Life U R My Dream!!?"
            , "Whenever you have a\n" +
            "DREAM inside your HEART,\n" +
            "Never let it go coz\n" +
            "DREAMS are the TINY SEEDS,\n" +
            "From which BEAUTIFUL\n" +
            "TOMORROW GROWS\n" +
            "Have a wonderful dream tonight..."
            , "You are never too old\n" +
            "to set another\n" +
            "goal or to dream a new dream."
            , "Dream\n" +
            "&\n" +
            "Aim both r sensational words.\n" +
            "Make Dreams as Aim, But don't make Aim as Dream.\n" +
            "keep going still Ur Dream cums in Ur way"
            , "Black Sky With\n" +
            "Solo Moon With\n" +
            "Millions Of Stars\n" +
            "Brings U A\n" +
            "Silent Hours\n" +
            "to take A Nice Rest..\n" +
            "Enjoy D Whole Night..\n" +
            "Good Night\n" +
            "Sweet Dreams"
            , "Dream a dream tonight as u sleep.smile a smile tomorrow that u may keep.may all of Ur dreams and wishes come true cause i could not find a better friend like u! ?"
            , "U live in ur dreams but dreams may die. don't get shattered,never ever cry. The world is big & has lots to give Pick up a new dream coz that's the way to live."
            , "Art of living:\n" +
            "First of all,don't make friends.\n" +
            "if made,don't go close to them.\n" +
            "if gone,don't like them.\n" +
            "if liked,then plz.. don't leave them.\n" +
            "Good Night, sweet dreams?"
            , "Whenever U Have A Dream Inside Ur Heart,\n" +
            "Never Let It Go\n" +
            "Coz, Dreams Are The Tiny Seeds From Which\n" +
            "Beautiful Tomorrow Grows."
            , "Somewhere, Some1 Dreams Of Ur Smile & Finds Ur Presence In Life So\n" +
            "WorthWhile.So When ur Lonely,Remembr Its True dat Some1, SomeWhere,Is\n" +
            "Thinkin Of U"
            , "Dream a dream 2nite as u sleep.smile a smile 2morrow that u may keep.may\n" +
            "all of ur dreams and wishes come true cause i could`nt find a better friend like u!"
            , "Y do we close our eyes wen we sleep- wen we dream, wen we kiss?dis is\n" +
            "becoz the most precious thing in the world is unseen.Wen i close my eyes i c u!"
            , "If dreams werent dreams & dreams came true i woodnt b here id b wiv\n" +
            "u.Distance is 1 thing dat keeps us apart.But ull always remain in my heart!"
            , "Ur only mine wen i dream.wen i wake i wanna scream.ur not mine im all alone.i can only text u on my fone.do dreams lie or r dey true-i hope so cos babes i want u!"
            , "Dream is the key towards successful life\n" +
            "To have dreams, you must sleep well.\n" +
            "So step up the first ladder of your destiny.\n" +
            "Go to bed and have sweet dreams"
            , "Touch Ur Heart\n" +
            "Close Ur Eyes\n" +
            "Make A Wish\n" +
            "Say Gud Nite\n" +
            "Sky So Wide\n" +
            "STARS So Bright\n" +
            "OFF The Light\n" +
            "Sleep Quite Quite\n" +
            "? (- ,-)?\n" +
            "zzZzZzZzZ\n" +
            "Sweet Dream."
            , "Let the most beautiful dream come to u tonight,\n" +
            "Let the sweetest person come in ur dream tonight?. But don't make it a habit because I m not free every night. Sweet Dreams."
            , "I saw a Beautiful dream Last night\n" +
            "There were U&me only,\n" +
            "U know what Happens?\n" +
            "U was looking so innocent B?coz\n" +
            "I was eating Ice cream &U was Looking at me."
            , " Stars light Stars bright\n" +
            "you are the only Star I see tonight.\n" +
            "I wish I might be there guarding ur dreams tonight,\n" +
            "Sweet dreams."
            , "If you can dream with your eyes open, \n" +
            "you have 100% chance 2 live your dream, \n" +
            "but if you dream while sleeping you can only write incomplete and spiced movies and stories.\n" +
            "Have a Sweet Dreams?"
            , "Why do we close our eyes\n" +
            "when v pray\n" +
            "when v cry\n" +
            "when v dream\n" +
            "when v miss some one\n" +
            "b?coz\n" +
            "most beautiful things in life are unseen they are only felt by heart"
            , "SoMe Of ThE GrEaTeR ThInGs\n" +
            "In LiFe\n" +
            "ArE uNsEeN ?\n" +
            "ThAt?S wHy !\n" +
            "wE cLosE oUr EyEs\n" +
            "WheN wE\n" +
            "kIsS\n" +
            "CrY\n" +
            "Or\n" +
            "DrEam ? =)"
            , "Dreams R only Thoughts?\n" +
            "U didn't have Time To Think\n" +
            "About during The Day.Sweet Dreams."
            , "Dreams Give Rise To Hope.\n" +
            "Hope Inspires Efforts.\n" +
            "Efforts Result In Success.\n" +
            "So Dreams Are The Roots Of Success!!!\n" +
            "So let the dreams to come?"
            , "Dream of Star,Dream of Palace\n" +
            "Dream Of Person,\n" +
            "Dream of A Face,\n" +
            "Dream of Sea,\n" +
            "but When U Dream of Friend\n" +
            "Dream Of Me only ..\n" +
            "Sweet Dreams??.."
            , "Though I know he loves me,\n" +
            "Tonight my heart is sad;\n" +
            "His kiss was not so wonderful As all the dreams I had."
            , "If you don't have a dream,\n" +
            "How are you going to make\n" +
            "A dream come true?"
            , "The liberals have not softened their\n" +
            "view of actuality to make themselves\n" +
            "live closer to the dream,\n" +
            "But instead sharpen their perceptions\n" +
            "and fight to make the dream actuality\n" +
            "or give up the battle in despair."
            , "Dare to live the life \n" +
            "you have dreamed \n" +
            "for yourself.\n" +
            "Go forward \n" +
            "and make \n" +
            "your dreams come true."
            , "If a little dreaming is dangerous,\n" +
            "The cure for it is not to dream less but to\n" +
            "Dream more, to dream all the time. -"
            , "Self-esteem must be earned !\n" +
            "When you dare to dream,\n" +
            "Dare to follow that dream,\n" +
            "Dare to suffer through the pain,\n" +
            "Sacrifice, self-doubts, and friction from the world,\n" +
            "You will genuinely impress yourself."
            , "Take this kiss upon the brow!\n" +
            "And,in parting from you now,\n" +
            "Thus much let me avow--\n" +
            "You are not wrong who deem\n" +
            "That my days have been a dream;\n" +
            "Yet if hope has flown away\n" +
            "In a night, or in a day,\n" +
            "In a vision, or in none,\n" +
            "Is it therefore the less gone?\n" +
            "All that we see or seem\n" +
            "Is but a dream within a dream.\""
            , "Everyone thinks I like to sleep.\n" +
            "It's not that I like to sleep,\n" +
            "It's that I don't like to get up!\n" +
            "There's a difference."
            , "We all dream; we do not understand our\n" +
            "Dreams, yet we act as if nothing strange\n" +
            "Goes on in our sleep minds, strange at\n" +
            "Least by comparison with the logical,\n" +
            "Purposeful doings of our minds\n" +
            "When we are awake."
            , "The dream is the small hidden door in the\n" +
            "Deepest and most intimate sanctum\n" +
            "Of the soul, which opens into that\n" +
            "Primeval cosmic night that was soul\n" +
            "Long before there was a conscious\n" +
            "Ego and will be soul far beyond\n" +
            "What a conscious ego could ever reach."
            , "I have heard it said that the first ingredient of\n" +
            "Success -- the earliest spark in the dreaming\n" +
            "Youth -- if this; dream a great dream"
            , "The space between our fingers were created\n" +
            "so that another person's fingers could fill them in.\n" +
            "Hope You'll find your dreams hand to hold you forever."
            , "Do not store dreams in your eyes\n" +
            "\n" +
            "they may roll down with tears\n" +
            "\n" +
            "Store them in your heart\n" +
            "\n" +
            "each heart beat will inspire you to fulfill them"
            , "Dreams Are The Best Part\n" +
            "Of Life.. If U Miss Sleep,\n" +
            "U Miss The Best Part Of Life..\n" +
            "So Its Already Late, Go\n" +
            "To Bed And Catch A Very\n" +
            "Good Dream..!"
            , "If I could reach the stars,\n" +
            "Pull one down for you,\n" +
            "Shine it on my heart,\n" +
            "So you could see the truth,\n" +
            "Then this love I have inside\n" +
            "is everything it seems,\n" +
            "but for now I find it's only in my dreams."
            , "I've come to believe that each of us has\n" +
            "a personal calling that's as unique as a fingerprint\n" +
            "and that the best way to succeed is to discover\n" +
            "what you love and then find a way to offer it to\n" +
            "others in the form of service,\n" +
            "Working hard, and also allowing the energy\n" +
            "of the universe to lead you."
            , "If one advances confidently in the direction\n" +
            "of their dreams,And endeavors to lead a life\n" +
            "which they have imagined,\n" +
            "They will meet with a success unexpected in common hours."
            , "I can't escape the thought of you.\n" +
            "Even in my dreams you r there.\n" +
            "It's not fair how your gone,\n" +
            "n hw U're moving on so fast,\n" +
            "While I am still living in d past."
            , "Say nighty night and kiss me,\n" +
            "Just hold me close and tell me you'll miss me.\n" +
            "When I'm all alone and blue as can be,\n" +
            "Dream a little dream of me."
            , "I may never get to hold you so tight,\n" +
            "I may never get to kiss you goodnight,\n" +
            "I may never look deep in your eyes or so it seems,\n" +
            "But, Baby, a girl can dream."
            , "A dream is your creative vision for your life in the future.\n" +
            "You must break out of your current comfort zone and become\n" +
            "Comfortable with the unfamiliar and the unknown.\n" +
            "- K Denis Waitley"
            , "Dreams are nature's answering service\n" +
            "Don't forget to pick up your\n" +
            "messages once in a while."
            , "You are never given a dream without also being\n" +
            "Given the power to make it true.\n" +
            "You may have to work for it, however."
            , "One can write, \n" +
            "think and pray exclusively of others;\n" +
            "dreams are all egocentric.\n"
            , "The dream begins with a teacher who believes in you,\n" +
            "Who tugs and pushes and leads you to the next plateau,\n" +
            "sometimes poking you with a sharp stick called \"truth\"."
            , "There's always going to be people that hurt you\n" +
            "So what you have to do is keep on trusting and\n" +
            "just be more careful about who you trust next time around."
            , "Anyone can escape into sleep,\n" +
            "we Are all geniuses when we dream,\n" +
            "The butcher's the poet's equal there.\n"
            , "Pay attention to your dreams -\n" +
            "\n" +
            "God's angels often speak directly \n" +
            "to our hearts \n" +
            "when we are asleep."
            , "The tragedy of life doesn't lie in not reaching your goal.\n" +
            "The tragedy lies in having no goal to reach.\n" +
            "It isn't a calamity to die with dreams unfilled,\n" +
            "But it is a calamity not to dream.\n" +
            "It is not disgrace to reach the stars,But it is a disgrace to !!"
            , "Dream what you want to dream,\n" +
            "Go where you want 2 go,\n" +
            "Be what you want 2 be.\n" +
            "Because you have one life nd\n" +
            "once chance 2 do all the things that you want in life."
            , "If u can dream with ur eyes open,\n" +
            "U have 100% chance 2 live ur dream,\n" +
            "But if u dream while sleeping u can only\n" +
            "write incomplete nd spiced movies and stories..!!"
            , "Every time history repeats itself,\n" +
            "The price goes up.\n" +
            "I have heard it said that the first\n" +
            "ingredient of success the earliest\n" +
            "spark in the dreaming youth..\n" +
            "is this: dream a great dream."
            , "Dreaming is an act of pure imagination,\n" +
            "Attesting in all men a creative power,\n" +
            "Which if it were available in waking,\n" +
            "Would make evry man a Dante or \n" +
            "\n" +
            "   -Shakespeare-"
            , "Dreams surely are difficult, confusing,\n" +
            "And not everything in them is brought to pass for mankind.\n" +
            "For fleeting dreams have two gates:\n" +
            "One is fashioned of horn and one of ivory.\n" +
            "Those which pass through the one of sawn ivory are deceptive,\n" +
            "Bringing tidings which come to nought,\n" +
            "But those which issue from the one of polished horn bring true results\n" +
            "When a mortal sees them."
            , "No one daydreams of being a failure but\n" +
            "for those who only dream of success,\n" +
            "And never wake up to do anything about it,\n" +
            "Failure quickly becomes their reality."
            , "Dreams are excursions into\n" +
            "the limbo of things,\n" +
            "A semi-deliverance from the human prison."
            , "U live in ur dreamz but dreamz may die\n" +
            "Don't get shattered, Never ever cry\n" +
            "The world is big nd has lotz to give\n" +
            "Pick up a new dream coz thatz the way to live !!"
            , "That which the dream shows is the shadow of\n" +
            "such wisdom as exists in man,\n" +
            "Even if during his waking state he may know nothing about it..\n" +
            "We do not know it because we are fooling away\n" +
            "our time with outward and perishing things,\n" +
            "And are asleep in regard to that which is real within ourself."
            , "The dream was always running ahead of me.\n" +
            "To catch up, to live for a moment in unison with it,\n" +
            "That was the miracle."
            , "The greatest human pain comes from not\n" +
            "believing there is a future,\n" +
            "Not being able to dream about something better."
            , "Dreaming permits each and\n" +
            "every one of us to be quietly and\n" +
            "safely insane every night of our lives"
            , "True love is when the reality of everyday\n" +
            "life seems like a dream,\n" +
            "And every wonderful dream each night is fulfilled in real life."
            , "I have always been amazed at\n" +
            "the way an ordinary observer lends\n" +
            "so much more credence and attaches\n" +
            "so much more importance to waking\n" +
            "events than to those occurring in dreams..\n" +
            "Man..Is above all the plaything of his memory."
            , "Channels are blocked in the mind,\n" +
            "From the day.\n" +
            "Lie down in blackness of night,\n" +
            "Forgotten remnants rush to the mind,\n" +
            "or creeping slowly appear in the dreams."
            , "If growing up is the process of creating\n" +
            "ideas and dreams about what life should be,\n" +
            "Then maturity is letting go again."
            , " The key to realizing a dream is to focus\n" +
            "not on success but significance -\n" +
            "And then even the small steps and little\n" +
            "victories along your path will take on greater meaning."
            , "A famous writer said\n" +
            "Love is like a long sweet dream\n" +
            "N Marriage is an alarm clock\"\n" +
            "So have sweet dreams till ur alarm wakes U up\n" +
            "\n" +
            "Happy Unmarried Life"
            , "Dreams pass into the reality of action.\n" +
            "From the actions stems the dream again;\n" +
            "And this interdependence produces\n" +
            "the highest form of living"
            , "You were just a dream that I once knew;\n" +
            "I never thought i would be right for you.\n" +
            "I just can't compare you with anything in this world;\n" +
            "you're all I need to be here and forevermore."
            , "Master of puppets is pulling ur strings,\n" +
            "Twisting ur mind n smashing ur dreams.\n" +
            "Blinded by me,\n" +
            "U can't c a thing when i count to 3 u\n" +
            "shall fall asleep 1,2,3,Zzz"
            , "Never laugh at anyone's dreams.\n" +
            "People who don't have dreams \n" +
            "don't have much."
            , "I know you;\n" +
            "I walked with you once upon a dream.\n" +
            "Dreams are which the mind conceives,\n" +
            "The heart desires, and the soul believes."
            , "Dreams are a division between fantasy\n" +
            "and reality but when you find the right one,\n" +
            "Dreams will become your own reality."
            , "Dreams come true;\n" +
            "without that possibility,\n" +
            "Nature would not incite us to have them."
            , "If we hope for what we are not likely to possess,\n" +
            "We act and think in vain,And make life a greater\n" +
            "dream and shadow than it really is."
            , "A man to carry on a successful business\n" +
            "must have imagination.\n" +
            "He must see things as in a vision,\n" +
            "A dream of the whole thing.\n"
            , "Somewhere there's someone who dreams of your smile,\n" +
            "And finds in your presence that life is worthwhile.\n" +
            "So, When you are lonely remember it's true: somebody,\n" +
            "somewhere is thinking of you."
            , "I'll do my dreaming \n" +
            "with my eyes \n" +
            "wide open,\n" +
            "And i'll do my looking back \n" +
            "with my eyes \n" +
            "closed."
            , "I once had dream that you where\n" +
            "here with me standing by my side\n" +
            "saying those three words that meant\n" +
            "everything to me.\n" +
            "I know that dream will come true,\n" +
            "And until that day I am waiting here for you."
            , "Only as high as I reach can\n" +
            "I grow Only as far as I seek can I go,\n" +
            "Only as deep as I look can I see,\n" +
            "Only as much as I dream can I be."
            , "Where you are is where I want to be.\n" +
            "Through your eyes are all the things\n" +
            "I want to see.\n" +
            "In the night, You are my dream, And you're everything to me."
            , "DREAMS visit us when we are asleep\n" +
            "But GOD is truly wise....\n" +
            "He wakes us up each day and\n" +
            "Gives us every chance to make\n" +
            "our DREAMS come true!"
            , "Whatever you can do or dream \n" +
            "you can, \n" +
            "begin it.\n" +
            "Boldness has genius, power, \n" +
            "and \n" +
            "magic in it."
            , "If dreams werent dreams n\n" +
            "dreams came true i woodnt\n" +
            "b here id b wiv u.Distance is\n" +
            "1 thing dat keeps us apart.\n" +
            "But ull alwaz remain in my heart!\n" +
            "Happy Dreams Day"};



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
                .setCategory("Dream Messages")
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
    public void copy101(View view) {
        String a = messages[100];
        copyToClipboard(a);
    }
    public void copy102(View view) {
        String a = messages[101];
        copyToClipboard(a);
    }
    public void copy103(View view) {
        String a = messages[102];
        copyToClipboard(a);
    }
    public void copy104(View view) {
        String a = messages[103];
        copyToClipboard(a);
    }
    public void copy105(View view) {
        String a = messages[104];
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
                .setCategory("Dream Messages")
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
    public void share101(View view) {
        String a = messages[100];
        shareIntent(a);
    }

    public void share102(View view) {
        String a = messages[101];
        shareIntent(a);
    }

    public void share103(View view) {
        String a = messages[102];
        shareIntent(a);
    }

    public void share104(View view) {
        String a = messages[103];
        shareIntent(a);
    }

    public void share105(View view) {
        String a = messages[104];
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
                .setCategory("Dream Messages")
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
                .setCategory("Dream Messages")
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
                .setCategory("Dream Messages")
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