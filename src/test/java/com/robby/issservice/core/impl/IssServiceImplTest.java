package com.robby.issservice.core.impl;

import com.robby.issservice.core.IssLocationService;
import com.robby.issservice.core.IssService;
import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class IssServiceImplTest {

    @Mock
    IssLocationService issLocationService;

    @Mock
    LandmarkService landmarkService;

    IssService service;

    @BeforeEach
    void setup() {
        service = new IssServiceImpl(issLocationService, landmarkService);
    }

    @Test
    void whenGetCurrentLocationThenReceiveCoordinates() {
        when(issLocationService.getCurrentLocation()).thenReturn(new Coordinates(1d, 1d));

        Coordinates currentLocation = service.getCurrentLocation();

        assertEquals(new Coordinates(1d, 1d), currentLocation);
    }

    @Test
    void whenGetLandmarksThenReceiveLandmarks() {
        when(landmarkService.getLandmarks(new Coordinates(1d, 1d))).thenReturn(
                Collections.singletonList(Landmark.builder()
                                .title("landmark")
                                .latitude(1d)
                                .longitude(1d)
                                .country("PH")
                        .build()));

        List<Landmark> landmarks = service.getLandmarks(new Coordinates(1d, 1d));

        assertEquals(
                Collections.singletonList(Landmark.builder()
                        .title("landmark")
                        .latitude(1d)
                        .longitude(1d)
                        .country("PH")
                        .build()),
                landmarks);
    }
}