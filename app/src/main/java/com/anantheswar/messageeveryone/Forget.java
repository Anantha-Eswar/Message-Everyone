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


public class Forget extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget);
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
    }

    /* http://smsrange.com/category/forget-sms/page/5/
    http://www.desicomments.com/sms/sms/forget-sms/page/2/
    Latest new (All)
     */

    public static String[] messages = {"Forget the times he walked by,\n" +
            "Forget the times he made you cry,\n" +
            "Forget the times he spoke your name,\n" +
            "Remember now your not the same.\n" +
            "Forget the times he held your hand,\n" +
            "Forget the sweet things if you can,\n" +
            "Forget the times & don’t pretend,\n" +
            "Remember now he’s just your friend"
            , "I don’t send you a text message every day,\n" +
            "to remind you that I am here.\n" +
            "I do it to remind you that I have not forgotten you."
            , "Of all the friends I’ve ever met.\n" +
            "Your the one I won’t forget.\n" +
            "And if I die before you do\n" +
            "I’ll go to heaven and wait for you."
            , "A Wonderful Saying..\n" +
            "Trying To Forget Someone Whom\n" +
            "You Love A Lot Is Like\n" +
            "Trying To Remember\n" +
            "Someone\n" +
            "You have Never Met?!"
            , "Once Upon a Time,\n" +
            "Something happened to me.\n" +
            "It was the sweetest thing that ever could be.\n" +
            "It was a fantasy, a dream come true,\n" +
            "it was the day I met you.\n" +
            "So do not forget me!"
            , "Beautiful Friend & Beautiful thoughts\n" +
            "are rare to find\n" +
            "But I’m lucky to find\n" +
            "such a beautiful Frnd\n" +
            "whose beautiful thoughts\n" +
            "always fills My mind.."
            , "Life has its ups & downs.\n" +
            "Sometimes SUN shines,\n" +
            "sometimes RAIN pours.\n" +
            "But dont forget, it takes both SUN & RAIN\n" +
            "to make a RAINBOW!! Enjoy life."
            , "I Will Wait …\n" +
            "Till The Day”I” Can Forget “You” …\n" +
            "OrThe DayYou Realize\n" +
            "“You” Cannot Forget “Me” …"
            , "When a person can find ur sorrows behind ur sMiLe,\n" +
            "Words behind ur siLence\n" +
            "&\n" +
            "Love behind ur anger,\n" +
            "u can believe U have found ur best Friend…..\n" +
            "So remember the precious friend."
            , "Wherever I Go,\n" +
            "I can Feel you…\n" +
            "Whatever I See,\n" +
            "I can See you…\n" +
            "Whatever I hear,\n" +
            "I can hear Ur Voice…\n" +
            "Whatever I Do,\n" +
            "I Feel Ur Presence In Me…\n" +
            "Even though you are Miles apart from me,\n" +
            "U are Living within me dear…"
            , "Winter\n" +
            "comes\n" +
            "again & again.\n" +
            "Summer\n" +
            "comes\n" +
            "again & again.\n" +
            "But a person\n" +
            "like u never\n" +
            "comes\n" +
            "again & again.\n" +
            "B’coz\n" +
            "God never makes nice person\n" +
            "That’s why i am not able to forgrt u."
            , "Happy Moments -Don’t forget\n" +
            "me,\n" +
            "Difficult Moments-\n" +
            "Trust Me\n" +
            "Quiet Moments-\n" +
            "Call Me,\n" +
            "painful Moments-\n" +
            "Tell me.\n" +
            "Free Moments-\n" +
            "SMS Me …;->"
            , "Someday you’ll forget about me,\n" +
            "…my name,\n" +
            "…my voice,\n" +
            "who I am &\n" +
            "who I am to you…\n" +
            "But even if you forget about me,\n" +
            "I just wan u to know…\n" +
            "I’ll never forget you…"
            , "Sometimes, I forget to say hi,\n" +
            "Sometimes, I even miss to reply,\n" +
            "Sometimes, my msg doesn’t reach u,\n" +
            "But, it doesn’t mean that I forget u,\n" +
            "I’m just giving u time to miss me!"
            , "In My Life I learned\n" +
            "How to Love,\n" +
            "to Smile,\n" +
            "to be Happy,\n" +
            "to be Strong,\n" +
            "to Work Hard,\n" +
            "to be Honest,\n" +
            "to be Faithful,\n" +
            "to Forgive.\n" +
            "But I couldn’t learn\n" +
            "How to Stop\n" +
            "REMEMBERING You…"
            , "We May Walk Side By Side Or Reside Miles Apart …\n" +
            "But Someone Like You Will Always Be close to My Heart\n" +
            "I Like You To Be With You Always ..!!!\n" +
            "So Always Remember Me."
            , "‘Someday you’ll forget about me, …my name, …my voice, who I am & who I am to you… But even if you forget about me, I just wan u to know… I’ll never forget you…’"
            , "Ocean can dry Mountain can fly You can forget me But…never can I !!"
            , "Do good and forget it as often we forget what someone does for us."
            , "God has given Eyes: To look at U. Hands: To pray for U. Mind: To remember U. Heart : To love U. And And Legs: To kick u if u 4get me"
            , "I can 4 get a home I can 4 get a place I can 4 get a name I can 4 get a game I can 4 get even myself But 4getting u ? 4 get it"
            , "When u make da finding yourself Even if u’re the last person on Earth 2 c the lite- u never 4get it."
            , "A water droplet on a greeny leaf appears like a pearl.datz way u also appeared & shines my life. so I never foget u through out my life."
            , "A Girl’s Heart Is Slower Than Turtle In Forgetting A Guy Whom She Loved But A Guy’s Eye Is Faster Than Google In Searching A Beautiful Girl In A Crowd …"
            , "Generally we believe our Memory is weak. But when we want to forget someone a Lot, We begin to realize how powerful our Memory is! Strange but True!."
            , "Let all my smile be yours All your tears be mine, Let all my happiness be yours All your sadness be mine,\n" +
            "Let the whole world be yours, Only you be mine Do not forget me"
            , "Best Ever Quote In “LOVE” Some Say “Always Remember Me” Some Say “Never 4get Me” But I Will Say.. “4get Me If U Really Can!”"
            , "I thought life could be lived wizout the shadows of love. But impossible wizout my beloved How can I forget your smile Through even a thousand mile How can I forget your talk Which made me night walk How can I forgets your jokes Which make u a nice bloke How can I simply forget you"
            , "Some says its difficult to remember, Some says its difficult to forget, So remember not to forget me & don’t forget to remember me."
            , "Love: Why does it hurt? y does it pain? may be because we love someone too much & too deep that sometime, we forget to keep a little for ourselves !!!"
            , "This is a moon which learns from you, That is a sun which respects you, There are stars which shine for you, And here… It’s me who live for you. forget me not plz……"
            , "Let all my smile be yours All your tears be mine, Let all my happiness be yours All your sadness be mine, Let the whole world be yours, Only you be mine Do not forget me…"
            , "good night to see u by morning good morning to see u by noon good after noon to see u by evening good evening to see u by night read again from first, this means every time I want to see u"
            , "The Day Was Bad Because Didn’t See Your Face… The Classes Were unconcentrative Because Didn’t Heard Your Voice… Free Times Were Boring Because You Weren’t There… In My Face Smile Wasn’t There Because Didn’t See Your Smile Didn’t Miss You, Because We Miss That Person Whom We Think Is Not With Us… But You are Always There In My Heart…"
            , "Day is brighter to see all night is darker to dream all my heart feels to see u all will never miss friends u all good morning to all"
            , "Please bear in mind all the trouble we’ve been through, The good times, the hardships, the places we’ve been to, I wish that my memory would stay with you forever, I know I will never forget you!"
            , "Time Makes Us Forget Some People But Some People Makes Us Forget Time Such People Become Our Life …"
            , "I Will Wait … Till The Day “I” Can Forget “You” … Or The Da You Realize “You” Cannot Forget “Me” …"
            , "Your presence we miss, Your memories we treasure, Loving you always, Forgetting you never."
            , "some time u miss me some time i miss u.. some time u hurt me some time i do.. some time u sms me some time i do.. some time u forget me thats the onlyi never do.."
            , "They say it takes a minute 2 find a special person, an hour 2 appreciate them, a day 2 love them, but then… an entire life 2 forget them."
            , "Never say ur happy when ur sad , Never say ur fine when ur not ok , Never say u feel good when u feel bad, And never say ur alone when I’m still alive…"
            , "I don’t know what to do, I kept imagining you. I should be dreaming, quietly sleeping, but my mind won’t stop thinking about you"
            , "Remember me like a pressed flower in ur notebook it may not Be having any fragrance but will remind U of my existence forever in Ur life…"
            , "So, I will stand here forever, If forever’s what it takes, because you are my forever, and forever always waits."
            , "NEVER FORGET 3 TYPES OF\n" +
            "PEOPLE IN YOUR LIFE-\n" +
            "\n" +
            "\n" +
            "1- Who Helped you in Your Difficult Time\n" +
            "\n" +
            "2- Who Left You In Your Difficult Times\n" +
            "\n" +
            "3- Who Put You In Difficult time"
            , "\"Forgive People\n" +
            "Who Have Hurt You\n" +
            "Is Your Gift To Them...\n" +
            "'N\n" +
            "Forgetting People\n" +
            "Who Have Hurt You\n" +
            "Is Your Gift To You\"..!"
            , "Till we forgive someone \n" +
            "who has hurt us, \n" +
            "they continue occupying free \n" +
            "rent space in our mind..."
            , "Forgive my eyes for \n" +
            "admiring u tears for cry \n" +
            "after u pain for long after \n" +
            "u ear hear u heart wnt u \n" +
            "mouth wnt to kiss u arms wnt to hold u \n" +
            "finger for wnt to touch u brain for think abt u leg wnt to dance life wnt to live bt most of all forgive ME."
            , "We love our-self even after making so many mistakes. \n" +
            "Then how can we hate others 4 their small mistakes? Strange but true! \n" +
            "So make habit of FORGIVING"
            , "My plan is to forgive and forget: \n" +
            "forgive myself from being stupid \n" +
            "and \n" +
            "forget you ever existed.."
            , "Never abandon old friends.\n" +
            "They are hard 2 replace.\n" +
            "Friendships is like wine:\n" +
            "it gets BETTER as it grows OLDER.\n" +
            "Just like us? i get BETTER, u get OLDER."
            , "Moon said to me,\n" +
            "if ur friend is not messaging u why dont you leave ur friend.\n" +
            "I looked at moon and said,\n" +
            "does ur sky ever leave u when u dont shine."
            , "When it rains, you dont see the sun, but its there.\n" +
            "Hope we can be like that.\n" +
            "We dont always see each other,\n" +
            "but we will always be there for one another."
            , "Caring is a gift that no one can buy.\n" +
            "It?s made up of love,\n" +
            "that roots in our hearts & creates memories\n" +
            "not just for a while but 4 a lifetime??.."
            , "The World is round,\n" +
            "We?ll meet again and again..\n" +
            "Whenever we meet I'll ask you,?How r u??\n" +
            "Hope you?ll not jumble the words and ask me,?Who r u??"
            , "I may be gone for a minute,\n" +
            "for hours, for a day.\n" +
            "I may not be able to say good morning or good night.\n" +
            "but I'll never try to say\n" +
            "goodbye to a person\n" +
            "who has been sweet and true."
            , "Some day if i die..\n" +
            "don't think tht i forgot u?.\n" +
            "just have a look towards sky!\n" +
            "my tears will be a rain drop on ur cheeks 2 say\n" +
            "?hey I?m still with you!?"
            , "Sun rise gives free from darkness,\n" +
            "small smile gives free from worries,\n" +
            "small sms gives free from forgetting"
            , "Never forget the times we had together.\n" +
            "I have surfed the highest waves of bliss with you"
            , "A walk as strong as walk could have been,\n" +
            "Your smile as beautiful as ever can be.\n" +
            "Our times went by, we had our laughs,\n" +
            "Please don't forget our valuable past."
            , "Even though we are at the crossroads,\n" +
            "Please, listen to what my heart says.\n" +
            "I wish that you never forget me,\n" +
            "Even if we go in two opposite ways."
            , "When tears run down your face,\n" +
            "And when sorrow sleeps in your head,\n" +
            "Never forget that despite that you are scared,\n" +
            "Just close your eyes, I will always be there."
            , "I Can\n" +
            "Forget A Face..\n" +
            "I Can\n" +
            "Forget A Home..\n" +
            "I Can\n" +
            "Forget A Place..\n" +
            "I Can\n" +
            "Forget Name..\n" +
            "I Can\n" +
            "Forget A Game..\n" +
            "I Can\n" +
            "Forget Even Myself..\n" +
            "But\n" +
            "Forgetting U...?\n" +
            "Forget It..!"
            , "Forget Your Own Sadness By\n" +
            "Creating A Little Happiness\n" +
            "For Others, Bcoz When You\n" +
            "Are Good To Others\n" +
            "You Are Best To Yourself!!"
            , "Distances never separate any relation,\n" +
            "time never breaks any relation.\n" +
            "If feelings r true from heart,\n" +
            "then friends r always friends forever!\n" +
            "So never tried to forget the loved once.."
            , "People Meet By Chance !!\n" +
            "they Spend Sweet Times 2gether.\n" +
            "then God Apart Them\n" +
            "Not 2 End The Story,\n" +
            "But 2 C How Much they Need Each Other.\n" +
            "Plz not forget me."
            , "U mAy tHiNk thAt TiMe MaKeS pEoPLe fOrgEt..\n" +
            "BuT tHe LoNgEr thE TimE\n" +
            "pEoPLe SpEnD aPaRt,\n" +
            "thE mOrE iT MakEs tHEm REMEMBER eAcH oThEr?"
            , "To Kill An Enemy\n" +
            "You Required A Sword Or A Gun\n" +
            "But\n" +
            "To Kill A Loved One\n" +
            "Just Being Silent Is Enough\n" +
            "Remember !!\n" +
            "Never Try To Do That? (:"
            , "Remember me like a pressed flower in your notebook it may not Be having any fragrance but will remind U of my existence forever in Ur life.."
            , "?Forget who hurt you yesterday, but don't forget\n" +
            "who loves you tenderly today.?\n" +
            "?You can?t buy love, but you can pay heavily for\n" +
            "it??"
            , "Books says READ ME; \n" +
            "\n" +
            "Girls says LOOK ME; \n" +
            "\n" +
            "Money says ENJOY ME; \n" +
            "\n" +
            "Flowers says LOVE ME; \n" +
            "\n" +
            "My sms says just REMEMBER ME."
            , "IF U FORGET ME THEN\n" +
            "\n" +
            "\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "5\n" +
            "6\n" +
            "7\n" +
            "8\n" +
            "9\n" +
            "10\n" +
            "11\n" +
            "12\n" +
            "13\n" +
            "14\n" +
            "15\n" +
            "16\n" +
            "17\n" +
            "18\n" +
            "19\n" +
            "20\n" +
            "21\n" +
            "22\n" +
            "23\n" +
            "24\n" +
            "25\n" +
            "26\n" +
            "27\n" +
            "28\n" +
            "29\n" +
            "30\n" +
            "31\n" +
            "32 ....\n" +
            "I''ll break all 32 teeth."
            , "Life has its ups & downs. Sometimes SUN shines, sometimes RAIN pours. But dont forget, it takes both SUN & RAIN to make a RAINBOW!! Enjoy life."
            , "MeMoRiEs r tReAsUrEd,\n" +
            "No oNe cAn StEaL.\n" +
            "PaRtInG Is hEaRtAcHe,\n" +
            "nO oNe cAn HeAl.\n" +
            "SoMe?ll fOrGoT u wHeN u R gOnE,\n" +
            "BuT I'll r3m3mb3r u No MaTteR HoW lOnG?..;->"
            , "The best feeling in the world is when u think that ur friend forgot u\n" +
            "\n" +
            "&\n" +
            "\n" +
            "suddenly\n" +
            "\n" +
            "u receive a msg from ur friend saying = =\n" +
            "\n" +
            "\"Hey I am Missing YOU yaar <-:"
            , "Everything Is Incomplete Widout ?Me?\n" +
            "\n" +
            ". . mory\n" +
            "\n" +
            "Co . . dy\n" +
            "\n" +
            "Ti . .\n" +
            "\n" +
            "Ga . .\n" +
            "\n" +
            "So . . thing\n" +
            "\n" +
            ". . aning\n" +
            "\n" +
            "&\n" +
            "\n" +
            "Even this . .ssage!\n" +
            "\n" +
            "So don't 4get ?ME?..:->"
            , "I Will Wait ?\n" +
            "\n" +
            "Till The Day\n" +
            "?I? Can Forget ?You? ?\n" +
            "\n" +
            "Or\n" +
            "\n" +
            "The Day\n" +
            "You Realize\n" +
            "?You? Cannot Forget ?Me? ?"
            , "I don't know why I?m so afraid to lose u when u r not even mine.\n" +
            "I don't know why I luv u so when u don't even luv me.\n" +
            "I don't know why u r the one when I?m just a someone to u."
            , "Gone yet not forgotten,\n" +
            "Although we are apart,\n" +
            "Your spirit lives within me,\n" +
            "Forever in my heart."
            , "Sometimes one may fail to reply for our calls,\n" +
            "it doesnt mean that they have forgot us..\n" +
            "it just mean that,\n" +
            "They don't have enough time as we have for them?"
            , "What makes some people dearer is not just the happiness\n" +
            "that we feel when we meet them\n" +
            "but the emptiness we feel\n" +
            "when they are not around us."
            , "Only few caring hearts can easily identify\n" +
            "some little lies in ur smile & some more\n" +
            "truth in ur tears?\n" +
            "Never let them go from ur life !!!"
            , "Knowing a person like u,\n" +
            "has made me happy in a million ways\n" +
            "and if ever I have to let forget you?\n" +
            "I would find a million reasons to make u stay."
            , "People live People die\n" +
            "People Laugh People Cry\n" +
            "Some give up Some will try\n" +
            "Some say hi Some say bye\n" +
            "Others may forget you but never will I."
            , "I hv tried to move on but with every guy\n" +
            "I feel more & more like I'll never be able to replace u.\n" +
            "And the sad thing is?\n" +
            "I know I hv already been replaced"
            , "Every tear is a sign of broken heart,\n" +
            "every silence is a sign of loneliness,\n" +
            "every smile is a sign of happiness,\n" +
            "every SMS is a Symbol of Remembrance."};


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
                .setCategory("Forget Messages")
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
                .setCategory("Forget Messages")
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
                .setCategory("Forget Messages")
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
                .setCategory("Forget Messages")
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
                .setCategory("Forget Messages")
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