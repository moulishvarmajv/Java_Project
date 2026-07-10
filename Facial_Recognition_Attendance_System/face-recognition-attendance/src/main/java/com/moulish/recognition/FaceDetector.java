package com.moulish.recognition;

import org.opencv.core.Mat;
import java.net.URL;
import org.opencv.core.MatOfRect;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
public class FaceDetector {
    
    private CascadeClassifier detector;
    public FaceDetector() {
        detector=new CascadeClassifier();
        URL cascadeURL=getClass().getResource("/haarcascades/haarcascade_frontalface_default.xml");
        if(cascadeURL==null) {
            throw new RuntimeException("Haar Cascade file not found.");
        }
        detector.load(cascadeURL.getPath());
        if(detector.empty()) {
            throw new RuntimeException("Failed to load Haar Cascade");
        }    
    }
    //Before detecting faces, we should always verify the classifier loaded successfully.
    public boolean loadClassifier() {
        return detector.load(
        "src/main/resources/haarcascades/haarcascade_frontalface_default.xml"
        );
    }
    public MatOfRect detectFaces(Mat frame) {

        // Convert to grayscale
        Mat grayFrame = new Mat();
        Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);
        // Improve contrast
        Imgproc.equalizeHist(grayFrame, grayFrame);
        // Store detected faces
        MatOfRect faces = new MatOfRect();
        // Detect faces
        detector.detectMultiScale(
                grayFrame,
                faces,
                1.1,                   // Scale Factor
                6,                     // Min Neighbors
                0,
                new Size(120, 120),    // Minimum Face Size
                new Size()             // Maximum Face Size
        );
        return faces;
    }
}
