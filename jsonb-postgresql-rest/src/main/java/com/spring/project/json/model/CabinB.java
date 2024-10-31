package com.spring.project.json.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CabinB {

    private String name;
    private Integer maxCapacity;
    private String description;
    private Integer discount;
    private Integer regularPrice;
}