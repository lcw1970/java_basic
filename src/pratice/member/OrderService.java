package pratice.member;

public class OrderService {
    public int discountMethod(Member member,int price,String option) {
        DiscountPolicy discountPolicy;
        int result = price;
        if (option.equals("fix")) {
            discountPolicy = new FixedDiscountPolicy();
        }
        else if (option.equals("rate")){
            discountPolicy = new RateDiscountPolicy();
        }
        else {
            return result;
        }
        return discountPolicy.discount(member,price);
    }


}
