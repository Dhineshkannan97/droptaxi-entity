package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.CustomerFeedback")
@Table(name = "CUSTOMER_FEEDBACK")
public class CustomerFeedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CFB_ID\"", nullable = false)
  private Integer cfbId;
  @Column(name = "\"CFB_JOURNEY_ID\"", nullable = false)
  private String cfbJourneyId;
  @Column(name = "\"CFB_COMMENTS\"", nullable = false)
  private String cfbComments;
  @Column(name = "\"CFB_RATING\"", nullable = false)
  private Integer cfbRating;
}