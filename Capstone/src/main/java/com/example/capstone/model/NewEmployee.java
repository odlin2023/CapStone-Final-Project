package com.example.capstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "new_employee")
public class NewEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String confirmed_password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String email;

    private String description;

    private String role;



    public NewEmployee() {
    }

    public NewEmployee(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role=role;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmed_password() {
        return confirmed_password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmed_password(String confirmed_password) {
        this.confirmed_password = confirmed_password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
