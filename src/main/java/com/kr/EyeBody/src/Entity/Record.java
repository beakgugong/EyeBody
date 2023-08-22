package com.kr.EyeBody.src.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Record {
    @Id
    @GeneratedValue()
    private Long id;
    private String fat;
    private String muscle;
    private Long UserId;
}
