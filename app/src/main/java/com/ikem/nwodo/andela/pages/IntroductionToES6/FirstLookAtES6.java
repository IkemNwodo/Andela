package com.ikem.nwodo.andela.pages.IntroductionToES6;


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
public class FirstLookAtES6 extends Fragment {


    public FirstLookAtES6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_look_at_es6, container, false);

        WebView webView = view.findViewById(R.id.first_look_at_es6);
        webView.loadUrl("file:///android_asset/First look at ES6.html");

        return view;
    }

}
