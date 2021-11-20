package com.bmi.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView=findViewById(R.id.profileImageID);
        textview=findViewById(R.id.profileTextViewID);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String countryName=bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){
        if(countryName.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.bd);
            textview.setText(R.string.bd_txt);
        }
        if(countryName.equals("India")){
            imageView.setImageResource(R.drawable.in);
            textview.setText(R.string.in_txt);
        }
        if(countryName.equals("Pakistan")){
            imageView.setImageResource(R.drawable.pk);
            textview.setText(R.string.pk_txt);
        }
        if(countryName.equals("Sri Lanks")){
            imageView.setImageResource(R.drawable.sr);
            textview.setText(R.string.sr_txt);
        }
        if(countryName.equals("Nepal")){
            imageView.setImageResource(R.drawable.ne);
            textview.setText(R.string.ne_txt);
        }
        if(countryName.equals("Bhutan")){
            imageView.setImageResource(R.drawable.bu);
            textview.setText(R.string.bu_txt);
        }
        if(countryName.equals("Maldives")){
            imageView.setImageResource(R.drawable.mal);
            textview.setText(R.string.mal_txt);
        }
        if(countryName.equals("Afganistan")){
            imageView.setImageResource(R.drawable.af);
            textview.setText(R.string.af_txt);
        }
    }
}