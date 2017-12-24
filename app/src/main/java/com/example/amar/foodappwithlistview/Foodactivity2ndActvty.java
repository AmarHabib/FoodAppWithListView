package com.example.amar.foodappwithlistview;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Foodactivity2ndActvty extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_foodactivity2nd_actvty);

        ListView listfoods=getListView();

        ArrayAdapter<FoodGetDataFromIT> listadapter =new ArrayAdapter<FoodGetDataFromIT>(this,android.R.layout.simple_list_item_1,FoodGetDataFromIT.foods);

        listfoods.setAdapter(listadapter);

    }

    @Override
    protected void onListItemClick(ListView listview, View itemview, int position, long id) {
        super.onListItemClick(listview, itemview, position, id);

        Intent intent = new Intent(Foodactivity2ndActvty.this,FoodDetalsActivity.class);
        intent.putExtra(FoodDetalsActivity.EXTRA_FOODNO,(int)id);
        startActivity(intent);

    }
}
