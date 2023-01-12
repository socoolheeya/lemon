/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.SessionStatus;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionStatusRecord extends TableRecordImpl<SessionStatusRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.SESSION_STATUS.VARIABLE_NAME</code>.
     */
    public SessionStatusRecord setVariableName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.SESSION_STATUS.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.SESSION_STATUS.VARIABLE_VALUE</code>.
     */
    public SessionStatusRecord setVariableValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.SESSION_STATUS.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SessionStatus.SESSION_STATUS.VARIABLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return SessionStatus.SESSION_STATUS.VARIABLE_VALUE;
    }

    @Override
    public String component1() {
        return getVariableName();
    }

    @Override
    public String component2() {
        return getVariableValue();
    }

    @Override
    public String value1() {
        return getVariableName();
    }

    @Override
    public String value2() {
        return getVariableValue();
    }

    @Override
    public SessionStatusRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public SessionStatusRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public SessionStatusRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionStatusRecord
     */
    public SessionStatusRecord() {
        super(SessionStatus.SESSION_STATUS);
    }

    /**
     * Create a detached, initialised SessionStatusRecord
     */
    public SessionStatusRecord(String variableName, String variableValue) {
        super(SessionStatus.SESSION_STATUS);

        setVariableName(variableName);
        setVariableValue(variableValue);
    }

    /**
     * Create a detached, initialised SessionStatusRecord
     */
    public SessionStatusRecord(com.sweeti.lemon.information_schema.tables.pojos.SessionStatus value) {
        super(SessionStatus.SESSION_STATUS);

        if (value != null) {
            setVariableName(value.getVariableName());
            setVariableValue(value.getVariableValue());
        }
    }
}
