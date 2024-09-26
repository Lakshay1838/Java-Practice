package OOpsIntro;

import java.util.*;
// Other imports go here// Do NOT change the class name

class Rectangle
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        String s = "Rectangle[x=" + x +",y=" + y + ",width=" + width + ",height=" + height + "]";
        return s;
    }
    // Write your code here
}

