package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.SurfaceControl;

public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    FragmentManager fg;
    ColorViewModel colorsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            fg= getSupportFragmentManager();
            FragmentTransaction trans = fg.beginTransaction();
            ColorPickFragment cf = new ColorPickFragment(); //object that you create needs to be of type of the fragment that you want to add
            trans.add(R.id.colorFragment, cf,"colorFrag");
            ColorListFragment cl = new ColorListFragment();
            trans.add(R.id.ListFragment, cl, "listFrag");
            trans.commit();
        }
    }

    @Override
    public void onMessageSend(String message) {

    }
}