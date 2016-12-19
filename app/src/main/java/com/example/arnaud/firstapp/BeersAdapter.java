package com.example.arnaud.firstapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Inflater;

import static java.lang.System.out;

/**
 * Created by Arnaud on 15/11/2016.
 */

class BeersAdapter extends RecyclerView.Adapter<BeersAdapter.BeerHolder> {

    private JSONArray bieres;
    private Context context;
//    static public GetInfo gi;
//    private boolean first = true;

    class BeerHolder extends RecyclerView.ViewHolder {

        TextView name;

        BeerHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.rv_beer_element_name);
        }
    }

    BeersAdapter (JSONArray bieres, Context context) {
        this.bieres = bieres;
        this.context = context;
//        gi = new GetInfo(bieres);
    }

    @Override
    public BeerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new BeerHolder(inflater.inflate(R.layout.rv_beer_element, null));
    }

    @Override
    public void onBindViewHolder(BeerHolder holder, int position) {
        try {
            JSONObject biere = this.bieres.getJSONObject(position);
            String s = "";
            Log.d("tag", MainActivity2.heroIndex);
            if (biere.getString("id").equals(MainActivity2.heroIndex)) {
                s = biere.getString("name") + "\n\n" + biere.getString("description");
                holder.name.setText(s);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return this.bieres.length();
    }

    public void setNewBeer(JSONArray beers) {
        this.bieres = beers;
        notifyDataSetChanged();
    }
}