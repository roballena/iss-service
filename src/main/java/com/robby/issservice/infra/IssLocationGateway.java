package com.robby.issservice.infra;

import com.robby.issservice.core.IssLocationService;
import com.robby.issservice.core.model.Coordinates;
import com.robby.issservice.infra.feign.IssLocationNowFeignClient;
import com.robby.issservice.infra.feign.dto.IssNowDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IssLocationGateway implements IssLocationService {

    private final IssLocationNowFeignClient issLocationNowFeignClient;

    @Override
    public Coordinates getCurrentLocation() {

        IssNowDto currentLocation = issLocationNowFeignClient.getCurrentLocation();

        return Coordinates.builder()
                .latitude(currentLocation.getIssPosition().getLatitude())
                .longitude(currentLocation.getIssPosition().getLongitude())
                .build();
    }

    //todo cover getCurrentLocation using WireMock to mock issNow response
}
