public class Men extends Clothing
  {


private boolean machineWash;
//Constructor
     public Men(double a, String b, String c, int d, String n, int s, boolean w)
    {
    super(a,b,c,d,n,s);
      machineWash=w;
    }

/// accessor methods
public boolean getMachineWash()
    {
return machineWash;
      }

/// mutator methods
public void getMachineWash(boolean t)
    {
 machineWash=t;
      }

public String toString()
    {
return super.toString()+" "+this.getMachineWash();
      }
    
  }