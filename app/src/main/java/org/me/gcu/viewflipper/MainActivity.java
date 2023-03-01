package org.me.gcu.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private ViewFlipper flip;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        flip = (ViewFlipper) findViewById(R.id.flip);
        //when a view is displayed
        flip.setInAnimation(this, android.R.anim.fade_in);
        //when a view disappears
        flip.setOutAnimation(this, android.R.anim.fade_out);
    }

    @Override
    public void onClick(View arg0) {

        flip.showNext();
    }
}