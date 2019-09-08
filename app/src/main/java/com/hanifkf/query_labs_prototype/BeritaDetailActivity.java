package com.hanifkf.query_labs_prototype;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class BeritaDetailActivity extends AppCompatActivity {

    CircleImageView pic;
    TextView name, time, title, like, comment, share;
    JustifiedTextView desc;
    ImageView banner;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_berita_detail);

        pic = findViewById(R.id.profile_news_detail);
        name = findViewById(R.id.username_news_detail);
        time = findViewById(R.id.timestamp_news_detail);
        banner = findViewById(R.id.image_news_detail);
        title = findViewById(R.id.title_news_detail);
        desc = findViewById(R.id.desc_news_detail);
        like = findViewById(R.id.like_news_detail);
        comment = findViewById(R.id.comment_news_detail);
        share = findViewById(R.id.share_news_detail);

        pic.setImageResource(getIntent().getIntExtra("pic", 0));
        name.setText(getIntent().getStringExtra("name"));
        time.setText(getIntent().getStringExtra("time"));
        banner.setImageResource(getIntent().getIntExtra("banner", 0));
        title.setText(getIntent().getStringExtra("title"));
        desc.setText(getIntent().getStringExtra("desc"));
        like.setText(getIntent().getStringExtra("like"));
        comment.setText(getIntent().getStringExtra("comment"));
        share.setText(getIntent().getStringExtra("share"));

    }

}
