package com.borabora.drivedocprocessor.controller;

import com.borabora.googleapi.model.drive.FileList;
import com.borabora.googleapi.model.drive.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestOperations;

import java.util.ArrayList;
import java.util.List;
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
        final ArrayList<String> summaries = new ArrayList<String>();

        //String dataUri = "https://www.googleapis.com/calendar/v3/users/me/calendarList?minAccessRole=writer";
        //String info = googleRestTemplate.getForObject(dataUri, String.class);

        /*ObjectMapper mapper = new ObjectMapper();
        CalendarList calendarList = mapper.readValue(info, CalendarList.class);
        final List<Item> items = calendarList.getItems();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            summaries.add(item.getSummary());
        }*/
        String docdataFilter = "?maxResults=2";
        //String docdataFilter = "";
        String docDataUri = "https://www.googleapis.com/drive/v2/files" + docdataFilter;
        String docInfo = googleRestTemplate.getForObject(docDataUri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        FileList calendarList = mapper.readValue(docInfo, FileList.class);
        List<Item> items = calendarList.getItems();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            summaries.add(item.getTitle());
        }

        model.put("summaries", summaries);
        return "google";
    }

    public void setGoogleRestTemplate(RestOperations googleRestTemplate) {
        this.googleRestTemplate = googleRestTemplate;
    }
}
