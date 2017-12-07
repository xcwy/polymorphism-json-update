package io.rai.poly.update;

import lombok.Data;

/**
 * Created by rai on 2017/12/7.
 */
@Data
public class CFAction extends CustomerAction {

  private String name;

  @Override
  public String getAction() {
    return "CFAction";
  }
}