package org.oops;

import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 10;
    private static final int TOTAL_BALLS = 4;
    public ArrayList<Ball> BALLS = new ArrayList<Ball>();

    public static void main(String[] args) {
        PApplet.main("org.oops.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){
        super.settings();
        System.out.println("Four Balls OOPs");
        int ballNumber;
        for (ballNumber = 1; ballNumber < TOTAL_BALLS + 1; ballNumber++) {
            Ball ball = new Ball(ballNumber, HEIGHT, DIAMETER, TOTAL_BALLS + 1);
            BALLS.add(ball);
        }
    }

    @Override
    public void draw() {
        drawCircle();
    }

    public void drawCircle() {
        for (Ball ball : BALLS) {
            ellipse( 1, ball.height, ball.diameter, ball.diameter);
        }
    }

}
