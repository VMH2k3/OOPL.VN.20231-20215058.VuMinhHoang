package Week_1;
import java.util.Scanner;

public class equation_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        float a = input.nextFloat();

        if (a == 0) {
            System.out.println("Nhập lại a:");
        } else {
            System.out.print("Nhập hệ số b: ");
            float b = input.nextFloat();
            System.out.print("Nhập hệ số c: ");
            float c = input.nextFloat();

            
            float delta = b * b - 4 * a * c;

            // Kiểm tra giá trị của delta để xác định số nghiệm và giá trị của nghiệm
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Phương trình có một nghiệm kép:");
                System.out.println("x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
