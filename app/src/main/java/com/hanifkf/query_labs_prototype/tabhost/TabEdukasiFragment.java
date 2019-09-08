package com.hanifkf.query_labs_prototype.tabhost;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.WebViewActivity;
import com.hanifkf.query_labs_prototype.adapter.BeritaAdapter;
import com.hanifkf.query_labs_prototype.adapter.EdukasiAdapter;
import com.hanifkf.query_labs_prototype.model.Berita;
import com.hanifkf.query_labs_prototype.model.Edukasi;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView mList = view.findViewById(R.id.recycler_edukasi);
        List<Edukasi> edukasiArrayList = new ArrayList<>();
        edukasiArrayList.add(new Edukasi("SKP", "Ikuti Modul SKP Pembelajaran Profesi disini", R.drawable.ic_book_black_24dp));
        edukasiArrayList.add(new Edukasi("Informasi Obat (A-Z)", "Cari Informasi lengkap mengenai sebuah produk obat", R.drawable.ic_healing_black_24dp));
        edukasiArrayList.add(new Edukasi("Laporkan Efek Samping", "Lapor efek samping obat langsung ke Pusat Informasi Obat Nasional", R.drawable.ic_report_black_24dp));
        EdukasiAdapter edukasiAdapter = new EdukasiAdapter(edukasiArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                if(position == 2){
                    Intent intent = new Intent(getContext(), WebViewActivity.class);
                    startActivity(intent);
                }
            }
        });
        mList.setLayoutManager(new LinearLayoutManager(getContext()));
        mList.setHasFixedSize(true);
        mList.setAdapter(edukasiAdapter);
    }
}
