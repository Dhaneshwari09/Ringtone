package com.cscorner.rintonerecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class gridlayout extends Activity {

    CardView cardring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        cardring = findViewById(R.id.music);
        cardring.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view){
              Intent i = new Intent(gridlayout.this,Ringmessage.class);
              startActivity(i);
          }
      });
    }
}