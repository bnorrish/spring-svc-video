package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.HealthCheck;

@RestController
public class HealthCheckController {

  @RequestMapping(value="/healthcheck",method= RequestMethod.GET)
  public HealthCheck greeting() {
    HealthCheck hc = new HealthCheck();
    hc.setName("video-service");
    hc.setVersion("0.0.1");
    return hc;
  }

}
