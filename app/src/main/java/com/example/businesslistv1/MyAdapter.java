package com.example.businesslistv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String data1[];
    Context ctx;

    public MyAdapter(Context ct, String s1[]) {
        ctx = ct;
        data1 = s1;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myView = myInflater.inflate(R.layout.item_view, parent, false);

        return new MyHolder(myView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.t1.setText(data1[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView t1;

        public MyHolder(View itemView) {
            super(itemView);

            t1 = (TextView) itemView.findViewById(R.id.text_view);
        }
    }
}
