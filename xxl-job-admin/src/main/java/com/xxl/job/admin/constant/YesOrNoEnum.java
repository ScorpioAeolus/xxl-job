package com.xxl.job.admin.constant;

public enum YesOrNoEnum {
    NO(0),
    YES(1),
    ;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    YesOrNoEnum(Integer code) {
        this.code = code;
    }
}
