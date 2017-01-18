package com.sababa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Used to verify that the service is running.
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    private static final String MESSAGE = "I'm up and healthy in every way";

    /**
     * Return a friendly message that confirms that the service is A-OK.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getStatus() {
        return MESSAGE;
    }
}
