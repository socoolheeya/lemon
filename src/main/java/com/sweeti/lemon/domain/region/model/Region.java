package com.sweeti.lemon.domain.region.model;

import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import com.sweeti.lemon.domain.region.model.http.RegionRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Converter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Builder
@Entity
@Table(name = "region")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Region extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", columnDefinition = "bigint comment '리전ID'")
    private BigInteger id;

    @Column(name = "region_name", columnDefinition = "varchar(500) comment '리전 이름'")
    private String name;

    @Convert(converter = BooleanToYnConverter.class)
    @Column(name ="use_yn", columnDefinition = "char(1) default 'N' comment '사용여부'")
    private Boolean useYn;

    @OneToMany(mappedBy = "region")
    private List<Country> countries;

    public static Region toEntitiy(RegionRequest request) {
        return Region.builder()
                .id(request.getId())
                .name(request.getName())
                .useYn(request.getUseYn())
                .build();
    }


}
