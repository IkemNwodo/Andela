package com.ikem.nwodo.andela.pages.OOP;


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
public class WhatIsObjectOrientedProgramming extends Fragment {


    public WhatIsObjectOrientedProgramming() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_what_is_object_oriented_programming, container, false);

        WebView webView = view.findViewById(R.id.what_is_object_oriented_programming);
        webView.loadUrl("file:///android_asset/OOP.html");

        return view;
    }

}
