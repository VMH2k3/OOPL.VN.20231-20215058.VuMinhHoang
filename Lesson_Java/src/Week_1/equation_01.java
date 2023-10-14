package Week_1;
//Bai 2.6
import java.util.Scanner;
public class equation_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh ax+b=0 \n");
		System.out.println("Nhap so a:");
		float a = sc.nextFloat();//Nhap gia tri cua a
		System.out.println("Nhap so b");
		float b = sc.nextFloat();//Nhap gia tri cua b
		if(a == 0 ) {
			if(b!=0) {System.out.println("Phuong trinh vo nghiem"); // a=0 b!=0 pt: 0x+b =0 => pt vo nghiem
			  }else
			System.out.println("Phuong trinh co vo so nghiem");  // a=0 b=0 pt: 0x+0=0=> pt co vo so nghiem
		} else {
			float x = -b/a; 
			System.out.println("Nghiem cua phuong trinh la x =" + x +"\n");
		}
		// Giai phuong trinh bac hai
		Scanner input = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac 2:  cx^2 + dx + e = 0");
        System.out.print("Nhập hệ số c: ");
        float c = input.nextFloat();//Nhap gia tri cua c
            System.out.print("Nhập hệ số d: ");
            float d = input.nextFloat(); //Nhap gia tri cua d
            System.out.print("Nhập hệ số e: ");
            float e = input.nextFloat(); // Nhap gia tri cua e
            if(c==0){//Phuong trinh tro thanh phuong trinh bac 1 
            	if(a == 0 ) {
        			if(e!=0) {System.out.println("Phuong trinh vo nghiem"); // d=0 b!=0 pt: 0x+e =0 => pt vo nghiem
        			  }else
        			System.out.println("Phuong trinh co vo so nghiem");  // d=0 b=0 pt: 0x+0=0=> pt co vo so nghiem
        		} else {
        			float x = -e/d; 
        			System.out.println("Nghiem cua phuong trinh la x =" + x +"\n");}
            }else {
            	float delta = d * d - 4 * c * e; // tinh denta

                // Kiểm tra giá trị của delta để xác định số nghiệm và giá trị của nghiệm
                if (delta > 0) {
                    double x1 = (-d + Math.sqrt(delta)) / (2 * c);
                    double x2 = (-d - Math.sqrt(delta)) / (2 * c);
                    System.out.println("Phương trình có hai nghiệm phân biệt:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (delta == 0) {
                    float x = -d / (2 * c);
                    System.out.println("Phương trình có một nghiệm kép:");
                    System.out.println("x = " + x);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            System.out.println("-------------------------Ket thuc chuong trinh--------------------");
            }}
