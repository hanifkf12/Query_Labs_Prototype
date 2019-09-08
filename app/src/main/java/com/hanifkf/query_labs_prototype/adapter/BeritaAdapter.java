package com.hanifkf.query_labs_prototype.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;
import com.hanifkf.query_labs_prototype.R;
import com.hanifkf.query_labs_prototype.model.Berita;
import com.hanifkf.query_labs_prototype.utils.CustomItemClickListener;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder> {

    private List<Berita> berita;
    private CustomItemClickListener listener;

    public BeritaAdapter(List<Berita> berita, CustomItemClickListener listener) {
        this.berita = berita;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BeritaAdapter.BeritaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_berita, parent, false);
        final BeritaAdapter.BeritaViewHolder mholder = new BeritaAdapter.BeritaViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view,mholder.getLayoutPosition());
            }
        });
        return mholder;
    }

    @Override
    public void onBindViewHolder(@NonNull BeritaAdapter.BeritaViewHolder holder, int position) {
        holder.profile.setImageResource(berita.get(position).getProfilePic());
        holder.username.setText(berita.get(position).getUsername());
        holder.timestamp.setText(berita.get(position).getTimeStamp());
        holder.banner.setImageResource(berita.get(position).getImageBanner());
        holder.title.setText(berita.get(position).getTitle());
        holder.desc.setText(berita.get(position).getDesc());
        holder.countLike.setText(berita.get(position).getCountLikes());
        holder.countComment.setText(berita.get(position).getCountComment());
        holder.countShare.setText(berita.get(position).getCountShare());
    }

    @Override
    public int getItemCount() {
        return (berita != null) ? berita.size() : 0;
    }

    class BeritaViewHolder extends RecyclerView.ViewHolder {

        TextView username, timestamp, title, countLike, countComment, countShare;
        JustifiedTextView desc;
        CircleImageView profile;
        ImageView banner;

        BeritaViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username_news);
            timestamp = itemView.findViewById(R.id.timestamp_news);
            title = itemView.findViewById(R.id.title_news);
            desc = itemView.findViewById(R.id.desc_news);
            countLike = itemView.findViewById(R.id.like_news);
            countComment = itemView.findViewById(R.id.comment_news);
            countShare = itemView.findViewById(R.id.share_news);
            profile = itemView.findViewById(R.id.profile_news);
            banner = itemView.findViewById(R.id.image_news);
        }
    }

}
