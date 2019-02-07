package com.ikem.nwodo.andela.pages.TestDrivenDevelopment;


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
public class DebuggingInJavascript extends Fragment {


    public DebuggingInJavascript() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_debugging_in_javascript, container, false);

        WebView webView = view.findViewById(R.id.debugging_in_javascript);
        webView.loadUrl("file:///android_asset/Debugging--js.html");

        return view;
    }

}
