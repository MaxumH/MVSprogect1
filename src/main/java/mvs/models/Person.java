package mvs.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    private int id;
    @Email
    @NotEmpty(message = "Not Empty")
    private String email;
    @Min(value=0,message = "Age should be hiegher than 0")
    private int age;
    @Size(min = 0,max = 30, message = "name can not be shorter then 0 characters")
    @NotEmpty(message = "Not Empty")
    private String name;

    public Person(){}

    public Person(int id, String name, String email,int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}