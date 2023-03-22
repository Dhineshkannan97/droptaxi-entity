package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.UserType")
@Table(name = "USER_TYPE")
public class UserType {

  @Id
  @Column(name = "\"UT_USER_TYPE_ID\"", nullable = false)
  private String utUserTypeId;
  @Column(name = "\"UT_USER_TYPE_DESCRIPTION\"", nullable = false)
  private String utUserTypeDescription;
  @Column(name = "\"UT_ISACTIVE\"", nullable = false)
  private boolean utIsactive;
}