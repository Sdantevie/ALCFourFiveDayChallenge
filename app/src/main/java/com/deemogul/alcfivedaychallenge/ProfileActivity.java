package com.deemogul.alcfivedaychallenge;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        ImageView imageView = findViewById(R.id.imageView);
//
//        BitmapFactory.Options options = new BitmapFactory.Options();
//
//        options.inJustDecodeBounds = true;
//        options.inSampleSize = 3;
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile_one, options);
//        imageView.setImageBitmap(bitmap);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("My Profile");

    }
}
