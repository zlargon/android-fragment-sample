package com.zlargon.fragmentsample;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private int mPosition = -1;
    public void setPosition(int position) {
        mPosition = position;
    }

    public final String[] TITLES = new String[] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
        "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
    };

    public final String[] DETAILS = new String[] {
        "Detail 1", "Detail 2", "Detail 3", "Detail 4", "Detail 5",
        "Detail 6", "Detail 7", "Detail 8", "Detail 9", "Detail 10"
    };

    public String getDetail() {
        if (mPosition < 0) {
            return "Detail Fragment";
        }

        return DETAILS[mPosition];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // check savedInstanceState
        if (savedInstanceState == null) {
            return;
        }

        // load position
        mPosition = savedInstanceState.getInt("POSITION_KEY");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // check outState
        if (outState == null) {
            return;
        }

        // save position
        outState.putInt("POSITION_KEY", mPosition);
    }
}
