package com.diary.d4jh.web.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 처리결과 응답 헤더
 *
 */
@Data(staticConstructor="of")
@Accessors(chain=true)
@ApiModel(value="응답 헤더")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeesawHeader {

	@ApiModelProperty(position=0, required=true, value="처리결과 코드")
	private int resultCode;
	
	@ApiModelProperty(position=1, required=true, value="처리결과 메시지")
	private String resultMessage;

	

	public SeesawHeader setResponseResult(SeesawResultCode result) {
		this.resultCode = result.code();
		this.resultMessage = result.message();

		return this;
	}
	
	public boolean failed() {
		return resultCode != SeesawResultCode.SUCCESS.code() ? false : true;
	}
	
}
