package io.rai.poly.update;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by rai on 2017/12/7.
 */
public class UpdateRequest<T extends UpdateAction> {

  /**
   * The expected version of the category on which the changes should be applied.
   * If the expected version does not match the actual version, a 409 Conflict will be returned.
   */
  @NotNull
  @Min(0)
  private Integer version;

  /**
   * Array of UserAction.
   * The list of update action to be performed on the category.
   * Required.
   */
  @NotNull
  @Valid
  private List<T> actions;

  /**
   * convert to UpdateActions.
   *
   * @return list of UserAction
   */
  public List<T> getActions() {
//    return actions.stream().map(action -> (T) action).collect(Collectors.toList());
    return actions;
  }

  /**
   * get version.
   *
   * @return integer
   */
  public Integer getVersion() {
    return version;
  }

  /**
   * set version.
   *
   * @param version integer
   */
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * set actions.
   *
   * @param actions list of update action
   */
  public void setActions(List<T> actions) {
    this.actions = actions;
  }
}
