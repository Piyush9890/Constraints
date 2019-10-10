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

public class QuizNameAdapter extends RecyclerView.Adapter<QuizNameAdapter.QuizNameViewHolder> {
    private int image;
    private List<String> quizNameList;
    private Context context;

    public QuizNameAdapter(int image, List<String> quizNameList, Context context) {
        this.image = image;
        this.quizNameList = quizNameList;
        this.context = context;
    }
    @NonNull
    @Override
    public QuizNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_name_items, parent, false);

        return new QuizNameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizNameViewHolder holder, int position) {
        String quiz_id = quizNameList.get(position);
        holder.textView.setText(quiz_id);

    }


   // Return the ArrayList Size
    @Override
    public int getItemCount() {
        return quizNameList.size();
    }


    public static class QuizNameViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public QuizNameViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.quiz_name_image);
            textView = itemView.findViewById(R.id.quiz_name_text);
        }
    }
}
