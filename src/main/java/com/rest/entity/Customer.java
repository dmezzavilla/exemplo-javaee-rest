package com.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Daniel Mezzavilla
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String username;
    private String password;
    private String role;

}
