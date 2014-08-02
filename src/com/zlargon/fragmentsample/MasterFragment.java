package com.zlargon.fragmentsample;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MasterFragment extends ListFragment {

    private final String[] TITLES = new String[] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
        "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
    };

    private final String[] DETAILS = new String[] {
        "Detail 1", "Detail 2", "Detail 3", "Detail 4", "Detail 5",
        "Detail 6", "Detail 7", "Detail 8", "Detail 9", "Detail 10"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setup list adapter
        setListAdapter(new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_activated_1,
            TITLES
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

        // find detail fragment
        DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);

        // find detail text view
        TextView detailTextView = (TextView)detailFragment.getView().findViewById(R.id.textview_detail);

        // set text
        detailTextView.setText(DETAILS[position]);
    }
}
