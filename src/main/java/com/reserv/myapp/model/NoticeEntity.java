package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//�����骻

@Entity
@SequenceGenerator(
        name="NOTICE_SEQ.NEXTVAL", //������ ���ʷ����� �̸�
        sequenceName="NOTICE_SEQ", //������ �̸�
        initialValue=1, //���۰�
        allocationSize=1 //�޸𸮸� ���� �Ҵ��� ���� ������
        )
@Table(name="notice")
public class NoticeEntity {

	@Id // primary key
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //����� ������ ��������  ����
            generator="NOTICE_SEQ.NEXTVAL" //�ĺ��� �����⸦ �����س��� ���������ʷ����ͷ� ����        
            )
	private int no;
		
	private String title;
	private String contents;
	
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
