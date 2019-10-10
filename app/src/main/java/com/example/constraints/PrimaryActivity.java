package com.example.constraints;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import com.example.piyush_library.Display2;

import java.util.Arrays;
import java.util.List;

public class PrimaryActivity extends AppCompatActivity {
RecyclerView rv_notifications, rv_army_preparation, rv_quiz_name;
private int[] images = {R.drawable.all_rally, R.drawable.latest_notification, R.drawable.admit_card, R.drawable.all_result, R.drawable.answer_key};
private int[] colors = {R.color.colorFlower, R.color.colorAqua, R.color.light_color2, R.color.colorGrass, R.color.bright_color, R.color.colorFlower2};
private RecyclerView.LayoutManager notifications_layoutManager, army_preparations_layoutManager, quiz_name_layoutManager;
private List<String> notification_list, army_preparation_list, quiz_name_list;
private String armyPreparationType;
private RecyclerAdapter adapter;
private ArmyPreparationsAdapter armyPreparationsAdapter;
private QuizNameAdapter quizNameAdapter;
private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);

        Display2.Toast(getApplicationContext(),"Library");


        rv_notifications = findViewById(R.id.rv_notifications);
        notifications_layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        notification_list = Arrays.asList(getResources().getStringArray(R.array.notification_list));

        army_preparation_list = Arrays.asList(getResources().getStringArray(R.array.army_preparation_list));

        quiz_name_list = Arrays.asList(getResources().getStringArray(R.array.quiz_name_list));


        rv_notifications.setHasFixedSize(true);
        rv_notifications.setLayoutManager(notifications_layoutManager);
        adapter = new RecyclerAdapter(images, this, notification_list);
        rv_notifications.setAdapter(adapter);



        rv_army_preparation = findViewById(R.id.rv_army_preparations);
        army_preparations_layoutManager = new GridLayoutManager(this, 3);
        rv_army_preparation.setHasFixedSize(true);
        rv_army_preparation.setLayoutManager(army_preparations_layoutManager);
        armyPreparationsAdapter = new ArmyPreparationsAdapter(colors, this, army_preparation_list, armyPreparationType);
        rv_army_preparation.setAdapter(armyPreparationsAdapter);

        rv_quiz_name = findViewById(R.id.rv_quiz_name);
        quiz_name_layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rv_quiz_name.setHasFixedSize(true);
        rv_quiz_name.setLayoutManager(quiz_name_layoutManager);
        quizNameAdapter = new QuizNameAdapter(image, quiz_name_list, this);
        rv_quiz_name.setAdapter(quizNameAdapter);
    }
}
