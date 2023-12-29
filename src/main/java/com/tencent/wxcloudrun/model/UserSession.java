package com.tencent.wxcloudrun.model;

import com.tencent.wxcloudrun.constant.PlatformHeader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSession implements Serializable {

    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 所在云环境ID
     */
    private String env;
    /**
     * 调用来源
     */
    private String source;

    /**
     * 小程序AppId
     */
    private String appId;
    /**
     * 小程序用户openId
     */
    private String openId;
    /**
     * 小程序用户unionId
     */
    private String unionId;

    /**
     * 使用方小程序 AppID
     */
    private String fromAppId;
    /**
     * 小程序用户 openId
     */
    private String fromOpenId;
    /**
     * 小程序用户 unionId
     */
    private String fromUnionId;

    public UserSession(HttpServletRequest request) {
        this.env = request.getHeader(PlatformHeader.ENV.toString());
        this.clientIp = request.getHeader(PlatformHeader.CLIENT_IP.toString());
        this.source = request.getHeader(PlatformHeader.SOURCE.toString());
        this.appId = request.getHeader(PlatformHeader.APPID.toString());
        this.openId = request.getHeader(PlatformHeader.OPENID.toString());
        this.unionId = request.getHeader(PlatformHeader.UNION_ID.toString());
        this.fromAppId = request.getHeader(PlatformHeader.FROM_APPID.toString());
        this.fromOpenId = request.getHeader(PlatformHeader.FROM_OPENID.toString());
        this.fromUnionId = request.getHeader(PlatformHeader.FROM_UNION_ID.toString());
    }
}
