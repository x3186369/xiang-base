package com.xiang.common.exception;

import com.xiang.common.enums.BaseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException implements BaseStatus {

    private final int code;
    private final String desc;

    public CustomException(BaseStatus status) {
        this(status.getCode(), status.getDesc());
    }

    public CustomException(BaseStatus status, String message) {
        super(message);
        this.code = status.getCode();
        this.desc = status.getDesc();
    }

    public CustomException(BaseStatus status, Throwable e) {
        super(e);
        this.code = status.getCode();
        this.desc = status.getDesc();
    }
}
