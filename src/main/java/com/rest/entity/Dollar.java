package com.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Daniel Mezzavilla
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dollar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String varBid;
    private String code;
    private String codein;
    private String name;
    private String high;
    private String low;
    private String pctChange;
    private String bid;
    private String ask;
    private String timestamp;
    private String create_date;

}
