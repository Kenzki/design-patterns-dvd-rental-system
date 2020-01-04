package Member;


public class Member {

    private String name;
    private String email;
    private String address;

    public Member(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

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

