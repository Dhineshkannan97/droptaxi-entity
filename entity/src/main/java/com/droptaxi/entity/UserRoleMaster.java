package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.UserRoleMaster")
@Table(name = "USER_ROLE_MASTER")
public class UserRoleMaster {

  @Id
  @Column(name = "\"URM_ROLE_ID\"", nullable = false)
  private String urmRoleId;
  @Column(name = "\"URM_ROLE_DESCRIPTION\"", nullable = false)
  private String urmRoleDescription;
  @Column(name = "\"URM_USER_TYPE_ID\"", nullable = false)
  private String urmUserTypeId;
  @Column(name = "\"URM_ISACTIVE\"", nullable = false)
  private boolean urmIsactive;
}