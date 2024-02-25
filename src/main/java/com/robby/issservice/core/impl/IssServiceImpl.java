package com.robby.issservice.core.impl;

import com.robby.issservice.core.IssLocationService;
import com.robby.issservice.core.IssService;
import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class IssServiceImpl implements IssService {

    private final IssLocationService issLocationService;
    private final LandmarkService landmarkService;

    @Override
    public List<Landmark> getLandmarksAtCurrentLocation() {

        log.info("Fetching ISS current location");

        Coordinates currentLocation = issLocationService.getCurrentLocation();

        log.info("ISS current location: {}", currentLocation);

        log.info("Fetching landmarks base on current location");

        List<Landmark> landmarks = landmarkService.getLandmarks(currentLocation);

        log.info("Landmarks at current location: {}", landmarks);

        return landmarks;
    }
}
