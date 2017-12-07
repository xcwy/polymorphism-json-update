package io.rai.poly.update.action;

import io.rai.poly.update.UpdateRouter;

import lombok.Data;

/**
 * Created by rai on 2017/12/7.
 */
@Data
public class UserSetNameAction implements UserAction {
  private String name;

  @Override
  public String getAction() {
    return UpdateRouter.USER_SET_NAME;
  }
}
