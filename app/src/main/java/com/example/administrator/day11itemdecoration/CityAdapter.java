package com.example.administrator.day11itemdecoration;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2016/12/2.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.MyViewHolder>{

    private Context mContext;
    private List<CityBean> mDatas;
    private LayoutInflater mInflater;

    public CityAdapter(Context mContext, List<CityBean> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        mInflater=LayoutInflater.from(mContext);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_city, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final CityBean cityBean = mDatas.get(position);
        holder.tyCity.setText(cityBean.getCity());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "pos:"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tyCity;
        public MyViewHolder(View itemView) {
            super(itemView);
            tyCity= (TextView) itemView.findViewById(R.id.tyCity);
        }
    }
}
