package com.robby.issservice.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NearestPlacesDto {
    private String title;
    private Double longitude;
    private Double latitude;
    private String country;
}
