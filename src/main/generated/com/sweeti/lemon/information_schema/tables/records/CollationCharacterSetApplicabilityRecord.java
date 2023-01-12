/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.CollationCharacterSetApplicability;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> implements Record5<String, String, String, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
     */
    public CollationCharacterSetApplicabilityRecord setCollationName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
     */
    public CollationCharacterSetApplicabilityRecord setCharacterSetName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.FULL_COLLATION_NAME</code>.
     */
    public CollationCharacterSetApplicabilityRecord setFullCollationName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.FULL_COLLATION_NAME</code>.
     */
    public String getFullCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.ID</code>.
     */
    public CollationCharacterSetApplicabilityRecord setId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.ID</code>.
     */
    public Long getId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.IS_DEFAULT</code>.
     */
    public CollationCharacterSetApplicabilityRecord setIsDefault(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.IS_DEFAULT</code>.
     */
    public String getIsDefault() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Long, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
    }

    @Override
    public Field<String> field2() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field3() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.FULL_COLLATION_NAME;
    }

    @Override
    public Field<Long> field4() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.ID;
    }

    @Override
    public Field<String> field5() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.IS_DEFAULT;
    }

    @Override
    public String component1() {
        return getCollationName();
    }

    @Override
    public String component2() {
        return getCharacterSetName();
    }

    @Override
    public String component3() {
        return getFullCollationName();
    }

    @Override
    public Long component4() {
        return getId();
    }

    @Override
    public String component5() {
        return getIsDefault();
    }

    @Override
    public String value1() {
        return getCollationName();
    }

    @Override
    public String value2() {
        return getCharacterSetName();
    }

    @Override
    public String value3() {
        return getFullCollationName();
    }

    @Override
    public Long value4() {
        return getId();
    }

    @Override
    public String value5() {
        return getIsDefault();
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value1(String value) {
        setCollationName(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value2(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value3(String value) {
        setFullCollationName(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value4(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value5(String value) {
        setIsDefault(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord values(String value1, String value2, String value3, Long value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord() {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(String collationName, String characterSetName, String fullCollationName, Long id, String isDefault) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        setCollationName(collationName);
        setCharacterSetName(characterSetName);
        setFullCollationName(fullCollationName);
        setId(id);
        setIsDefault(isDefault);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(com.sweeti.lemon.information_schema.tables.pojos.CollationCharacterSetApplicability value) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        if (value != null) {
            setCollationName(value.getCollationName());
            setCharacterSetName(value.getCharacterSetName());
            setFullCollationName(value.getFullCollationName());
            setId(value.getId());
            setIsDefault(value.getIsDefault());
        }
    }
}
