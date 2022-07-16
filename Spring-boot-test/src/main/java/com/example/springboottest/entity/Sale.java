package com.example.springboottest.entity;

import com.example.springboottest.entity.enums.SaleSimpleStatus;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Sales")
public class Sale {
    @Id
    private String id;
    private String name;
    private Product productId;
    private String DOS;
    private SaleSimpleStatus status;
}
