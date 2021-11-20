package com.bmi.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button bd,in,pk,sr,nep,but,mal,af;
private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bd=findViewById(R.id.BDbtnID);
        in=findViewById(R.id.indiabtnID);
        pk=findViewById(R.id.pkbtnID);
        sr=findViewById(R.id.sribtnID);
        nep=findViewById(R.id.nepalbtnID);
        but=findViewById(R.id.butanbtnID);
        mal=findViewById(R.id.maldivsbtnID);
        af=findViewById(R.id.afganistanbtnID);

        bd.setOnClickListener(this);
        in.setOnClickListener(this);
        pk.setOnClickListener(this);
        sr.setOnClickListener(this);
        nep.setOnClickListener(this);
        but.setOnClickListener(this);
        mal.setOnClickListener(this);
        af.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
if(view.getId()==R.id.BDbtnID){
    intent=new Intent(MainActivity.this,ProfileActivity.class);
    intent.putExtra("name","Bangladesh");
    startActivity(intent);}
}


        if(view.getId()==R.id.indiabtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);}


    }if(view.getId()==R.id.pkbtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);}


    }if(view.getId()==R.id.sribtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Srilanka");
            startActivity(intent);}

            if(view.getId()==R.id.nepalbtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Nepal");
            startActivity(intent);}

            if(view.getId()==R.id.butanbtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Bhutan");
            startActivity(intent);}

            if(view.getId()==R.id.maldivsbtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Maldivs");
            startActivity(intent);}

            if(view.getId()==R.id.afganistanbtnID){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Afganistan");
            startActivity(intent);


    }








}}}}