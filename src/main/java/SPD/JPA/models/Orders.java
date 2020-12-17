package SPD.JPA.models;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private long ID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_ID")
    private User customer;
    private String orderName;
    private String description;
    private int orderValue;
}
