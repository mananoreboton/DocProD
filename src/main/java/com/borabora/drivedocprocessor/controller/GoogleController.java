package com.borabora.drivedocprocessor.controller;

import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestOperations;

import java.util.Map;

/**
 * Borabora Systems
 * Created by mananoreboton on 17/08/14.
 */
@Controller
public class GoogleController {

    @Autowired
    private RestOperations googleRestTemplate;

    @RequestMapping("/google")
    public String calendar(Map<String, Object> model) throws Exception {

        String dataUri = "https://www.googleapis.com/calendar/v3/users/me/calendarList?minAccessRole=writer";
        String info = googleRestTemplate.getForObject(dataUri, String.class);


        model.put("title", info.toString());
        return "google";
    }

    public void setGoogleRestTemplate(RestOperations googleRestTemplate) {
        this.googleRestTemplate = googleRestTemplate;
    }
}
