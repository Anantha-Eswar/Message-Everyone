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

public class Sorry extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorry);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Sorry Messages");

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

    /* http://sms4smile.com/category/sorry-sms/page/3/
    http://wishesmessages.com/i-am-sorry-messages-for-girlfriend/
    http://wishesmessages.com/i-am-sorry-messages-for-friends/
    http://hamariweb.com/mobiles/sorry_sms_messages16.aspx?page=3
    */

    public static String[] messages = {"What I Did Was Foolish and Impulsive\n" +
            "If I Cud Take It All Back I'd Do This So Instant\n" +
            "I Truly Didn't Mean To Hurt You In Any Way\n" +
            "I'm Sorry For Hurting You"
            , "I am sorry\n" +
            "and\n" +
            "Trust me\n" +
            "Are the 2 most overly used Phrases.\n" +
            "Don't tell me you're sorry,\n" +
            "Show me you are ! !\n" +
            "Don't tell me to trust you\n" +
            "Show me that i can !!"
            , "SORRY SORRY SORRY SORRY\n" +
            "Dont get confused, SORRY means:\n" +
            "S->Some,\n" +
            "O->One Is,\n" +
            "R->Really,\n" +
            "R->Remembering\n" +
            "Y->You..\n" +
            "Have A wonderful day."
            , "Making The First Move\n" +
            "To Patch Up Things,\n" +
            "Shouldn't Always Come From\n" +
            "The One Who Made The Mistake\n" +
            "But\n" +
            "It Should Come From The One\n" +
            "Who Understands ... !!"
            , "Words Will Not Be Able To Ever Express\n" +
            "How Sorry I Am For This,\n" +
            "And I Have Profound Regret And Sorrow\n" +
            "For The Multitude Of\n" +
            "Mistakes And Harm\n" +
            "I Have Caused."
            , " Don't Know\n" +
            "How To Make Things Better Between Us\n" +
            "I Can Start By Saying\n" +
            "I'm Sorry\n" +
            "I Really Am:("
            , "Never apologize for how you feel,\n" +
            "Thats like saying sorry for being real!"
            , "If My tomorrow never comes\n" +
            "I M sorry for all the Things I might have Said\n" +
            "I M sorry for all the Things I did Or didn,T Do\n" +
            "I M sorry if I ever ignored you\n" +
            "I M sorry if I ever made you feel bad Or put you down\n" +
            "I M sorry if I ever thought I was bigger Or better than you\n" +
            "I M sorry for everything wrong I have ever done\n" +
            "I M Writing This becoz if My tomorrow never comes?\n" +
            "If I never get A chance To say sorry then I m sorry.. "
            , "We love ourself even after making so many mistakes.\n" +
            "Then how can we hate others 4 their small mistakes?\n" +
            "Strange but true! So make habit of FORGIVING."
            , "As I feel the tear go down my cheek,\n" +
            "I notice that my heart is weak,\n" +
            "\n" +
            "For the love I have for you,\n" +
            "Will always be gold and true,\n" +
            "\n" +
            "I have made some mistakes, they rest in the past,\n" +
            "But know my love will always last,\n" +
            "\n" +
            "Even though we are a distance apart,\n" +
            "You always have the key to my heart."
            , "I am sorry to be smiling every time youre near.\n" +
            "I am sorry my eyes twinkle whenever youre here.\n" +
            "I am sorry that cupid has made his hit.\n" +
            "I am sorry i love you,\n" +
            "I cant help it."
            , "Apology doesn't mean that you were wrong,\n" +
            "or the other person was right.\n" +
            "It means that\n" +
            "your relationship is valuable than your ego."
            , "Sometimes, you forgive people\n" +
            "simply because\n" +
            "you still want them in your life."
            , "When a Guy does Something Wrong!\n" +
            "\n" +
            "Girl : You broke my Favorite Lamp!\n" +
            "Boy : It was an Accident... I didn't mean to..!\n" +
            "Girl : I can't believe you did this.\n" +
            "Boy : I'm Sorry.. !! :(\n" +
            "\n" +
            "When a Girl does Something Wrong!\n" +
            "\n" +
            "Boy : You Lost My Dog??!!!\n" +
            "Girl : It was an Accident. I didn't mean to!\n" +
            "Boy : I can't believe you did this.\n" +
            "Girl : I already feel bad about it..!! Stop making me feel Worse..!!\n" +
            "Boy : I'm Sorry..!!:("
            , "Sometimes saying sorry is\n" +
            "the most difficult thin on earth...\n" +
            "\n" +
            "But its the cheapest thing\n" +
            "to save the most expensive gift\n" +
            "called Relationship..!!!"
            , "The heart that knows\n" +
            "how to bow down\n" +
            "and\n" +
            "say SORRY\n" +
            "is the heart\n" +
            "that loves the most."
            , "'Forgiveness'\n" +
            "\n" +
            "When it's not given in the rite time or\n" +
            "When it is not asked in the rite time,\n" +
            "You will miss something PRECIOUS in your life..."
            , "I Know How Angry You Are ...\n" +
            "and\n" +
            "What You Must Be Going Through\n" +
            "So I Hope , You Know\n" +
            "How Sorry I Am For All\n" +
            "That Happens Between Us ...\n" +
            "Please Forgive Me."
            , "Take your time. Don’t worry. I’ll wait forever, if that is what it’ll take for you to forgive me. I love you."
            , "My heart has been leaking and bleeding since the day I hurt you. Please plug the holes with your forgiveness. I am sorry."
            , "I thought our RELATIONSHIP was immune to all of life’s diseases until a virus called LIES made it sick. I am going to use a regular doze of medication which includes APOLOGIES, HUGS and KISSES to make it feel better. I am sorry."
            , "Angry is ugly, forgiveness is sexiness. Forgive me please?"
            , "With a bruised heart and a deflated ego, with sad soul and a head hung low. I apologize to you unconditionally, baby I am really very sorry. I love you."
            , " I am sorry for being jealous. It’s just that I’m afraid of losing the best thing to have ever happened to me."
            , "I overlooked your happiness in an attempt to make myself happy, only to realize that my happiness lies in yours. I am sorry, please forgive me."
            , "I trust fate and I believe in love, which is why I know you’ll accept my apology. I’m sorry."
            , "I have shown you what an idiot I can be by making that mistake. Now it is your turn to show me what a darling you can be by giving your anger a break. I am sorry."
            , "I took for granted, all our smiles, laughs and memories. I promise I’ll never do it again, because they mean the world to me. I am sorry."
            , "I am not saying sorry just because I understand the difference between right and wrong. I am saying sorry also because our relationship is more important to me than my ego. I love you."
            , "Regret, heartbreak and sadness, have stolen my life’s happiness. I am sorry for letting you down, but I promise to erase your frowns. xoxo"
            , "I can’t believe how I drove us apart, when all I ever wanted was for us to be together… now and forever. I am sorry."
            , "Sorry is the only word you will see in my texts, Facebook updates, tweets and pins… until you forgive me. xoxo"
            , "I won’t say a word. The sweetest apologies are never said, they are felt. I am just going to let you look at the tears in my eyes until your heart melts. I am sorry."
            , "I know you will eventually forget the ungrateful things that I said. But I will never forget how wonderful you made me feel even after I was rude. I am sorry."
            , "I am sorry I haven’t been in touch since quite a while but I have been really busy. But I seek comfort in the fact that our friendship is so beautiful that even if we speak after many months, it will be just like we spoke yesterday."
            , "As my best friend, I know you have the right to demand an apology. As your best friend, I hope you know I have the right to demand forgiveness. I am sorry."
            , "I feel ashamed that I broke my friend’s trust. I know what I have done is unjust. But I will never let our friendship rust. I’m sorry."
            , "Our friendship’s value is such that without it, my life’s value would be worthless. I’m sorry."
            , "Dear friend, all I want you to remember is that I love you and you are a part of my destiny. Please disregard my mood swings that are quirky. Please give me a hug when I seem grumpy. Please tell me everything will be alright when I am feeling gloomy. Please don’t ever take my annoying rants seriously. If I have said anything that has hurt you, I am sorry."
            , " I am sorry I lied, I am sorry you cried. I didn’t mean to be rude, please forgive me dude."
            , "Our friendship is too precious and I would never want to lose you by doing something irrational. I am sorry my words hurt you but I want you to know that it wasn’t intentional."
            , "Our friendship has no rules but it is based on two beautiful things – unlimited love and unlimited forgiveness. I am sorry for annoying you, please forgive me."
            , "I am sorry for not returning all your calls but I am going through hard times. I have learnt a lot from this tough period in my life. Most importantly, that friends like you are priceless."
            , "I am sorry for lying. You can be as mad at me as you want. But do it quickly because I have to tell you something really important."
            , "Just like how you spotted my lie by simply looking in my eyes, I am sure you will spot the regret in my heart just by hearing my voice. I am sorry."
            , "Dear friend, I Am Sorry is all I am going to say. The rest, I will let the silence convey."
            , "There is nothing in the whole word that I will allow to come in-between our friendship – not even my own mistakes. I’m sorry."
            , "I know you are angry at me. The nasty look in your eyes, I can see. I know you feel let down. I can sense the hurt in your frown. I shouldn’t have lied to you, I realize. After all, friends like you are my life’s prize. I am sorry."
            , "Sorry for being such a brat the other day and thank you for being such a wonderful friend by hugging me even when I was annoyingly."
            , "You are my best friend because you tolerate the worst in me. Sorry for the other day."
            , "Sometimes I take you for granted and sometimes I don’t think before speaking to you. I want you to remember that this is only because you are the only person in the whole world in front of whom I can be myself. Sorry for behaving rudely the other day."
            , "Friends like you come along once in a lifetime and I would never do anything intentionally to jeopardize our friendship. I am sorry."
            , "Sometimes I take the liberty to take you for granted because deep down in my heart I know that my best friend will always understand. I am sorry."
            , "I am the moon in your life. A couple of times during the year I let the skies go dark but otherwise I am always there to shine the radiant glow on friendship on you forever. I am sorry."
            , " I expect everyone I know to hurt me in some or the other way at some point in life. Everyone but you – my best friend. That’s why I know exactly how it must have felt when I hurt you. I am really very sorry."
            , "I know I risked our friendship by being selfish. I know that I did the wrong thing by lying to you. I know I hurt you very badly. But I also know that our friendship will last forever, no matter what happens. I am sorry."
            , "My mistake was an accident but our friendship isn’t. My apology is full of regret but our friendship isn’t. I’m sorry."
            , " I am sorry I haven’t been in touch. I am sorry I haven’t called you much. I am sorry we haven’t met since a long time. I am truly sorry, for all these little crimes. The truth is that I have been busy. I have no excuses, I’m sorry."
            , "I never meant to insult you. I never meant to make fun of you. I am sorry that my words hurt you. I will do everything it takes to make it up to you. I promise."
            , " I am a little goofy, grumpy, choosy, funky, lovely, lucky, clumsy, spunky, classy, sassy, artsy, noisy and most importantly, SORRY."
            , "Me and you, are not just the perfect friends. Me and you, are going to be soul mates till the end. I’m sorry."
            , "Don’t judge me on one incident. I agree I goofed up but if you really want to judge our friendship, think about the number of times I saved you when you goofed up. I am sorry."
            , "I will never lie to you again, I will never cause you any more pain. From now on I will be extremely cautious, because our friendship is too precious. Please forgive me."
            , "Our friendship is lifelong. My silly mistake is just a little pothole along this beautiful journey. I am sorry."
            , "Surviving bad times is the real strength of a friendship. I am sorry I goofed up but I will do anything to prove that our friendship is the strongest."
            , "I am not SURE how many people would tolerate my mood swings but I am SURE that you would. I am sorry for being such a jerk the other day."
            , "I don’t care whether you forgive me or not. You will forever be the friend who I love a lot. I’m sorry."
            , "The four hardest tasks are:\n" +
            "To return love for hate;\n" +
            "To include the excluded;\n" +
            "To forgive without apology;\n" +
            "And to be able to say, I was wrong!"
            , "The heart that knows how to bow down and say SORRY is the heart that loves the most!"
            , "I hurt you…\n" +
            "But I didn’t mean to…\n" +
            "Please forgive me!\n" +
            "I am Sorry"
            , "What I did was foolish and totally impulsive.\n" +
            "If i could take it all back, i'd do this so instantly.\n" +
            "I truly didn't mean to hurt you in any way.\n" +
            "I'm sorry for hurting you!"
            , "I committed a sin and make you sad;\n" +
            "And am realizing that I am very bad.\n" +
            "So please forgive me to lessen the grief;\n" +
            "Your forgiveness will led to a relief!"
            , "You Should Forgive Me,\n" +
            "And Do You Know Why?\n" +
            "Because I Can’t Stand The Thought\n" +
            "Of You Hurting Because\n" +
            "Of Someone Like Me,\n" +
            "And The Only Way You’ll Ever Stop Being Hurt\n" +
            "By Me,\n" +
            "Is If You Stop Hating Me\n" +
            "So You Can Just Forget That\n" +
            "I Ever Even Existed."
            , "I am sorry to be smiling every time you’re near.\n" +
            "I am sorry my eyes twinkle whenever you’re here.\n" +
            "I am sorry that cupid has made his hit.\n" +
            "I am sorry i love you,\n" +
            "I can’t help it."
            , "Never be too proud to apologies. A heartfelt “I am sorry” can solve most of our problems. It’s really true… Don’t let ego get in the way.."
            , "I don't have the words to make you feel better;\n" +
            "But I do have arms to give you a hug;\n" +
            "and a heart that's aching to see you smile again. I am extremely sorry!"
            , "I am sorry is a statement.\n" +
            "I won't do it again is promise.\n" +
            "How do I make it up to you, is a responsibility."
            , "4give You Again ???\n" +
            "For All The Times You Made Me Cry??\n" +
            "For All The Things You Said About Me?\n" +
            "For All The Crap You Started?\n" +
            "For Stabbing Me In The Back??\n" +
            "No I Wont 4give You ,\n" +
            "Not This Time"
            , "Sometimes the Measure\n" +
            "Of Friendship\n" +
            "Isn’t Ur Ability 2 Not Harm\n" +
            "But\n" +
            "Ur Capacity 2 4give Things Done 2 U\n" +
            "and\n" +
            "Ask 4giveness 4 Ur Own Mistakes =)"
            , "Refusing To Forgive Someone\n" +
            "Is Like Drinking Poison,\n" +
            "And Waiting For\n" +
            "The Other Person To Die.\n" +
            "I am Sorry"
            , "B da first 1 to say Sorry\n" +
            "when da other person seems 2\n" +
            "b hurt because of U and Be the 1st\n" +
            "one to forgive if a Person says\n" +
            "Sorry to U!"
            , "The moment you cry,\n" +
            "I feel sorry,\n" +
            "I am not the reason .. but\n" +
            "still I am here but you cry..\n" +
            "Believe me my happiness is not there..\n" +
            "If for any reason you cry..\n" +
            "Let me say sorry..\n" +
            "Sorry .. I was not there when you cry..\n" +
            "But.. Now I am here..\n" +
            "Won’t let you any sadness to try..\n" +
            "Won’t let you ever cry ..\n" +
            "I am SORRY .."
            , "I don't know quite how to make things better between us\n" +
            "I can start by saying...\n" +
            "I'm sorry\n" +
            "I really am ."
            , "A Good Apology Has 3 Parts!\n" +
            "1) I’m Sorry\n" +
            "2) It’s My Fault\n" +
            "and\n" +
            "3) What Can I Do To Make It Right.\n" +
            "\n" +
            "But,Most Of The People Misses The 3rd Part."
            , "I'm sorry you are wiser, I'm sorry you are taller; I liked you better foolish and I liked you better smaller."
            , "I’m sorry for blaming you… For everything I just couldn’t do… And I’ve hurt myself by hurting you… There’s nothing I wouldn’t do to hear your voice again… Sometimes, I want to call you, but I know you won’t be there… It’s hard to say goodbye"
            , "I have made terrible mistakes that have hurt the people that I cared about the most, and I am terribly sorry. I am deeply ashamed of my terrible judgment and my actions."
            , "Too often we don't realize what we have until it's gone;\n" +
            "Too often we're too stubborn to say, Sorry, I was wrong;\n" +
            "Too often it seems we hurt the ones closest to our hearts;\n" +
            "And we let the most foolish things tear us apart !"
            , "Saying 'Sorry' may have become just another 'Word';\n" +
            "But with tears in eyes, it means the 'World' to everybody!\n" +
            "I am sorry!"
            , "I am so so so sorry!\n" +
            "Please forgive me for I shall certainly to mend myself!"
            , "I am so sorry, my friend... I made you mad.\n" +
            "I am so sorry, darling... for making you sad.\n" +
            "Please forgive me, my babe... and make me glad!"
            , "Its very easy to hurt someone and say sorry\n" +
            "but its really difficult to get hurt and say\n" +
            "Its Ok :(("
            , "Refusing to forgive someone is like drinking poison;\n" +
            "And waiting for the other person to die.\n" +
            "I am Sorry!"
            , "Sometimes you forgive people Simply because you still want them in your Life"
            , "Sometimes sorry is not enough."
            , "I've decided I'm not going to focus on my past anymore. So if I owe anyone money, I'm sorry!"
            , "Don't feel sad over someone who gave up on you feel sorry for them because they gave up on someone who would have never given up on them"
            , "You say sorry but your actions say you don’t."
            , "I am not Perfect\n" +
            "I make Mistakes\n" +
            "I hurt People\n" +
            "\n" +
            "But when i say SORRY \n" +
            "I mean it"
            , "Have you ever heard a word having 5 alphabets that can sort out everything... \n" +
            "No \n" +
            "It's a Word \n" +
            "SoRrY"
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
                .setCategory("Sorry Messages")
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
                .setCategory("Sorry Messages")
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
                .setCategory("Sorry Messages")
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
                .setCategory("Sorry Messages")
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
                .setCategory("Sorry Messages")
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