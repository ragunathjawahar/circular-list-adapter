/*
 * Copyright (C) 2012 Mobs and Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobsandgeeks.demo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.mobsandgeeks.adapters.CircularListAdapter;
import com.mobsandgeeks.adapters.R;

/**
 * @author Ragunath Jawahar <rj@mobsandgeeks.com>
 * @version 0.1
 */
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
