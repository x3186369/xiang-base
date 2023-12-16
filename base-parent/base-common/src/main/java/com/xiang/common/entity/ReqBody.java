package com.xiang.common.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReqBody<T> {

    @NotNull(message = "用户类型 不能为空")
    private Integer userType;

    @NotBlank(message = "用户id 不能为空")
    private String userId;

    @NotNull(message = "数据对象 不能为空")
    private T data;

}
