package entities;

public class Borrower {
    private int laanerId;
    private String name;
    private String address;
    private int postNr;
    private String city;

    public Borrower(int laanerId, String name, String address, int postNr) {
        this.laanerId = laanerId;
        this.name = name;
        this.address = address;
        this.postNr = postNr;
    }

    public Borrower(int laanerId, String name, String address, int postNr, String city) {
        this.laanerId = laanerId;
        this.name = name;
        this.address = address;
        this.postNr = postNr;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLaanerId() {
        return laanerId;
    }

    public void setLaanerId(int laanerId) {
        this.laanerId = laanerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(int postNr) {
        this.postNr = postNr;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "laanerId=" + laanerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postNr=" + postNr +
                ", city='" + city + '\'' +
                '}';
    }
}
