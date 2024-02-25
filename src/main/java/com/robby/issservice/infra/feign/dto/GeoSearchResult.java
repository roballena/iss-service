package com.robby.issservice.infra.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoSearchResult {
    private String title;
    private double lat;
    private double lon;
    private String country;
}
