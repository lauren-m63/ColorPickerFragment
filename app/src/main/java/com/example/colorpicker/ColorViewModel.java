package com.example.colorpicker;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;// piece of data that exists in activity that you can reference from fragment

import java.util.LinkedList;

public class ColorViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> colorsLL;


    public ColorViewModel() {
        colorsLL = new MutableLiveData<>();
    }

    public void setColorsLL(LinkedList<String> l){
        colorsLL.setValue(l);
    }

    public  LinkedList<String> getColors(){
        return colorsLL.getValue();
    }

    public void addColor(String c){
        LinkedList<String> l = getColors();
        l.add(c);
        colorsLL.setValue(l);
    }

} // last bracket
