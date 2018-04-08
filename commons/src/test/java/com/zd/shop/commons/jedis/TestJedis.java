/*
package com.zd.shop.commons.jedis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

public class TestJedis {
    @Test
    public void test1(){
        Jedis jedis = new Jedis("47.94.20.43",6379);
        jedis.set("abc","123");
        jedis.close();
    }

    @Test
    public void test2(){
        JedisPool jedisPool = new JedisPool("47.94.20.43",6379);
        Jedis jedis = jedisPool.getResource();
        System.out.println(jedis.get("name"));
        jedisPool.close();
    }

    @Test
    public void test3(){
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("47.94.20.43",9001));
        nodes.add(new HostAndPort("47.94.20.43",9002));
        nodes.add(new HostAndPort("47.94.20.43",9003));
        nodes.add(new HostAndPort("47.94.20.43",9004));
        nodes.add(new HostAndPort("47.94.20.43",9005));
        nodes.add(new HostAndPort("47.94.20.43",9006));
        JedisCluster jedisCluster = new JedisCluster(nodes);
        System.out.println(jedisCluster.get("name"));
        jedisCluster.close();
    }
}


*/
