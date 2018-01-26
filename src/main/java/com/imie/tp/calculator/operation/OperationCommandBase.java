package com.imie.tp.calculator.operation;

/**
 * An operation is based on a command base.
 * @author Thierry
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

    /**
     * The commande base refactors read current value.
     * @param baseValue
     */
  public OperationCommandBase(final float baseValue)
  {
       this.currentValue = baseValue;
  }

  /**
   * The commande base refactors storage of current value.
   */
  public float currentValue = 10;
}
