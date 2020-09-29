package firstSpring;


import java.util.*;

public class Person {
    Integer id;
    String name;
    String [] emails;
    Set<String> tels;
    List<String> address;
    Map<String,String> qqs;
    Properties p;
    Car car;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + Arrays.toString(emails) +
                ", tels=" + tels +
                ", address=" + address +
                ", qqs=" + qqs +
                ", p=" + p +
                ", car=" + car +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
