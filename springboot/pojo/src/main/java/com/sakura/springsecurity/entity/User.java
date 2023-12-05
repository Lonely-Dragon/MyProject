package com.sakura.springsecurity.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author sakura
 */
@Data
@ApiModel(value = "用户表")
public class User {
    
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private Integer username;
    @ApiModelProperty(value = "密码")
    private Integer pw;
    @ApiModelProperty(value = "名称")
    private Integer name;
    
    
}
