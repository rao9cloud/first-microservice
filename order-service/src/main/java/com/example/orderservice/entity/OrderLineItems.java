package com.example.orderservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "t_order_line_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderLineItemId;
    private String skuCode;
    private Double price;
    private Integer quantity;
}
