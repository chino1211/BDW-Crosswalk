package com.tcs.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 716644 on 5/11/2015.
 */
@Entity
public class PlanData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BDW_MAPPING_ID")
    private int bdwMappingId;

    @Column(name = "CY_CONTRACT_NUM")
    private String cyContractNum;

    @Column(name = "CY_PBP_ID")
    private String cyPbpId;

    @Column(name = "CY_SEGMENT")
    private String cySegment;

    @Column(name = "CY_YEAR")
    private int cyYear;

    @Column(name = "PY_CONTRACT_NUM")
    private String pyContractNum;

    @Column(name = "PY_PBP_ID")
    private String pyPbpId;

    @Column(name = "PY_SEGMENT")
    private String pySegment;

    @Column(name = "PY_YEAR")
    private String pyYear;


    @Column
    private int active;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DT")
    private Date createdDt;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DT")
    private Date modifiedDt;

    @Column(name = "DELETED_BY")
    private String deletedBy;

    @Column(name = "DELETED_DT")
    private Date deletedDt;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanData)) return false;

        PlanData planData = (PlanData) o;

        if (getBdwMappingId() != planData.getBdwMappingId()) return false;
        if (getCyYear() != planData.getCyYear()) return false;
        if (getActive() != planData.getActive()) return false;
        if (getCyContractNum() != null ? !getCyContractNum().equals(planData.getCyContractNum()) : planData.getCyContractNum() != null)
            return false;
        if (getCyPbpId() != null ? !getCyPbpId().equals(planData.getCyPbpId()) : planData.getCyPbpId() != null)
            return false;
        if (getCySegment() != null ? !getCySegment().equals(planData.getCySegment()) : planData.getCySegment() != null)
            return false;
        if (getPyContractNum() != null ? !getPyContractNum().equals(planData.getPyContractNum()) : planData.getPyContractNum() != null)
            return false;
        if (getPyPbpId() != null ? !getPyPbpId().equals(planData.getPyPbpId()) : planData.getPyPbpId() != null)
            return false;
        if (getPySegment() != null ? !getPySegment().equals(planData.getPySegment()) : planData.getPySegment() != null)
            return false;
        if (getPyYear() != null ? !getPyYear().equals(planData.getPyYear()) : planData.getPyYear() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(planData.getCreatedBy()) : planData.getCreatedBy() != null)
            return false;
        if (getCreatedDt() != null ? !getCreatedDt().equals(planData.getCreatedDt()) : planData.getCreatedDt() != null)
            return false;
        if (getModifiedBy() != null ? !getModifiedBy().equals(planData.getModifiedBy()) : planData.getModifiedBy() != null)
            return false;
        if (getModifiedDt() != null ? !getModifiedDt().equals(planData.getModifiedDt()) : planData.getModifiedDt() != null)
            return false;
        if (getDeletedBy() != null ? !getDeletedBy().equals(planData.getDeletedBy()) : planData.getDeletedBy() != null)
            return false;
        return !(getDeletedDt() != null ? !getDeletedDt().equals(planData.getDeletedDt()) : planData.getDeletedDt() != null);

    }

    @Override
    public int hashCode() {
        int result = getBdwMappingId();
        result = 31 * result + (getCyContractNum() != null ? getCyContractNum().hashCode() : 0);
        result = 31 * result + (getCyPbpId() != null ? getCyPbpId().hashCode() : 0);
        result = 31 * result + (getCySegment() != null ? getCySegment().hashCode() : 0);
        result = 31 * result + getCyYear();
        result = 31 * result + (getPyContractNum() != null ? getPyContractNum().hashCode() : 0);
        result = 31 * result + (getPyPbpId() != null ? getPyPbpId().hashCode() : 0);
        result = 31 * result + (getPySegment() != null ? getPySegment().hashCode() : 0);
        result = 31 * result + (getPyYear() != null ? getPyYear().hashCode() : 0);
        result = 31 * result + getActive();
        result = 31 * result + (getCreatedBy() != null ? getCreatedBy().hashCode() : 0);
        result = 31 * result + (getCreatedDt() != null ? getCreatedDt().hashCode() : 0);
        result = 31 * result + (getModifiedBy() != null ? getModifiedBy().hashCode() : 0);
        result = 31 * result + (getModifiedDt() != null ? getModifiedDt().hashCode() : 0);
        result = 31 * result + (getDeletedBy() != null ? getDeletedBy().hashCode() : 0);
        result = 31 * result + (getDeletedDt() != null ? getDeletedDt().hashCode() : 0);
        return result;
    }

    public PlanData() {
    }

    public PlanData(String cyContractNum, String cyPbpId, String cySegment, int cyYear, String pyContractNum, String pyPbpId, String pySegment, String pyYear, int active, String createdBy, Date createdDt, String modifiedBy, Date modifiedDt, String deletedBy, Date deletedDt) {
        this.cyContractNum = cyContractNum;
        this.cyPbpId = cyPbpId;
        this.cySegment = cySegment;
        this.cyYear = cyYear;
        this.pyContractNum = pyContractNum;
        this.pyPbpId = pyPbpId;
        this.pySegment = pySegment;
        this.pyYear = pyYear;
        this.active = active;
        this.createdBy = createdBy;
        this.createdDt = createdDt;
        this.modifiedBy = modifiedBy;
        this.modifiedDt = modifiedDt;
        this.deletedBy = deletedBy;
        this.deletedDt = deletedDt;
    }

    @Override
    public String toString() {
        return "PlanData{" +
                "bdwMappingId=" + bdwMappingId +
                ", cyContractNum='" + cyContractNum + '\'' +
                ", cyPbpId='" + cyPbpId + '\'' +
                ", cySegment='" + cySegment + '\'' +
                ", cyYear=" + cyYear +
                ", pyContractNum='" + pyContractNum + '\'' +
                ", pyPbpId='" + pyPbpId + '\'' +
                ", pySegment='" + pySegment + '\'' +
                ", pyYear='" + pyYear + '\'' +
                ", active=" + active +
                ", createdBy='" + createdBy + '\'' +
                ", createdDt=" + createdDt +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedDt=" + modifiedDt +
                ", deletedBy='" + deletedBy + '\'' +
                ", deletedDt=" + deletedDt +
                '}';
    }

    public int getBdwMappingId() {
        return bdwMappingId;
    }

    public void setBdwMappingId(int bdwMappingId) {
        this.bdwMappingId = bdwMappingId;
    }

    public String getCyContractNum() {
        return cyContractNum;
    }

    public void setCyContractNum(String cyContractNum) {
        this.cyContractNum = cyContractNum;
    }

    public String getCyPbpId() {
        return cyPbpId;
    }

    public void setCyPbpId(String cyPbpId) {
        this.cyPbpId = cyPbpId;
    }

    public String getCySegment() {
        return cySegment;
    }

    public void setCySegment(String cySegment) {
        this.cySegment = cySegment;
    }

    public int getCyYear() {
        return cyYear;
    }

    public void setCyYear(int cyYear) {
        this.cyYear = cyYear;
    }

    public String getPyContractNum() {
        return pyContractNum;
    }

    public void setPyContractNum(String pyContractNum) {
        this.pyContractNum = pyContractNum;
    }

    public String getPyPbpId() {
        return pyPbpId;
    }

    public void setPyPbpId(String pyPbpId) {
        this.pyPbpId = pyPbpId;
    }

    public String getPySegment() {
        return pySegment;
    }

    public void setPySegment(String pySegment) {
        this.pySegment = pySegment;
    }

    public String getPyYear() {
        return pyYear;
    }

    public void setPyYear(String pyYear) {
        this.pyYear = pyYear;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDt() {
        return modifiedDt;
    }

    public void setModifiedDt(Date modifiedDt) {
        this.modifiedDt = modifiedDt;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getDeletedDt() {
        return deletedDt;
    }

    public void setDeletedDt(Date deletedDt) {
        this.deletedDt = deletedDt;
    }
}