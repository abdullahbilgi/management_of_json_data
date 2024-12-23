package com.spring.project.json.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean isPaid;
    private Float cabinPrice;
    private Float extrasPrice;
    private Float totalPrice;
    private String status;
    private Date startDate;
    private Date endDate;
    private Boolean isBreakfast;
    private Integer numNights;
    private Integer numGuests;

    @ManyToOne
    @JoinColumn(name = "user_id" ,nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "cabin_id",nullable = false)
    private Cabin cabin;


}
