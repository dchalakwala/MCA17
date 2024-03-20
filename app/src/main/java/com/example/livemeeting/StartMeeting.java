package com.example.livemeeting;

import android.os.Bundle;
import android.widget.Toolbar;
import android.widget.VideoView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.VideoCapture;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StartMeeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_meeting);

        boolean micEnabled= false;
        boolean webcamEnabled = false;

        FloatingActionButton btnMic,btnWebcam;
        VideoView joinView;

        Toolbar toolbar;
        ActionBar actionBar;

        VideoTrack videoTrack;
        VideoCapture videoCapture;

    }
}