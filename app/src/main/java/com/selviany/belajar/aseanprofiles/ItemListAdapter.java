package com.selviany.belajar.aseanprofiles;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder>{

    private Context context;
    private ArrayList<Asean> listAsean;

    public ItemListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Asean> getListAsean() {
        return listAsean;
    }

    public void setListAsean(ArrayList<Asean> listAsean) {
        this.listAsean = listAsean;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemList = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ListViewHolder holder, final int position) {
        final Asean asean = listAsean.get(position);
        Glide.with(holder.itemView.getContext())
                .load(asean.getImages())
                .apply(new RequestOptions()).override(80,60)
                .into(holder.imgList);
        holder.tvCountry.setText(asean.getCountry());
        holder.tvDate.setText(asean.getDate());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_ASEAN, listAsean.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListAsean().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvCountry, tvDate;
        ImageView imgList;
        RelativeLayout relativeLayout;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountry = itemView.findViewById(R.id.tv_country_list);
            tvDate = itemView.findViewById(R.id.tv_date_list);
            imgList = itemView.findViewById(R.id.img_list);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}
