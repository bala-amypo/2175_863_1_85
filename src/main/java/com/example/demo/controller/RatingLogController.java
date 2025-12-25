package com.example.demo.controller;

import com.example.demo.entity.RatingLog;
import com.example.demo.service.RatingLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class RatingLogController {

    private final RatingLogService logService;

    public RatingLogController(RatingLogService logService) {
        this.logService = logService;
    }

    @PostMapping("/{propertyId}")
    public RatingLog addLog(@PathVariable Long propertyId,
                            @RequestBody String message) {
        return logService.addLog(propertyId, message);
    }

    @GetMapping("/{propertyId}")
    public List<RatingLog> getLogs(@PathVariable Long propertyId) {
        return logService.getLogsByProperty(propertyId);
    }
}