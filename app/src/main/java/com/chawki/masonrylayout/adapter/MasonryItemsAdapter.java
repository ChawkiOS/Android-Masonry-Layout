package com.chawki.masonrylayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chawki.masonrylayout.R;
import com.chawki.masonrylayout.callback.OnItemClickListener;
import com.chawki.masonrylayout.model.MasonryItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Chawki on 12/14/2016.
 */

public class MasonryItemsAdapter extends RecyclerView.Adapter<MasonryItemsAdapter.MyViewHolder>  {

    private final static String TAG = MasonryItemsAdapter.class.getSimpleName();

    private Context context;
    private List<MasonryItem> itemsList;
    private final OnItemClickListener itemClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_title) TextView itemTitle;
        @BindView(R.id.item_image) ImageView itemImage;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public MasonryItemsAdapter(Context context, List<MasonryItem> itemsList, OnItemClickListener listener) {
        this.context = context;
        this.itemsList = itemsList;
        this.itemClickListener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.masonry_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        MasonryItem event = itemsList.get(position);
        bind(holder, event, itemClickListener);
    }

    public void bind(final MyViewHolder holder, final MasonryItem item, final OnItemClickListener listener) {

        holder.itemTitle.setText(item.getTitle());

        Glide.with(context)
                .load(item.getImage())
                .into(holder.itemImage);

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}
