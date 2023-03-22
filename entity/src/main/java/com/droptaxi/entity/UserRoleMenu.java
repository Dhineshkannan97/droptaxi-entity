package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.UserRoleMenu")
@Table(name = "USER_ROLE_MENU")
public class UserRoleMenu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"URM_ID\"", nullable = false)
  private Integer urmId;
  @Column(name = "\"URM_MENU_ID\"", nullable = false)
  private Integer urmMenuId;
  @Column(name = "\"URM_USER_ROLE\"", nullable = false)
  private String urmUserRole;
  @Column(name = "\"URM_ACCESS\"", nullable = false)
  private String urmAccess;
}