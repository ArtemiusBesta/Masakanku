package com.feri.candra.Masakanku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //VIEWS
    ImageView img;
    TextView nameTxt,posTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RECEIVE OUR DATA
        Intent i=getIntent();

        final String name=i.getExtras().getString("Name");
        final String pos=i.getExtras().getString("Position");
        final int image=i.getExtras().getInt("Image");


        //REFERENCE VIEWS FROM XML
        img= (ImageView) findViewById(R.id.playerImage);
        nameTxt= (TextView) findViewById(R.id.nameTxt);
        posTxt= (TextView) findViewById(R.id.posTxt);

        //ASSIGN DATA TO THOSE VIEWS
        img.setImageResource(image);
        nameTxt.setText("NAMA :   "+name);
        posTxt.setText("DESKRIPSI : "+pos);



    }

}
