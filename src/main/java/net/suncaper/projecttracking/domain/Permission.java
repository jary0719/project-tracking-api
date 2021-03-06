package net.suncaper.projecttracking.domain;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_permission.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_permission.permission
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_permission.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String displayName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_permission.category
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_permission.url
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_permission.id
     *
     * @return the value of pt_permission.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_permission.id
     *
     * @param id the value for pt_permission.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_permission.permission
     *
     * @return the value of pt_permission.permission
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_permission.permission
     *
     * @param permission the value for pt_permission.permission
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_permission.display_name
     *
     * @return the value of pt_permission.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_permission.display_name
     *
     * @param displayName the value for pt_permission.display_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_permission.category
     *
     * @return the value of pt_permission.category
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_permission.category
     *
     * @param category the value for pt_permission.category
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_permission.url
     *
     * @return the value of pt_permission.url
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_permission.url
     *
     * @param url the value for pt_permission.url
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_permission
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermission() == null ? other.getPermission() == null : this.getPermission().equals(other.getPermission()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_permission
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermission() == null) ? 0 : getPermission().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}