package com.example.android.scorekeeper;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    int runs=0;
    int wickets=0;

    int runs2=0;
    int wickets2=0;



    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button wicket;
    Button six2;
    Button five2;
    Button four2;
    Button three2;
    Button two2;
    Button one2;
    Button wicket2;
    Button reset;

    float overs;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teams();
        settext();
        settext2();

        reset= (Button) findViewById(R.id.reset);
        six = (Button) findViewById(R.id.btn6);
        five = (Button) findViewById(R.id.btn5);
        four = (Button) findViewById(R.id.btn4);
        three = (Button) findViewById(R.id.btn3);
        two = (Button) findViewById(R.id.btn2);
        one = (Button) findViewById(R.id.btn1);
        wicket = (Button) findViewById(R.id.btnwkt);
        six2 = (Button) findViewById(R.id.btn);
        five2 = (Button) findViewById(R.id.btn7);
        four2 = (Button) findViewById(R.id.btn8);
        three2 = (Button) findViewById(R.id.btn9);
        two2 = (Button) findViewById(R.id.btn10);
        one2 = (Button) findViewById(R.id.btn11);
        wicket2 = (Button) findViewById(R.id.btnwkt2);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                six();
                settext();


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                five();
                settext();

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                four();
                settext();

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                three();
                settext();


            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                two();
                settext();


            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                one();
                settext();


            }
        });

        wicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wickets();
                settext();

            }
        });


        six2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six2();
                settext2();

            }
        });

        five2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five2();
                settext2();

            }
        });

        four2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four2();
                settext2();
            }
        });

        three2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three2();
                settext2();

            }
        });

        two2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two2();
                settext2();

            }
        });

        one2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one2();
                settext2();

            }
        });

        wicket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wickets2();
                settext2();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });





    }


    public void six2()  {

        runs2+=6;
    }

    public void five2()  {

        runs2+=5;
    }


    public void four2(){

        runs2+=4;
    }

    public void three2()  {

        runs2+=3;
    }

    public void two2()  {

        runs2+=2;
    }

    public void one2()  {

        runs2+=1;
    }

    public void wickets2(){

        if(wickets2<10){
            wickets2+=1;
        }
    }


    public void six()  {

        runs+=6;
    }

    public void five()  {

        runs+=5;
    }


    public void four(){

        runs+=4;
    }

    public void three()  {

        runs+=3;
    }

    public void two()  {

        runs+=2;
    }

    public void one()  {

        runs+=1;
    }

    public void wickets(){

        if(wickets<10){
        wickets+=1;
        }


    }


    public void settext(){

        TextView score = (TextView) findViewById(R.id.textView);
        score.setText(""+runs+"/"+wickets);
    }

    public void settext2(){

        TextView score = (TextView) findViewById(R.id.textView2);
        score.setText(""+runs2+"/"+wickets2);
    }

    public void reset(){

        runs=0;
        runs2=0;
        wickets=0;
        wickets2=0;
        TextView score = (TextView) findViewById(R.id.textView);
        TextView score2 = (TextView) findViewById(R.id.textView2);
        score.setText(runs+"/"+wickets);
        score2.setText(runs2+ "/"+ wickets2);
    }


    public void teams(){

        Bundle bundle = getIntent().getExtras();
        String t1 = bundle.getString("Team1");
        String t2 = bundle.getString("Team2");

        TextView team1 = (TextView) findViewById(R.id.textView4);
        TextView team2 = (TextView) findViewById(R.id.textView5);

        team1.setText(t1);
        team2.setText(t2);
    }

}


















































