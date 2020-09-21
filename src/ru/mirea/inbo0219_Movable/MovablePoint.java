package ru.mirea.inbo0219_Movable;
import java.lang.*;
public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int xSpeed, int y, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "x";
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
