package com.androidlime.customlistviewinandroid;

import android.media.audiofx.AudioEffect;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    int[] IMAGES = {R.drawable.tamim, R.drawable.marsafi, R.drawable.mosfiq, R.drawable.mostafizz, R.drawable.nasir, R.drawable.sabbir, R.drawable.sakib, R.drawable.sumya, R.drawable.taskin};

    String[] NAMES = {"Tamim Iqbal", "Mashrafe Mortaza", "Mushfiqur Rahman", "Mustafizur Rahman", "Nasir Hossain", "Sabbir Rahman", "Sakib Al Hassan", "Soumya Sarker", "Taskin Ahmed"};

    String[] DESCRIPTIONS = {"Player", "Player", "Player", "Player", "Player", "Player", "Player", "Player", "Player"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

      // CustomAdapter ghgh=new customAdapter();
       // CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(new CustomAdapter());
       // listView.setAdapter(g);

        class CustomAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return IMAGES.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
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
