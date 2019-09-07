package com.hanifkf.query_labs_prototype.adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.model.Notifikasi;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotifikasiAdapter extends RecyclerView.Adapter<NotifikasiAdapter.NotifikasiViewHolder> {
    private ArrayList<Notifikasi> notifikasi;
    private CustomItemClickListener listener;
    private Context context;
    public NotifikasiAdapter(Context context,ArrayList<Notifikasi> notifikasi,CustomItemClickListener listener){
        this.notifikasi = notifikasi;
        this.listener = listener;
        this.context= context;
    }

    @NonNull
    @Override
    public NotifikasiAdapter.NotifikasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_notifikasi, parent, false);
        final NotifikasiViewHolder mholder=new NotifikasiViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view,mholder.getLayoutPosition());
            }
        });
        return mholder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotifikasiAdapter.NotifikasiViewHolder holder, int position) {
        holder.setData(notifikasi.get(position));
    }

    @Override
    public int getItemCount() {
        return notifikasi.size();
    }

    public class NotifikasiViewHolder extends RecyclerView.ViewHolder {
        CircleImageView userImage;
        TextView tvName;
        TextView tvContent;
        TextView tvWaktu;

        public NotifikasiViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.profil_foto_notif);
            tvName = itemView.findViewById(R.id.name_notif);
            tvContent = itemView.findViewById(R.id.content_notif);
            tvWaktu = itemView.findViewById(R.id.time_notif);
        }
        public void setData(Notifikasi notifikasi){
            userImage.setImageResource(notifikasi.getFoto());
            Glide.with(context).load(notifikasi.getFoto()).into(userImage);
            tvName.setText(notifikasi.getNama());
            tvContent.setText(notifikasi.getContent());
            tvWaktu.setText(notifikasi.getWaktu());
        }
    }
}
