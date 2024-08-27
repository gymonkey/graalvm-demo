package app.nebula.java_worker_demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "client", url = "https://www.baidu.com/")
public interface Client {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String echo(@PathVariable("name") String name);

}
