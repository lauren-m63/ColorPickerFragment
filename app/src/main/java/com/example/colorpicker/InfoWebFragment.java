package com.example.colorpicker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

public class InfoWebFragment extends Fragment {

    ListView listView;

    public InfoWebFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentRoot= inflater.inflate(R.layout.fragment_list, container, false);

        // CHANGE INPUT FRAG TO MATCH ??
        listView  = fragmentRoot.findViewById(R.id.web_listView);
        String baseLink = "https://seekingalpha.com/symbol/";
        LinkedList<Web> links = new LinkedList<>();
        links.add(new Web("NEE", "https://seekingalpha.com/symbol/NEE"));
        links.add(new Web("AAPL", "https://seekingalpha.com/symbol/AAPL"));
        links.add(new Web("DIS", "https://seekingalpha.com/symbol/DIS"));

        ArrayAdapter<Web> adapter = new ArrayAdapter<Web>(getActivity(), android.R.layout.simple_list_item_1, links);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Web selected = links.get(position);
            WebFragment webFragment = WebFragment.newInstance(selected.url);

            // Use the container instead of a static fragment ID
//            getParentFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.web_fragment_container, webFragment)
//                    .addToBackStack(null)
//                    .commit();
        });


        return fragmentRoot;
    }
}