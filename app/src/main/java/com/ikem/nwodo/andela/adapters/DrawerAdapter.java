package com.ikem.nwodo.andela.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikem.nwodo.andela.R;

import java.util.ArrayList;

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.DrawerViewHolder> {

    private ArrayList<String> items;
    private ItemClickListener listener;
    private static int previouslyClickedPosition = -1;

    static ColorStateList defaultTextColor = null;

    private View view;
    private Context context;

    public DrawerAdapter(ArrayList<String> items, ItemClickListener listener) {
        this.items = items;
        this.listener = listener;

        setHasStableIds(false);
    }

    @NonNull
    @Override
    public DrawerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.drawer_card, parent, false);
        return new DrawerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DrawerViewHolder holder, int position) {
        // Get default text color
        if (defaultTextColor == null){
            defaultTextColor = holder.card.getTextColors();
        }



        // Fill in your logic for binding the view.
        holder.card.setText(items.get(position));
        holder.card.setTextColor(Color.GRAY);
        holder.drawer_icon.setImageDrawable(context.getResources().getDrawable(R.drawable.drawer_icon_drawable));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class DrawerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView drawer_icon;
        TextView card;

        DrawerViewHolder(View itemView) {
            super(itemView);
            drawer_icon = itemView.findViewById(R.id.drawer_icon);
            card = itemView.findViewById(R.id.card);

            view = itemView;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int currentPosition = getAdapterPosition();
            if (previouslyClickedPosition >= 0){
                notifyItemChanged(previouslyClickedPosition);
            }
            previouslyClickedPosition = currentPosition;
            card.setTextColor(context.getResources().getColor(R.color.colorBlack));
            drawer_icon.setImageDrawable(context.getResources().getDrawable(R.drawable.drawer_done));

            listener.onItemClickListener(getAdapterPosition());
        }
    }

    public interface ItemClickListener{
        void onItemClickListener(int adapterPosition);
    }
}