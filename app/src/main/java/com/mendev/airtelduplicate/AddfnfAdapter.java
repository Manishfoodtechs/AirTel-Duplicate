package com.mendev.airtelduplicate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by Megi Fernanda on 01-Nov-17.
 */

public class AddfnfAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    public AddfnfAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_addfriendfamily, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        public ViewHolder(View view) {
            super(view);


        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
