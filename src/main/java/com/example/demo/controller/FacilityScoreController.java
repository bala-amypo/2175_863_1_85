package com.example.demo.controller;

import com.example.demo.entity.FacilityScore;
import com.example.demo.service.FacilityScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
public class FacilityScoreController {

    private final FacilityScoreService scoreService;

    public FacilityScoreController(FacilityScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping("/{propertyId}")
    public FacilityScore addScore(@PathVariable Long propertyId,
                                  @RequestBody FacilityScore score) {
        return scoreService.addScore(propertyId, score);
    }

    @GetMapping("/{propertyId}")
    public FacilityScore getScore(@PathVariable Long propertyId) {
        return scoreService.getScoreByProperty(propertyId);
    }
}