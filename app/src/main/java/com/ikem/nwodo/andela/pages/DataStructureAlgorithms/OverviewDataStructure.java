package com.ikem.nwodo.andela.pages.DataStructureAlgorithms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.ikem.nwodo.andela.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewDataStructure extends Fragment {


    public OverviewDataStructure() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview_data_structure, container, false);

        WebView webView = view.findViewById(R.id.overview_data_structure);
        webView.loadUrl("file:///android_asset/Overview Data Structures.html");

        return view;

    }

}
