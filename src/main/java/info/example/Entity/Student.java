package info.example.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name =  "name")
    private String name;
    @Column(name =  "email")
    private String email;
    @Column(name =  "password")
    private String password;
    @Column(name =  "regdate")
    private LocalDateTime regdate;

    public Student() {
    }


    public Student(long id, String name, String email, String password, LocalDateTime regdate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.regdate = regdate;
    }

    public Student(String name, String email, String password, LocalDateTime regdate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.regdate = regdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }
}
