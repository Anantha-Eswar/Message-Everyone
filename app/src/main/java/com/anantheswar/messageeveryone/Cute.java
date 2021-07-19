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
public class Cute extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cute);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Cute Messages");

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
    }

    /*http://smsrange.com/category/cute-sms/page/5/
    Latest new 1-25
     */
    public static String[] messages = {"Very cute:\n" +
            "A boy & her gal were standing in front of a mirror\n" +
            "The gal asked, What do u c??\n" +
            "The boy smiled and said, The rest of my life??.."
            , "A true thing-\n" +
            "\"Anyone can make u happy\n" +
            "by doing something special..\n" +
            "but only someone special can make u happy without doing anything..\" :-)"
            , "CUTE is Ur NATURE,\n" +
            "SWEET is ur NAME,\n" +
            "Clse 2 ma HEART U wil lwys REMAIN,\n" +
            "As PLANT wnts WATER,\n" +
            "FLOWER wnts DEW,\n" +
            "I wnt nthng bt HAPPYNESS fo u"
            , "COUNTRIES\n" +
            "These are some of the romantic countries in the world\n" +
            "\n" +
            "HOLLAND\n" +
            "Hope Our Love Lasts And Never Dies\n" +
            "\n" +
            "ITALY\n" +
            "I Trust And Love You\n" +
            "\n" +
            "LIBYA\n" +
            "Love Is Beautiful You Also"
            , "Evergreen quote ever Told by Jerry in cartoon\n" +
            "\n" +
            "A Person Who Irritates u Always Is the one Who Loves u Vry Much But Fails to Express It?"
            , "I don't know how would I be doing after ten years. But when I picture you with me,\n" +
            "the future seems clearer and colorful.\n" +
            "So, never let go."
            , "An Idea can change ur life,\n" +
            "but \n" +
            "A Girl can change ur ideas, \n" +
            "\n" +
            "so always change ur GirlFrnds to Get New ideas.\n" +
            "\n" +
            "What an Idea ?"
            , "How can you spell ?N_CE? without ?I??\n" +
            "\n" +
            "?POL_TE? without ?I??\n" +
            "\n" +
            "How can you ?SM_LE? without ?I??\n" +
            "\n" +
            "How can you ?W_SH? without ?I??\n" +
            "\n" +
            "see, ?I?m very Important for you."
            , "If I could give you one gift,\n" +
            "\n" +
            "I'd give you my eyes,\n" +
            "\n" +
            "so you could see how\n" +
            "\n" +
            "beautiful you really are."
            , "if someone throw stone towards\n" +
            "u ,\n" +
            "throw love towards him.\n" +
            "but if some1 throw love towards\n" +
            "u ,\n" +
            "then sit 4 a while &\n" +
            "think cause love hurts u more\n" +
            "than stone."
            , "The Big similarity between\n" +
            "1st Love & 1st drop of Rain:\n" +
            "\n" +
            "U CAN'T \n" +
            "ESCAPE \n" +
            "FROM BOTH!"
            , "A man asked a fallen Rose don't u get hurt wen u r plucked?\n" +
            "\n" +
            "Rose said:- NO,\n" +
            "I forget my pain thinking that I am Reason for someones SMILE!*"
            , "You can close your eyes to the things you don't want to see,\n" +
            "\n" +
            "but you cannot close your heart to the things you don't want to feel ..!"
            , "God asked,\n" +
            "\n" +
            "What is forgiveness????\n" +
            "\n" +
            "A little girl gave lovely reply,\n" +
            "\n" +
            "It's the wonderful fruit that a tree gives when it is being hurt by a stone..?"
            , "You may not love me like I love\n" +
            "you,\n" +
            "You may not care for me like I\n" +
            "care for you\n" +
            "But if you ever need me,\n" +
            "I will always be around for you.."
            , "Dear Mom & Dad,\n" +
            "You were also once teenagers. You must realize the importance of freedom & space. So please stop nagging and let me enjoy my life.\n" +
            "With Love,\n" +
            "Your Teenage Child"
            , "To love without condition,\n" +
            "To talk without intention,\n" +
            "To give without reason,\n" +
            "And,\n" +
            "To care without expectation,\n" +
            "Is the heart of true relation."
            , "A Cute Letter Be A Little Kid\n" +
            "Who Hates Maths: Dear Maths,\n" +
            "Please Grow Up Soon And\n" +
            "Try To Solve Your Own Problem\n" +
            "Don't Depend On Others."
            , "Life Can Give Us a Number Of Beautiful Persons. \n" +
            "But Only A True Person Can Give us a Beautiful Life. \n" +
            "\n" +
            "Keep Hold Of Them Always"
            , "Unbeatable Lines _ \n" +
            "Our body is fully made oF water \n" +
            "but whenever it hurts, Blood comes out... \n" +
            "Our Heart is full oF Blood whenever it hurts, \n" +
            "Water comes from our eyes...."
            , "A short hello makes one glow. \n" +
            "A short hi makes one smile. \n" +
            "A short kiss makes a day great. \n" +
            "A short text is not enough, \n" +
            "\n" +
            "so keep sending "
            , "I AM BAD in ENGLISH\n" +
            "BUT i can tell you that I LOVE YOU....\n" +
            "I am BAD in GEOGRAPHY\n" +
            "BUT\n" +
            "i can tell you that you LIVE in my\n" +
            "HEART...\n" +
            "I am BAD in HISTORY\n" +
            "BUT\n" +
            "I can REMEMBER when i FIRST saw\n" +
            "you.\n" +
            "I am BAD in CHEMISTRY\n" +
            "BUT I can tell WHATS the REACTION\n" +
            "when you SMILE..\n" +
            "I am BAD in PHYSICS\n" +
            "BUT\n" +
            "I can tell the INTENSITY of SPARK of my\n" +
            "EYES when they SEE you..\n" +
            "I am BAD in every SUBJECT\n" +
            "BUT\n" +
            "I can TELL ALL..\n" +
            "I will PASS all SUBJECTS if the TOPIC\n" +
            "is YOU !? ???"
            , "\"Love\"for\"all\"\" \n" +
            "\"\"Phone\"for\"call\"\" \n" +
            "\"\"Day\"for\"night\"\"\n" +
            "\"\"Hero\"for\"fight\" \n" +
            "\"\"Tear\"for\"cry\"\" \n" +
            "\"\"Bird\"for\"sky\"\"\n" +
            "\"\"my\"sms\"for\"u\"\" \n" +
            "\"\"How\"R\"you?\""
            , "A cute proposal from a cute boy to a cute girl:\n" +
            "Boy: your name seems to be very small,\n" +
            "So,\n" +
            "Can i add my name with ur name!"
            , "Always be Happy,\n" +
            "always wear a smile;\n" +
            "Not because life is full of reasons to smile\n" +
            "but because ur smile itself is a\n" +
            "reason for many others to smile"
            , "Watch your thoughts, they become words!\n" +
            "watch your words, they become actions!\n" +
            "watch your actions, they become habits!\n" +
            "watch your habits, they become character!\n" +
            "watch your character! ..it becomes your destiny!!!"
            , "Finding you was not easy at all…\n" +
            "but it sure was worth the search!\n" +
            "Finally something worth it!!\n" +
            "Love You!"
            , "Do you know why God created\n" +
            "gaps between fingers? So that\n" +
            "someone who is special to you comes\n" +
            "and fills those gaps by holding your\n" +
            "hand forever."
            , "Stop worrying about your eyeliner, hair, dress etc\n" +
            "Bcz One day you’ll find a Man that won’t care about them all\n" +
            "&\n" +
            "only look at your heart:)"
            , "The way yOu lo0k into my eyes..!!\n" +
            "it scares me.!!\n" +
            "The way u say i lovE y0u..!!\n" +
            "it scares me..!!\n" +
            "The way u know just what to say..!\n" +
            "it scares me.!!\n" +
            "The ways u scare me\n" +
            "i love it.!!"
            , "A special smile a special face,\n" +
            "A special someone no one can replace.\n" +
            "I love you and always will,\n" +
            "You’ve filled a space no one could fill."
            , "If the text,\n" +
            "sent by you is quickly seen\n" +
            "and replied by them..\n" +
            "Then trust me,\n" +
            "you are very important to them.. <3"
            , "Cutest proposal..!!\n" +
            ".\n" +
            "Boy: I have a big\n" +
            "question and I\n" +
            "am hoping you can give\n" +
            "me the\n" +
            "answer…\n" +
            ".\n" +
            "Girl: What is it?\n" +
            ".\n" +
            "Boy: You see most part\n" +
            "of our\n" +
            "body has a pair right?\n" +
            "Without\n" +
            "each one our body is unbalanced!!\n" +
            "Ex: hands, eyes, ears,\n" +
            "legs, lungs,kidney etc…\n" +
            ".\n" +
            "Girl: so….whats the\n" +
            "question?\n" +
            ".\n" +
            "Boy: the question is.. Can I have\n" +
            "your heart to pair with\n" +
            "my\n" +
            "heart??\n" +
            "Because without you my\n" +
            "life is unbalanced!!!"
            , "Girl: We’re best friend,right?\n" +
            "Boy: Yes,of course\n" +
            "Girl: So be honest with me,who do you like?\n" +
            "Boy: No one.I love someone.\n" +
            "Girl: Oh,she must be very lucky\n" +
            "Boy: Definitely.I’ve loved her,\n" +
            "ever since I met her\n" +
            "Girl: Really?Well,since we’re best friends,\n" +
            "I wanna meet her.Go call her.\n" +
            "Boy: Oh okay. & Boy takes out his phone,\n" +
            "dials her number and phones her.\n" +
            "Girl: Wait, hold on I think I’m getting a call\n" +
            "*Answers the phone.\n" +
            "Boy: I love you\n" +
            "Girl: I love you too <3"
            , "A boy found a tear in his gf’s eyes,\n" +
            ".\n" +
            "so he grabbed her in his arms\n" +
            "and hugged her tightly….\n" +
            "But the girl Still continued to cry. .\n" +
            ".\n" +
            "Boy asked : Why are you still crying ??\n" +
            ".\n" +
            ". Girl : If for every tear, i get a hug\n" +
            "from you, then i would\n" +
            "cry forever <3"
            , "Cute Story:\n" +
            ".\n" +
            "A middle class boy asks\n" +
            "His\n" +
            "high class Girlfriend:” If i\n" +
            "go\n" +
            "very poor, will you\n" +
            "Accept me..???\n" +
            ".\n" +
            "Girl hugs him and says I\n" +
            "am\n" +
            "always\n" +
            "with you..\n" +
            ".\n" +
            "Boy:” If a very rich boy\n" +
            "Proposes you ??\n" +
            ".\n" +
            "Girl kissed the boy and\n" +
            "says..\n" +
            "“I am sure that would\n" +
            "be you <3"
            , "Why are boys So CarelesS & Irresponsible..?\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "BecauSe !\n" +
            "They Know that Some where-,\n" +
            "A Sweet & Innocent girl is\n" +
            "learning to be responsible For them…..!"
            , "Boy : How r u sweetheart ?\n" +
            "girl : not good\n" +
            "boy : why? what happened?\n" +
            "girl : i have cold\n" +
            "boy : what???how ?\n" +
            "girl : i had ice cream\n" +
            "boy : r u mad ???\n" +
            "i had told u not to eat ice cream in this season ,,, you are crazy??\n" +
            "look into my eyes what the hell u think you are? don’t you’ve brain??\n" +
            "you aren’t kid, cant u just take care of your self??? stupid idiot.. girl smiled,,\n" +
            "hugged him n said “Love U a Lot”\n" +
            "boy : what’s happening here? will u please tell me\n" +
            "girl : just loved it whenever u scold me that’s why I ate ice-cream so that you’ll scold me\n" +
            "boy :stupid idiot I LOVE U too…!!"
            , "A Mother May be,\n" +
            "Educated or Uneducated.\n" +
            "But …\n" +
            ".\n" +
            ".\n" +
            "She is the Best guideline in the world\n" +
            "when you fail in your Life.. !!  :)"
            , "The most Loveable Moment is when…\n" +
            ".\n" +
            ".\n" +
            "a big fight and solved with a quite simple hug…:’)"
            , "A relation which…\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "starts from just friends & then turn into a relationship will always have an awesome understanding !"
            , "Girl: Can I confess something?\n" +
            "Guy: Sure!\n" +
            "Girl: You have the prettiest smile I’ve\n" +
            "ever seen.\n" +
            "Guy: Can I confess something as well?\n" +
            "Girl: Yeah.\n" +
            "Guy: This smile only exists because Of\n" +
            "you! <3"
            , "I’m Not Angry Because We Broke Up,\n" +
            "I’m Sad Because I Can’t Let You Go..\n" +
            "…I’m Not Angry At You For Not Loving Me,\n" +
            "I’m Angry With Me For Still Loving You..\n" +
            "I’m Not Angry That I Lost You,\n" +
            "I’m Sad Because I Once Had You..\n" +
            "I’m Not Angry That I Can’t Have You,\n" +
            "I’m Sad Because I Know What I’m Missing..\n" +
            "I’m Not Angry That You’ve Moved On,\n" +
            "I’m Sad Because I Can’t..\n" +
            "I’m Not Angry That You Won’t Come Back,\n" +
            "I’m Sad Because I Keep Hoping You Will..\n" +
            "I’m Not Angry Because I Hate You And Don’t Want To,\n" +
            "I’m Sad Because I Miss You And I Love You..!"
            , "When I’m older, I’ll look back\n" +
            "at all of my crowning memories,\n" +
            "and think of the day my children\n" +
            "were born, the day I got married,\n" +
            "and the day that I met you."
            , "A lovable story …\n" +
            "A plane was flying through the clouds …\n" +
            "Suddenly it lost the balance..\n" +
            "Everyone started shouting in fear..\n" +
            "But a small boy kept playing with his toy..\n" +
            "After an hour the flight was landed safely..\n" +
            "A man asked the boy..\n" +
            "“How could you play with your toy when everyone was afraid?”\n" +
            "the boy smiled and said ..\n" +
            "“My dad is the pilot. I knew he will land me safely.”"
            , "Girl: Are you free..?? Lets hang out tonight..\n" +
            "Boy: I can’t.. I m hanging out with someone else..\n" +
            "Girl: Who..??\n" +
            "…\n" +
            "Boy: The most beautiful, special, amazing girl in the world?\n" +
            "Girl: Oh…Gud bye !!!\n" +
            "(5 minutes later the doorbell rings)\n" +
            "Girl: Why are u here?\n" +
            "Boy: I already told you, i was coming over.. :) :) ?"
            , "Never care about what other people think of you because you will be perfect to someone icon smile Dedicated to All Girls in Pakistan\n" +
            "Stop worrying about your eyeliner, hair, dress etc\n" +
            "Bcz One day you’ll find a Man that won’t care about them all\n" +
            "&\n" +
            "only look at your heart:)"
            , "Mountain rain or summer heat,\n" +
            "Your friendship is the reason why i breathe,\n" +
            "Tell me dear what is sweet?\n" +
            "Is that U or Ur heart that beats!"
            , "Hey listen……\n" +
            "Two people were asking\n" +
            "Me about you,\n" +
            "I give them ur address\n" +
            "And cell no,\n" +
            "They will b visiting u soon,\n" +
            "Their names r joy n happiness."
            , "Cute relationship is…\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "when someone is angry with you\n" +
            "and says “I will never talk to you”\n" +
            "And later comes back to you\n" +
            "to just inform you:\n" +
            "“I am still angry”"
            , "SMILE ever,\n" +
            "UDAAS never,\n" +
            "KHUSH ever,\n" +
            "GHUM SHUM never,\n" +
            "SHARE ever,\n" +
            "HIDE never,\n" +
            "CARE ever,\n" +
            "LEAVE never,\n" +
            "LOVE ever,\n" +
            "HATE never,\n" +
            "THINK ME ever,\n" +
            "FORGET ME never."
            , "Last night I wanted to send you a msg,\n" +
            "But all I could write was,\n" +
            "“noh ss!w !”.\n" +
            "It didn’t make mush sense\n" +
            "Until I read it upside down…"
            , "Friends R Like Street Lights Along The Road\n" +
            "They Don’t Make The Distance Any Shorter\n" +
            "But They Light Up The Path\n" +
            "&\n" +
            "Make The Walk Worthwhile"
            , "Always take extra care of 3 things in ur life:\n" +
            "* Trust..\n" +
            "* Promise..\n" +
            "* Relation..\n" +
            "Bcoz they dont make noise when they break..!!"
            , "Today a few drops of blood fell down\n" +
            "of my heart and when i asked why the\n" +
            "response was “There was someone\n" +
            "very cruel in yours heat that forced\n" +
            "us to come out."
            , "Me With out U???\n" +
            "It's like A\n" +
            "FACEBOOK with out FRIEND\n" +
            "YOUTUBE with out VIDEO\n" +
            "GOOGLE with out SEARCH\n" +
            "COMPUTER with out INTEL\n" +
            "DAY with out SUN\n" +
            "FISH with out WATER\n" +
            "\n" +
            "WITH OUT U I'M \"NOTHING\""
            , "Walk with me when ur hearts needs company,\n" +
            "take my hand when u feel all alone,\n" +
            "turn to me when u need some1 to lean on,\n" +
            "coz I’m a friend u can always depend on"
            , "I m not Shakespeare 2 write abt U,\n" +
            "I m not Shelley 2 Sing abt U,\n" +
            "I m not Piccaso to Paint U,\n" +
            "I m just yours who wants to say\n" +
            "“I M ALWYS WITH U”…"
            , "Don’t be too good\n" +
            "I might miss you,\n" +
            "don’t be too caring\n" +
            "I might like you,\n" +
            "don’t be too sweet\n" +
            "I might fall its hard for me\n" +
            "to love you when\n" +
            "you wont love me after all"
            , "Life is like a piano.Ahite keys are happy\n" +
            "moments & Black keys are sad moments.\n" +
            "But remember both keys r played together\n" +
            "2 give sweet music.Thats life live it…"
            , "Cute One ^_^\n" +
            "Boy:- Watz d proof dat U miss me..?\n" +
            "Girl:- C my cheeks..\n" +
            "My mamma slapped me..\n" +
            "Coz i was smilling while sleeping..\n" +
            "Thinkng of U."
            , "A true friends heart may not\n" +
            "talk with u everyday or may\n" +
            "not meet u every time\n" +
            "But always thinks about u ur happiness.."
            , "IF u erase this msg it means u LUV me,\n" +
            "if u keep it u WANT me,\n" +
            "if u simply ignore it,\n" +
            "u really ADORE me! so,\n" +
            "what r u going to do?"
            , "This msg is specially typed 2inform,\n" +
            "rather remind som people that..\n" +
            "“I AM ALIVE”\n" +
            "&\n" +
            "hav not changed my no.,\n" +
            "So u can msg or call me..!!"
            , "It is scientifically proved that\n" +
            "sugar can dissolve in water,\n" +
            "so please dont go outside\n" +
            "when it is raining,\n" +
            "cuz u r the sweetest\n" +
            "in the whole world."};


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
                .setCategory("Cute Messages")
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
                .setCategory("Cute Messages")
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
                .setCategory("Cute Messages")
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
                .setCategory("Cute Messages")
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
                .setCategory("Cute Messages")
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