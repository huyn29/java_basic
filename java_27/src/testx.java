import java.util.Scanner;

public class testx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Nhap so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap du lieu khong dung");
        }finally{
            System.out.println("finally!");
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
