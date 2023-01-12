/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.enums.InnodbSysTablesRowFormat;
import com.sweeti.lemon.information_schema.enums.InnodbSysTablesSpaceType;
import com.sweeti.lemon.information_schema.tables.records.InnodbSysTablesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysTables extends TableImpl<InnodbSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_SYS_TABLES</code>
     */
    public static final InnodbSysTables INNODB_SYS_TABLES = new InnodbSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysTablesRecord> getRecordType() {
        return InnodbSysTablesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.TABLE_ID</code>.
     */
    public final TableField<InnodbSysTablesRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.NAME</code>.
     */
    public final TableField<InnodbSysTablesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(655).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.FLAG</code>.
     */
    public final TableField<InnodbSysTablesRecord, Integer> FLAG = createField(DSL.name("FLAG"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.N_COLS</code>.
     */
    public final TableField<InnodbSysTablesRecord, UInteger> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.SPACE</code>.
     */
    public final TableField<InnodbSysTablesRecord, UInteger> SPACE = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.ROW_FORMAT</code>.
     */
    public final TableField<InnodbSysTablesRecord, InnodbSysTablesRowFormat> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(3).asEnumDataType(com.sweeti.lemon.information_schema.enums.InnodbSysTablesRowFormat.class), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLES.ZIP_PAGE_SIZE</code>.
     */
    public final TableField<InnodbSysTablesRecord, UInteger> ZIP_PAGE_SIZE = createField(DSL.name("ZIP_PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLES.SPACE_TYPE</code>.
     */
    public final TableField<InnodbSysTablesRecord, InnodbSysTablesSpaceType> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), SQLDataType.VARCHAR(2).asEnumDataType(com.sweeti.lemon.information_schema.enums.InnodbSysTablesSpaceType.class), this, "");

    private InnodbSysTables(Name alias, Table<InnodbSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysTables(Name alias, Table<InnodbSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLES</code> table
     * reference
     */
    public InnodbSysTables(String alias) {
        this(DSL.name(alias), INNODB_SYS_TABLES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLES</code> table
     * reference
     */
    public InnodbSysTables(Name alias) {
        this(alias, INNODB_SYS_TABLES);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLES</code> table
     * reference
     */
    public InnodbSysTables() {
        this(DSL.name("INNODB_SYS_TABLES"), null);
    }

    public <O extends Record> InnodbSysTables(Table<O> child, ForeignKey<O, InnodbSysTablesRecord> key) {
        super(child, key, INNODB_SYS_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysTables as(String alias) {
        return new InnodbSysTables(DSL.name(alias), this);
    }

    @Override
    public InnodbSysTables as(Name alias) {
        return new InnodbSysTables(alias, this);
    }

    @Override
    public InnodbSysTables as(Table<?> alias) {
        return new InnodbSysTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTables rename(String name) {
        return new InnodbSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTables rename(Name name) {
        return new InnodbSysTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTables rename(Table<?> name) {
        return new InnodbSysTables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, Integer, UInteger, UInteger, InnodbSysTablesRowFormat, UInteger, InnodbSysTablesSpaceType> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super ULong, ? super String, ? super Integer, ? super UInteger, ? super UInteger, ? super InnodbSysTablesRowFormat, ? super UInteger, ? super InnodbSysTablesSpaceType, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super ULong, ? super String, ? super Integer, ? super UInteger, ? super UInteger, ? super InnodbSysTablesRowFormat, ? super UInteger, ? super InnodbSysTablesSpaceType, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
