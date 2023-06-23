package com.myweb.www.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class PagingVO {
	private int pageNo; // 현재 화면에 출력된 페이지네이션 번호
	private int qty; // 한 페이지당 보여줄 페이지네이션 번호 개수, 보여줄 게시글 수
	private String type;
	private String keyword;
	
	public PagingVO() {
		this(1, 10);
	}
	public PagingVO(int pageNo, int qty) {
		this.pageNo = pageNo;
		this.qty = qty;
	}
	public int getPageStart() {
		return (this.pageNo - 1) * qty;
	}
	public String[] getTypeToArray() {
		return this.type == null ? new String[] {} : this.type.split("");
	}
	
}
