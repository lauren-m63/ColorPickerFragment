package com.example.colorpicker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.w3c.dom.Text;

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
        View fragmentRoot= inflater.inflate(R.layout.fragment_info_web, container, false);

        // CHANGE INPUT FRAG TO MATCH ??
        listView  = getActivity().findViewById(R.id.inputFragment);
        String baseLink = "https://seekingalpha.com/symbol/NEE";
        LinkedList<Web> links = new LinkedList<>();
        links.add(new Web("https://seekingalpha.com/symbol/NEE"));
        links.add(new Web("https://seekingalpha.com/symbol/AAPL"));
        links.add(new Web("https://seekingalpha.com/symbol/DIS"));

        ArrayAdapter<Web> adapter = new ArrayAdapter<Web>(getActivity(), android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        return fragmentRoot;
    }
}