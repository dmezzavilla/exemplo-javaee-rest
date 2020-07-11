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
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String uf;
    private String complemento;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String ibge;
    private String unidade;
    private String gia;
    private String cep;

}
