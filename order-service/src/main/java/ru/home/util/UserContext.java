package ru.home.util;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
    public static final String CORRELATION_ID = "scl-correlation-id";
    public static final String AUTH_TOKEN     = "Authorization";
    public static final String USER_ID        = "scl-user-id";
    public static final String TYPE           = "scl-type";

    private static final ThreadLocal<String> correlationId = new ThreadLocal<>();
    private static final ThreadLocal<String> authToken = new ThreadLocal<>();
    private static final ThreadLocal<String> userId = new ThreadLocal<>();
    private static final ThreadLocal<String> type = new ThreadLocal<>();

    public static String getCorrelationId() { return correlationId.get();}
    public static void setCorrelationId(String corrId) {
        correlationId.set(corrId);
    }

    public static String getAuthToken() {
        return authToken.get();
    }

    public static void setAuthToken(String authT) {
        authToken.set(authT);
    }

    public static String getUserId() {
        return userId.get();
    }

    public static void setUserId(String uId) {
        userId.set(uId);
    }

    public static String getType() {
        return type.get();
    }

    public static void setType(String t) {
        type.set(t);
    }
}