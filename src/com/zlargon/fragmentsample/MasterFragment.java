package com.zlargon.fragmentsample;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MasterFragment extends ListFragment {

    private final String[] TITLES = new String[] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
        "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
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

}
