package com.example.amar.foodappwithlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //AdapterView it is needed in order to clcik on the listitmeview
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {

                if(position==0){

                    Intent intent =new Intent(MainActivity.this,Foodactivity2ndActvty.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView=(ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);





    }




}
