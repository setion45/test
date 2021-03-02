package com.goverdovsky.bank.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * ФИО
     */
    @Column(name = "name")
    String name;

    /**
     * Телефоный номер
     */
    @Column(name = "telephone_number")
    String telephoneNumber;

    /**
     * Электронная почта
     */
    @Column(name = "email")
    String email;

    /**
     * Номер паспорта
     */
    @Column(name = "passport_number")
    String passportNumber;

}
