package Week_1;
import java.util.Scanner;
public class numbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Nhap vao so thu nhat:");
double a = sc.nextDouble();
 System.out.println("Nhap vao so thu hai:");
 double b = sc.nextDouble();
 double sum = a + b;
 System.out.println("Tong la"+ sum);
 double difference = a - b;
 System.out.println("Hieu la" + difference);
 double product = a*b;
 System.out.println("Tich la" + product);
 double quotient = a / b;
 System.out.println("Thuong la"  + quotient );
}
}
 