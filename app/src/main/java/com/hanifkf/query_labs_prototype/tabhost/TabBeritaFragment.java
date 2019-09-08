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

import com.hanifkf.query_labs_prototype.BeritaDetailActivity;
import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.adapter.BeritaAdapter;
import com.hanifkf.query_labs_prototype.model.Berita;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabBeritaFragment extends Fragment {

    public TabBeritaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_berita, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView mList = view.findViewById(R.id.recycler_news);
        final List<Berita> beritaArrayList = new ArrayList<>();
        beritaArrayList.add(new Berita(R.drawable.pic2, "Mark Harry", "2 Jam yang Lalu", R.color.colorGrey, "Lorem ipsum", "Lorem ipsum", "2 suka", "1 Komentar", "0 Bagikan"));
        beritaArrayList.add(new Berita(R.drawable.pic3, "George Moss", "12 Jam yang Lalu", R.color.colorGrey, "Lorem ipsum", "Lorem ipsum", "7 suka", "0 Komentar", "12 Bagikan"));
        beritaArrayList.add(new Berita(R.drawable.pic4, "Anna Jones", "23 Jam yang Lalu", R.color.colorGrey, "Lorem ipsum", "Lorem ipsum", "14 suka", "0 Komentar", "36 Bagikan"));
        BeritaAdapter beritaAdapter = new BeritaAdapter(beritaArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(getContext(), BeritaDetailActivity.class);
                intent.putExtra("pic", beritaArrayList.get(position).getProfilePic());
                intent.putExtra("name", beritaArrayList.get(position).getUsername());
                intent.putExtra("time", beritaArrayList.get(position).getTimeStamp());
                intent.putExtra("banner", beritaArrayList.get(position).getImageBanner());
                intent.putExtra("title", beritaArrayList.get(position).getTitle());
                intent.putExtra("desc", beritaArrayList.get(position).getDesc());
                intent.putExtra("like", beritaArrayList.get(position).getCountLikes());
                intent.putExtra("comment", beritaArrayList.get(position).getCountComment());
                intent.putExtra("share", beritaArrayList.get(position).getCountShare());
                startActivity(intent);
            }
        });
        mList.setLayoutManager(new LinearLayoutManager(getContext()));
        mList.setHasFixedSize(true);
        mList.setAdapter(beritaAdapter);
    }
}
