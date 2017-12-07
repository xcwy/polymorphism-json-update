package io.rai.poly.update;

import lombok.Data;

/**
 * Created by rai on 2017/12/7.
 */
@Data
public class CSAction extends CustomerAction {

  private String id;

  @Override
  public String getAction() {
    return "CSAction";
  }
}