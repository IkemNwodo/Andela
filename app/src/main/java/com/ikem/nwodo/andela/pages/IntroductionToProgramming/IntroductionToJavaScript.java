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
public class IntroductionToJavaScript extends Fragment {


    public IntroductionToJavaScript() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_introduction_to_java_script, container, false);

        WebView webView = view.findViewById(R.id.introduction_to_java_script);
        webView.loadUrl("file:///android_asset/intro-js.html");

        return view;
    }

}
