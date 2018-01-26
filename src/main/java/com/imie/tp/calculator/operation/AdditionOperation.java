package com.imie.tp.calculator.operation;
/**
 *
 * @author Thierry
 * Adds a value to the baseValue.
 */
public class AdditionOperation extends OperationCommandBase {

    protected float value;

    /**
     *
     * @param baseValue The baseValue to add a value to.
     */
    public AdditionOperation(float baseValue) {
        super(baseValue);
        // TODO Auto-generated constructor stub
    }

    /**
     * Adds the value passed to the based value.
     */
    @Override
    public void make(float newValue) {
        this.value = this.value + newValue;
    }

    public float getCurrentValue() {
        // TODO Auto-generated method stub
        return this.value;
    }

}
