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
* Created by Anantha Eswar on 9/28/2015.
*/
public class Funny extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funny);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Funny Messages");

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
        text101.setText("101. " + messages[100]);
        TextView text102 = (TextView) findViewById(R.id.textView102);
        text102.setText("102. " + messages[101]);
        TextView text103 = (TextView) findViewById(R.id.textView103);
        text103.setText("103. " + messages[102]);
        TextView text104 = (TextView) findViewById(R.id.textView104);
        text104.setText("104. " + messages[103]);
        TextView text105 = (TextView) findViewById(R.id.textView105);
        text105.setText("105. " + messages[104]);
        TextView text106 = (TextView) findViewById(R.id.textView106);
        text106.setText("106. " + messages[105]);
        TextView text107 = (TextView) findViewById(R.id.textView107);
        text107.setText("107. " + messages[106]);
        TextView text108 = (TextView) findViewById(R.id.textView108);
        text108.setText("108. " + messages[107]);
        TextView text109 = (TextView) findViewById(R.id.textView109);
        text109.setText("109. " + messages[108]);
        TextView text110 = (TextView) findViewById(R.id.textView110);
        text110.setText("110. " + messages[109]);
        TextView text111 = (TextView) findViewById(R.id.textView111);
        text111.setText("111. " + messages[110]);
        TextView text112 = (TextView) findViewById(R.id.textView112);
        text112.setText("112. " + messages[111]);
        TextView text113 = (TextView) findViewById(R.id.textView113);
        text113.setText("113. " + messages[112]);
    }

    /* http://sms4smile.com/category/funny-sms/page/10/
    Latest new 1-75
     */
    public static String[] messages = {"Logic Questions:\n" +
            "1) When will a horse have 6 legs?\n" +
            "2) Where does Monday come before Sunday?\n" +
            "3) Where do u find a lot of cities without single house?\n" +
            "4) How can u double your money quickly?\n" +
            "\n" +
            "Amazing Answers:\n" +
            "1) When someone rides on the horse.\n" +
            "2) In a dictionary.\n" +
            "3) In a map.\n" +
            "4) Show it in front of a mirror."
            , "When trouble starts in your life your relatives \n" +
            "and friends will stand behind you! \n" +
            "If you do not believe this....... \n" +
            "See your wedding album.."
            , "New Generation Boys\n" +
            ".\n" +
            "Facebook Last Seen 8 Sec Ago\n" +
            ".\n" +
            "Whatsapp Last Seen 4 Sec Ago\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "But\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Textbook Last Seen 8 Months Ago"
            , "He.... \"My Wife is faster than Google...\n" +
            "She can say NO \n" +
            "even before I have finished asking the question!\""
            , "Interviewer: What is your name?\n" +
            "Girl: Ima.\n" +
            "Interviewer: But online application entry says Pornima?\n" +
            "Girl: I had applied on 31st July... before the ban!"
            , "This is your boss: \n" +
            "You are allowed to read the newspaper during the working hours \n" +
            "and do certainly not miss the job ads!"
            , "I have decided to leave my past behind, \n" +
            "so if I owe you money...\n" +
            "I am sorry but I have moved on."
            , "Facebook's 'Seen' \n" +
            "and Whatsapp's 'Last Seen' were designed to make everyone single!"
            , "One day I saw a lady in a mall...\n" +
            "So beautiful...\n" +
            "So attractive..\n" +
            "So stylish...\n" +
            "So smart...\n" +
            "I went near n near...\n" +
            "\n" +
            "My God...!!!\n" +
            "\n" +
            "It was mirror..."
            , "Height of work pressure in software industry : \n" +
            "\n" +
            "I was flashing my ID card instead of  unlocking the house door with keys.\n" +
            "Me and my friends went out for dinner in one of the best restaurants and as I finished I started walking towards the wash basin with Plates in my hand.\n" +
            "Once I was on call with my father and mom was not around. I went on to ask, \"Why is she not attending the weekly status call?\"\n" +
            "I don't login to Facebook, Youtube, etc.. at my personal internet connection at home... thinking it will be blocked any way. Till I realize that I am at home.\n" +
            "Once after talking to one of my friends I ended the conversation saying, \"Ok bye... in case of any issues will call you back\"\n" +
            "Sometimes when I mistakenly delete a message from my mobile, I hope for a second, maybe it's in the recycle bin !\n" +
            "Once I went to a pharmacy and asked for a tab. Pharmacist asked whether I want 250mg or 500mg? I replied 256mb. Thank god he didn't notice.\n" +
            "After a hectic week, went to a movie. In the middle of the movie, when I wanted to check the time, I kept repeatedly glancing at the bottom right corner of the Theater Screen.\n" +
            "\n" +
            "So avoid working so hard !\n" +
            "Have a great work-life balance.\n" +
            "\n" +
            "Lastly...\n" +
            "\n" +
            "An employee opens his tiffin box on the road side to see, whether he is going to office, or coming back from office."
            , "Dealing with idiots is like soccer.\n" +
            "You can use your head, \n" +
            "but a swift kick is usually more effective!"
            , "I hate when you offer someone a sincere compliment on their mustache \n" +
            "and suddenly she's not your friend anymore!"
            , "A thief broke into my house. He started searching for money. \n" +
            "\n" +
            "I woke up & started searching along with him.\n" +
            "\n" +
            "Happy Month End :P"
            , "A new generation kid's twitter update...\n" +
            "\n" +
            "\"Internet was not working last night, spent time with family.\n" +
            "They seem to be nice people....\" :P"
            , "That awkward moment \n" +
            "when you are smiling while texting\n" +
            "and your family member is staring at you"
            , "Girls who marry for money and guys \n" +
            "who marry for beauty are equally robbed in the end."
            , "If You Want People\n" +
            "To Give You Attention,\n" +
            "\"Bring A Pen With\n" +
            "You While Going To The Bank...\""
            , "Stock markets for dummies!\n" +
            "\n" +
            "There lived lot of monkeys in a village. \n" +
            "One day a merchant came to the village to buy these monkeys. \n" +
            "He announced that he will buy a monkey @ Rs. 100 each.\n" +
            " \n" +
            "The villagers thought that this man is mad.\n" +
            "They thought, how can somebody buy stray monkeys? Does anybody give 100 rupees for this useless monkeys?\n" +
            " \n" +
            "Some people caught some monkeys and gave it to this merchant and he gave 100 rupees for each monkey.\n" +
            "This news spread like wild fire and people caught monkeys and sold it to the monkey merchant.\n" +
            "After few days he announced that he will buy monkeys @ 200 each.\n" +
            "The lazy villagers ran around to catch the remaining monkeys and sold the remaining monkeys @200 each.\n" +
            " \n" +
            "Then the merchant announced that he would buy monkeys @500 each.\n" +
            "The villagers lost sleep. .They caught six or seven monkeys ,which were left and got 500 each? \n" +
            "The villagers were waiting anxiously for the next announcement.\n" +
            " \n" +
            "Then the merchant announced that he is going home for one week and when he returns, he?ll buy monkeys @ 1000 each?\n" +
            "He asked his employee to take care of the monkeys.\n" +
            "The employee was alone taking care of all the monkeys in a cage.\n" +
            "The merchant went home ?\n" +
            " \n" +
            "The villagers were very sad that .There were no monkeys left for them to catch & sell at 1000 rupees.\n" +
            "Then his employee told them that he will give some monkeys @700 each secretly. \n" +
            "This news also spread like fire since the merchant would buy monkeys @ RS 1000 each. That?s 300 profit for each monkey?\n" +
            " \n" +
            "The next day villagers made a queue near the monkey cage. \n" +
            "The employee sold all the monkeys at 700 each\n" +
            "The rich bought monkeys in lots. The poor also borrowed money from financiers and bought monkeys. \n" +
            "He sold all the monkeys @ 700 rupees .\n" +
            " \n" +
            "The villagers took care of their monkeys & waited for the merchant to return. But nobody came?\n" +
            "Then they ran to the employee. But he had already left.\n" +
            " \n" +
            "Then the villagers realized that they have bought the useless & stray monkeys @ 700 each.\n" +
            " \n" +
            "This is the business, we call the STOCK MARKET and the businessman was an FII that GOI gives concessions to.\n" +
            "\n" +
            "How is the story of stock market? no no... monkey market? If you like the story share with ur friends. Let them also laugh..."
            , "Crazy people on my Whats App list.\n" +
            "\n" +
            "1. Someone on his status \"Sleeping\" since 3 Days! \n" +
            "He's Probably dead. \n" +
            "\n" +
            "2. Someone is \"Driving\" since 9 days! \n" +
            "I guess he reached North Pole!\n" +
            "\n" +
            "3. Someone's status is \"Happy\" since 1 Month. \n" +
            "Living in Paradise?\n" +
            "\n" +
            "4. Someone is always 'Available'. \n" +
            "How free are you?\n" +
            "\n" +
            "5. From first day their status is, 'Hey there! I'm using WhatsApp' \n" +
            "I Know ! That's why you're on my list!\n" +
            "\n" +
            "6. Someone writes \"urgent calls only\".\n" +
            "Don't get it... Are u in the fire or ambulance service?\n" +
            "\n" +
            "7. Someone says, \"can't talk. Whatsapp only\". \n" +
            "Dude then throw away ur phone.. You are not using the phone's primary function \n" +
            "\n" +
            "8. Someone is 'at the movies' for the past 6 weeks. \n" +
            "Either he owns the theater or sells popcorn there.\n" +
            "\n" +
            "Pls share with your loved ones and make them to laugh about others status."
            , "What we can call Hindu GOD names in IT world.\n" +
            "\n" +
            "Brahma: ?System installer?\n" +
            "Vishnu: ?System operator?\n" +
            "Shiva: ?System programmer?\n" +
            "Narada: ?Data Transmitter?\n" +
            "Yama: ?Deleter?\n" +
            "Apsara & Rambha: ?Virus?\n" +
            "Ganapati: ?Anti virus?\n" +
            "Hanuman: ?E-Mail?\n" +
            "Chitragupta: ?Hard Disc?\n" +
            "Saraswati: ?Google\"\n" +
            "Parvati: ?Mother Board?\n" +
            "Lakshmi: ?ATM? :P:P"
            , "In a Nursery School Canteen...\n" +
            "\n" +
            "There's a basket of apples with a notice written over it :-)\n" +
            "\n" +
            "\"Do not take more than one, God is watching\"\n" +
            "\n" +
            "On the other counter there's a box of chocolates,\n" +
            "\n" +
            "A small child went & wrote on it.\n" +
            "\n" +
            "\"Take as many as U want, God is busy watching the apples\"...\n" +
            "\n" +
            "NEVER ACT SMART WITH Today's Generation..!.!"
            , "KID : Why some of ur hair are white dad...? \n" +
            "DAD : Every time you make me unhappy, one of my hair turns white?\n" +
            "KID : Now i understand why grandpa?s hairs are all white?\n" +
            "\n" +
            "Moral : Don't be over smart with today's generation...!"
            , "Position of husband is like a split A.C.\n" +
            "No matter how loud he is outside,\n" +
            "but inside the house,\n" +
            "he is designed to remain\n" +
            "silent, cool & controlled by remote."
            , "Wife:What is 10 years with me?\n" +
            "Husband:A second.\n" +
            "\n" +
            "Wife:What is $1000 for me?\n" +
            "Husband:A coin.\n" +
            "\n" +
            "Wife: Ok give me a coin.\n" +
            "Husband:Wait a second"
            , "Diff B/W Ignorance & selfcontrol?\n" +
            "\n" +
            "When u c mirror & u don't laugh at yourself,\n" +
            "that is ignorance!\n" +
            "\n" +
            "&\n" +
            "When i look at u & i don't laugh,\n" +
            "thats called self control:-)"
            , "Never KISS a lady police,\n" +
            "She will say, hands up.\n" +
            "\n" +
            "Never KISS a lady doctor,\n" +
            "She will say, Next please\n" +
            "\n" +
            "Always KISS a lady teacher,\n" +
            "She will say, repeat it 5 time"
            , "Man at medical store:I need poison\n" +
            "Chemist: I can't sell you that\n" +
            "\n" +
            "Man shows his marriage certificate\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Chemist: Oh! sorry,\n" +
            "I didn't knew u had a prescription."
            , "One Of The Best Quote,\n" +
            "Always have a\n" +
            "BACKUP\n" +
            "BEFORE\n" +
            "BREAKUP! :p"
            , "Attitude of girls:\n" +
            "\n" +
            "When a boy sends dirty sms\n" +
            "she laughs for 10 minutes,\n" +
            "forward dat to her friends n\n" +
            "then replies the boy.\n" +
            "\"i dont like that kind of sms ok?\" :p ;->"
            , "Aftr engagemnt!\n" +
            "Girl:\n" +
            "Now stop looking at girls,u r commited now!\n" +
            "\n" +
            "Boy:\n" +
            "Oho what do u mean,\n" +
            "if i m on diet,\n" +
            "that doesnt mean that i cant look at MENU . . :-D"
            , "Someone Asked Shakespeare:\n" +
            "\"U Married A Girl Elder Than U, Why?\"\n" +
            "\n" +
            "He Showed Him A Calendar N Said\n" +
            "\"A Week Has 7 Days;\n" +
            "Can U Say Which Day Is Younger,\n" +
            "Either Sunday Or Saturday ??\n" +
            "\n" +
            "So, Love Comes From Heart Not In Age\"\n" +
            "Love Has No Age.\n" +
            "\n" +
            "-MORAL:\n" +
            "Senior Girls R Also Available For Boys:P"
            , "If a boy gives a love letter 2 a gal, people call him \"Loffer\"\n" +
            "But if a gal gives a letter 2 a boy, they call it \"Offer\".\n" +
            "Feel the difference;)"
            , "Hey U Know\n" +
            "Which is the best day to propose a girl.. April 1\n" +
            "U Know Why??\n" +
            "If she accept its your luck\n" +
            "otherwise just tell April Foooooll."
            , "Friends r like fishes.\n" +
            "U have to sit patiently for a long time\n" +
            "to catch a good one.\n" +
            "Just like I caught u.\n" +
            "so better stay nice otherwise\n" +
            "I will FRY YOU..;)"
            , "Two devils came in 2 my dreams.\n" +
            "They said,\n" +
            "\"We want 2 disturb some good person.\"\n" +
            "I suggest them your name.\n" +
            "They said,\n" +
            "\"We cannot disturb our boss.\""
            , "After a quarrel, a husband said to his wife,\n" +
            "You know, I was a fool when I married you.\n" +
            "She replied, Yes dear, I know\n" +
            "but I was in love and didnt notice."
            , "Judge:why did u shoot ur wife\n" +
            "instead of shooting her lover?\n" +
            "\n" +
            "Sardar:Your honour,\n" +
            "it's easier to shoot a woman once,\n" +
            "than shooting one man every week."
            , "Impact of Movies:\n" +
            "\n" +
            "Teacher :- Who is Mahatma Gandhi?\n" +
            "\n" +
            "Student:- He is the one who helped\n" +
            "Munna Bhai to impress his girlfriend!"
            , "Buyer to seller : is it pure honey ?\n" +
            "How do I know if it is pure honey ?\n" +
            "Seller : give the dog some honey ..\n" +
            "if the dog doesn't lick it, it is pure honey\n" +
            "\n" +
            "Buyer :what if the dog licks it ?\n" +
            "Seller: so it is not a real dog."
            , "A Belated Teachers' Day\n" +
            "\n" +
            "Its A Humble Request\n" +
            "\"80% Of Teachers r\n" +
            "Suffering From Throat\n" +
            "Pain By Teaching Students.\"\n" +
            "So Plz\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "BUNK d Classes As Much\n" +
            "As Possible\n" +
            "n\n" +
            "Save Our Teachers"
            , "Man standing on the scale,\n" +
            "holding his stomach in.\n" +
            "Wife:I do not think that is going to help.\n" +
            "Man:Sure it does. How else could I see the numbers?"
            , "Boy: I Love You..?\n" +
            "Girl: Hahahahaha\n" +
            "\n" +
            "Boy: I Won't Live Without You..?\n" +
            "Girl: Hahahahahahaha\n" +
            "...\n" +
            "Boy: I Will Die For You..?\n" +
            "Girl: Hahahahahahahaha\n" +
            "\n" +
            "Boy: I Will Gift You A Gold Ring With Diamond..?\n" +
            "Girl: Awwwww.. Promise ?\n" +
            ".\n" +
            "Boy: Hahahahahahhahahahahahahaha"
            , "Question:\n" +
            "Why most of the engineering students\n" +
            "Can't clear all subjects in 1st attempt..?\n" +
            "?\n" +
            "?\n" +
            "?\n" +
            "Answer:\n" +
            "Smooth roads never make good drivers,\n" +
            "Clear sky never makes good pilots\n" +
            "&\n" +
            "Clearing all subjects in the 1st attempt,\n" +
            "Never makes good engineers."
            , "Height of Good Luck ...!\n" +
            "\n" +
            "Teacher: Hey! Stand up.\n" +
            "Tell me two pronouns.\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Student: Who? Me?\n" +
            "\n" +
            "Teacher: Very Good, Sit down :D"
            , "Height of confidence\n" +
            "\n" +
            "Once many professors were called and asked to sit in an airplane.\n" +
            "After they sat. They were informed that the plane is made by their students.\n" +
            "All of them ran and got out of plane exdcept one.\n" +
            "People asked him the reason\n" +
            "He said,\"If it's made by my students it will not even start.\""
            , "Last night was my fault,\n" +
            "my wife asked,\n" +
            "\"what's on the TV?\"\n" +
            "and ..... I said, \"dust!\""
            , "2 sardar were fixing a bomb in a car.\n" +
            "Sardar 1 : What would you do if the bomb explodes while fixing.\n" +
            "sardar 2 : Don't worry, I have a one more."
            , "Do u know whats A B C D E F G?\n" +
            "A Boy Can Do Everything For Girl\n" +
            "\n" +
            "Now reverse da order, can u guess the full form of: G F E D C B A ?\n" +
            "Girls Forgets Everything Done & Catches(new) Boy Again."
            , "A man sees a fat man\n" +
            "sitting in a train cabin.\n" +
            "\n" +
            "Taunting, he asks:\n" +
            "Is this cabin for elephants only!\n" +
            "\n" +
            "Fat man humbly replies:\n" +
            "No!Even monkeys like you can sit!"
            , "Promise me we are true friends\n" +
            "I am lamp you are light\n" +
            "I am Coke you are Sprite\n" +
            "I am Sawan you are badal\n" +
            "I am Normal you are Pagal\n" +
            "I am Water you are Tanki\n" +
            "I am Tarzan you are Monkey"
            , "U r a nice person...\n" +
            "but..U have to do 2 things early in the morning...\n" +
            "1st. pray to God so that u can live....\n" +
            "2nd.take a bath so that others can live...."
            , "Diner: I can't eat such a rotten chicken.\n" +
            "Call the manager!\n" +
            "Waiter: It's no use. He won't eat it either."
            , "Husband & wife are like liver and kidney.\n" +
            "Husband is liver & wife is kidney.\n" +
            "If liver fails, kidney fails.\n" +
            "If kidney fails, liver manages with other kidney."
            , "Sardar on phone:\n" +
            "\n" +
            "Doctor my wife is pergnant.She is having pain right now.\n" +
            "\n" +
            "Doctor: Is this her first child?\n" +
            "\n" +
            "Sardar: No this is her husband speaking."
            , "Waiter: Would you like your coffee black?\n" +
            "Customer: What other colors do you have?"
            , "What? is a difference between\n" +
            "a Kiss, a Car and a Monkey?\n" +
            "\n" +
            "A kiss is so dear,?\n" +
            "A car is too dear and\n" +
            "A monkey is U dear."
            , "Businessman explaining the reason for having 2 wives\n" +
            "\n" +
            "\"Monopoly is always damaging\n" +
            "\n" +
            "&\n" +
            "\n" +
            "Competition improves service\"."
            , "A Boy Was Going With His Girl Friend\n" +
            "\n" +
            "Friend Asked : Who Is She?\n" +
            "\n" +
            "Boy : My Cousin.\n" +
            "\n" +
            "The Frend Said: Last Year She Was My Cousin.! :D"
            , "Twinkle Twinkle little star,\n" +
            "You should know what you are,\n" +
            "\n" +
            "And once you know what you are,\n" +
            "Mental hospital is not so far."
            , "True Love is like a pillow.\n" +
            "U could HUG it when Ur in trouble.\n" +
            "U could CRY on it when Ur in pain.\n" +
            "U could EMBRACE it when Ur happy.\n" +
            "Want True Love?\n" +
            "Spend Rs.50 buy a Pillow."
            , "Sardarji to others:\n" +
            "Did anyone lose money wrapped in a rubber band?\n" +
            "One said, Yes I did\n" +
            "Sardar: Well, it's your lucky day,\n" +
            "I found the rubberband!"
            , "Doctor to sardar : You will die within 2 hours.\n" +
            "Do you want to see any one before you die?\n" +
            "Sardar : Yes. A good doctor."
            , "Style of break up:\n" +
            "Boy bought gift for His Girl friend-\n" +
            "GF:Wat the hell would I do with this rocket?\n" +
            "Boy: U wanted stars na?\n" +
            "Now sit on it and GET LOST:p"
            , "We will now upgrade your brain,\n" +
            "please wait....\n" +
            "Searching....\n" +
            "searching...\n" +
            "still searching....\n" +
            "Sorry,\n" +
            "NO BRAIN found...!"
            , "3 mistakes of everyone's life:\n" +
            "Twitter\n" +
            "Whatsapp\n" +
            "Facebook"
            , "I just want to sit down and watch a nice movie with a girlfriend.\n" +
            "Can anyone recommend...\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "a nice girlfriend?"
            , "After massive demand from all boyfriends..........\n" +
            "A new app called. \"Darr\" is launched in Mobile.....\n" +
            "You just say..... 'Girlfriend'..\n" +
            "and it immediately closes all websites,\n" +
            "hides all chats,,\n" +
            "shuts down all games,\n" +
            "and deletes chat history!\n" +
            "and best above all,\n" +
            "Last but not the least....\n" +
            "it puts your Girlfriend's photograph as a wallpaper.."
            , "If u Punch me,I dont mind\n" +
            "If u Punch me,I dont mind\n" +
            "If u Hurt me,I dont mind\n" +
            "If u Use bad language2 me,I dont mind\n" +
            "If u Insult me,I dont mind\n" +
            "Bcause U R MY \"ATM CARD\"."
            , "D.R.A.M.A. - (D)umb (R)etards (A)sking for (M)ore (A)ttention"
            , "Golfer: Young man, why did you keep looking at your watch?\n" +
            "Caddy: This isn't a watch, it's a Compass!"
            , "After Break up\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".They can't Be Friends As they have Hurt Each other,\n" +
            ".\n" +
            "They can't Be Enemies As Once they Loved Each other,\n" +
            ".\n" +
            "The Only Thing They can Be, Are the Most Familiar Strangers.!!"
            , "Money Can Buy A House Not Home \n" +
            "A Bed But Not Sleep, \n" +
            "Medicine But Not Health, \n" +
            "Money Is Dirty It Only Causes Pain And Suffering\n" +
            "Send Me All Ur Money And Be Happy!"
            , "A stupid boyfriend thought 'LOL' meant 'Lots of Love'. \n" +
            "So he sent this text to his girlfriend, \" \n" +
            "You are only girl of my life ...LOL\"."
            , "The quickest way to double your money is to fold it over and put\n" +
            "it back in your pocket.?"
            , "Wanna talk about Sodium?\n" +
            "Na\n" +
            "\n" +
            "Nitric Oxide?\n" +
            "NO\n" +
            "\n" +
            "Oxygen Magnesium Phosphorus Iodine Sulfur or Fluorine?\n" +
            "OMg PISS OFF\n" +
            "\n" +
            "Potassium?\n" +
            "K"
            , "Our phones are actually very smart. \n" +
            "We are feeding their batteries 24/7"
            , "If you want to be remembered after you die, \n" +
            "borrow money from everyone you know!"
            , "I'm still exhausted from my 2 mile jog. \n" +
            "And I went on it almost four months ago!"
            , "I humbly request all of group members to have a mini get-together at my home to finish stock of\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Maggi!"
            , "Crazy is a relative term... \n" +
            "you'll know after you met most of them!"
            , "Ladies, please stop wasting your time looking for Mr. Right, \n" +
            "just find Mr. Left \n" +
            "and drag the idiot to the Right."
            , "What's the similarity between an Income Tax Officer and a Caller Tune?\n" +
            "In both the cases,\n" +
            " one pays the money and the others enjoy."
            , "A good lecture should be like a Girl's mini skirt...\n" +
            "\n" +
            "Long enough to cover the subject &\n" +
            "short enough to create interest."
            , "Executives' Poem:\n" +
            "Baby Baby = Yes Papa\n" +
            "You become Manager = Yes Papa\n" +
            "Lot of tension = Yes Papa\n" +
            "Family Life = No Papa\n" +
            "B.P. Sugar = High Papa\n" +
            "Yearly Bonus = Joke Papa\n" +
            "Monthly Pay = Low Papa\n" +
            "Personal Life = Lost Papa\n" +
            "Weekly Off = Ha ha ha!"
            , "How to start your day with a positive outlook:\n" +
            "1. Open a new file in your PC.\n" +
            "2. Name it 'Boss'.\n" +
            "3. Send it to the RECYCLE BIN.\n" +
            "4. Empty!"
            , "A very caring sentence written on the T-shirt of a girl walking on the road:\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "\"You are not looking at the road, please be careful.."
            , "In a ladies KITTY PARTY MEETING :\n" +
            "\n" +
            "The host asked a question !\n" +
            "\n" +
            "When did you last say\n" +
            "I LOVE YOU to your husbands ??\n" +
            "\n" +
            "One said..today..\n" +
            "\n" +
            "other said...2 days back.....\n" +
            "\n" +
            "someone said...One week back...\n" +
            "\n" +
            "Host :\n" +
            "\"Now, all of you send\n" +
            "I LOVE YOU msg to your husbands.\n" +
            "\n" +
            "Who ever gets AWESOME reply will get a SURPRISE GIFT.!\n" +
            "\n" +
            "Everyone send\n" +
            "I LOVE YOU\n" +
            "msg to their husbands.\n" +
            "\n" +
            "After sometime, HUSBAND'S\n" +
            "replies which came are as given below.....\n" +
            "\n" +
            "Person 1 :\n" +
            "SWEETY.... Is your health condition Ok???\n" +
            "\n" +
            "Person 2 :\n" +
            "You have Not cooked Food Today Too?\n" +
            "\n" +
            "Person 3 :\n" +
            "Darling, are you out of balance for the money given for the month ?\n" +
            "\n" +
            "\n" +
            "Person 4 :\n" +
            "What's the matter??\n" +
            "\n" +
            "Person 5 :\n" +
            "Are you dreaming or am I ?\n" +
            "\n" +
            "\n" +
            "Person 6 :\n" +
            "Did you like someone's Jewelry in the function you attended today?\n" +
            "\n" +
            "Person 7 :\n" +
            "I am already tensed in the Office and now you are sending msgs like this...\n" +
            "Do you have brains?\n" +
            "\n" +
            "\n" +
            "Person 8 :\n" +
            "How many times did I tell you not to watch those serials ??\n" +
            "\n" +
            "Person 9 :\n" +
            "Oho..did you have an accident again ....Hope my Car is ok...?\n" +
            "\n" +
            "Person 10 :\n" +
            "Should I pick kids from school today also??\n" +
            "\n" +
            "\n" +
            "Last - Who won the SURPRISE GIFT,\n" +
            "\n" +
            "\n" +
            "And msg is........\n" +
            "\n" +
            "Person 11 :\n" +
            "\n" +
            "Who is this ..sending msgs from my wife's mobile???"
            , "I hate it when people text me: \"Call me\"\n" +
            "I'm gonna start calling people and when they answer, \n" +
            "I'm gonna say - \"Text me\"; and hang up!"
            , "Everytime, When i see Maruti Omni\n" +
            "I feel that Someone is Kidnapped...."
            , "At a multiplex:\n" +
            "Customer: One veg burger please.\n" +
            "Attendant: Sir, do you want me to vomit?\n" +
            "Customer: What?\n" +
            "Attendant: Shall I vomit, Sir?\n" +
            "6 seconds of long pause.\n" +
            "Customer: Oh ya ya, please warm it!"
            , "Teacher: Everyone write your lover's name on paper.\n" +
            "After 5 seconds:\n" +
            "Boys say: Likh Liya, Madam.\n" +
            "After 10 minutes, girls say: \n" +
            "Please extra sheet, M'am!"
            , "Early to bed\n" +
            "And Early to rise\n" +
            "It makes you heathy, wealthy and wise......\n" +
            "Now its not possible to say this......\n" +
            "Bcoz we want tastes.....\n" +
            "If I ask this Question\n" +
            "\"what rice that you eat everyday?\"\n" +
            "how do you answer.......\n" +
            "1. Fried rice\n" +
            "2. Jeera rice\n" +
            "3. Red Rice\n" +
            "4. Polua rice\n" +
            "5. Sticky rice\n" +
            "6. Plain Rice\n" +
            "7. Biryani rice\n" +
            "or traditional rice and so on so forth ......\n" +
            "It is a big big problems for you and me........."
            , "After Robbing The Bank, 1 Robber\n" +
            "To Clerk : Did You See Me Robbing?\n" +
            "Clerk : Yes I Saw U.\n" +
            "Robber Killed Him And Asked\n" +
            "To The Next Clerk : Did U? Second\n" +
            "Clerk : No, But My Wife Saw U!!"
            , "Lady 1: I suppose you carry a memento of some sort in that locket of yours?\n" +
            "Lady 2: Yes, it is a lock of my husband's hair.\n" +
            "Lady 1: But your husband is still alive?\n" +
            "Lady 2: Yes, but his hair are gone!"
            , "Earlier people used to remove their hats to give respect\n" +
            "And?\n" +
            "Our new generation?\n" +
            ".\n" +
            ".\n" +
            "Removes head phones to give respect..!!!"
            , "Oxymoron: An Oxymoron is defined as a phrase in which two words of opposite meanings are brought together....\n" +
            " \n" +
            "Here are some funny oxymoron's :\n" +
            "1) Clearly Misunderstood.\n" +
            "2) Exact Estimate.\n" +
            "3) Small Crowd.\n" +
            "4) Act Naturally.\n" +
            "5) Found Missing.\n" +
            "6) Fully Empty.\n" +
            "7) Pretty Ugly.\n" +
            "8) Seriously Funny.\n" +
            "9) Only Choice.\n" +
            "10) Original Copies...\n" +
            "\n" +
            "And ppl say the Mother of all Oxymorons is- \n" +
            "\n" +
            "11) \"Happily Married\" ! :P"
            , "We keep learning life lessons every day.\n" +
            "I recently learnt that it's best \n" +
            "to value those who value you.\n" +
            "No wasting time for ungrateful ones."
            , "!!! Very important News !!!\n" +
            "!!! Warning !!!\n" +
            "\n" +
            "Dear friends and relatives...\n" +
            "\n" +
            "Don't eat Ibaco Ice cream\n" +
            "Amul ice cream products...\n" +
            "KFC products...\n" +
            "Dominos products...\n" +
            "Dairymilk products...\n" +
            ".\n" +
            "\n" +
            "\"Without me\" :P"
            , "Santa: Why are you always at the bottom of your class?\n" +
            "Pappu: It doesn't make any difference. \n" +
            "They teach the same thing at both ends!"
            , "How Time Has Changed.\n" +
            "1999 Kids : I want my bed near Window\n" +
            "to see the moon & stars.\n" +
            "2015 Kids : I want my bed near the\n" +
            "mobile charging slot.."
            , "One afternoon a wealthy manager was driving in his limousine when he saw two men along the roadside eating grass. Disturbed by the sight, he ordered his driver to stop and he got out to investigate. He asked one man \"Why are you eating grass?\"\n" +
            "\n" +
            "\"We don't have any money for food,\" the poor man replied. \"We have to eat grass.\" \"Well, then, you can come with me to my house and I'll feed you\" the manager said.\n" +
            "\n" +
            "\"But sir, I have a wife and five children with me. They are over there, under that tree\".\n" +
            "\n" +
            "\"Bring them along,\" the manager replied. Turning to the other poor man he stated, \"You come with us also.\"\n" +
            "\n" +
            "The second man, in a pitiful voice then said, \"But sir, I also have a wife and seven children with me!\"\n" +
            "\n" +
            "\"Bring them all, as well,\" the manager answered.\n" +
            "They all entered the car, which was no easy task, even for a car as large as the limousine was. \n" +
            "\n" +
            "Once underway, one of the poor fellows turned to mr. Manager and said, \"Sir, you are too kind. Thank you for taking all of us with you.\"\n" +
            "\n" +
            "The manager replied, \"Glad to do it. You'll really love my place; the grass is almost  1 meter high!\" \n" +
            "\n" +
            "Lesson: Never trust managers... and there is nothing like KIND MANAGERS \n" +
            "\n" +
            "Dedicated to all managers!"
            , "Good Behaviour can cover the lack of Beauty.\n" +
            "But Beauty can never cover the Lack of Good Behaviour..."
            , "An Optimistic Answer By Broken Heart Boy.\n" +
            ".\n" +
            ".\n" +
            "You Broke My Heart Into Many Pieces.\n" +
            "Thanks Now I Can Give Them To Many Girls."
            , "A boy called to Vodafone customer care... \n" +
            "\n" +
            "Girl picked up the phone.\n" +
            "\n" +
            "Girl : Welcome to the Vodafone Customer care \n" +
            "\n" +
            "Boy : Thank you.\n" +
            "\n" +
            "Gilr : How may i Help you ?\n" +
            "\n" +
            "Boy : Would you like to marry me ?\n" +
            "\n" +
            "Gilr : Sir, you dialed wrong number\n" +
            "\n" +
            "Boy : No No, i dialed correct number only, will you marry me ?\n" +
            "\n" +
            "Girl : No, i'm not interested in marriage \n" +
            "\n" +
            "Boy : Hello Madam, listen please\n" +
            "\n" +
            "Girl : Not interested\n" +
            "\n" +
            "Boy : If you do love marriage, then i will take to you to LONDON . Or Honkong for arrange marriage.\n" +
            "\n" +
            "Girl : Hello, i'm not interested in marrying you. Then why are giving me these offers ?\n" +
            "\n" +
            "Boy : Court marriage expense 10,000rs, Normal Marriage expense 2,00,000rs, Muslim style in only 2000rs\n" +
            "\n" +
            "Girl : Why are you not understanding me, i'm not interested in marring you...\n" +
            "\n" +
            "Boy : So, now you realised our pain, When we are NOT interested in any plans/offers. why do you keep on calling us..."
            , "Nice Lines:\n" +
            "\n" +
            "Love Is Like A Sweet Dream.\n" +
            "And Marriage Is An Alarm Clock.\n" +
            "So Enjoy Sweet Dreams \n" +
            "Until Ur Alarm Wakes U Up..!"
            , "Must Remember Before Getting Married\n" +
            "Marriages Maybe Made In Heaven.\n" +
            "But, Maintenance Charges Are Paid On Earth..!"
            , "Words Written Above A Classroom Clock\n" +
            "This Clock Will Never Be Stolen,\n" +
            "because Too Many Students Are Watching It..!"
            , "Never make a women cry...\n" +
            "There is nothing more expensive than a female tear\n" +
            "\n" +
            "When a single drop comes out, \n" +
            "it first mixes with 'Loreal' eyeliner (Rs.650) &\n" +
            "'Dior' mascara (Rs.2500)...\n" +
            "\n" +
            "Then when it rolls down the cheek,\n" +
            "it mixes with 'D&G' blusher (Rs.2500)...\n" +
            "\n" +
            "& \n" +
            "\n" +
            "finally when it touches the lips,\n" +
            "it gets mixed with 'Maybelline' lipstick (Rs.350)...\n" +
            "\n" +
            "This means that a single drop is ruining Rs.6000\n" +
            "Pls don't make them cry guys... \n" +
            "It wld b difficult to afford it ...!\n" +
            "\n" +
            "Issued in public interest ! :P"
            , "Akbar called Birbal and asked, like there are Brilliant people in his State will there be Idiots available?. \n" +
            "\n" +
            "Birbal said there will be.\n" +
            "\n" +
            "Akbar then ordered Birbal to go around the State search and bring 5 of such Idiots and present to him in the Council.\n" +
            "\n" +
            "Birbal was awestruck since you can identify brilliant people by conducting some form of competition, but how to identify Idiots.\n" +
            "\n" +
            "However he goes around the State and after a month comes back with 2 such people. There after following is the conversation between Akbar and Birbal\n" +
            "\n" +
            "Akbar: Dear Minister I think you are poor in counting, I asked for 5 people and you have brought only 2.\n" +
            "\n" +
            "Birbal: Your Highness please let me explain and then you will know yourself\n" +
            "\n" +
            "Akbar: OK. Go ahead\n" +
            "\n" +
            "Birbal: When I was going around the State I found this guy carrying a huge Gunny Bag on his head and travelling in a Bullock Cart. When I asked he said that if he keeps the bag in the Cart it will be overloaded and hurt the Bulls. I realised he is the 5th Idiot and brought him to you.\n" +
            "\n" +
            "Akbar: Excellent. Next\n" +
            "\n" +
            "Birbal: I saw the other guy was taking his Buffalo to the roof top of his house for grazing where grass was found grown. I realised he is the 4th Idiot and brought him to you.\n" +
            "\n" +
            "Akbar: Fine. Next.\n" +
            "\n" +
            "Birbal: When there are so many problems in the functioning of this kingdom, leaving those entire aside I have been going around the State for a month wasting my time in searching for Idiots, hence I am the 3rd Idiot.\n" +
            "\n" +
            "Akbar: Laughs out loud. Next.\n" +
            "\n" +
            "Birbal: Instead of solving all the problems that are there in the Kingdom, you have been looking for Idiots in your State, hence you are the 2nd Idiot.\n" +
            "\n" +
            "Hearing this entire Council was scared and there was pin drop silence.\n" +
            "\n" +
            "Akbar: Fine there is truth in your statement. Who is the 1st Idiot?\n" +
            "\n" +
            "Birbal: Your Highness when there are so much of work in the Office and Home to attend to, leaving all this aside person who is reading this Story to know who is the 1st Idiot is the 1st idiot. :P"
            , "Great lines by K V Ramachandran Nair:\n" +
            "\n" +
            "\"Change cannot be given to you every time. You must bring the change.\"\n" +
            "\n" +
            "\n" +
            "Who's K V Ramachandran Nair?\n" +
            "He is a bus conductor. Now read it again!! :P"
            , "Singing in the shower is all fun \n" +
            "and games until you get shampoo in your mouth...\n" +
            "Then it just becomes a Soap Opera!"
            , "Me: Why am I still single?\n" +
            "Brain: You're weird as shit.\n" +
            "Body: And you're fat.\n" +
            "Face: Plus you're ugly.\n" +
            "Food: But I'm here for you!"
            , "Employee: I want Hike.\n" +
            "Boss: Install it from 'Play Store'."
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
                .setCategory("Funny Messages")
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

    public void copy106(View view) {
        String a = messages[105];
        copyToClipboard(a);
    }

    public void copy107(View view) {
        String a = messages[106];
        copyToClipboard(a);
    }

    public void copy108(View view) {
        String a = messages[107];
        copyToClipboard(a);
    }

    public void copy109(View view) {
        String a = messages[108];
        copyToClipboard(a);
    }

    public void copy110(View view) {
        String a = messages[109];
        copyToClipboard(a);
    }

    public void copy111(View view) {
        String a = messages[110];
        copyToClipboard(a);
    }

    public void copy112(View view) {
        String a = messages[111];
        copyToClipboard(a);
    }

    public void copy113(View view) {
        String a = messages[112];
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
                .setCategory("Funny Messages")
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

    public void share106(View view) {
        String a = messages[105];
        shareIntent(a);
    }

    public void share107(View view) {
        String a = messages[106];
        shareIntent(a);
    }

    public void share108(View view) {
        String a = messages[107];
        shareIntent(a);
    }

    public void share109(View view) {
        String a = messages[108];
        shareIntent(a);
    }

    public void share110(View view) {
        String a = messages[109];
        shareIntent(a);
    }

    public void share111(View view) {
        String a = messages[110];
        shareIntent(a);
    }

    public void share112(View view) {
        String a = messages[111];
        shareIntent(a);
    }

    public void share113(View view) {
        String a = messages[112];
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
                .setCategory("Funny Messages")
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
                .setCategory("Funny Messages")
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
                .setCategory("Funny Messages")
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