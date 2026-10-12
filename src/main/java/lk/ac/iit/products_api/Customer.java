package lk.ac.iit.products_api;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private Address address;

    public Customer(){}

    public Customer(Long id, String name, String email, Address address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
