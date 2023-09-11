package hibernate_one_to_one.entity;

import javax.persistence.*;
import javax.persistence.CascadeType;

@Entity
@Table( name ="details")
public class Detail1to1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "city")
    private String city;


    @Column(name = "phone_number")
    private String phoneNumber;


    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetail1to1", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee1to1 employee1to1;

    public Detail1to1() {
    }

    public Detail1to1(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee1to1 getEmployee() {
        return employee1to1;
    }

    public void setEmployee(Employee1to1 employee1to1) {
        this.employee1to1 = employee1to1;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
