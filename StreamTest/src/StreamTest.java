
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class StreamTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   // new StreamTest().testBiPredicate();
    // new StreamTest().consumerTest();
    //new StreamTest().supplierTest();
    new StreamTest().functionTest();
  }

  //----------------------------------------------------
  private void testBiPredicate(){
    System.out.println("Is it valid 1: " + isNumberValid.test("271234", "654321"));
    System.out.println("Is it valid 2: " + isNumberValid.test("71234", "654321"));
    System.out.println("Is it valid 3: " + isNumberValid.test("271234", "6"));
    System.out.println("------------------------------");
    System.out.println("Is it valid 4: " + isNumber2Valid.test("271234", 5677));
    System.out.println("Is it valid 5: " + isNumber2Valid.test("271234", 9));
    System.out.println("Is it valid 6: " + isNumber2Valid.test("71234", 45678));
  }
  private BiPredicate<String, String> isNumberValid
      = (number1, number2) -> number1.startsWith("27") && number2.length() > 4;
  private BiPredicate<String, Integer> isNumber2Valid
      = (number1, number2) -> number1.startsWith("27") && number2 > 456;
//----------------------------------------------------
  private Consumer<Person> greetPerson = person -> {
    System.out.println("------------------------------");
    System.out.println("Hello there " + person.getName());
    System.out.println("Wow...is that your age!! " + person.getAge());
  };

  private void consumerTest(){
    greetPerson.accept(new Person( "Old Man",99));
    greetPerson.accept(new Person( "Andrie",21));
    greetPerson.accept(new Person("Pink Hat",23));
    greetPerson.accept(new Person( "Thakatso",23));
    System.out.println("---------------------------------");

    Person pers = new Person( "Thakatso",23);
    consumeMe((p) -> System.out.println((p.getAge() > 30 ? " You are old." : " Little one")), pers);
    consumeMe((p) -> System.out.println((p.getAge() < 24 ? " Youngster" : " Really old")), pers);
  }

  private void consumeMe(Consumer<Person> pers, Person p){
    pers.accept(p);
  }
//----------------------------------------------------
  private Supplier<List<Person>> myPeople = () -> {
    List<Person> myPList = new ArrayList();
    myPList.add(new Person("Old Man",99));
    myPList.add(new Person("Andrie",21));
    myPList.add(new Person( "Pink Hat",23));
    myPList.add(new Person("Thakatso",21));
    return myPList;
  };

  private void supplierTest(){
    List<Person> ml = myPeople.get();
    for(Person p : ml){
      System.out.printf("Name: %s. Age: %d\n", p.getName(), p.getAge());
    }
    ml.stream().forEach(greetPerson);
    System.out.println(" *********************************");
    ml.stream().forEach((p) -> System.out.println((p.getAge() < 24 ? " Youngster" : " Really old")));
  }
//----------------------------------------------------
  Function<Integer, Integer> fun = (number) -> number * 10;
  Function<Integer, Integer> fun1 = (number) -> number + 32;
  Function<Integer, Integer> mulAndAdd = fun.andThen(fun1);

  private void functionTest(){
//    int ans = fun.apply(456);
//    System.out.println("And is " + ans);
//    System.out.println("-----------------------");
//    ans = mulAndAdd.apply(4);
//    System.out.println("And is " + ans);
//    System.out.println("-----------------------");
    System.out.println("And the Bi test is " + funBi.apply(21, 10));
  }
//----------------------------------------------------
  BiFunction<Integer, Integer, Double> funBi = (number1, number2) -> new Double(number1 * number2);
  //----------------------------------------------------
    
}
