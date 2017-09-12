package com.example.emon.spimnerbox;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Emon on 11/17/2016.
 */

public class spinnerAdapter extends ArrayAdapter {

    public spinnerAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        // TODO Auto-generated constructor stub

    }

    @Override
    public int getCount() {
        return super.getCount() - 1; // you dont display last item. It is used as hint.
    }
}
