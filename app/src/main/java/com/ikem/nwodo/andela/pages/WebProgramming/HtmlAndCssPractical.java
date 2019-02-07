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
public class HtmlAndCssPractical extends Fragment {


    public HtmlAndCssPractical() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_html_and_css_practical, container, false);

        WebView webView = view.findViewById(R.id.html_and_css_practical);
        webView.loadUrl("file:///android_asset/HTML and CSS Practical.html");

        return view;
    }

}
