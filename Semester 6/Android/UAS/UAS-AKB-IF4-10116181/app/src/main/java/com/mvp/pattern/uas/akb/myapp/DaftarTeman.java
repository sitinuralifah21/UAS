/*
16/08/2019
Siti Nur Alifah
10116181
IF4*/
package com.mvp.pattern.uas.akb.myapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class DaftarTeman extends Fragment {

    public DaftarTeman(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.daftarteman, container, false);

        getActivity().setTitle("Slideshow");

        return view;
    }
}
