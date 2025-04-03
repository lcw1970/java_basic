package access.a;

public class PublicClass {
    int age;

    PublicClass(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        PublicClass publicclass = new PublicClass(23);
        DefaultClass1 defaultclass1 = new DefaultClass1();
        DefaultClass2 defaultclass2 = new DefaultClass2();

    }
}

class DefaultClass1 {

}
class DefaultClass2{

}
