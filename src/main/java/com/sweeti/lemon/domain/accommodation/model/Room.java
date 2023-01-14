package com.sweeti.lemon.domain.accommodation.model;


import com.sweeti.lemon.common.constant.RoomView;
import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.accommodation.model.dto.RoomDto;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import com.sweeti.lemon.domain.packages.model.PackageRoom;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Room extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", columnDefinition = "bigint comment 'Room ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) comment '방 이름'")
    private String name;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) comment '사용여부'")
    private Boolean useYn;
    @Column(name = "room_count", columnDefinition = "tinyint(2) unsigned comment '방 갯수'")
    private Integer roomCount;
    @Column(name = "living_count", columnDefinition = "tinyint(2) unsigned comment '거실 수'")
    private Integer livingCount;
    @Column(name = "bathroom_count", columnDefinition = "tinyint(2) unsigned comment '욕실 수'")
    private Integer bathroomCount;
    @Column(name = "adult_count", columnDefinition = "tinyint(3) unsigned comment '어른 인원 수'")
    private Integer adultCount;
    @Column(name = "children_count", columnDefinition = "tinyint(3) unsigned comment '어린이 인원 수'")
    private Integer childrenCount;
    @Column(name = "max_occupancy", columnDefinition = "tinyint(3) unsigned comment '최대 인원'")
    private Integer maxOccupancy;
    @Column(name = "min_occupancy", columnDefinition = "tinyint(3) unsigned comment '최소 인원'")
    private Integer minOccupancy;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "is_smoking", columnDefinition = "char(1) comment '흡연 여부'")
    private Boolean isSmoking;
    @Enumerated(EnumType.STRING)
    @Column(name = "room_view", columnDefinition = "varchar(100) comment '뷰 종류'")
    private RoomView roomView;
    @Builder.Default
    @OneToMany(mappedBy = "room")
    private List<RoomBed> roomBeds = new ArrayList<>();
    @Builder.Default
    @OneToMany(mappedBy = "room")
    private List<PackageRoom> packageRooms = new ArrayList<>();

    public static Room ofRoom(RoomDto roomDto) {
        return Room.builder()
                .name(roomDto.getName())
                .useYn(roomDto.getUseYn())
                .roomCount(roomDto.getRoomCount())
                .livingCount(roomDto.getLivingCount())
                .bathroomCount(roomDto.getBathroomCount())
                .adultCount(roomDto.getAdultCount())
                .childrenCount(roomDto.getChildrenCount())
                .maxOccupancy(roomDto.getMaxOccupancy())
                .minOccupancy(roomDto.getMinOccupancy())
                .isSmoking(roomDto.getIsSmoking())
                .roomView(roomDto.getRoomView())
                .build();
    }





}
