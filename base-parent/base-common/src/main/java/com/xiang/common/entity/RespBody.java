package com.xiang.common.entity;

import com.xiang.common.enums.BaseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespBody<T> implements BaseStatus {

    private int code;

    private String desc;

    private T data;

    public RespBody(BaseStatus status, T data) {
        this(status.getCode(), status.getDesc(), data);
    }

    public RespBody(BaseStatus status) {
        this(status.getCode(), status.getDesc(), null);
    }
}
