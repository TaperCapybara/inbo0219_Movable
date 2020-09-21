package ru.mirea.inbo0219_Movable;
import java.lang.*;
public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius){
        super(x,y,xSpeed,ySpeed);
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }


    @Override
    public String toString(){
        return "y";
    }
    @Override
    public void moveUp(){
        this.y -= ySpeed;
    }
    public void moveDown(){
        this.y += ySpeed;
    }
    public void moveLeft(){
        this.x -= xSpeed;
    }
    public void moveRight(){
        this.x += xSpeed;
    }
}
