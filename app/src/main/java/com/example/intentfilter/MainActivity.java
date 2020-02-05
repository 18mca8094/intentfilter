package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);

                Intent receivedIntent = getIntent();
                Uri receivedUri = (Uri)receivedIntent.getParcelableExtra(Intent.EXTRA_STREAM);
                if (receivedUri != null) {
                    //set the picture
                    //RESAMPLE YOUR IMAGE DATA BEFORE DISPLAYING
                    imageView.setImageURI(receivedUri);//just for demonstration
                }
            }
        }


