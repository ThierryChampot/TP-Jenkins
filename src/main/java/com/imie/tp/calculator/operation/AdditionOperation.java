package com.imie.tp.calculator.operation;
/**
 * The addition is the operation which adds a value to an intial one.
 * @author Thierry
 *
 */
public class AdditionOperation extends OperationCommandBase {

    protected float value;

    /**
     * Each addition starts with an intial value.
     * @param baseValue The baseValue to add a value to.
     */
    public AdditionOperation(final float baseValue) {
        super(baseValue);
        // TODO Auto-generated constructor stub
    }

    /**
     * An addition needs a value to add to the initial one.
     */
    @Override
    public final void make(final float newValue) {
        this.value = this.value + newValue;
    }

    /**
     * An addition results in the sum of both values.
     */
    public final float getCurrentValue() {
        // TODO Auto-generated method stub
        return this.value;
    }

}
