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

public class GoodEvening extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_evening);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Good Evening Messages");

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

    /* http://wishesmessages.com/good-evening-messages/
    http://www.funbull.com/sms/good-evening-sms.asp
    http://www.desicomments.com/sms/sms/good-evening-sms/
    http://www.smsoftheday.com/good-evening-sms.html
    http://www.smsdish.com/sms-id-3-type-1-category-Good-Evening.html
    http://www.friendlysms.com/good-evening-sms-message/page3.html
    http://sms4moble.blogspot.in/2012/03/evening-sms-evening-sms-for-boyfriend.html

    */
    public static String[] messages = {"The tantalizing rays of the setting sun, remind me that you’re my number one. I love you. Good Evening"
            , "Just like the froth in beer rises to the top of the glass and disappears, I wish that all your worries and fears disappear as the evening fills up your glass of life. Good evening."
            , "Evenings allow you to forget the bitter worries of the day and get ready for the sweet dreams of night. Good evening."
            , "Evenings are the beautifully sweet spot between the harsh light of the day and the dead darkness of night."
            , "There’s no need to add sugar to your evening coffee, because you’ve just been poked by a sweet person like me. Good evening."
            , "Mornings, hurried and stressful. Afternoons, slow and woeful. Nights, time to rest. Evenings, simply the best."
            , "May the beautiful evening sun, photobomb all the romantic selfies you take with your special someone. Good evening."
            , "Evenings are life’s way of saying that you are closer to your dreams."
            , "The sun will rise and set. The stars will appear and disappear. The clouds will gather and later wither… nothing can stop nature’s cycle, just like nothing can stop you from succeeding. Good evening."
            , "An evening is the PAUSE button that gives you a breather before you jump from on part of the day to another. Good evening."
            , "As the sun drowns in the sea today, may it take away all your worries away. As it rises from the bay tomorrow, may it bring you the promise of a life without sorrow. Good evening."
            , "Evenings are your chance to forget the mistakes you made during the day, so for the sweetest of dreams, you can pave the way. Good evening."
            , "Friends like you are the reason why there’s never a sunset in my life’s happiness. Good evening."
            , "I hope our friendship always remains as beautiful and breathtaking as a picturesque sunset. Good evening."
            , "Cupid is the second name for evening because most romantic dates start in the evening. Good evening sweetheart."
            , "The sun sets in the evening today with the promise that it will rise again tomorrow. Here’s hoping that this awesome day comes to a close with the promise that there will be better tomorrow. Good evening."
            , "Evenings… a reason to come back home, look forward to a good meal and spend time with loved ones."
            , "The morning and afternoon weren’t enough for me to say how much I love you. Good evening… xoxo."
            , "Some people hate early mornings and some people hate late nights. But everyone loves evenings! Good evening."
            , "May the sun in your life never set, may it always rise high and above… good evening."
            , "Mornings may be the most important part of the day. Afternoons may be the most hectic part of the day. Nights may be the most rejuvenating part of the day. But evenings are definitely the most romantic part of the day. Good evening. xoxo"
            , "Evenings… the time when friends get ready to party the night away. xoxo"
            , " A bright new start, a brand new opening. A bold new launch, a fantastic beginning. I hope every single day of yours, turns out to be beautifully amazing. Good evening."
            , "This message is to confirm that you are scheduled for an amazing close to the day. Good evening."
            , "A good evening is too small a wish for you… I’d like to wish you an awesome life."
            , "I hope the beautiful hues of twilight infuse a generous doze of happiness in your life. Good evening."
            , "No matter how bad your day has been, the beauty of the setting sun will make everything serene. Good evening."
            , "An evening is just a pause to think about the great things you will do tomorrow. Happy birthday."
            , "It’s only after twilight, that a new dawn begins. Good evening."
            , "Good evening to the colleague whose presence has made for many great evenings."
            , "A beautiful twilight signifies the impending dawn of new dreams and ambitions in life. Good evening."
            , "Your morning was productive, your afternoon excellent. Your track record for the day says that your evening will be brilliant. Good evening."
            , "Take a deep breath, clear your mind and just gaze into the beautiful twilight… just go soul-searching. Good evening."
            , "Do you know what parties, romantic dates, fun night outs, beautiful sunsets and candle lit dinners have in common? They all begin in the evening. Have a good one!"
            , "The sunshine of ur smile might chase d clouds from sum1's life 2day..\n" +
            "So keep smiling. \n" +
            "Good Evening"
            , "A simple good evening becomes a special greeting when someone so dear it is heartily given, because you have to me a wonderful meaning. Take care and Good Evening"
            , "Why does the Sun set and rise every day? \n" +
            "? \n" +
            "? \n" +
            "? \n" +
            "? \n" +
            "\n" +
            "Think... \n" +
            "\n" +
            "So tht i can wish Good MorninG \n" +
            "and \n" +
            "Good evening 2 u"
            , "A clay pot having milk will be ranked higher than a golden pot having poison.\n" +
            "Not our outer glamour but our inner virtues make us valuable... \n" +
            "GOOD evening my clay pot."
            , "My wishes are silent but true,\n" +
            "Everywhere they will follow you... \n" +
            "Good Evening"
            , "In life,we have alot to Lose and very little to Choose..!\n" +
            "Whenever u get a chance to choose, do it wisely\n" +
            "and see dat u NEVER LOSE WAT U CHOOSE!).. \n" +
            "Gud Evening"
            , "Don't guess a person's character on his present situation. Bcoz,\n" +
            "Time has the power to change an ordinary coal into a precious diamond....\n" +
            "GooD EveninG"
            , "Give laugh to all but smile to ONE.\n" +
            "Give love to all but heart to ONE.\n" +
            "Give life to all but live for ONE..\n" +
            "Have a cool evening…"
            , "Distance never separate any relation..\n" +
            "Time never build any relation..\n" +
            "If feelings r true from heart..\n" +
            "Then friends r always friends 4ever.\n" +
            "Happy Evening"
            , "A simple good evening becomes a special greeting when someone so dear it is heartily given, because you have to me a wonderful meaning. Take care and have wonderful evening!"
            , "We may easily forget d people with whom v laughed n enjoyed. But, v cant 4get those people wit whom v cried n shared our feelings.its true. Gud evening…"
            , "In life,we have a lot to Lose nd very little to Choose..!\n" +
            "Whenever u get a chance to choose, do it wisely nd see dat u\n" +
            "NEVER LOSE WAT U CHOOSE!).. Gud evening"
            , "A nice quote n the fact.. “closest relationship in the world have fought more battle than the enemies”\n" +
            "So keep fighting with loved one.. Gud evng."
            , "B a poet whn u r alone, B a king when u command, B a lover whn some 1 loves u, B a scientist whn u work, B history when u die, B a friend until i die.. Gud evening. . . Hav a nice evening. "
            , "The hardest thing of missing someone is not just their absence…Its when you think of the memories shared with them n ask yourself won’t it ever happen again….!!!Good Evening…"
            , "Most of the things we desire are EXPENSIVE. But the truth is: The things That really satisfy us Are FREE: Love, joy, laughter and Good relations.\n" +
            "good evening!!!"
            , "Life can be happier & stress less if we remember one simple thought:\n" +
            "“We can’t have all that we desire, but God will give us all that we deserve”\n" +
            "Have a good evening"
            , "We may easily forget d people wid whom v laughed n enjoyed. But, we cant 4get those people wit whom v cried n shared our feelings.its true.\n" +
            "Gud evening…"
            , "2concepts 4a truly happy life:\n" +
            "1.Use things,not people.\n" +
            "2.Love people,not things...\n" +
            "Gud Evng Guysss"
            , "Being happy doesn’t mean everything’s perfect..\n" +
            "It just means\n" +
            "we have decided to see everything beyond the imperfections.\n" +
            "Good evening…:-)"
            , "Cute and true lines – Never choose a dear one without understanding and never loose a dear one because of misunderstanding…\n" +
            "Good evening"
            , "Its human tendency to run behind people whom we love and neglect the ones who love us bcoz We r sure we’ll never loss them ….strange but very true…\n" +
            "Good evening"
            , "eparation is a wound that no one can heal..!\n" +
            "But,\n" +
            "remembrance is a gift that no one can steal..!\n" +
            "Keep your memories intact..!!.\n" +
            "good evening"
            , "Love planted a rose\n" +
            "and\n" +
            "the world turned sweet\n" +
            "Just To Make Us Realize That\n" +
            "Life Is Beautiful.\n" +
            "Good Evening"
            , "An apple msg for an orange\n" +
            "person from a strawberry friend\n" +
            "for a pineapple reason at\n" +
            "a mango time on a jack-fruit day in a\n" +
            "grape mood to say fruity good evening dear!"
            , "Worries are like Moon.\n" +
            "one day will increase, one day will decrease,\n" +
            "other day may not be seen.\n" +
            "So Don't Worry for Anything. Always Be cool.\n" +
            "Good evening ...:-)"
            , "Easy to cry in pain,\n" +
            "Easy to laugh in joy\n" +
            "But\n" +
            "Crying in joy and laughing in pain\n" +
            "shows the real deepness of situations and ability of a person :-)\n" +
            "Gud evening !!"
            , "Deepest lov is d Biggest sorrow in dis world...\n" +
            "Never love a person more than ur life....\n" +
            "It wil hurt u lot when u realise u wasn't their life\n" +
            "....Gud evening !!"
            , "Have a wonderful evening at work do not work too hard be blessed and I will keep you in my prayers love you"
            , "The best medicine in the world without any side effect is a \\'\\'smiling face\\'\\'. \n" +
            "I will pray that this medicine must be always with u smile Plz...happy evening"
            , "Future is Not something U Await! \n" +
            "It is something U Must Create! \n" +
            "Plan ur Future in Advance coz thts where \n" +
            "U will Spend the Rest of ur Life! Good Evening."
            , "4 Blessed ways of living: \n" +
            "1st, \n" +
            "Look back and Thank God. \n" +
            "2nd, \n" +
            "Look forward and Trust God \n" +
            "3rd, \n" +
            "Look around and serve God. \n" +
            "4th, \n" +
            "Look within and Find God..!! Good Evening."
            , "Smile is a language of love \n" +
            "Smile is to win the hearts \n" +
            "Smile improves your personality \n" +
            "SO SMILE always. Good Evening."
            , "Memories play a confusing role. \n" +
            "They make u laugh when u \n" +
            "remember da time u cried 2gether. \n" +
            "But make u cry when u \n" +
            "remember the time u laughed 2gethr, Good Evening."
            , "Making a million friends is not an achievement, \n" +
            "The achievement is to make \n" +
            "A friend who will stand by you\n" +
            "when a million are against you....! good evening."
            , "Life can be happier and stressless if we remember one simple thought: \n" +
            "We can't have all that we desire, but God will give us all that we deserve\n" +
            "Have a good evening "
            , "WORDS \n" +
            "and \n" +
            "HEARTS \n" +
            "should be handled carefully, \n" +
            "Because words when \n" +
            "SPOKEN \n" +
            "and \n" +
            "Hearts when \n" +
            "BROKEN \n" +
            "are the hardest things to repair, Good evening."
            , "energy reduces \n" +
            "sweeting stops \n" +
            "cool wind comes \n" +
            "sun starts to set \n" +
            "legs count their step \n" +
            "that time if a frnd says gd eveng \n" +
            "how ur heart feels"
            , "Friendshp is not having a gang of people around U... \n" +
            "It is best to have one heart which is true,.. \n" +
            "Thinking of U \n" +
            "and \n" +
            "Always cares for U... Gud evening !!"
            , "If u manage to smile at any situation u r d winner of haghest number of hearts in this world. So smile forever .....keep smiling good evening"
            , "A true well Friend is ONE who talks abt ur weakness in front of U, and Talks about ur strength in front of others.... Gud evening. :-)"
            , "No one has ever loved anyone the way everyone wants to be loved..\n" +
            "Think deeply, you'll feel it...!! Gud evenin !"
            , "The longer you wait for something,\n" +
            "the more you appreciate it when you get,\n" +
            "B'coz anything worth having is definitely worth waiting for ....\n" +
            "gud evening."
            , "Poor man runs 4his daily food, While a Rich man runs 2digest his daily food\"..\n" +
            "What a world.... ! Gud evenin... !!"
            , "Cute Lines :-\n" +
            "Tears can b Trusted more than Smile because you can easily Smile at anybody but cant Cry without True Feelings..... :-) Gööd evenin !!"
            , "A true sentence from a real friend..\n" +
            "'All the persons are not my friends.\n" +
            "But\n" +
            "my friend is not just like all other persons.... Gud evening !!"
            , "It doesn't matter where you come from \n" +
            "but what matters most is to understand \n" +
            "where you going. \n" +
            "Good Night!!"
            , "Thinking about you is the tipping point \n" +
            "where my nightmares end \n" +
            "and sweet dreams begin. \n" +
            "Good Night!"
            , "I couldn't sleep \n" +
            "until I told you \n" +
            "how much I missed you. \n" +
            "Good night my love.."
            , "When distance tends to keep us apart, \n" +
            "remember I still hold you near in my heart. \n" +
            "Good Night!"
            , "A good idea will keep you awake during the morning \n" +
            "but a great idea will keep you awake during the night."
            , "Today was good fun. \n" +
            "Tomorrow is another one. \n" +
            "Good Night!"
            , "Night is the time,\n" +
            "To dream,\n" +
            "To forgive,\n" +
            "To smile and sleep,\n" +
            "In thoughts so profound and deep!\n" +
            "Good night to you!"
            , "Your life does not get better by chance, \n" +
            "it gets better by change. \n" +
            "Good Night!"
            , "Don't believe everything you think. \n" +
            "Good Night!"
            , "Everyone has feelings, no matter how they act..\n" +
            "Don't play with someone else?s feelings..\n" +
            "Just because you're not sure of your own.\n" +
            "Good night"
            , "Dreams r the best part of life.\n" +
            "If u miss sleep,\n" +
            "U miss the best part of life,\n" +
            "So its already late\n" +
            "Go to bed\n" +
            "and Catch a very Good Dream\n" +
            "Good Night"
            , "The Candles can?t Burn without the Light.\n" +
            "The Moon can?t Shine without the Night.\n" +
            "Then How can I go to sleep without Wishing You\n" +
            "Good Night"
            , "Keep your worries aside \n" +
            "and follow the night with new thoughts. \n" +
            "Good Night!"
            , "A good relationship needs just 2 things..\n" +
            "a ?little time? to be spent with them\n" +
            "and? a ?true care? to be shown alwayz!!!\n" +
            "good night"
            , "Since your eyes are looking tired..\n" +
            "Let your eye lashes hug each other for few hours.\n" +
            "Happy journey into the world of dreams.\n" +
            "GOOD NIGHT!"
            , "Every night, \n" +
            "you can close your eyes to something you don't want to see,\n" +
            "But you can't close your heart to something you don't want to feel.\n" +
            "Good Night!"
            , "Go go good on the bed,\n" +
            "in the night,\n" +
            "friends i wanna say good night\n" +
            "Go go good on the bed,\n" +
            "in the night,\n" +
            "friends i wanna say good night"
            , "In the blink of an eye, everything can change,\n" +
            "So forgive often and love with all your heart,\n" +
            "Take no one for granted for, \n" +
            "you never know what may happen tomorrow.\n" +
            "Good Night!"
            , "The first person you think of in the morning \n" +
            "and the last person you think of at night, \n" +
            "is either the reason you're happy or the reason you're hurting.\n" +
            "Good Night!"
            , "It's never too late to start over.\n" +
            "If you weren't happy with today\n" +
            " try something different tomorrow.\n" +
            "Good Night!"
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
                .setCategory("Good Evening Messages")
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
                .setCategory("Good Evening Messages")
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
                .setCategory("Good Evening Messages")
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
                .setCategory("Good Evening Messages")
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
                .setCategory("Good Evening Messages")
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