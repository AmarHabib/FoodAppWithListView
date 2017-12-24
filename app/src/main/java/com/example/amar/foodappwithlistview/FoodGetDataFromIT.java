package com.example.amar.foodappwithlistview;

/**
 * Created by amar on 12/23/17.
 */

public class FoodGetDataFromIT {

    private String name;
    private String description;
    private int imageid;


    public static final FoodGetDataFromIT[] foods = {

            new FoodGetDataFromIT("Pizza1","Thin crust pizza with extra cheez",R.drawable.p1),
             new FoodGetDataFromIT("Pizza2","Thin crust pizza with extra cheez",R.drawable.p2),
              new FoodGetDataFromIT("Pizza3","Thin crust pizza with extra cheez",R.drawable.p3),
    };

    public FoodGetDataFromIT(String name,String description,int imageid){

             this.name=name;
             this.description=description;
             this.imageid=imageid;

    }

    public String getName(){
        return name;

        }

    public int getImages(){
        return imageid;

    }

        public String getDescription(){
            return description;

        }


        public String toString(){

            return this.name;
        }











}
