package com.xiang.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RespCodeEnum implements BaseStatus {
    HTTP(200, "请求成功"),
    ;
    private final int code;
    private final String desc;
}
