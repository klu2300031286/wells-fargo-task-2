package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    public Client() {}

    public Client(Long id, String firstName, String lastName, Advisor advisor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisor = advisor;
    }

    public Long getId() { return id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
}