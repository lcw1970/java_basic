package access.a;

public class AccessinnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defalutMethod();

        //data.privateField = 3;
    }
}
