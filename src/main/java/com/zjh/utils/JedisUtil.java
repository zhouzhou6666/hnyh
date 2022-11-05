package com.zjh.utils;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
    private final static JedisPool POOL;     //定义一个连接池的对象

    //初始化操作
    static {


        JedisPoolConfig config = new JedisPoolConfig(); // new 一个 连接池的配置对象

        config.setMaxTotal(50); // 设置连接池的最大数目（可选）
        config.setMaxIdle(10); // 设置空闲时连接池保有最大链接数目（可选）


        POOL= new JedisPool(config, "101.43.202.11",6379,null,"root123");   // 设置一个链接池对象



    }
    public static String getJedis(String key){

        return POOL.getResource().get(key);   // 从池中获取链接

    }

    public static String setRedis(String key,String value){
        return POOL.getResource().set(key,value);
    }

    public static String setRedisAll(String key,long time,String value){

        return POOL.getResource().setex(key,time,value);
    }


}