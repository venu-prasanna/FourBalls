package org.procedural;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 400;
    private static final int DIAMETER = 10;
    private static int SPEED = 1;
    private static final int TOTAL_BALLS = 4;


    public static void main(String[] args) {
        PApplet.main("org.procedural.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        System.out.println("Four Balls Procedural");
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int unit = 1; unit < TOTAL_BALLS + 1; unit++) {
            drawCircle(unit, calculateRatio(unit));
        }
        SPEED++;
    }

    private float calculateRatio(int unit) {
        return ((TOTAL_BALLS - unit + 1) / (float) (TOTAL_BALLS + 1));
    }

    private void drawCircle(int unit, float ratio) {
        ellipse(SPEED * unit, calculateHeight(ratio), DIAMETER, DIAMETER);
    }

    private int calculateHeight(float ratio) {
        return (int) (HEIGHT - (HEIGHT * ratio));
    }
}
