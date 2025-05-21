

public class Main {
    public static void main(String[] args) {
        StringBuilder firstStr =  new StringBuilder("Hello, Java World!");
        System.out.printf("Chuỗi ban đầu: %s\n",firstStr);
        firstStr.delete(5,9);
        System.out.printf("Chuỗi sau khi xóa: %s\n",firstStr);
        firstStr.replace(8,13,"Universe");
        System.out.printf("Chuỗi sau khi thay thế: %s",firstStr);
    }


}
