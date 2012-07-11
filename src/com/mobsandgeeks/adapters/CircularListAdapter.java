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

package com.mobsandgeeks.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * A circular adapter that makes your {@link ListView} appear circular.
 * 
 * @author ragunathjawahar
 * @version 0.1
 */
public class CircularListAdapter extends BaseAdapter {
    // Debug
    static final boolean DEBUG = false;
    static final String TAG = CircularListAdapter.class.getSimpleName();
    
    // Attributes
    private BaseAdapter listAdapter;
    private int listAdapterCount;
    
    /**
     * Constructs a {@linkplain CircularListAdapter}.
     * 
     * @param listAdapter A {@link ListAdapter} that has to behave circular.
     */
    public CircularListAdapter(BaseAdapter listAdapter) {
        if(listAdapter == null) {
            throw new IllegalArgumentException("listAdapter cannot be null.");
        }
        
        this.listAdapter = listAdapter;
        this.listAdapterCount = listAdapter.getCount();
    }
    
    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return listAdapter.getView(position % listAdapterCount, convertView, parent);
    }

    @Override
    public Object getItem(int position) {
        return listAdapter.getItem(position % listAdapterCount);
    }

    @Override
    public long getItemId(int position) {
        return listAdapter.getItemId(position % listAdapterCount);
    }

    @Override
    public boolean areAllItemsEnabled() {
        return listAdapter.areAllItemsEnabled();
    }

    @Override
    public int getItemViewType(int position) {
        return listAdapter.getItemViewType(position % listAdapterCount);
    }

    @Override
    public int getViewTypeCount() {
        return listAdapter.getViewTypeCount();
    }

    @Override
    public boolean isEmpty() {
        return listAdapter.isEmpty();
    }

    @Override
    public boolean isEnabled(int position) {
        return listAdapter.isEnabled(position % listAdapterCount);
    }

    @Override
    public void notifyDataSetChanged() {
        listAdapter.notifyDataSetChanged();
        listAdapterCount = listAdapter.getCount();
        
        super.notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetInvalidated() {
        listAdapter.notifyDataSetInvalidated();
        super.notifyDataSetInvalidated();
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return listAdapter.getDropDownView(position % listAdapterCount, 
                convertView, parent);
    }

    @Override
    public boolean hasStableIds() {
        return listAdapter.hasStableIds();
    }
    
}
