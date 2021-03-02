package net.suncaper.projecttracking.domain;

public class Role extends RoleExt {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_role.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_role.role
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_role.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String displayName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_role.id
     *
     * @return the value of pt_role.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_role.id
     *
     * @param id the value for pt_role.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_role.role
     *
     * @return the value of pt_role.role
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_role.role
     *
     * @param role the value for pt_role.role
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_role.display_name
     *
     * @return the value of pt_role.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_role.display_name
     *
     * @param displayName the value for pt_role.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_role
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_role
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return result;
    }
}