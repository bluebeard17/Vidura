package com.falcon.vidura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DummyController {

    /**
     * This endpoint returns a dummy success response, useful for testing.
     *
     * @return a success message
     */
    @GetMapping("/dummy")
    public String getDummyResponse() {
        return "success";
    }
}




