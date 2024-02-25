package com.robby.issservice.infra.feign;

import com.robby.issservice.infra.feign.dto.QueryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "mediaWikiFeignClient", url = "https://en.wikipedia.org/w/api.php")
public interface MediaWikiFeignClient {

    @GetMapping
    QueryResponse queryMediaWiki(
            @RequestParam(value="action") String action,
            @RequestParam(value="format") String format,
            @RequestParam(value="list") String list,
            @RequestParam(value="gscoord") String gscoord,
            @RequestParam(value="gssort") String gssort,
            @RequestParam(value="gslimit") String gslimit,
            @RequestParam(value="gsprop") String gsprop
    );
}
