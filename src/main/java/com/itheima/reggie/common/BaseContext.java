package com.itheima.reggie.common;

/**
 * 基于ThreadLocal封装工具类，用户名保存和获取当前登陆用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置id
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取id
     * @return
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
