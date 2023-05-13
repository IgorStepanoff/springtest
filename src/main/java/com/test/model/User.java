package com.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;
    private String passwd;

    public User(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }


}
