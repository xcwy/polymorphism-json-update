package io.rai.poly.rest;

import io.rai.poly.update.CustomerAction;
import io.rai.poly.update.UpdateAction;
import io.rai.poly.update.UpdateRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rai on 2017/12/7.
 */
@RestController
public class TestController {
  private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

  @PutMapping(path = "test1")
  public void update(@PathVariable("id") String id, @RequestBody UpdateRequest<UpdateAction> request) {
    LOG.info("Enter. customerId: {}, version: {}.", id, request.getVersion());

    List<UpdateAction> actions = request.getActions();
  }

  @PutMapping(path = "test2")
  public void updates(@PathVariable("id") String id, @RequestBody UpdateRequest<CustomerAction> request) {
    LOG.info("Enter. customerId: {}, version: {}.", id, request.getVersion());

    List<CustomerAction> actions = request.getActions();
  }
}
