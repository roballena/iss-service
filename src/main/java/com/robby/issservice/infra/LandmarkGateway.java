package com.robby.issservice.infra;

import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class LandmarkGateway implements LandmarkService {
    @Override
    public List<Landmark> getLandmarks(Coordinates coordinates) {
        return Collections.singletonList(Landmark.builder()
                .title("Place Name 1")
                .latitude(Double.parseDouble("37.78916"))
                .longitude(Double.parseDouble("-122.61458"))
                .country("Philippines")
                .build());
    }
}
