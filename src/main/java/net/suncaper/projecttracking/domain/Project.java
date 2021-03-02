package net.suncaper.projecttracking.domain;

import java.math.BigDecimal;

public class Project extends ProjectExt {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.project_type_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer projectTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.contact_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer contactId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.secretary_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer secretaryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.dept_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.project_status_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private Integer projectStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.content
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.total_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private BigDecimal totalInvestment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.year_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private BigDecimal yearInvestment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.start_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.end_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.year
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pt_project.company_id_num
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    private String companyIdNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.id
     *
     * @return the value of pt_project.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.id
     *
     * @param id the value for pt_project.id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.project_type_id
     *
     * @return the value of pt_project.project_type_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getProjectTypeId() {
        return projectTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.project_type_id
     *
     * @param projectTypeId the value for pt_project.project_type_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setProjectTypeId(Integer projectTypeId) {
        this.projectTypeId = projectTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.contact_id
     *
     * @return the value of pt_project.contact_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.contact_id
     *
     * @param contactId the value for pt_project.contact_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.secretary_id
     *
     * @return the value of pt_project.secretary_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getSecretaryId() {
        return secretaryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.secretary_id
     *
     * @param secretaryId the value for pt_project.secretary_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setSecretaryId(Integer secretaryId) {
        this.secretaryId = secretaryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.dept_id
     *
     * @return the value of pt_project.dept_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.dept_id
     *
     * @param deptId the value for pt_project.dept_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.project_status_id
     *
     * @return the value of pt_project.project_status_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public Integer getProjectStatusId() {
        return projectStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.project_status_id
     *
     * @param projectStatusId the value for pt_project.project_status_id
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setProjectStatusId(Integer projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.name
     *
     * @return the value of pt_project.name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.name
     *
     * @param name the value for pt_project.name
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.content
     *
     * @return the value of pt_project.content
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.content
     *
     * @param content the value for pt_project.content
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.total_investment
     *
     * @return the value of pt_project.total_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public BigDecimal getTotalInvestment() {
        return totalInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.total_investment
     *
     * @param totalInvestment the value for pt_project.total_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setTotalInvestment(BigDecimal totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.year_investment
     *
     * @return the value of pt_project.year_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public BigDecimal getYearInvestment() {
        return yearInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.year_investment
     *
     * @param yearInvestment the value for pt_project.year_investment
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setYearInvestment(BigDecimal yearInvestment) {
        this.yearInvestment = yearInvestment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.start_date
     *
     * @return the value of pt_project.start_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.start_date
     *
     * @param startDate the value for pt_project.start_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.end_date
     *
     * @return the value of pt_project.end_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.end_date
     *
     * @param endDate the value for pt_project.end_date
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.year
     *
     * @return the value of pt_project.year
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.year
     *
     * @param year the value for pt_project.year
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pt_project.company_id_num
     *
     * @return the value of pt_project.company_id_num
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public String getCompanyIdNum() {
        return companyIdNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pt_project.company_id_num
     *
     * @param companyIdNum the value for pt_project.company_id_num
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    public void setCompanyIdNum(String companyIdNum) {
        this.companyIdNum = companyIdNum == null ? null : companyIdNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
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
        Project other = (Project) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectTypeId() == null ? other.getProjectTypeId() == null : this.getProjectTypeId().equals(other.getProjectTypeId()))
            && (this.getContactId() == null ? other.getContactId() == null : this.getContactId().equals(other.getContactId()))
            && (this.getSecretaryId() == null ? other.getSecretaryId() == null : this.getSecretaryId().equals(other.getSecretaryId()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getProjectStatusId() == null ? other.getProjectStatusId() == null : this.getProjectStatusId().equals(other.getProjectStatusId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTotalInvestment() == null ? other.getTotalInvestment() == null : this.getTotalInvestment().equals(other.getTotalInvestment()))
            && (this.getYearInvestment() == null ? other.getYearInvestment() == null : this.getYearInvestment().equals(other.getYearInvestment()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCompanyIdNum() == null ? other.getCompanyIdNum() == null : this.getCompanyIdNum().equals(other.getCompanyIdNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pt_project
     *
     * @mbg.generated Tue Dec 24 15:04:23 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectTypeId() == null) ? 0 : getProjectTypeId().hashCode());
        result = prime * result + ((getContactId() == null) ? 0 : getContactId().hashCode());
        result = prime * result + ((getSecretaryId() == null) ? 0 : getSecretaryId().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getProjectStatusId() == null) ? 0 : getProjectStatusId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTotalInvestment() == null) ? 0 : getTotalInvestment().hashCode());
        result = prime * result + ((getYearInvestment() == null) ? 0 : getYearInvestment().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCompanyIdNum() == null) ? 0 : getCompanyIdNum().hashCode());
        return result;
    }
}