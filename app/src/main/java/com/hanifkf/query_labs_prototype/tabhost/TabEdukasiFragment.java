package com.hanifkf.query_labs_prototype.tabhost;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanifkf.query_labs_prototype.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabEdukasiFragment extends Fragment {


    public TabEdukasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_edukasi, container, false);
    }

}
