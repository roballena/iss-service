package com.robby.issservice.rest;

import com.robby.issservice.core.IssService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("iss")
@RequiredArgsConstructor
@Slf4j
public class IssController {

    private final IssService issService;

    @GetMapping("/landmarks")
    public ResponseEntity<Map<String, Object>> getLandmarksAtCurrentLocation() {

        log.info("Received request for getLandmarksAtCurrentLocation");

        Coordinates currentLocation = issService.getCurrentLocation();
        List<Landmark> placesAtCurrentLocation = issService.getLandmarks(currentLocation);

        Map<String, Object> response = new HashMap<>();
        response.put("currentLocation", currentLocation);
        response.put("results", placesAtCurrentLocation);

        return ResponseEntity.ok(response);
    }
}
