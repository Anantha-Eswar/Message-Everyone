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
public class Emotional extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotional);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Emotional Messages");

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
    }

    /*http://smsrange.com/category/emotional-sms/page/5/
      Latest new 1-50
     */
    public static String[] messages = {"Every heart has a pain. \n" +
            "Only the way of expressing it is different.\n" +
            "Fools hide it in their eyes;\n" +
            "While the brilliant hide it in their smile!"
            , "No amount of medical research will find a \n" +
            "cure as effective as when Mom kisses the \n" +
            "place that hurts."
            , "Smile like you've never cried;\n" +
            "Fight like you've never lost;\n" +
            "Love like you've never been hurt;\n" +
            "And live like you'll die tomorrow!"
            , "You have to keep breaking \n" +
            "your heart \n" +
            "until it opens."
            , "Why do we close our eyes?, \n" +
            "when we pray,\n" +
            "when we cry ,\n" +
            "when we kiss when we dream ....\n" +
            "because the most beautiful things in our life r not seen but felt only by heart"
            , "Our prime purpose in this life is to help others. And if you can’t help them, at least don’t hurt them."
            , "Everyone sees who I appear to be but only a few know the real me, you only see what I choose to show there’s so much behind my smile you just don’t know."
            , "Always try to be sensitive about others feelings,\n" +
            "because if a tear can be a symbol of happiness….\n" +
            "Then a smile can be a symbol of deep hurt…"
            , "Painful Message:\n" +
            "When a very sweet\n" +
            "and\n" +
            "Close person goes to far from us,\n" +
            "we may or may not say\n" +
            "But\n" +
            "Our heart says to their heart\n" +
            "“You Made Me Alone”.. ! :/ :("
            , "If ever I knew that love will become reason of pain and destruction for me. I would never let my heart go."
            , "A person can apologize\n" +
            "and we can forgive them,\n" +
            "but sometimes we just can’t forget\n" +
            "the pain that they gave !!"
            , "I have stopped making wishes on spotting falling stars.\n" +
            "Do you know why? Because I have you and that?s all I want in my life."
            , "Best Moment Of Life..!\n" +
            "\n" +
            "?When You Need To Tell\n" +
            "Someone Your Feeling's.\n" +
            ".\n" +
            ".\n" +
            "But You Just Can?t and\n" +
            "Then You Hug The Person\n" +
            ".\n" +
            ".\n" +
            "And That Person Says\n" +
            "In Your Ears?.?\n" +
            "I Understand..[?]"
            , "If u HATE someone,\n" +
            "U tell it to everyone?.. without any\n" +
            "fear.\n" +
            "But\n" +
            "If u LOVE someone,\n" +
            "U fear even to tell the loved\n" +
            "one??..??\n" +
            "\n" +
            "Its Amazing but True??!!"
            , "The worst thing in life is not losing the one we love?.\n" +
            "But losing yourself in the process of loving someone too much?!!!!!"
            , "I AM NOT THE BEST PERSON FOR YOU,\n" +
            "\n" +
            "BUT I CAN GUARANTEE YOU TO BE BETTER THAN THE PERSON YOU LOVE"
            , "I PREFER TO BE JEALOUS TYPE\n" +
            "\n" +
            "AT-LEAST SOMEDAY YOU WILL\n" +
            "\n" +
            "UNDERSTAND HOW MUCH I CARE"
            , "Respect The Emotions In Someone\n" +
            "Heart, Rather Dan The\n" +
            "Expressions On Someones Face\n" +
            "Bcoz Expression Is Just A\n" +
            "Formality Bt Emotions Are Reality."
            , "You are a good person when circumstances suit your temper;\n" +
            "But you become an excellent person when you make your temper suitable to any circumstances!"
            , "Emotion Is The Most Precious Gift\n" +
            "Which God Has Given To Human..\n" +
            "But\n" +
            "It Becomes The Most Dangerous Gift..\n" +
            "If We Dont Know How To Handle It..!!!"
            , "Feelings are much likes waves.\n" +
            "We can't stop them from touching us;\n" +
            "But we can chose which ones to surf!"
            , "The people who get upset with each other over the stupidest of things are usually the ones who care the most."
            , "As a child we always wanted to grow, \n" +
            "but as we grow up,\n" +
            "we understand that lost pencils & broken toys were better than lost friends & broken heart......."
            , "The person who gets angry a lot also loves love a lot;\n" +
            "Because Red is the not the colour only of Anger, \n" +
            "it is also the colour of Love!"
            , "Usually you argue with the people you care about,\n" +
            "people avoid fights completely when they are no longer interested emotionally."
            , "The older you get, \n" +
            "the more you realize it isn't about the material things or pride or ego. \n" +
            "It's about our hearts and who they beat for!"
            , "Crying Is The Only Way Ur Eyes Speak\n" +
            "When Ur Mouth Cant Explain \n" +
            "How Things Made Ur Heart Broken...!"
            , "The Japanese say you have three faces.\n" +
            "The first face, you show to the world.\n" +
            "The second face, you show to your close friend and your family.\n" +
            "The third face, you never show anyone. \n" +
            "It is the truest reflection of who you are!"
            , "Never apologize for how you feel. \n" +
            "No one can control how they feel. \n" +
            "The sun doesn't apologize for being the sun. \n" +
            "The rain doesn't say sorry for falling. \n" +
            "Feelings just are."
            , "Sometimes the chains that prevent us from being free are more mental than physical!"
            , "One day u’ll ask me: “whats more important to u- me or ur life?” ill say “my life” and u’ll go and leave without even knowing that u are my life."
            , "When Relation is New…\n" +
            "People Find Excuses to talk to u …\n" +
            ". .\n" +
            ". .\n" +
            "As it becomes old\n" +
            "“People find Excuses to avoid you”\n" +
            "Strange but true :("
            , "Its easy to…\n" +
            "Deactivate account…\n" +
            "Unfriend someone…\n" +
            "Delete a number…\n" +
            "Ignore a call….\n" +
            "But..\n" +
            "Its impossible to erase someone\n" +
            "from your memories & life\n" +
            "whom you loved some day!"
            , "Maturity is …\n" +
            "when a person hurts you.\n" +
            "and …\n" +
            "you try to\n" +
            "understand their situation rather then hurting them\n" +
            "back… :’)"
            , "The Worst Feeling Isn’t\n" +
            "Being Lonely …\n" +
            "Its Being Forgotten By\n" +
            "Someone You Could\n" +
            "Never Forget …"
            , "A million words would not bring you back,\n" +
            "I know because I’ve tried.\n" +
            "Neither would a million tears,\n" +
            "I know because I’ve cried..!!"
            , "December 9th, 2014 Posted in : Emotional SMS, I Love you Sms\n" +
            "Am Not A Good Friend\n" +
            "I Start Fights\n" +
            "I Get Jealous\n" +
            "I Get Mad\n" +
            "I m Demanding\n" +
            "But 3 Things I am Best At\n" +
            "I Dont Play With Hearts\n" +
            "I Dont Break Trust\n" +
            "And\n" +
            "I LOVE YOU TRULY MADLY DEEPLY..!!"
            , "Some day if i die.. don’t think that I forgot you….\n" +
            "Just have a look towords sky,\n" +
            "My tears will be a rain drop on your cheeks 2 say\n" +
            "I am always still with you!"
            , "November 3rd, 2014 Posted in : Broken Dosti SMS, Emotional SMS\n" +
            "The most heart touching lines ever said by a Friend who\n" +
            "has been hurt a lot…\n" +
            "“\n" +
            "My all friends fooled me always because i loved\n" +
            "them like a fool…"
            , "October 29th, 2014 Posted in : Emotional SMS\n" +
            "Being “SINGLE” Doesn’t\n" +
            "Necessarily Mean\n" +
            "You’re Available.\n" +
            "Sometimes You Have To\n" +
            "Put Up A Sign\n" +
            "That Says,\n" +
            "“Do Not Disturb”"
            , "One day when all of us will get Old\n" +
            "And won’t be able to see & hear properly\n" +
            "And when people will get bore from our company\n" +
            "At that time u’ll just close your eyes for a moment\n" +
            "And try to recall your past that\n" +
            "How u enjoyed with your friends,\n" +
            "When u cheated your fellows & teachers,\n" +
            "Fought with friends without any reason\n" +
            "Ur face & your eyes will be full of tears face-crying.\n" +
            "And Suddenly a drop will fall On your hand\n" +
            "And that time u’ll come to know\n" +
            "What friends Really are.\n" +
            "Most of your friends will be dead\n" +
            "And most of them will be in your Condition.\n" +
            "SO\n" +
            "Enjoy this time."
            , "I M Sorry For Giving You Sleepless Nights\n" +
            "I M Sorry For Each And Every Fight\n" +
            "I M Sorry For Your Pain & Agony\n" +
            "I M Sorry For The Missing Harmony"
            , "How to keep an idiot entertained\n" +
            "*press down*\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "*press up*"
            , "From All The Toys In The World,\n" +
            "People Choose\n" +
            "*Feelings*\n" +
            "To Play With!!"
            , "Always try to be sensitive about others feelings,\n" +
            "because if a tear can be a symbol of happiness….\n" +
            "Then a smile can be a symbol of deep hurt…"
            , "I hope that you finally understand,\n" +
            "that I will love you untill the end,\n" +
            "because your not just my girl,\n" +
            "you are also my best friend!"
            , "By following my heart I came to you,\n" +
            "I only forgot to take something back with me.\n" +
            "For my thoughts are still with you"
            , "Each drop of a tear is costly then anything in world…..\n" +
            "But, No one knows its value until they have it\n" +
            "in their own eyes for someone."
            , "Once A Boy And A Girl Decided To Write Down Whatever They Wanted To Change In Each Other\n" +
            "Boy’s Eyes Filled With Tears After Reading 7 Pages The Girl Has Written\n" +
            "Girl’s Eyes Were Filled After Reading One Line The Boy Has Written\n" +
            "“I Just Want To Change Your Surname To Mine”\n" +
            "Respect The One Who Loves You\n" +
            "Because It Is Hard To Live With Your Shadows :)"
            , "Superb Love Quote By A Broken Lover:\n" +
            "You hurt me more than I deserve.\n" +
            "It is just because\n" +
            "I loved You more than you deserve."
            , "Separations Are Those Wounds That Nobody Can Heal…\n" +
            "And Memories Are Those Treasures That Nobody Can Steal.\n" +
            "But Don’t separate To Make Memories."
            , "We used pencil when we were small\n" +
            "but now we use pens/ball pen… Do u know why?\n" +
            "Bcz mistakes in childhood can be erased but not now…"
            , "Each drop of a tear is costly then anything in world…..\n" +
            "But, No one knows its value until they have it\n" +
            "in their own eyes for someone…"
            , "Every heart has a pain.\n" +
            "Only the way of expressing it is different.\n" +
            "Fools hide it in their eyes;\n" +
            "While the brilliant hide it in their smile!"
            , "We cannot be together,\n" +
            "But we’ll never be apart,\n" +
            "For no matter what life brings us,\n" +
            "You’re always in my heart."
            , "Everything in life can't make u happy,\n" +
            "Everything in life can't satisfy u,\n" +
            "but \n" +
            "there is 1 thing which makes u feel nice,\n" +
            "that is trust 4u in someone's eyes."
            , "Some Time We Fail to Understand the Feelings of very Close People in our Life?\n" +
            "\n" +
            "Because a Book held very Nearer to Eyes is very Difficult to read."
            , "The only liquid of world\n" +
            "\n" +
            "\"TEARS\"\n" +
            "made of\n" +
            "1% of\n" +
            "water\n" +
            "\n" +
            "and\n" +
            "99% of\n" +
            "feelings.................."
            , "Never play with the feelings of others \n" +
            "bcoz \n" +
            "u may win the game but the risk is that you'll surely lose the person for lifetime!!!!"
            , "Relation is like a glass:\n" +
            "a scratch on any side will reflect on d other side too\n" +
            "so always handle feelings carefully because den d scratch cant be removed."
            , "\"Possessiveness\" and \"anger\" r a part of our life.\n" +
            "\n" +
            "If u dn't show it,\n" +
            "den u r nt giving d person who loves u, a chance 2 love u more...\n" +
            "\n" +
            "So , be more possessive.."
            , "Beauty doesn't make luv but luv makes beauty; \n" +
            "\n" +
            "break everything but never break the heart; \n" +
            "\n" +
            "Heart is the music, play it but never play with it."
            , "So lovely, soo guilty\n" +
            "So Bad, soo uneasy.......\n" +
            "I am Sorry :("
            , "I hide all my problems behind my smile;\n" +
            "Behind my smile is a world of pain;\n" +
            "You think you know me, \n" +
            "but you have no idea."
            , "Love is blind \n" +
            "but \n" +
            "hate has perfect \n" +
            "20/20 vision!"
            , "The rain falls because sky can no longer handle its heaviness. \n" +
            "Just like tears, \n" +
            "it falls because heart can no longer handle pain!"
            , "Be with a man \n" +
            "who ruins your lipstick \n" +
            "and not your mascara!"
            , "5 kinds of fear:\n" +
            "Panic\n" +
            "Terror\n" +
            "15 missed calls from Mom\n" +
            "Wrong password\n" +
            "We need to talk"
            , "When people hurt you over and over again, \n" +
            "think of them as a sandpaper.\n" +
            "They may scratch and hurt you but it's you - \n" +
            "who'll turn up shining and polished, \n" +
            "while they'll end up useless!"
            , "Blind people smile \n" +
            "despite having never seen \n" +
            "someone smile before."
            , "Memories play a confusing role.\n" +
            "They make us laugh when we remember the times that we cried together;\n" +
            "But make us cry when we remember the times that we laughed together!"
            , "Explain your anger,\n" +
            "don't express it. \n" +
            "It'll immediately open the door to solutions instead of arguments!"
            , "Newton's Law of Emotion:\n" +
            "For every male action, \n" +
            "there is an equal and opposite female overreaction."
            , "Grudges are a waste of perfect happiness. \n" +
            "Laugh when you can, \n" +
            "apologize when you should, \n" +
            "and let go of what you can't change!"
            , "Love and hate are the strongest emotions \n" +
            "because it takes pains to do either..."
            , "  Feelings are important in our life as they come from Heart.\n" +
            "If we respond, they grow;\n" +
            "If we ignore, they die;\n" +
            "If we respect, they stay forever!"
            , "Choose your Facebook profile pic carefully. \n" +
            "It'll be the one they use when you go missing."
            , "If you are stressed, \n" +
            "you get pimples;\n" +
            "If you cry, \n" +
            "you get wrinkles;\n" +
            "So just smile and get dimples!"
            , "A person hates you for 1 of 3 reasons.\n" +
            "1. They want to be like you.\n" +
            "2. They hate themselves.\n" +
            "3. They see you as a threat."
            , "You can see the beautiful world when only you have a smile on your face;\n" +
            "The tears in your eyes will blur the beauty around you."};


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
                .setCategory("Emotional Messages")
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
                .setCategory("Emotional Messages")
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
                .setCategory("Emotional Messages")
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
                .setCategory("Emotional Messages")
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
                .setCategory("Emotional Messages")
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