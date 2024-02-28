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
    public Coordinates getCurrentLocation() {
        log.info("Fetching ISS current location");

        Coordinates currentLocation = issLocationService.getCurrentLocation();
        //todo handle exception from getCurrentLocation

        log.info("ISS current location: {}", currentLocation);

        return currentLocation;
    }

    @Override
    public List<Landmark> getLandmarks(Coordinates coordinates) {
        log.info("Fetching nearest landmarks base on coordinates: {}", coordinates);

        List<Landmark> landmarks = landmarkService.getLandmarks(coordinates);
        //todo handle exception from getLandmarks

        log.info("Landmarks at coordinates: {}", landmarks);

        return landmarks;
    }
}
