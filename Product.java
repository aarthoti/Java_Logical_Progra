
import java.util.Scanner;
class Product{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
Float pcost;
Float pqty;
System.out.println("Enter product number:");
pno=sc.nextInt();
System.out.println("Enter product name:");
pname=sc.next();
System.out.println("Enter product cost :");
pcost=sc.nextFloat();
System.out.println("Enter product pqty:");
pqty=sc.nextFloat();
System.out.println("The Given Product Number:"+pno);
System.out.println("The Given Product Name:"+pname);
System.out.println("The Given Product Cost:"+pcost);
System.out.println("The Given Product Qty:"+pqty);
}
}



