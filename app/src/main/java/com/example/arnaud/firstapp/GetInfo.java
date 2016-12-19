package com.example.arnaud.firstapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Arnaud on 19/12/2016.
 */

public class GetInfo {

    public ArrayList<String> id;
    public ArrayList<String> name;
    public ArrayList<String> desc;
    public ArrayList<String> health;
    public ArrayList<String> armour;
    public ArrayList<String> shield;
    public ArrayList<String> realName;
    public ArrayList<String> age;
    public ArrayList<String> height;
    public ArrayList<String> affiliation;
    public ArrayList<String> baseOfOp;
    public ArrayList<String> diff;

    private void shunt(JSONObject jo) {
        try {
            id.add(jo.getString("id"));
            name.add(jo.getString("name"));
            desc.add(jo.getString("description"));
            health.add(jo.getString("health"));
            armour.add(jo.getString("armour"));
            shield.add(jo.getString("shield"));
            realName.add(jo.getString("real_name"));
            age.add(jo.getString("age"));
            height.add(jo.getString("height"));
            affiliation.add(jo.getString("affiliation"));
            baseOfOp.add(jo.getString("base_of_operations"));
            diff.add(jo.getString("difficulty"));
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public GetInfo(JSONArray OWHA) {

        this.id = new ArrayList<String>();
        this.name = new ArrayList<String>();
        this.desc = new ArrayList<String>();
        this.health = new ArrayList<String>();
        this.armour = new ArrayList<String>();
        this.shield = new ArrayList<String>();
        this.realName = new ArrayList<String>();
        this.age = new ArrayList<String>();
        this.height = new ArrayList<String>();
        this.affiliation = new ArrayList<String>();
        this.baseOfOp = new ArrayList<String>();
        this.diff = new ArrayList<String>();

        try {
            for (int index = 0; index < OWHA.length(); index++) {
                shunt(OWHA.getJSONObject(index));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
