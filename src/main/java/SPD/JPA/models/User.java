package SPD.JPA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long ID;
    private String name;
    private String surname;
    private int age;
}
