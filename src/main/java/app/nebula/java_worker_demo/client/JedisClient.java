package app.nebula.java_worker_demo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class JedisClient {

    @Bean(name = "jedis")
    public Jedis getJedis(){
        Jedis jedis = new Jedis("10.150.193.139", 6379, false);
//        jedis.auth("AX2zAAIjcDE2MWYzMTEwNGFiMWU0NGI3OTUyY2I5YmU5NTFhMzc1ZnAxMA");
        return jedis;
    }

}
