package com.example.mytraining;

// Class used to describe the components shown on the cards @home

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class ComponentEntry {
    public String title;
    public String description;
    int photoId;

    ComponentEntry(String title, String description, int photoId){
        this.title = title;
        this.description=description;
        this.photoId=photoId;
    }

    public static List<ComponentEntry> initializeData(){
        List<ComponentEntry> componentEntries = new ArrayList<>();
        //TODO Replace images
        componentEntries.add(new ComponentEntry("Cardio", "Add new activity", R.drawable.common_signin_btn_icon_dark));
        componentEntries.add(new ComponentEntry("Resistance Training", "Add new activity", R.drawable.common_signin_btn_icon_dark));
        componentEntries.add(new ComponentEntry("Nutrition", "Add meal", R.drawable.common_signin_btn_icon_dark));
        return componentEntries;
    }
}


