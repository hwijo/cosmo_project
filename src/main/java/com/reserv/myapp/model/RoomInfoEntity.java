package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//�����骻

@Entity
@SequenceGenerator(
        name="ROOMINFO_SEQ.NEXTVAL", //������ ���ʷ����� �̸�
        sequenceName="ROOMINFO_SEQ", //������ �̸�
        initialValue=1, //���۰�
        allocationSize=1 //�޸𸮸� ���� �Ҵ��� ���� ������
        )
@Table(name="roominfo")
public class RoomInfoEntity {

	@Id
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //����� ������ ��������  ����
            generator="ROOMINFO_SEQ.NEXTVAL" //�ĺ��� �����⸦ �����س��� ���������ʷ����ͷ� ����            
            )
	private int no;		

	private String roomNum;
	private String roomTitle;
	private int maxpeople; // �ִ� �μ�
	private int adultCost;
	private int childCost;
	private String explanation; // ����
	private String images;  
	private String colorCd;  
	private String deleteFlg;  
	
	@CreationTimestamp // insert�� ���� �ð��� �о ����
	private Date createdAt;
	
	@UpdateTimestamp // update�� ���� �ð��� �о ����
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
