package com.hanifkf.query_labs_prototype.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.model.Berita;
import com.hanifkf.query_labs_prototype.model.Edukasi;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class EdukasiAdapter extends RecyclerView.Adapter<EdukasiAdapter.EdukasiViewHolder> {

    private List<Edukasi> edukasi;
    private CustomItemClickListener listener;

    public EdukasiAdapter(List<Edukasi> edukasi, CustomItemClickListener listener) {
        this.edukasi = edukasi;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EdukasiAdapter.EdukasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_edukasi, parent, false);
        final EdukasiAdapter.EdukasiViewHolder mholder = new EdukasiAdapter.EdukasiViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view,mholder.getLayoutPosition());
            }
        });
        return mholder;
    }

    @Override
    public void onBindViewHolder(@NonNull EdukasiAdapter.EdukasiViewHolder holder, int position) {
        holder.title.setText(edukasi.get(position).getTitle());
        holder.description.setText(edukasi.get(position).getDescription());
        holder.image.setImageResource(edukasi.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (edukasi != null) ? edukasi.size() : 0;
    }

    class EdukasiViewHolder extends RecyclerView.ViewHolder {

        TextView title, description;
        ImageView image;

        EdukasiViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_edukasi);
            description = itemView.findViewById(R.id.desc_edukasi);
            image = itemView.findViewById(R.id.image_edukasi);
        }

    }

}
