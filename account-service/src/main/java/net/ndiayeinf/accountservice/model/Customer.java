package net.ndiayeinf.accountservice.model;

import lombok.*;

@Getter @Setter @ToString
public class Customer {
    private Long id;
    private String firstName;
    private  String lastName;
    private  String email;
}
