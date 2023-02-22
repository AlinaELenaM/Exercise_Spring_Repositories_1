package co.develhope.springrepositories1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private Long serialNumber;
    @Column(nullable = true)
    private Double currentPrice;
}