package com.robby.issservice.rest;

import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Landmark;
import com.robby.issservice.rest.dto.LandmarkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("landmarks")
@RequiredArgsConstructor
public class LandmarkController {

    private final LandmarkService landmarkService;

    @GetMapping("/at/current")
    public ResponseEntity<Map<String, List<LandmarkDto>>> getPlacesAtCurrentLocation() {

        List<Landmark> placesAtCurrentLocation = landmarkService.getLandmarksAtCurrentLocation();

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
