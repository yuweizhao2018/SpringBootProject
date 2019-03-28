package com.isoftstone.example.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "customer_tb")
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid")
    @GeneratedValue(generator="idGenerator")
    private  String id;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "last_name")
    private  String lastName;

    @CreatedDate
    @Column(name = "create_time")
    private  Date createTime;

    @LastModifiedDate
    @Column(name = "modify_time")
    private  Date modifyTime;
}
