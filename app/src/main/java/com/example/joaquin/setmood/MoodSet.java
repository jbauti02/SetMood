package com.example.joaquin.setmood;

import android.content.Context;
import java.util.ArrayList;

public class MoodSet {

    private ArrayList<Mood> moods = new ArrayList<>();
    private static MoodSet moodSet;
    private Context context;

    private MoodSet(Context c) {

        context = c;
        moods.add(new Mood("Your Mood 1", "Song and Artist 1", "Wave Animation or Image 1", "Track Length 1", "Rating Value 1"));
        moods.add(new Mood("Your Mood 2", "Song and Artist 2", "Wave Animation or Image 2", "Track Length 2", "Rating Value 2"));
        moods.add(new Mood("Your Mood 3", "Song and Artist 3", "Wave Animation or Image 3", "Track Length 3", "Rating Value 3"));
        moods.add(new Mood("Your Mood 4", "Song and Artist 4", "Wave Animation or Image 4", "Track Length 4", "Rating Value 4"));
        moods.add(new Mood("Your Mood 5", "Song and Artist 5", "Wave Animation or Image 5", "Track Length 5", "Rating Value 5"));

    }

    public static MoodSet get(Context c) {

        if(moodSet == null) {

            moodSet = new MoodSet(c.getApplicationContext());

        }

        return moodSet;

    }

    public ArrayList<Mood> getMoods() {

        return moods;

    }

}

