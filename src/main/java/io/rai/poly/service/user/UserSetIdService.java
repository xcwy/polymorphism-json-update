package io.rai.poly.service.user;

import io.rai.poly.entity.User;
import io.rai.poly.update.UpdateRouter;
import io.rai.poly.update.Updater;
import io.rai.poly.action.user.UserAction;
import io.rai.poly.action.user.UserSetIdAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by rai on 2017/12/7.
 */
@Service(UpdateRouter.USER_SET_ID)
public class UserSetIdService implements Updater<User, UserAction> {

  private static final Logger LOG = LoggerFactory.getLogger(UserSetIdService.class);

  @Override
  public void handle(User entity, UserAction action) {
    LOG.info("Enter. before update: {}.", entity);

    UserSetIdAction setIdAction = (UserSetIdAction) action;
    entity.setId(setIdAction.getId());

    LOG.info("Exit. after update: {}.", entity);
  }
}
