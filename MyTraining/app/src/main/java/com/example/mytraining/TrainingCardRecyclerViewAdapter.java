package com.example.mytraining;


// Adapter used to show cards on home screen

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class TrainingCardRecyclerViewAdapter extends RecyclerView.Adapter<TrainingCardViewHolder>{

    private List<ComponentEntry> componentList;

    TrainingCardRecyclerViewAdapter(List<ComponentEntry> componentList){
        this.componentList = componentList;
    }

    @NonNull
    @Override
    public TrainingCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card, parent, false);{
        return new TrainingCardViewHolder(layoutView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull TrainingCardViewHolder holder, int position) {
        TrainingCardViewHolder.title.setText(componentList.get(position).title);
        TrainingCardViewHolder.description.setText(componentList.get(position).description);
        TrainingCardViewHolder.componentPhoto.setImageResource(componentList.get(position).photoId);

    }

    @Override
    public int getItemCount() {
        return componentList.size();
    }




}
