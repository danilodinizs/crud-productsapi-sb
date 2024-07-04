package com.danilodinizs.springboot.models;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    UUID idProduct;
    String name;
    BigDecimal value;


}