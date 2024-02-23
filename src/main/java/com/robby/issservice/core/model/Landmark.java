package com.robby.issservice.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Landmark {
    private String title;
    private Double longitude;
    private Double latitude;
    private String country;
}
