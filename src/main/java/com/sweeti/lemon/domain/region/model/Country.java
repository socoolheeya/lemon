package com.sweeti.lemon.domain.region.model;

import com.sweeti.lemon.domain.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Getter
@Entity
@Builder
@Table(name = "country")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Country extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", columnDefinition = "bigint comment '국가ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(1000) comment '국가명'")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Region region;

    @OneToMany(mappedBy = "country")
    private List<City> cities;
}
