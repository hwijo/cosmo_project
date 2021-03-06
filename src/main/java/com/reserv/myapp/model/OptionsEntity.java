package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@SequenceGenerator(
        name="OPTIONS_SEQ.NEXTVAL", //시퀀스 제너레이터 이름
        sequenceName="OPTIONS_SEQ", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
@Table(name="options")
public class OptionsEntity {
	
	@Id
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="OPTIONS_SEQ.NEXTVAL" //식별자 생성기를 설정해놓은 시퀀스제너레이터로 설정            
            )
	private int no;		

	private String item;
	private String cost;
	private String Activity; // 최대 인수
	private String deleteFlag;
	
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
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getActivity() {
		return Activity;
	}
	public void setActivity(String activity) {
		Activity = activity;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
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
