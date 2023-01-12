/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeometryColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String fTableCatalog;
    private final String fTableSchema;
    private final String fTableName;
    private final String fGeometryColumn;
    private final String gTableCatalog;
    private final String gTableSchema;
    private final String gTableName;
    private final String gGeometryColumn;
    private final Byte storageType;
    private final Integer geometryType;
    private final Byte coordDimension;
    private final Byte maxPpr;
    private final Short srid;

    public GeometryColumns(GeometryColumns value) {
        this.fTableCatalog = value.fTableCatalog;
        this.fTableSchema = value.fTableSchema;
        this.fTableName = value.fTableName;
        this.fGeometryColumn = value.fGeometryColumn;
        this.gTableCatalog = value.gTableCatalog;
        this.gTableSchema = value.gTableSchema;
        this.gTableName = value.gTableName;
        this.gGeometryColumn = value.gGeometryColumn;
        this.storageType = value.storageType;
        this.geometryType = value.geometryType;
        this.coordDimension = value.coordDimension;
        this.maxPpr = value.maxPpr;
        this.srid = value.srid;
    }

    public GeometryColumns(
        String fTableCatalog,
        String fTableSchema,
        String fTableName,
        String fGeometryColumn,
        String gTableCatalog,
        String gTableSchema,
        String gTableName,
        String gGeometryColumn,
        Byte storageType,
        Integer geometryType,
        Byte coordDimension,
        Byte maxPpr,
        Short srid
    ) {
        this.fTableCatalog = fTableCatalog;
        this.fTableSchema = fTableSchema;
        this.fTableName = fTableName;
        this.fGeometryColumn = fGeometryColumn;
        this.gTableCatalog = gTableCatalog;
        this.gTableSchema = gTableSchema;
        this.gTableName = gTableName;
        this.gGeometryColumn = gGeometryColumn;
        this.storageType = storageType;
        this.geometryType = geometryType;
        this.coordDimension = coordDimension;
        this.maxPpr = maxPpr;
        this.srid = srid;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.F_TABLE_CATALOG</code>.
     */
    public String getFTableCatalog() {
        return this.fTableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.F_TABLE_SCHEMA</code>.
     */
    public String getFTableSchema() {
        return this.fTableSchema;
    }

    /**
     * Getter for <code>information_schema.GEOMETRY_COLUMNS.F_TABLE_NAME</code>.
     */
    public String getFTableName() {
        return this.fTableName;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.F_GEOMETRY_COLUMN</code>.
     */
    public String getFGeometryColumn() {
        return this.fGeometryColumn;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.G_TABLE_CATALOG</code>.
     */
    public String getGTableCatalog() {
        return this.gTableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.G_TABLE_SCHEMA</code>.
     */
    public String getGTableSchema() {
        return this.gTableSchema;
    }

    /**
     * Getter for <code>information_schema.GEOMETRY_COLUMNS.G_TABLE_NAME</code>.
     */
    public String getGTableName() {
        return this.gTableName;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.G_GEOMETRY_COLUMN</code>.
     */
    public String getGGeometryColumn() {
        return this.gGeometryColumn;
    }

    /**
     * Getter for <code>information_schema.GEOMETRY_COLUMNS.STORAGE_TYPE</code>.
     */
    public Byte getStorageType() {
        return this.storageType;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.GEOMETRY_TYPE</code>.
     */
    public Integer getGeometryType() {
        return this.geometryType;
    }

    /**
     * Getter for
     * <code>information_schema.GEOMETRY_COLUMNS.COORD_DIMENSION</code>.
     */
    public Byte getCoordDimension() {
        return this.coordDimension;
    }

    /**
     * Getter for <code>information_schema.GEOMETRY_COLUMNS.MAX_PPR</code>.
     */
    public Byte getMaxPpr() {
        return this.maxPpr;
    }

    /**
     * Getter for <code>information_schema.GEOMETRY_COLUMNS.SRID</code>.
     */
    public Short getSrid() {
        return this.srid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GeometryColumns other = (GeometryColumns) obj;
        if (this.fTableCatalog == null) {
            if (other.fTableCatalog != null)
                return false;
        }
        else if (!this.fTableCatalog.equals(other.fTableCatalog))
            return false;
        if (this.fTableSchema == null) {
            if (other.fTableSchema != null)
                return false;
        }
        else if (!this.fTableSchema.equals(other.fTableSchema))
            return false;
        if (this.fTableName == null) {
            if (other.fTableName != null)
                return false;
        }
        else if (!this.fTableName.equals(other.fTableName))
            return false;
        if (this.fGeometryColumn == null) {
            if (other.fGeometryColumn != null)
                return false;
        }
        else if (!this.fGeometryColumn.equals(other.fGeometryColumn))
            return false;
        if (this.gTableCatalog == null) {
            if (other.gTableCatalog != null)
                return false;
        }
        else if (!this.gTableCatalog.equals(other.gTableCatalog))
            return false;
        if (this.gTableSchema == null) {
            if (other.gTableSchema != null)
                return false;
        }
        else if (!this.gTableSchema.equals(other.gTableSchema))
            return false;
        if (this.gTableName == null) {
            if (other.gTableName != null)
                return false;
        }
        else if (!this.gTableName.equals(other.gTableName))
            return false;
        if (this.gGeometryColumn == null) {
            if (other.gGeometryColumn != null)
                return false;
        }
        else if (!this.gGeometryColumn.equals(other.gGeometryColumn))
            return false;
        if (this.storageType == null) {
            if (other.storageType != null)
                return false;
        }
        else if (!this.storageType.equals(other.storageType))
            return false;
        if (this.geometryType == null) {
            if (other.geometryType != null)
                return false;
        }
        else if (!this.geometryType.equals(other.geometryType))
            return false;
        if (this.coordDimension == null) {
            if (other.coordDimension != null)
                return false;
        }
        else if (!this.coordDimension.equals(other.coordDimension))
            return false;
        if (this.maxPpr == null) {
            if (other.maxPpr != null)
                return false;
        }
        else if (!this.maxPpr.equals(other.maxPpr))
            return false;
        if (this.srid == null) {
            if (other.srid != null)
                return false;
        }
        else if (!this.srid.equals(other.srid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.fTableCatalog == null) ? 0 : this.fTableCatalog.hashCode());
        result = prime * result + ((this.fTableSchema == null) ? 0 : this.fTableSchema.hashCode());
        result = prime * result + ((this.fTableName == null) ? 0 : this.fTableName.hashCode());
        result = prime * result + ((this.fGeometryColumn == null) ? 0 : this.fGeometryColumn.hashCode());
        result = prime * result + ((this.gTableCatalog == null) ? 0 : this.gTableCatalog.hashCode());
        result = prime * result + ((this.gTableSchema == null) ? 0 : this.gTableSchema.hashCode());
        result = prime * result + ((this.gTableName == null) ? 0 : this.gTableName.hashCode());
        result = prime * result + ((this.gGeometryColumn == null) ? 0 : this.gGeometryColumn.hashCode());
        result = prime * result + ((this.storageType == null) ? 0 : this.storageType.hashCode());
        result = prime * result + ((this.geometryType == null) ? 0 : this.geometryType.hashCode());
        result = prime * result + ((this.coordDimension == null) ? 0 : this.coordDimension.hashCode());
        result = prime * result + ((this.maxPpr == null) ? 0 : this.maxPpr.hashCode());
        result = prime * result + ((this.srid == null) ? 0 : this.srid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GeometryColumns (");

        sb.append(fTableCatalog);
        sb.append(", ").append(fTableSchema);
        sb.append(", ").append(fTableName);
        sb.append(", ").append(fGeometryColumn);
        sb.append(", ").append(gTableCatalog);
        sb.append(", ").append(gTableSchema);
        sb.append(", ").append(gTableName);
        sb.append(", ").append(gGeometryColumn);
        sb.append(", ").append(storageType);
        sb.append(", ").append(geometryType);
        sb.append(", ").append(coordDimension);
        sb.append(", ").append(maxPpr);
        sb.append(", ").append(srid);

        sb.append(")");
        return sb.toString();
    }
}
