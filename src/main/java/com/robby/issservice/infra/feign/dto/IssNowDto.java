package com.robby.issservice.infra.feign.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssNowDto {
    @JsonProperty("message") private String message;
    @JsonProperty("timestamp") private Integer timestamp;
    @JsonProperty("iss_position") private IssPosition issPosition;
}


