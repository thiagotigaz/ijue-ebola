package app.ijueebola.supercloud.com.br.ijueebola;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Windows on 30-01-2015.
 */
public class MyApplication extends Application {


//    public static final String API_KEY_ROTTEN_TOMATOES = "54wzfswsa4qmjg8hjwa64d4c";
    private static MyApplication sInstance;

//    private static DBMovies mDatabase;

    public static MyApplication getInstance() {
        return sInstance;
    }

    public static Context getAppContext() {
        return sInstance.getApplicationContext();
    }

//    public synchronized static DBMovies getWritableDatabase() {
//        if (mDatabase == null) {
//            mDatabase = new DBMovies(getAppContext());
//        }
//        return mDatabase;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
//        mDatabase = new DBMovies(this);
    }

    public static void saveToPreferences(Context context, String preferenceName, String preferenceValue) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preferenceName, preferenceValue);
        editor.apply();
    }

    public static String readFromPreferences(Context context, String preferenceName, String defaultValue) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return sharedPreferences.getString(preferenceName, defaultValue);
    }
}
