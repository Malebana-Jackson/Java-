package za.co.mie;


public class AnOtherOuterClass{
  private int value;

  public AnOtherOuterClass(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }
  
  public static class InnerStaticClass{
    private String str;

    public InnerStaticClass(String str){
      this.str = str;
    }

    public String getStr(){
      return str;
    }
     public static void greeting(){
       System.out.println("Well hello there!!!");
     }
  }
  
  
}
