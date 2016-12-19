package com.example.arnaud.firstapp;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);
        Button but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(this);
        Button but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(this);
        Button but4 = (Button) findViewById(R.id.but4);
        but4.setOnClickListener(this);
        Button but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(this);
        Button but6 = (Button) findViewById(R.id.but6);
        but6.setOnClickListener(this);
        Button but7 = (Button) findViewById(R.id.but7);
        but7.setOnClickListener(this);
        Button but8 = (Button) findViewById(R.id.but8);
        but8.setOnClickListener(this);
        Button but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(this);
        Button but10 = (Button) findViewById(R.id.but10);
        but10.setOnClickListener(this);
        Button but11 = (Button) findViewById(R.id.but11);
        but11.setOnClickListener(this);
        Button but12 = (Button) findViewById(R.id.but12);
        but12.setOnClickListener(this);
        Button but13 = (Button) findViewById(R.id.but13);
        but13.setOnClickListener(this);
        Button but14 = (Button) findViewById(R.id.but14);
        but14.setOnClickListener(this);
        Button but15 = (Button) findViewById(R.id.but15);
        but15.setOnClickListener(this);
        Button but16 = (Button) findViewById(R.id.but16);
        but16.setOnClickListener(this);
        Button but17 = (Button) findViewById(R.id.but17);
        but17.setOnClickListener(this);
        Button but18 = (Button) findViewById(R.id.but18);
        but18.setOnClickListener(this);
        Button but19 = (Button) findViewById(R.id.but19);
        but19.setOnClickListener(this);
        Button but20 = (Button) findViewById(R.id.but20);
        but20.setOnClickListener(this);
        Button but21 = (Button) findViewById(R.id.but21);
        but21.setOnClickListener(this);
        Button but22 = (Button) findViewById(R.id.but22);
        but22.setOnClickListener(this);
        Button but23 = (Button) findViewById(R.id.but23);
        but23.setOnClickListener(this);

    }

    @Override
    public void onClick(View butView) {
        switch (butView.getId()) {
            case R.id.but1:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "1"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but2:
                Log.d("tag", "but2");
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "2"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but3:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "3"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but4:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "4"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but5:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "5"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but6:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "6"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but7:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "7"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but8:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "8"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but9:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "9"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but10:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "10"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but11:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "11"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but12:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "12"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but13:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "13"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but14:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "14"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but15:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "15"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but16:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "16"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but17:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "17"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but18:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "18"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but19:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "19"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but20:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "20"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but21:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "21"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but22:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "22"); //Optional parameters
                startActivity(i);
                break;
            case R.id.but23:
                i = new Intent(this, MainActivity2.class);
                i.putExtra("key", "23"); //Optional parameters
                startActivity(i);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toast:
                Toast.makeText(getApplicationContext(), getString(R.string.toastMsg), Toast.LENGTH_LONG).show();
                break;
            case R.id.notif:
                NotificationCompat.Builder notifBuilder = new NotificationCompat.Builder(this);
                notifBuilder.setContentTitle(getString(R.string.notifTitle));
                notifBuilder.setContentText(getString(R.string.notifMsg));
                notifBuilder.setSmallIcon(android.R.drawable.btn_star);
                NotificationManager notifMan = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notifMan.notify(R.id.notif, notifBuilder.build());
                break;
            case R.id.dialog:
                displayDialog();
                break;
        }
        return true;
    }

    public void displayDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setMessage(R.string.dialogMsg);
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                onClickYes();
            }
        });
        AlertDialog dialog = dialogBuilder.create();
        dialog.show();
    }

    public void onClickYes() {
    }


}
