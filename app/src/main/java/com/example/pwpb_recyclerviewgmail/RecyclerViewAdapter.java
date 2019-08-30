package com.example.pwpb_recyclerviewgmail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Content> rvData;

    public RecyclerViewAdapter(List<Content> inputData) {
        this.rvData = inputData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle, tvclock, tvname, tvSubtitle;
        public ImageView img_set;

        public ViewHolder(View v) {
            super(v);
            tvname = v.findViewById(R.id.name);
            tvTitle = v.findViewById(R.id.tv_title);
            tvSubtitle = v.findViewById(R.id.tv_subtitle);
            tvclock = v.findViewById(R.id.clock);
            img_set = v.findViewById(R.id.img_samping);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Content Content = rvData.get(position);
        holder.tvTitle.setText(Content.getTitle());
        holder.tvSubtitle.setText(Content.getDescription());
        holder.tvname.setText(Content.getName());
        holder.tvclock.setText(Content.getClock());
        holder.img_set.setImageResource(Content.getImg());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
