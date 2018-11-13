package com.taotao.rest.dao;
/**
 * 为了方便集群和单击的使用方便，用接口I进行不同实现
 * @author bee
 *
 */
public interface JedisClient {

	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String hkey, String key, String value);
	long incr(String key);
	long expire(String key, int second);//设置过期时间
	long ttl(String key);
	long del(String key);
	long hdel(String hkey, String key);
	
}
