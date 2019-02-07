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
public class TDDInPython extends Fragment {


    public TDDInPython() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tddin_python, container, false);

        WebView webView = view.findViewById(R.id.tddin_python);
        webView.loadUrl("file:///android_asset/TDD-PY.html");

        return view;
    }

}
