package com.example.mizuno.prog_102;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Prog102Activity extends AppCompatActivity {

    ImageView imageView = null;
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog102);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.image_pet);
        textView = (TextView)findViewById(R.id.textView);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.image_dog);
                textView.setText(R.string.message_dog);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.image_cat);
                textView.setText(R.string.message_cat);
            }
        });

    }
}
