package oop;

public class Rectangle {
    int width;
    int height;

    int area(){
        int area = width*height;
        return area;
    }
    int perimeter(){
        int perimeter = width*2 + height*2;
        return perimeter;
    }
    boolean square() {
        if(width==height){
            return true;
        }
        else {
            return false;
        }
    }
}
