package com.example.myfitapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List <Techniques> techniques1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        techniques1 = new ArrayList<>();
        techniques1.add(new Techniques("Push ups","3 series x 10 reps", "10 reps burns 7 calories", "Contract your abs and tighten your core by pulling your belly button toward your spine. Inhale as you slowly bend your elbows and lower yourself to the floor, until your elbows are at a 90-degree angle. Exhale while contracting your chest muscles and pushing back up through your hands.",R.drawable.image1));
        techniques1.add(new Techniques("Side Planks", "2 series x 15 reps", "10 reps burns 5 calories", "Start in a traditional side plank position.Raise your top arm straight above you.Then lower your arm and rotate your core as you thread your top arm through the space under you.Unthread your arm and return to the starting position.", R.drawable.image2));
        techniques1.add(new Techniques("Squads", "4 series x 8 reps", "8 reps burns 20 calories", "Stand up straight with your feet slightly wider than shoulder-width apart. Squat down until your thighs are slightly higher than your knees. Propel yourself upward so your feet lift off the ground. Land with soft, bent knees, and settle back into the squat position.",R.drawable.image3));
        techniques1.add(new Techniques("Burpees", "3 series x 20 reps", "20 reps burns 12 calories", "1.Stand with your feet shoulder \n 2.Lower into a squat position \n 3.Kick or step your legs back \n 4.Jump or step your legs forward to return to a squat position \n 5.Return to the standing position.",R.drawable.image4));
        techniques1.add(new Techniques("Dumbbell rows", "3 series x 10 reps", "10 reps burns 5 calories", "Bring the dumbbell up to your chest, concentrating on lifting it with your back and shoulder muscles rather than your arms. Keep your chest still as you lift. At the top of the movement, squeeze your shoulder and back muscles, then lower the arm.",R.drawable.image5));
        techniques1.add(new Techniques("Biceps Curls","3 series x 12 reps" ,"12 reps burns 7 calories", "Start standing with a dumbbell in each hand. Your elbows should rest at your sides.and your forearms should extend out in front of your body.Bring the dumbbells all the way up to your shoulders by bending your elbows, then reverse the curl and repeat.",R.drawable.image6));
       myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
       myAdapter = new RecyclerViewAdapter(this,techniques1);
       myrecyclerView.setLayoutManager(new LinearLayoutManager(this));
       myrecyclerView.setAdapter(myAdapter);


    }
}   