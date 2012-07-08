package com.mobsandgeeks.demo;

import com.mobsandgeeks.adapters.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CLADemoActivity extends ListActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
        // Demos
        String[] demos = { "Circular Sentence", "Spectrum" };
        
        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
                android.R.layout.simple_list_item_1, demos);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Class<?> clazz = null;
        
        switch(position) {
        case 0:
            clazz = CircularSentenceActivity.class;
            break;
        case 1:
            clazz = SpectrumActivity.class;
            break;
        }
        
        if(clazz != null) {
            Intent intent = new Intent(this, clazz);
            startActivity(intent);
        }
    }
    
}
