package com.example.livemeeting;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CREATE_ROOM extends AppCompatActivity {

    EditText room,roompwd;
    Button cbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        room=findViewById(R.id.room);
        roompwd=findViewById(R.id.roompwd);
        cbtn=findViewById(R.id.cbtn);


        cbtn.setOnClickListener(new View.OnClickListener() {
            private ActivityResultLauncher<CREATE_ROOM> JitsiMeetActivity;

            @Override
            public void onClick(View view) {


                String room1=room.getText().toString().trim();
                String roomp=roompwd.getText().toString().trim();
                if (room1.isEmpty()){
                    Toast.makeText(CREATE_ROOM.this, "Please enter a room code", Toast.LENGTH_SHORT).show();
                } else {
                    if (roomp.isEmpty()){
                        Toast.makeText(CREATE_ROOM.this, "Please enter a Room Password", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent=new Intent(CREATE_ROOM.this,TAB_MEETING.class);
                startActivity(intent);
            }


        });
    }

}