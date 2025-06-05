package pratice.member;

public class FixedDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade().equals("BASIC")) {
            int finalPrice = price -500;
            return finalPrice;
        } else if (member.getGrade().equals("VIP")) {
            int finalPrice = price -1000;
            return finalPrice;
        } else {
            return price;
        }
    }

}
