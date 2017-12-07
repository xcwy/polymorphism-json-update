package io.rai.poly.action.user;

import io.rai.poly.update.UpdateRouter;

import lombok.Data;

/**
 * Created by rai on 2017/12/7.
 */
@Data
public class UserSetIdAction implements UserAction {

  private String id;

  @Override
  public String getAction() {
    return UpdateRouter.USER_SET_ID;
  }
}
