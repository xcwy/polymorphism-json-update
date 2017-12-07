package io.rai.poly.update.action;

import io.rai.poly.update.UpdateRouter;

import lombok.Data;

/**
 * Created by rai on 2017/12/7.
 */
@Data
public class CustomerSetNameAction implements CustomerAction {

  private String name;

  @Override
  public String getAction() {
    return UpdateRouter.CUSTOMER_SET_NAME;
  }
}