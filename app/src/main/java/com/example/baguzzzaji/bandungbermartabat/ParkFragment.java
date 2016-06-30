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
        parks.add(new Place(getActivity().getString(R.string.tamanfilm_header), getActivity().getString(R.string.tamanfilm_info), R.drawable.taman_film));
        parks.add(new Place(getActivity().getString(R.string.tamanvanda_header), getActivity().getString(R.string.tamanvanda_info), R.drawable.taman_vanda));
        parks.add(new Place(getActivity().getString(R.string.tamanmusik_header), getActivity().getString(R.string.tamanmusik_info), R.drawable.taman_musik));
        parks.add(new Place(getActivity().getString(R.string.tamanfoto_header), getActivity().getString(R.string.tamanfoto_info), R.drawable.taman_foto));
        parks.add(new Place(getActivity().getString(R.string.tamanlansia_header), getActivity().getString(R.string.tamanlansia_info), R.drawable.taman_lansia));

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
