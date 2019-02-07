package com.ikem.nwodo.andela.pages.IntroductionToProgramming;


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
public class ProgrammingBasics extends Fragment {


    public ProgrammingBasics() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_programming_basics, container, false);

        WebView webView = view.findViewById(R.id.programming_basics);
        webView.loadUrl("file:///android_asset/Programming Basics.html");

        return view;
    }

}
