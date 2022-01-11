package com.reserv.myapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(
        name="RESERVE_SEQ.NEXTVAL", //시퀀스 제너레이터 이름
        sequenceName="RESERVE_SEQ", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
@Table(name="reserve")
public class ReserveEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="RESERVE_SEQ.NEXTVAL" //식별자 생성기를 설정해놓은 시퀀스제너레이터로 설정            
            )
	private int no;		

	private int roomInfo_No; // room number, FK
	private String name;
	private String phone;
	private String adult;
	private String child;
	private String startDate;
	private String endDate;
	private String options;
	private String paymentFlg; 
	private int totalcost;  
	private String cancelFlg;  
	private String bankName;  
	private String bankBranchCde;  
	private String bankNo;  
	private String deleteFlg;  
	private Date createdAt;
	private Date updatedAt;
	private int buildCd;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getRoomInfo_No() {
		return roomInfo_No;
	}
	public void setRoomInfo_No(int roomInfo_No) {
		this.roomInfo_No = roomInfo_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdult() {
		return adult;
	}
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getPaymentFlg() {
		return paymentFlg;
	}
	public void setPaymentFlg(String paymentFlg) {
		this.paymentFlg = paymentFlg;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	public String getCancelFlg() {
		return cancelFlg;
	}
	public void setCancelFlg(String cancelFlg) {
		this.cancelFlg = cancelFlg;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranchCde() {
		return bankBranchCde;
	}
	public void setBankBranchCde(String bankBranchCde) {
		this.bankBranchCde = bankBranchCde;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getBuildCd() {
		return buildCd;
	}
	public void setBuildCd(int buildCd) {
		this.buildCd = buildCd;
	}

}
