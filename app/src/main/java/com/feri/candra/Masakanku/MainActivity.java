package com.feri.candra.Masakanku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //DATA SOURCE
    String[] names={"Bakso","Batagor","Fuyunghai","Gado-gado","Gudeg","Mie Samyang"};
    String[] positions={"Nasi goreng adalah sebuah makanan berupa nasi yang digoreng."
                        ,"Batagor jajanan khas BAndung yang mengadapyasi gaya Tionghoa-Indonesia."
                        ,"Fuyunghai adalah masakan Tionghoa yang dibuat dari telur yang didadar dengan campuran berupa sayuran, daging atau makanan laut."
                        ,"Gado-gado adalah salah satu makanan yang berasal dari Surabaya yang berupa sayuran direbud dan dicampur jadi satu dengan bumbu kacang."
                        ,"Gudeg adalah makanan khas Yogyakarta & Jateng yang terbuat dari nangka muda yang dimasak dengan santan."
                        ,"Mie Samyang adalah merupakan mie instan dari Negeri ginseng."};
    int[] images={R.drawable.nasgor,R.drawable.batagor,R.drawable.fuyunghai,R.drawable.gado,R.drawable.gudeg,R.drawable.samyang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        Adapter adapter=new Adapter(this,names,positions,images);
        rv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
