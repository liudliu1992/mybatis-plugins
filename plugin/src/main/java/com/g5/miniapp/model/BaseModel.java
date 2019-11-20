package com.g5.miniapp.model;

import lombok.Data;

import java.util.Date;

/**
 * @author liusl
 * @version 1.0
 * @date 2019/11/19 下午3:22
 */
@Data
public abstract class BaseModel {

    private Long id;
    private Integer version;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;
}
