package com.robby.issservice.rest;

import com.robby.issservice.core.IssService;
import com.robby.issservice.core.model.Landmark;
import com.robby.issservice.rest.dto.LandmarkDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("iss")
@RequiredArgsConstructor
@Slf4j
public class IssController {

    private final IssService issService;

    @GetMapping("/landmarks")
    public ResponseEntity<Map<String, List<LandmarkDto>>> getLandmarksAtCurrentLocation() {

        log.info("Received request for getLandmarksAtCurrentLocation");

        List<Landmark> placesAtCurrentLocation = issService.getLandmarksAtCurrentLocation();

        return ResponseEntity.ok(Collections.singletonMap("results",
                placesAtCurrentLocation.stream().map(place -> LandmarkDto.builder()
                        .title(place.getTitle())
                        .country(place.getCountry())
                        .longitude(place.getLongitude())
                        .latitude(place.getLatitude())
                        .build()
                ).toList()));
    }
}
