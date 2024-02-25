package com.robby.issservice.infra.feign.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssPosition {
    @JsonProperty("longitude") private Double longitude;
    @JsonProperty("latitude") private Double latitude;
}
