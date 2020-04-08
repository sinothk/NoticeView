package com.sinothk.widgets.noticeView.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sinothk.widgets.noticeView.R;

import java.util.ArrayList;

public class MarqueeListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<String> listData;

    public MarqueeListViewAdapter(Context context, ArrayList<String> listData) {
        mContext = context;
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return this.listData == null ? 0 : this.listData.size();
    }

    @Override
    public String getItem(int position) {
        return this.listData == null ? "" : this.listData.get(position);
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

        holder.itemNameTv.setText(this.listData.get(position));

        return convertView;
    }

    static class ViewHolder {

        TextView itemNameTv;

        ViewHolder(View view) {
            itemNameTv = view.findViewById(R.id.itemNameTv);
        }
    }
}
