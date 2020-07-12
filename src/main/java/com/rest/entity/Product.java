package com.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String manufacturer;
    private String model;
    private String type;

//    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    private List<Category> category;

}
