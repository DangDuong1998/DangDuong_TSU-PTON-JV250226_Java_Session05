import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập Email cần kiểm tra:");
        Scanner scr = new Scanner(System.in);
        String strEmail = scr.nextLine();
        strEmail = strEmail.replaceAll("\\s+","");
        boolean isValid = strEmail.matches("^[\\w.-]+@+[\\w.-]+\\.[a-zA-Z]{2,6}$");
        if(isValid){
            System.out.println("Email hợp lệ");
        }
        else{
            System.out.println("Email không hợp lệ");
        }
    }
}
