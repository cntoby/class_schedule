package com.tencent.wxcloudrun.constant;

import lombok.Getter;

@Getter
public enum PlatformHeader {

    APPID("X-WX-APPID"),
    OPENID("X-WX-OPENID"),
    UNION_ID("X-WX-UNIONID"),

    FROM_APPID("X-WX-FROM-APPID"),
    FROM_OPENID("X-WX-FROM-OPENID"),
    FROM_UNION_ID("X-WX-FROM-UNIONID"),

    ENV("X-WX-ENV"),
    SOURCE("X-WX-SOURCE"),
    CLIENT_IP("X-Forwarded-For");

    private final String header;

    PlatformHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return header;
    }
}
