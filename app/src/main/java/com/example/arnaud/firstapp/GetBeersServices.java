package com.example.arnaud.firstapp;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.nfc.Tag;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class GetBeersServices extends IntentService {

    public GetBeersServices() {
        super("GetBeersServices");
    }

    public static void startActionBeer(Context context) {
        Intent intent = new Intent(context, GetBeersServices.class);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        handleActionBeers();
    }

    private void handleActionBeers() {
        Log.d("tag", "Thread service name : "+Thread.currentThread().getName());
        URL url = null;
        try {
            Log.d("tag", "Bieres json download init");
            //url = new URL("http://binouze.fabrigli.fr/bieres.json");
            url = new URL("https://overwatch-api.net/api/v1/hero");
            HttpURLConnection cnct = (HttpURLConnection)url.openConnection();
            cnct.setRequestMethod("GET");
            cnct.connect();
            if (HttpURLConnection.HTTP_OK == cnct.getResponseCode()) {
                copyInputStreamToFile(cnct.getInputStream(),
                    new File(getCacheDir(), "bieres.json"));
                Log.d("tag", "Bieres json downloaded");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(MainActivity2.BEERS_UPDATE));
    }

    private void copyInputStreamToFile (InputStream in, File file) {
        try {
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            while((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
