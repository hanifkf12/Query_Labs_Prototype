package com.hanifkf.query_labs_prototype.view;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.adapter.NotifikasiAdapter;
import com.hanifkf.query_labs_prototype.model.Notifikasi;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotifikasiFragment extends Fragment {

    private NotifikasiAdapter adapter;
    private ArrayList<Notifikasi> listNotif;
    public NotifikasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifikasi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rcNotif = view.findViewById(R.id.rc_notif);
        listNotif = new ArrayList<>();
        listNotif.add(new Notifikasi(R.drawable.johndoe,"John Doe","Menjadi Teman Anda","4 Jam yang Lalu"));
        listNotif.add(new Notifikasi(R.drawable.pic2,"Mark Harry","Menjadi Teman Anda","8 Jam yang Lalu"));
        listNotif.add(new Notifikasi(R.drawable.pic3,"George Moss","Menjadi Teman Anda","12 Jam yang Lalu"));
        listNotif.add(new Notifikasi(R.drawable.pic4,"Anna Jones","Menjawab Pertanyaan Anda","16 Jam yang Lalu"));
        adapter = new NotifikasiAdapter(getContext(),listNotif, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(getActivity(),listNotif.get(position).getNama(),Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayoutManager linearLayout = new LinearLayoutManager(getActivity());
        rcNotif.setLayoutManager(linearLayout);
        rcNotif.setAdapter(adapter);
    }
}
