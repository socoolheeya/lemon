package com.sweeti.lemon.domain.packages.model.http;

import com.sweeti.lemon.common.constant.RoomStatus;
import com.sweeti.lemon.domain.packages.model.PackageInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
public class PackageRequest {
    private String name;
    private Boolean useYn;
    private String description;
    private RoomStatus roomStatus;
    private BigDecimal cost;
    private BigDecimal discountCost;
    private BigDecimal totalCost;

    @Builder
    public PackageRequest(String name, Boolean useYn, String description, RoomStatus roomStatus, BigDecimal cost, BigDecimal discountCost, BigDecimal totalCost) {
        this.name = name;
        this.useYn = useYn;
        this.description = description;
        this.roomStatus = roomStatus;
        this.cost = cost;
        this.discountCost = discountCost;
        this.totalCost = totalCost;
    }

    public PackageInfo toEntity() {
        return PackageInfo.builder()
                .name(name)
                .useYn(useYn)
                .roomStatus(roomStatus)
                .cost(cost)
                .discountCost(discountCost)
                .totalCost(totalCost)
                .build();
    }
}
