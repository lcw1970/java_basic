package oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valuedata = new ValueData();
        add(valuedata);
        add(valuedata);
        add(valuedata);
        System.out.println("최종 숫자 = "+valuedata.value);
    }
    static void add(ValueData data){
        data.value++;
        System.out.println("숫자 증가 value = "+data.value);
    }
}
