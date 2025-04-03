package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

//        data.defaultField = 2;
//        data.defalutMethod();

        //data.privateField = 3;
    }
}
