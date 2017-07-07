package test.ban.com.test_android;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    ServiceConnection conn;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
         conn=new ServiceConnection() {
             @Override
             public void onServiceConnected(ComponentName name, IBinder service) {
                 Log.i(TAG, "onServiceConnected: "+service.getClass().getName());
             }

             @Override
             public void onServiceDisconnected(ComponentName name) {

             }
         };

    }

    @Override
    protected void onStart() {
        super.onStart();
        this.bindService(new Intent(this,WeatherService.class),conn, Service.BIND_AUTO_CREATE);
    }
}
