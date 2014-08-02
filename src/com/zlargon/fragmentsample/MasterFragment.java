package com.zlargon.fragmentsample;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MasterFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setup list adapter
        setListAdapter(new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_activated_1,
            ((MainActivity) getActivity()).TITLES
        ));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // set list choice single mode
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        // get activity
        MainActivity activity = (MainActivity) getActivity();

        // save position to activity
        activity.setPosition(position);

        // find detail fragment
        DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);

        // check detail fragment
        if (detailFragment == null || detailFragment.isVisible() == false) {
            // detail fragment is not exist, app screen is portrait now
            return;
        }

        // find detail text view
        TextView detailTextView = (TextView)detailFragment.getView().findViewById(R.id.textview_detail);

        // set text
        detailTextView.setText(activity.getDetail());
    }
}
