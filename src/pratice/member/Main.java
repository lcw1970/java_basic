package pratice.member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderService order = new OrderService();
        Member[] members = new Member[10];
        int num = 0;
        int p = 5000;
        firstMessage();
        while (true){
            menuSelectMessage();
            int select = sc.nextInt();
            sc.nextLine();

            if (select == 1){
                members[num] = registerMember(sc);
                num += 1;
            }
            else if (select == 2){
                memberList(members,num);
            }
            else if(select == 3){
                processOrder(sc,members,num,p,order);
            }
            else if(select == 4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 번호입니다.");
            }

        }

    }
    public static void firstMessage() {
        System.out.println("상품 주문 서비스에 오신걸 환영합니다.");
    }

    public static void menuSelectMessage() {
        System.out.println("메뉴를 골라주세요");
        System.out.println("1. 회원추가 | 2. 회원목록 | 3. 상품주문 | 4. 종료");
    }

    public static Member registerMember(Scanner sc) {
        System.out.print("id를 입력해주세요: ");
        String id = sc.nextLine();

        System.out.print("이름을 입력해주세요: ");
        String name = sc.nextLine();

        System.out.print("회원 등급을 입력해주세요: ");
        String grade = sc.nextLine();

        if (grade.equals("basic")) {
            grade = Grade.BASIC;
        } else if (grade.equals("vip")) {
            grade = Grade.VIP;
        } else {
            grade = Grade.DEFAULT;
        }

        return new Member(id, name, grade);
    }
    public static void memberList(Member[] members,int num){
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+". ---------");
            System.out.println("이름 : "+members[i].getName());
            System.out.println("ID  : "+members[i].getId());
            System.out.println("등급 : "+members[i].getGrade());
        }
    }
    public static void processOrder(Scanner sc,Member[] members,int num,int price,OrderService order) {
        System.out.print("id를 입력해주세요: ");
        String foundId = sc.nextLine();
        Member member = findMemberById(members,foundId,num);
        if (member != null){
            System.out.print("할인 혜택을 입력해주세요: ");
            String option = sc.nextLine();
            int result = order.discountMethod(member,price,option);
            System.out.println("상품 금액: "+price);
            System.out.println("할인받은 총 금액: "+result);
        } else {
            System.out.println("해당 Id의 회원을 찾을 수 없습니다.");
        }
    }
    public static Member findMemberById(Member[] members,String foundId,int num){
        for (int i = 0; i < num; i++) {
            if (members[i].getId().equals(foundId)){
                return members[i];
            }
        }
        return null;
    }
}
