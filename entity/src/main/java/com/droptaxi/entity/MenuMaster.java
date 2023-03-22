package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.MenuMaster")
@Table(name = "MENU_MASTER")
public class MenuMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"MM_MENU_ID\"", nullable = false)
  private Integer mmMenuId;
  @Column(name = "\"MM_MENU_NAME\"", nullable = false)
  private String mmMenuName;
  @Column(name = "\"MM_MENU_TARGET\"", nullable = false)
  private String mmMenuTarget;
  @Column(name = "\"MM_MENU_PARENT_MENU\"", nullable = true)
  private Integer mmMenuParentMenu;
}