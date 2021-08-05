package ar.com.api.biblioteca.entities;

import java.util.Date;

import javax.persistence.*;


import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer user_id;

    @NaturalId
    private String username;

    private String password;

    private String email;

    @Column(name = "login_date")
    private Date loginDate;

    @Column(name = "user_type")
    private Integer userType;

    private Staff staff;

    private Member member;

    
}
