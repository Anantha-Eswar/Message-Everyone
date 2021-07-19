package com.anantheswar.messageeveryone;

/**
 * Created by Anantha Eswar on 9/25/2015.
 */

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

public class ValentineDay extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valentine_day);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Valentine's Day Messages");

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

    /* http://www.greetings.prokerala.com/sms/valentine-sms-messages/page-2.html
    Latest New messages
    */
    public static String[] messages = {"I used to think that my life was perfect until I met you. You showed me all that was missing without a wonderful woman in my life. Happy Valentine’s Day and I’ll love you always."
            , "On this Valentine’s Day, I give you the key to my heart. You’re the most beautiful and amazing woman I have ever met, and I would love for you to be my Valentine."
            , "I can only hope that I make you as half as happy as you make me. My love for you is infinite. Happy Valentine’s day to the most wonderful woman I’ve ever met."
            , "The love of a wonderful woman like you has made me the richest man in the world. You are greatly treasured and I love you! Happy Valentine’s Day."
            , " I was always too macho and proud to admit that I too needed a sweet lady like you by my side. I honestly thank God every day that I found you! Happy Valentine’s Day to my beautiful angel!"
            , "Happy Valentine’s day to the most beautiful woman in my life. May you always know how important you are to me. My life would be nothing without you to share it with."
            , " I’m so blessed that God has sent my very own angel from Heaven. In my eyes, you’re perfect and I love you so. Happy Valentine’s Day to my beautiful sweetheart."
            , "My buddies were right. They used to say that one day I would find a woman who would make an honest man out me and would straighten me up! I love you and I’ll always be thankful for having such an amazing woman by my side. Happy Valentine’s Day!"
            , "This Valentine’s Day, I want to tell you how much I admire and appreciate you. I’m thankful for all of that you do to make our home a happy one. I love you."
            , "My Sweet Valentine, I promise to behave like a perfect gentleman this year and make sure to give you all you want on this special day, including putting my own laundry away, turning the video-games off and to not even mention the word “football”. Today it’s all about us and our love for each other. I love you! Happy Valentine’s Day to my beautiful Princess!"
            , "A lovely woman like you should be told how amazing she is every day of the year. Your all encompassing love completes me. I love you this Valentine’s Day and always!"
            , "I know that when you were little you used to dream of a handsome and brave prince who would make you happy and would protect you from all the bad things in life. Let me make that happen for you! Happy Valentine’s Day to a very special lady!"
            , "Before meeting you there were so many things that were not right in my life, including my horribly-decorated bachelor pad. Thank God you came into my life and saved me from a life of darkness, solitude and poor taste! Happy Valentine’s Day! I love you!"
            , " I am a successful man because I love an incredible woman who always believes in me. You bring out my best, and your love completes me. Happy Valentine’s Day!"
            , "Would you be surprised if I bought you red roses, champagne and chocolate? I know you wouldn’t, that’s why I have chosen completely different gifts this year! You may open them now! I love you and happy Valentine’s Day to the woman of my life!"
            , "All the roses and diamonds in the world would never be able to express just how much I love and appreciate you. However, I hope that this can be a start open the present! I love you! Happy Valentine’s Day to the woman of my life!"
            , "Chocolate candies and fresh flower bouquets are truly sweet and delightful. However, nothing is as sweet and delightful as you are. Happy Valentine’s Day!"
            , "Happy Valentine’s Day, you’re the most precious and beautiful woman in the world to me!"
            , "Our partnership is a match made in heaven, and I am thankful to have such an intelligent, kind, and attractive woman to share my life with. Happy Valentine’s Day!"
            , "With a woman like you in my life, I really am the luckiest man in the world. I hope you have a Valentine’s Day that is as amazing as you are."
            , "The first time I saw you, \n" +
            "my heart knew it was true! \n" +
            "I love you more than you think I do.\n" +
            "Happy Valentines Day!"
            , "Don't Make Me Your Last Choice,\n" +
            "Make Me Your Only Choice, \n" +
            "Don't Make This Our Last Valentine,\n" +
            "Make This A Begin Of 100 More Valentines. \n" +
            "Be With Me For Ever"
            , "If I get your smile, I don't need flowers.\n" +
            "If I get your voice, I don't need music.\n" +
            "If you speak to me, I don't need anybody.\n" +
            "If you are my love, I don't need the world.\n" +
            "Happy Valentine's Day!"
            , "I finally got my past, \n" +
            "present and future tenses correct today.\n" +
            "I loved you. I love you. \n" +
            "I will love you forever!\n" +
            "Happy Valentine's Day, \n" +
            "my Sweetheart!"
            , "Valentine's Day Special:\n" +
            "'I love you' is a mathematical function where,\n" +
            "'I love' - is constant and\n" +
            "'you' - is a variable!"
            , "I love you more today than yesterday \n" +
            "and I'll love you more tomorrow than today.\n" +
            "Please be my Valentine forever!"
            , "I've fallen in love with you \n" +
            "and I'll never let you go;\n" +
            "I love you more than anyone, \n" +
            "I just had to let you know.\n" +
            "And if you ever wonder why, \n" +
            "I don't know what I'll say;\n" +
            "But I'll never stop loving you, \n" +
            "today, tomorrow and every day.\n" +
            "Happy Valentine's Day!"
            , "You are the dream in my sleep;\n" +
            "You are the vision in my eye;\n" +
            "You are the smile on my lips;\n" +
            "You are the beat of my heart;\n" +
            "You are the Angel in my prayer;\n" +
            "And you are light of my life!\n" +
            "A very happy Valentine's Day!"
            , "Your Look Made My Hour, \n" +
            "Your Smile Made My Day, \n" +
            "Your Laugh Made My Month, \n" +
            "Your Touch Made My Year, \n" +
            "and Your Love Made My Life. \n" +
            "Happy Valentine's Day."
            , "Thank You For The Memories Of Yesterday, \n" +
            "For The Happiness Of Today, \n" +
            "And The Promise Of All Tomorrows! \n" +
            "I Love You."
            , "If You Were My Valentine \n" +
            "I Would Search The Endless Skies, \n" +
            "To Find The Perfect\n" +
            "Starlight That Would Compliment \n" +
            "Ur Eyes And Keep It In A Wishing Well \n" +
            "Created Just For You \n" +
            "& Filled With My Desires \n" +
            "To Make All Ur Dreams Come True."
            , "Valentines day is a day to celebrate love and express it in the most meaningful way possible.\n" +
            "I may have not been the best friend ever, \n" +
            "but the love I have for you is here to stay.\n" +
            "Happy Valentine's day."
            , "I would cross a thousand oceans just 2 hold u tight.\n" +
            "I would climb a thousand mountains just 2 be with u every single moment.\n" +
            "happy Valentines day"
            , "When things go wrong;\n" +
            "When sadness fills your heart;\n" +
            "When tears flow in your eyes;\n" +
            "Always remember 3 things:\n" +
            "1. I am with you\n" +
            "2. Still with you\n" +
            "3. Will always be\n" +
            "Happy Valentines Day, my Love!"
            , "Flirtation if for seconds;\n" +
            "Passion is for minutes;\n" +
            "Liking is for hours;\n" +
            "Longing is for days;\n" +
            "Missing is for weeks;\n" +
            "Infatuation is for months;\n" +
            "Remembrance is for years;\n" +
            "But Love is till eternity.\n" +
            "Love you my sweet Valentine!\n" +
            "Happy Valentine's Day!"
            , "Having You By My Side Has Made Me Realize \n" +
            "How Much It Means To Have You By My Side, \n" +
            "I Love You More Than Anything Else In The World Happy Valentines Day."
            , "Another Valentine's Day Is Here \n" +
            "To Remind You Of How Much Our Love Has Sustained, You Are The Reason\n" +
            "Why My Heart Sings And With You\n" +
            "By My Side I Know There Is Nothing\n" +
            "That I Cannot Achieve I Love You."
            , "Let Love Be The Guide To Ur Dreams\n" +
            "Let Love Be The Light To Ur Heart\n" +
            "Let Ur Love Be The Reason Why Someone\n" +
            "Else Heart Still Continues To Beat\n" +
            "Let Me Be Ur Valentine..\n" +
            "Happy Valentine's Day"
            , "I'm Enthralled By Ur Beauty\n" +
            "Mesmerized By Ur Charisma\n" +
            "And Spellbound By Ur Love\n" +
            "No Wonder I Am Always Thinking\n" +
            "About U I Wish To Celebrate Every Valentine With U..\n" +
            "Happy Valentine's Day"
            , "February is the month of:\n" +
            "Kisses and Surprises;\n" +
            "Proposals and Dates;\n" +
            "Chocolates and Flowers;\n" +
            "And Hugs and Valentines Day;\n" +
            "May you have a life full of love in the Valentine month!"
            , "White rose is for purity;\n" +
            "Orange is for desire;\n" +
            "Pink is for gratitude;\n" +
            "Peach is for appreciation;\n" +
            "And Yellow is for friendship.\n" +
            "But I chose Red rose for you \n" +
            "which symbolizes love.\n" +
            "Happy Valentines Day!"
            , "Valentines Day doesn't ask Who r u?\n" +
            "Valentines Day only says U r mine\n" +
            "Valentines Day doesn't ask Where do u live?\n" +
            "Valentines Day says U live in my heart\n" +
            "Valentines Day doesn't ask Do u love me?\n" +
            "Valentines Day only says I love u"
            , "You are my sun and stars, \n" +
            "my night, \n" +
            "my day,\n" +
            "My seasons, \n" +
            "summer, \n" +
            "winter, \n" +
            "my sweet spring,\n" +
            "My world, \n" +
            "my thoughts, \n" +
            "my breath, \n" +
            "my future\n" +
            "My all, \n" +
            "my love, \n" +
            "my Valentine"
            , "Even if sun refused to shine\n" +
            "even if romance ran out of rhyme\n" +
            "u would still have my heart \n" +
            "until the end of time\n" +
            "u r all, my love, my valentine.."
            , "Darling, \n" +
            "U Are The Most Astounding Part Of My Waking Up Each Morning, \n" +
            "I Love U With Each Beat Of My Heart, \n" +
            "I Love U With Every Breath I Take, \n" +
            "Thank U For Being Part Of My Life \n" +
            "Happy Chocolate Day."
            , "Love Is Like A Sweet Chocolate\n" +
            "It Leaves Sweeter Taste In Life\n" +
            "To Put A Sweet Bite For Next Time\n" +
            "And It Makes Our Mind And Heart Feel Sweet..\n" +
            "Happy Chocolate Day"
            , "There is never a time \n" +
            "or place for true love.\n" +
            "It happens accidentally, \n" +
            "in a heartbeat, \n" +
            "in a single flashing, \n" +
            "throbbing moment.\n" +
            "Happy valentine's Day!"
            , "Life Counts All the Roads We Travel \n" +
            "Some Are Smooth, \n" +
            "Some Are Rough\n" +
            "Some Would Rather Forget\n" +
            "But There?s One Road, \n" +
            "I Won't Regret.\n" +
            "The Road Where We Met and Became Friends\n" +
            "Happy valentine's day!!"
            , "Love deeply and passionately, \n" +
            "you might get hurt \n" +
            "but it's the only way to live life completely..\n" +
            "Happy Valentine's week!"
            , "I have a heart and that is true,\n" +
            "but now it has gone from me to you\n" +
            "so care for it just like I do\n" +
            "because I have no heart \n" +
            "and you have two.\n" +
            "Happy valentine's day!"
            , "Everything About You Is Interesting,\n" +
            "Your Smile, \n" +
            "Your Laughter,\n" +
            "Your Beauty, \n" +
            "Your Scent And\n" +
            "Your Company, \n" +
            "I Always Think Of You With A Smile \n" +
            "On My Face. \n" +
            "I Love You My Precious Rose.\n" +
            "Happy valentine's day"
            , "When Love First Came To Earth,\n" +
            "The Spring Spread Rose Beds To Receive Him, \n" +
            "Send These Roses To Your Friends \n" +
            "And Say Rose A Soft And Tender Rose For You\n" +
            "Showing My Love Is Really True In\n" +
            "My Life You Are A Special Part. I\n" +
            "Send This Rose Deep From My Heart."
            , "Valentine's day is only a few days away.\n" +
            "So remember, \n" +
            "it's not too late to break up and save money.\n" +
            "Maybe you catch a bigger fish on this day.\n" +
            "Happy Valentine's day!"
            , "Liking someone doesn't mean \n" +
            "you have to be lovers,\n" +
            "sometimes you just have to be friends.\n" +
            "Happy Valentine's day, dear friend!"
            , "Adam and Eve started love;\n" +
            "Romeo and Juliet introduced it;\n" +
            "Devdas and Paro suffered due to it;\n" +
            "Laila and Majnu died for it;\n" +
            "So my dear friend, \n" +
            "please beware of it as February 14 is very near.\n" +
            "Happy Valentine's day 2015 !"
            , "All You Beautiful People \n" +
            "Don't Forget To Give Roses To Your Loved Ones \n" +
            "And Remember That A White Rose Is For Peace, \n" +
            "A Yellow Rose Is For Friendship\n" +
            "And A Red One Signifies True Love."
            , "Fate Brought The Both Of Us Together.\n" +
            "So Naturally When You Look At Us,\n" +
            "You Will Think We Match Each Other.\n" +
            "Because We Are Make To Be For Each Other.\n" +
            "Happy Valentines Day."
            , "My Past Says U Met Me, \n" +
            "My Future Says U\n" +
            "Will Care For Me, \n" +
            "My Dreams Says U Will\n" +
            "Understand Me, \n" +
            "But My Heart Says U Will Always Remember \n" +
            "and Love Me.\n" +
            "Happy Valentine's Day"
            , "I Want To Lock My Heart\n" +
            "And I Want U To Be My Key\n" +
            "I Can Win The World With My Hand\n" +
            "Only If U Promise Me To Hold\n" +
            "My Other Hand For A Lifetime..\n" +
            "Happy valentine's day"
            , "Chocolate Comes In Different Sizes\n" +
            "Flavour And Shape\n" +
            "No Matter What They Look Like\n" +
            "The Most Important Thing Is That\n" +
            "Perfect Satisfaction I Get When Eating\n" +
            "Them\n" +
            "Hmmm,\n" +
            "Cant Wait To Get A Bite Of It Again..\n" +
            "Happy valentone's Day"
            , "Chocolate Is Sweet As U Are\n" +
            "Chocolate Is Great As U Are\n" +
            "Chocolate Is The Thing That We Live\n" +
            "Today Is The Day To Share Chocolate\n" +
            "With Each Another..\n" +
            "So Wishing U\n" +
            "Happy Valentine's Day"
            , "My Eyes Are Eager To See U\n" +
            "My Ears Are Eager To Listen U\n" +
            "My Lips Are Eager To Kiss U\n" +
            "And My Dreams In Night Are Eager\n" +
            "To Welcome U..\n" +
            "Happy valentine's Day"
            , "The First Time I Saw U\n" +
            "I Noticed My Heart Beat Faster\n" +
            "And The Situation Is Same\n" +
            "For Now Maybe I'm In Love With U..\n" +
            "Happy valentine's Day"
            , "I Want To Walk With U\n" +
            "I Want To Talk With U\n" +
            "For All The Time My Utmost\n" +
            "Desire Is To Be With U..\n" +
            "Happy valentine'sDay"
            , "I Promise To Be Yours\n" +
            "I Promise To Wipe Ur Tears\n" +
            "I Promise To Keep U Smiling\n" +
            "I Promise To Be Ur Dream Catcher\n" +
            "I Promise To Always Cheer U Up..\n" +
            "Happy valentine's Day"
            , "U Are Unique\n" +
            "U Are Caring\n" +
            "U Are The Best\n" +
            "And I Am The Luckiest To Have U My Love..\n" +
            "Happy valentine's Day"
            , "Of All The People Who Have Walked\n" +
            "Into My Life\n" +
            "U Have Left Ur Sweet Impression On\n" +
            "Me And My World\n" +
            "Missing U High On Chocolate Day..\n" +
            "Happy valentine's Day"
            , "KITKAT.. Kiss In Time, Kiss At Time\n" +
            "PERK.. Perfect Emotional Romantic Kiss\n" +
            "MUNCH.. Meet Urgently Now For A Charming Hug\n" +
            "I Give U All My Love..\n" +
            "Happy valentine's Day"
            , "Anyone Can Catch One's Eye\n" +
            "But It Takes A Special Someone To\n" +
            "Capture Ur Heart And Soul\n" +
            "And For Me That Special Someone Is U..\n" +
            "Happy valentine's day"
            , "One day soon I will not have to wait for Valentine's day to hold your hand and show you the way to my heart, roses and chocolates and champagne to enjoy as your are just a flight away from my life."
            , "The first time since i laid my eyes on you i think my whole world was turn up side down, and today finally i have the courage to say... will you be my valentine???"
            , "Lövèäßlé Ñümßèr>143\n" +
            "Lövèåßlé flöwèr--->RÖSÉ\n" +
            "Lövèaßlé Place>TÄJMÄHÅL\n" +
            "Lövèaßlè Då¥--->14th FèßLövèåßlèÖrgåñ>\n" +
            "HÉÄRT,\n" +
            "and Lövèaßlé Frìèñd>¥ÖÜ\"`\n" +
            "HAPPY` VALENTINE"
            , "Am not good with colors. Many a times I failed my painting assignments and I don't ever want to fail again.\n" +
            "Do you know why I chose you?\n" +
            "Do you know the color of eternity?\n" +
            "Well, your love seemed so clear to me. I could see through it and I felt that I will always be a winner with you.\n" +
            "Happy Valentine's day."
            , "When I first met you: I wished that I could always be around you and as time went by I realized that I was so attached to you.\n" +
            "Taking my love to the next level is what I want to do: we have been flying in the skies but now I want us to feel the heavens :)\n" +
            "I want you to be my forever valentine, let us grow old and in love together."
            , "Roses are red, violets are blue\n" +
            "My heart is pure and so is my love for you too\n" +
            "Love so steady, love so fine\n" +
            "Be my valentine and I will be thine\n" +
            "If we love each other rain or shine,\n" +
            "We will be rocking hand-in-hand at a hundred and ninety nine\n" +
            "I know I love you, but I realized I love you more than I think I do\n" +
            "Most people prefer chocolates on this day, but as for me I prefer you...\n" +
            "Happy Valentines Day My Love"
            , "Hi dear\n" +
            "I have been wating for this day for so long and now here it is\n" +
            "I am sorry for I don't have anything to give you on this beautiful day ....i called you up here to tell you how I feel for u and how much I love you.\n" +
            "if u accept my love I would definately give u a hug full of love...u told me that this is your first love rite \n" +
            "I swer if u accept me our love will be the most memorable ever...\n" +
            "I love you <3\n" +
            "will you be my valintine..."
            , "Someone asked me today \n" +
            "How's Life?\n" +
            "I Just smiled and replied\n" +
            "Still Waiting for her.\n" +
            "Happy Valentine's Day"
            , "True love never die, and if it dies, it don't rot, and if it rots, it never smell, and if it smells, it smells like roses. I LOVE YOU BECAUSE YOU MAKE MY LIFE BEAUTIFUL."
            , "Dear Hubby(Honey)\n" +
            "I love you lot g! Be with me always! \n" +
            "I am glad that I chose to walk with you\n" +
            "I am more than willing and happy to walk\n" +
            "an extra mile with you as I hold your hand\n" +
            "\n" +
            "I Love You always and forever!!"
            , "Love so steady, Love so fine, Be my Valentine and I will be thine. If we Love each other, rain or shine, We will be rocking hand in hand At a hundred and ninety-nine. Happy Valentine’s Day"
            , "Good morning Beautiful. The first time I saw you, my heart knew it was true! I love you more than you think I do. Happy Valentines Day love."
            , "Hai!\n" +
            "Wë cännöt bë tögëthër!\n" +
            "Büt,\n" +
            "Wë will nëvër bë äpärt,\n" +
            "för nö mätter whät lifë brings tö üs,\n" +
            "Yöu'rë älwäys in my Hëärt!\n" +
            "HAPPY VALENTINE'S DAY!:-)"
            , "two souls sharing\n" +
            "a single thought...\n" +
            "\n" +
            "two hearts sharing\n" +
            "a single beat...\n" +
            "\n" +
            "you are the light of my life,\n" +
            "\n" +
            "and smile ...\n" +
            "-happy valentine's day"
            , "Love can be expressed in many ways.\n" +
            "One way I know is to send it across the distance to the person who is reading this.\n" +
            "♥ ♥ ♥ Happy Valentine's Day ♥ ♥ ♥"
            , "You're so beautiful, you're so fine\n" +
            "I wish so dearly that you would be mine\n" +
            "Today and always you are in my heart\n" +
            "so please make me happy, be my valentine \n" +
            "Forever and always, we'll never be apart"
            , "Oh my dear Valentine.... \n" +
            "What's Life? Life is love. \n" +
            "What's Love? Love is kissing. \n" +
            "What's kissing? Come here and \n" +
            "I will show you... \n" +
            "Happy Valentine's Day"
            , "I was a little weird and my life was a little weird \n" +
            "then one day I found you, whose weirdness is compatible with mine...\n" +
            "Lets join up and fall in mutual weirdness and lets call it love...\n" +
            "Will you be my valentine??"
            , "I knew I loved you when I realized that there was no one else I would rather laugh, cry and make memories with.\n" +
            "Wishing you a wonderful Valentine's Day."
            , "Valentine's day is the one day which reminds you that if you don't have a special someone, you're alone. \n" +
            "We're lucky that you've me and i've you as special someone.\n" +
            "Happy Valentines Day dear."
            , "What I need to live has been given to me by the earth. Why I need to live has been given to me by you. Happy Valentine’s Day"
            , "This is another day of remembering you my luv, no matter d distance, weather, season and time, i wil never 4get u on this special day and i'm always with u."
            , "What Greater Thing Is There For Two Human Souls That To Feel That They Are Joined, \n" +
            "To Strengthen Each Other, \n" +
            "To Be At One With Each Other In Silent Unspeakable Memories, \n" +
            "Let Us Make Memories Of A Lifetime \n" +
            "On This Propose Day.\n" +
            "Happy valentine's day"
            , "I?m In A Imbalance State Of Mind\n" +
            "What To Give You \n" +
            "Because There Is Nothing More Beautiful & Sweeter Than You. \n" +
            "Wish You A Happy valentine's day"
            , "Let Love B D Guide To Your Dreams,\n" +
            "Let Love B D Light To Your Heart,\n" +
            "Let Your Love B D Reason \n" +
            "Why Some 1 Else Heart Still Continues 2 Beat. \n" +
            "Let Me B Your Valentine."
            , "Seasons Will Change Colours Will Fade \n" +
            "But One Thing That Will Never Change \n" +
            "The Way That I Feel About U \n" +
            "And One Thing That Will Never Fade \n" +
            "That Is My Love For U!\n" +
            "I Love You \n" +
            "Happy Valentine Day."
            , "I Thought Love Was Just A Mirage Of The Mind, \n" +
            "It's An Illusion,\n" +
            "It's Fake, \n" +
            "Impossible To Find.\n" +
            "But The Day I Met You, \n" +
            "I Began To See, \n" +
            "That Love Is Real, \n" +
            "And Exists In Me. \n" +
            "Happy Valentine Day!"
            , "I Always Looked For Someone\n" +
            "I Could Live With, \n" +
            "But Ended Up Finding Someone\n" +
            "I Can't Live Without, \n" +
            "I Love You Happy Valentines Day."
            , "All My Life I Have Waited Patiently,\n" +
            "For A Goddess Like You, \n" +
            "So Beautiful, \n" +
            "So Lovely Words Can't Express The Way \n" +
            "I Feel These Feelings Towards You \n" +
            "Are All For Real I Love You Happy Valentine Day."
            , "You Are The Reason \n" +
            "Why I Go On Eternity Can't Separate \n" +
            "This Special Bond This Heart Of Mine\n" +
            "Is Reserved For You Forever \n" +
            "It Is Yours This Love Is True\n" +
            "Happy Valentine Day Sweetheart."
            , "I'll Be Your First \n" +
            "And You'll Be My Last My World, \n" +
            "My Everything, \n" +
            "Till My Time Has Passed \n" +
            "I Will Always Love You \n" +
            "Until The End Of Time\n" +
            "My Love My Sweetheart My Valentine."
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
                .setCategory("Valentine's day Messages")
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
                .setCategory("Valentine's day Messages")
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
                .setCategory("Valentine's day Messages")
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
                .setCategory("Valentine's day Messages")
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
                .setCategory("Valentine's day Messages")
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