/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.quakereport;

// Example code adapted from androidhive
// https://www.androidhive.info/2016/01/android-working-with-recycler-view/
//

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {
    private List<Earthquake> earthquakeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private EarthquakeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mAdapter = new EarthquakeAdapter(earthquakeList);
        // not sure if LinearLayoutManager uses getApplication or getApplicationContext
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplication());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareEarthquakeData();
    }

    // Create a fake list of earthquake magnitudes, locations, and dates.
    private void prepareEarthquakeData() {
        Earthquake earthquake = new Earthquake("4.5", "San Francisco", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "London", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "Tokyo", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "Mexico City", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "Moscow", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "Rio de Janeiro", "July 22, 2018");
        earthquakeList.add(earthquake);

        earthquake = new Earthquake("4.5", "Paris", "July 22, 2018");
        earthquakeList.add(earthquake);

        mAdapter.notifyDataSetChanged();
    }

}