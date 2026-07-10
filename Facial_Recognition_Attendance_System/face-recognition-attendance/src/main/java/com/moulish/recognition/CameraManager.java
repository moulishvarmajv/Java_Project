package com.moulish.recognition;

//Every image is stored as a matrix
import org.opencv.core.Mat;
//For Video Capturing
import org.opencv.videoio.VideoCapture;
public class CameraManager {
  
    private VideoCapture camera;

    public CameraManager() {
        camera=new VideoCapture();
    }
    public boolean openCamera() {
        return camera.open(0);
    }
    // stores the frame as matrix
    public Mat captureFrame() {
        Mat frame=new Mat();
        if(camera.isOpened()) {
            camera.read(frame);
        }
        return frame;
    }
    public void releaseCamera()  {
        if(camera.isOpened()) {
            camera.release();
        }
    }

}
