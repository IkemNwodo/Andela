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
public class ObjectOrientedInPython extends Fragment {


    public ObjectOrientedInPython() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_object_oriented_in_python, container, false);

        WebView webView = view.findViewById(R.id.object_oriented_in_python);
        webView.loadUrl("file:///android_asset/Python--oo.html");

        return view;
    }

}
