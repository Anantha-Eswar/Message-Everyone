package com.anantheswar.messageeveryone;

/**
 * Created by Anantha Eswar on 9/24/2015.
 */
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


public class Love extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Love Messages");

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
        text1.setText("1. "+ messages[0]);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setText("2. "+messages[1]);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setText("3. "+messages[2]);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setText("4. "+messages[3]);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        text5.setText("5. "+messages[4]);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setText("6. "+messages[5]);
        TextView text7 = (TextView) findViewById(R.id.textView7);
        text7.setText("7. "+messages[6]);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setText("8. "+messages[7]);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        text9.setText("9. "+messages[8]);
        TextView text10 = (TextView) findViewById(R.id.textView10);
        text10.setText("10. "+messages[9]);
        TextView text11 = (TextView) findViewById(R.id.textView11);
        text11.setText("11. "+messages[10]);
        TextView text12 = (TextView) findViewById(R.id.textView12);
        text12.setText("12. "+messages[11]);
        TextView text13 = (TextView) findViewById(R.id.textView13);
        text13.setText("13. "+messages[12]);
        TextView text14 = (TextView) findViewById(R.id.textView14);
        text14.setText("14. "+messages[13]);
        TextView text15 = (TextView) findViewById(R.id.textView15);
        text15.setText("15. "+messages[14]);
        TextView text16 = (TextView) findViewById(R.id.textView16);
        text16.setText("16. "+messages[15]);
        TextView text17 = (TextView) findViewById(R.id.textView17);
        text17.setText("17. "+messages[16]);
        TextView text18 = (TextView) findViewById(R.id.textView18);
        text18.setText("18. "+messages[17]);
        TextView text19 = (TextView) findViewById(R.id.textView19);
        text19.setText("19. "+messages[18]);
        TextView text20 = (TextView) findViewById(R.id.textView20);
        text20.setText("20. "+messages[19]);
        TextView text21 = (TextView) findViewById(R.id.textView21);
        text21.setText("21. "+messages[20]);
        TextView text22 = (TextView) findViewById(R.id.textView22);
        text22.setText("22. "+messages[21]);
        TextView text23 = (TextView) findViewById(R.id.textView23);
        text23.setText("23. "+messages[22]);
        TextView text24 = (TextView) findViewById(R.id.textView24);
        text24.setText("24. "+messages[23]);
        TextView text25 = (TextView) findViewById(R.id.textView25);
        text25.setText("25. "+messages[24]);
        TextView text26 = (TextView) findViewById(R.id.textView26);
        text26.setText("26. "+messages[25]);
        TextView text27 = (TextView) findViewById(R.id.textView27);
        text27.setText("27. "+messages[26]);
        TextView text28 = (TextView) findViewById(R.id.textView28);
        text28.setText("28. "+messages[27]);
        TextView text29 = (TextView) findViewById(R.id.textView29);
        text29.setText("29. "+messages[28]);
        TextView text30 = (TextView) findViewById(R.id.textView30);
        text30.setText("30. "+messages[29]);
        TextView text31 = (TextView) findViewById(R.id.textView31);
        text31.setText("31. "+messages[30]);
        TextView text32 = (TextView) findViewById(R.id.textView32);
        text32.setText("32. "+messages[31]);
        TextView text33 = (TextView) findViewById(R.id.textView33);
        text33.setText("33. "+messages[32]);
        TextView text34 = (TextView) findViewById(R.id.textView34);
        text34.setText("34. "+messages[33]);
        TextView text35 = (TextView) findViewById(R.id.textView35);
        text35.setText("35. "+messages[34]);
        TextView text36 = (TextView) findViewById(R.id.textView36);
        text36.setText("36. "+messages[35]);
        TextView text37 = (TextView) findViewById(R.id.textView37);
        text37.setText("37. "+messages[36]);
        TextView text38 = (TextView) findViewById(R.id.textView38);
        text38.setText("38. "+messages[37]);
        TextView text39 = (TextView) findViewById(R.id.textView39);
        text39.setText("39. "+messages[38]);
        TextView text40 = (TextView) findViewById(R.id.textView40);
        text40.setText("40. "+messages[39]);
        TextView text41 = (TextView) findViewById(R.id.textView41);
        text41.setText("41. "+messages[40]);
        TextView text42 = (TextView) findViewById(R.id.textView42);
        text42.setText("42. "+messages[41]);
        TextView text43 = (TextView) findViewById(R.id.textView43);
        text43.setText("43. "+messages[42]);
        TextView text44 = (TextView) findViewById(R.id.textView44);
        text44.setText("44. "+messages[43]);
        TextView text45 = (TextView) findViewById(R.id.textView45);
        text45.setText("45. "+messages[44]);
        TextView text46 = (TextView) findViewById(R.id.textView46);
        text46.setText("46. "+messages[45]);
        TextView text47 = (TextView) findViewById(R.id.textView47);
        text47.setText("47. "+messages[46]);
        TextView text48 = (TextView) findViewById(R.id.textView48);
        text48.setText("48. "+messages[47]);
        TextView text49 = (TextView) findViewById(R.id.textView49);
        text49.setText("49. "+messages[48]);
        TextView text50 = (TextView) findViewById(R.id.textView50);
        text50.setText("50. "+messages[49]);
        TextView text51 = (TextView) findViewById(R.id.textView51);
        text51.setText("51. "+messages[50]);
        TextView text52 = (TextView) findViewById(R.id.textView52);
        text52.setText("52. "+messages[51]);
        TextView text53 = (TextView) findViewById(R.id.textView53);
        text53.setText("53. "+messages[52]);
        TextView text54 = (TextView) findViewById(R.id.textView54);
        text54.setText("54. "+messages[53]);
        TextView text55 = (TextView) findViewById(R.id.textView55);
        text55.setText("55. "+messages[54]);
        TextView text56 = (TextView) findViewById(R.id.textView56);
        text56.setText("56. "+messages[55]);
        TextView text57 = (TextView) findViewById(R.id.textView57);
        text57.setText("57. "+messages[56]);
        TextView text58 = (TextView) findViewById(R.id.textView58);
        text58.setText("58. "+messages[57]);
        TextView text59 = (TextView) findViewById(R.id.textView59);
        text59.setText("59. "+messages[58]);
        TextView text60 = (TextView) findViewById(R.id.textView60);
        text60.setText("60. "+messages[59]);
        TextView text61 = (TextView) findViewById(R.id.textView61);
        text61.setText("61. "+messages[60]);
        TextView text62 = (TextView) findViewById(R.id.textView62);
        text62.setText("62. "+messages[61]);
        TextView text63 = (TextView) findViewById(R.id.textView63);
        text63.setText("63. "+messages[62]);
        TextView text64 = (TextView) findViewById(R.id.textView64);
        text64.setText("64. "+messages[63]);
        TextView text65 = (TextView) findViewById(R.id.textView65);
        text65.setText("65. "+messages[64]);
        TextView text66 = (TextView) findViewById(R.id.textView66);
        text66.setText("66. "+messages[65]);
        TextView text67 = (TextView) findViewById(R.id.textView67);
        text67.setText("67. "+messages[66]);
        TextView text68 = (TextView) findViewById(R.id.textView68);
        text68.setText("68. "+messages[67]);
        TextView text69 = (TextView) findViewById(R.id.textView69);
        text69.setText("69. "+messages[68]);
        TextView text70 = (TextView) findViewById(R.id.textView70);
        text70.setText("70. "+messages[69]);
        TextView text71 = (TextView) findViewById(R.id.textView71);
        text71.setText("71. "+messages[70]);
        TextView text72 = (TextView) findViewById(R.id.textView72);
        text72.setText("72. "+messages[71]);
        TextView text73 = (TextView) findViewById(R.id.textView73);
        text73.setText("73. "+messages[72]);
        TextView text74 = (TextView) findViewById(R.id.textView74);
        text74.setText("74. "+messages[73]);
        TextView text75 = (TextView) findViewById(R.id.textView75);
        text75.setText("75. "+messages[74]);
        TextView text76 = (TextView) findViewById(R.id.textView76);
        text76.setText("76. "+messages[75]);
        TextView text77 = (TextView) findViewById(R.id.textView77);
        text77.setText("77. "+messages[76]);
        TextView text78 = (TextView) findViewById(R.id.textView78);
        text78.setText("78. "+messages[77]);
        TextView text79 = (TextView) findViewById(R.id.textView79);
        text79.setText("79. "+messages[78]);
        TextView text80 = (TextView) findViewById(R.id.textView80);
        text80.setText("80. "+messages[79]);
        TextView text81 = (TextView) findViewById(R.id.textView81);
        text81.setText("81. "+messages[80]);
        TextView text82 = (TextView) findViewById(R.id.textView82);
        text82.setText("82. "+messages[81]);
        TextView text83 = (TextView) findViewById(R.id.textView83);
        text83.setText("83. "+messages[82]);
        TextView text84 = (TextView) findViewById(R.id.textView84);
        text84.setText("84. "+messages[83]);
        TextView text85 = (TextView) findViewById(R.id.textView85);
        text85.setText("85. "+messages[84]);
        TextView text86 = (TextView) findViewById(R.id.textView86);
        text86.setText("86. "+messages[85]);
        TextView text87 = (TextView) findViewById(R.id.textView87);
        text87.setText("87. "+messages[86]);
        TextView text88 = (TextView) findViewById(R.id.textView88);
        text88.setText("88. "+messages[87]);
        TextView text89 = (TextView) findViewById(R.id.textView89);
        text89.setText("89. "+messages[88]);
        TextView text90 = (TextView) findViewById(R.id.textView90);
        text90.setText("90. "+messages[89]);
        TextView text91 = (TextView) findViewById(R.id.textView91);
        text91.setText("91. "+messages[90]);
        TextView text92 = (TextView) findViewById(R.id.textView92);
        text92.setText("92. "+messages[91]);
        TextView text93 = (TextView) findViewById(R.id.textView93);
        text93.setText("93. "+messages[92]);
        TextView text94 = (TextView) findViewById(R.id.textView94);
        text94.setText("94. "+messages[93]);
        TextView text95 = (TextView) findViewById(R.id.textView95);
        text95.setText("95. "+messages[94]);
        TextView text96 = (TextView) findViewById(R.id.textView96);
        text96.setText("96. "+messages[95]);
        TextView text97 = (TextView) findViewById(R.id.textView97);
        text97.setText("97. "+messages[96]);
        TextView text98 = (TextView) findViewById(R.id.textView98);
        text98.setText("98. "+messages[97]);
        TextView text99 = (TextView) findViewById(R.id.textView99);
        text99.setText("99. "+messages[98]);
        TextView text100 = (TextView) findViewById(R.id.textView100);
        text100.setText("100. "+messages[99]);
    }

    /* Messages from http://www.txt2nite.com/message/love-sms/true-love/page/3
        *http://www.latestsms.in/love-messages.htm
        * http://www.greetings.prokerala.com/sms/love-messages/page-2.html
    */

    public static String[] messages = {"I see u, my heart drops. I hear ur voice, my heart melts. U look at me, I fall. Please catch me. I’ve fallen for u."
            ,"The moment I first saw you, you warmed my heart, the second time you made little flames and now you make my heart burn like hell!"
            ,"I got a x ray 2day they found u in my heart. The doctor said if ithey took u out i would die bcoz i could not live with out u!"
            ,"I don’t want to be your ‘favorite’, or your ‘best’, I want to be your only and forget the rest."
            ,"There is never a time or place for true love. It happens accidentally, in a heartbeat, in a single flashing, throbbing moment."
            ,"I luv all the things u don’t do…\n" +
            "u neva tried 2 change me\n" +
            "neva minded my quirky moods\n" +
            "neva laughd when i attemptd seriousness\n" +
            "neva turnd away when i needed u"
            ,"If i had 2 describe “TRUE LOVE” then i wud describe it as what a “snowman” did 2 a “snowwoman”.He gave her a HUG and they both melted in each others arms."
            ,"Dive into my eyes nd u will find an ocean of love and in it a boat of friendship waiting for u for a non stop journey into the core of my HEART."
            ,"Every time I see u – I feel something in my heart,it’s like a little flame.I love u so much it now feels like there’s an inferno in my chest!"
            ,"The path that leads to love is so narrow that TWO can not walk on it unless they become ONE"
            ,"Thought of you today,\n" +
            "That's not new,\n" +
            "Thought of you yesterday,\n" +
            "the day before too,\n" +
            "I will think of you tommarow &\n" +
            "my whole life through,\n" +
            "& i will think of you forever\n" +
            "because i think the world of you.."
            ,"The distance between 2 hearts is not an obstacle, its a beautiful reminder of just how strong true love can be."
            ,"Everyone says you only fall in love once,\n" +
            "but that’s not true,\n" +
            "because every time I see you,\n" +
            "I fall in love all over again."
            ,"A thousand words would be too few\n" +
            "to say just how I feel bout you\n" +
            "so if I say 3 words be sure\n" +
            "“i love u” means a whole lot more x"
            ,"if my heart was a cabbage, id split it in two, the leaves id give to many, but the heart id give to you"
            ,"Our relationship is like TOM and JERRY.We tease each other, chase each other, knock down each other, irritate each other, but we can’t live without each other!"
            ,"luv is patient,luv is kind.It does not envy,it does not boast.It’s not rude,nor self-seeking.It always protects, always trusts, always hopes, always perseveres."
            ,"once upon a time something happened 2 me. it was the sweetest thing dat cud ever b, it was a fantasy, it was a dream come true… it was the day i met u"
            ,"Sum say luv is a river,dat drowns d tender reed.Sum say luv is hunger,An endless, aching need.I say luvs a flower,and u its only seed."
            ,"Meeting you was fate, becoming your friend was choice, but falling in love with you was completely out of my control."
            ,"He HoLdS Me WheN i StArT 2 cRy, MaKeS Me SmiLe WiTh JuSt HiS eYeS, ShAreS HoPes, DrEaMs nd FeArs, WiPes AwAy ALL My TeArs. i LoVe hiM WiThouT ReGreT, ASHAME i HAVEN’T FoUnd HiM yEt!"
            ,"I 4got to tell u 2day,I 4got yesterday also,nd day b4,Bt even if i tel u only,once a week,once a month,Or once a yr,d truth remains dat i lv u nd always will!"
            ,"There are 3 steps to happy happiness: 1 you. 2 me. 3 our hearts 4 eternity!"
            ,"You can fall from a bridge, you can fall from above, but the best way of falling, is falling in love!"
            ,"Ive got ur bak nd uve got mine.ill help u out netime.2 see u hurt 2 see u cry.makes me weep nd wanna die.ill b right here til d end.cos ur my luv nd my bestfriend"
            ,"1000 words 1 cood say.1000 wishes 1 cood pray.1000 miles legs cood walk. 1000 sounds a mouth cood talk.1000 times ill b true.1000 ways 2 say i luv u!"
            ,"U say u luv me nd want 2 hold me tight.those words run thru my head day nd nite.i dreamt u held me nd made me see dat 4ever 2gether we wood be!"
            ,"It takes 2 to tango.2 to kiss.2 to talk nd remenisce.so many good things cum in 2 nd one of those things is me nd u!"
            ,"True luv is hard 2 find.Special 1-1 of a kind.But the luv inside of me is true.It appeared the day i met you!"
            ,"When the night comes, look at the sky. If you see a falling star, don’t wonder why, just make a wish. Trust me, it will come true, because I did it and I found you"
            ,"Love is like a golden chain that links our hearts together and if you ever break that chain youll break my heart 4ever!"
            ,"Accidents do happen.i slip- i trip- i stumble- i fall nd usually i dont care at all.but now i dont know what to do cos i slipped and fell in love with u"
            ,"How can u tell the rain not 2 fall wen clouds exist?How can u tell the leaves not 2 fall wen the wind exists?How can u tell me not 2 fall in love wen u exist?"
            ,"Wantin u is easy missin u is hard.Wishin u was wiv me wrapped up in my arms.Constantly think of u wen we r apart.Ive got the padlock u hav the key to my heart"
            ,"If i died or travelled far, i’d write ur name on every star,so everyone could look up nd see, dat u mean the world 2 me"
            ,"I love 3 things! The sun, the moon and U! The sun for the day, the moon for the night and you forever!"
            ,"One day the moon sed 2 me, if your lover makes you cry why dont you leave your lover.. i looked at the moon n replied would you every leave your sky?"
            ,"There are Tulips in my garden,there are Tulips in the park.but nothing is more beautiful then our two lips meeting in the dark!"
            ,"Ull always be mine 4 now nd 4ever.Ull always be mine 4 u r my treasure.Ull always be mine please tell me its true.Please be mine 4ever ill always luv u"
            ,"I dont have the measels, i am not confined to bed, asperin wont help coz i aint my\n" +
            "head, i dont have back ache or the flu, its more serious…i am missin u!"
            ,"There are a million stars and a million dreams, you are the only star for me, the only dream i dream"
            ,"Uve won my luv now I luv u.This heart of mine I give 2 u.So keep it safe as i have done.For u have 2 and i have none!"
            ,"8 letters, 3 words, 1 meaning… i love you"
            ,"A true heart person doesn't love a million girls, he loves one girl in a million ways."
            ,"Take my eyes but let me see U...\n" +
            "Take my mind but let me Think about U...\n" +
            "Take my Hand but let me Touch U...\n" +
            "But don't try to take my Heart\n" +
            "coz its already with U..\n"
            ,"If I die and go 2 heaven, I put UR name on a golden star.\n" +
            "So that all the angels can see how much I adore U. I LOVE YOU"
            ,"There are a lot of birds wispering only about you,\n" +
            "you should once listen to them,\n" +
            "then you would know how much I love you.\n"
            ,"I always lose control when you by my side.\n" +
            "U have bcom the light of my life.\n" +
            "I always enjoy the time i spend with you.\n" +
            "I think i’m falling in love with you!"
            ,"~*´¨¯¨`*·~ Beautiful SMS For True Love ~*´¨¯¨`*·~\n" +
            "\n" +
            "I love U\n" +
            "This text art just 4 U..,\n" +
            "( ) c ( )\n" +
            "l:':l ( ') l:':l\n" +
            "l:':l .:::!!!!!!:::.l:':l\n" +
            "l:':l.ll...:''''''':....l:':l"
            ,"I've fallen in love wid U nd I'll never let U go. I love U more than any1, I just had 2 let you know. And if U ever wonder why, I don't know wat I'll say, but I'll never stop loving U, today, tomorrow nd every day."
            ,"If some1 waits for you it doesn't mean dat they have nothing else to do..\n" +
            "It just means dat nthng else is more important than you\n" +
            "nd that some1 is special 1 who loves you"
            ,"Never Love D 'Cheating' Heart. Never Cheat D 'Loving' Heart..\n" +
            "Ever love heart made 4 u, Just 4 u..."
            ,"We nvr knw\n" +
            "Why we like som ppl mor dan othrs..\n" +
            "Why we lov som ppl widout reason..\n" +
            "Why we feel hpy wid thir presnc\n" +
            "coz..\n" +
            "Sm realations hav no explation."
            ,"Wen I think about u sweetie\n" +
            "My heart beats fastly..\n" +
            "not bcoz i miss u..\n" +
            "but only bcoz, u stay in my heart nd\n" +
            "every heart-beat shows wen u r in it i m still alive."
            ,"Care nd Affection Is Nt a Business\n" +
            "Whr u Gv Whn u Get\n" +
            "It's A Beautiful Feeling 4 Sum1\n" +
            "Whr u LoVe 2 Gv,\n" +
            "Even If u Dnt Get."
            ,"The most loveliest life is living with the person who loves u.....nd the most loveliest death is dying in the arms of the one you love....."
            ,"Nvr ask 4 a smile jst give it. Nvr expct luv 4m othrs jst luv thm.\n" +
            "Nvr sy I cn’t live widout u, Jst sy I Live 4 U."
            ,"Nice, cute, sweet, Love Messages to say I love you to girlfriend, beloved, girl. Lovely collection to say those words your special one has longed to hear. Romantic, Cute, Love text messages for True lover."
            ,"Come away with me sweetheart , to a land that far away and unknown , where it's just you and me with the sun baking our feet and the water wetting our cheeks. Let's spend the rest of our lives in a paradise like this. I love you sweetheart..."
            ,"Distance is a test of Love.. Many will fail who can't withstand it... But for whose who can , there's only one answer.. ''TRUE LOVE'' ..."
            ,"You are the central theme of my life. The script and script and story of my life is written around you. And trust me , the story of my life is going to be beautiful !"
            ,"I Lost My Heart From The Day You Came Into My Life\n" +
            "You Hold Me Tight In My Thoughts\n" +
            "All The Day And Night\n" +
            "I Pray That All My Life\n" +
            "I Live With You\n" +
            "Because I Just See You...\n" +
            "As My Love and Life!"
            ,"Sky is full of stars,\n" +
            "River is full of water,\n" +
            "Forest is full of trees,\n" +
            "World is full of living things, but \n" +
            "My heart full of love for you"
            ,"Love me without fear,\n" +
            "Trust me without wondering,\n" +
            "Love me without restrictions,\n" +
            "Want me without demand,\n" +
            "Accept me how is I'm,\n" +
            "A love like that,will be eternal"
            ,"Love is not a sweet talks and flowers, but love is forgiving and compromising"
            ,"It is Painful when yOu\n" +
            "get Hurt from yOur close ones...\n" +
            "but\n" +
            "The Pain silently tells how much yOu\n" +
            "are close to them.."
            ,"With You in My Thoughts, I Like Myself"
            ,"My name is \n" +
            "'I'\n" +
            "My problem is\n" +
            "' LovE'\n" +
            "And solution\n" +
            "' U'"
            ,"there r 2 thing in life that r very painful .one is when ur love loves u nd doesn't tellu second when ur love doesn't love u and tell u"
            ,"The best and most beautiful things in the world can't be seen, nor touched, but are felt in the heart"
            ,"love is n't only a girl,but true luv mean a luv b/w parents and his son and luv b/w frnds and him"
            ,"When I saw you, I was afraid to meet you... When I met you, I was afraid to kiss you... When I kissed you, I was afraid to love you... Now that I love you, I'm afraid to lose you....."
            ,"Love is like a friendship caught on fire. In the beginning a flame, very pretty, often hot and fierce, but still only light and flickering. As love grows older, our hearts mature and our love becomes as coals, deep-burning and unquenchable..."
            ,"A relationship is like a rose, How long it lasts, no one knows, Love can erase an awful past, Love can be yours, you'll see at last , To feel that love, it makes you sigh, To have it leave, you'd rather die, You hope you've found that special rose, Cause you love and care for the one you chose..."
            ,"I closed my eyes with a pen and paper in front of me.. Then i picked up the pen and started writing everything and when I opened my eyes again, all I saw was your name."
            ,"The day I fell in love with you is the day I knew what was truly true... The day I found you is when I found myself, for you have help me become the best.... You are mine and I am yours and forever shall it be."
            ,"Im not beatiful man.\n" +
            "Beauty is not in my face \n" +
            "just in my heart\n" +
            "so \n" +
            "trust me \n" +
            "i love you ♥"
            ,"Its lucky to love someone\n" +
            "Its ur fortune to love the one\n" +
            "who loves you....\n" +
            "\n" +
            "But Its a miracle to love a person who cnt love anyone expect you...."
            ,"A One hav no value wn It Write Down without adding zeros (or othr nmbrs)\n" +
            "But we write zeros after that 1 It ll become Valuable increasing with the numbr of zeros.\n" +
            "Like that I am a person who hav no value no Power wn I styng alone In my Life\n" +
            "But with ur Presence nd lov My life bcm more valuable,more powerful,more precious....\n" +
            "\n" +
            "So Dont leave Me alone I want ur Presence....Lov u so much"
            ,"True luv is hard 2 find special 1-1 of a kind. but the luv inside of me is true. it appeared the day i met you"
            ,"you are my love \n" +
            "you are my life\n" +
            "you are my soul\n" +
            "you are my heart\n" +
            "I love u my darling"
            ,"God:y is ur heart bleedng?\n" +
            "Boy: bcz i m writng on it da name of da girl\n" +
            "whom i love!\n" +
            "God:but y?\n" +
            "B:bcz u forgot 2 write her name in my\n" +
            "destiny!"
            ,"A True Relationship Is when Someone hurt's you and you don't hurt Them back.\n" +
            "They Shout's at you n you don't.\n" +
            "They ignore you but you don't.\n" +
            "But when they Need you ,\n" +
            "You are always with them !!"
            ,"In life LOVE is never planned nor does it happen for a reason...\n" +
            "Bt when LOVE is real, it becomes your plan for life and your reason for living."
            ,"Who will cry when you die?Who will die when you cry?Simple questions but if you have some one to answer,your are the luckiest person.:-)"
            ,"The saddest part isn't that with each passing day i feel like i need you more , but it's the fact that you don't need me at all."
            ,"Once in lifetime some1 breaks ur\n" +
            "heart nd if u still feel 2 hold that\n" +
            "person with every broken piece,\n" +
            "that amazing pain is called TRUE\n" +
            "LOVE…"
            ,"the love is like a wind ,you can not see but you can fill it and love is trust .the trust is like a paper ....i love you i love you my sweet heart"
            ,"When you smile, God smile but when you frown....devil will say you are the most beautiful angel ever....keep smiling"
            ,"Love is not about how much you say ' I LOVE YOU ,' \n" +
            "But how much you can prove that it's true..."
            ,"There's only 1 thing\n" +
            "2 do\n" +
            "3 words\n" +
            "4 you\n" +
            "I LOVE YOU."
            ,"True love isn't easy, \n" +
            "but it must fought for,\n" +
            "Because once you find it ,\n" +
            "Its can never be replaced."
            ,"Love is blind.\n" +
            "It will take over your mind..\n" +
            "What you think is love is , truly not..\n" +
            "You need to elevate your mind..."
            ,"Though distance tears us apart, I calling you but can't hear me...... I seeing you but can't see me......As long we're under the same sun in different place my love for you will ever be strong."
            ,"I closed my eyes and I saw you!\n" +
            "I walked to you and kissed your lips.\n" +
            "Held you tight and our bodies shook with emotions!\n" +
            "I was dreaming of us."
            ,"I have loved and have hurt too.\n" +
            "I have climbed the mountains and also came tumbling down.\n" +
            "I have been led blindly to follow the paths with thorns without my knowledge.\n" +
            "You found me blind but you showed me the ways to follow and guided me to this heavenly light.\n" +
            "Your love built me.\n" +
            "You are the best of me."
            ,"I can never ask for less! But does it make me selfish?\n" +
            "Am not only asking for a forever with you but ten more days after forever!\n" +
            "I want to love you more."
            ,"I stay up all night, just thinking about you.\n" +
            "Since I met you I have lost myself: your memories have taken the best of me!\n" +
            "But I don't want to know if you also feel or do the same too. I just want you to know that I love you!"
            ,"My eyes are hurting because I can't see you......\n" +
            "My arms are empty because I can't hold you....\n" +
            "My lips are cold because I can't kiss you....\n" +
            "My heart is broken because I'm not with you..... "
            ,"If i could give you one thing in life, i would give you the ability to see yourself through my eyes\n" +
            "I need a perfect lover who loves me sincerely."

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
                .setCategory("Love Messages")
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
                .setCategory("Love Messages")
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
                .setCategory("Love Messages")
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
                .setCategory("Love Messages")
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
                .setCategory("Love Messages")
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