package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//　お知らせ

@Entity
@SequenceGenerator(
        name="ROOMINFO_SEQ.NEXTVAL", //시퀀스 제너레이터 이름
        sequenceName="ROOMINFO_SEQ", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
@Table(name="roominfo")
public class RoomInfoEntity {

	@Id
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="ROOMINFO_SEQ.NEXTVAL" //식별자 생성기를 설정해놓은 시퀀스제너레이터로 설정            
            )
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
	
	@CreationTimestamp // insert시 현재 시간을 읽어서 저장
	private Date createdAt;
	
	@UpdateTimestamp // update시 현재 시간을 읽어서 저장
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
