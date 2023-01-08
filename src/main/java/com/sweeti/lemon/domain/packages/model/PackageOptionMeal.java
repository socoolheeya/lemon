package com.sweeti.lemon.domain.packages.model;

import com.sweeti.lemon.common.constant.MealType;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Getter
@Builder
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PackageOptionMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_option_meal_id", columnDefinition = "bigint comment '패키지옵션식사_ID'")
    private BigInteger id;
    @Enumerated(EnumType.STRING)
    @Column(name = "meal_type", columnDefinition = "varchar(100) comment '식사 타입'")
    private MealType mealType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_option_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private PackageOption packageOption;
}
