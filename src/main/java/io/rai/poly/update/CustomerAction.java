package io.rai.poly.update;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "action")
@JsonSubTypes( {
    @JsonSubTypes.Type(value = CFAction.class, name = "CFAction"),
    @JsonSubTypes.Type(value = CSAction.class, name = "CSAction"),
})
public class CustomerAction {

  /**
   * Get Action name.
   *
   * @return
   */
  String getAction(){
    return "";
  }
}