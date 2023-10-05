package org.mql.dev.devopsintegration.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private  String phoneNumer;
}
