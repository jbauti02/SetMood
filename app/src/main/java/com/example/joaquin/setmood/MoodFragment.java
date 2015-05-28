package com.example.joaquin.setmood;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MoodFragment extends Fragment {

    public static final String EXTRA_MOOD = "user_mood";
    private Mood mood;
    private int id = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() == null &&
                getActivity().getIntent().getIntExtra(EXTRA_MOOD, -2) != -2) {

            id = getActivity().getIntent().getIntExtra(EXTRA_MOOD, 0);

        } else {

            id = getArguments().getInt(EXTRA_MOOD);

        }

        mood = MoodSet.get(getActivity()).getMoods().get(id);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mood, container, false);

        TextView moodTextView = (TextView)view.findViewById(R.id.your_current_mood);
        moodTextView.setText(mood.getMood());

        TextView songTextView = (TextView)view.findViewById(R.id.song_and_artist);
        songTextView.setText(mood.getSong());

        TextView displayTextView = (TextView)view.findViewById(R.id.display);
        displayTextView.setText(mood.getImage());

        TextView trackTextView = (TextView)view.findViewById(R.id.track_length);
        trackTextView.setText(mood.getTrackLength());

        // Place Rating bar code here

        TextView valueTextView = (TextView)view.findViewById(R.id.rating_value);
        valueTextView.setText(mood.getRating());

        return view;

    }

}
