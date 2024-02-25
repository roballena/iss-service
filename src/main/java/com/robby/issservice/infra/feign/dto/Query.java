package com.robby.issservice.infra.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Query {
    private List<GeoSearchResult> geosearch;
}
