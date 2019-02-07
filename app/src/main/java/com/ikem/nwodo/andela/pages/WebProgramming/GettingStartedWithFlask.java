package com.ikem.nwodo.andela.pages.WebProgramming;


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
public class GettingStartedWithFlask extends Fragment {


    public GettingStartedWithFlask() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_getting_started_with_flask, container, false);

        WebView webView = view.findViewById(R.id.getting_started_with_flask);
        webView.loadUrl("file:///android_asset/Flask-py.html");

        return view;
    }

}
