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
* Created by Anantha Eswar on 9/27/2015.
*/
public class Diwali extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diwali);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Diwali Messages");

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
    }

    /*http://www.latestsms.in/diwali-sms-messages.htm
    http://www.diwalifestival.org/diwali-messages.html
     */
    public static String[] messages = {"May the festival of lights encircle your life with joy and happiness. Success may always be at your doorsteps. And may Goddess Lakshmi enter your home and fill it with riches and abundance!\n" +
            "Warm wishes on this auspicious festival of Diwali!"
            , "My gift to u for Diwali..\n" +
            "\n" +
            "Rs._________________________________/- A blank cheque!\n" +
            "\n" +
            "u can enter any amount u want and collect money\n" +
            "\n" +
            ":)\n" +
            "HAPPY DIWALI!"
            , "Happiness is in air Its Diwali everywhere Lets show some love and care And wish everyone out there Happy Diwali"
            , "Troubles as light as Air,\n" +
            "love as deep as Ocean,\n" +
            "Friends as Solid as Diamonds,\n" +
            "and Success as bright as Gold...\n" +
            "These are the wishes for you and your family on the eve of Diwali"
            , "With gleam of Diyas\n" +
            "And the Echo of the Chants\n" +
            "May Happiness and Contentment Fill Your life\n" +
            "Wishing you a very happy and prosperous Diwali!!"
            , "May the Divine Light of Diwali Spread into your Life Peace, Prosperity, Happiness and Good Health.\n" +
            "Happy Diwali"
            , "This SMS will EXPLODE in 5 seconds….\n" +
            ":05\n" +
            ":04\n" +
            ":03\n" +
            ":02\n" +
            ":01\n" +
            "(((((BOOM)))))\n" +
            "\"*\"*\"*\"*\"*\"*\"\n" +
            "*\"*\"HAPPY\"*\"*\n" +
            "\"*\"DIPAWALI\"*\""
            , "This Diwali I M Sending You CASH:\n" +
            "\n" +
            "C-Care\n" +
            "A-Affection\n" +
            "S-Smiles\n" +
            "H-Hugs\n" +
            "\n" +
            "* HAPPY DIWALI *"
            , "This Is To Formally announce that I have started accepting Diwali gifts by CASH, CHEQUES & CREDIT CARD etc.\n" +
            "Avoid last day rush. Send now!"
            , "|-----------|\n" +
            "| '--.__.--' | Here is\n" +
            "|-----------| my\n" +
            "GREETING 4 you.\n" +
            "Kindly open it....\n" +
            "\n" +
            "$========$\n" +
            "( HAPPY (\n" +
            "( DIWALI ("
            , "On this Diwali festival, may you be blessed with\n" +
            "Hrithik's six pack body;\n" +
            "Salman's perennial youth;\n" +
            "Saif's eye for freshness;\n" +
            "Shah Rukh's sense of humour;\n" +
            "Aamir's dedication for excellence;\n" +
            "And Amitabh's continuous rising success!"
            , "May This Diwali Lights Up\n" +
            "And May This Help You To Your Life\n" +
            "In Every Possible Way Bright Up\n" +
            "The Path You Are Walking In To The Bright Path Ahead.\n" +
            "\n" +
            "Happy Deepavali !!!"
            , "On This Special Day Of Festivals\n" +
            "As You Celebrate With Valor & Courage Of The Events,\n" +
            "Truimph Of Good Over Evil?\n" +
            "I Wish You For The Success & Live\n" +
            "With Happiness In Everything You Do!\n" +
            "\n" +
            "Happy Diwali !!!"
            , "Let This Deepawali Ring In ?\n" +
            "D- Dhanlaxmi To Double,\n" +
            "E- Ekdant To Smile\n" +
            "E- Eshwar To Lead\n" +
            "P- Prabhu To Bless,\n" +
            "A- Annapurna To Shower,\n" +
            "W- Wali To Protect,\n" +
            "A- Adishakti To Strengthen\n" +
            "L- Lord Vishnu To Guide\n" +
            "I- Ishtadev To Make You Superior\n" +
            "And Fulfull Your Dreams\n" +
            "\n" +
            "HAPPY DEEPAWALI !!!"
            , "Diwali Is The Festival Of Lights\n" +
            "Which Is Celebrated By Indians\n" +
            "And People Throughout The World.\n" +
            "It Is The Time To Greet Your Friends And Family\n" +
            "And Here Is A Set Of Wishes\n" +
            "To Express Your Love And Affection For Them.\n" +
            "\n" +
            "Happy Diwali"
            , "May All Your Joys And Hopes Glow Immeasurably,\n" +
            "Hiding All Your Worries And Troubles In Shadow.\n" +
            "May Your Heart Be Filled\n" +
            "With Delight And Expectation,\n" +
            "Crowding Out Your Fears And Doubts.\n" +
            "Have A Joyous And Sparkling Diwali!"
            , "Sending You All Our Good Intentions\n" +
            "On The Festival Of Lights!\n" +
            "As You Celebrate This Time With Family And Friends,\n" +
            "Expect Joy And Cheer,\n" +
            "Success And Wealth,\n" +
            "Health And Well-Being\n" +
            "To Come Your Way!\n" +
            "Have A Happy, Wonder-Filled Diwali!"
            , "On This Joyous Time,\n" +
            "Let's Remember Fond Memories\n" +
            "And Look Forward To Great Things To Come.\n" +
            "May Your Life Be Filled Evermore With Good Cheer,\n" +
            "Hope, Prosperity And Virtue.\n" +
            "Wishing You And Your Loved Ones\n" +
            "A Very Happy Diwali!"
            , "I Wish You Achievements\n" +
            "As Numerous As The Stars,\n" +
            "Gladness As Enduring As The Mountains,\n" +
            "And Worries As Light As A Feather.\n" +
            "May The Fulfillment Of Your Dreams\n" +
            "Be As Glorious And Vibrant\n" +
            "And As A Perfect Sunrise!\n" +
            "\n" +
            "Happy Deepavali!"
            , "As You Celebrate This Year's Festival Of Lights,\n" +
            "May You Seek And Find A Sense Of Your Inner Light.\n" +
            "May You Pursue All That Is Pure, True, \n" +
            "Noble And Eternal.\n" +
            "Happy Diwali To You And Your Family!"
            , "May This Ocassion Of Deepavali\n" +
            "Fill Your Home With Love , Happiness\n" +
            "And May The Upcoming Year\n" +
            "Provide You With All Those Things\n" +
            "Which Bring You Joy .\n" +
            "\n" +
            "Happy Deepawali !"
            , "May We Never Forget To Remember\n" +
            "The Goodness Of The People\n" +
            "Around Us As We Celebrate The Diwali.\n" +
            "Each Candle We Light Up\n" +
            "Is The Celebration\n" +
            "Not Only Of The Prosperity In Our Lives\n" +
            "But The Goodness Shared To Us\n" +
            "By The People Who Love And Care For Us.\n" +
            "Happy Deepawali!"
            , "Diwali is the festival of joy,\n" +
            "Let us welcome our prince Lord Rama\n" +
            "With rangoli, Diyas and Candles\n" +
            "\n" +
            "Happy Diwali To You and Your Family"
            , "Some are the days\n" +
            "When People Could Stick on their Resolution Easily.\n" +
            "Wishing you that,\n" +
            "the next year sticks you with,\n" +
            "all your Resolutions and Commitments,\n" +
            "with the help of Fevicol,\n" +
            "May God Gift you a Style,\n" +
            "to write your entire Dream to your Destiny,\n" +
            "Have a prosperous and Happy Diwali!"
            , "Delightful laddos,\n" +
            "In can decent diyas,\n" +
            "Whole lot of fun,\n" +
            "A big stock of masti,\n" +
            "Lots of mithai,\n" +
            "Innemurable fireworks,\n" +
            "Wishing you the best deal,\n" +
            "on fun and lots of sale-e-bration,\n" +
            "?Happy Diwali!"
            , "Light a lamp of love;\n" +
            "Bomb the chain of sorrow;\n" +
            "Shoot a rocket of prosperity;\n" +
            "And fire a flowerpot of happiness!\n" +
            "Wish you and your family a Sparkling Deepawali!"
            , "May the eight Goddesses from the Heaven\n" +
            "Dhanlaxmi\n" +
            "Dhanyalaxmi\n" +
            "Dhairyalaxmi\n" +
            "Shouryalaxmi\n" +
            "Vidyalaxmi\n" +
            "Karyalaxmi\n" +
            "Vijayalaxmi and\n" +
            "Rajlaxmi\n" +
            "pour tonnes of blessings on you!\n" +
            "Have a blessed Diwali!"
            , "May the sparkle of solitaires brighten your fingers;\n" +
            "Your Louis Vuittons and Bottegas remain filled with money;\n" +
            "The Rolexes and Cartiers bless you with good times;\n" +
            "And may the Louboutins and Jimmy Choos make you look stunning!\n" +
            "Happy Diwali!"
            , "I miss the noise of the crackers;\n" +
            "I miss the lighted rockets in the sky;\n" +
            "I miss your dancing on the Chakaris;\n" +
            "I miss admiring the colourful Anaars;\n" +
            "But what I miss the most is your childhood;\n" +
            "When you filled the house with happiness and joy.\n" +
            "Happy Diwali to my wonderful child!"
            , "May the holy trinity of Shiv, \n" +
            "Vishnu and Brahma bless your and your family and Laxmi fill your home with love, \n" +
            "peace and prosperity!\n" +
            "Wish you a very happy Diwali!"
            , "Troubles as light as air and love as deep as the ocean;\n" +
            "Friends as solid as diamonds and success as bright as gold.\n" +
            "These are the wishes for you and your family on the eve of Diwali!"
            , "Though I miss you a lot... \n" +
            "but I know our love and affection filled with beautiful memories would help in filling the festivities of Diwali with a lot of sparkle.\n" +
            "Happy Diwali!"
            , "May you always celebrate all the wonderful blessings of God that are already dancing through your life.\n" +
            "Happy Diwali!"
            , "May the festival of Deepavali results in victory of:\n" +
            "Good over evil\n" +
            "Light over darkness\n" +
            "Knowledge over ignorance\n" +
            "And hope over despair.\n" +
            "Have a blessed Diwali!"
            , "Burst the Indian crackers, \n" +
            "light up the trees;\n" +
            "They shouldn't be Chinese even if they're free.\n" +
            "Our enemy shouldn't harness our Diwali festival;\n" +
            "Think of our armed forces and support our economy.\n" +
            "Happy Diwali!"
            , "Fortunate is the one who has learned to Admire, but not to envy. Good Wishes for a joyous Diwali and a Happy New Year with plenty of Peace and Prosperity."
            , "May the festival of lights be the harbinger of joy and prosperity. As the holy occasion of Diwali is here and the atmosphere is filled with the spirit of mirth and love, here's hoping this festival of beauty brings your way, bright sparkles of contentment, that stay with you through the days ahead.\n" +
            "Best wishes on Diwali!"
            , "May This Diwali be as bright as ever.\n" +
            "May this Diwali bring joy, health and wealth to you.\n" +
            "May the festival of lights brighten up you and your near and dear ones lives.\n" +
            "May this Diwali bring in u the most brightest and choicest happiness and love you have ever Wished for.\n" +
            "May this Diwali bring you the utmost in peace and prosperity.\n" +
            "May lights triumph over darkness.\n" +
            "May peace transcend the earth.\n" +
            "May the spirit of light illuminate the world.\n" +
            "May the light that we celebrate at Diwali show us the way and lead us together on the path of peace and social harmony\n" +
            "\"WISH U A VERY HAPPY DIWALI\""
            , "Long live the tradition of Hindu culture and as the generations have passed by hindu culture is getting stronger and stronger lets keep it up.\n" +
            "Best Wishes for Diwali"
            , "Hi All,\n" +
            "Wishing each one of you a very happy and prosperous deepawali. May this year brings you lots and lots of happiness in life and fulfill all your dreams.\n" +
            "\n" +
            "As the candlelight flame,\n" +
            "Ur life may always be happiness' claim;\n" +
            "As the mountain high,\n" +
            "U move without sigh;\n" +
            "like the white linen flair,\n" +
            "Purity is always an affair;\n" +
            "As sunshine creates morning glory,\n" +
            "fragrance fills years as flory;\n" +
            "with the immaculate eternal smile,\n" +
            "attached to u mile after mile;\n" +
            "All darkness is far away,\n" +
            "As light is on its way;\n" +
            "Wish all of u a very happy diwali."
            , "Memories of moments celebrated together.......\n" +
            "Moments that have been attached in my heart, forever.......\n" +
            "Make me Miss You even more this Diwali.\n" +
            "Hope this Diwali brings in Good Fortune & Abounding Happiness for you!\n" +
            "HAPPY DIWALI"
            , "This Diwali, may you be blessed with good fortune as long as Ganeshji's trunk, wealth and prosperity as big as his stomach, happiness as sweet as his ladoos and may your trouble be as small as his mouse.\n" +
            "Happy Diwali"
            , "On Diwali, I wanted to send you wishes for a year filled with prosperity, health and lots of fun! Hope you have a happy Diwali!"
            , "A warm Diwali wish for every happiness. May the warmth and splendor, that are a part of this auspicious occasion, fill your life with happiness and bright cheer, and bring to you joy and prosperity, for the whole year."
            , "May the festival of lights be the harbinger of joy and prosperity. As the holy occasion of Diwali is here and the atmosphere is filled with the spirit of mirth and love, here's hoping this festival of beauty brings your way, bright sparkles of contentment, that stay with you through the days ahead. Best wishes on Diwali and New year."
            , "As your celebrate this holy occasion, the most loving thoughts and wishes are for you... May the beauty of Diwali fill your world and your heart and may the love that is always yours, bring you endless joy. Have A Wonderful Diwali And New Year!"
            , "May the warmth and splendor, that are a part of this auspicious occasion, fill your life with happiness and bright cheer, and bring to you joy and prosperity, for the whole year."
            , "Purity,Prosperity,\n" +
            "May Lord Ganesha Bless You\n" +
            "With All His Charms.\n" +
            "Today And Years To Come.\n" +
            "Wishing You A Very Happy Diwali."
            , "May All The Bad Thoughts Go Away,\n" +
            "May The Darkness Be Feared Away With Lights,\n" +
            "May The Bitter And Cold Sorrows\n" +
            "Be Blended With Sweets.\n" +
            "Have A Blast This Diwali.\n" +
            "Happy Diwali."
            , "May This Diwali Be Sweet As Chocolate,\n" +
            "Bright As The Diyas,\n" +
            "Happening Like The Fireworks,\n" +
            "And May God Ganesha Shower You\n" +
            "With Health, Wealth And Prosperity.\n" +
            "\n" +
            "Happy Diwali."
            , "The Goddess Of Light Is Adorned In Sparkles\n" +
            "And Light This Diwali.\n" +
            "She Wears A Million Stars To Illuminate Our Life.\n" +
            "The Sun And The Moon Are Her Allies\n" +
            "On The Path To Destroy All Evil And\n" +
            "Bring Peace And Happiness To Us.\n" +
            "Let Us Celebrate A Special Diwali This Day!"
            , "Blessings Galore,\n" +
            "Happiness Galore!\n" +
            "Diwali Is Here!\n" +
            "Let Us Celebrate The Festival Of Lights\n" +
            "And Wipe Off The Darkness From Our Lives!\n" +
            "Let Us Visit The Abode Of Gods And\n" +
            "Partake Of The Choicest Of The Blessings\n" +
            "On This Special Diwali Day!"
            , "The Festival Of Lights Is Here!\n" +
            "Gods Up In The Skies Smile Down To Shower\n" +
            "Their Choicest Blessings On Us On This Special Day,\n" +
            "To Spread The Light Of Joy On This Earth,\n" +
            "To Destroy Evil And Celebrate Good ?"
            , "This Diwali Day,\n" +
            "The Good Will Rise Over The Evil.\n" +
            "It Will Bring A Million Lights Of Joy\n" +
            "And Happiness To Us,\n" +
            "Reaching And Illuminating Every Life,\n" +
            "Spreading Peace And Happiness Around Us.\n" +
            "Heartiest Wishes For A Wonderful Diwali Day!!"
            , "This Diwali We Wish For You\n" +
            "Infinite Little Lamps Of Joy\n" +
            "To Be Lit In Your Life,\n" +
            "To Erase The Darkness,\n" +
            "Bring Brightness And Merriment,\n" +
            "Prosperity And Love,\n" +
            "Peace And Happiness?\n" +
            "\n" +
            "Happy Diwali in Advance"
            , "Smile Like A Million Sparkles On This Diwali\n" +
            "And Let Your Happiness Spread\n" +
            "Over The World To Bring The Light Of Joy\n" +
            "On Many A Forlorn Face.\n" +
            "May The Message Of Diwali Spread\n" +
            "Like Wildfire And Let Goodness Win Over Evil\n" +
            "Erasing All Bad And Bringing Out\n" +
            "All The Good In Our Hearts\n" +
            "To Bring Everlasting Happiness And Peace.\n" +
            "Happy Diwali"
            , "A Tiny Bit Of Light Wafting Into Your Life,\n" +
            "Erasing The Sorrows Of Yesterday And\n" +
            "Brightening The Joys Of Tomorrow,\n" +
            "Growing In Intensity To Become A Shining Torch,\n" +
            "Then Explode Into A Million Suns\n" +
            "To Lend You The Light Of Life\n" +
            "A Luminous Diwali Wish For You From Me."
            , "May Zillion Lights Of Joy Reflect On You\n" +
            "And Your Family On This Diwali Day.\n" +
            "Wishing You Fun That Sparkles,\n" +
            "Love That Shines,\n" +
            "Happiness That Overwhelms,\n" +
            "Prosperity That Overflows And Peace That Continues.\n" +
            "Wishing You A Most Wonderful Diwali!"
            , "May This Celebration Of Great Day\n" +
            "With Happy Smiles All Year Round\n" +
            "In This Blessed Diwali\n" +
            "The Peace And Joy Always Here For Us"
            , "There Is Something About This Time Of Year,\n" +
            "Hearts Are Full Of Cheer,\n" +
            "Everything Has A Glow,\n" +
            "May Your Life Always Flow.\n" +
            "Sending My True Wishes,\n" +
            "For You And Your Family.\n" +
            "Happy Diwali."
            , "As Sunshine Creates Glory,\n" +
            "May This Smile,\n" +
            "Last With You Every Mile.\n" +
            "May This Festival Drive Darkness Away,\n" +
            "As The Bright Light Is On Its Way.\n" +
            "\n" +
            "Happy Diwali."
            , "As These Lovely Candles Flame,\n" +
            "It Is The Time For Happiness To Claim,\n" +
            "As High As Mountain,\n" +
            "As Bright As Linen Flair,\n" +
            "Your Life Should Be A Pure Affair.\n" +
            "Here Are My Wishes For You And Your Loved Ones,\n" +
            "Wishing You A Prosperous Diwali."
            , "This Is The Festival Of Lights,\n" +
            "The Triumph Of Good Over Evil,\n" +
            "May Peace Transcend Your Lives,\n" +
            "And The Bright Lamps Glow Up Your Lives\n" +
            "Wishing You A Very Happy Diwali."
            , "This SMS I Am Sending It To You,\n" +
            "Is For The Killing Of Bad, Around You,\n" +
            "Giving The Strength In You,\n" +
            "And All The Worldly Happiness, Delivered To You!!\n" +
            "\n" +
            "Happy Diwali"
            , "The Start Of Life Is Love,\n" +
            "The Start Of Love Is With People,\n" +
            "Though You Are So Far From Us,\n" +
            "Our Love To You Is Crystal Clear\n" +
            "Wishing You A Very Happy Deepawali!!"
            , "Let Us Unanimously Pray To Goddess Earth,\n" +
            "Will Not Pollute The Environment,\n" +
            "Respect All The Natural Resources,\n" +
            "By Curtailing The Use Of Fire Crackers!!\n" +
            "Wishing You A Very Happy Deepawali!!"
            , "You Can Purchase Platinum From The Market,\n" +
            "You Can Purchase Gold From The Goldsmith,\n" +
            "You Can Purchase Silver From The Dealer,\n" +
            "But My Wish From Heart ?HAPPY DEEPAWALI?\n" +
            "Cannot Be Found Anywhere On The Earth!!"
            , "India Is The Land Of Festivals,\n" +
            "Beginning From January To December,\n" +
            "But The Wishes From The Heart Are Always Given,\n" +
            "On The Occasion Of Every Festival\n" +
            "Today, Let Me Pour You With Wishes\n" +
            "To You And Your Family\n" +
            "\n" +
            "A Very Happy Deepawali!!"
            , "The Eight Goddesses From The Heaven,\n" +
            "Dhanlaxmi, Dhanyalaxmi, Dhairyalaxmi, Shouryalaxmi,\n" +
            "Vidyalaxmi, Karyalaxmi, Vijayalaxmi And Rajlaxmi,\n" +
            "Pour Tons Of Blessings On You\n" +
            "\n" +
            "A Very Happy Deepawali!!"
            , "May The Light From Pious Lantern ENLIGHTEN You!\n" +
            "May The Crackers Sound Remove Sorrows From You!\n" +
            "May The Sweetness Of Sweets, Shower More On You!\n" +
            "May The Blessings Of Success Pour On You\n" +
            "THIS DEEPAWALI!!!"
            , "New Dreams, New Horizons\n" +
            "Will Be Brought In Your Life By This Deepawali,\n" +
            "Try To Achieve Them With Efforts,\n" +
            "My Wishes Are With You,\n" +
            "To Fulfill Them Easily!!\n" +
            "Happy Deepawali!!"
            , "The First Deepawali Light In Your Life, This Year!\n" +
            "May Bring Happiness And Prosperity Forever!\n" +
            "My Deepawali Greetings To You, By HEART,\n" +
            "Spread The Joy Amongst You, Everywhere!!"};


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
                .setCategory("Diwali Messages")
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
                .setCategory("Diwali Messages")
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
                .setCategory("Diwali Messages")
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
                .setCategory("Diwali Messages")
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
                .setCategory("Diwali Messages")
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