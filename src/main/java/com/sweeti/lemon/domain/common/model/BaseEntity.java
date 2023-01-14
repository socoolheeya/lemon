package com.sweeti.lemon.domain.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(name = "created_by", updatable = false, columnDefinition = "varchar(500) comment '생성자'")
    private String createdBy;
    @LastModifiedBy
    @Column(name = "updated_by", columnDefinition = "varchar(500) comment '수정자'")
    private String updatedBy;
}
