package com.tencent.wxcloudrun.holder;

import com.tencent.wxcloudrun.model.UserSession;

public class LocalUserHolder {
    private static final ThreadLocal<UserSession> LOCAL_USER_SESSION = new ThreadLocal<>();

    public static void set(UserSession userSession) {
        LOCAL_USER_SESSION.set(userSession);
    }

    public static UserSession get() {
        return LOCAL_USER_SESSION.get();
    }

    public static void remove() {
        LOCAL_USER_SESSION.remove();
    }

}
