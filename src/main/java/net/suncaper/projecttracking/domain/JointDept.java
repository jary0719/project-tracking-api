package net.suncaper.projecttracking.domain;

public class JointDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_joint_dept.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_joint_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_joint_dept.id
     *
     * @return the value of pt_joint_dept.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_joint_dept.id
     *
     * @param id the value for pt_joint_dept.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_joint_dept.dept_name
     *
     * @return the value of pt_joint_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_joint_dept.dept_name
     *
     * @param deptName the value for pt_joint_dept.dept_name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
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
        JointDept other = (JointDept) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_joint_dept
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        return result;
    }
}