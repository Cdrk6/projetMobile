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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button) findViewById(R.id.but1);
        Button but2 = (Button) findViewById(R.id.but2);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }

    @Override
    public void onClick(View butView) {

        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
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
