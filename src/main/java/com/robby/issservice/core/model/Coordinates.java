package com.robby.issservice.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coordinates {
    private Double longitude;
    private Double latitude;
}
