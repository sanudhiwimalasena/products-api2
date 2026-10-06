package lk.ac.iit.products_api2;

public class Person {
    private String name;
    private String email;

    public Person(){
    }

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}


