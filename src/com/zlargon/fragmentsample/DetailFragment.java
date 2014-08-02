package com.zlargon.fragmentsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
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

        // setup the detail text
        mDetailTextView.setText(((MainActivity) getActivity()).getDetail());
    }
}
