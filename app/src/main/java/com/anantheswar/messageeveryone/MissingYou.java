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
public class MissingYou extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.missing_you);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Missing you Messages");

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
    }

    /*50000+ sms collection
    Latest new 1-25
     */
    public static String[] messages = {"I would write on all the bricks\n" +
            "?I miss you?\n" +
            "and hope that 1 falls on your head\n" +
            "So you know how it hurts\n" +
            "to miss someone special like you."
            , "Whenever I Miss You,\n" +
            "I Wont Look For You In My Dreams\n" +
            "Or Try To Hear Your Voice In Your Messages.\n" +
            "I Just Put My Right Hand Across My Chest\n" +
            "And I Feel You?"
            , "Is it true?\n" +
            "Can it be?\n" +
            "Are you the only one for me?\n" +
            "Miss you dear"
            , "Whnever i miss u.. I wont luk 4 u in my dreams..\n" +
            "or try to hear ur voice in ur msgs..\n" +
            "I jst put my right hand across my chest and ill feel u..........MISS U"
            , "Good Time\n" +
            "Bad Time\n" +
            "Day Time\n" +
            "Work Time\n" +
            "Off Time\n" +
            "Night Time\n" +
            "Happy Time\n" +
            "Sad Time\n" +
            "Sleep Time\n" +
            "In the Mean Time\n" +
            "I Miss U All The Time"
            , "When I Open My Eyes\n" +
            "To See The Sun Rise\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I Hear A Robin Sing\n" +
            "On The First Day Of Spring\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I See A Red Rose\n" +
            "On The Bush Where It Grows\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I Feel The Summer Heat\n" +
            "On The Sand Beneath My Feet\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I Sit On A Beach\n" +
            "Another World Just Out Of Reach\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I See The Colored Leaves\n" +
            "Fall To The Ground From A Light Breeze\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I Look To The Night Sky\n" +
            "And See The Sparkle Like In Your Eyes\n" +
            "I Think Of You.\n" +
            "\n" +
            "When The Snow Is Coming Down\n" +
            "To Softly Blanket The Ground\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I Go To Bed At Night\n" +
            "As I Turn Out The Light\n" +
            "I Think Of You.\n" +
            "\n" +
            "When I?m Old And Near Death\n" +
            "And I Draw My Last Breath\n" +
            "I?ll Think Of You. . ."
            , "miss call is nt a simple call...\n" +
            "it means...\n" +
            "m-my heart\n" +
            "i-is always\n" +
            "s-silently\n" +
            "s-saying i\n" +
            "miss u...."
            , "Wat makes some people dearer is not just de happiness dat u feel when u meet them\n" +
            "but de pain u feel when u miss them.. MISS U........"
            , "no words i write can ever say\n" +
            "how much i miss you everyday.\n" +
            "as time goes by the loneliness grows,\n" +
            "how i miss you... nobody knows."
            , "Lovly quote 2 all my frnds:\n" +
            "\n" +
            "Hurt me,\n" +
            "Tease me,\n" +
            "Make me cry,\n" +
            "But in the end of my life,\n" +
            "when i die plz ATLEAST keep 1 rose on my grave & say\n" +
            "\n" +
            "\"STUPID I MISS U\""
            , "If u wanna know how much i miss u,\n" +
            "Try to catch rain drops,\n" +
            "The ones u catch is how much u miss me,\n" +
            "And the other u miss is how much i miss."
            , "I was on a ship thinking of you.\n" +
            "when i looked down i dropped a tear in the ocean.\n" +
            "then i promised myself that until someone finds it.\n" +
            "i wont forget you."
            , "Wat makes sum?people dearest is not the happiness wen u meet them,\n" +
            "but its the pain wen u MISS them"
            , "You can Miss Someone Who Died,\n" +
            "Or Someone Who Moved Away,\n" +
            "\n" +
            "But the Worst Thing Is;\n" +
            "Having to Miss Someone you See Everyday"
            , "I miss u in every beat of my heart,\n" +
            "in every moment of the day.\n" +
            "I MISS U A LOT"
            , "a b c d e f g h i j k l m n o p q r s t v w x y z\n" +
            "\n" +
            "Did I Miss something?\n" +
            "No Because ?U? r in My ?HEART?"
            , "Generally,\n" +
            "we believe our MEMORY is weak,\n" +
            "BUT\n" +
            "When we want to forget SOMEONE,\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "we realize how powerful our MEMORY Is..!"
            , "A line said by a frnd 2 his Frnd\n" +
            "aftr both got busy in their livz\n" +
            "&\n" +
            "did?n contct each other.\n" +
            "?Missd ur smile a lot.\n" +
            "bt,I missd my own smile more?.\n" +
            ":-)"
            , "add your warm sunshine to my life by,your charming presence once again come back soon for ,i am missing you"
            , "Miss u..Wen I smell any rose Miss u..\n" +
            "\n" +
            "Wen I taste any sweet Miss u..Wen I look at the moon\n" +
            "\n" +
            "But Specialy Miss u..Wen I raise my hands for pray..!"
            , "I know U R So-So-So -B-U-S-Y\n" +
            "But...Take... 3 Seconds to think of me\n" +
            "1... ...\n" +
            "2... ...\n" +
            "3..................\n" +
            "So Sweet. now continue ur work..(MISS U)"
            , "When u mix rice in milk u call it kheer.\n" +
            "When u mix vinegar in milk u call it paneer..\n" +
            "When u mix a sweet person like me in ur life ..\n" +
            "U call it takdeer. Miss you?"
            , "Close eyes,\n" +
            "stop breathing sometime\n" +
            "Now breathe I miss u as much as u missed air"
            , "when the sky looks blue...i miss u\n" +
            "when the dreams come true ...i miss u\n" +
            "when the flowers coverd with dew...i miss u\n" +
            "when the day new... I MISS U MY SWEET HAERT"
            , "I miss u..\n" +
            "I need u..\n" +
            "More & more..\n" +
            "each day I love u ?\n" +
            "more thn words can evr say"
            , "?Value of relation?\n" +
            "is not that how much you feel happy with some one . .\n" +
            "But it is that\n" +
            "how much some one feels ALONE without you!"
            , "I MIS U\"r 3 words\n" +
            "bt take 3 sec 2 read\n" +
            "3 mins 2 think\n" +
            "3 hrs 2 undrstand\n" +
            "3 days 2 demonstrate\n" +
            "3 weeks 2 explain\n" +
            "n d whole life 2 prove it."
            , "Excuse Me\n" +
            "\n" +
            "Is someone care about me?\n" +
            "\n" +
            "Is someone has feelings for me?\n" +
            "\n" +
            "I am the only person who misses everyone.\n" +
            "\n" +
            "Who will miss me?\n" +
            "\n" +
            "Please Miss me."
            , "Here's a line that very few understand :Tears dont come when you miss a person...But it comes when you dont want to miss a person!!!"
            , "Earth may stop rotating\n" +
            "Birds may stop flying\n" +
            "Candles may stop melting\n" +
            "Fishes may stop swimming\n" +
            "Heart may stop breathing\n" +
            "But i will never stop\n" +
            "Missing you my friend."
            , "S_nrise\n" +
            "B_terfly\n" +
            "pict_re\n" +
            "L_nch\n" +
            "b_s stnd\n" +
            "fig_re\n" +
            "m_sic\n" +
            "all r very boring witho_t yo_."
            , "Heart Is Empty Without Love,\n" +
            "Mind Is Empty Without Wisdom, \n" +
            "Eyes Are Empty Without Dreams, \n" +
            "& Life Is Empty Without You, \n" +
            "I Miss You."
            , "I Miss Your Cuddles \n" +
            "I Miss Your Kisses \n" +
            "But Most Of All I Miss You, \n" +
            "The Love I Have Will Never Change \n" +
            "As Each Day Goes\n" +
            " By I Will Love You \n" +
            "Till The Day I Die."
            , "Feeling of Love\n" +
            "+\n" +
            "Moment of Caring\n" +
            "+\n" +
            "Small Small Sharing\n" +
            "+\n" +
            "Stupid Fights\n" +
            "+\n" +
            "Shoulder To Cry\n" +
            "+\n" +
            "To Be Together In Pain\n" +
            "=\n" +
            "Most Beautiful Thing Called ?LOVE?\n" +
            "I MISS YOU"
            , "When Daylight Turns To A Darkened Hue, \n" +
            "The Lovely Stars Hinting At You, \n" +
            "Your Heart Beat Tells You Something True,\n" +
            "That Someone Is Badly Missing You."
            , "Lonesome Without U, Each N Every Moments, \n" +
            "When I Am Alone I Close  My Eyes N Think Of U N Thoughts\n" +
            "Of Ur Love Warms Me Inside N Makes Me Smile. \n" +
            "Miss You A Lot."
            , "Short But Fantastic..!!\n" +
            ".\n" +
            ".\n" +
            "\"Miss the \"ONE\",\n" +
            "\n" +
            "Who Is Ready To MISS Anything For U\""
            , "If u r angry with urself without any reason\n" +
            "that means u r missing someone very deeply !!!"
            , "Look The moon is looking at u!\n" +
            "See stars are shining 4 u!\n" +
            "Hear birds are singing 2 u!\n" +
            "Listen my heart is saying to u\n" +
            "\"I MISS U\"."
            , "Missing you \n" +
            "I shouldn't of said no but then again \n" +
            "I did I can't do anything now \n" +
            "and I don't blame you for hating me\n" +
            "but know this I'm missing you \n" +
            "and I hope you miss me as well"
            , "My Heart Could Feel U\n" +
            "My Mind Could Imagine U\n" +
            "My Eyes Could See U\n" +
            "My Breathe Could Sense U\n" +
            "My Silence Could Mean U\n" +
            "I Knew I Loved U Even Before I Met U\n" +
            "Missing U So Much..."
            , "Some Day I Die\n" +
            "Don't Think That I Forgot U..\n" +
            "Just Have A Look Towards Sky..\n" +
            "My Tears Will Be A Raindrop On Ur Cheeks To Say..\n" +
            "\"Hey I Still With U\n" +
            "I Miss U So Much..!\""
            , "One Day If U Feel Like Crying.. Call Me. \n" +
            "I Don't Promise Dat I?ll Make U Laugh,\n" +
            "But I Can Cry WiD You.\n" +
            "If One Day U Want To Run Away.. \n" +
            "Don't Be Afraid To Call Me. \n" +
            "I Don't Promise To Ask You To Stop.. \n" +
            "But I Can Run WiD U.\n" +
            "If One Day U Don't Want To Listen to AnyOne.. \n" +
            "Call Me. I Promise To Be There For U \n" +
            "But I Also Promise To Remain Quiet.\n" +
            "But One Day If U Call..\n" +
            "And There Is No Answer?\n" +
            "Come Fast To See Me.\n" +
            "Perhaps I Need U."
            , "Every tear is sign of commitment;\n" +
            "Every silence is a sign of compromise;\n" +
            "Every smile is sign of attachment;\n" +
            "And every message is sign of remembrance.\n" +
            "Missing you!"
            , "I just called to say -\n" +
            "H: How are you?\n" +
            "E: Everything's alright!\n" +
            "L: Like to see you!\n" +
            "L: Love to hear you!\n" +
            "O: Obviously, miss you!"
            , "Happiness is when u r Missing Someone Badly \n" +
            "& Suddenly you get a text from them!"
            , "Thinking of you is easy, \n" +
            "I do it everyday. \n" +
            "Missing you is the heartache that never goes away."
            , "You must be a good runner\n" +
            " because you are always running in my mind, \n" +
            "you must be a good thief because you have stolen my heart, \n" +
            "and i am always a bad shooter because I Miss You Always..."
            , "Near ones are not dear;\n" +
            "Dear ones are not near;\n" +
            "It's easy to remember the near ones;\n" +
            "But very difficult to forget the dear ones!"
            , "I Miss The Moments We Hugged To Forget Life's Sorrows, \n" +
            "I Miss The Times We Laughed And Lived Care Free, \n" +
            "I Miss The Times We Cuddled Until The Sun Came Up."
            , "It takes only a minute to get a crush on someone,\n" +
            "an hour to like someone,\n" +
            "and a day to love someone \n" +
            "but it takes a lifetime to forget someone."
            , "Hardest truth of life....\n" +
            "we always wait for our special one's to msg daily,\n" +
            "but....\n" +
            "We don't know that they are busy with their special one.\n" +
            "Strange but true"
            , "Longing to spend my Sunday with you.\n" +
            "Miss you, my love!"
            , "When Nites R Long And Friends R Few...\n" +
            "\n" +
            "I Sit Alone N Think Of U...\n" +
            "\n" +
            "With Lovely Heart And Silent Tear.\n" +
            "\n" +
            "All I Wish Is...U To Be Here...Missing U a lot."
            , "If only i was wth U, i wld Kiss U.\n" +
            "If only i was wth u, i wld enbrace you tightly.\n" +
            "But since i am far 4m you,\n" +
            "i ll let d ANGELS do it for me this today.\n" +
            "Miss u a lot...!!!!"
            , "I miss you doesn't always mean I want you back.\n" +
            "Sometimes it only means you crossed my mind \n" +
            "and I hope you're doing fine!"
            , "My World Becomes Monochrome\n" +
            "When I Hug You Goodbye In The Morning \n" +
            "Until You Return Home\n" +
            "In The Evening When It Becomes Colorful Again. \n" +
            "I Miss You So Much."
            , "Nobody Knows How Much Pain I?m In,\n" +
            "When It Is You Who I?m Missing.\n" +
            "Nobody Sees How I?m Desperately Suffocating, \n" +
            "When It Is Your Breath\n" +
            "For Which I?m Gasping. \n" +
            "I Miss You."
            , "Earth may stop moving\n" +
            "Birds may stop singing\n" +
            "Candles may stop glowing\n" +
            "Fish may stop swimming\n" +
            "But I will never stop missing you"
            , "You just don't have an idea on how much I miss you.\n" +
            "My mouth misses your tender kisses;\n" +
            "I miss the warmth of your body;\n" +
            "I miss being held by you;\n" +
            "And I miss seeing your deep dimples.\n" +
            "I miss you my sweet girl!"
            , "Generally:\n" +
            "We believe our memory is weak... \n" +
            "but when we want to forget someone,\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "we realize how powerful our memory is!\n" +
            "Missing You!"
            , "Every tear is a sign of commitment;\n" +
            "Every silence is a sign of compromise;\n" +
            "Every smile is a sign of attachment;\n" +
            "And every message is a sign of remembrance.\n" +
            "Miss you!"
            , "I miss you with:\n" +
            "Every beat of my heart;\n" +
            "Every blink of my eyes;\n" +
            "Every passage of time;\n" +
            "And every moment of the day!"
            , "When the sea looks blue, I miss you!\n" +
            "When the dreams come true, I miss you!\n" +
            "When the flowers covered with dew, I miss you!\n" +
            "When the day comes new, I miss you!\n" +
            "I miss you! I miss you! I miss you at all times!"
            , "Some say it's difficult to remember;\n" +
            "Some say it's difficult to forget,\n" +
            "So remember not to forget me;\n" +
            "And don't forget to remember me.\n" +
            "Missing You!"
            , "When hearts are connected, \n" +
            "time and distance cannot break them apart \n" +
            "no matter what Missing you!"
            , "My morning coffee was not the thing to complete my day, \n" +
            "that thing was you.\n" +
            "Come back in my life again..... \n" +
            "I miss you so. \n" +
            "My life is uncomplete without you."
            , "Love is like a violin, \n" +
            "the music may stop every now and then, \n" +
            "but remember the strings remain forever!\n" +
            "Missing you, \n" +
            "my love!"
            , "It Has Been A Very Long Time \n" +
            "Since I Have Seen You, \n" +
            "Wish We Would Meet Up, \n" +
            "Even If It?s Just For A Few Seconds. \n" +
            "I Want You To Know That, \n" +
            "I Really Miss You!"
            , "Those Times We Had Were Awesome,\n" +
            "We Became Great Friends \n" +
            "In A Short Span Of Time, \n" +
            "And Never Fought Or Got Mad, \n" +
            "Where Are Those Times \n" +
            "Now I Wish I Could Bring Them Back! \n" +
            "Missing You."
            , "I Am Not Sure What Life Could Bring \n" +
            "I Am Not Sure If Dreams  Come True \n" +
            "I M Not Sure What Love Can Do \n" +
            "But I M Very Sure About One Thing \n" +
            "I Miss You."
            , "She Wanted to leave\n" +
            "She left . . .\n" +
            "I had to loose. .\n" +
            "I lost. . .\n" +
            "The difference is,\n" +
            "She just Lost a Moment of Life . . .\n" +
            "& In that moment i lost my Whole Life. . . ! !\n" +
            "come bak yr"
            , "In the flower my rose is you.\n" +
            "In the jewel my diamond is you.\n" +
            "In the sky my moon is you.\n" +
            "I am body my heart is you.\n" +
            "That's why I always miss you."
            , "There?s Not A Day That Passes By, \n" +
            "That I Don't Think Of You. \n" +
            "Every Waking Moment Of My Life, \n" +
            "Is Filled With Thoughts Of You. \n" +
            "I Miss The Way You Make Me Laugh, \n" +
            "I Miss The Silly Things You Do. \n" +
            "But Most Of All I Miss Your Voice."
            , "I?m Lonely Without You, \n" +
            "I Don't Know What To Do Without You, \n" +
            "I Miss You Like Crazy, \n" +
            "My Life Doesn?t Feel Like Life Without You."
            , "U're My 1st Thought In The Morning\n" +
            "& Every MOMENT In Between \n" +
            "I'm Lost In Ur Eyes\n" +
            "& When Night Arrives U Are In My Dreams\n" +
            "Miss U Swt Hrt..."
            , "\"Why Do We Close Our Eyes\n" +
            "When We Pray\n" +
            "When We Cry\n" +
            "When We Dream\n" +
            "When We Kiss\n" +
            "Because The Most Beautiful Thing In Life Are Not Seen.\n" +
            "But Felt By The Heart !\n" +
            "Definitely U !\""
            , "When I close my eyes, \n" +
            "I see you!\n" +
            "When I open my eyes, \n" +
            "I miss you!"
            , "I Miss The Moments \n" +
            "We Hugged To Forget Life Sorrows, \n" +
            "I Miss The Times \n" +
            "We Laughed  And Lived Care Free, \n" +
            "I Miss The Times \n" +
            "We Cuddled Until The Sun Came Up."
            , "Keep the smile, leave the tear;\n" +
            "Think of joy, forget the fear;\n" +
            "Hold the laugh, leave the pain;\n" +
            "Be joyous dear till we meet again.\n" +
            "Missing You!"
            , "I miss you:\n" +
            "A little too much;\n" +
            "A little too often;\n" +
            "And a little more every day!"};


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
                .setCategory("Missing you Messages")
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
                .setCategory("Missing you Messages")
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
                .setCategory("Missing you Messages")
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
                .setCategory("Missing you Messages")
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
                .setCategory("Missing you Messages")
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