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


public class Prayer extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prayer);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Prayer Messages");

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
    }

    /*
    */

    public static String[] messages = {"May our God bless you today\n" +
            "and each day that follows\n" +
            "May you hear his voice\n" +
            "Follow His footsteps\n" +
            "Be comforted by His care\n" +
            "And live in His grace\n" +
            "Now and forever"
            , "May the road rise up to meet you.\n" +
            "May the wind be always at your back.\n" +
            "May the sun shine warm upon your face;\n" +
            "the rains fall soft upon your fields\n" +
            "and until we meet again,\n" +
            "may God hold you in the palm of His hand."
            , "Prayer Changes Things\n" +
            "Worry Changes Nothing\n" +
            "So, Instead Of Worrying About\n" +
            "What You Can Do, Just Pray and Think Of What\n" +
            "GOD Can Do For You.."
            , "Some Time Prayer Doesn’t Change The Situation…!\n" +
            "But it Changes our attitude Towards The Situation,\n" +
            "And Give Us Hope Which Changes Our Entire Life.\n" +
            "A Busy Life makes Prayers Harder,\n" +
            "But\n" +
            "Prayers Make a Hard and Busy Life Easier."
            , "Extending one hand to help somebody has more value, rather than joining two hands for prayer."
            , "The fruit of silence is PRAYER.\n" +
            "The fruit of prayer is FAITH.\n" +
            "The fruit of faith is LOVE.\n" +
            "The fruit of love is SERVICE.\n" +
            "The fruit of service is PEACE."
            , "My sweetest memory-UR msg,\n" +
            "My biggest sadness-The distance,\n" +
            "My biggest hope-i will HUG you soon\n" +
            "My strongest prayer relation continues forever."
            , "The Shortest Distance between a Problem and its Solution\n" +
            "is the Distance between ur Knees and the Floor.\n" +
            "The One who Kneels to Pray to God can Stand Up to Any thing."
            , "A hopeless man feels Difficulty in every chance\n" +
            "and\n" +
            "A Hopeful man feels a Chance in every difficulty.\n" +
            "So pray before the God to overcome your all difficulties."
            , "He bore it all in silence\n" +
            "Bcoz He held us dear\n" +
            "May He receive our regards\n" +
            "May our Prayers he hear."
            , "A prayer: to bless your way\n" +
            "A wish : to lighten your moments\n" +
            "A cheer: to perfect your day."
            , "Even you go under last layer of earth or above the 7th sky,deep in the ocean or on high peaks of glaciers, you’ll find my prayers covering and protecting you everywhere."
            , "I May Never Have The Opportunity to do great things for you.\n" +
            "But\n" +
            "I’ll always find a chance to do, Small Things For You in a GREAT way BY PRAYING."
            , "Prayer is the most powerful weapon against troubles,\n" +
            "The most effective medicine against Illness,\n" +
            "And\n" +
            "The most valuable Gift to give,\n" +
            "So I pray for you always."
            , "A Great Saying And Heart Touching Words:\n" +
            "When life knocks you down on your knees, Just remember you are in Perfect Position to Pray."
            , "A Prayer Can Go Where I Can Not Go\n" +
            "I Can Be With You Without Being There….\n" +
            "I May Be Far\n" +
            "But\n" +
            "My Prayers Are Always With You."
            , "A Prayer for You by Me:-\n" +
            "Oh God,I Don’t Know Of\n" +
            "All The Challenges This Person Has,\n" +
            "But You Know Everything!\n" +
            "I Hear His Silence\n" +
            "You Hear His Plead,\n" +
            "I See His Laughing\n" +
            "You See His Tears,\n" +
            "I See When He Gives\n" +
            "You See What Have Been Taken From Him,\n" +
            "I See His Appearance\n" +
            "You See The Scars In His Soul.\n" +
            "I pray before YOU to give him everything he needs and always with him during difficult times."
            , "I’ve Special Breakfast For You Today\n" +
            "A Glass Of Care\n" +
            "A Plate Of Love\n" +
            "A Spoon Of Peace\n" +
            "and\n" +
            "A Bowl Of Prayer."
            , "My Prayers Are Silent But True\n" +
            "Everywhere They Will Follow You\n" +
            "Luck Is Urs\n" +
            "Prayers Are Mine\n" +
            "I Pray Ur Future Always Shines."
            , "I Pray To God To\n" +
            "Enrich And Enhance Your Ability,\n" +
            "To Cope Up The High Success,\n" +
            "Excellent Health And Sufficient Wealth,\n" +
            "Top Graded Honor And Hearty\n" +
            "Love Always!"
            , "Prayer is not asking. \n" +
            "Prayer is putting oneself in the hands of God, \n" +
            "at His disposition, \n" +
            "and listening to His voice in the depth of our hearts."
            , "It’s the thing that satisfies\n" +
            "ur mind, body & soul!\n" +
            "Do it on bed, on a sofa,\n" +
            "in the car or anywhere!\n" +
            "It’s called Prayer!"
            , "Prayer Is Where\n" +
            "An Amazing Exchange Happens.\n" +
            "You Hand Over Ur Worries To God and HE Hands Over HIS Peace to You."
            , "Good things come to those who wait\n" +
            "Better things come to those who try\n" +
            "Best things come to those\n" +
            "who believed\n" +
            "Desired things come to those who pray."
            , "Prayer is the most powerful weapon against downfall,\n" +
            "the most effective medicine against sickness,\n" +
            "and the most valuable gift to someone we care."
            , "A busy life makes prayer harder \n" +
            "but a prayer makes a busy life easier."
            , "If You Planted Hope Today\n" +
            "In Any Hopeless Heart,\n" +
            "If Someone’s Burden Was Lighter\n" +
            "Because You Did Your Part,\n" +
            "If You Caused A Laugh\n" +
            "That Chased Some Tears Away,\n" +
            "If Tonight Your Name Is Taken\n" +
            "When Someone Kneels To Pray.."
            , "The Nicest Place To Be:\n" +
            "Is in The THOUGHTS of Someone.\n" +
            ".\n" +
            "And\n" +
            ".\n" +
            ".\n" +
            "The Safest Place To Be:\n" +
            "Is in The PRAYERS of Someone."
            , "As Rain Cover The Sun Truth Cover The Lie Angle Cover The Evil Flower Cover The Garden I Wish and Pray That Happiness Cover All The Worries Of Your Life."
            , "The Biggest Suspense Of Life Is… You Know For Whom You Are Praying But….. You Never Know The Person Who Is Praying For You."
            , "In the silence of night when the voices are few! I pray to God take care of you When the stars are shining and the flowers are dew! I pray to God to take care of you When the sun is sleeping and the clouds are in queue! I pray to God t0 take care of you When tears are more and laughter’s are few."
            , "An Excellent line Seen written At Temple wall.\n" +
            "GOD Has Time To Listen.\n" +
            "Do You Have Time To Pray???\n" +
            "Pray Daily and Have a Peaceful Life ."
            , "Prayer is the key that opens your day to every blessing. It also is a lock that closes the night to keep you safe while sleeping. So what you have to do is “use your key all the time."
            , "Daily Prayer: Whatever plans I have in mind, Lord I surrender them to You. I will do the best I can but in the end, let Your will be done."
            , "No mater how softly you whisper a prayer, God surely listens, understands and knows the hopes and fears you keep in your heart. For when you trust in His love, miracles happen!"
            , "Prayer seeks for wisdom, not simply answers. It looks for courage, not simply help. It seeks for the gift of persistence, not only quick solutions."
            , "Everything is\n" +
            "“Pre-Written”\n" +
            "But, with Prayers\n" +
            "it can be\n" +
            "“Re-Written”… ;->"
            , "The Journey of LIFE is traveled only once!\n" +
            "So,\n" +
            "Make SORRY for Past,\n" +
            "THANKS for Present\n" +
            "And\n" +
            "PRAYER for the Future\n" +
            "Because Prayer is the Only Element that Changes FATE.."
            , "Prayer Doesn’t Change GOD …\n" +
            "But\n" +
            "It Changes Him Who Prays …"
            , "Luck is like sand in hands.\n" +
            "It will sneak out through fingers,\n" +
            "No matter gripped firmly or held loosely.\n" +
            "Only hands in the praying posture can save it."
            , "My Prayer For You\n" +
            "”May The Worst Day Of Your Future\n" +
            "Be Better Than\n" +
            "The Best Day Of Your Past …”"
            , "When my arms can’t reach people close to my heart I always hug them with my prayers,may God grant you what ur heart desires and keep you happy always. Bundles of PRAYERS for you.."
            , "I Miss You\n" +
            "When i Smell Any Rose,\n" +
            "I Miss You\n" +
            "When i Taste Any Sweet,\n" +
            "I Miss You\n" +
            "When i Look At The Moon,\n" +
            "But Specially\n" +
            "I MISS YOU\n" +
            "When I Raise\n" +
            "My Hands for Prayer."
            , ",;*’*’*;,\n" +
            "*;**;* Flowers för you..\n" +
            "with the Bundlè Of Prayers!\n" +
            "Each petål öf eaçh flower brìngs\n" +
            "My Wishes,\n" +
            "and\n" +
            "My Prayèrs för you."
            , "Prayer is an open line to Heaven. No cards to use, no low battery problem, no error, no charging, always good signal, and all messages sent. Make prayer a habit and remember me in your prayer."
            , "When earthly help is no avail, there is one friend who will never fail. Just lift ur eyes, the answer is there. For nobody knows the power of prayer. Have a worry free day."
            , "Prayer is not an extra option nor is it a last resort when all other methods have failed. When man works, man works. But when man prays, God works!"
            , "God answers prayers – YES: He gives you what you want; NO: He gives you something better; WAIT: He gives you His best in His time…"
            , "Prayer is not a spare wheel that\n" +
            "you pull out when you are in trouble.\n" +
            "Use it as a steering wheel that\n" +
            "keep you on right path through out the life."
            , "A ship was sinking…\n" +
            "Captain..: Does any one know how to pray….?\n" +
            "A priest comes forward and says he can pray.\n" +
            "Captain..: O.K. priest, you pray;\n" +
            "Everyone else in ship will wear a life jacket\n" +
            "as we are one jacket short."
            , "Hope you wake up with a smile on your face, a heart full of love and a morning full of inspiration, with a prayer that God will bless you always."
            , "Smile! It will make you look better. Pray, it will keep you strong."
            ,"We pray We believe and god works.\n" +
            "That's what it means to enter the rest of god."
            ,"Prayer Is A State Of Mind,\n" +
            "Where An Amazing Exchange Happens,\n" +
            "We Hand Over Our Worries To God\n" +
            "And He Hand Over His Blessings To Us!"
            ,"God has Deposited Love, Joy, Prosperity, Peace, Laughter & \n" +
            "All Kinds of Blessings in Ur ATM Account Use without Limit.\n" +
            "The PIN Code is PRAYER"
            ,"Thank you father for your love and mercy \n" +
            "and for letting us see the light of the sun, \n" +
            "Once more let your holy spirit be be inside us \n" +
            "Today Tomorrow and Forever Amen"
            ,"Prayer Is When You Talk To God;\n" +
            "Meditation Is When You Listen To God."
            ,"Luck is like sand in hands \n" +
            "no matter how firmly gripped or held loosely, \n" +
            "it'll sneak through fingers.\n" +
            "Only hands in the praying posture can save it!"
            ,"Prayer takes our burdens to God. \n" +
            "Belief compels us to leave them there!"
            ,"Sometimes unanswered prayers are the best. \n" +
            "You never know what God has in store for you. \n" +
            "Keep praying, \n" +
            "you never know where God will lead you!"
            ,"Always pray to have:\n" +
            "Eyes that see the best;\n" +
            "A mind that forgets the bad;\n" +
            "A heart that forgives the worst;\n" +
            "A soul that never loses faith!"
            ,"It is wonderful when we get answers to our prayers;\n" +
            "But it is even more wonderful \n" +
            "when God converts us into an answer of somebody's prayers!"
            ,"Deepest' feelings of my heart while praying for you,\n" +
            "May 'god' Convert\n" +
            "your Discomforts To Comforts,\n" +
            "your Pains To Gains,\n" +
            "your Minimum To Maximum,\n" +
            "your Losses To Profits,\n" +
            "your Tears To Smiles,\n" +
            "your Sorrows To Pleasures,\n" +
            "your Bad-wishers To Well-wishers,\n" +
            "your Debts To Credits, &\n" +
            "your Good Dreams To Realities!\n" +
            "And make these 'Everlasting!"
            ,"Be the sky above you,\n" +
            "blue Soft be the road below you,\n" +
            "Affection be the breeze around you,\n" +
            "I pray all the happiness surrounds you."
            ,"When my arms can't reach pple close2 \n" +
            "my heart I always hug dem wit my prayers,\n" +
            "may Allah grant u wat ur heart desires&keep u happy always.\n" +
            "Bundles of PRAYERS 4u."
            ,"Prayer Is Not Asking. It Is A\n" +
            "Longing Of The Soul. It Is Daily\n" +
            "Admission Of Ones Weakness,\n" +
            "It Is Better In Prayer To Have\n" +
            "A Heart Without Words\n" +
            "Than Words Without A Heart."
            ,"A Prayer Is Cleaning Therapy,\n" +
            "Of Heart & Most Effective Purifier Of Soul,\n" +
            "It Converts Hate Into Love &\n" +
            "Changes Anger Into Kindness"
            ,"\"PRAYER\" Is The Best\n" +
            "Antivirus Of World Which\n" +
            "Protects Windows Of Our\n" +
            "Life From Fatal Viruses\n" +
            "Of Sorrow, Gloom, Sin.."
            ,"Happy moments PRAISE God,\n" +
            "Difficult moments SEEK God,\n" +
            "Quite moments WORSHIP God,\n" +
            "Painful moment TRUST God,\n" +
            "Every moment THANK God."
            ,"A prayer can go where I cannot go.\n" +
            "Through Prayers i can be with you\n" +
            "without being There.\n" +
            "I may be miles away\n" +
            "but \n" +
            "my prayers\n" +
            "Will always be with You?"
            ,"If GOD answers ur PRAYERS, HE is increasing ur FAITH.\n" +
            "\n" +
            "If HE delays, HE is increasing ur PATIENCE.\n" +
            "\n" +
            "If HE dont answers, HE knows tht YOU CAN HANDLE IT PERFECTLY."
            ,"I m not a clock that can SMS u 24 hrs a day \n" +
            "but my heart will b like a clock that will nonstop care, \n" +
            "love & pray 4 a special friend like u. \n" +
            "Take Care"
            ,"Good morning...\n" +
            "Have u done two of the most important things when you wake up today?\n" +
            "1)Pray, so that u may live...\n" +
            "2)Take a bath-so that others may live too!"
            ,"Prayers are\n" +
            "not to change god's mind for you..\n" +
            "but \n" +
            "Prayers are allowing god to change your mind for your better and peaceful life...!!"
            ,"pray to GOD that\n" +
            "any person who tries to\n" +
            "screw your happiness,\n" +
            "may his ass begin to itch &\n" +
            "may his hand grow shorter that\n" +
            "he can't reach his ass to scratch it."
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
                .setCategory("Prayer Messages")
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
                .setCategory("Prayer Messages")
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
                .setCategory("Prayer Messages")
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
                .setCategory("Prayer Messages")
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
                .setCategory("Prayer Messages")
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