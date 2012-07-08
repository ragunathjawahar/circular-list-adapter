package com.mobsandgeeks.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mobsandgeeks.adapters.CircularListAdapter;
import com.mobsandgeeks.adapters.R;

public class SpectrumActivity extends ListActivity {
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
        // 1. Your dataset
        List<Integer> spectrum = new ArrayList<Integer>();
        spectrum.add(R.drawable.spectrum_01);
        spectrum.add(R.drawable.spectrum_02);
        spectrum.add(R.drawable.spectrum_03);
        spectrum.add(R.drawable.spectrum_04);
        spectrum.add(R.drawable.spectrum_05);
        spectrum.add(R.drawable.spectrum_06);
        spectrum.add(R.drawable.spectrum_07);
        
        // 2. Your custom adapter
        SpectrumAdapter spectrumAdapter = new SpectrumAdapter(this, 
                -1, spectrum);
        
        // 3. Our single argument circular adapter
        CircularListAdapter circularAdapter = new CircularListAdapter(spectrumAdapter);
        
        // We remove the list's divider for this example so that it looks nice ;)
        ListView listView = getListView();
        listView.setDivider(null);
        
        // 4. Set the circular adapter to the list, and we're done
        setListAdapter(circularAdapter);
    }
    
    /*
     * A custom adapter that extends the ArrayAdapter<T>.
     */
    class SpectrumAdapter extends ArrayAdapter<Integer> {
        private List<Integer> spectrum;

        public SpectrumAdapter(Context context, int textViewResourceId,
                List<Integer> spectrum) {
            super(context, textViewResourceId, spectrum);
            this.spectrum = spectrum;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            
            if(view == null) {
                view = new View(SpectrumActivity.this);
            }
            
            // Set property
            view.setBackgroundResource(spectrum.get(position));
            
            return view;
        }
        
    }
}
