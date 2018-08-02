package entity;
// Generated Mar 31, 2018 7:40:31 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GovtAllotment generated by hbm2java
 */
public class GovtAllotment  implements java.io.Serializable {


     private Integer govtAllotId;
     private AllotCategory allotCategory;
     private String allotName;
     private String allotCategory_1;
     private String allotUnit;
     private double allotAmount;
     private String allotQty;
     private String allotVoucher;
     private Date allotDate;

    public GovtAllotment() {
    }

    public GovtAllotment(AllotCategory allotCategory, String allotName, String allotCategory_1, String allotUnit, double allotAmount, String allotQty, String allotVoucher, Date allotDate) {
       this.allotCategory = allotCategory;
       this.allotName = allotName;
       this.allotCategory_1 = allotCategory_1;
       this.allotUnit = allotUnit;
       this.allotAmount = allotAmount;
       this.allotQty = allotQty;
       this.allotVoucher = allotVoucher;
       this.allotDate = allotDate;
    }
   
    public Integer getGovtAllotId() {
        return this.govtAllotId;
    }
    
    public void setGovtAllotId(Integer govtAllotId) {
        this.govtAllotId = govtAllotId;
    }
    public AllotCategory getAllotCategory() {
        return this.allotCategory;
    }
    
    public void setAllotCategory(AllotCategory allotCategory) {
        this.allotCategory = allotCategory;
    }
    public String getAllotName() {
        return this.allotName;
    }
    
    public void setAllotName(String allotName) {
        this.allotName = allotName;
    }
    public String getAllotCategory_1() {
        return this.allotCategory_1;
    }
    
    public void setAllotCategory_1(String allotCategory_1) {
        this.allotCategory_1 = allotCategory_1;
    }
    public String getAllotUnit() {
        return this.allotUnit;
    }
    
    public void setAllotUnit(String allotUnit) {
        this.allotUnit = allotUnit;
    }
    public double getAllotAmount() {
        return this.allotAmount;
    }
    
    public void setAllotAmount(double allotAmount) {
        this.allotAmount = allotAmount;
    }
    public String getAllotQty() {
        return this.allotQty;
    }
    
    public void setAllotQty(String allotQty) {
        this.allotQty = allotQty;
    }
    public String getAllotVoucher() {
        return this.allotVoucher;
    }
    
    public void setAllotVoucher(String allotVoucher) {
        this.allotVoucher = allotVoucher;
    }
    public Date getAllotDate() {
        return this.allotDate;
    }
    
    public void setAllotDate(Date allotDate) {
        this.allotDate = allotDate;
    }




}


