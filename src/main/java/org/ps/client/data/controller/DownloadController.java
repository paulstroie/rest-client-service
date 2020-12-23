package org.ps.client.data.controller;


import org.ps.client.data.service.DataTypes;
import org.ps.client.data.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class DownloadController {

    @Autowired
    private RestClientService restClientService;

    @GetMapping(value = "/load/{map}/{key}")
    public String createRide(@PathVariable DataTypes map, @PathVariable String key){
        return restClientService.getData(map, key);
    }
}
