package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio() {}

    public Portfolio(Long id, Client client) {
        this.id = id;
        this.client = client;
    }

    public Long getId() { return id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}