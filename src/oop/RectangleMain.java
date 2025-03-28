package oop;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 8;

        int area = r.area();
        System.out.println("넓이: "+area);

        int perimeter = r.perimeter();
        System.out.println("둘레: "+perimeter);

        boolean square = r.square();
        System.out.println("정사각형 여부: "+square);
    }
}
