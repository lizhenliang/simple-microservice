package com.ctnrs.portal.dto;

import lombok.Data;

import java.util.List;

/**
 * 前端页面的DTO
 * @param <T>
 */
@Data
public class LayerDTO<T> {
	
	private Integer code;
	
	private String msg;
	
	private Long count;
	
	private List<T> data;

	public LayerDTO(Integer code, String msg, Long count, List<T> data) {
		this.code=code;
		this.msg=msg;
		this.count=count;
		this.data=data;
	}
}
