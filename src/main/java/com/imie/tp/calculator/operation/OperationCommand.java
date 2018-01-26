package com.imie.tp.calculator.operation;

/**
 * Addition is an operation.
 * @author Thierry
 *
 */
public interface OperationCommand {

/**
 * An operation needs the value to apply.
 * @param value
 */
    void make(final float value);

    /**
     * Returns current value of the operation.
     * @return
     */
    float getCurrentValue();
}
