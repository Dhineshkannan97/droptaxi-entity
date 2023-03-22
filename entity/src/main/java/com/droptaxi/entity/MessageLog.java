package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.MessageLog")
@Table(name = "MESSAGE_LOG")
public class MessageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"LOG_ID\"", nullable = false)
    private Integer mLogId;
    @Column(name = "\"FROM_EMAIL\"", nullable = false)
    private String mFromEmail;
    @Column(name = "\"TO_EMAIL\"", nullable = false)
    private String mToEmail;
    @Column(name = "\"EMAIL_STATUS\"", nullable = false)
    private boolean mEmailStatus;
    @Column(name = "\"TIME_SENT\"", nullable = false)
    private String mTimeSent;

}
