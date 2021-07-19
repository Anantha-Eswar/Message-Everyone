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
 * Created by Anantha Eswar on 9/24/2015.
 */
public class GoodMorning extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_morning);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Good Morning Messages");

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

    /* http://www.greetings.prokerala.com/sms/good-morning-sms/page-3.html
    http://wishesmessages.com/category/messages/good-morning-messages/
    http://www.mallubar.com/sms/goodmorning-sms/?&page=9
    http://www.sweetymessages.com/2014/09/cute-good-morning-texts.html
    */
    public static String[] messages = {"God Bless Your Day And Keep You Safe From Harms And More \n" +
            "And May You Have A Better One Than The Day Before. Good Morning!"
            , "Wish you a very happy, fresh and cheerful morning with a sip of cup of hot tea or coffee. Have a wonderful morning , good morning my friend"
            , "Waking up and turning over to kiss your face while you are still deep in your sleep has been my greatest hobby babe!"
            , "Morning is not only sunrise \n" +
            "but a beautiful miracle of GOD \n" +
            "that defeats the darkness & spread light.\n" +
            "May everyday spread light in your whole life!"
            , "ғeel тнe ғreѕнneѕѕ and тoυcн oғ мornιng ѕυnrιѕe.\n" +
            "ģσσđ мorιnng мү ļσvεℓү ƒяιεηđz.\n" +
            "нαvε ä βεαυтιғυℓ тιмε ι ωѕн уσυ α нαρρу day...\n" +
            "кєερ ѕмιℓε αℓωαуѕ. gσ∂ вℓєѕѕ υ. тαкє ¢αяє."
            , "Mornings are refreshing like friendship, it may not stay all day long, but for sure it comes forever every day. Good Morning.\n" +
            "Good morning MY DEAR. Do U know what is MY DEAR... M-Myself Y-Yield D-Deeply and E-Emotionally to A-An R-Rare person, that is U."
            , "Hope is one of God's greatest gifts to all of us, because it's the magic that inspires us to keep trying, learning,loving and living. Good morning guyzz.."
            , "Saying Gudmorning is not a Formality or Due to free msg,\n" +
            "Its the art of Saying that\n" +
            "I remember u in\n" +
            "My first minute of the Day.."
            , "G-get up\n" +
            "O-open ur eyes\n" +
            "O-out of ur bed\n" +
            "D-day has risen\n" +
            "M-merry life\n" +
            "O-old dreams cum true\n" +
            "R-rise$shine\n" +
            "N-new frnds\n" +
            "I-ideas of life\n" +
            "N-nice future\n" +
            "G-GOODDAY 4 U"
            , "I asked God to make You happy, make you smile, guide you safely thru every miles most of all give you Love and Care. Good Morning"
            , "Good morning, early riser.\n" +
            "You wake the sun\n" +
            "to start the day\n" +
            "And tell the moon to go away.\n" +
            "Open your curtains,\n" +
            "Open your eyes,\n" +
            "And view the beautiful surprise.\n" +
            "For today you shall not wake the sun,\n" +
            "But the sun shall wake you."
            , "SomEtimEz it'z tHe smAll\n" +
            "thiNgs thAt mAtter thE\n" +
            "mozt...LiKe a \"GoOd\n" +
            "MoRniNg\" ..\n" +
            "BEautiful\" tExt....I loVe\n" +
            "thOse, tHey reALly do briGhtEn up mY dAy.. AnYwAY \"GooDMrniNg\""
            , "wish you a very happy , fresh and cheerful morning with a sip of cup of hot tea or coffee. Have a wonderful morning , good morning my friend"
            , "Don't look back\n" +
            "when you are moving to success!\n" +
            "BUT\n" +
            "don't forget to look back\n" +
            "after reaching success..... !\n" +
            "Gudmrng"
            , "Gооd мояиιиg нαvε α иιcε dαysωεεт dαylоvεly dαy"
            , "The most beautiful words by a wounded heart “I Never Stopped Loving You, I Just Stopped Showing It”… Good mrng"
            , "Each new morning is Sunless, \n" +
            "\n" +
            "Each new day is Not Bright, \n" +
            "\n" +
            "Each new evening is Hopeless, \n" +
            "\n" +
            "Without u by my side!\n" +
            "\n" +
            "I can only say Good Morning, My Sweetheart!"
            , "nEw day, \n" +
            "nEw aims, \n" +
            "nEw hopes, \n" +
            "nEwplans, \n" +
            "nEw efforts, \n" +
            "nEw success, \n" +
            "nEw feelings. \n" +
            "Wishing you a very successfull... \n" +
            "Good morning"
            , "I love u \n" +
            "\n" +
            "Not only u \n" +
            "\n" +
            "My all frnd\n" +
            "\n" +
            "R my lovers\n" +
            "\n" +
            "Love is a great \n" +
            "\n" +
            "Felling i can smell it thouch it and see it\n" +
            "\n" +
            "Gum mrng"
            , "Beautiful Tomorrow Never Comes, When It Comes Its Already Today!In Hunt of Beautiful Tomorrow, Lets Not Waste The Wonderful Today. GOOD MORNING"
            , "Hai good morning \n" +
            "MY sweet heart\n" +
            "Have a nice day Keep smiling always "
            , "Each new morning is Sunless, \n" +
            "Each new day is Not Bright, \n" +
            "Each new evening is Hopeless, \n" +
            "Without u by my side!\n" +
            "I can only say Good Morning, My Sweetheart!\""
            , "You can’t bring back yesterday, \n" +
            "You can’t look into tomorrow. \n" +
            "So the only gift you have is today. \n" +
            "That is why it’s called the present. "
            , "What a 9ice sun, which rise 2 us, as it rise ur glory shall come 2 u. Gud morning"
            , "Cool air... \n" +
            "Bright sun... \n" +
            "Fresh flower... \n" +
            "Singing birds... \n" +
            "All these waiting to see your eyes open\n" +
            "to say Good morning... \n" +
            "Have a nice day... "
            , "A morning is a wonderfull blessing... Either stormy or sunny, it stands for hope, Giving us another start of what we call...\n" +
            "Gud mrng have a nice day"
            , "Morning Is A Wonderful\n" +
            "Opportunity To Wish, To Love, To\n" +
            "Care, To Smile And To See You In\n" +
            "Good Mood. \n" +
            "Good Morning\n" +
            "N Hav A Good Day. : -)"
            , "nice friend for get a\n" +
            "'nice morning'\n" +
            "sweet friend for get a\n" +
            "'sweet morning'\n" +
            "lovely friend for get a\n" +
            "'lovely morning'\n" +
            "good friend for get a\n" +
            "good morning"
            , "F - forget\n" +
            "E - everything\n" +
            "A - and\n" +
            "R - run\n" +
            "OR\n" +
            "F - face\n" +
            "E - everything\n" +
            "A - and\n" +
            "R - rejoice\n" +
            "now the choice is yours\n" +
            "good morning.."
            , "“MORNING”\n" +
            "is a good time to “REMEMBER\n" +
            "all the sweet things and\n" +
            "all sweet persons in your “LIFE\n" +
            "so wake up with your\n" +
            "“SWEET MEMORIES”\n" +
            "!GOOD MORNING!\""
            , "Superb thought. never try to maintain relations in your life. just try to maintain life in your relations. good Morning "
            , "we gain freedom when we paid the full price for our right to live \n" +
            "good morning"
            , " Open ur tinky minky\n" +
            "eyes, \n" +
            "stand up and strech ur\n" +
            "crunchy prunchy bonz\n" +
            "and then wake up\n" +
            "yourself, tell your brain\n" +
            "to refresh\n" +
            "and tell your self 2days\n" +
            "is GOOD DAY\n" +
            "Good Morning"
            , "Successful people always have two things on their lips, ... Silence nd Smile... Smile to solve the problem, And.. Silence to avoid the prblm..... GUD MRG"
            , "Great attitude is like a perfect cup of coffee – don’t start you day without it. Good morning."
            , "Good thoughts precede great deeds. Great deeds precede success. Have a great day."
            , "Success comes to those who have the will power to win over their snooze buttons. Wishing you an awesome morning."
            , "This message is to remind you that you are beautiful, talented and one of a kind. No one can stop you from doing anything that is on your mind. Good morning."
            , "Don’t wake up with the regret of what you couldn’t accomplish yesterday. Wake up while thinking about what you will be able to achieve today. Good morning."
            , "If yesterday was a good day, don’t stop. Maybe your winning streak has just begun. Good morning."
            , "If you don’t wake up right now with your full might, you will never be able to achieve that dream you saw last night. Good morning."
            , "The withering away of the darkness and the rising of the sun signifies the most important aspect of life – despair giving way for hope. Good morning."
            , "he biggest sources of motivation are your own thoughts, so think big and motivate yourself to win. Good morning."
            , "The greatest inspiration you can ever get is to know that you are an inspiration to others. Wake up and start living an inspirational life today. Good morning."
            , "This is not just another day, this is yet another chance to make your dreams come true. Good morning."
            , "Even the smallest of thoughts have the potential to become the biggest of successes… all you have to do is get up and get going. Good morning."
            , "This morning will never ever come back in your life again. Get up and make the most of it. Good morning."
            , "Don’t blame God for not showering you with gifts. He gives you the gift of a new day with every single morning. Good morning."
            , "Good Morning – this is not just a greeting. It signifies a hope that the beautiful morning will bring a smile on your face and happiness in your life."
            , "It is a myth that you need to rise and shine to have a good start to a day. You can roll around in bed thinking about friends like me and you will still have a great start to the day. Good morning."
            , "Romantic relationships are based on expectations and responsibilities. Professional relationships are based on gains and losses. But friendship is based on smiles and laughter. Good morning my friend."
            , "I cannot guarantee that you will have an awesome day but I can guarantee that you will be in the loving company of friends like me. Good morning buddy."
            , "A soulful good morning message is a sweet gift that does not come wrapped in a box, but can be stored forever in your inbox. Good morning."
            , "The only thing more beautiful than the warm sunrise is our Friendship. Good morning."
            , "Dreamers like you don’t need inspirational good morning messages. They need big alarm bells and annoying friends like me. Good morning, time to wake up."
            , "Whether it is a hangover, headache or sickness, even the worst of mornings become happy and cute when I think of friends like you. I hope this message makes you happy too. Good morning."
            , "Today’s forecast for all my friends: If you are reading this message, nothing can stop you from having an incredible day. Good morning."
            , "Not coffee, but friendship is the only caffeine I need to give myself a kick start in the morning. Good morning."
            , "A beautiful morning spent without friends like you, is worse than a night which is gloomy and blue."
            , "Now that such a sweet person like you has read this message, I won’t need to put sugar in my coffee. Good morning."
            , "If you have a good morning today, you will have a good night, which will help you to sleep tight and make the next day nice and bright. So I wish you good morning with all my might."
            , "Waking up in the morning has become much easier for me, knowing that I will be spending the day with amazing friends like you. Good morning."
            , "It is a great feeling to start a morning with gratitude. So I am going to start my day by thanking you for being in a good friend. Good morning."
            , "Smile increases value of face, Anger spoils beauty of\n" +
            "soul, Faith is force of life, Confidence is companion of\n" +
            "success, So keep smiling.\n" +
            "gOOd mOrning"
            , "G-Get up\n" +
            "O-Opn ur eyes\n" +
            "O-Out of ur bed\n" +
            "D-Day risen\n" +
            "\n" +
            "M-Mobile beep\n" +
            "O-One msg receive\n" +
            "R-Read and enjoy\n" +
            "N-Now\n" +
            "I-It's only a\n" +
            "N-New way 2 wish u\n" +
            "G-Good morning."
            , "Dont read success story.\n" +
            "Read only failure story,\n" +
            "B'coz, failure story you get new idea to win,\n" +
            "from Success story you get only message.\n" +
            "Good morning to u"
            , "We are not Very close in distance,\n" +
            "we are not very close in miles,\n" +
            "but hope my sages can touch your heart and thoughts can bring smiles\n" +
            "\n" +
            "good morning friend!"
            , "Hello darling,I woke up this morning happy,and I was exploring my heart why I am happy,,,I found out that I was holding your picture all night..good morning love"
            , "Eyes to look at u...\n" +
            "Hands to pray for u...\n" +
            "Mind to think of u...\n" +
            "Heart to care for u...\n" +
            "Lips to wish u good morning..."
            , "Welcome to the new morning with\n" +
            "'smile' on your 'face'\n" +
            "'love in your 'Heart'\n" +
            "'Good thoughts'in your 'Mind'\n" +
            "'Wish you a Lovely Morning Always\"."
            , "Early this morning God gave me 3 baskets of fruits\n" +
            "- LOVE + HAPPINESS + PEACE OF MIND\n" +
            "and told me 2 share them with peal Dear 2 me.\n" +
            "I'm sharing all with U...\n" +
            "Good Morning! "
            , "Very little is needed2have a happy Life.\n" +
            "it is all within yourself.\n" +
            "in ur ways of thinking.\n" +
            "No matter what u do,\n" +
            "do it with L0VE in ur HEART…\n" +
            "Gud morning ."
            , "Morning is God's way of saying 1 more time...\n" +
            "Go, live life, make a difference, touch one's heart,\n" +
            "encourage 1's mind inspire 1's soul\n" +
            "and enjoy the day"
            , "make the day bright as sun shine\n" +
            "keep the nite as cool as a gentle rain\n" +
            "Have a good Day"
            , "Good morning for everybody and happy morning"
            , "Everyday may not be good,\n" +
            "But there is something good in everyday"
            , "Hi Friends a Very Good Morning.Have a Great Day..."
            , "G<><>D message for a\n" +
            "G<><>D person from a\n" +
            "G<><>D friend for a\n" +
            "G<><>D reason at a\n" +
            "G<><>D time on a\n" +
            "D<><>D day in a\n" +
            "G<><>D mood to say\n" +
            "G<><>D morning.."
            , "Good Morning Wish for you to say.... Hope this day's loverly for you,jus the way it'll be for me 'Cos you'll be in my thoughts all day through!"
            , "hort n sweet Fact..\n" +
            "'Nobody rise suddenly,not even the sun..!"
            , "Welcome to the new morning with\n" +
            "'smile' on your 'face'\n" +
            "'love in your 'Heart'\n" +
            "'Good thoughts'in your 'Mind'\n" +
            "'Wish you a Lovely Morning Always\"."
            , "'Morning' is a Good Time to 'Remember'all the sweet things and all sweet persons in your 'Life'..\n" +
            "So receive my wishes 'GOOD MORNING' Hv a Lovelyday'."
            , ". . Hot, ))\n" +
            ".. Fresh _((_\n" +
            ".. Strong \\__/\n" +
            "Tea ready and waiting for u...\n" +
            "Very Good Mornig"
            , "Morning is a perfect\n" +
            "'Time\n" +
            "'2pray\n" +
            "'2love\n" +
            "'2care\n" +
            "'2smile'\n" +
            "'2relax'\n" +
            "and 'Thank 2 god'4all he gives to u."
            , "Like d fresh dewdrops of a new day,\n" +
            "May Gods loving hands be upon u today 2 freshen ur soul as u start d day."
            , "Mornig is not only sunrise,\n" +
            "but a beautiful miracle of God that defeats the darkness and spreads light.\n" +
            "May this be a very beautiful day for U."
            , "Never apply TERMS and CONDITIONS in your relation..!!\n" +
            "Otherwise that will be changed in CONTRACTS..!!\n" +
            "Have A Meaningful Day.."
            , "warm morg-nice day !\n" +
            "Happiness is perfume.\n" +
            "You cannot spread on others without getting a few drops on urself,\n" +
            "So always be happy to make others happy !!"
            , "Every new day is a new chapter of life bringing new topics,\n" +
            "New moments 4 life i wish 2day all the good moments approch to u.."
            , "Morning is a special gift from 'GOD' after a restful sleep,\n" +
            "It's a new chance 2do better N try again where we failed b4."
            , "SW\n" +
            "SWE,\n" +
            "SWEE,\n" +
            "SWEET,\n" +
            "SWEET M,\n" +
            "SWEET MO,\n" +
            "SWEET MOR,\n" +
            "SWEET MORN,\n" +
            "SWEET MORNI,\n" +
            "SWEET MORNIN,\n" +
            "SWEET MORNING,\n" +
            "(((Good Morning))))"
            , "Morning is the best time to great 'SPECIAL PEOPLE'bc'z the remaining hours soon will be busy.\n" +
            "So let me say hello,take care & Keep smiling.."
            , "There were hundreds of YESTERDAYS that passed and more TOMORROWS still to come..But remember,there's only one TODAY to enjoy.."
            , "I wish I was an owl. So that I could sleep away in the morning and sing and party all night long! But alas, I’m human. Good morning to you."
            , "Build a morning on the foundation of kindness and goodness. Be proactive and speak something good to someone, encourage or compliment somebody. Help somebody in need and then you will see those seeds of kindness bloom into something beautiful."
            , "If it were up to me to rearrange the alphabets, I would keep U and I together. Good Morning."
            , "Remove your blanket, get up from your bed, brush your teeth and now say eeeeee... Good!! Now check out the world outside so flamboyant and colorful. Good Morning and have a beautiful day ahead."
            , "Sometimes I wish there was no alarm clock because that is the only device which wakes me up when I am dreaming about you."
            , "From morning's first light to evening's last star, always remember how special you are! Good Morning!"
            , "Good Morning Sunshine... You look great today. How did I know? Because you look great every day."
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
                .setCategory("Good Morning Messages")
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
                .setCategory("Good Morning Messages")
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
                .setCategory("Good Morning Messages")
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
                .setCategory("Good Morning Messages")
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
                .setCategory("Good Morning Messages")
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