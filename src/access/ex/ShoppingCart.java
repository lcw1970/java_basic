package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private  int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 9) {
            System.out.println("장바구니가 가득 찼습니다.");
        }
        else {
            items[itemCount] = item;
            itemCount += 1;
        }
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: "+items[i].getName()+", 합계: "+items[i].totalPrice());
        }
        System.out.println("전체 가격 합: "+totalPrice());
    }
    public int totalPrice() {
        int result = 0;
        for (int i = 0; i < itemCount; i++) {
            result += items[i].totalPrice();
        }
        return result;
    }

}