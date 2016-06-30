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
        mosques.add(new Place("Al-Furqon UPI", "This is the official mosque for Universitas Pendidikan Indonesia. The biggest on campus mosque.", R.drawable.masjid_alfurqon));
        mosques.add(new Place("Salman ITB", "This is where the future engineer of Indonesia take a rest and pray to God in ITB.", R.drawable.masjid_salman));
        mosques.add(new Place("Masjid Raya", "This one is the biggest mosque in Bandung and one of Bandung's landmark.", R.drawable.masjid_raya));
        mosques.add(new Place("Masjid Pusdai", "This mosque is where the center of Islamic in Bandung takes place.", R.drawable.masjid_pusdai));
        mosques.add(new Place("Masjid Agung Ciater", "People who visited hot spring in Ciater would pray in this mosque.", R.drawable.masjid_agungciater));

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
