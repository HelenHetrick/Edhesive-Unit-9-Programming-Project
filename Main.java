import java.text.*;
class Main {
  public static void main(String[] args) {

    Product[] list=new Product[6];
list[0]=new Product(1.99, "KIK Costum Products", "Comet",((int)(Math.random()*4)+3));
list[1]=new Electronics(23.97, "Huffy", "Rover Kids Ride",((int)(Math.random()*4)+3), false, 6);
    list[2]=new Media(8.79, "Warner Bros.", "Dunkirk",((int)(Math.random()*4)+3),"movie");
    list[3]=new Clothing(9.00, "Shein", "Floral Print Dress", ((int)(Math.random()*4)+3), "Shein", 6);
    list[4]=new Men(13.99, "Aeropostale", "Twill Joggers", ((int)(Math.random()*4)+3),"Aeropostale", 30, true);
    list[5]=new Women(9.99, "Fashion Nova", "Falls Favorite Sweater", ((int)(Math.random()*4)+3), "Fashion Nova", 10, "white");

for(Product xy: list)
  {
    System.out.println(xy);
  }



      System.out.println("\n\n");
    System.out.println("Name                      Company              Quantity   Price    Total Cost");
      System.out.println("****************************************************************************");
NumberFormat nf=NumberFormat.getCurrencyInstance();

    for(Product yeah: list)
      {
      

        System.out.printf("%-26s%-25s%-7s%-10s%-2s",yeah.getName(),yeah.getCompany(), yeah.getQuantity(), nf.format(yeah.getPrice()),nf.format(ProductCost(yeah)));
        //System.out.printf("%13s",yeah.getCompany());

        System.out.println();

        
      }

      System.out.println("****************************************************************************");
System.out.printf("Grand Total %13s",nf.format(grandTotal(list)));
         System.out.println(); System.out.println("****************************************************************************");

    
    }




public static double ProductCost(Product p)
  {
    return (p.getPrice())*(p.getQuantity());
  }

public static double grandTotal(Product[] k) 
  {
    double gt=0;
    for(Product x:k)
      {
        gt+= ProductCost(x);
      }
    return gt;
  }


// all that you have to do is the las paragraph, making it print in the right format. Ask Emma for help and then email ms. shawver





  
} 