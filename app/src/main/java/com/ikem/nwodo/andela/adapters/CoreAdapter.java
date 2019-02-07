package com.ikem.nwodo.andela.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikem.nwodo.andela.R;

import java.util.ArrayList;

public class CoreAdapter extends RecyclerView.Adapter<CoreAdapter.AppViewHolder> {

    private ArrayList<String> titles;

    private Context mContext;
    private ItemClickListener listener;
    private int labelCount = 1;

    public CoreAdapter(ArrayList<String> titleNames, ItemClickListener listener) {
        titles = titleNames;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CoreAdapter.AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.and_card, parent, false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoreAdapter.AppViewHolder holder, int position) {
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
            listener.onItemClickListener(getAdapterPosition());
        }
    }

    public interface ItemClickListener {
        void onItemClickListener(int adapterPosition);
    }

}
