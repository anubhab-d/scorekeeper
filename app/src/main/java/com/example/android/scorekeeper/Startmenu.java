package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Startmenu extends Activity {

    EditText team1 = (EditText) findViewById(R.id.editText);
    EditText team2 = (EditText) findViewById(R.id.editText2);
    String t1 = team1.toString();
    String t2 = team2.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmenu);





        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendTeams();
            }
        });
    }

    public void sendTeams(){

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Team1", t1);
        intent.putExtra("Team2", t2);
        startActivity(intent);

    }
}
