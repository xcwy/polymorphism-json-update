package io.rai.poly.update;

/**
 * Created by rai on 2017/12/7.
 */
public interface Updater<E, A extends UpdateAction> {

  /**
   * update action handler.
   *
   * @param entity entity
   * @param action action
   */
  void handle(E entity, A action);
}