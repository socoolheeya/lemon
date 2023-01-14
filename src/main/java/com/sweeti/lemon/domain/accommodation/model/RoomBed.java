package com.sweeti.lemon.domain.accommodation.model;

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
@Table(name = "room_bed")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomBed extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_bed_id", columnDefinition = "bigint comment '룸배드ID'")
    private BigInteger id;
    @Column(name = "single_bed", columnDefinition = "tinyint(2) unsigned comment '싱글배드 수'")
    private Integer singleBed;
    @Column(name = "double_bed", columnDefinition = "tinyint(2) unsigned comment '싱글배드 수'")
    private Integer doubleBed;
    @Column(name = "double_sofa_bed", columnDefinition = "tinyint(2) unsigned comment '더블소파배드 수'")
    private Integer doubleSofaBed;
    @Column(name = "twin_bed", columnDefinition = "tinyint(2) unsigned comment '트윈배드 수'")
    private Integer twinBed;
    @Column(name = "queen_bed", columnDefinition = "tinyint(2) unsigned comment '퀸배드 수'")
    private Integer queenBed;
    @Column(name = "queen_murphy_bed", columnDefinition = "tinyint(2) unsigned comment '퀸머피배드 수'")
    private Integer queenMurphyBed;
    @Column(name = "large_twin_bed", columnDefinition = "tinyint(2) unsigned comment '라지 트윈 배드 수'")
    private Integer largeTwinBed;
    @Column(name = "king_bed", columnDefinition = "tinyint(2) unsigned comment '킹배드 수'")
    private Integer kingBed;
    @Column(name = "futons", columnDefinition = "tinyint(2) unsigned comment '매트리스'")
    private Integer futons;
    @Column(name = "bunk_bed", columnDefinition = "tinyint(2) unsigned comment '벙커배드 수'")
    private Integer bunkBed;
    @Column(name = "ondol", columnDefinition = "tinyint(2) unsigned comment '온돌'")
    private Integer ondol;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Room room;
}
