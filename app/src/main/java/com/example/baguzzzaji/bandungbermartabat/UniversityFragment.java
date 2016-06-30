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
        universities.add(new Place("Institut Teknologi Bandung", "This institute is the most prestigious in technical education. Famous with its Informatics Engineering Department.", R.drawable.kampus_itb));
        universities.add(new Place("Universitas Pendidikan Indonesia", "Leading and outstanding university in the field of education. Produce high quality teacher to bring better future.", R.drawable.kampus_upi));
        universities.add(new Place("Universitas Padjajaran", "Another prestigious university in Bandung. Unpad famous with it's social studies.", R.drawable.kampus_unpad));
        universities.add(new Place("Politeknik Negeri Bandung", "The state owned polytechnic is very famous among student who want to get job fast.", R.drawable.kampus_polban));
        universities.add(new Place("Telkom University", "Owned by the biggest Telecom Company in Indonesia.", R.drawable.kampus_telkom));

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
