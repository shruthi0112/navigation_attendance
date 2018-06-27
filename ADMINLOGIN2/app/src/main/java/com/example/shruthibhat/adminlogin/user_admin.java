package com.example.shruthibhat.adminlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Calendar;

public class user_admin extends AppCompatActivity {
    //VideoView vdo;

    Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_admin);

        Button btn=(Button)findViewById(R.id.btnnext);
       /* VideoView vdo=(VideoView) findViewById(R.id.Video_view);
        String Videopath="android.resource://"+getPackageName()+"/"+R.raw.pensilstchr;
        Uri uri=Uri.parse(Videopath);
        vdo.setVideoURI(uri);
        MediaController mediaController=new MediaController(this);
        vdo.setMediaController(mediaController);
        mediaController.setAnchorView(vdo);*/
    }

    public void setonclickbtn(View view) {
        Intent intent=new Intent(user_admin.this,MainActivity2.class);
        startActivity(intent);
    }

}