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
 * Created by Anantha Eswar on 11/1/2015.
 */
public class Christmas extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.christmas);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Christmas Messages");

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

    /* Latest new SMS 1-100
    */
    public static String[] messages = {"I Met Love, Peace, Wealth, \n" +
            "Health & Happiness They Needed A Permanent\n" +
            "Place To Stay So I Gave Them Your\n" +
            "Address Hope They Arrive Soon\n" +
            "Happy Christmas To You & Family!"
            ,"As You Relish The Goodies, \n" +
            "Decorate Every Nook And Corner Of Your Home\n" +
            "And Enjoy The Get Togethers, \n" +
            "May The Joy And Festivities Continue To Radiate In Your Lives, \n" +
            "Long After Christmas Is Gone. \n" +
            "Merry Christmas!"
            ,"Tick Tock, Tick Tock And It Is Only A Few Days To Christmas.\n" +
            "This Christmas Holiday \n" +
            "May You Enjoy All The Good Things That\n" +
            "Come With The Birth Of Christ \n" +
            "As You Wait To See A Lovely New Year."
            ,"It Is The Time Of The Year When\n" +
            "Everyone Is Thankful For Everything That Is Bright And Merry May This Christmas Be\n" +
            "Delightful For You And Bring You\n" +
            "Love And Happiness Merry Christmas"
            ,"Christmas Is A Blessing For Everyone\n" +
            "Let Us Celebrate This Blessing\n" +
            "With Our Prayers Dinner, Dance,\n" +
            "Party Enjoy Share The Happiness With\n" +
            "Everyone You See Happy Christmas."
            ,"In Order To Awaken The Midnight Sky,\n" +
            "A Savior's Birth, \n" +
            "And Peace On Earth\n" +
            "A Song Was Heard Echoing At Christmas Period, \n" +
            "I Wish You A Merry Christmas \n" +
            "As Its Miraculous Effects Fill Your Soul With Its Love."
            ,"The Birth Of Christ Shows \n" +
            "That Gods Love Is Deepest Descent\n" +
            "And Eternal May You Live \n" +
            "Long Life And Christmas Season\n" +
            "Will Come In Your Life \n" +
            "A Thousand Times Happy Christmas."
            ,"May All The Gloomess And Sadness Of Your Life \n" +
            "Be Replaced With Everlasting Happiness \n" +
            "Smile As The Season Of Christmas Has Arrived\n" +
            "Here Are My Special Wishes For\n" +
            "A Special Person Merry Christmas."
            ,"May The Love Of God Flood Your Life With Joy On This Occasion,\n" +
            "Inject Your Heart With Joy, \n" +
            "Your Great Mind With Great Wisdom.\n" +
            "Wishing You A Happy Christmas."
            ,"May The Happiness The Beauty Of Christmas Cover You And Paint You With Special\n" +
            "Happiness And Enjoy The Love Of Holy \n" +
            "Raise Merry Christmas."
            ,"The night is filled with candy and rum, \n" +
            "the egg nog is cooling & the pumpkin pie is warm. The vanilla ice cream piled high ,\n" +
            "the cookies are sitting on a plate to the side here comes santa with his reindeer landing on the roof to bring the presents is what its all about on Christmas Night."
            ,"It's the Christmas eve & our hearts is full of believe it's that time of the year to wish a dear one like you a 'Merry Christmas 2014'."
            ,"May the good times & treasures of the present become the golden memories of tomorrow. \n" +
            "Wish you lots of love, joy and happiness. \n" +
            "MERRY CHRISTMAS."
            ,"May your Christmas time be bright\n" +
            "from the moment it starts,\n" +
            "With many wonderful things\n" +
            "that brings joy to your heart,\n" +
            "And may each day, \n" +
            "throughout the year,\n" +
            "Bring even more gladness and cheer.\n" +
            "Merry Christmas and a Happy New Year!"
            ,"Christmas spells out love, hope and joy.\n" +
            "Pass it on to everyone in your life. \n" +
            "Merry Christmas Have a good one ."
            ,"Christmas Means Lots Of Cakes\n" +
            "From Your Mother's End, \n" +
            "But It Also Signifies The Happiness\n" +
            "That Compliments This Occasion.\n" +
            "Wish You And Your Family\n" +
            "A Very Delightful Christmas."
            ,"Hope That These,\n" +
            "Christmas Tree Will Bring You-\n" +
            "Good Fortune..\n" +
            "Good Luck?..\n" +
            "Good Relations To You & Your Family \n" +
            "MERRY CHRISTMAS"
            ,"May Lovely, \n" +
            "Happy Times Decorate This Time Of The Season, \n" +
            "May Warm, \n" +
            "Special Memories Brighten Your New Year, \n" +
            "May The Wonder Of Christmas Be With You Forever."
            ,"Heaven And Earth Is Ready To Celebrate\n" +
            "The Birthday Of Their King Who Has Sacrificed Himself, \n" +
            "To Save Us From Our Sins \n" +
            "May His Love & Affection Fills Your Soul\n" +
            "And Spread To Others Merry Christmas."
            ,"May the spirit of Christmas bring you peace,\n" +
            "The gladness of Christmas give you hope,\n" +
            "The warmth of Christmas grant you love."
            ,"One Christmas tree, \n" +
            "one lakh candles, \n" +
            "one crore baloons, \n" +
            "one million stars, \n" +
            "one billion wishes and \n" +
            "one hearty prayer.. \n" +
            "Merry Christmas..!"
            ,"1 Xmas tree\n" +
            "1 lakh candles\n" +
            "1 crore balloons\n" +
            "1 million stars\n" +
            "1 billion wishes\n" +
            "1 hearty prayer\n" +
            "Sending U my Advance Xmas & New year wishes"
            ,"December Is a Wonderful Month\n" +
            "2Pray\n" +
            "2Love\n" +
            "2Care\n" +
            "2Smile\n" +
            "2Celebrate\n" +
            "&2 Thank GOD for Everything!\n" +
            "Advance HAPPY CHRISTMAS"
            ,"Our Christmas Gift Suggestions: \n" +
            "To Your Enemy, \n" +
            "Forgiveness. \n" +
            "To An Opponent, \n" +
            "Tolerance. \n" +
            "To A Friend, \n" +
            "Your Heart. \n" +
            "To A Customer, Service. \n" +
            "To All, Charity. \n" +
            "To Every Child,\n" +
            "A Good Example. \n" +
            "To Yourself, \n" +
            "Respect.\" Like & Share With Your Friends \n" +
            "If You Feel The Same Way"
            ,"O Christmas Tree, \n" +
            "O Christmas Tree,\n" +
            "Your branches green delight us!\n" +
            "They are green when summer days are bright,\n" +
            "They are green when winter snow is white.\n" +
            "O Christmas Tree, \n" +
            "O Christmas Tree,\n" +
            "Your branches green delight us!\n" +
            "Merry Christmas!"
            ,"See him in a manger laid;\n" +
            "Whom the choirs of angels praise\n" +
            "Mary, Joseph, lend you aid\n" +
            "While our hearts in love we raise\n" +
            "Merry Christmas to you my dear\n" +
            "My the God lend you His hand in all your bends"
            ,"May Santa Claus shower the bounties of love, laughter, \n" +
            "peace and happiness on you at all times!\n" +
            "\n" +
            "Merry Christmas!"
            ,"May your life be colorful, magnificent, shimmering and joyful - as the magic of Christmas spreads on you!\n" +
            "\n" +
            "Merry Christmas!"
            ,"Joy to the world! the Lord is come;\n" +
            "Let earth receive her King;\n" +
            "Let every heart prepare him room,\n" +
            "And heaven and nature sing,\n" +
            "And heaven and nature sing,\n" +
            "And heaven, and heaven, and nature sing.\n" +
            "Merry Christmas!"
            ,"Angels, from the realms of glory,\n" +
            "Wing your flight o'er all the earth;\n" +
            "Ye who sang creation's story,\n" +
            "Now proclaim Messiah's birth:\n" +
            "\n" +
            "Come and worship, come and worship\n" +
            "Worship Christ, the newborn King.\n" +
            "\n" +
            "Merry Christmas!"
            ,"I pray on Christmas\n" +
            "Oh, the sick will soon be strong\n" +
            "I pray on Christmas\n" +
            "The Lord will hear my song\n" +
            "I pray on Christmas\n" +
            "That God will lead the way\n" +
            "And I pray I really pray on Christmas\n" +
            "He'll get me through another day\n" +
            "\n" +
            "Merry Xmas!"
            ,"May the Christmas brings:\n" +
            "Joy in your heart;\n" +
            "Smiles at your doorstep;\n" +
            "And love and togetherness of friends and family in your home!\n" +
            "Merry Christmas!"
            ,"Christmas Bells:\n" +
            "I heard the bells on Christmas Day\n" +
            "Their old, familiar carols play,\n" +
            "and wild and sweet\n" +
            "The words repeat\n" +
            "Of peace on earth, good-will to men!\n" +
            "Merry Xmas!"
            ,"Blonde to her friend, \n" +
            "\"They say - get your Christmas shopping done early to avoid the rush but this year I did mine a whole 12 months early to avoid the rush and the shops were as busy as ever.\"\n" +
            "Merry Xmas!"
            ,"Last year, \n" +
            "I asked Santa for the sexiest person ever for Christmas... \n" +
            "I woke up in a box!\n" +
            "\n" +
            "Merry Christmas!"
            ,"He knows when you're awake.\n" +
            "He knows what you look like. \n" +
            "He knows what you've been doing all year round. \n" +
            "Sounds like Santa Claus has Facebook!\n" +
            "\n" +
            "Merry Christmas!"
            ,"What will you call a Santa Claus who doesn't fulfill your wishes?\n" +
            "Ghanta Claus\n" +
            "Merry Christmas!"
            ,"Dear Santa,\n" +
            "I don't want much for Christmas. I just want the person reading\n" +
            "this to remain in my life forever... Send this to the people you don't\n" +
            "wanna lose! Whoever stops this will be unhappy for the first 3 months.\n" +
            "Tell 20 people you love them, I hope I am one of them...\n" +
            "Note from me : If you recieved this that mean i love you no matter what\n" +
            "Thanks for being here with me this year!\n" +
            "Merry christmas"
            ,"May This Auspicious Christmas, \n" +
            "Bring In Loads Of Joy And Success In Your Life, \n" +
            "I Wish You A Very Happy Journey Of Life, \n" +
            "May You Get All You Desire, \n" +
            "Wish You Merry Christmas."
            ,"This Christmas Give Us A Message\n" +
            "That We Should Live Unite With Great Peace. \n" +
            "So, Here Is A Bundle Of Some Sweet Wishes For You, Wish You & Your Family Merry Christmas."
            ,"May You Find More Smiles On Your\n" +
            "Face This Christmas Than Ever\n" +
            "Before! Wishing You And Your\n" +
            "Family A Merry Christmas And\n" +
            "A Happy New Year! Make It Grand!"
            ,"May This Year Be More Promising\n" +
            "Than The Year Before! Spread The\n" +
            "Happiness All Around You! It's Christmas!\n" +
            "Merry Christmas And A Happy New Year To You And Your Family!"
            ,"Smile, Sing And Be Glad! \n" +
            "It's Christmas! \n" +
            "It's Christmas! \n" +
            "Merry Christmas To You And Your Family!\n" +
            "May The Blessings Of The Lord Remain With You Today And Forever!"
            ,"Jingle Bells, \n" +
            "Jingle Bells, \n" +
            "Jingle All The Way, \n" +
            "May You Be Blessed This Christmas With Peace And Love All Day! \n" +
            "Merry Christmas And A Happy New Year!"
            ,"I Wish Santa Brings You The Gift\n" +
            "Of Never Ending Happiness This Christmas! \n" +
            "May You And Your Family Be Blessed Abundantly.\n" +
            "Merry Christmas And A Prosperous New Year!"
            ,"This Christmas, \n" +
            "Make It A Point To Bring A Smile To Every Face You See, \n" +
            "Wishing You And Your Family \n" +
            "A Merry Christmas And A Happy New Year! Make It A Special One!"
            ,"May Baby Jesus Bring You And Your Family Lots Of Love. \n" +
            "May The Host Of Angels Fill Your Life With Joy And Bliss. \n" +
            "Merry Christmas To You And All Your Loved Ones."
            ,"Every Year On This Beautiful Occasion, \n" +
            "We Enjoy With Love, Faith And Togetherness. \n" +
            "I Thank God For Blessing Me With Such A Loving Family.\n" +
            "I Wish You All A Merry Christmas."
            ,"Somehow, Not Only 4 Christmas But Throughout The Days, months And  Years \n" +
            "The Joy That You Gave To Some People Is The Joy \n" +
            "That Comes Back To You Merry Christmas."
            ,"It Is Christmas Time And \n" +
            "I Have A Plan To Steal \n" +
            "Santa's Sleigh To Take You With Me And \n" +
            "Fly Over Our Wonderful City \n" +
            "Then In Front Of The Most Beautiful View I Declare My Love To You Happy Merry Christmas!"
            ,"May God bless you with all the success\n" +
            "With all the love and all the happiness\n" +
            "With a life without worries and stress\n" +
            "No sadness, fear or loneliness\n" +
            "May you be blessed as blessed is this day\n" +
            "When God gave us hope and showed us the way.\n" +
            "Merry Christmas!"
            ,"Today is the day that makes us so glad.\n" +
            "Today bring us closer to each other.\n" +
            "I love you and wish you to be happy a lot.\n" +
            "And thank you for us being together.\n" +
            "May this Christmas give you delight.\n" +
            "May God be always by your side."
            ,"This is the day of our savior's birth.\n" +
            "This is the day love decided to stay.\n" +
            "God sent hope and piece on earth.\n" +
            "This is the day I am texting you to say,\n" +
            "That I love you no matter the distance\n" +
            "And I wish you a Merry Christmas!"
            ,"The best gift for me of all,\n" +
            "Is us being together.\n" +
            "This keeps warm my soul,\n" +
            "Through the snowy weather.\n" +
            "God bless the love between us\n" +
            "Be happy and Merry Christmas!"
            ,"Beautiful christmas quotes-\n" +
            "From home to home and heart to heart,\n" +
            "From one place to another,\n" +
            "The warmth and joy of Christmas,\n" +
            "Brings us closer to each other.\n" +
            "Merry X-Mas"
            ,"Open your windows\n" +
            "Open your doors\n" +
            "Welcome Santa doing his chores\n" +
            "Rushing here and bustling there\n" +
            "He is bringing presents for all of us\n" +
            "Merry Christmas"
            ,"This Christmas I am going to make sure\n" +
            "To gather all the friends to do the chores\n" +
            "Decorating the tree and packing the presents\n" +
            "We all are going to celebrate Christmas together'"
            ,"I wish this year we could get together\n" +
            "Like we used to do in the olden days\n" +
            "Get together around the fire\n" +
            "And listen to granny's tale\n" +
            "Wake up in the, morning in search of Santa's presents\n" +
            "Despite sleeping late\n" +
            "Decorating our own Christmas tree\n" +
            "Which the father brought on his way\n" +
            "Missing you my family merry Christmas"
            ,"Let your heart be light this season\n" +
            "Enjoy the merriment's of Christmas\n" +
            "I wish from now on\n" +
            "Our troubles be left far behind\n" +
            "Our dreams be fulfilled\n" +
            "And we live happy for ever\n" +
            "Have a merry Christmas"
            ,"See the sun in the grounds is glowing with its wintery warmth,\n" +
            "The snow and cold has settled in,\n" +
            "Let's gather together to great the new day,\n" +
            "The new eve is here to stay\n" +
            "\n" +
            "Merry Christmas"
            ,"Jesus was sent as the ambassador of peace, \n" +
            "love and fraternity; \n" +
            "let's promise to spread his message today, \n" +
            "the real essence of Christmas. \n" +
            "\n" +
            "Merry Christmas"
            ,"Today let's promise we won't \n" +
            "let sin and sorrow grow, \n" +
            "we won't infest the earth\n" +
            "with the thorns of our deeds,\n" +
            "let's fill the world with grace and truth and let's be happy as we could be. \n" +
            "\n" +
            "Merry Christmas'"
            ,"The earth received her king this day\n" +
            "Thy Lord arrived here today\n" +
            "So hail to all lest celebrate\n" +
            "The divine birth of thee\n" +
            "\n" +
            "Merry Christmas"
            ,"One silent, holy night\n" +
            "Which was so serene, calm and bright\n" +
            "The Lord bestowed the Virgin Mary\n" +
            "An angel so tender and mild\n" +
            "Today we celebrate the birth of thee\n" +
            "Who guided us to the heavenly peace\n" +
            "\n" +
            "Merry Christmas"
            ,"Singing the heavenly songs\n" +
            "Eating chocolate cakes\n" +
            "I wish you oh my friend\n" +
            "Health, wealth and no pain\n" +
            "Jingle bell jingle bell jingle all the way\n" +
            "Oh what fun it is to ride santa's open sleigh\n" +
            "\n" +
            "Hahaha merry christmas"
            ,"See the angels are replying you carols in joyous strains\n" +
            "Hail and mercy on you oh! All who are in pain and disdain\n" +
            "See the mountains have bow down\n" +
            "To welcome thy Jesus in this world\n" +
            "\n" +
            "Merry Christmas"
            ,"See the angels are dawning thee\n" +
            "Sweetly singing over the plains\n" +
            "Merry Christmas my dear\n" +
            "It's Christmas over again"
            ,"Hail all the ladies\n" +
            "And hail all the gents\n" +
            "See its Christmas\n" +
            "Turning about the end\n" +
            "So come out\n" +
            "Forget your fears\n" +
            "Let's sing all of us together\n" +
            "As the Christmas season is here"
            ,"Go on take out your guitars and harps and pianos\n" +
            "See the Christmas is nearing and we are singing the carols\n" +
            "Blow your trumpets and strike the harp\n" +
            "We are going to play guitar\n" +
            "And all night long we will sing the Christmas carols"
            ,"How fast the old year has past\n" +
            "Now we hail the new one\n" +
            "See the Yule blazing before us\n" +
            "Its Christmas my dear\n" +
            "\n" +
            "Merry Christmas"
            ,"Oh dear! Nothing to fear\n" +
            "Go and don your gay apparel\n" +
            "Its Christmas here\n" +
            "See the winter has set in and the cold wind puffing\n" +
            "Get up now\n" +
            "Be on the go\n" +
            "As Santa will be here\n" +
            "\n" +
            "Merry Christmas"
            ,"Decorations of red and blue\n" +
            "On a green Christmas tree\n" +
            "Oh! won't be the same\n" +
            "If you are not here with me\n" +
            "Come back home\n" +
            "And let's promise this Christmas\n" +
            "That we be together forever"
            ,"I don't pray for a lot this Christmas\n" +
            "There is just one thing I need\n" +
            "I don't care about the presents\n" +
            "Lying underneath the Christmas tree\n" +
            "I just want you for my own\n" +
            "More than you could ever know\n" +
            "Make my wish come true\n" +
            "All I want for Christmas is...\n" +
            "You"
            ,"Its unfair but true\n" +
            "Time never stands still\n" +
            "Many things change\n" +
            "But we know something never will\n" +
            "The bond we shared\n" +
            "The carols we sang the Christmas day\n" +
            "Miss you every year when we cut the cake\n" +
            "Merry Christmas my friend"
            ,"See the twinkling lights\n" +
            "A chill is in the air\n" +
            "And carols are everywhere\n" +
            "Rejoicing that the Christmas is here..."
            ,"The Christmas Brings Memories.\n" +
            "And Kindest Thoughts Untold.\n" +
            "Of Friends We May Not Often See.\n" +
            "But Hope To Always Hold.\n" +
            "So May The Greeting Be A Link.\n" +
            "In Friendship's Precious Chain.\n" +
            "And May There Be A Christmas.\n" +
            "When We Shall Meet Again!"
            ,"X'mas Is Love..\n" +
            "X'mas Is Dedication..\n" +
            "X'mas Is Happiness..\n" +
            "Happy X'mas To You\n" +
            "And Your Family\n" +
            "With A Bunchn Of\n" +
            "Love And Prayers..!"
            ,"I Wish You The Gift Of Faith,\n" +
            "The Blessing Of Hope And\n" +
            "The Peace Of His Love\n" +
            "At Christmas And Always"
            ,"I Believe That Santa Exists.\n" +
            "I Really Do. You Know Why?\n" +
            "Because Only He Could Have\n" +
            "Known What I Have Wished For\n" +
            "All My Life Its You. Trust Me,\n" +
            "You Are The Best Gift Of My\n" +
            "Life. You'll Always Be Good\n" +
            "Night Beautiful Merry Christmas."
            ,"Luk Around You, D Season Of\n" +
            "Christmas Is The Most Romantic\n" +
            "Season Of All. I Want To Cuddle\n" +
            "With U In One Blanket, Sit In\n" +
            "Front Of The Fire Furnace, Watch\n" +
            "The Christmas Tree And Listen\n" +
            "To Christmas Carols All Day Long.\n" +
            "Merry Xmas To You My Love."
            ,"I Love Christmas Because It\n" +
            "Is A Day When I Can Express\n" +
            "My Feelings Easily, Like\n" +
            "Saying I Love You And You Are\n" +
            "The Woman In My Life. I Love\n" +
            "The Most Lets Jesus Bless\n" +
            "Our Love. Merry Christmas..!!"
            ,"I Wish You A Life Filled With\n" +
            "Love And Care, As U Filled Mine\n" +
            "With Urs. I Thank You 4 Ur\n" +
            "Support, Strength And Faith.\n" +
            "Dis Christmas, I Promise U Love,\n" +
            "Passion And Togetherness For The\n" +
            "Rest Of My Life. Happy Christmas"
            ,"Christmas Is The Day 2 Tell\n" +
            "Ur Loved Ones What They Mean\n" +
            "To U, How Could I Miss This\n" +
            "Opportunity And Occasion To\n" +
            "Pass All My Love To The Most\n" +
            "Loved Of The Lot! I Love You.\n" +
            "Have A Blessed Christmas."
            ,"Even If We Are Not Together\n" +
            "This Christmas, I Want You\n" +
            "To Know That You Are Always\n" +
            "Here In My Heart. Let Us\n" +
            "Enjoy Celebrating The Birth\n" +
            "Of Jesus With Our Families.\n" +
            "Merry Christmas Honey..!"
            ,"As I Look At The Stars, I\n" +
            "Remember How The Three Kings\n" +
            "Were Guided Towards The Manger\n" +
            "Where Christ Was Born. I Wish\n" +
            "That They Will Also Guide Our\n" +
            "Relationship Towards The Path\n" +
            "To Goodness, Merry Christmas!"
            ,"This Is But A Message. These\n" +
            "Are But Words. But These\n" +
            "Spring From Core Of My Soul\n" +
            "To Wish You All The Best This\n" +
            "Season Holds. Merry Christmas\n" +
            "To You And Your Loved Ones!"
            ,"We May Not Be Together This\n" +
            "Christmas But Just Remember\n" +
            "That In My Heart You Will\n" +
            "Always Be Around Together,\n" +
            "By Heart And Soul, We Will\n" +
            "Celebrate Christmas Merry\n" +
            "Christmas And Happy New Year!"
            ,"This Is The Most Ideal Time\n" +
            "Of The Year To Look Back And\n" +
            "Realize Everything That We Did\n" +
            "That Has Become A Big Part Of\n" +
            "Who We've Become Now. I Have\n" +
            "Nothing To Regret. Looking Back\n" +
            "Just Reminded Me Nothing But\n" +
            "All The Happy Moments We Shared\n" +
            "Together. I Wish To Have More\n" +
            "Moments With You! Merry Christmas!"
            ,"I Don't Need To Receive Gifts\n" +
            "This Christmas For I Already\n" +
            "Have The Best Gift One Can\n" +
            "Ever Receive, The Gift Of\n" +
            "Being With Someone I Love.\n" +
            "Merry Christmas To You, My Dear!"
            ,"Never Forget To Be Thankful For\n" +
            "The Blessings You Have Received,\n" +
            "Especially For The Gifts Given\n" +
            "To You, Be Contented With What\n" +
            "You Have Because Others May Not\n" +
            "Have It As Good As You, Spread\n" +
            "Humility, Joy And Love This\n" +
            "Christmas Day. Merry Christmas!"
            ,"This The Season Of Happiness\n" +
            "And Delight, This The Season\n" +
            "To Sing And Dance With All Your\n" +
            "Might This The Season To Share\n" +
            "Not Just Your Belongings, But\n" +
            "Also Love, This The Season To\n" +
            "Think God Almighty For Sending Us\n" +
            "Baby Jesus From Above. Have A\n" +
            "Blesses Christmas And Happy New Year"
            ,"Happy Christmas, That Can\n" +
            "Win Us Back To The Delusions\n" +
            "Of Our Childhood Days, Recall\n" +
            "To The Old Man That The\n" +
            "Pleasures Of His Youth And\n" +
            "Transport The Traveler Back To\n" +
            "His Own Fireside And Quiet Home!"
            ,"The Babe Of Bethlehem Was\n" +
            "Born Today. May His Peace,\n" +
            "Love And Serenity Descend\n" +
            "Upon You And Remain With\n" +
            "You Forever And Ever!\n" +
            "Here's Wishing You A\n" +
            "Blessed & A Holy Christmas!"
            ,"Christmas Is With Us, The Second\n" +
            "Christmas Of Our Pontificate,\n" +
            "Gazing At The Scene From Afar,\n" +
            "United In Spirit With Mary And\n" +
            "Joseph On The Road To Bethlehem,\n" +
            "We Taste A Few Days In Advance The\n" +
            "Sweetness Which Comes To Us From\n" +
            "The Angelic Hymn Announcing The\n" +
            "Heavenly Peace Which Is Offered To All."
            ,"Simple Joys, Little Pleasures,\n" +
            "Laughter And Smiles In Big\n" +
            "Measures, Friends, Family,\n" +
            "Togetherness, Love, The Choicest\n" +
            "Blessing From Above, Peace,\n" +
            "Properity And Happiness Too, All\n" +
            "These And More Are My Wishes For You!"
            ,"If They Miss U, They'll Call\n" +
            "U.. If They Want U, They'll\n" +
            "Tell U.. And If They Care,\n" +
            "They'll Show U.. If Not, They\n" +
            "Are Not Worth Ur Time, Because U\n" +
            "Are Obviously Not Worth Their's!"
            ,"You have always been there for me,\n" +
            "May God be always there for you.\n" +
            "You have always been so good to me,\n" +
            "May all the people be good to you.\n" +
            "May your Christmas be warm and pleasant,\n" +
            "May it give you the best and biggest present.\n" +
            "Wish You a Merry Christmas!"
            ,"Your family is lucky to have you.\n" +
            "I am also lucky to have you as friend.\n" +
            "May God always protect you and love you.\n" +
            "May your happiness and delight extend.\n" +
            "May you feel them in the whole new year.\n" +
            "You, deserve it, Merry Christmas, dear!"
            ,"Today the sun is nice and friendly,\n" +
            "Makes the snow so beautiful and whiter,\n" +
            "The night is warmer and is getting ready,\n" +
            "To let the stars be shinning brighter,\n" +
            "Today is Christmas and I wish you all the best,\n" +
            "May your life be full of happiness and success!"
            ,"My all your dreams come true.\n" +
            "May this wonderful day give you belief.\n" +
            "May your loved ones be there for you.\n" +
            "May you have a good rest and feel relief.\n" +
            "Merry Christmas and a Happy New Year.\n" +
            "And may your Christmas miracle appear!"
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
                .setCategory("Christmas Messages")
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
                .setCategory("Christmas Messages")
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
                .setCategory("Christmas Messages")
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
                .setCategory("Christmas Messages")
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
                .setCategory("Christmas Messages")
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