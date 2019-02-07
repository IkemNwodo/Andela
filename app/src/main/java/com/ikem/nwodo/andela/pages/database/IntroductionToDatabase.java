package com.ikem.nwodo.andela.pages.database;


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
public class IntroductionToDatabase extends Fragment {


    public IntroductionToDatabase() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_introduction_to_database, container, false);

        WebView webView = view.findViewById(R.id.introduction_to_database);
        webView.loadUrl("file:///android_asset/Databases.html");

        return view;
    }

}
