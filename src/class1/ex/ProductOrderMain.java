package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        products[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        products[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        products[2] = order3;

        int amount = 0;
        for (ProductOrder p : products) {
            System.out.println("상품명: "+p.productName+", 가격: "+p.price+", 수량: "+p.quantity);
            amount += (p.price* p.quantity);
        }
        System.out.println("총 결제 금액: "+amount);
    }
}
