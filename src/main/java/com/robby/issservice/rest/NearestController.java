package com.robby.issservice.rest;

import com.robby.issservice.rest.dto.NearestPlacesDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("nearest")
public class NearestController {

    @GetMapping
    public ResponseEntity<Map<String, List<NearestPlacesDto>>> getNearestPlaces() {
        return ResponseEntity.ok(Collections.singletonMap("results", Collections.singletonList(NearestPlacesDto.builder()
                        .title("Place Name 1")
                        .latitude(Double.parseDouble("37.78916"))
                        .longitude(Double.parseDouble("-122.61458"))
                        .country("Philippines")
                .build())));
    }
}
