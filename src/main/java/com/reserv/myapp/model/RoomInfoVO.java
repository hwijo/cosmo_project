package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

//　お知らせ

@Entity
@Table(name="roominfo")
public class RoomInfoVO {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int no;		

	private String roomNum;
	private String roomTitle;
	private int maxpeople; // 최대 인수
	private int adultCost;
	private int childCost;
	private String explanation; // 설명
	private String images;  
	private String colorCd;  
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
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomTitle() {
		return roomTitle;
	}
	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}
	public int getMaxpeople() {
		return maxpeople;
	}
	public void setMaxpeople(int maxpeople) {
		this.maxpeople = maxpeople;
	}
	public int getAdultCost() {
		return adultCost;
	}
	public void setAdultCost(int adultCost) {
		this.adultCost = adultCost;
	}
	public int getChildCost() {
		return childCost;
	}
	public void setChildCost(int childCost) {
		this.childCost = childCost;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getColorCd() {
		return colorCd;
	}
	public void setColorCd(String colorCd) {
		this.colorCd = colorCd;
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
