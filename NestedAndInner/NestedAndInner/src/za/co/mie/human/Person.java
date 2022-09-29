package za.co.mie.human;

import java.time.LocalDate;

public class Person{
  private String name;
  private Gender gender;
  private BirthCertificate birthCertificate;

  private Person(String name, Gender gender){
    this.name = name;
    this.gender = gender;
  }

  public Person(String name,
                Gender gender,
                LocalDate date,
                String momName,
                String dadName,
                String placeOB){
    this(name, gender);
    birthCertificate = new BirthCertificate(date, momName, dadName, placeOB);
  }

  public String getName(){
    return name;
  }

  public Gender getGender(){
    return gender;
  }

  public BirthCertificate getBirthCertificate(){
    return this.birthCertificate;
  }

  public class BirthCertificate{
    private final LocalDate date;
    private final String momName;
    private final String dadName;
    private final String placeOB;

    public BirthCertificate(LocalDate date, String momName, String dadName, String placeOB){
      this.date = date;
      this.momName = momName;
      this.dadName = dadName;
      this.placeOB = placeOB;
    }

    public LocalDate getDate(){
      return date;
    }

    public String getMomName(){
      return momName;
    }

    public String getDadName(){
      return dadName;
    }

    public String getPlaceOB(){
      return placeOB;
    }
  }
}
