package it.develhope.primipassiFirstAPI04.Controller;

import org.apache.tomcat.util.http.parser.Host;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController {

    @GetMapping(value = "/headers")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return headers.getHost().getHostName() + " " + headers.getHost().getPort();
    }
}
