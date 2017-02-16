package com.austinzeller.tourguider;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class AttractionAdapter extends BaseAdapter {
    private ArrayList<Attraction> mAttractions;
    private static LayoutInflater mInflater = null;

    AttractionAdapter(Activity activity, ArrayList<Attraction> attractions) {
        mAttractions = attractions;
        mInflater = (LayoutInflater ) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mAttractions.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(convertView==null) {
            view = mInflater.inflate(R.layout.list_item, null);
        }

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(mAttractions.get(position).getName());

        TextView address = (TextView) view.findViewById(R.id.address);
        address.setText(mAttractions.get(position).getAddress());

        TextView description = (TextView) view.findViewById(R.id.description);
        description.setText(mAttractions.get(position).getDescription());

        ImageView image = (ImageView) view.findViewById(R.id.image);
        image.setImageResource(mAttractions.get(position).getImageResourceId());

        return view;
    }
}
