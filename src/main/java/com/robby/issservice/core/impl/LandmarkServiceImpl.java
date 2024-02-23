package com.robby.issservice.core.impl;

import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Landmark;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LandmarkServiceImpl implements LandmarkService {

    @Override
    public List<Landmark> getLandmarksAtCurrentLocation() {
        return Collections.singletonList(Landmark.builder()
                .title("Place Name 1")
                .latitude(Double.parseDouble("37.78916"))
                .longitude(Double.parseDouble("-122.61458"))
                .country("Philippines")
                .build());
    }
}
