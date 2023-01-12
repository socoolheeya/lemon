/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.ThreadPoolStatsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
public class ThreadPoolStats extends TableImpl<ThreadPoolStatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.THREAD_POOL_STATS</code>
     */
    public static final ThreadPoolStats THREAD_POOL_STATS = new ThreadPoolStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThreadPoolStatsRecord> getRecordType() {
        return ThreadPoolStatsRecord.class;
    }

    /**
     * The column <code>information_schema.THREAD_POOL_STATS.GROUP_ID</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Integer> GROUP_ID = createField(DSL.name("GROUP_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> THREAD_CREATIONS = createField(DSL.name("THREAD_CREATIONS"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS_DUE_TO_STALL</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> THREAD_CREATIONS_DUE_TO_STALL = createField(DSL.name("THREAD_CREATIONS_DUE_TO_STALL"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>information_schema.THREAD_POOL_STATS.WAKES</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> WAKES = createField(DSL.name("WAKES"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.WAKES_DUE_TO_STALL</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> WAKES_DUE_TO_STALL = createField(DSL.name("WAKES_DUE_TO_STALL"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>information_schema.THREAD_POOL_STATS.THROTTLES</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> THROTTLES = createField(DSL.name("THROTTLES"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>information_schema.THREAD_POOL_STATS.STALLS</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> STALLS = createField(DSL.name("STALLS"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_LISTENER</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> POLLS_BY_LISTENER = createField(DSL.name("POLLS_BY_LISTENER"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_WORKER</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> POLLS_BY_WORKER = createField(DSL.name("POLLS_BY_WORKER"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_LISTENER</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> DEQUEUES_BY_LISTENER = createField(DSL.name("DEQUEUES_BY_LISTENER"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_WORKER</code>.
     */
    public final TableField<ThreadPoolStatsRecord, Long> DEQUEUES_BY_WORKER = createField(DSL.name("DEQUEUES_BY_WORKER"), SQLDataType.BIGINT.nullable(false), this, "");

    private ThreadPoolStats(Name alias, Table<ThreadPoolStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThreadPoolStats(Name alias, Table<ThreadPoolStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.THREAD_POOL_STATS</code> table
     * reference
     */
    public ThreadPoolStats(String alias) {
        this(DSL.name(alias), THREAD_POOL_STATS);
    }

    /**
     * Create an aliased <code>information_schema.THREAD_POOL_STATS</code> table
     * reference
     */
    public ThreadPoolStats(Name alias) {
        this(alias, THREAD_POOL_STATS);
    }

    /**
     * Create a <code>information_schema.THREAD_POOL_STATS</code> table
     * reference
     */
    public ThreadPoolStats() {
        this(DSL.name("THREAD_POOL_STATS"), null);
    }

    public <O extends Record> ThreadPoolStats(Table<O> child, ForeignKey<O, ThreadPoolStatsRecord> key) {
        super(child, key, THREAD_POOL_STATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ThreadPoolStats as(String alias) {
        return new ThreadPoolStats(DSL.name(alias), this);
    }

    @Override
    public ThreadPoolStats as(Name alias) {
        return new ThreadPoolStats(alias, this);
    }

    @Override
    public ThreadPoolStats as(Table<?> alias) {
        return new ThreadPoolStats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ThreadPoolStats rename(String name) {
        return new ThreadPoolStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ThreadPoolStats rename(Name name) {
        return new ThreadPoolStats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ThreadPoolStats rename(Table<?> name) {
        return new ThreadPoolStats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Integer, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Integer, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}