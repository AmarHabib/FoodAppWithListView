package com.example.amar.foodappwithlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetalsActivity extends AppCompatActivity {


    public static final String EXTRA_FOODNO="foodno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detals);


        int foodno=(Integer)getIntent().getExtras().get(EXTRA_FOODNO);


        FoodGetDataFromIT  food=FoodGetDataFromIT.foods[foodno];

        TextView name=(TextView)findViewById(R.id.tvTitle);
        TextView desc=(TextView)findViewById(R.id.tvDescp);
        ImageView imgvw=(ImageView)findViewById(R.id.img1);


        name.setText(food.getName());
        desc.setText(food.getDescription());
        imgvw.setImageResource(food.getImages());

    }
}
