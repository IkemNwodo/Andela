package com.ikem.nwodo.andela;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ikem.nwodo.andela.adapters.JavaScriptAdapter;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class JavaScriptFragment extends Fragment {


    public JavaScriptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.javascript_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Get string-array
        String[] titleNames = getResources().getStringArray(R.array.javascript_and_python_titles);

        ArrayList<String> titleName = new ArrayList<>(Arrays.asList(titleNames));
        JavaScriptAdapter adapter = new JavaScriptAdapter(titleName, getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
