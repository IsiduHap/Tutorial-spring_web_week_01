package lk.ac.iit.products_api;

public class Person {

    private String email;
    private String name;

    public Person(){

    }

    public Person(String email, String name){
        this.email=email;
        this.name=name;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}

