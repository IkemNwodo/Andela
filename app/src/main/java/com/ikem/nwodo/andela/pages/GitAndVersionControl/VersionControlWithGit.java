package com.ikem.nwodo.andela.pages.GitAndVersionControl;


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
public class VersionControlWithGit extends Fragment {


    public VersionControlWithGit() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_version_control_with_git, container, false);

        WebView webView = view.findViewById(R.id.version_control_with_git);
        webView.loadUrl("file:///android_asset/Version Control With Git.html");

        return view;
    }

}
