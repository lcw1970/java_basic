package oop;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valuedata1 = new ValueData();
        valuedata1.add();
        valuedata1.add();
        valuedata1.add();

        ValueData data = new ValueData();
        data.add();
        data.add();

        System.out.println("최종 숫자 = "+valuedata1.value);
        System.out.println("최종 숫자 = "+data.value);
    }
}
