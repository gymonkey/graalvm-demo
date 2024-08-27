package app.nebula.java_worker_demo;

import app.nebula.java_worker_demo.client.Client;
import app.nebula.java_worker_demo.mysql.Env;
import app.nebula.java_worker_demo.mysql.EnvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ExampleController {

    @Resource
    private Client client;

    @Resource(name = "jedis")
    private Jedis jedis;

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @Idempotent
    @GetMapping("/reflect")
    public String reflect(){
        return client.echo("");
    }

    @Idempotent
    @GetMapping("/setRedis")
    public String setRedis(){
        jedis.set("key1","value1");
        return "done";
    }

    @GetMapping("/getRedis")
    public String getRedis(){
//        return  "done";
       return jedis.get("key1");
    }

}
