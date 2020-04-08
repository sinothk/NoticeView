package com.sinothk.widgets.noticeView.marqueeListView.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sinothk.widgets.noticeView.R;
import com.sinothk.widgets.noticeView.marqueeListView.bean.MarqueeListEntity;

import java.util.ArrayList;

public class MarqueeListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<MarqueeListEntity> listData;

    public MarqueeListViewAdapter(Context context, ArrayList<MarqueeListEntity> listData) {
        mContext = context;
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return this.listData == null ? 0 : this.listData.size();
    }

    @Override
    public MarqueeListEntity getItem(int position) {
        return this.listData == null ? null : this.listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.marquee_list_view_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        MarqueeListEntity entity = this.listData.get(position);

        holder.itemNameTv.setText(entity.getName());
        if (!TextUtils.isEmpty(entity.getDate())) {
            holder.itemTimeTv.setText(entity.getDate());
            holder.itemTimeTv.setVisibility(View.VISIBLE);
        } else {
            holder.itemTimeTv.setVisibility(View.GONE);
        }

        if (entity.getIconRes() != 0) {
            holder.itemIconTv.setImageResource(entity.getIconRes());
            holder.itemIconTv.setVisibility(View.VISIBLE);
        } else {
            holder.itemIconTv.setVisibility(View.GONE);
        }

        return convertView;
    }

    static class ViewHolder {

        TextView itemNameTv, itemTimeTv;
        ImageView itemIconTv;

        ViewHolder(View view) {
            itemIconTv = view.findViewById(R.id.itemIconTv);
            itemNameTv = view.findViewById(R.id.itemNameTv);
            itemTimeTv = view.findViewById(R.id.itemTimeTv);
        }
    }
}
