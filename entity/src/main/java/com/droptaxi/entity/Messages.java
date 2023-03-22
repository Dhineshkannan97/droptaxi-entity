package com.droptaxi.entity;

        import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.Messages")
@Table(name = "MESSAGES")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"ME_ID\"", nullable = false)
    private Integer meId;
    @Column(name = "\"ME_TEMPLATE_ID\"", nullable = false)
    private String meTemplateId;
    @Column(name = "\"ME_TEMPLATE\"", nullable = false)
    private String meTemplate;
    @Column(name = "\"ME_STATUS\"", nullable = false)
    private boolean meStatus;
    @Column(name = "\"ME_TEMPLATE_TYPE\"", nullable = false)
    private String meTemplate_Type;
    @Column(name = "\"ME_SMS_TYPE\"", nullable = true)
    private String meSmsType;
    @Column(name = "\"ME_USEDIN\"", nullable = false)
    private String meUsedIn;
    @Column(name = "\"ME_SUBJECT\"", nullable = false)
    private String meSubject;

    public void setId(Integer id) {
        meId = id;
    }
}