package com.hanifkf.query_labs_prototype.view;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.hanifkf.query_labs_prototype.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScannerFragment extends Fragment {

    private static final int RC_PERMISSION = 10;
    private boolean mPermissionGranted;
    private CodeScanner mCodeScanner;

    public ScannerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scanner, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CodeScannerView scannerView = view.findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(getContext(), scannerView);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (getActivity().checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                mPermissionGranted = false;
                requestPermissions(new String[] {Manifest.permission.CAMERA}, RC_PERMISSION);
            } else {
                mPermissionGranted = true;
            }
        } else {
            mPermissionGranted = true;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mPermissionGranted){
            mCodeScanner.startPreview();
        }
    }
}
