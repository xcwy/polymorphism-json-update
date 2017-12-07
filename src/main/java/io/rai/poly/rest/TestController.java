package io.rai.poly.rest;

import io.rai.poly.entity.Customer;
import io.rai.poly.entity.User;
import io.rai.poly.update.UpdateRequest;
import io.rai.poly.update.UpdaterService;
import io.rai.poly.update.action.CustomerAction;
import io.rai.poly.update.action.UserAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  private UpdaterService updaterService;

  /**
   * url: http://localhost:8080/customers method: put body: {"version":1,"actions":[{"name":"testName","action":"customerSetName"},{"id":"testId","action":"customerSetId"}]}
   */
  @PutMapping(path = "customers")
  public void update(@RequestBody UpdateRequest<CustomerAction> request) {
    LOG.info("Enter. version: {}.", request.getVersion());

    List<CustomerAction> actions = request.getActions();
    actions.stream().forEach(
        action -> {
          LOG.info("action class: {}.", action.getClass());
          LOG.info("update action: {}.", action);
        }
    );

    Customer customer = new Customer();
    customer.setName("XXXXX");
    customer.setId("AAAAA");

    actions.stream().forEach(action -> updaterService.handle(customer, action));
  }

  /**
   * url: http://localhost:8080/users method: put body: {"version":1,"actions":[{"name":"testName","action":"userSetName"},{"id":"testId","action":"userSetId"}]}
   */
  @PutMapping(path = "users")
  public void updates(@RequestBody UpdateRequest<UserAction> request) {
    LOG.info("Enter. version: {}.", request.getVersion());

    List<UserAction> actions = request.getActions();

    actions.stream().forEach(
        action -> {
          LOG.info("action class: {}.", action.getClass());
          LOG.info("update action: {}.", action);
        }
    );

    User user = new User();
    user.setName("XXXXX");
    user.setId("AAAAA");

    actions.stream().forEach(action -> updaterService.handle(user, action));
  }
}
