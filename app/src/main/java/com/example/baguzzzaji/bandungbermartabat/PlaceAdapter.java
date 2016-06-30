package com.example.baguzzzaji.bandungbermartabat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by baguzzzaji on 6/30/16.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    ArrayList listPlaces;

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listPlaceView = convertView;

        if (listPlaceView == null) {
            listPlaceView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place, parent, false
            );
        }

        Place currentPlace = getItem(position);

        TextView placeName = (TextView) listPlaceView.findViewById(R.id.place_name);
        TextView placeInfo = (TextView) listPlaceView.findViewById(R.id.place_info);

        placeName.setText(currentPlace.getPlaceName());
        placeInfo.setText(currentPlace.getPlaceInfo());

        ImageView imageView = (ImageView) listPlaceView.findViewById(R.id.place_img);

        imageView.setImageResource(currentPlace.getPlaceImg());

        return listPlaceView;
    }
}
