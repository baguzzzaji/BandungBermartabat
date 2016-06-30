package com.example.baguzzzaji.bandungbermartabat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HolidayFragment extends Fragment {


    public HolidayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> holidays = new ArrayList<>();
        holidays.add(new Place("Tangkuban Perahu", "Very famous mountain with beautiful legend. Must visit place if you spent holiday in Bandung.", R.drawable.wisata_tangkuban));
        holidays.add(new Place("Situ Patenggang", "This beautiful lake is enormous. You could get beautiful sunrise here.", R.drawable.wisata_situpatenggang));
        holidays.add(new Place("Museum Geologi", "He you could find a mammoth fossil, earthquake simulator, history on origin of Bandung, etc..", R.drawable.wisata_museumgeologi));
        holidays.add(new Place("Ciwidey", "This place is so touching if you visit with your beloved. Remember, don't come alone!", R.drawable.wisata_ciwidey));
        holidays.add(new Place("Dago Waterfall", "It's not as big as Niagara Waterfall, but it's unique. It's uniqueness comes from the place where it place. If you think waterfall are placed so far away from the city, you would surprised when visiting this waterfall.", R.drawable.wisata_curugdago));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), holidays);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
