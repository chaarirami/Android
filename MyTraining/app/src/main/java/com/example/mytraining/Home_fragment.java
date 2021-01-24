package com.example.mytraining;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.BiasAlignment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.List;
import java.util.zip.Inflater;

public class Home_fragment extends Fragment {
    private String username;
    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String USERNAME = "username";
    List<ComponentEntry> component;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUsername();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.home_fragment, container, false);
        MaterialToolbar toolbar = v.findViewById(R.id.topAppBar);
        toolbar.setTitle("Welcome " + this.username+ " !");
        //Log.i("Tag", username);

        //Set up RecyclerView
        RecyclerView rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        TrainingCardRecyclerViewAdapter adapter = new TrainingCardRecyclerViewAdapter(
                ComponentEntry.initializeData()
        );

        rv.setAdapter(adapter);
        return v;
    }

    private void loadUsername(){
        SharedPreferences sharedPref = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        this.username =  sharedPref.getString(USERNAME, "");
    }
}
