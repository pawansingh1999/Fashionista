
package fashionista;

import java.util.ArrayList;

public class Garments {
   private int id;
   private String type;
   private int stock;
   private float price;
   private float sales;
   private int orderQty;
   static ArrayList prodList=new ArrayList();
   
    public Garments(int id, String type, int stock, float price) {
        this.id = id;
        this.type = type;
        this.stock = stock;
        this.price = price;
    }
    public void addGarments(Garments obj){
        prodList.add(obj);
    } 
    public void showDetails(){
        System.out.println("====== Garment Details :-");
        System.out.println("Total Object: "+prodList.size());
        System.out.println("ID\t type\t Stock\t Price");
        for(int i=0;i<prodList.size();i++){
            Garments gobj=(Garments)prodList.get(i);
            System.out.print(gobj.id+"\t");
            System.out.print(gobj.type+"\t");
            System.out.print(gobj.stock+"\t");
            System.out.println(gobj.price+"\t");
        }
        System.out.println("***********************");
        System.out.println("Total Sales : "+sales);
        System.out.println("***********************");
    }
    
    public void setOrder(int pid,int orderQty){
        float totalAmt=0;
        this.orderQty=orderQty;
        for(int j=0;j<prodList.size();j++){
            Garments gobj=(Garments)prodList.get(j);
            if(gobj.id==pid){
                sales+=gobj.price*orderQty;
                totalAmt=gobj.price*orderQty;
                prodList.set(j,(Integer)gobj.stock-orderQty);
            }
        }
        System.out.println("=========== Bill Generation :- ============");
        System.out.println("Payable Amount : "+totalAmt);
        System.out.println("Thank You..! Have anice day. ");
    }
    
}
