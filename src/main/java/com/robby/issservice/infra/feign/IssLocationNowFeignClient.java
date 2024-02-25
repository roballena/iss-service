package com.robby.issservice.infra.feign;

import com.robby.issservice.infra.feign.dto.IssNowDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "issLocationNowFeignClient", url = "http://api.open-notify.org")
public interface IssLocationNowFeignClient {

    @GetMapping("/iss-now.json")
    IssNowDto getCurrentLocation();
}
