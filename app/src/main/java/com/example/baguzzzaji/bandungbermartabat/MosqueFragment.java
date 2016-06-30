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
public class MosqueFragment extends Fragment {


    public MosqueFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> mosques = new ArrayList<>();
        mosques.add(new Place(getActivity().getString(R.string.alfurqon_header), getActivity().getString(R.string.alfurqon_info), R.drawable.masjid_alfurqon));
        mosques.add(new Place(getActivity().getString(R.string.salman_header), getActivity().getString(R.string.salman_info), R.drawable.masjid_salman));
        mosques.add(new Place(getActivity().getString(R.string.masjidraya_header), getActivity().getString(R.string.masjidraya_info), R.drawable.masjid_raya));
        mosques.add(new Place(getActivity().getString(R.string.pusdai_header), getActivity().getString(R.string.pusdai_info), R.drawable.masjid_pusdai));
        mosques.add(new Place(getActivity().getString(R.string.ciater_header), getActivity().getString(R.string.ciater_info), R.drawable.masjid_agungciater));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), mosques);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
