package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private Integer price;

    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    // LAZY = 지연로딩 , EAGER = 즉시로딩 ( 모든 연관관계를 Join 하기때문에 오래걸림 ) 1 : 1 일 경우

    // LAZY = SELECT * FROM item where id = ?

    // EAGER
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    // private List<OrderDetail> orderDetailList;
}
