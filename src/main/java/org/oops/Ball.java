package org.oops;

public class Ball {
    public int speed;
    public int diameter;
    public int height;

    public Ball(int unit, int windowHeight, int diameter, int totalBalls) {
        this.speed = unit;
        this.height = calculateHeight(windowHeight, totalBalls);
        this.diameter = diameter;
    }

    private int calculateHeight(int windowHeight, int totalBalls) {
        return (int) (windowHeight - (windowHeight * ((float) (totalBalls - this.speed) / totalBalls)));
    }
}
