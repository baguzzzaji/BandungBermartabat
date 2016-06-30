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
public class UniversityFragment extends Fragment {


    public UniversityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> universities = new ArrayList<>();
        universities.add(new Place(getActivity().getString(R.string.itb_header), getActivity().getString(R.string.itb_info), R.drawable.kampus_itb));
        universities.add(new Place(getActivity().getString(R.string.upi_header), getActivity().getString(R.string.upi_info), R.drawable.kampus_upi));
        universities.add(new Place(getActivity().getString(R.string.unpad_header), getActivity().getString(R.string.unpad_info), R.drawable.kampus_unpad));
        universities.add(new Place(getActivity().getString(R.string.polban_header), getActivity().getString(R.string.polban_info), R.drawable.kampus_polban));
        universities.add(new Place(getActivity().getString(R.string.telkom_header), getActivity().getString(R.string.telkom_info), R.drawable.kampus_telkom));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), universities);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
