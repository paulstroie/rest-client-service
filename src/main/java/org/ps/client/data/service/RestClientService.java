package org.ps.client.data.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "${data.lake.name}", url = "${data.lake.url}")
public interface RestClientService {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/download/{map}/{key}")
    String getData(@PathVariable("map") DataTypes map, @PathVariable("key") String key);
}
