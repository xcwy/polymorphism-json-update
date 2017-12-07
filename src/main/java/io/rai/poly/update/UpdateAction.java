package io.rai.poly.update;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by rai on 2017/12/7.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "action")
@JsonSubTypes( {
    @JsonSubTypes.Type(value = FAction.class, name = "FAction"),
    @JsonSubTypes.Type(value = SAction.class, name = "SAction"),
})
public class UpdateAction {

  /**
   * Get Action name.
   *
   * @return
   */
  String getAction(){
    return "";
  }
}
