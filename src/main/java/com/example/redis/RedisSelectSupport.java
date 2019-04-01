package com.example.redis;

/**
 * author huangtuL
 */
public class RedisSelectSupport {
    private static final ThreadLocal<Integer> SELECT_CONTEXT = new ThreadLocal<>();

    public static void select(int db){
        SELECT_CONTEXT.set(db);
    }

    public static Integer getSelect(){
        return SELECT_CONTEXT.get();
    }
}
