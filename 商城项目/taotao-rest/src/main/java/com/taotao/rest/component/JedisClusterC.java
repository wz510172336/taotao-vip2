package com.taotao.rest.component;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.JedisCluster;

public class JedisClusterC implements Jedisimp {
@Autowired
private JedisCluster jedisCluster;
	@Override
	public String get(String key) {
		return jedisCluster.get(key);
		
	}

	@Override
	public String set(String key, String value) {
		return jedisCluster.set(key,value);
	}

	@Override
	public Long hset(String key, String item, String value) {
		 return jedisCluster.hset(key,item,value);
	}

	@Override
	public String hget(String key, String item) {
		return jedisCluster.hget(key,item);
	}

	@Override
	public Long incr(String key) {
		return jedisCluster.incr(key);
	}

	@Override
	public Long decr(String key) {
		return jedisCluster.decr(key);
	}

	

	@Override
	public Long expire(String key, int sencond) {
		return jedisCluster.expire(key,sencond);
	}

	@Override
	public Long hdel(String key, String item) {
		return jedisCluster.hdel(key,item);
	}

}
