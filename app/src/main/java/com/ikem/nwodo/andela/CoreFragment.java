package com.ikem.nwodo.andela;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ikem.nwodo.andela.adapters.CoreAdapter;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoreFragment extends Fragment implements CoreAdapter.ItemClickListener {


    public CoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_core, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Get string-array
        String[] titleNames = getResources().getStringArray(R.array.core_titles);

        ArrayList<String> titleName = new ArrayList<>(Arrays.asList(titleNames));
        CoreAdapter adapter = new CoreAdapter(titleName, this);
        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void onItemClickListener(int adapterPosition) {
        Bundle extras = new Bundle();
        extras.putInt("titlePosition", adapterPosition);
        extras.putInt("tabNumber", 0);


        Intent intent = new Intent(getContext(), DetailActivity.class);
        intent.putExtra("bundle", extras);

        startActivity(intent);
    }
}
