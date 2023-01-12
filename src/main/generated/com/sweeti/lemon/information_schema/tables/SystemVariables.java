/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.SystemVariablesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemVariables extends TableImpl<SystemVariablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.SYSTEM_VARIABLES</code>
     */
    public static final SystemVariables SYSTEM_VARIABLES = new SystemVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemVariablesRecord> getRecordType() {
        return SystemVariablesRecord.class;
    }

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<SystemVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.SESSION_VALUE</code>.
     */
    public final TableField<SystemVariablesRecord, String> SESSION_VALUE = createField(DSL.name("SESSION_VALUE"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>information_schema.SYSTEM_VARIABLES.GLOBAL_VALUE</code>.
     */
    public final TableField<SystemVariablesRecord, String> GLOBAL_VALUE = createField(DSL.name("GLOBAL_VALUE"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.GLOBAL_VALUE_ORIGIN</code>.
     */
    public final TableField<SystemVariablesRecord, String> GLOBAL_VALUE_ORIGIN = createField(DSL.name("GLOBAL_VALUE_ORIGIN"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.DEFAULT_VALUE</code>.
     */
    public final TableField<SystemVariablesRecord, String> DEFAULT_VALUE = createField(DSL.name("DEFAULT_VALUE"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.VARIABLE_SCOPE</code>.
     */
    public final TableField<SystemVariablesRecord, String> VARIABLE_SCOPE = createField(DSL.name("VARIABLE_SCOPE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.VARIABLE_TYPE</code>.
     */
    public final TableField<SystemVariablesRecord, String> VARIABLE_TYPE = createField(DSL.name("VARIABLE_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.VARIABLE_COMMENT</code>.
     */
    public final TableField<SystemVariablesRecord, String> VARIABLE_COMMENT = createField(DSL.name("VARIABLE_COMMENT"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.NUMERIC_MIN_VALUE</code>.
     */
    public final TableField<SystemVariablesRecord, String> NUMERIC_MIN_VALUE = createField(DSL.name("NUMERIC_MIN_VALUE"), SQLDataType.VARCHAR(21), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.NUMERIC_MAX_VALUE</code>.
     */
    public final TableField<SystemVariablesRecord, String> NUMERIC_MAX_VALUE = createField(DSL.name("NUMERIC_MAX_VALUE"), SQLDataType.VARCHAR(21), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.NUMERIC_BLOCK_SIZE</code>.
     */
    public final TableField<SystemVariablesRecord, String> NUMERIC_BLOCK_SIZE = createField(DSL.name("NUMERIC_BLOCK_SIZE"), SQLDataType.VARCHAR(21), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.ENUM_VALUE_LIST</code>.
     */
    public final TableField<SystemVariablesRecord, String> ENUM_VALUE_LIST = createField(DSL.name("ENUM_VALUE_LIST"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.SYSTEM_VARIABLES.READ_ONLY</code>.
     */
    public final TableField<SystemVariablesRecord, String> READ_ONLY = createField(DSL.name("READ_ONLY"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.COMMAND_LINE_ARGUMENT</code>.
     */
    public final TableField<SystemVariablesRecord, String> COMMAND_LINE_ARGUMENT = createField(DSL.name("COMMAND_LINE_ARGUMENT"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.SYSTEM_VARIABLES.GLOBAL_VALUE_PATH</code>.
     */
    public final TableField<SystemVariablesRecord, String> GLOBAL_VALUE_PATH = createField(DSL.name("GLOBAL_VALUE_PATH"), SQLDataType.VARCHAR(2048), this, "");

    private SystemVariables(Name alias, Table<SystemVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemVariables(Name alias, Table<SystemVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.SYSTEM_VARIABLES</code> table
     * reference
     */
    public SystemVariables(String alias) {
        this(DSL.name(alias), SYSTEM_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.SYSTEM_VARIABLES</code> table
     * reference
     */
    public SystemVariables(Name alias) {
        this(alias, SYSTEM_VARIABLES);
    }

    /**
     * Create a <code>information_schema.SYSTEM_VARIABLES</code> table reference
     */
    public SystemVariables() {
        this(DSL.name("SYSTEM_VARIABLES"), null);
    }

    public <O extends Record> SystemVariables(Table<O> child, ForeignKey<O, SystemVariablesRecord> key) {
        super(child, key, SYSTEM_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SystemVariables as(String alias) {
        return new SystemVariables(DSL.name(alias), this);
    }

    @Override
    public SystemVariables as(Name alias) {
        return new SystemVariables(alias, this);
    }

    @Override
    public SystemVariables as(Table<?> alias) {
        return new SystemVariables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemVariables rename(String name) {
        return new SystemVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemVariables rename(Name name) {
        return new SystemVariables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemVariables rename(Table<?> name) {
        return new SystemVariables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
