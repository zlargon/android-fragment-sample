package com.zlargon.fragmentsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    public final String DETAIL_TEXT_KEY = "DETAIL_TEXT_KEY";

    private TextView mDetailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // setup UI Component
        mDetailTextView = (TextView) getView().findViewById(R.id.textview_detail);

        // check savedInstanceState
        if (savedInstanceState == null) {
            return;
        }

        /* load the data from savedInstanceState */

        // get the detail text from savedInstanceState
        String detailText = savedInstanceState.getString(DETAIL_TEXT_KEY);

        // setup the detail text
        mDetailTextView.setText(detailText);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // check outState
        if (outState == null) {
            return;
        }

        /* save the data to outState */

        // get detail text from text view
        String detailText = mDetailTextView.getText().toString();

        // save detail text to outState
        outState.putString(DETAIL_TEXT_KEY, detailText);
    }
}
