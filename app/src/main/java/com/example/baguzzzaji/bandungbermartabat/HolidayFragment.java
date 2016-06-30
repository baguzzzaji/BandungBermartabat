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
        holidays.add(new Place(getActivity().getString(R.string.tangkubanperahu_header), getActivity().getString(R.string.tangkubanperahu_info), R.drawable.wisata_tangkuban));
        holidays.add(new Place(getActivity().getString(R.string.situpatenggang_header), getActivity().getString(R.string.situpatenggang_info), R.drawable.wisata_situpatenggang));
        holidays.add(new Place(getActivity().getString(R.string.museumgeologi_header), getActivity().getString(R.string.museumgeologi_info), R.drawable.wisata_museumgeologi));
        holidays.add(new Place(getActivity().getString(R.string.ciwidey_header), getActivity().getString(R.string.ciwidey_info), R.drawable.wisata_ciwidey));
        holidays.add(new Place(getActivity().getString(R.string.dago_header), getActivity().getString(R.string.dago_info), R.drawable.wisata_curugdago));

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
