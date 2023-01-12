/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnabledRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String roleName;

    public EnabledRoles(EnabledRoles value) {
        this.roleName = value.roleName;
    }

    public EnabledRoles(
        String roleName
    ) {
        this.roleName = roleName;
    }

    /**
     * Getter for <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EnabledRoles other = (EnabledRoles) obj;
        if (this.roleName == null) {
            if (other.roleName != null)
                return false;
        }
        else if (!this.roleName.equals(other.roleName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.roleName == null) ? 0 : this.roleName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnabledRoles (");

        sb.append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
