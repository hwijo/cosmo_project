package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//　お知らせ

@Entity
@SequenceGenerator(
        name="NOTICE_SEQ.NEXTVAL", //시퀀스 제너레이터 이름
        sequenceName="NOTICE_SEQ", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
@Table(name="notice")
public class NoticeEntity {

	@Id // primary key
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="NOTICE_SEQ.NEXTVAL" //식별자 생성기를 설정해놓은 시퀀스제너레이터로 설정        
            )
	private int no;
		
	private String title;
	private String contents;
	
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

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
