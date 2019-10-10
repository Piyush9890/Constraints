package com.example.constraints;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArmyPreparationsAdapter extends RecyclerView.Adapter<ArmyPreparationsAdapter.ImageViewHolder> {
    private int[] colors;
    private Context context;
    private List<String> armyPreparationList;
    private String armyPreparationType = "Soldier";

    public ArmyPreparationsAdapter(int[] colors, Context context, List<String> armyPreparationList, String armyPreparationType) {
        this.colors = colors;
        this.context = context;
        this.armyPreparationList = armyPreparationList;
        this.armyPreparationType = armyPreparationType;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.army_preparation_items, parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view, context, colors);
        return imageViewHolder;
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int color_id = colors[position];
        System.out.println("Piyush2: "+color_id);

        if(position==0)
        holder.imageView.setBackgroundResource(R.color.colorFlower);
        if(position==1)
        holder.imageView.setBackgroundResource(R.color.colorAqua);
        if(position==2)
        holder.imageView.setBackgroundResource(R.color.light_color2);
        if(position==3)
        holder.imageView.setBackgroundResource(R.color.colorGrass);
        if(position==4)
        holder.imageView.setBackgroundResource(R.color.bright_color);
        if(position==5)
        holder.imageView.setBackgroundResource(R.color.colorFlower2);


        holder.army_soldier_type.setText(armyPreparationType);
        holder.army_soldier_type.setText(armyPreparationList.get(position));
    }



    @Override
    public int getItemCount() {
        System.out.println("Piyush: "+colors.length);
        return colors.length;

    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        LinearLayout imageView;
        TextView army_soldier_title, army_soldier_type;
        Context context;
        int[] colors;

        public ImageViewHolder(@NonNull View itemView, Context context, int[] colors)  {
            super(itemView);
            imageView = itemView.findViewById(R.id.soldier_gd);
            army_soldier_title = itemView.findViewById(R.id.army_soldier_title);
            army_soldier_type = itemView.findViewById(R.id.army_soldier_type);
            this.colors = colors;
            this.context = context;

        }
    }
}
