/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.Keywords;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeywordsRecord extends TableRecordImpl<KeywordsRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.KEYWORDS.WORD</code>.
     */
    public KeywordsRecord setWord(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.KEYWORDS.WORD</code>.
     */
    public String getWord() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Keywords.KEYWORDS.WORD;
    }

    @Override
    public String component1() {
        return getWord();
    }

    @Override
    public String value1() {
        return getWord();
    }

    @Override
    public KeywordsRecord value1(String value) {
        setWord(value);
        return this;
    }

    @Override
    public KeywordsRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeywordsRecord
     */
    public KeywordsRecord() {
        super(Keywords.KEYWORDS);
    }

    /**
     * Create a detached, initialised KeywordsRecord
     */
    public KeywordsRecord(String word) {
        super(Keywords.KEYWORDS);

        setWord(word);
    }

    /**
     * Create a detached, initialised KeywordsRecord
     */
    public KeywordsRecord(com.sweeti.lemon.information_schema.tables.pojos.Keywords value) {
        super(Keywords.KEYWORDS);

        if (value != null) {
            setWord(value.getWord());
        }
    }
}