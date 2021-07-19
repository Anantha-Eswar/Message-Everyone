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
 * Created by Anantha Eswar on 10/23/2015.
 */
public class Joke extends AppCompatActivity {

    private Vibrator myVib;
    String random = "";
    TextView textView;
    Tracker t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        try {
            t = ((Analytics) getApplication()).getTracker(
                    Analytics.TrackerName.APP_TRACKER);
            t.enableAdvertisingIdCollection(true);

            t.setScreenName("Joke Messages");

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
        TextView text101 = (TextView) findViewById(R.id.textView101);
        text101.setText("101. " + messages[100]);
        TextView text102 = (TextView) findViewById(R.id.textView102);
        text102.setText("102. " + messages[101]);
    }

    /* Latest new SMS 1-125 some msgs not added
    */
    public static String[] messages = {"How to know if you have achieved Inner Peace?\n" +
            "STEP 1: Sit in front of a computer which has a 128Mb Ram \n" +
            "and a very low processor speed.\n" +
            "STEP 2: Use a BSNL broadband Connection.\n" +
            "STEP 3: Open Browser to book a ticket on IRCTC for Tatkal.\n" +
            "If you can do that without getting irritated, You've achieved Inner Peace!"
            ,"Interviewer: Where did you graduate from?\n" +
            "Candidate: IIN\n" +
            "Interviewer: Where is your degree?\n" +
            "Candidate: Here's the Postpaid Bill!"
            ,"Son:\n" +
            "\"Daddy, why did you put your thumb impression on my progress report instead of your signature?\"\n" +
            "\n" +
            "Father:\n" +
            "\"I don't want your teacher to think that anyone with your marks could possibly have a father who can read or write.\""
            ,"Sardar: What is the name of your car?\n" +
            "Lady: I forgot the name, but is starts with 'T'.\n" +
            "Sardar: Oh, what a strange car, starts with Tea.\n" +
            "All cars that I know start with petrol.."
            ,"Responsibility\n" +
            "\n" +
            "Employer to applicant:\n" +
            " \"In this job we need someone who is responsible.\" \n" +
            "\n" +
            "\n" +
            "Applicant: \"I'm the one you want. \n" +
            "On my last job, \n" +
            "every time anything went wrong, \n" +
            "he said I was responsible.\""
            ,"Pathan went to a hotel.\n" +
            "After eating he went to wash his hands, \n" +
            "but started washing the basin.\n" +
            "Manager: What are you doing?\n" +
            "Pathan: You have written here \"Wash Basin\"."
            ,"Boss: So tell me young man, \n" +
            "on what all occasions have you realized \n" +
            "that you have importance in company \n" +
            "and company cannot function without you?\n" +
            "Employee: Sir, whenever I asked for a leave."
            ,"PASSWORD PROBLEMS :\n" +
            "  \n" +
            "WINDOWS : Please enter your new password.\n" +
            "USER : cabbage\n" +
            "\n" +
            "WINDOWS : Sorry, the password must be more than 8 characters.\n" +
            "USER : boiled cabbage\n" +
            "\n" +
            "WINDOWS : Sorry, the password must contain 1 numerical character.\n" +
            "USER : 1 boiled cabbage\n" +
            "\n" +
            "WINDOWS : Sorry, the password cannot have blank spaces.\n" +
            "USER : 50bloodyboiledcabbages \n" +
            "\n" +
            "WINDOWS : Sorry, the password must contain at least one uppercase character.\n" +
            "USER : 50BLOODYboiledcabbages\n" +
            "\n" +
            "WINDOWS : Sorry, the password cannot use more than one uppercase character consecutively. \n" +
            "USER : 50BloodyBoiledCabbagesYouStupidIdiotGiveMeAccessNow! \n" +
            "\n" +
            "WINDOWS : Sorry, the password cannot contain punctuation.\n" +
            "USER : IWillHuntYouDown50BloodyBoiledCabbagesYouStupidIdiotGiveMeAccessNow \n" +
            "\n" +
            "WINDOWS : Sorry, that password is already in use. :P"
            ,"Johny Johny..\n" +
            "Yes Papa!\n" +
            "Private job.\n" +
            "Yes Papa!\n" +
            "Lot of tension..\n" +
            "Yes Papa!\n" +
            "Too much work\n" +
            "Yes Papa!\n" +
            "Family life..\n" +
            "No Papa!\n" +
            "BP-Sugar..\n" +
            "High Papa!\n" +
            "Yearly Bonus..\n" +
            "Joke Papa!\n" +
            "Monthly pay..\n" +
            "Low Papa!\n" +
            "Personal life..\n" +
            "Lost Papa!\n" +
            "Weekly off!\n" +
            "ha! ha! ha!"
            ,"Santa Is Sitting Alone In Coffee Shop.\n" +
            "A Beautiful Lady Came And Ask:\n" +
            "\" If U Don't Mind Can I Sit Here?\"\n" +
            ".\n" +
            "santa- No..!!!\n" +
            ".\n" +
            "Lady- Why?\n" +
            ".\n" +
            ".\n" +
            "Santa- Bcoz I Hav Mind."
            ,"Pappu: Dude, me and my girlfriend are getting married.\n" +
            "Bunty: Wow! When?\n" +
            "Pappu: Me next month and she may be after that."
            ,"Boss: Where do you see the company after 3 quarters?\n" +
            "Santa: After 3 quarters, \n" +
            "I don't care about company growth, \n" +
            "I just do \"Nagin Dance\"!"
            ,"Two girls were talking\n" +
            "Girl 1: Do you have Whatsapp?\n" +
            "Girl 2: No\n" +
            "Girl 1: Twitter?\n" +
            "Girl 2: No\n" +
            "Girl 1: Facebook?\n" +
            "Girl 2: No\n" +
            "Girl 1: Then what do you have?\n" +
            "Girl 2: A LIFE!!\n" +
            "Girl 1: Great! I need 1 for Candy Crush!"
            ,"At Gym\n" +
            "Guy 1: I lost 5kg in two months.\n" +
            "Guy 2: I lost 10 kg in two months.\n" +
            "Santa: I lost 45 kg in a day.\n" +
            "Guy 1 & Guy 2: Oh wow, but how?\n" +
            "Santa: Lost my baggage at Airport!"
            ,"Child : Mummy why Gandhi has no hair on his head...?\n" +
            "\n" +
            "Mummy : Because he speaks only truth...\n" +
            "\n" +
            "Child : Now I understand why ladies have long hair...   Ultimate ! :P"
            ,"Teacher: How old is your father?\n" +
            "Kid: He is 6 years.\n" +
            "Teacher: What? How is this possible?\n" +
            "Kid: He became father only when I was born.\n" +
            "Logic !!!"
            ,"Banta: Why women can not drive well?\n" +
            "Santa: Because there are so many mirrors in a car to distract them!"
            ,"After knee surgery Doctor advised Santa, \"For a few days you will have to use a walker.\"\n" +
            "Santa: No problem Doctor. Will 'Johnny Walker' be okay?"
            ,"Beggar : Give me food\n" +
            "Man : I'll give u vodka\n" +
            "\n" +
            "Beggar : I don't drink.\n" +
            "Man : I will give u cigarette.\n" +
            "\n" +
            "Beggar : I don't smoke.\n" +
            "Man : I will take u to d races.\n" +
            "\n" +
            "Beggar : I don't gamble.\n" +
            "Man : I will get u a girlfriend.\n" +
            "\n" +
            "Beggar : No, i only love my wife.\n" +
            "Man : I will give u food, but first u have to come to my house.\n" +
            "\n" +
            "Beggar : why?\n" +
            "Man : My wife should see and learn what happens to a person who don't drink, smoke, gamble and only love their wife. :P"
            ,"In a factory: A man standing on the floor, \n" +
            "not doing any work and looking aimlessly......\n" +
            "CEO of that factory came and asked his salary...\n" +
            "Man replied \"5000 sir\"\n" +
            "CEO took out his wallet and gave 15000 and told him...\n" +
            "\"I pay people here to work and not to waste time, \n" +
            "This is your 3 months salary.\n" +
            "Now get out of here.\n" +
            "Never come back\n" +
            "That guy left.\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Then CEO asked workers \"Who was that guy?\"\n" +
            "Workers replied \"Pizza delivery Boy Sir\"..\n" +
            "\n" +
            "Moral: Don't overreact in every situation!"
            ,"Pappu: I am sick, Coach. The doctor says I can't play Football.\n" +
            "Coach: I don't need a doctor to tell me that!"
            ,"Boss: This is the third time you've been late for work this week. \n" +
            "Do you know what that means?\n" +
            "Employee: That it's only Wednesday!"
            ,"Teacher: Can you please tell the class why you're so late?\n" +
            "Pappu: Someone told me to go to hell.\n" +
            "Teacher: So?\n" +
            "Pappu: Couldn't find it at first. But now I'm here!"
            ,"Jeeto: yelled at Santa: \n" +
            "U're gonna b really sorry! \n" +
            "I'm going to LEAVE you!\n" +
            "Santa: Make up ur mind! \n" +
            "Which one is it gonna be?"
            ,"Teacher : Who Is The Leader Of Ducks..?\n" +
            "Santa : Frog..\n" +
            "Teacher : Why..?\n" +
            ".\n" +
            "Santa : Bcoz Frog Is Mainduck.....!!"
            ,"A small joke\n" +
            "one lady went to book stall for purchase book.....\n" +
            "lady: do have the book named \" girls are very inteligent\" ?\n" +
            ".\n" +
            "shop keeper:\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "the comedy sesion is left side madam......."
            ,"A lady called her family doctor: \n" +
            "Doctor, my husband just swallowed the aspirins by mistake, \n" +
            "what shall I do?\n" +
            "Doctor: Give him a headache now, what else?"
            ,"KID :- Why some of ur hair are white dad...?\n" +
            "\n" +
            "DAD : ? Every time you make me unhappy , one of my hair turns white?\n" +
            "\n" +
            "KID :- Now understand why grandpa?s hairs are all white?\n" +
            "\n" +
            "Moral :- Don?t be over smart..."
            ,"Boy 1: I gave roses to 37 girls today.\n" +
            "Boy 2: OMG! What do you do?\n" +
            "Boy 1: I am a florist!"
            ,"Santa: This report card should be underwater!\n" +
            "Pappu: Because It's so wet?\n" +
            "Santa: No, because it's below 'C' level!"
            ,"Golfer to his wife: Now, \n" +
            "I need to buy new pair of Golf shoes.\n" +
            "Wife: What happened to the old one?\n" +
            "Golfer: I got a hole in one!"
            ,"Golfer: Any idea, \n" +
            "how I could cut about ten strokes off my game?\n" +
            "Caddy: Yeah! Quit on the 17th hole!"
            ,"A snooty young woman was put off by a man begging for money.\n" +
            "\"Are you satisfied walking the streets like this and asking for money?\"\n" +
            "Beggar: No M'am! I wish I could use a car!"
            ,"Angry Golfer: You must be the world's worst caddy?\n" +
            "Caddy: Oh no, that would be too much of a coincidence!"
            ,"A husband in a book store : ?Do You have a book called, \n" +
            "?Husband--the BOSS of the House?..??\n" +
            "Sales Girl: ?Sir, Comics are on the 1st floor...."
            ,"Santa: Every time I have a cup of tea, \n" +
            "I get a sharp pain in my right eye. What should I do, Doctor?\n" +
            "Doctor: Take the spoon out of your cup!"
            ,"Santa took his dad for a routine check-up.\n" +
            "Doctor: Your father is very healthy, he did live to be eighty.\n" +
            "Santa: But he's eighty.\n" +
            "Doctor: See? What did I tell you?"
            ,"Santa: Could you fix the volume on my car horn?\n" +
            "Mechanic: Is it broken?\n" +
            "Santa: No, but the brakes are!"
            ,"Pappu: Teacher! Teacher! Bunty swallowed two 5 rupee coins.\n" +
            "Teacher: Now, why would he do that?\n" +
            "Pappu: It was his lunch money!"
            ,"Boy: Wanna hear a joke?\n" +
            "Girl: Of course.\n" +
            "Boy: Knock, knock.\n" +
            "Girl: Who's there?\n" +
            "Boy: Marry.\n" +
            "Girl: Marry, who?\n" +
            "Boy: Marry, me?"
            ,"Pappu: A car smashed into my bicycle, and I didn't even get a scratch.\n" +
            "Bunty: How's that possible?\n" +
            "Pappu: My sister, Pinky was riding it!"
            ,"Santa went to a restaurant in China.\n" +
            "Santa: Waiter, there's cockroach in my salad.\n" +
            "Waiter: Please don't shout, sir. Or else the other customers will be asking for one, too!"
            ,"Teacher: What's worse than finding a worm in your apple?\n" +
            "Pappu: Finding half a worm!"
            ,"Little Sam (on phone): My son is having high fever\n" +
            "and he won?t be able to come to school today.\n" +
            "Teacher: Who is this?\n" +
            "Little Sam: This is my father speaking!"
            ,"You wanna know what really turns me on?\n" +
            ".\n" +
            ".\n" +
            "unprotected......\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "'Wifi'...."
            ,"The briefcase and the miniskirt\n" +
            "Different nationalities, different reactions,different consequences...\n" +
            "                      \n" +
            "Tokyo, Japan\n" +
            "\n" +
            "A man was walking past a young girl, when a jagged edge of his briefcase accidentally tore her mini skirt. \n" +
            "Before the man could apologize, the girl bowed deeply, and said,?\n" +
            "I humbly apologize for this error. The quality of my skirt is not good.? \n" +
            "Then she took out a pin, put the skirt back together and left.\n" +
            " \n" +
            "New York, USA\n" +
            "\n" +
            "Before the man could react, the woman pulled out a business card and gave it to him saying, \n" +
            "This is my lawyer's card. He will contact you about this sexual harassment matter. See you in court, buddy!?\n" +
            "Shanghai, China\n" +
            "\n" +
            "Before the man could say anything, the police came and took him away to labor camp\n" +
            " \n" +
            "New Delhi, India\n" +
            "\n" +
            "Before the man could apologize, Arnab Goswami was on Times Now TV, yelling, \"Times Now is the first TV channel to bring you this outrageous event. This is a Times Now exclusive. We assure you, we shall track this sordid story to the very end. The nation is watching ! The PM must answer !\" ??"
            ,"A small girl looks at her\n" +
            "brother?s girlfriend and asks\n" +
            "innocently\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "?Everyday u come to meet my\n" +
            "brother, Don?t u\n" +
            "have your own brother."
            ,"Sardar 1: I spoke to Sania Mirza yesterday on the phone . \n" +
            "\n" +
            "Sardar 2 : thats great. What did she say?\n" +
            "\n" +
            "Sardar 1: Wrong number."
            ,"1998 - OMG!! He has a Mobile Phone! \n" +
            ".\n" +
            "2015 - OMG!! He has a LandLine at home"
            ,"Three signs of being a lady :\n" +
            "1: stressed :!!\n" +
            "\n" +
            "2: Depressed :!!\n" +
            "\n" +
            "3: But still well dressed :!!"
            ,"Girl chatting online with unknown man..\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Man : cud u give me u r mail id?\n" +
            ".\n" +
            "Girl : sure..\n" +
            ".\n" +
            ".\n" +
            "Here its..\n" +
            ".\n" +
            ".\n" +
            "Ihavebf.lovinghim@getlost.com..\n" +
            ".\n" +
            ".\n" +
            "Unknown Man : Thanks..\n" +
            ".\n" +
            ".\n" +
            "Here my email id..\n" +
            ".\n" +
            ".\n" +
            "ImUrDadcometohome.chappalshoes@TodayDiwaliforyou.com!:D:D"
            ,"Pappu rings a call centre:\n" +
            "My internet is not working properly\n" +
            "Officer:\n" +
            "Ok\n" +
            "Double click on \"My computer\"\n" +
            "Pappu:\n" +
            "I can't see ur computer\n" +
            "Officer:\n" +
            "No no\n" +
            "click on \"My computer\" on ur computer\n" +
            "Pappu:\n" +
            "How can I click on ur computer from my\n" +
            "computer?\n" +
            "Officer:\n" +
            "listen\n" +
            "There is an icon labelled \"My Computer\" on ur\n" +
            "computer\n" +
            "Ok\n" +
            "double click on it\n" +
            "Pappu:\n" +
            "what the hell, what is your computer doing on\n" +
            "my computer..?\n" +
            "Officer:\n" +
            "Double click on ur computer\n" +
            "Pappu:\n" +
            "On which Icon i've to click\n" +
            "Officer:\n" +
            "\"My Computer\"\n" +
            "Pappu:\n" +
            "Oh Teri......Pagal insaan\n" +
            "Tell me where is ur office. I'll come there and\n" +
            "click on ur \"Computer.\"?? ??"
            ,"A Lady on telephone:\n" +
            "Hello Sir, I want to meet & talk to you..\n" +
            "Man: do u know me..\n" +
            "Lady: Yes you are the father of one of my kids.\n" +
            "\n" +
            "Man stunned,\n" +
            "Oh my God!\n" +
            "Are u Sangeeta????\n" +
            "No\n" +
            "Are U Meenakshee ???\n" +
            "No\n" +
            "Are u Nisha?\n" +
            "No\n" +
            "Neha?\n" +
            "No\n" +
            "Anushka?\n" +
            "No\n" +
            "Mitali?\n" +
            "No\n" +
            "Vaishali?\n" +
            "No\n" +
            "Lady in confusion...\n" +
            "No sir i'm the class teacher of your son"
            ,"Russia 19 attempts,\n" +
            "USA 21 attempt\n" +
            "India just 1 attempt and that's a success.\n" +
            "No wonder we are the country with one of the highest population!!!"
            ,"A Spiritual Thought... \n" +
            "Read carefully\n" +
            " \n" +
            "Good day is not created by God...\n" +
            "Nor it is designed by our parents...\n" +
            "Not even prepared by us...\n" +
            "Nature too does not give us a good day...\n" +
            "\n" +
            "Is it our friends or our Family ? or is it our-self?\n" +
            " \n" +
            "No\n" +
            "\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Good Day is manufactured only by Britannia biscuit company.\n" +
            " \n" +
            "ting ting tidiiinnnngggg........! :P"
            ,"A hungry traveller stops at a monastery and is taken to the kitchens. \n" +
            "A brother is frying chips.\n" +
            "\"Are you the friar\", \n" +
            "he asks.\n" +
            "\"No. I'm the chip monk\", he replies."
            ,"Pinky: What are you running for, Pappu?\n" +
            "Pappu: I'm trying to keep two fellas from fighting.\n" +
            "Pinky: Who are the fellows?\n" +
            "Pappu: Bunty and me!"
            ,"Santa: If you are good, Pappu, \n" +
            "I will give you this bright new 500 rupee note.\n" +
            "Pappu: Haven't you got a dirty old 1000 rupee note?"
            ,"Banta inquiring about Pappu's maternal Uncle was told that he was very sick.\n" +
            "Banta replied,\"Oh, he only thinks he's sick.\"\n" +
            "He met Pappu after several days and again inquired about his Uncle. \n" +
            "Pappu replied, \"He thinks he is dead!\""
            ,"Pappu (calling father at office): Hello, who is this?\n" +
            "Santa (recognizing son's voice): The smartest man in the world.\n" +
            "Pappu: Pardon me, I got the wrong number!"
            ,"Women live a Better, \n" +
            "Longer & Peaceful Life, \n" +
            "as compared to men.\n" +
            "WHY?\n" +
            "A very INTELLIGENT man replied:\n" +
            "Women don't have a wife!"
            ,"Pappu: Say, mother, how much am I worth?\n" +
            "Jeeto: You're worth more than crores to me, dear. But why are you asking?\n" +
            "Pappu: Well, then, could you advance me 100 bucks?"
            ,"Height of coolness....!!\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Two best friends coming out of the examination hall\n" +
            "with chips and coke in hands..\n" +
            ".\n" +
            ".\n" +
            "1st frnd: which paper was it??\n" +
            "\n" +
            "2nd: i think math...\n" +
            ".\n" +
            ".\n" +
            "1st: (surprisingly): u read the question paper??\n" +
            "\n" +
            "2nd: NO..!\n" +
            "I saw a girl sitting besides me using a calculator"
            ,"During a text message conversation:\n" +
            "Pappu: I love you.\n" +
            "Girl: I love you too.\n" +
            "Pappu: Something wrong with your space bar?\n" +
            "Girl: No, there's just no space for me to love anyone else!"
            ,"Interviewer: What Is SKELETON?\n" +
            ".\n" +
            ".\n" +
            "Sardar: Sir, Skeleton Is A Person,\n" +
            "Who Started Dieting But Forgot To Stop It..!!!"
            ,"Maths Sir : What Is Line ?\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "A Genius Answered :\n" +
            "A Line Is A Dot, Going For A Walk"
            ,"1. Set the alarm of 7:00 am.\n" +
            "2. Wake up at 6:59 am.\n" +
            "3. 'Off' the alarm before it alarms.\n" +
            "4. Feel like a Bomb Defuser!!"
            ,"Engineering student sitting with his Girlfrnd in\n" +
            "Restaurant\n" +
            "Drinking BEER and says:\" I Love yOuuu\n" +
            "Girlfrnd:\" is it yOu Or the BEER talking ??\n" +
            "Student:\" its me, Talking tO my BEER,\n" +
            "..\n" +
            "yOu Shut up"
            ,"1. I woke up\n" +
            "2. I went to college\n" +
            "3. I saw her\n" +
            "4. I ran to her and I hugged her\n" +
            "5. I kissed her\n" +
            "Actualy the right order is 2.3.4.5.1"
            ,"I Love The Way It Rubs Against\n" +
            "The Soft Pink Flesh\n" +
            "Creating A Creamy Foamy Liquid\n" +
            "As It Thrust In And Out Up And\n" +
            "Down\n" +
            "Cant Wait Till Next Time\n" +
            "I Love My TOOTH BRUSH..!"
            ,"Species called 'Managers'\n" +
            "\n" +
            "Manager: Okay team, today we are going to play a game.\n" +
            "\n" +
            "When I say the name of a fruit, you run to the right side of the court.\n" +
            "And when I say the name of a color, you run to the left side of the court. got it?\n" +
            "\n" +
            "Team members: Yes, Got it.\n" +
            "\n" +
            "Manager: Okay...Ready, Set...\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "ORANGE!\n" +
            "\n" +
            "Team members: ???"
            ,"TEACHER\t: Maria, go to the map and find North America . \n" +
            "MARIA  \t: Here it is. \n" +
            "TEACHER\t: Correct.  Now class, who discovered America ? \n" +
            "CLASS  \t: Maria."
            ,"TEACHER\t: John, why are you doing your math multiplication on the floor? \n" +
            "JOHN\t: You told me to do it without using the tables."
            ,"TEACHER\t: Glenn, how do you spell 'crocodile?' \n" +
            "GLENN\t: K-R-O-K-O-D-I-A-L' \n" +
            "TEACHER\t: No, that's wrong \n" +
            "GLENN\t: Maybe it is wrong, but you asked me how I spell it."
            ,"TEACHER\t: Donald, what is the chemical formula for water? \n" +
            "DONALD\t: H I J K L M N O. "
            ,"TEACHER\t: What are you talking about? \n" +
            "DONALD\t: Yesterday you said it's H to O."
            ,"TEACHER\t: Millie, give me a sentence starting with 'I'. \n" +
            "MILLIE\t: I is... \n" +
            "TEACHER\t: No, Millie...... always say, 'I am.' \n" +
            "MILLIE\t: All right...  'I am the ninth letter of the alphabet'"
            ,"TEACHER\t: George Washington not only chopped down his father's cherry tree, but also admitted it. \n" +
            "Now, Louie, do you know why his father didn't punish him? \n" +
            "\n" +
            "LOUIS\t: Because George still had  the axe in his hand......"
            ,"TEACHER\t: Now, Simon , tell me frankly, do you say prayers before eating? \n" +
            "SIMON\t: No sir, I don't have to, my Mom is a good cook."
            ,"TEACHER\t: Clyde , your composition on 'My Dog' is exactly the same as your brother's.. \n" +
            "Did you copy his? \n" +
            "CLYDE   : No sir, It's the same dog."
            ,"TEACHER\t: Harold, what do you call a person who keeps on talking when people are no longer interested? \n" +
            "HAROLD\t: A teacher"
            ,"Teacher: We need to talk.\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "Me: Can't talk, whatsapp only"
            ,"A letter from a teacher to a parent:\n" +
            "Dear Parent,\n" +
            "Kumar doesn't smell nice in class. Please try to Bath him.\n" +
            "\n" +
            "Parent's answer:\n" +
            "Dear Teacher, Kumar is not a rose, Dont smell him,Teach him......"
            ,"Many people think\n" +
            "\"I LOVE YOU\"\n" +
            "is the world's best message.\n" +
            "But the truth is..\n" +
            "\"SALARY IS CREDITED TO YOUR\n" +
            "ACCOUNT xxxxxxxxxxxx \"\n" +
            "is the best message ever..."
            ,"Heights of :-\n" +
            "1) Fashion?\n" +
            "Lungi with a zip.\n" +
            "\n" +
            "2) Laziness?\n" +
            "Asking lift for morning walk.\n" +
            "\n" +
            "3) Craziness?\n" +
            "Get blank paper xerox.\n" +
            "\n" +
            "4) Honesty?\n" +
            "Pregnant woman taking 2 tickets.\n" +
            "\n" +
            "5) De-hydration?\n" +
            "Cow giving milk powder.\n" +
            "\n" +
            "6) Hope?\n" +
            "A 99 yr. Old woman going for 295"
            ,"A Cute Letter Be A Little Kid\n" +
            "Who Hates Maths: Dear Maths,\n" +
            "Please Grow Up Soon And\n" +
            "Try To Solve Your Own Problem\n" +
            "Don't Depend On Others."
            ,"Sardar Was Driving Car Very Fast\n" +
            "Traffic Police Caught Him..\n" +
            "Sardar: Sir, I Am Learning Driving\n" +
            "Police: Without Teacher..?\n" +
            ".\n" +
            "Sardar: Ya, Its Correspondence\n" +
            "Course...!"
            ,"A funny life cycle,\n" +
            "COCKROACH is afraid of RAT.\n" +
            "RAT of CAT.\n" +
            "CAT of DOG.\n" +
            "DOG of MAN.\n" +
            "MAN of his GIRLFRND n GIRLFRND OF COCKROACH."
            ,"Alcohol is the worst thing in the world ..\n" +
            "A friend drank a lot last night & ended up saying \"I love you\"\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            ".\n" +
            "to his Own Wife...can you imagine that."
            ,"Judge: Y U?ve stolen money 4m dis man?\n" +
            "Sardar: My lord I?ve nt stolen money. He jst gave it 2 me\n" +
            "Judge: Whn He gave U money ?\n" +
            "Sardar: Whn I showd him gun"
            ,"Daughter to dad :-\n" +
            "\n" +
            "Dad, what is called as a sea level?\n" +
            "\n" +
            "Dad: Why do you want to know it?\n" +
            "\n" +
            "Daughter: Well, my grades went below C-Level."
            ,"Doctor: are u got all medicines which i wrote.\n" +
            "\n" +
            "Patient: yah doctor I found all medicines\n" +
            "except the below last one.\n" +
            "\n" +
            "Doctor: Idiot its my signature...."
            ,"A young boy Talking To A Ghost.\n" +
            "\n" +
            "Boy: Why Did You Die?\n" +
            "\n" +
            "GHOST: I Was Hit By A Car Trying To Save Someone.\n" +
            "\n" +
            "Boy: Why?\n" +
            "\n" +
            "GHOST:Bcoz i dont want her to get hurt..\n" +
            "\n" +
            "Boy: you realy luv her a lot because you hav sacrificed your own life just for her\n" +
            "\n" +
            "may be she is sad now bcoz of your death\n" +
            "\n" +
            "Ghost: no she is very happy bcoz the one that i saved is the man whom she loves."
            ,"Kid :Dad, Can We Go To McDonald?\" \n" +
            "\n" +
            "Dad :Only If You Can Spell Mcdonalds \n" +
            "\n" +
            "Kid:Thought For A Mint, Turned Around N Said Can We Go To KFC Instead?\""
            ,"Eye Doctor: Tell Me How Many Fingers Do You See On my Both Hands? \n" +
            "\n" +
            "Patient: 13. \n" +
            "\n" +
            "Doctor: What!! How come! I Don't Understand! Whether Your Eyes Are Weak Or ..... Your Maths?"
            ,"Pathan got a job in Mobilink. \n" +
            "\n" +
            "Customer: My mobilink sim locked. Wat 2 do? \n" +
            "\n" +
            "Pathan: Dont take tension remove mobilink sim put telenor. Thank u 4 calling mobilink."
            ,"Pathan laughing behind sardar at ATM centre. \n" +
            "\n" +
            "pathan: I have seen ur password. \n" +
            "\n" +
            "sardar: What is it? \n" +
            "\n" +
            "pathan: Its 4 stars ****. \n" +
            "\n" +
            "sardar: U r wrong its 3387"
            ,"Sardar in Mysore Palace, \n" +
            "\n" +
            "Tourist guide: Sir Plz don't sit there, it is Tippu Sultan's chair. \n" +
            "\n" +
            "Sardar: hey don't worry...i will get up when he comes..."
            ,"Son of Pathan: Why did you call me yesterday?\n" +
            "Teacher: I never called you.\n" +
            "Son of Pathan: Then why did my call list say - 1 miss call!"
            ,"Father : Why you failed in maths\n" +
            "Kid : teacher says 6+4=10\n" +
            "Then they say 5+5=10\n" +
            "And the next day they say 3+7=10\n" +
            "They are themselves confused how will they pass me.."
            ,"Sardar on phone:\n" +
            "Doctor my wife is pergnant.She is having pain right now.\n" +
            "Doctor: Is this her first child?\n" +
            "Sardar: No this is her husband speaking?"
            ,"Kid gets Zero in a test.\n" +
            "Father: What this?\n" +
            "Kid: Teacher didn?t have More Stars 2 give,\n" +
            "So She Started giving Moon, DAD"
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
                .setCategory("Joke Messages")
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
                .setCategory("Joke Messages")
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
                .setCategory("Joke Messages")
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
                .setCategory("Joke Messages")
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
                .setCategory("Joke Messages")
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