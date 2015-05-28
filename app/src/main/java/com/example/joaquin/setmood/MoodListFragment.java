package com.example.joaquin.setmood;

import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MoodListFragment extends ListFragment {

    ArrayList<Mood> moods;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        moods = MoodSet.get(getActivity()).getMoods();
        MoodAdapter adapter = new MoodAdapter(moods);
        setListAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.title_moods, container, false);

        return view;

    }

    private class MoodAdapter extends ArrayAdapter<Mood> {

        public MoodAdapter(ArrayList<Mood> moods) {

            super(getActivity(), 0, moods);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {

                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_moods, null);

            }

            Mood mood = getItem(position);

            TextView moodTextView =
                    (TextView)convertView.findViewById(R.id.your_current_mood);
            moodTextView.setText(mood.getMood());

            return convertView;

        }

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent = new Intent(getActivity(), MoodActivity.class);
        intent.putExtra(MoodFragment.EXTRA_MOOD, position);
        startActivity(intent);

    }

    @Override
    public void onResume() {
        super.onResume();

        ((MoodAdapter)getListAdapter()).notifyDataSetChanged();

    }

}
