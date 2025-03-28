package oop.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자명을 입력해주세요: ");
        String user = sc.nextLine();

        Account account  = new Account();
        account.name = user;

        // 뱅킹 시작
        onBank(user);
        while (true){
            System.out.print("메뉴를 선택해주세요: ");
            int selectMenu = sc.nextInt();

            if (selectMenu == 1) {
                int balance = account.getBalance();
                System.out.println(balance);
            }
            else if (selectMenu == 2) {
                System.out.print("입금할 금액: ");
                int amount = sc.nextInt();
                account.deposit(amount);
            }
            else if (selectMenu == 3) {
                System.out.print("출금할 금액: ");
                int amount = sc.nextInt();
                account.withdraw(amount);
            }
            else if (selectMenu == 4){
                System.out.println("실행을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 번호를 입력하셨습니다.");
            }

        }


    }
    static void onBank(String user) {
        System.out.println("--------------------------------------------");
        System.out.println("                                사용자: "+user);
        System.out.println();
        System.out.println("1.잔액조회 | 2.입금 | 3.출금 | 4.종료" );
    }
}
