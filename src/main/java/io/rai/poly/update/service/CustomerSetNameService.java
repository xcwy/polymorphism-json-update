package io.rai.poly.update.service;

import io.rai.poly.entity.Customer;
import io.rai.poly.update.UpdateRouter;
import io.rai.poly.update.Updater;
import io.rai.poly.update.action.CustomerAction;
import io.rai.poly.update.action.CustomerSetIdAction;
import io.rai.poly.update.action.CustomerSetNameAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by rai on 2017/12/7.
 */
@Service(UpdateRouter.CUSTOMER_SET_NAME)
public class CustomerSetNameService implements Updater<Customer, CustomerAction> {

  private static final Logger LOG = LoggerFactory.getLogger(CustomerSetNameService.class);

  @Override
  public void handle(Customer entity, CustomerAction action) {
    LOG.info("Enter. before update: {}.", entity);

    CustomerSetNameAction setNameAction = (CustomerSetNameAction) action;
    entity.setName(setNameAction.getName());

    LOG.info("Exit. after update: {}.", entity);
  }
}
