import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi văn bản: ");
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        System.out.print("Nhập cụm từ cần tìm: ");
        String search = scr.nextLine();
        int index = str.indexOf(search);
        if(index == -1){
            System.out.printf("Không tìm thấy %s trong chuỗi.",search);
        }
        else{
            System.out.printf("Từ %s xuất hiện tại ví trí %d trong chuỗi.",search,index);
        }
    }
}
