package io.rai.poly.update.action;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.rai.poly.update.Update;
import io.rai.poly.update.UpdateRouter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "action")
@JsonSubTypes( {
    @JsonSubTypes.Type(value = CustomerSetNameAction.class, name = UpdateRouter.CUSTOMER_SET_NAME),
    @JsonSubTypes.Type(value = CustomerSetIdAction.class, name = UpdateRouter.CUSTOMER_SET_ID),
})
public interface CustomerAction extends Update{

}