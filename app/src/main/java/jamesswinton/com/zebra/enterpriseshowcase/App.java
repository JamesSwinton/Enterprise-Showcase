package jamesswinton.com.zebra.enterpriseshowcase;

import android.app.Application;
import android.util.Log;

public class App extends Application {

    // Debugging
    private static final String TAG = "ApplicationClass";

    // Constants


    // Variables


    @Override
    public void onCreate() {
        super.onCreate();

        // Log Application Class Creation
        Log.i(TAG, "Application created");


    }
}
