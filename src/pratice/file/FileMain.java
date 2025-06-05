package pratice.file;

import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileService fileService = new FileService();

        while(true){
            System.out.print("저장 형식을 선택하세요 (txt, csv, json): ");
            String option = sc.nextLine();

            if (option.equals("exit")){
                break;
            }

            System.out.print("저장할 데이터를 입력하세요: ");
            String data = sc.nextLine();
            fileService.saveFile(option,data);
        }
    }
}
