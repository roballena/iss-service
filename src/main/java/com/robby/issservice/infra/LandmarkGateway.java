package com.robby.issservice.infra;

import com.robby.issservice.core.LandmarkService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.core.model.Landmark;
import com.robby.issservice.infra.feign.MediaWikiFeignClient;
import com.robby.issservice.infra.feign.dto.QueryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LandmarkGateway implements LandmarkService {

    private final MediaWikiFeignClient mediaWikiFeignClient;

    @Override
    public List<Landmark> getLandmarks(Coordinates coordinates) {

        QueryResponse queryResponse = mediaWikiFeignClient.queryMediaWiki(
                "query",
                "json",
                "geosearch",
                coordinates.getLatitude() + "|" + coordinates.getLongitude(),
                "distance",
                "10",
                "name|country|region"
        );

        return queryResponse.getQuery().getGeosearch().stream()
                .map(geoSearchResult -> Landmark.builder()
                        .title(geoSearchResult.getTitle())
                        .latitude(geoSearchResult.getLat())
                        .longitude(geoSearchResult.getLon())
                        .country(geoSearchResult.getCountry())
                        .build())
                .toList();
    }
}
