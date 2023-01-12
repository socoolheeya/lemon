/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.TablespacesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tablespaces extends TableImpl<TablespacesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.TABLESPACES</code>
     */
    public static final Tablespaces TABLESPACES = new Tablespaces();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablespacesRecord> getRecordType() {
        return TablespacesRecord.class;
    }

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.ENGINE</code>.
     */
    public final TableField<TablespacesRecord, String> ENGINE = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_TYPE = createField(DSL.name("TABLESPACE_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<TablespacesRecord, String> LOGFILE_GROUP_NAME = createField(DSL.name("LOGFILE_GROUP_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> EXTENT_SIZE = createField(DSL.name("EXTENT_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> MAXIMUM_SIZE = createField(DSL.name("MAXIMUM_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
     */
    public final TableField<TablespacesRecord, ULong> NODEGROUP_ID = createField(DSL.name("NODEGROUP_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_COMMENT = createField(DSL.name("TABLESPACE_COMMENT"), SQLDataType.VARCHAR(2048), this, "");

    private Tablespaces(Name alias, Table<TablespacesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tablespaces(Name alias, Table<TablespacesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table
     * reference
     */
    public Tablespaces(String alias) {
        this(DSL.name(alias), TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table
     * reference
     */
    public Tablespaces(Name alias) {
        this(alias, TABLESPACES);
    }

    /**
     * Create a <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces() {
        this(DSL.name("TABLESPACES"), null);
    }

    public <O extends Record> Tablespaces(Table<O> child, ForeignKey<O, TablespacesRecord> key) {
        super(child, key, TABLESPACES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tablespaces as(String alias) {
        return new Tablespaces(DSL.name(alias), this);
    }

    @Override
    public Tablespaces as(Name alias) {
        return new Tablespaces(alias, this);
    }

    @Override
    public Tablespaces as(Table<?> alias) {
        return new Tablespaces(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(String name) {
        return new Tablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(Name name) {
        return new Tablespaces(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(Table<?> name) {
        return new Tablespaces(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
