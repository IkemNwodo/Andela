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
public class IntroductionToES6 extends Fragment {


    public IntroductionToES6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_introduction_to_es6, container, false);

        WebView webView = view.findViewById(R.id.introduction_to_es6);
        webView.loadUrl("file:///android_asset/ES6.html");

        return view;
    }

}
