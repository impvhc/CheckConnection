package com.impvhc.checkconnection;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button
    Button btn_check;
    //TextView
    TextView txt_status;
    ////////////////////
    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_check=(Button) findViewById(R.id.btn_check);
        txt_status=(TextView) findViewById(R.id.txt_status);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result;
                connectivityManager=(ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
                networkInfo=connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null&&networkInfo.isConnectedOrConnecting()){
                    result="Connected";
                }else{
                    result="Not connected";
                }
                txt_status.setText(result);
            }
        });





    }
}
