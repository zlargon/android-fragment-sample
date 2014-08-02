package com.zlargon.fragmentsample;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailDialogFragment extends DialogFragment {

    public String mDetailText;
    private TextView mDetailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // setup UI Components
        mDetailTextView = (TextView) getView().findViewById(R.id.textview_detail);
        mDetailTextView.setText(mDetailText);
    }
}
