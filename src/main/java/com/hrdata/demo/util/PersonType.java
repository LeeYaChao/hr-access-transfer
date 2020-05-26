package com.hrdata.demo.util;

import lombok.Getter;


public enum PersonType {
    /**
     * 0	ZZ	在职
     * 1	LT	离退
     * 3	DF	地方
     * 4	LW	劳务
     * 5	BW	编外
     */
    ZZ("0","ZZ"),
    LT("1","LT"),
    DF("3","DF"),
    LW("4","LW"),
    BW("5","BW");
     PersonType(String code, String value){
        this.code = code;
        this.value = value;
    }
    @Getter
    private String code;
    @Getter
    private String value;
}
