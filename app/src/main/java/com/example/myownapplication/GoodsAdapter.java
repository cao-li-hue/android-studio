package com.example.myownapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GoodsAdapter extends BaseAdapter {
    private Context context;
    private List<Goods> datas;
    public GoodsAdapter(Context context, List<Goods> datas){
        this.context = context;
        this.datas = datas;
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView ==null){
            convertView = View.inflate(context,R.layout.item_list,null);
            holder = new ViewHolder();
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvPrice = convertView.findViewById(R.id.tv_price);
            holder.ivPic = convertView.findViewById(R.id.iv_pic);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Goods good = datas.get(position);
        holder.tvTitle.setText(good.getTitle());
        holder.tvPrice.setText(good.getPrice());
        holder.ivPic.setBackgroundResource(good.getIcon());
        return convertView;
    }
    static class ViewHolder{
        TextView tvTitle;
        TextView tvPrice;
        ImageView ivPic;
    }
}
