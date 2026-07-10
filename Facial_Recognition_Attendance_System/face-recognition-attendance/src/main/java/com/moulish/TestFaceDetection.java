package com.moulish;

import com.moulish.recognition.CameraManager;
import com.moulish.recognition.FaceDetector;
import com.moulish.util.OpenCVLoader;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
public class TestFaceDetection {
    
    public static void main(String[] args) {
        
        //loading openCV libraries into JVM
        OpenCVLoader.load();
        //Without Load CameraManager and FaceDetector will not work as they internally use openCV(cascadeclassifier)
        CameraManager cameraManager=new CameraManager();
        FaceDetector faceDetector=new FaceDetector();
        boolean cameraOpened=cameraManager.openCamera();
        //Checking if the camera is switched On
        if(!cameraOpened) {
            System.out.println("Failed to open the camera");
            return;
        }
        while(true) {

            // Capture the latest frame
            Mat frame = cameraManager.captureFrame();
            // Detect all faces
            MatOfRect faces = faceDetector.detectFaces(frame);
            // Convert OpenCV container to Java array
            Rect[] detectedFaces = faces.toArray();
            // Print number of detected faces
            System.out.println("Faces Detected : " + detectedFaces.length);
            // Draw rectangle around every detected face
            for (Rect face : detectedFaces) {
                Imgproc.rectangle(
                        frame,
                        face.tl(),
                        face.br(),
                        new Scalar(0, 255, 0),
                        2
                );
            }
            // Display the live video
            HighGui.imshow("Face Detection", frame);
            // Press 'q' to quit
            int key = HighGui.waitKey(1);
            if (key == 'q') {
                break;
            }
        }
        // Release resources
        cameraManager.releaseCamera();
        HighGui.destroyAllWindows();
        System.out.println("Application Closed Successfully.");
    }
}

