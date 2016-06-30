package com.example.baguzzzaji.bandungbermartabat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> parks = new ArrayList<>();
        parks.add(new Place("Taman Film", "This park is built for Bandung citizen so they could watch movies together.", R.drawable.taman_film));
        parks.add(new Place("Taman Vanda", "This park is built near the Bank Indonesia, the national bank of Indonesia which have beautiful water.", R.drawable.taman_vanda));
        parks.add(new Place("Taman Musik", "This park is built to accomodate musician that looking for place to find inspiration.", R.drawable.taman_musik));
        parks.add(new Place("Taman Foto", "This park is built to help people of Bandung to learn photography.", R.drawable.taman_foto));
        parks.add(new Place("Taman Lansia", "This park is built for elder so they have a place to hangout safely", R.drawable.taman_lansia));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), parks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
