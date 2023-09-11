package hibernate_one_to_many.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee1toN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String surname;


    @Column(name = "salary")
    private int salary;

    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH})
    @JoinColumn(name = "department_id")
    private Department1toN department1ToN;

    public Employee1toN() {
    }

    public Employee1toN(String firstName, String surname, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department1toN getDepartment() {
        return department1ToN;
    }

    public void setDepartment(Department1toN department1ToN) {
        this.department1ToN = department1ToN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
