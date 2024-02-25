package com.robby.issservice.core;

import com.robby.issservice.core.model.Landmark;

import java.util.List;

public interface IssService {
    List<Landmark> getLandmarksAtCurrentLocation();
}
