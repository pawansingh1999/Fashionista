
package fashionista;

import java.util.ArrayList;
import java.util.Scanner;

public class Fashionista {
int choice;
Scanner s=new Scanner(System.in);
Garments obj1=null;
    public void showMenu(){
        System.out.println("===== Garments Store Menu :- ============");
        System.out.println("1. Add Garments");
        System.out.println("2. Show Garments");
        System.out.println("3. set Order");
        System.out.println("4. Exit");
        System.out.println("Enter ur choice");
        choice=s.nextInt();
        process();
    }
    public void process(){
        switch(choice){
            case 1:{
                System.out.println("===== Enter Garment Details:-======");
                System.out.println("Enter ID :");
                int id=s.nextInt();
                System.out.println("Enter Type :");
                String type=s.next();
                System.out.println("Enter Stock :");
                int stock=s.nextInt();
                System.out.println("Enter Price :");
                float price=s.nextFloat();
                
                obj1=new Garments(id,type,stock,price);
                obj1.addGarments(obj1);
                System.out.println("=====================================");
                showMenu();
                break;
            }
            case 2:{
                obj1.showDetails();
                showMenu();
                break;
            }
            case 3:{
                System.out.println("Enter Product ID");
                int pid=s.nextInt();
                System.out.println("Enter Orer Qty :");
                int qty=s.nextInt();
                obj1.setOrder(pid, qty);
                showMenu();
                break;
            }
            case 4:{
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Invalid choice trye again...!\n");
                showMenu();
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Fashionista obj=new Fashionista();
        obj.showMenu();
    }
    
}
