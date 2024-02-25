package com.robby.issservice.core;

import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;

import java.util.List;

public interface IssService {
    Coordinates getCurrentLocation();
    List<Landmark> getLandmarks(Coordinates coordinates);
}
