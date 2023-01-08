package com.sweeti.lemon.domain.accommodation.model;


import com.sweeti.lemon.common.constant.RoomView;
import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.accommodation.model.dto.RoomDto;
import com.sweeti.lemon.domain.packages.model.PackageInfo;
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
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) comment '방 이름'")
    private String name;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) comment '사용여부'")
    private Boolean useYn;
    @Column(name = "room_count", columnDefinition = "tinyint(2) unsigned comment '방 갯수'")
    private int roomCount;
    @Column(name = "living_count", columnDefinition = "tinyint(2) unsigned comment '거실 수'")
    private int livingCount;
    @Column(name = "bathroom_count", columnDefinition = "tinyint(2) unsigned comment '욕실 수'")
    private int bathroomCount;
    @Column(name = "adult_count", columnDefinition = "tinyint(3) unsigned comment '어른 인원 수'")
    private int adultCount;
    @Column(name = "children_count", columnDefinition = "tinyint(3) unsigned comment '어린이 인원 수'")
    private int childrenCount;
    @Column(name = "max_occupancy", columnDefinition = "tinyint(3) unsigned comment '최대 인원'")
    private int maxOccupancy;
    @Column(name = "min_occupancy", columnDefinition = "tinyint(3) unsigned comment '최소 인원'")
    private int minOccupancy;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "is_smoking", columnDefinition = "char(1) comment '흡연 여부'")
    private Boolean isSmoking;
    @Enumerated(EnumType.STRING)
    @Column(name = "room_view", columnDefinition = "varchar(100) comment '뷰 종류'")
    private RoomView roomView;
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

    @OneToMany(mappedBy = "room")
    private List<RoomBed> roomBeds = new ArrayList<>();

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
