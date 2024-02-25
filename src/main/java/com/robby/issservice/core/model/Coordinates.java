package com.robby.issservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Coordinates {
    private Double latitude;
    private Double longitude;
}
