package com.greatminds.ayni.shopping.domain.model.aggregates;

import com.greatminds.ayni.management.domain.model.entities.Product;
import com.greatminds.ayni.shopping.domain.model.entities.Sale;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "rates")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    private Long rate;

    @Getter
    private String date;

    @Getter
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Sale product;

    @Getter
    private Long userId;

    public Rate() {
    }

    public Rate(Long rate, String date, Sale product, Long userId) {
        this.rate = rate;
        this.date = date;
        this.product = product;
        this.userId = userId;
    }
}
