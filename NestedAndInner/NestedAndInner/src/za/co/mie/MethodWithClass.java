package za.co.mie;

public class MethodWithClass{
  private int value;

  public MethodWithClass(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }
  
  public void calculate(int x, int y){
    int z = x*y;
    
    class FanceyMultiply{
       int mult(){
         return z*(x*x-y);
       }
    }
    FanceyMultiply fm = new FanceyMultiply();
    System.out.println("Secret ans is: "+fm.mult());
  }
  
}
