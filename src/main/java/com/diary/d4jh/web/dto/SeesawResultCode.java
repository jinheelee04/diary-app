package com.diary.d4jh.web.dto;

import java.util.Arrays;

/**
 * @author KwanIk
 *
 */
/**
 * @author KwanIk
 *
 */
public enum SeesawResultCode {
	
	
	/**
	 * 정상 처리
	 * {@code 000: Continue}.
	 */
	SUCCESS(000,  "OK"),

	/*
	 * ============================================================
	 * 공통(Common) 처리 응답 코드 100 ~ 199
	 * ============================================================
	 */
	/**
	 * {@code 100: 인증키가 유효하지 않습니다}.
	 */
	UNAVAILABLE_AUTHENTICATION_KEY(100,  "인증키가 유효하지 않습니다."),

	/**
	 * {@code 101: 개인정보처리방침이 등록되지 않았습니다}.
	 */
	PRIVACY_POLICY_NOT_REGISTERED(101,  "개인정보처리방침이 등록되지 않았습니다."),

	/**
	 * {@code 102: 이용약관이 등록되지 않았습니다}.
	 */
	TERMS_OF_USE_NOT_REGISTERED(102,  "이용약관이 등록되지 않았습니다."),
	
	/**
	 * {@code 103: 개인정보처리방침 또는 이용약관에 동의하지 않았습니다}.
	 */
	PRIVACY_POLICY_AND_TERMS_OF_USE_AGREEMENT_REQUIRED(103,  "개인정보처리방침 또는 이용약관에 동의하지 않았습니다."),
	
	/**
	 * {@code 104: 입력 데이터가 유효하지 않습니다}.
	 */
	DATA_VALIDATION_FAILED(104,  "입력 데이터가 유효하지 않습니다."),
	
	/**
	 * {@code 105: 이미 등록되어 있는 사용자 입니다}.
	 */
	ALREADY_REGISTERED_USER(105,  "이미 등록되어 있는 사용자 입니다."),
	
	/**
	 * {@code 106: 이메일 또는 비밀번호가 맞지 않습니다}.
	 */
	INVALID_EMAIL_OR_PASSWORD(106,  "이메일 또는 비밀번호가 맞지 않습니다."),

	/**
	 * {@code 107: 비밀번호 확인을 실패하였습니다}.
	 */
	PASSWORD_CONFIRMATION_FAILED(107,  "비밀번호 확인을 실패하였습니다."),
	
	/**
	 * {@code 108: 등록되지 않은 이메일 입니다}.
	 */
	UNREGISTERED_EMAIL(108, "등록되지 않은 이메일 입니다."),

	/**
	 * {@code 110: 승인 대기 상태의 사용자 입니다}.
	 */
	PENDING_APPROVAL_USER(110, "승인 대기 상태의 사용자 입니다."),

	/**
	 * {@code 111: 사용 정지된 사용자 입니다}.
	 */
	STOPPED_USER(111, "사용 중지된 계정입니다. 관리자에게 문의하세요."),
	
	/**
	 * {@code 112: 잘못된 실험파일 ID 입니다}. 
	 */
	INVALID_TEMP_EXPRM_ID(112, "잘못된 실험파일 ID 입니다."),

	/**
	 * {@code 113: 현재 비밀번호가 맞지 않습니다}.
	 */
	INVALID_CURRENT_PASSWORD(113, "현재 비밀번호가 맞지 않습니다."),

	/**
	 * {@code 114: 이미 추가된 북마크 입니다}.
	 */
	THE_MENU_ALREADY_ADDED_TO_THE_BOOKMARK(114, "이미 추가된 북마크 입니다."),

	/**
	 * {@code 115: 등록되지 않은 메뉴입니다}.
	 */
	UNREGISTERED_MENU_ID(115, "등록되지 않은 메뉴입니다."),

	/**
	 * {@code 116: 북마크로 추가할 수 없는 메뉴입니다}.
	 */
	IMPOSSIBLE_MENU_ID_TO_ADD_AS_BOOKMARK(116, "북마크로 추가할 수 없는 메뉴입니다."),

	/**
	 * {@code 117: 로그아웃에 실패했습니다.} 
	 */
	FAILED_TO_LOGOUT(117, "로그아웃에 실패했습니다."),
	
	
	/**
	 * {@code 199: DB 연결에 실패하였습니다}.
	 * 
	 * DB내 데이터 등록, 수정, 삭제 또는
	 * 잘못된 키, 릴레이션 등으로 발생하는 모든 오류를 일일히 코드화 할 수 없기 때문에
	 * 
	 * 이에 해당하는 오류는 199로 일괄 처리
	 */
	SQL_EXCEPTION(199,  "DB 연결에 실패하였습니다."),

	
	/*
	 * ============================================================
	 * 프로젝트 처리 응답 코드: 200 ~ 199
	 * ============================================================
	 */
	/**
	 * {@code 200: 프로젝트 생성에 실패하였습니다}.
	 */
	TMP_PROJ_CRT_FAIL(200, "프로젝트 생성에 실패하였습니다."),

	/**
	 * {@code 201:이동할 수 없는 카테고리 depth입니다 }
	 */
	NOT_MOVE_CTGRY(201, "이동할 수 없는 카테고리 depth입니다."),

	/**
	 * {@code 202:상위카테고리ID가 누락되었습니다. }
	 */
	NON_UPPER_CTGRY(202, "상위카테고리ID가 누락되었습니다."),

	/**
	 * {@code 203: }
	 */
	REQ_VALUE_CHECK(203, "request value check. 한글화 필요. 실패하면 SQL 오류가 발생할텐데.. 굳이 별도 에러까지? SQL_EXCEPTION으로 변경 검토 필요"),

	/**
	 * {@code 204: }
	 */
	DATA_ADD_FAIL(204, "data add fail. 한글화 필요. 데이터 등록 실패하면 SQL 오류가 발생할텐데.. 굳이 별도 에러까지? SQL_EXCEPTION으로 변경 검토 필요"),
	
	/**
	 * {@code 205: 프로젝트 접근 권한이 없습니다.}
	 */
	ACCESS_DENIED(205, "프로젝트 접근 권한이 없습니다."),
	
	/**
	 * {@code 206: 프로젝트 잠금을 수행한 사용자가 아닙니다.}
	 */
	PROJ_LOCK_USER_DIFF(206, "프로젝트 잠금을 수행한 사용자가 아니거나 프로젝트 잠금을 수행하지 않았습니다."),

	/**
	 * {@code 207: 프로젝트 삭제 권한이 없습니다.}
	 */
	DELETE_DENIED(207, "프로젝트 삭제 권한이 없습니다."),
	
	/**
	 * {@code 207: 프로젝트 삭제 권한이 없습니다.}
	 */
	MODIFY_DENIED(208, "프로젝트 수정 권한이 없습니다."),
	
	/**
	 * {@code 207: 프로젝트 삭제 권한이 없습니다.}
	 */
	ATHRT_MODIFY_DENIED(209, "수정할 수 있는 프로젝트 권한이 아닙니다."),

	/**
	 * {@code 210: 프로젝트 잠금 해제에 실패하였습니다}.
	 */
	UNLOCK_FAIL(210, "프로젝트 잠금 해제에 실패하였습니다."),
	
	/**
	 * {@code 211: 프로젝트가 이미 잠겨있습니다.}.
	 * */
	LOCK_FAIL(211, "프로젝트가 이미 잠겨있습니다."),
	
	/**
	 * {@code 212: 프로젝트가 잠겨있지 않습니다.}.
	 * */	
	UNLOCK_PROJ(212, "프로젝트가 잠겨있지 않습니다."),
	
	/**
	 * {@code 213: 프로젝트를 잠근 사용자가 아닙니다.}.
	 * */	
	LOCK_USER_DIFF(213, "프로젝트를 잠근 사용자가 아닙니다."),
	
	/**
	 * {@code 214: 프로젝트 잠근 권한이 없습니다.}.
	 * */
	LOCK_ATHRT_FAIL(214, "프로젝트 잠근 권한이 없습니다."),
	
	/**
	 * {@code 215: 존재하지 않는 카테고리ID입니다.}.
	 * */
	NON_CTGRY_ID(215, "존재하지 않는 카테고리ID입니다."),
	
	/**
	 * {@code 216: 프로젝트 복구에 실패했습니다. 관리자에게문의하세요.}.
	 * */
	PROJ_ROLLBACK_FAIL(216, "프로젝트 복구에 실패했습니다. 관리자에게 문의하세요."),
	
	/**
	 * {@code 217: 프로젝트의 파트장은 한 명이어야 합니다.}.
	 * */
	PROJ_MEMBER_ATHRT_FAIL(217, "프로젝트의 파트장은 한 명이어야 합니다."),
	/*
	 * ============================================================
	 * 실험 파일 분석 및 통계 처리 응답 코드: 300 ~ 399
	 * ============================================================
	 */

	/**
	 * {@code 300: }
	 */
	INVALID_EXPERIMENT_FILES(300,  "잘못된 실험파일 입니다."),
	
	/**
	 * {@code 301: }
	 */
	INVALID_PCR_EQUIPMENT_TYPE(301,  "잘못된 장비코드 입니다."),
	
	/**
	 * {@code 302: }
	 */
	INSERT_QAR_FAIL(302,  "QAR 파일 INSERT에 실패했습니다."),
	
	/**
	 * {@code 303: MCDR 파일 INSERT에 실패했습니다.}
	 */
	INSERT_MCDR_FAIL(303,  "MCDR 파일 INSERT에 실패했습니다."),
	
	/**
	 * {@code 304: QS 파일 INSERT에 실패했습니다.}
	 */
	INSERT_QS_FAIL(304,  "QS 파일 INSERT에 실패했습니다."),
	
	/**
	 * {@code 305: LABEL 파일 INSERT에 실패했습니다.}
	 */
	INSERT_LABEL_FAIL(305,  "LABEL 파일 INSERT에 실패했습니다."),
	
	/**
	 * {@code 306: 분석에 실패했습니다.}
	 */
	ANALYSIS_FAIL(306,  "분석에 실패했습니다."),
	
	/**
	 * {@code 307: 분석에 사용되지 않은 Target입니다.}
	 */
	UNUSED_TARGET(307,  "분석에 사용되지 않은 Target입니다."),
	
	/**
	 * {@code 308: 분석결과를 가져오는데 실패했습니다.}
	 */
	GET_ANALYSIS_RESULT_FAIL(308,  "분석결과를 가져오는데 실패했습니다."),
	
	/**
	 * {@code 309: Label 입력(실험정보)이 완료되지 않았습니다.} 
	 */
	FAILED_TO_LABELING(309, "Label 입력(실험정보)이 완료되지 않았습니다"),
	
	/**
	 * {@code 310: Well Memo는 50자 미만으로 입력해 주세요.} 
	 */
	TOO_LONG_WELL_MEMO(310, "Well Memo는 50자 미만으로 입력해 주세요."),
	
	/**
	 * {@code 311: Raw Data를 조회할 수 없습니다. 다시 로그인해 주세요.} 
	 */
	INVALID_TEMP_PROJECT_ID(311, "Raw Data를 조회할 수 없습니다. 다시 로그인해 주세요"),
	
	/**
	 * {@code 312: Raw Data를 조회할 수 없습니다. 다시 로그인해 주세요.} 
	 */
	INVALID_ANLSSRSLT_ID(312, "Raw Data를 조회할 수 없습니다. 다시 분석을 진행해주세요"),
	
	/**
	 * {@code 313: 분석에 사용할 Target을 한 개 이상 선택해주세요.} 
	 */
	REQUIRED_USED_TEMP(313, "분석에 사용할 Target을 한 개 이상 선택해주세요"),
	
	/**
	 * {@code 314: 실험에 사용되지 않은 Target입니다.} 
	 */
	NOT_USED_IN_EXPERIMENT_TARGET(314, "실험에 사용되지 않은 Target입니다."),
	
	/**
	 * {@code 315: DSP Baseline은 분석이 선행되어야 합니다.}
	 */
	NEED_TO_ANALYZE_FIRST(315, "DSP Baseline은 분석이 선행되어야 합니다."),
	
	/**{@code 316: RV End 계산에 실패했습니다.}
	 * 
	 */
	FAILED_TO_CALC_RV_END(316, "RV End 계산에 실패했습니다."),
	
	/**
	 * {@code 317: 분석된 결과가 없습니다. 분석을 먼저 진행해주세요.}
	 */
	NO_ANALYZED_RESULT(317, "분석된 결과가 없습니다. 분석을 먼저 진행해주세요."),
	
	/**
	 * {@code 318: 지정된 그래프 그룹이 없습니다. 그래프 그룹을 먼저 지정해주세요.}
	 */
	GRAPH_GROUP_NOT_SPECIFIED(318, "지정된 그래프 그룹이 없습니다. 그래프 그룹을 먼저 지정해주세요. "),
	
	/**
	 * {@code 319: 프로젝트에 업로드된 타 실험과 동일한 장비가 아닙니다.}
	 */
	DIFFERENT_EQUIPMENT_TYPE(319, "등록된 실험과 PCR 장비 구분이 맞지 않습니다."),
	
	/**
	 * {@code 320: 카테고리가 선택되지 않았습니다. 실험파일을 업로드 할 카테고리를 먼저 선택해주세요.}
	 */
	CATEGORY_NOT_SELECTED(320, "카테고리가 선택되지 않았습니다. 실험파일을 업로드 할 카테고리를 먼저 선택해주세요. "),
	/*
	 * ============================================================
	 * 엑셀 Import, Export 관련 응답 코드: 400 ~ 449
	 * ============================================================
	 */
	/**
	 * {@code 400: 잘못된 Excel File 입니다.}
	 */
	INVALID_EXCEL_FILE(400, "잘못된 Excel File 입니다."),
	
	/**
	 * {@code 401: 엑셀파일 Export에 실패했습니다.}
	 */
	FAILED_TO_EXPORT_EXCEL_FILE(401, "엑셀 파일 Export 실패했습니다."),
	
	/**
	 * {@code 402: 잘못된 Label File 입니다.} 
	 */
	INVALID_LABEL_FILE(402, "잘못된 Label File 입니다."),
	
	/*
	 * ============================================================
	 * 설정값 관련 응답 코드: 450 ~ 499
	 * ============================================================
	 */
	/**
	 * {@code 450: 삭제된 설정값입니다.}
	 */
	DELETED_PARAMETER(450, "삭제된 설정값입니다."),

	/**
	 * {@code 451: 기준설정값 설정  권한이 없습니다..}
	 */
	STNDR_PARAM_DENIED(451, "기준설정값 설정  권한이 없습니다."),
	/**
	 * {@code 452: 저장 및 수정 권한이 없습니다.}
	 */
	SAVE_PARAM_DENIED(452, "저장 및 수정 권한이 없습니다."),
	
	/**
	 * {@code 453: 설정값 조회 건수를 초과하였습니다.}
	 */
	SELECT_OVER_CNT(453, " 설정값 조회 건수를 초과하였습니다."),
	
	/**
	 * {@code 454: 모든 실험의 분석이 진행되지 않았습니다.분석을 실행 후 다시 시도해 주세요.}
	 */
	ANALYSIS_UNDER_CNT(454, "모든 실험의 분석이 진행되지 않았습니다.분석을 실행 후 다시 시도해 주세요."),
	
	/**
	 * {@code 455, 해당 설정값으로 분석이 진행되지 않았습니다. 분석을 진행 후 다시 시도해 주세요.}
	 */
	NOT_ANALYSIS(455, "해당 설정값으로 분석이 진행되지 않았습니다. 분석을 진행 후 다시 시도해 주세요."),
	/**
	 * {@code 456, 요청하신 Target내 분석 결과가 없습니다. 요청 Target을  확인해주세요..}
	 */
	NOT_TARGET_RSLT(456, "요청하신 Target내 분석 결과가 없습니다. 요청 Target을  확인해주세요."),
	
	/**
	 * {@code 457, 프로젝트를 생성 혹은 오픈 후 설정값을 저장해 주세요.}
	 */
	NOT_PROJ_SAVE_PARAM(457, "프로젝트를 생성 혹은 오픈 후 설정값을 저장해 주세요."),
	
			
	/*
	 * ============================================================
	 * 랩노트 관련 응답 코드: 500 ~ 549
	 * ============================================================
	 */
	/**
	 * {@code 500: Label 입력이 완료되지 않았습니다.}
	 */
	EMPTY_LABEL_INFO(500, "Label 입력이 완료되지 않았습니다."),
	
	/**
	 * {@code 501: Oligo Mix 정보 수정에 실패했습니다.}
	 */
	FAILED_TO_UPDATE_OM(501, "Oligo Mix 정보 수정에 실패했습니다."),
	
	/**
	 * {@code 502: Interpretation Type 정보가 불충분합니다.}
	 */
	FAILED_TO_UPDATE_INTERPRETATION_TYPE(502, "Interpretation Type 정보가 불충분합니다."),
	
	/**
	 * {@code 503: Interpretation Case 정보가 불충분합니다.}
	 */
	FAILED_TO_UPDATE_INTERPRETATION_INFO(503, "Interpretation Case 정보가 불충분합니다."),

	/*
	 * ============================================================
	 * 어드민 관련 응답 코드: 600 ~ 650
	 * ============================================================
	 */
	/**
	 * {@code 600: 등록되지 않은 사용자입니다}.
	 */
	UNREGISTERED_USER(600, "등록되지 않은 사용자입니다."),

	/**
	 * {@code 601: 등록되지 않은 도움말입니다}.
	 */
	NOT_FOUND_HELP(601, "등록되지 않은 도움말입니다."),

	/**
	 * {@code 602: 관리자 권한이 없습니다}.
	 */
	PERMISSION_DENIED(602, "관리자 권한이 없습니다."),

	/**
	 * {@code 603: 파일 저장에 실패하였습니다}.
	 */
	FAILED_TO_SAVE_FILE(603, "파일 저장에 실패하였습니다."),

	/**
	 * {@code 604: 지원되지 않는 형식의 첨부 파일입니다}.
	 */
	UNSUPPORTED_ATTACHED_FILE(604, "지원되지 않는 형식의 첨부 파일입니다."),

	/**
	 * {@code 605: 등록되지 않은 파일입니다}.
	 */
	NOT_FOUND_FILE(605, "등록되지 않은 파일입니다."),
	
	/**
	 * {@code 606: 이미 저장된 도움말 카테고리명입니다}.
	 */
	DUPLICATED_HELP_CATEGORY_NANE(606,"이미 저장된 도움말 카테고리명입니다."),

	/**
	 * {@code 607: 등록되지 않은 도움말 카테고리입니다}.
	 */
	NOT_FOUND_HELP_CATEGORY(607,"등록되지 않은 도움말 카테고리입니다."),

	/**
	 * {@code 608: 이미 존재하는 버전 정보입니다}.
	 */
	DUPLICATED_VERSION(608,"이미 존재하는 버전 정보입니다."),

	/**
	 * {@code 609: 개인정보처리방침이 존재하지 않습니다}.
	 */
	NOT_FOUND_PRIVACY_POLICY(609," 개인정보처리방침이 존재하지 않습니다."),

	/**
	 * {@code 610: 서비스이용약관이 존재하지 않습니다}.
	 */
	NOT_FOUND_TERMS_OF_SERVICE(610," 서비스이용약관이 존재하지 않습니다.");
	
	
	
	private int code;
	private String message;

	SeesawResultCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int code() {
		return this.code;
	}
	
	public String message() {
		return this.message;
	}
	
	public static SeesawResultCode codeOf(int code) {
		return Arrays.stream(SeesawResultCode.values())
			.filter(rc -> rc.code() == code)
			.findAny()
			.orElse(null);
	}
}
