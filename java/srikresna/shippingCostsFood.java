import java.util.Scanner;

public class shipmentCostsExpedition{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String food;
        long price, shipcost, express, total;
        int tny;

        System.out.print("Enter a food name: ");
        food = sc.nextLine();
        System.out.print("Enter the food price: IDR ");
        price = sc.nextLong();
        System.out.print("Do you want express delivery (0 = no, 1 = yes)? ");
        tny = sc.nextInt();

        express = 25000;

        if(price < 100000){
            shipcost = 20000;
        } else {
            shipcost = 30000;
        }

        if  (tny == 0){
            total = price + shipcost;
        } else {
            total = price + shipcost + express;
        }
        
        System.out.println("RECEIPT");
        System.out.println(food + "\tIDR " + price);
        System.out.println("Shipping costs\tRp " + shipcost);
        System.out.println("TOTAL\t\tRp " + total);


    }
}