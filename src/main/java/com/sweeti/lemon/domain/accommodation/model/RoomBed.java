package com.sweeti.lemon.domain.accommodation.model;

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
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.print.attribute.standard.MediaSize;
import java.math.BigInteger;
import java.time.ZonedDateTime;

@Getter
@Builder
@Entity
@Table(name = "room_bed")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomBed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_bed_id", columnDefinition = "bigint comment '룸배드ID'")
    private BigInteger id;
    @Column(name = "single_bed", columnDefinition = "tinyint(2) unsigned comment '싱글배드 수'")
    private int singleBed;
    @Column(name = "double_bed", columnDefinition = "tinyint(2) unsigned comment '싱글배드 수'")
    private int doubleBed;
    @Column(name = "double_sofa_bed", columnDefinition = "tinyint(2) unsigned comment '더블소파배드 수'")
    private int doubleSofaBed;
    @Column(name = "twin_bed", columnDefinition = "tinyint(2) unsigned comment '트윈배드 수'")
    private int twinBed;
    @Column(name = "queen_bed", columnDefinition = "tinyint(2) unsigned comment '퀸배드 수'")
    private int queenBed;
    @Column(name = "queen_murphy_bed", columnDefinition = "tinyint(2) unsigned comment '퀸머피배드 수'")
    private int queenMurphyBed;
    @Column(name = "large_twin_bed", columnDefinition = "tinyint(2) unsigned comment '라지 트윈 배드 수'")
    private int largeTwinBed;
    @Column(name = "king_bed", columnDefinition = "tinyint(2) unsigned comment '킹배드 수'")
    private int kingBed;
    @Column(name = "futons", columnDefinition = "tinyint(2) unsigned comment '매트리스'")
    private int futons;
    @Column(name = "bunk_bed", columnDefinition = "tinyint(2) unsigned comment '벙커배드 수'")
    private int bunkBed;
    @Column(name = "ondol", columnDefinition = "tinyint(2) unsigned comment '온돌'")
    private int ondol;
    @CreatedDate
    @Column(name = "created_at", columnDefinition = "datetime comment '생성일'")
    private ZonedDateTime createdAt;
    @CreatedBy
    @Column(name = "careted_by", columnDefinition = "varchar(2000) comment '생성자'")
    private String createdBy;
    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "datetime comment '수정일'")
    private ZonedDateTime updatedAt;
    @LastModifiedBy
    @Column(name = "updated_by", columnDefinition = "varchar(2000) comment '수정자'")
    private String updatedBy;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Room room;
}
