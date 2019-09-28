package com.wuyuncheng.xpress.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PostDTO implements Serializable {

//    private String status;
//    private Integer authorId;
//    private Integer categoryId;
//    private String title;
//    private String content;
//    private String slug;
//    private Boolean isAllowComments;
//    private Integer modified;

    private Integer postId;
    private String status;
    private Integer authorId;
    private Integer categoryId;
    private String title;
    private String content;
    private String slug;
    private Boolean isAllowComments;
    private Integer commentsCount;
    private Integer modified;

}
