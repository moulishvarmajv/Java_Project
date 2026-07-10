package com.moulish.util;

import nu.pattern.OpenCV;

public final class OpenCVLoader {
    
    public static boolean loaded=false;
    private OpenCVLoader() {

    }
    public static void load() {

        if(!loaded) {
            // Load the native OpenCV library into the JVM exactly once.
            OpenCV.loadLocally();
            //To avoid duplicate loading
            loaded=true;
            System.out.println("OpenCV loaded Successfully");
        }
    }
}