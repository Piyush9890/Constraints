package com.example.constraints;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {
    private int[] images;
    private Context context;
    private List<String> notification_list;

    public RecyclerAdapter(int[] images, Context context, List<String> notification_list) {
        this.images = images;
        this.context = context;
        this.notification_list = notification_list;
    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_items, parent, false);
            ImageViewHolder imageViewHolder = new ImageViewHolder(view, context, images);
            return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
            int image_id = images[position];
            holder.imageView.setImageResource(image_id);
            holder.imageTitle.setText(notification_list.get(position));
    }



    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView imageTitle;
        Context context;
        int[] images;

        public ImageViewHolder(@NonNull View itemView, Context context, int[] images) {
            super(itemView);
            imageView = itemView.findViewById(R.id.notifications_image);
            imageTitle = itemView.findViewById(R.id.notifications_text);
            this.context = context;
            this.images = images;
        }
    }
}
