package com.example.task3;

public class ProxyImage implements MyImage {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        this.realImage = new RealImage(filename);
        this.realImage.display();
    }
}
