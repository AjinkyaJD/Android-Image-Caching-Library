package com.ajinkyad.imagecachinglibrarydemo.application;

import android.app.Application;
/**
 * This is the singleton class used throughout the application.
 * Functions of this class -
 * 1)Volley Request Queueing
 * 2)Font Rendering throughout the application (Library Link Details - https://github.com/chrisjenx/Calligraphy)
 * 3)Handling uncaught exceptions throughout the application
 * 4)Icon Fonts rendering throughout the applications(Library Link Details - https://github.com/mikepenz/Android-Iconics)
 *
 * @author AjinkyaD
 * @version 1.0
 */
public class ImageCachingDemoApplication extends Application {

    public static final String TAG = ImageCachingDemoApplication.class.getSimpleName();
    private static ImageCachingDemoApplication mInstance;

    public static synchronized ImageCachingDemoApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

}
