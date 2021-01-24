package com.example.mytraining;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class TrainingCardViewHolder extends RecyclerView.ViewHolder {

    CardView cv;
    public static TextView title;
    public static TextView description;
    public static ImageView componentPhoto;

    public TrainingCardViewHolder(@NonNull View itemView){
        super(itemView);
        cv = (CardView)itemView.findViewById(R.id.cv);
        title = (TextView)itemView.findViewById(R.id.training_title);
        description = (TextView)itemView.findViewById(R.id.training_description);
        componentPhoto = (ImageView)itemView.findViewById(R.id.training_image);
    }
}
