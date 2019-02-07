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
public class SpeakingToBeUnderstood extends Fragment {


    public SpeakingToBeUnderstood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_speaking_to_be_understood, container, false);

        WebView webView = view.findViewById(R.id.speaking_to_be_understood);
        webView.loadUrl("file:///android_asset/Speaking to be understood.html");

        return view;
    }

}
