package org.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.todo.entity.Record;
import org.todo.entity.RecordStatus;
import org.todo.service.RecordService;

import java.util.List;

@Controller


public class CommonController {
    private final RecordService recordService;

    public CommonController(RecordService recordService) {
        this.recordService = recordService;
    }

    @RequestMapping("/home")
    public String getMainPage(Model model){
        List<Record> records = recordService.findAllRecords();
        int numOfDoneRec = (int) records.stream().filter(record -> record.getStatus() == RecordStatus.DONE).count();
        int numOfActiveRec = (int) records.stream().filter(record -> record.getStatus() == RecordStatus.ACTIVE).count();

        model.addAttribute("numOfDoneRec", numOfDoneRec);
        model.addAttribute("numOfActiveRec", numOfActiveRec);
        return "main-page";

    }

}
