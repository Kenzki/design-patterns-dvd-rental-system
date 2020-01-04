package Member;

import Newsletters.Observer;

public class Member implements Observer {

    private String name;
    private String email;
    private String address;
    private String newsletter;

    public Member(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void update(String news) {
        this.newsletter = news;
        this.display();
    }

    private void display(){System.out.println("Hello " + name + ",todays upcoming movies and deals are ..... " + newsletter);}

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){ return name;}

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){ return email;}

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){ return address;}
}

