public class Women extends Clothing
  {
private String color;
//Constructor
     public Women(double a, String b, String c, int d, String n, int s, String h)
    {
    super(a,b,c,d,n,s);
      color=h;
    }

/// accessor methods
public String getColor()
    {
return color;
      }

/// mutator methods
public void setColor(String r)
    {
 color=r;
      }

public String toString()
    {
return super.toString()+" "+color;
      }






    
  }