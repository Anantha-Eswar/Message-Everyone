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
 * Created by Anantha Eswar on 9/26/2015.
 */
public class Exam extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Exam Messages");

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

    /* http://wishesmessages.com/good-luck-messages-for-exams-best-wishes-for-exams/
    http://sms4smile.com/category/exam-sms/page/7/
    Latest new 1 to 75

    */
    public static String[] messages = {"The best way to motivate yourself is to stop stressing about what’ll happen when things go wrong and start thinking about how awesome life will be when they go right. Good luck."
            , " Exams are like ex-boyfriends and ex-girlfriends. Their thoughts harass you until late at night, turn your life upside down and cut you off from the rest of the world. All you can do is get over them as quickly as you can. Good luck."
            , "As your girlfriend, it is my responsibility to wish you good luck for your exams with a hug and reward you with a sweet kiss if you do well. Here’s a hug and I hope that you earn your kisses. All the best."
            , "The easiest way to do well in your exams is to treat them like a giant punching bag. Use all the strength of your memory and punch the daylight of your tests. All the very best."
            , "Everyone knows you are the best student out there. All you need to do is work hard and revise with care. Good luck."
            , " Let your hard work propel you to a speed so fast that good luck has no choice but to ride with a winner like you. All the best for your exams."
            , "Nothing can stop you from doing your best, nothing can pull you down – as long as you start studying hard and stop fooling around. Good luck."
            , "Don’t let shabby grades smear your beautiful personality. Good luck."
            , "If you hate any of your teachers for giving you detention, this is your chance to get back them by scoring well and earning their admiration. Good luck for your exams."
            , "If the stress of an exam is bringing you down, just think of studying hard as falling on a trampoline. The harder you fall, the higher you will rise. All the best."
            , "Luck is for the lazy, success is for those who work hard."
            , "Exams don’t test your knowledge as much as they test your state of mind. Be relaxed and calm down, I am sure you will do fine. Best wishes to you."
            , "Luck is a funny thing because sometimes it can be good and sometimes it can be bad. So take matters in your own hand, study hard and stop relying on something so fickle. All the best."
            , "These exams are your opportunity at proving your worth to everyone around you. Grab it and do your best, don’t let it pass through. Good luck."
            , "An exam is not just about finishing just another paper. It is a chance to do well and silence your naysayers. Good luck."
            , "Tomorrow is my exam\n" +
            "But I don't care\n" +
            "Because a single sheet of paper\n" +
            "can't decide my future."
            , "Wats d height of hope??\n" +
            "It is: sittin in d exam hall,\n" +
            "holdin d question paper in hand\n" +
            "n tellin ur self\n" +
            "\"dude,dnt worry.\n" +
            "Exams wil get postponed!\""
            , "A Thermometer is not the only thing\n" +
            "that gets a \"DEGREE\" without having a \"BRAIN\"...! :p\n" +
            "\n" +
            "A silent msg f0r all studnts;-)"
            , "To accomplish great things,\n" +
            "We must not only act,\n" +
            "But also dream,\n" +
            "Not only plan but also believe,\n" +
            "Best wishes for your exam."
            , "WHY STUDENT FAIL?\n" +
            "Sundays-52 in a year,Days left 313\n" +
            "Summer holidays 50,Days left 263\n" +
            "8 hrs daily sleep-130 days GONe, Days left 141\n" +
            "1 hr daily playing means 15 days,Days left 126\n" +
            "2 hrs daily for eating means 30 days.Days left 96,\n" +
            "1 hr talking means 15 days.,Days left 81\n" +
            "Exams days 35 days,Days left 46\n" +
            "Eid & Gov holidays 20, Days left 26\n" +
            "Movies,TV at least 25 days,Days left 1\n" +
            "That 1 day is your BIRTHDAY."
            , "Question: \"How to kill an ant?\"\n" +
            "\n" +
            "Asked in an exam for 10 marks!\n" +
            "\n" +
            "Student:\n" +
            "Mix chilli powder with sugar,\n" +
            "&\n" +
            "Keep it outside the ant's hole\n" +
            "\n" +
            "After eating,\n" +
            "ant will search for some water near a water tank.\n" +
            "Push ant in to it!\n" +
            "Now ant will go to dry itself near fire,\n" +
            "When it reaches fire, put a bomb into d fire!\n" +
            "Then admit wounded ant in icu!\n" +
            "And then\n" +
            "remove oxygen mask from it's mouth and kill the ant :-|\n" +
            "\n" +
            "Moral:\n" +
            "Don't play with students!\n" +
            "They can do any thing for 10 marks"
            , "uestion:\n" +
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
            , "Height of confidence\n" +
            "\n" +
            "Once many professors were called and asked to sit in an airplane.\n" +
            "After they sat. They were informed that the plane is made by their students.\n" +
            "All of them ran and got out of plane exdcept one.\n" +
            "People asked him the reason\n" +
            "He said,\"If it's made by my students it will not even start.\""
            , "Rain of summer, snow of winter,\n" +
            "grace of autumn, glory of spring,\n" +
            "May beauty of every season\n" +
            "give ur heart a beautiful reason 2 smile.\n" +
            "May God suceed u in every exams of ur life.\n" +
            "Good luck & all the best"
            , "Air and students have the same mentality\n" +
            "Dont you know how ?\n" +
            "\n" +
            "Both keep turning book's pages without reading"
            , "The most \"hungry + sad\" moment\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "When you're sitting in the examination hall,\n" +
            "feeling hungry\n" +
            "&\n" +
            "then the invigilator is served\n" +
            "hot \"tea with samosas\"."
            , "The funniest situation in student life\n" +
            "when we have no idea what to write\n" +
            "in the exam paper n the supervisor comes\n" +
            "and\n" +
            "says, \"please cover your answer sheet\" :P"
            , "According to newton's 4th law for exams-\n" +
            "every book will continue to be at rest\n" +
            "or covered with dust\n" +
            "until some\n" +
            "external or internal exam moves it!"
            , "A student grabbed a coin,\n" +
            "\n" +
            "Flipped it in the air & said,\n" +
            "\"Head, I go to sleep.\"\n" +
            "\n" +
            "Tail, I watch a movie.\n" +
            "\n" +
            "If it stands on the edge I'll study:p"
            , "eXams are there,\n" +
            "at the paper u stare;\n" +
            "the answer is nowhere,\n" +
            "which makes u pull ur hair.\n" +
            "The teachers make u glare,\n" +
            "the grades r not fair,\n" +
            "but just like the past 20 yrs,\n" +
            "WE DONT CARE !!"
            , "80% Of The Final Exam Will Be Based On\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "The One Lecture You Missed\n" +
            "And\n" +
            "The One Topic You Didn't Read."
            , "All i want you is to be courageous\n" +
            "Be calm and\n" +
            "be self equipped with facts and figures\n" +
            "to conquer this exams battle.\n" +
            "\n" +
            "I wish you is best of luck in your exams"
            , "There are two type of studies:\n" +
            "\n" +
            "1 - hard subjects which Cannot be studied.\n" +
            "2 - easy subject that Doesn't need to be studied"
            , "Little johnny: Mam,will you punish me\n" +
            "for something that I didn't do ?\n" +
            "\n" +
            "Teacher : Not at all.\n" +
            "\n" +
            "Little johnny : That's good.\n" +
            "Actually i didn't do my homework!"
            , "Height of coolness:\n" +
            "2 Guys coming out of the examination Hall with chips and coke in hands....\n" +
            "1st guy:which paper was it?\n" +
            "2nd guy:I think maths......\n" +
            "1st guy:(surprisingly) you read the question paper?\n" +
            "2nd guy: no I see a girl sitting besides me using calculator:>"
            , "A Good Teacher Is Who\n" +
            "Tells To Study Hard...\n" +
            "\n" +
            "But,,\n" +
            "\n" +
            "A Best Teacher Is Who\n" +
            "Stands Outside D\n" +
            "Examination Hall N Shouts. . ."
            , "A GENIUS\n" +
            "Is A Person\n" +
            "Who Can Do For\n" +
            "$1 What Any Fool Can\n" +
            "Do For $100\"\n" +
            "\n" +
            "-As Such V Complete\n" +
            "Syllabus In 1 Day,\n" +
            "That Lecturers\n" +
            "Try In 1 Semester !!"
            , "Human brain is the most\n" +
            "outstanding object in world.\n" +
            "It functions 24 hours a day,\n" +
            "365 days a year.\n" +
            "It functions right from the time we are born,\n" +
            "and stop only when we enter the examination hall."
            , "Congratulations!\n" +
            "Good news for our University students\n" +
            "Exams of Uni have been postponed upto june\n" +
            "To confirm goto site\n" +
            "www.stopdreaming&startstudying.com"
            , "SILENCE\n" +
            "Is d best Answer\n" +
            "for all questions\n" +
            "\n" +
            "SMILE\n" +
            "Is d best Reaction\n" +
            "in all situations\n" +
            "\n" +
            "Unfortunately\n" +
            "\n" +
            "BOTH Never Help In\n" +
            "any EXAM, VIVA, REVIEW & INTERVIEW :P:)"
            , "\"The probability of a topic\n" +
            "coming in exam increases exponentially,\n" +
            "if one decides to leave the topic completely....\""
            , "AN ANALOGY FOR ALL COLLEGE LECTURERS:\n" +
            "\n" +
            "They teach us to make \"PLAIN RICE\" in class\n" +
            "&\n" +
            "expect from us to cook \"BIRYANI\" in exams...!! "
            , "The Shortest Relationship\n" +
            "Ever Is Between\n" +
            "Students & Books . . .\n" +
            "They Commit 0ne Day\n" +
            "Before Exam\n" +
            "&\n" +
            "After Exam Break Up ! !"
            , "To b A \"Gud ProfesionaL\" aLways Start to study Late for \"Exams\"\n" +
            "Bcoz,\n" +
            "it Teaches how 2 Manage \"Time\" &\n" +
            "TackLe \"Emergencies\"!\n" +
            "Think Different"
            , "Exams are like GIRL FRIENDS\n" +
            "\n" +
            "1 Too Many Questions.\n" +
            "2 Difficult to Understand.\n" +
            "3 More Explanation is Needed.\n" +
            "4 Result is always FAIL!"
            , "Lovely days in my life :\n" +
            "Childhood days,\n" +
            "School days\n" +
            "&\n" +
            "collage days,\n" +
            "\n" +
            "Horrible days in my life :\n" +
            "\"only exam days\""
            , "A last minute SIX\n" +
            "A last minute GOAL\n" +
            "A last minute MOVE\n" +
            "often wins the GAME!\n" +
            "That's why we are still confident that...\n" +
            "\"A Last-Night Study can win an EXAM\" !"
            , "If Class Is Not A Place To Sleep..\n" +
            "Then Home Is Not A Place To Study.\n" +
            "\n" +
            "A Student Service Msg...!"
            , "A good teacher according to students is 1 who :\n" +
            "\n" +
            "-Should Be Absent At Least 3 Times A Week\n" +
            "-Should Come In Class 10mins Late And Left The Class 10 Mins Earlier\n" +
            "-Should Not Give Any Homework And Assignments\n" +
            "-Should Not Ask Any Questions To Students\n" +
            "-Should Not Disturb The Students By Teaching While They Are Talking"
            , "Why We Sometimes Write \"Etc\" In Exams?\n" +
            "Because It Means.\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "E-End Of\n" +
            "T-Thinking\n" +
            "C-Capacity\n" +
            "\n" +
            "But Teacher Won't Ever Understand Our FEelings..."
            , "What is the true meaning of 'Study'??\n" +
            ".\n" +
            ".\n" +
            "S. Sleeping\n" +
            "T. Talking\n" +
            "U. Unlimited sms\n" +
            "D. Dreaming\n" +
            "Y. Yaani mast life\n" +
            "\n" +
            "SO carry on study..!! Plzzzzz."
            , "My nights are going sleepless,\n" +
            "my days are going useless.\n" +
            "So I asked GOD,\n" +
            "�is this love?�\n" +
            "GOD replied,\n" +
            "�no dear, result is near�"
            , "I Cried When I Failed\n" +
            "In 2 Subjects,\n" +

            ".\n" +
            "But\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "I laughed When I Came To\n" +
            "Know My Friend Failed In 5\n" +
            "Subjects... ;-) :-P"
            , "The most unfulfilled desire\n" +
            "Of all science students is\n" +
            "A bomb should have\n" +
            "Fallen instead of\n" +
            "An apple on newton!"
            , "Question by a student !!\n" +
            "If a single teacher can't\n" +
            "teach us all the subjects,\n" +
            "Then...\n" +
            "How could you expect a single student\n" +
            "to learn all subjects ?"
            , "Cricket is getting excited day by day with the introduction of ICL n T20...\n" +
            "\n" +
            "Same rules should be applied in Examz!\n" +
            "\n" +
            "(1) Exams Timing Should Be Reduced To One Hour.\n" +
            "\n" +
            "(2) Power Play - No Invigilator In Exam Hall For 1st 15 mins.\n" +
            "\n" +
            "(3) Cheer Leaders - To Dance After Every Right Answer Written.\n" +
            "\n" +
            "(4) Strategic Time-Out - Time For Students For Discussion.\n" +
            "\n" +
            "(5) Super Over - Chance For Students To Form Their Own Question. :-)"
            , "It takes 15 trees to\n" +
            "produce the amount\n" +
            "of paper that we\n" +
            "use to write one exam.\n" +
            "\n" +
            "join us in promoting the noble\n" +
            "cause of saving trees.\n" +
            "SAY NO TO EXAMS."
            , "Exams Should Be Given On\n" +
            "Either Facebook Or On Phone, \n" +
            "Instead Of Sheets.\n" +
            "Bcoz,\n" +
            "Today's Student\n" +
            "Have More Typing Speed\n" +
            "Than Writing Speed..!"
            , "Thousand Words Of A Teacher Do Not Hurt\n" +
            "But The Silence Of A Friend In The,\n" +
            "Examination Hall Brings Tears Into The Eyes."
            , "Don't stress\n" +
            "Do your best\n" +
            "Forget the rest\n" +
            "All the best."
            , "Attitude During Exam:\n" +
            "\"They Gave The Questions \n" +
            "Which I Don't Know..\n" +
            "So I Wrote Answers \n" +
            "Which They Don't Know..!\""
            , "2 days before the exam, \n" +
            "they refer to foreign Authors;\n" +
            "1 day before exam, \n" +
            "they refer to local Authors;\n" +
            "On the day of exam, \n" +
            "they are the Authors!"
            , "Unfortunately, \n" +
            "our education system does not teach us teamwork.\n" +
            "When we solve our exams in group discussion with others, \n" +
            "they call it copying!"
            , "Unfortunately, \n" +
            "our education system does not teach us teamwork.\n" +
            "When we solve our exams in group discussion with others, \n" +
            "they call it copying!"
            , "Exams are there, \n" +
            "at the paper I continuously stare;\n" +
            "The answer is nowhere, \n" +
            "which makes us pull our hair;\n" +
            "The teachers make you glare, \n" +
            "the grades are not fair;\n" +
            "But just like the past all the years, \n" +
            "I simply don't care!"
            , "I heartily congratulate you on your tremendous success in the board exams.\n" +
            "May you always shine in your life and make an excellent career!\n" +
            "Best wishes for your success!"
            , "Teacher: Pappu, what do you want to be when you grow up?\n" +
            "Pappu: A good professional Manager.\n" +
            "Teacher: Good. But you must start working towards it.\n" +
            "Pappu: Ma'm, I already have... by studying late for Exams as it teaches me to manage Time and tackle Emergencies!"
            , "Pappu left the examination Hall within 15 minutes.\n" +
            "Examiner: What happened? You don't know the answers?\n" +
            "Pappu: No No. Nothing like that. It's that I have to prepare for the next Exam!"
            , "In IIT exam, Pappu writing a test.\n" +
            "Prove Sin x = 6n\n" +
            "Pappu cancelled 'n' from both the sides.\n" +
            "Thus: Six = 6\n" +
            "He finally wrote a note: Please try to maintain the standards of IIT!"
            , "Pappu during the Maths examination to his Teacher: Sir, what's the date today?\n" +
            "Teacher: Never mind the date. The exam answers are more important.\n" +
            "Pappu: Well Sir, I wanted to have something right on my paper!"
            , "Pappu in Bio Practical Exam.\n" +
            "Examiner: See the bird's leg and tell name?\n" +
            "Pappu I don't know.\n" +
            "Examiner: You have failed. What's your name?\n" +
            "Pappu: See my legs!"
            , "Whenever I eat the TV & watch the food\n" +
            "I bake the books & study cakes\n" +
            "I switch off the bed & sleep on fan..\n" +
            "This is my condition when I think about result :-("
            , "Exam Patterns 1995 To 2020:\n" +
            "\n" +
            "1995: ?Answer All Questions?\n" +
            "\n" +
            "2000: ?Answer Any 5 Questions?\n" +
            "\n" +
            "2010: ?Answer Either A (Or) B?\n" +
            "\n" +
            "2015: ?Atleast Read The Questions?\n" +
            "\n" +
            "2020: ?Thanks For Coming?:D:D"
            , "New way of writting answers in exams.\n" +
            "If you don't know the answer,\n" +
            "then put lines like this : |||||||||| and write below : ?Scratch here for ANSWERS?"
            , "Special offer..Bring a chit on exam day,\n" +
            "scratch and show it to your nearest teacher and\n" +
            "win free trip to Principal's office and enjoy 3 years vacation at home.\n" +
            "Hurry offer valid until exams only.."
            , "Dad: if u Pass in the exam i will Present u 1 Cycle.\n" +
            "Son: if i fail?\n" +
            "Dad: i will Present 10 Cycle.\n" +
            "Son: why?\n" +
            "Dad: To Open Cycle Shop."
            , "Smoking Effects Lips\n" +
            ".\n" +
            ".\n" +
            "Drinking Effects Liver\n" +
            ".\n" +
            ".\n" +
            "Love Effects Heart\n" +
            ".\n" +
            ".\n" +
            "|But|\n" +
            ".\n" +
            ".\n" +
            "The Most Danger 1 Is Study .\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "It Effects The Brain,\n" +
            "Direct Komma\n" +
            "Avoid It & Enjoy Life !!"
            , "Here?s Wishing You\n" +
            "All The Best For Your Exams.\n" +
            "May You Succeed\n" +
            "In Everything You Do!"
            , "7 things Boys do in an Exam Hall:\n" +
            "\n" +
            "1. Count the No. of Girls\n" +
            "2. Check Out the Young Lady Supervisor\n" +
            "3. Counting How Many Windows n Doors\n" +
            "4. Revising the Location of Chits in the Pockets\n" +
            "5. Seeing the Brand Name of a Pen\n" +
            "6. Waiting for the Time, To Get Out of here\n" +
            "7. Thank to study Well at least for Next Exam"
            , "7 Things Girls Do in an Exam Hall:\n" +
            "\n" +
            "1. Write\n" +
            "2. Stuck Hair Behind Ears\n" +
            "3. Again Write\n" +
            "4. Change the Empty Refill\n" +
            "5. Again Write\n" +
            "6. Ask for Extra Sheet\n" +
            "7. Again Keep Writing"
            , "Examination is garden.\n" +
            "success is flower.\n" +
            "god bless you power,\n" +
            "to pluck this flower."
            , "Do U know the fullform of COLLEGE ?\n" +
            "C-Come,\n" +
            "O-On,\n" +
            "L-Lets,\n" +
            "L-Love,\n" +
            "E-Each,\n" +
            "G-Girl,\n" +
            "E-Equally??\n" +
            "\n" +
            "Thats why boys go to college"
            , "A very old lady teacher of English\n" +
            "ask this question with the class:\n" +
            "\n" +
            "When I say ?I am beautiful?, which tense is it?\n" +
            "\n" +
            "One pupil answered: Its the past tense of course."
            , "A very old lady teacher of English\n" +
            "ask this question with the class:\n" +
            "\n" +
            "When I say ?I am beautiful?, which tense is it?\n" +
            "\n" +
            "One pupil answered: Its the past tense of course."
            , "Exams are there,\n" +
            "at the paper you stare;\n" +
            "the answer is nowhere,\n" +
            "which makes u pull your hair.\n" +
            "The teachers make you glare,\n" +
            "the grades are not fair,\n" +
            "but just like the past 20 yrs,\n" +
            "WE don't CARE !!"
            , "Proposing is entrance exam\n" +
            "meeting is testing exam\n" +
            "dating is physical exam\n" +
            "marriage is the final exam"
            , "Everything is fair in Love, War nd Exam\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Unfair is just the Result of above all..!!!"
            , "In Last 10 Minutes Of\n" +
            "Exam Paper,\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "... .\n" +
            ".\n" +
            ".\n" +
            "Every Student Gets\n" +
            "Super Natural Powers..!! ;)"
            , "Bean Came Out of\n" +
            "Exam Hall Sad & Told\n" +
            "His Friend: \"I Don't\n" +
            "Know The Past Tense of\n" +
            "\"THINK\" I THOUGHT &\n" +
            "THOUGHT & finally wrote\n" +
            "'THONK'!"
            , "Benefits Of Exams\n" +
            "1. U Can Spend 3 Hours In Self\n" +
            "Meditation\n" +
            "2. U Can Complete Ur Sleep\n" +
            "3. U Can See Ur Teachers Being Bored\n" +
            "Who Usually Bore U."
            , "Exams R Here,\n" +
            "At D Paper We Stare\n" +
            "D Ans R No Where,\n" +
            "Which Maks Us Pull Our Hair..\n" +
            "D Teachrs Glare,\n" +
            "And Grades R Below Fair,\n" +
            "But Just Like The Past 16 Yrs,\n" +
            "\n" +
            "We Dont Care!!!!!"
            , "First Line 2 Write In Exam\n" +
            "\"All D Answers Written Below\n" +
            "Are Imaginary And Work Of My\n" +
            "Creative Mind Any Rememblance\n" +
            "To Textbook Iz Unintenti0nal\n" +
            "And Purely Accidental.."
            , "The Longest 5 Mins. In The World Is\n" +
            "\n" +
            "The Last 5 Mins. Of A Lecture!!!\n" +
            "\n" +
            "While\n" +
            "\n" +
            "The Shortest 5 Mins. Is\n" +
            "\n" +
            "The Last 5 Mins. Of An Exam!!!\n" +
            "\n" +
            "Isn-t It......"
            , "Whats d height of hope??\n" +
            "It is: sitting in d exam hall,\n" +
            "holding d question paper in hand\n" +
            "n telling ur self\n" +
            "?dude,don't worry.\n" +
            "Exams will get postponed!?"
            , "The Law Says,\n" +
            "\"If U Can't Convince Someone, Confuse Them!\"\n" +
            "\n" +
            "Do U Know Which Law It Is?\n" +
            "\n" +
            "This Is \"Law Of Answering In Examination\"...:-)"
            , "What is Educati0n ?\n" +
            "Educati0n is an 0raganised system thr0ugh which we waste 0nehalf 0f our life t0 learn \n" +
            "h0w 2 waste the remaining half 0f 0urlife."
            , "in how many days a 100pgs book can be read?\n" +
            "\n" +
            "\n" +
            "\n" +
            "WRITER:3 months\n" +
            "\n" +
            "\n" +
            "DOCTOR:1 month\n" +
            "\n" +
            "\n" +
            "LAWYER:25 days\n" +
            "\n" +
            "\n" +
            "STUDENT:on the night before exam\n" +
            "thats STUDENTS POWER...!!!"
            , "To be a good Proffessional,\n" +
            "\n" +
            "always start 2 study late 4 \"EXAMs\".\n" +
            "\n" +
            "Because it teaches u ..\n" +
            "\n" +
            "how to manage \"TIME\" and tackle \"EMERGENCIES\"!!!!!!"
            , "past is experience\n" +
            "present is experiment\n" +
            "future is expectation, so use ur experience in ur experiment to get ur expectation"
            , "Teacher:children exams are coming soon so if u\n" +
            "have any doubt u can ask me..!\n" +
            "\n" +
            "sardar:\n" +
            "In which printing press d question paper is\n" +
            "printed ?"
            , "In an examination hall, a girl asked Pappu, \n" +
            "\"Please tell me the beginning of the answer, \n" +
            "rest I shall write myself?\"\n" +
            "Pappu checked the location of the invigilator and then whispered to her, 'The'!"
            , "3 Ways to write exam:\n" +
            "Look up for INSPIRATION;\n" +
            "Look down for CONCENTRATION;\n" +
            "Look around for INFORMATION."
            , "A student grabbed a coin, Flipped it in the air & said, ?Head, I go to sleep.?\n" +
            "Tail, I watch a movie. If it stands on the edge I'll study."
            , "All i want you is to be courageous Be calm and be self equipped with facts and figures to conquer this exams battle. I wish you is best of luck in your exams."
            , "Class Room is Like a Train.\n" +
            ".\n" +
            "1st Two Benches r Reserved For VIP ;-)\n" +
            ".\n" +
            "Nxt Two Benches r General coach :P\n" +
            ".\n" +
            "Then\n" +
            ".\n" +
            "Last Two Benches r Very Demanded.\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Bcz Its.?SLEEPER COACH. :P :D"
            , "The most beautiful feeling in the World..??\n" +
            "When you try to look at your\n" +
            "friend and you find that your\n" +
            "friend is already looking at you :)\n" +
            "Location : Examination Hall :P :D"
            , "Mr.X in bio practical exam:\n" +
            "\n" +
            "Exmr: see d bird leg & tell its name\n" +
            "\n" +
            "Mr x: i dnt know\n" +
            "\n" +
            "Exmr: u fail in exam?.. Tell me ur name?\n" +
            "\n" +
            "Mr x: now u see my leg & tel mine..! :p"
            , "Examiner: y r u under tension?\n" +
            "Did u forget admit card,ID,or calculator?\n" +
            "\n" +
            "student: No Sir!\n" +
            "By mistake i have brought tomorrow\n" +
            "exam's BIT today.."
            , "To every twist in the question paper,there is an equal and opposite twist in the ans given by the students!!"
            , "It is time 4 EXAMINATION..\n" +
            "study with CONCENTRATION.,\n" +
            "English with PUNCTUATION?\n" +
            "Maths with CALCULATION..\n" +
            "Biology with CLASSIFICATION..\n" +
            "Chemistry with COMBINATION..\n" +
            "Now where is time 4 RELAXATION."
            , "I drink tv while watching c0ffee\n" +
            "\n" +
            "I switch 0ff bed when I lay 0n lights\n" +
            "\n" +
            "I eat m0bile while talkng 0n apple\n" +
            "\n" +
            "C0nfused?\n" +
            "\n" +
            "Inshort\n" +
            "I m a studnt & my exams r near:-)"
            , "Questions are like bullets.\n" +
            "\n" +
            "A single pen cant attack all enemies..\n" +
            "\n" +
            "Dont worry, lets keep bulletproof material\n" +
            "\n" +
            "called\n" +
            "\n" +
            "BITS.."
            , "Doctors After Operation,\n" +
            "\n" +
            "And,\n" +
            "\n" +
            "Students After Exams,\n" +
            "\n" +
            "Have Same Thing To Say..\n" +
            "\n" +
            "We Tried Our Best..\n" +
            "\n" +
            "Right Now We Can?t Say Anything.."
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
                .setCategory("Exam Messages")
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
                .setCategory("Exam Messages")
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
                .setCategory("Exam Messages")
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
                .setCategory("Exam Messages")
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
                .setCategory("Exam Messages")
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