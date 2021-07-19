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
* Created by Anantha Eswar on 10/22/2015.
*/
public class NewYear extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_year);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("New Year Messages");

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
    }

    /* http://www.latestsms.in/happy_new_year_sms.htm
       Latest new sms 1-75
     */
    public static String[] messages = {"New Year is not about changing the Dates but Direction;\n" +
            "It's not about changing the Calendar but Commitment;\n" +
            "It's not about changing the Actions but Attitude;\n" +
            "It's not about changing the Fruit but Faith, Force and Focus!\n" +
            "May you Commit and Create the best New Year ever!"
    ,"Wish your Life always remains Bright throughout. Have a rocking New year."
    ,"Lighten up your surroundings with your sweet smile and make way for happiness with your good deeds this New Year."
    ,"Lets celebrate this blissful, cheerful, colorful New year. with a smile. Wish you Happy new year."
    ,"In every thing there must be a season,\n" +
            "a time to come and a time to go.\n" +
            "I pray that this New Year brings\n" +
            "you happiness and joy forever and ever."
    ,"May each day of the coming year Be vibrant and new bringing along Many reasons for celebrations & rejoices. Happy New Year!"
    ,"Wish you a bright, prosperous, and glorious new Year ahead. Happy new year."
    ,"New hopes!\n" +
            "New resolutions!\n" +
            "New Aspiration!\n" +
            "Love N Laughter in your life!\n" +
            "Peace N Prosperity in your life!\n" +
            "Success N Good Times On New Year!\n" +
            "Wishing you a Sparkling N Rocking New Year"
    ,"New Year be the best ever\n" +
            "Filled with joy, love, laughter\n" +
            "Fun, Humor, cheer!\n" +
            "My dear happy new year"
    ,"I wish you spend a great year ahead that starts with happiness and ends with that too. Happy New year."
    ,"My wishes for you, great start for Jan,\n" +
            "Love for Feb, peace for March,\n" +
            "No worries for April, fun for May,\n" +
            "Joy for June to Nov, happiness for Dec.\n" +
            "Have a lucky and wonderful New year."
    ,"Lets welcome the year which is fresh\n" +
            "Lets welcome the year which is new,\n" +
            "Lets cherish each moment it beholds,\n" +
            "Lets celebrate this blissful new year."
    ,"Wishing you a New Year that's\n" +
            "Sparking with Fun N Masti..\n" +
            "Bursting with Joy N Love...\n" +
            "& crackling with cheers N laughter!"
    ,"Remember the laughter,\n" +
            "the joy,\n" +
            "the hard work,\n" +
            "and the tears.\n" +
            "And as you reflect on the past year,\n" +
            "also think of the new one to come.\n" +
            "Because most importantly,\n" +
            "this is a time of new beginnings\n" +
            "and the celebration of life.”\n" +
            "Happy New Year."
    ,"May The New Year Bring you….\n" +
            "Happiness,Success and filled with Peace,\n" +
            "Hope & Togetherness of your Family & Friends….\n" +
            "Wishing You a…\n*HAPPY NEW YEAR*"
    ,"Sparkling Crackers Colorful Night Sweetest Bite Smiling Faces Delicious Dishes Only Luv, No Fear Let's Welcome the New Year.\n" +
            "Happy New Year"
    ,"As the new year blossoms, happy new year sms for friends\n" +
            "may the journey of your life\n" +
            "be fragrant with new opportunities,\n" +
            "Your Days be bright with new hopes\n" +
            "and your heart be happy with love!\n" +
            "Happy new year dear friend...\n"
    ,"Hey! It's me here...\n" +
            "Wish a big hug to say\n" +
            "May all your dreams...\n" +
            "come true this year\n" +
            "Happy New Year."
    ,"In my thoughts, In my heart,\n" +
            "You are always with me,\n" +
            "My love and always will be!\n" +
            "You are the one I always dream of\n" +
            "You are the one who completes me,\n" +
            "I love you so much Sweetheart!\n" +
            "And you will be in every part of\n" +
            "my life in this New Year!\n" +
            "Happy New Year sweetheart..."
    ,"In this New Year....\n" +
            "Mày Good Health N Good Times\n" +
            "Mày Good Luck N Good Fortune\n" +
            "Alwàys with you\n" +
            "Hàppy New Year"
    ,"I wish You dear buddy, This New Year brings you\n" +
            "24/7 Days Joy\n" +
            "24/7 Days Smiles\n" +
            "24/7 Days Good Times\n" +
            "24/7 Days Good Fortunes"
    ,"A lovely new year on your way,\n" +
            "Greet new year with your cute smile..\n" +
            "Walk on your path,\n" +
            "Love in your own way,\n" +
            "Talk in your own words....\n" +
            "Do what your heart says....\n" +
            "And then one day world will say\n" +
            "It is your day\n" +
            "Wishing You A\n" +
            "Happy New Year"
    ,"May the dawning of this New Year\n" +
            "Open up for you New Horizons,\n" +
            "Fill your heart with New Hopes and bring for you!\n" +
            "Promises of Brighter Tomorrows!\n" +
            "Wishing you Happiness and Prosperity in the New year!."
    ,"Hope the New Year\n" +
            "Sweetens up your life..\n" +
            "With Joys and Surprises..\n" +
            "Happiness and Success..\n" +
            "Brighten up Your Life..\n" +
            "Good Health and Good Times\n" +
            "Happy New Year."
    ,"Wishing you a year of\n" +
            "Happiness & Success\n" +
            "Peace & Prosperity\n" +
            "Health & Wealth\n" +
            "Also a Year of\n" +
            "Love & Laughter\n" +
            "Happy New Year."
    ,"May every day of the New year glow\n" +
            "with good cheer and good times for\n" +
            "You and Your Family\n" +
            "Wish You A Prosperous\n" +
            "Happy New Year."
    ,"A New Year Will Begin And \n" +
            "Will Be A Wonderful Adventure \n" +
            "If I Can Share With You Every Moment. \n" +
            "I Love You With All The Strength Of My Heart.\n" +
            "Wish U A Happy New Year."
    ,"I Send New Year Wishes And \n" +
            "All My Love For You Dear \n" +
            "On The Special New Year Celebration Day. \n" +
            "Your Presence In My Life  \n" +
            "Has Made My New Year Celebration \n" +
            "Much More Special Dear. \n" +
            "Have A Happy New Year Ahead."
    ,"This New Year Will Be Perfect\n" +
            "If I'm With You Since The First Day, \n" +
            "You Are Part Of Me\n" +
            "And I Wish It Will Be Like This Forever, \n" +
            "Happy New Year Dear."
    ,"Let's Welcome The New Year With A Big Hug And Kisses. \n" +
            "These Twelve Months Coming Symbolize Love And Happiness That Will Bring To Us Together. \n" +
            "I Wish You Much Happiness\n" +
            "And Success Happy New Year Dear."
    ,"This New Year Will Be The Perfect Opportunity \n" +
            "For Our Love To Be Bigger And \n" +
            "Stronger With Each Passing Day. \n" +
            "I Love You With All My Heart \n" +
            "And I Wish You A Happy New Year"
    ,"My Greatest Desire In This New Year\n" +
            "Is To Be Always By Your Side \n" +
            "To Comfort You In Sorrow, \n" +
            "And Laugh With You In Joy. \n" +
            "Have A New Year Filled With Much Prosperity."
    ,"I Have Confidence That This Coming\n" +
            "Year Will Be Excellent And \n" +
            "You Know How I Feel, \n" +
            "Because I Will Have You By My Side \n" +
            "Every Day Of The Year. \n" +
            "Happy New Year."
    ,"I Love To Lie Down In Your Arms &\n" +
            "Listen To Your Heart Beats. \n" +
            "It Makes Me Feel \n" +
            "That There Is Someone In This World, \n" +
            "Whose Heart Beats Only For Me, \n" +
            "I Just Can?t Stop Loving You, \n" +
            "Wish U Very Happy New Year."
    ,"No Matter If Every Sunset Steels One Day From Our Life, \n" +
            "But Every Sunrise Gives Us One Another Day To Hope! I Wish New Hopes Will Always Be A Part Of Your Life. \n" +
            "Happy New Year."
    ,"Along With All The New Hopes And Promises \n" +
            "That The New Year Would Bring Hope \n" +
            "It Also Brings Us A Lot More Opportunities To Work Together. \n" +
            "Wish You A Very Happy And Successful Year Ahead."
    ,"Today Is A New Day, \n" +
            "A Day For New Beginnings, \n" +
            "New Starts, Old Endings,\n" +
            "A Day To Remember,\n" +
            "A Day To Live For. \n" +
            "Life Has Its Course & \n" +
            "Every Course Is A New Chapter. \n" +
            "Happy New Year."
    ,"Before The Calendar Turns A New Leaf Over, \n" +
            "Before The Social Networking Sites Get Flooded With Messages,\n" +
            "Before The Mobile Networks Get Congested, \n" +
            "Let Me Take A Quiet Moment Out \n" +
            "To Wish You A Wonderful, \n" +
            "Happy, Healthy And Prosperous New Year!"
    ,"Just As A New Bloom Spreads\n" +
            "Fragrance And Freshness Around?\n" +
            "May The New Year Add A New Beauty\n" +
            "And Freshness Into Your Life.\n" +
            "Happy New Year."
    ,"As the new year dawns, \n" +
            "may it be filled with serenity and joy for you.\n" +
            "May Lord bless you and your family with peace, proximity and success.\n" +
            "Wishing you a very happy new year!"
    ,"Let's party bcoz it's New Year time.\n" +
            "Celebrate Happy New Year with me all the night, \n" +
            "so that we can end the year together \n" +
            "and start the new year together."
    ,"Just like a newly blossomed flower,\n" +
            "may this \"New Year\" brings freshness & fragrance to your life.\n" +
            "Here's wishing you very \"Happy New Year\""
    ,"May this New Year be a\n" +
            "\n" +
            "H: Harbinger of\n" +
            "A: Abundant\n" +
            "P: Peace,\n" +
            "P: Prosperity and\n" +
            "Y: Youthfulness.\n" +
            "\n" +
            "N: Newness coupled with\n" +
            "E: Eternal Happiness\n" +
            "W: Wean away your sorrows.\n" +
            "\n" +
            "Y: Your life is filled with\n" +
            "E: Enormous\n" +
            "A: Ambition that makes you\n" +
            "R: Rich and righteous!"
    ,"May your days be as glittery as Diamonds;\n" +
            "May your companions be as good as Gold;\n" +
            "May your heart stay as green as Emerald;\n" +
            "And may your soul remain as pure as Pearl.\n" +
            "Happy New Year!"
    ,"May the New Year enriches our life \n" +
            "with your love, \n" +
            "closeness and sharing!\n" +
            "Happy New Year, \n" +
            "My Dear Sweetheart!"
    ,"In the New Year, may you:\n" +
            "Make new friends and retain the old;\n" +
            "Build new memories and cherish the old;\n" +
            "Acquire new knowledge and use the old;\n" +
            "Make new investments and build the old;\n" +
            "Go to new places and not forget the old.\n" +
            "Have a beautiful New Year!"
    ,"May you always look ahead this New Year \n" +
            "without being held back by any backlog \n" +
            "so that when you finally reach your destination \n" +
            "you can look back upon the memories and \n" +
            "cherish them with fondness and pleasure.\n" +
            "Best Wishes for the New Year!"
    ,"This New Year I wish that:\n" +
            "Fate never takes you for a bumpy ride;\n" +
            "Cupid strikes you with his sweetest arrow;\n" +
            "Lady Luck bestows upon you health and wealth;\n" +
            "Your Guardian Angel keeps your mind alert and bright.\n" +
            "Have a Happy and Blessed New Year!"
    ,"May this New Year not be a repetition of old habits may you reinvent yourself and embark upon a journey full of excitement and adventure.\n" +
            "Happy New Year!"
    ,"Each moment in a day has its own value. \n" +
            "Morning brings HOPE, \n" +
            "Afternoon brings FAITH, Evening brings LOVE, \n" +
            "Night brings REST, \n" +
            "Hope you will all of them everyday. HAPPY NEW YEAR. \n" +
            "Before the sun sets in this year, \n" +
            "before the memories fade, before"
    ,"The Start Of First January New Year\n" +
            "Brings You Closer And Closer \n" +
            "To Your Dreams And Aspirations, \n" +
            "May This Be The Breakthrough Year \n" +
            "That Your Dreams Finally Become A Reality.\n" +
            "Wishing You A Happy New Year!"
    ,"I Cannot Believe That Another Year Has Gone \n" +
            "And We Have Another Chance To Continue Fighting For\n" +
            "The Top Heel Of Loaf. \n" +
            "This New Year \n" +
            "I Freely Surrender The Heel Of Loaf \n" +
            "And Wish You Happiness."
    ,"Thank God For He Has Granted Me \n" +
            "The Most Priceless Gift Of A Sister, \n" +
            "You Are A Treasure Beyond Measure And\n" +
            "I Wish You A Fabulous New Year."
    ,"Remove Hate, \n" +
            "Jealousy, \n" +
            "Grudge,\n" +
            "Animosity, \n" +
            "Greed From Your Dictionary\n" +
            "This New Year's Eve And Replace Them\n" +
            "With Love,\n" +
            "Commitment, \n" +
            "Support,\n" +
            "Compassion, \n" +
            "Honesty And Contentment\n" +
            "Here Is Wish You A Happy New Year."
    ,"As We Say Bye To The Past Year And\n" +
            "Say Welcome To The New Year, \n" +
            "May You Live To Be Prosperous And Successful, \n" +
            "May This Year Be Full Of Peace And Determination\n" +
            "Happy New Year To You My Brother."
    ,"As You Lay There In Bed Not In The Best Of Health, Think Positive Thoughts \n" +
            "And Before You Know It You'll Be Out\n" +
            "And About With Me, \n" +
            "And Together We Can Take Over The World!"
    ,"Expand Your Circles As You Welcome This New Year, Turn Your Friends Into Benefits, \n" +
            "And Let Your Friends Also Benefit From You, \n" +
            "Be Ready To Share With Others, \n" +
            "And Learn As You."
    ,"Something In Your Smile Which Speaks To Me,\n" +
            "Something In Your Voice Which Sings To Me,\n" +
            "Something In Your Eyes Which Says To Me,\n" +
            "That You Are The Dearest To Me.\n" +
            "Advance Happy New Year! \n" +
            "Wishes To You And Your All Family Members..!"
    ,"Happy new year to all families,\n" +
            "Friends and colleagues.\n" +
            "May this new year be ur best year,\n" +
            "Lets forget our past sorrows and let\n" +
            "This new year bring u hapiness.\n" +
            "Let coming happiness hold u through out the year 2015.\n" +
            "Happy new year"
    ,"Nothing ever lasts forever, \n" +
            "neither does bad time,\n" +
            "It?s time to look forward for a good time to start,\n" +
            "with new hopes and opportunities knocking at our door.\n" +
            "Happy new year."
    ,"Year Come N Go, \n" +
            "But Diz Year\n" +
            "I Specially Wish U Ur Health And\n" +
            "Happiner Topped With Loads Of Good Fortune.\n" +
            "Have A Great Year Ahead !!\n" +
            "Happy New Year"
    ,"The new year stands before us, \n" +
            "like a chapter in a book, \n" +
            "waiting to be written. \n" +
            "We can help write that story by setting goals.\n" +
            "Happy New Year!"
    ,"Only a few days left this year. \n" +
            "So I wanna convey my thanks to all those who:\n" +
            "Loved me - they made my heart bigger.\n" +
            "Hated me - they made me a stronger person.\n" +
            "Entered my life - they made me who I'm today.\n" +
            "Left me - they made me realize that nothing lasts forever.\n" +
            "Were worried about me - they let me know that they actually cared.\n" +
            "Just want to Thank You all for being there in my life!"
    ,"Genuine success comes only to those who are ready for it. \n" +
            "So never step back and always have courage to accept new challenges.\n" +
            "Wishing you a very Happy New Year!"
    ,"May the New Year transform your:\n" +
            "Your tears into joy\n" +
            "Your plans into action\n" +
            "Your dreams into reality\n" +
            "Your savings into assets\n" +
            "Your love into togetherness\n" +
            "And your milestones into destinations!\n" +
            "A very Happy New Year!"
    ,"A very Happy New Year to all my Whatsapp Friends.\n" +
            "May you post funny, \n" +
            "informative and wise messages even next year!"
    ,"Beauty,\n" +
            "Freshness,\n" +
            "Dreams,\n" +
            "Truth,\n" +
            "Imagination,\n" +
            "Faith,\n" +
            "Trust,\n" +
            "This is beginning of a New Year."
    ,"Stealing The Blue From The Splashing Seas, \n" +
            "A Tringe Of Green From The Youthful Trees, \n" +
            "A Bit Of Orange From The Sunset Hues, \n" +
            "With Crystal White From The Morning Dews, \n" +
            "I Have Framed A Bright And Colourful\n" +
            "Wish Just For You Happy New Year."
    ,"Lets Forget Past Mistakes\n" +
            "Making Amendments For This Year, \n" +
            "Sending You These Greetings To Bring You Love\n" +
            "And Cheer Happy New Year."
    ,"I Want To Wish You A Very Happy,\n" +
            "Healthy And Blessed New Year,\n" +
            "I Do Hope It Will Be The Happiest\n" +
            "That You Have Ever Known, \n" +
            "And That It Will Be A Year Filled\n" +
            "With Serenity With Each Sunrise."
    ,"The New Year Is Not About Changing Dates But Direction, \n" +
            "Its Not About Changing The Calendar But Commitment,\n" +
            "Its Not About Changing The Actions But Attitude, Its Not About Changing The Fruit But Faith, \n" +
            "Force And Focus,\n" +
            "Let Us Create The Best New Year Ever."
    ,"As We Begin The New Year I Want To Give The Statement Of Our Love, \n" +
            "It Has Resulted In Thousands Of Kisses\n" +
            "And Hugs To Share Throughout The Year. \n" +
            "I Wish With All My Heart\n" +
            "That You Have A Happy New Year."
    ,"There Is No One Worldwide Better\n" +
            "Than You To Share Each Of The 365 Days \n" +
            "That The New Year Brings. \n" +
            "I Love You With All My Heart And \n" +
            "I Strive To Make This Year \n" +
            "The Best Of Our Lives."
    ,"New Year's Eve Is Fantastic And\n" +
            "Beautiful But You?re Definitively More, \n" +
            "Nothing In This World Can Be Compared To Your Beauty,\n" +
            "Happy New Year Sweetheart Love."
    ,"Waves Of The Ocean..\n" +
            "Perfumes Of Flowers..\n" +
            "Stars Of The Night..\n" +
            "& Angels Of Paradise..\n" +
            "Are All Gathered By UR Side 2 Say U..\n" +
            "Happy New Year"
    ,"This New Year My Wish For You Is To Dream Big, \n" +
            "But Be Satisfied With The Simple Blessings That Life Has Gifted You With To Make Mighty Plans For The Future, \n" +
            "But Never To Ignore The Little Joyous Moments Of The Present."
    ,"May The New Year Unfold Before You\n" +
            "Just Like A New Flower That Blooms Slowly Unfolding Each Petal, \n" +
            "May Each Day Of The New Year Get Filled Up With Sweet Fragrance Of Contentment And Peace."
    ,"As The New Year Going To Start.\n" +
            "I Wish May The Good Times, \n" +
            "Live On In Our Memories. \n" +
            "And May We Learn Lessons, \n" +
            "From The Troubling Times. \n" +
            "That Will Make Us Stronger And Better Than Ever."
    ,"The Year Is New, \n" +
            "The Hopes Are New, \n" +
            "The Aspirations Are New, \n" +
            "But My Warm Wishes For Happiness And Prosperity Remains The Same For You And Your Family \n" +
            "Happy New Year."
    ,"Let Us All Close Our Eyes, \n" +
            "Say A Warm Goodbye To The Year 2014.\n" +
            "Thank God For Everything \n" +
            "That He Has Given Us Ask For Forgiveness\n" +
            "For All Our Mistakes And At Last,\n" +
            "Wish For An Even Better Year."
    ,"Fresh hopes, \n" +
            "fresh plans, \n" +
            "fresh efforts, \n" +
            "fresh feelings, \n" +
            "fresh commitment.\n" +
            "Welcome this new year with a fresh attitude. \n" +
            "Happy new year"
    ,"I Wont Say I Love You\n" +
            "Because I Need You,\n" +
            "Actually I Need You\n" +
            "Because I Love You \n" +
            "Happy New Year Sweetheart."
    ,"No Greeting Card Or A Gift \n" +
            "Can Convey How Grateful I Am To\n" +
            "Have Been Blessed With The World?s Greatest Father. I Love You Dad. \n" +
            "Let Us Have One More Rocking Year. \n" +
            "A Very Happy New Year."
    ,"You Held My Fingers When I Was Born With Love, \n" +
            "You Held My Hand Not Letting Me Fall When I Started Walking With Concern. \n" +
            "Let?s Hold Hands Once Again Welcoming A New Year, Dad Happy New Year."
    ,"New lover,\n" +
            "new friends,\n" +
            "new food,\n" +
            "new places,\n" +
            "new films, \n" +
            "new jobs,\n" +
            "new style,\n" +
            "new songs,\n" +
            "new, new,new\n" +
            "Happy new year, \n" +
            "for all friends...."
    ,"Let's give a warm welcome to the year\n" +
            "Cherish each moment that the year shall behold \n" +
            "so Let's come together and celebrate a\n" +
            "Blissful start to the New Year\n" +
            "Happy New Year!"
    ,"RENEWAL OF FRIENDSHIP CONTRACT FOR THIS NEW YEAR\n" +
            "After serious and cautious consideration,\n" +
            "your contract has been renewed for the New Year.\n" +
            "So, try to be more LOVING and CARING next year.\n" +
            "Take care of Me and Miss me.\n" +
            "Because, It's impossible to find a FRIEND\n" +
            "Who is\n" +
            "95% ideal\n" +
            "96% smart\n" +
            "97% kind\n" +
            "98% true\n" +
            "99% Talented\n" +
            "and\n" +
            "100% lovable\n" +
            "So,\n" +
            "Don't lose WHOM U NEVER WANT TO LOSE.\n" +
            "Wish you a Very Happy New Year..!"
    ,"Oh my Dear, \n" +
            "Forget your Fear,\n" +
            "Let all your Dreams be Clear,\n" +
            "Never put Tear, \n" +
            "Please Hear,\n" +
            "I want to tell one thing in ur Ear\n" +
            "Wishing you a very very \n" +
            "Happy NEW YEAR"
    ,"There have been many time in the past year\n" +
            "when I may disturbed you..\n" +
            "troubled you..\n" +
            "irritated you..\n" +
            "bugged you..\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "today I just wanna tell you\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "I plan to continue it in this new year :p.\n" +
            "Happy New Year"
    ,"May your hair, \n" +
            "your teeth, \n" +
            "your face lift, \n" +
            "your Abs and your stocks never fall;\n" +
            "And may your Blood Pressure, \n" +
            "your Cholesterol, \n" +
            "your White Blood Count and \n" +
            "your Mortgage interest never rise.\n" +
            "Happy and healthy new year!"
    ,"If I have been troubling you endlessly this year, I want you to know that the new year is soon going to dawn;\n" +
            ".\n" +
            ".\n" +
            "but I am still gonna trouble you endlessly. The calendar's gonna change and not I.\n" +
            "Happy New Year!"
    ,"My Top 5 New Year RESOLUTIONS:\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "640 * 360 pixels\n" +
            "960 * 540 pixels\n" +
            "1280 * 720 pixels\n" +
            "1920 * 1080 pixels\n" +
            "2560 * 1440 pixels\n" +
            "Happy New Year =D!"
    ,"New Year Is Coming\n" +
            "Before this year Ends,\n" +
            "Let Me Thank All The Good People Like You,\n" +
            "Who Made this year Beautiful For Me.\n" +
            "I Pray You Be Blessed\n" +
            "With Faithful Year Ahead.\n" +
            "Happy New Year."
    ,"You Are A Dreamer,\n" +
            "And You Are An Achiever.\n" +
            "May You Dream And Achieve Bigger Feats,\n" +
            "With Every Passing Year.\n" +
            "All The Best For The New Year.\n" +
            "Enjoy .. HAPPY NEW YEAR.."
    ,"This Is The Time To Put All Bad Memories Behind You And Look Forward Into The New Year \n" +
            "With Nothing But Good Things To Come. \n" +
            "Wish You Happy New Year."
    ,"If You Thought The past year Was A Good Year, \n" +
            "Well, That Was Just A Sneak Preview, \n" +
            "Wait Until You Experience The Pleasant Surprises That this new Year Has In Store For You!\n" +
            "May You Have A Joyful Year Ahead."
    ,"As We Wait To Usher In The New Year,\n" +
            "I Wish You Many Good Times,\n" +
            "May You Learn Lessons From The Challenging Times And May You Become Stronger And \n" +
            "Better Than Ever Before."
    ,"How Fast Time Moves, \n" +
            "We Are few Hours Away from the upcoming new year, \n" +
            "As You Look Forward To Witnessing\n" +
            "The Glory Of The New Year,\n" +
            "May It Bring With It More Fulfilled Promises, \n" +
            "Happy New Year."};


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
                .setCategory("New Year Messages")
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
                .setCategory("New Year Messages")
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
                .setCategory("New Year Messages")
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
                .setCategory("New Year Messages")
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
                .setCategory("New Year Messages")
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