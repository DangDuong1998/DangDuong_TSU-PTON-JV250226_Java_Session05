import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi bao gồm số và chữ, ký tự,...");
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str=str.replaceAll("\\d","*");
        System.out.print(str);
        scr.close();
    }
}
