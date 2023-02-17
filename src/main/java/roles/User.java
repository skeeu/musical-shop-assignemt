package roles;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private Integer balance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Role role;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getBalance() {
        return balance;
    }
}