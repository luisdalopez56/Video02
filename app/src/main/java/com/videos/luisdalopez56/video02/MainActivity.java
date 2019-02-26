package com.videos.luisdalopez56.video02;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView reproductorCuadro;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reproductorCuadro = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        //reproductor.setVideoPath("/mnt/sdcard1/VIDEO.mp4");
        mediaController.setAnchorView(reproductorCuadro);
        reproductorCuadro.setMediaController(mediaController);
        //reproductorCuadro.setVideoURI(Uri.parse("rtsp://r1---sn-4g5e6nss.googlevideo.com/Cj0LENy73wIaNAn6U4qnvFmeyRMYDSANFC3bMXVcMOCoAUIASARg0OW9sJX7gt9bigELdlZxWWpYNTExaXMM/A522D90B65AA1D3931A114AE2187CE6D92645E3A.D8137220020C062EFBB26AB1190F3FA3EA35495F/yt6/1/video.3gp"));
        reproductorCuadro.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        reproductorCuadro.requestFocus();
        reproductorCuadro.start();
    }
}
