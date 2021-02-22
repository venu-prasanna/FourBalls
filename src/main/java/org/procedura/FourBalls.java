package org.procedural;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 400;
    private static final int DIAMETER = 10;


    public static void main(String[] args) {
        PApplet.main("org.procedural.FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        System.out.println("Four Balls Procedural");
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        drawCircle(1, (float) (4.0 / 5.0));
        drawCircle(2, (float) (3.0 / 5.0));
        drawCircle(3, (float) (2.0 / 5.0));
        drawCircle(4, (float) (1.0 / 5.0));
    }

    private void drawCircle(int unit,float ratio){
        ellipse(10,getHeight(ratio),DIAMETER,DIAMETER);
    }

    private int getHeight(float ratio){
        return (int) (HEIGHT - (HEIGHT * ratio));
    }
}
