package com.mobsandgeeks.demo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.mobsandgeeks.adapters.CircularListAdapter;
import com.mobsandgeeks.adapters.R;

public class CircularSentenceActivity extends ListActivity {

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
        // 1. Your data source
        String[] circularData = new String[] {
            "Flinging", "This", "List,", "Makes", 
            "It", "Appear", "To", "Scroll", "On", 
            "And", "On", "And", "On"
        };
        
        // 2. Create your adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
                android.R.layout.simple_list_item_1, circularData);
        
        // 3. Wrap your adapter within the CircularListAdapter
        final CircularListAdapter circularListAdapter = new CircularListAdapter(adapter);
        
        // 4. Set the adapter to your ListView
        setListAdapter(circularListAdapter);
    }
    
}
