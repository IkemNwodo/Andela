package com.ikem.nwodo.andela.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikem.nwodo.andela.DetailActivity;
import com.ikem.nwodo.andela.R;

import java.util.ArrayList;

public class PythonAdapter extends RecyclerView.Adapter<PythonAdapter.AppViewHolder> {

    private ArrayList<String> titles;
    private Context context;

    private int labelCount = 1;

    public PythonAdapter(ArrayList<String> titleNames, Context context){
        titles = titleNames;
        this.context = context;
    }

    @NonNull
    @Override
    public PythonAdapter.AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.and_card, parent, false);
        return new PythonAdapter.AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PythonAdapter.AppViewHolder holder, int position) {
        holder.label_number.setText(String.valueOf(labelCount++));
        holder.title.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class AppViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView label_number;
        ImageView title_number;

        public AppViewHolder(View itemView) {
            super(itemView);
            title_number = itemView.findViewById(R.id.title_number);
            title = itemView.findViewById(R.id.title_andela);
            label_number = itemView.findViewById(R.id.label_numbering);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Bundle extras = new Bundle();
            extras.putInt("titlePosition", getAdapterPosition());
            extras.putInt("tabNumber", 2);

            Intent intent = new Intent(context.getApplicationContext(), DetailActivity.class);
            intent.putExtra("bundle", extras);
            context.startActivity(intent);
        }
    }
}
