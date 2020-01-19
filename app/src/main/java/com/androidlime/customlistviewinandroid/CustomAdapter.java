package com.androidlime.customlistviewinandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mithun on 10/5/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    static LayoutInflater inflater=null;
    int icons[];
    String number[];


    public CustomAdapter( Context context,int icons[], String number[]){
        this.context=context;
        this.icons=icons;
        this.number=number;

    }
    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
        view = getLayoutInflater().inflate(R.layout.customlayout, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
        TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

        imageView.setImageResource(IMAGES[i]);
        textView_name.setText(NAMES[i]);
        textView_description.setText(DESCRIPTIONS[i]);
        return view;
    }
}
}
        }
