package io.rai.poly.update.action;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.rai.poly.update.Update;
import io.rai.poly.update.UpdateRouter;

/**
 * Created by rai on 2017/12/7.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "action")
@JsonSubTypes( {
    @JsonSubTypes.Type(value = UserSetNameAction.class, name = UpdateRouter.USER_SET_NAME),
    @JsonSubTypes.Type(value = UserSetIdAction.class, name = UpdateRouter.USER_SET_ID),
})
public interface UserAction extends Update {

}
