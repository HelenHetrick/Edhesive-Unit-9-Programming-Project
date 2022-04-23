public class Product
  {
private double price;
private String company;
private String name;
private int quantity;

    //Constructor
    public Product(double a, String b, String c, int d)
    {
      price=a;
      company=b;
      name=c;
      quantity=d;
     // quantity=((int)(Math.random()*4)+3);
    }

/// accessor methods
public double getPrice()
    {
return price;
      }

    public String getName()
    {
     return name;
    }
    
    public int getQuantity()
    {
      return quantity;
    }

    
  public String getCompany()
    {
      return company;
    }


    //mutator methods
public void setPrice(double d)
    {
      price=d;
    }

    public void setQuantity(int x)
    {
      quantity=x;
    }

    public void setName(String s)
    {
      name=s;
    }
    
  public void setCompany(String s)
    {
      company=s;
    }


public String toString()
    {
return name+ " " + company + " "+ quantity + " $" + price;
      
    }

    
  }