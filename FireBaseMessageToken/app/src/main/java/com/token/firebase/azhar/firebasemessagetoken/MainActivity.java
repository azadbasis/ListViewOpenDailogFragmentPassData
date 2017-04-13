package com.token.firebase.azhar.firebasemessagetoken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "token "+ FirebaseInstanceId.getInstance().getToken(), Toast.LENGTH_SHORT).show();
        Log.d("My Token", "Refreshed token: " + FirebaseInstanceId.getInstance().getToken());

    }
}
