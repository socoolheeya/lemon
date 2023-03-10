package com.sweeti.lemon.domain.packages.model;

import com.sweeti.lemon.common.constant.RoomStatus;
import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.accommodation.model.Room;
import com.sweeti.lemon.domain.booking.model.Booking;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Entity
@Table(name = "package")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PackageInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id", columnDefinition = "bigint comment '패키지ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) comment '패키지명'")
    private String name;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) comment '사용여부'")
    private Boolean useYn;
    @Column(name = "description", columnDefinition = "text comment '패키지 설명'")
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "room_status", columnDefinition = "varchar(50) comment '예약상태'")
    private RoomStatus roomStatus;
    @Column(name = "cost", columnDefinition = "decimal(20,5) comment '일반요금'")
    private BigDecimal cost;
    @Column(name = "discount_cost", columnDefinition = "decimal(20,5) comment '할인금액'")
    private BigDecimal discountCost;
    @Column(name = "total_cost", columnDefinition = "decimal(20,5) comment '총 요금'")
    private BigDecimal totalCost;
    @Builder.Default
    @OneToMany(mappedBy = "packageInfo")
    private List<PackageRoom> packageRooms = new ArrayList<>();
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Booking booking;
    @OneToOne(mappedBy = "packageInfo")
    private PackageOption packageOption;
}
