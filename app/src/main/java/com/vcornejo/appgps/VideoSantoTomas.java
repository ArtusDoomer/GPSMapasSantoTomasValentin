package com.vcornejo.appgps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


import com.google.android.gms.maps.SupportMapFragment;

public class VideoSantoTomas extends AppCompatActivity {

    VideoView vview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_santo_tomas);

        vview1 = findViewById(R.id.videoView1);
        String ustemuco = "android.resource//"+getPackageName()+"/"+R.raw.santotomas_temuco;
        Uri uri = Uri.parse(ustemuco);
        vview1.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        vview1.setMediaController(mediaController);
        mediaController.setAnchorView(vview1);
    }
}