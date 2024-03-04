package com.example.springapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Table(name="empp")
public class Employee {
    @Id
    int id;
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="addressId")
    Address address;
}
