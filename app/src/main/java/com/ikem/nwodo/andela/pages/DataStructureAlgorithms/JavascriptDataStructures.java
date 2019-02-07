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
public class JavascriptDataStructures extends Fragment {


    public JavascriptDataStructures() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_javascript_data_structures, container, false);

        WebView webView = view.findViewById(R.id.javascript_data_structures);
        webView.loadUrl("file:///android_asset/Data Structures-js.html");

        return view;
    }

}
