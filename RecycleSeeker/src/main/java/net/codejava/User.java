package net.codejava;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//MODEL 1
//User   called User includes: Firstname,lastname,email,password
@Entity
@Table(name = "users")  

public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name= "email", nullable = false, unique = true, length=100)
    private String email;

    @Column(name= "password",nullable = false, length=100)
    private String password;

    @Column(name= "Firstname",nullable = false, length=20)
    private String Firstname;

    @Column(name= "Lastname",nullable = false, length=20)
    private String Lastname;

    public User() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
         this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstname() {
        return Firstname;
    }
    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
