package com.jk.explore.controller;

import com.jk.explore.config.BasicDatasourceConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConfigurationPropertiesController {

    @Autowired
    private BasicDatasourceConfigProperties basicDatasourceConfigProperties;

    @ResponseBody
    @GetMapping("/basic-datasource-configuration-properties")
    public BasicDatasourceConfigProperties fetchProperties()  {
        return basicDatasourceConfigProperties;
    }

}
