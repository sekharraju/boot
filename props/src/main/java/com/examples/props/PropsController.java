package com.examples.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropsController {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/props/{key}",method = RequestMethod.GET)
    public String resolveProperty(@PathVariable("key") String key) {
        return environment.getProperty(key);
    }

}
