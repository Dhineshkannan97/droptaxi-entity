package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity(name = "com.droptaxi.entity.NewCustomers")
@Table(name = "NEW_CUSTOMERS")
public class NewCustomers {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NC_ID\"", nullable = false)
  private Integer ncId;
  @Column(name = "\"NC_DATE\"", nullable = false)
  private Date ncDate;
  @Column(name = "\"NC_COUNT\"", nullable = false)
  private Integer ncCount;
}