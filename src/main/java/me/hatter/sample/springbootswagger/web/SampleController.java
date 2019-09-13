package me.hatter.sample.springbootswagger.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @ApiOperation(value = "Hello", notes = "Say Hello World!")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello() {
        return "Hello world!";
    }
}
