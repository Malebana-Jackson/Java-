package za.co.mie;

public class OuterClass{
  private InnerClass innerClassRef;
  private int value;

  public OuterClass(int value){
    this.value = value;
  }
  
  public int getValue(){
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }

  public InnerClass getInnerClassRef(){
    return innerClassRef;
  }

  public void setInnerClassRef(){
    this.innerClassRef = new InnerClass(-1);
  }

  //------------------------------------------------------------
  public class InnerClass{
    private int innerValue;

    public InnerClass(int innerValue){
      this.innerValue = innerValue;
    }

    public int getInnerValue(){
      return innerValue;
    }

    public void setInnerValue(int innerValue){
      this.innerValue = innerValue;
    }
    
    public int calcAllValues(){
      return innerValue*value;
    }
    
    //****************************************************
    public class SiphoClass{
      public void siphoMsg(){
        System.out.println("Nearly home time!!");
      } 
    }
  }
  //------------------------------------------------------------
  
}
