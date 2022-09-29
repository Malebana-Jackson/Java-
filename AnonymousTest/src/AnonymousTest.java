
public class AnonymousTest{

  public static void main(String[] args){
    new AnonymousTest().runMe();
  }
  
  public void runMe(){
    go(new MyCoolInterface() {
      @Override
      public void run(){
        System.out.println("WooHoo It is FRIYAY!!!!!!!");
        System.out.println("Happy Heritage Day for tomorrow");
      }

      @Override
      public void foo(){
        System.out.println("WooFOoo");
      }
      
    });
  }
  
  public void go(MyCoolInterface mci){
    mci.run();
    mci.foo();
  }
  
}

//-----------------------------------------------------
interface MyCoolInterface{
  void run();
  void foo();
}
