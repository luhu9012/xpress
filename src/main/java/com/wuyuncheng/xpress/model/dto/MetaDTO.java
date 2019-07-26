package com.wuyuncheng.xpress.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MetaDTO implements Serializable {

    private String name;
    private String slug;
    private String description;

}