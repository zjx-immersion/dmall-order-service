package com.dmall.order.domain.model;

import com.dmall.order.domain.common.ValueObject;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name="jx_order_item")
@Entity
public class OrderItem implements ValueObject<OrderItem> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;


    private Integer amount;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @OneToOne(cascade=CascadeType.ALL, mappedBy = "orderItem",fetch = FetchType.EAGER)
    private SkuSnapShot skuSnapShot;

    public OrderItem() {
    }

    @Override
    public boolean sameValueAs(OrderItem other) {
        return other.id.equals(id);
    }


}
