package com.ikem.nwodo.andela.pages.WinningWithPeople;


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
public class OverviewWinningWithPeople extends Fragment {


    public OverviewWinningWithPeople() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview_winning_with_people, container, false);

        WebView webView = view.findViewById(R.id.overview_winning_with_people);
        webView.loadUrl("file:///android_asset/Overview Winning.html");

        return view;

    }

}
