package pratice.member;

public class RateDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade().equals("BASIC")){
            int discount = (int)(price * 0.05);
            int finalPrice = price - discount;
            return finalPrice;
        }
        else if(member.getGrade().equals("VIP")) {
            int discount = (int)(price *0.1);
            int finalPrice = price - discount;
            return finalPrice;
        }
        else {
            return price;
        }
    }
}
