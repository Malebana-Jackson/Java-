
import java.time.LocalDate;
import java.util.ArrayList;
import za.co.mie.AnOtherOuterClass;
import za.co.mie.MethodWithClass;
import za.co.mie.OuterClass;
import za.co.mie.OuterClass.InnerClass;
import za.co.mie.human.Gender;
import za.co.mie.human.Person;

public class NesterAndInner{
  public static void main(String[] args){
    //  new NesterAndInner().testing();
    //  new NesterAndInner().personTest();
    //  new NesterAndInner().innerInnerTest();
    //  new NesterAndInner().staticInnerTest();
    new NesterAndInner().methodWithAClassTest();
  }

  private void testing(){
    OuterClass outerClass = new OuterClass(99);
    System.out.println("OuterClass->value: " + outerClass.getValue());
    System.out.println("/----------------------------------------");
    OuterClass.InnerClass innerClass = outerClass.new InnerClass(66);
    System.out.println("OuterClass->value: " + outerClass.getValue());
    System.out.println("InnerClass->value: " + innerClass.getInnerValue());
    System.out.println("/----------------------------------------");
    System.out.println("Calc->value: " + innerClass.calcAllValues());
    System.out.println("/----------------------------------------");
    outerClass.setInnerClassRef();
    System.out.println("***->value: " + outerClass.getInnerClassRef().getInnerValue());
    System.out.println("/----------------------------------------");
  }

  private void personTest(){
    ArrayList<Person> allOfUs = new ArrayList();
    allOfUs.add(new Person("Bob", Gender.BOY, LocalDate.of(2020, 10, 9), "Mom", "Dad", "Jhb"));
    allOfUs.add(new Person("Jane", Gender.GIRL, LocalDate.of(1984, 1, 19), "MyMom", "MyDad", "Dbn"));
    allOfUs.add(new Person("Leanne", Gender.GIRL, LocalDate.of(1934, 7, 9), "Barbara", "Bill", "Cpt"));
    allOfUs.add(new Person("Russell.toString", Gender.BOY, LocalDate.of(2023, 8, 17), "Muzaffer", "Nabeel", "Jhb"));
    System.out.println("Our family tree---------");
    for(Person person : allOfUs){
      System.out.println("Person's name: " + person.getName());
      System.out.println("Person's gender: " + person.getGender());
      Person.BirthCertificate bc = person.getBirthCertificate();
      System.out.println("Person's birthday: " + bc.getDate());
      System.out.println("Person's Mom's name: " + bc.getMomName());
      System.out.println("Person's Dad's name: " + bc.getDadName());
      System.out.println("Person's birth place: " + bc.getPlaceOB());
      System.out.println("-------------------------------------------");
    }
  }

  private void innerInnerTest(){
    OuterClass outerClass = new OuterClass(99);
    System.out.println("OuterClass->value: " + outerClass.getValue());
    System.out.println("/----------------------------------------");
    OuterClass.InnerClass innerClass = outerClass.new InnerClass(66);
    System.out.println("OuterClass->value: " + outerClass.getValue());
    System.out.println("InnerClass->value: " + innerClass.getInnerValue());
    System.out.println("/----------------------------------------");
    System.out.println("Calc->value: " + innerClass.calcAllValues());
    System.out.println("/----------------------------------------");
    OuterClass.InnerClass.SiphoClass ois = innerClass.new SiphoClass();
    ois.siphoMsg();
  }

  private void staticInnerTest(){
    AnOtherOuterClass.InnerStaticClass ai
        = new AnOtherOuterClass.InnerStaticClass("Howdee");
    System.out.println("The Inner message is: " + ai.getStr());
    AnOtherOuterClass outer = new AnOtherOuterClass(6767);
    System.out.println("Outer value:" + outer.getValue());
    AnOtherOuterClass.InnerStaticClass.greeting();
  }

  private void methodWithAClassTest(){
    MethodWithClass mwc = new MethodWithClass(8);
    mwc.calculate(6, 8);
  }
}
