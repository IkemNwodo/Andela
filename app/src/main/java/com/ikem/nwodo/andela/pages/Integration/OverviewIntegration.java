package com.ikem.nwodo.andela.pages.Integration;


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
public class OverviewIntegration extends Fragment {


    public OverviewIntegration() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview_integration, container, false);

        WebView webView = view.findViewById(R.id.overview_integration);
        webView.loadUrl("file:///android_asset/Overview Integration.html");

        return view;

    }

}
