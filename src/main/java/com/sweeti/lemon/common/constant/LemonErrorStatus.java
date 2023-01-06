package com.sweeti.lemon.common.constant;

import lombok.Getter;

@Getter
public enum LemonErrorStatus {

    NO_ADDRESS("NoAddress", 1101, 400, "주소의 검색 결과가 없습니다."),
    DUPLICATED_DATA("DuplicatedData", 1102, 400, "중복되는 데이터가 있습니다."),
    NO_DATA("NoData", 1104, 400, "요청 데이터가 존재하지 않습니다."),
    BAD_REQUEST("BadRequest", 1106, 400, "요청 데이터가 잘못되었습니다."),
    DUPLICATED_USER("DuplicatedUser", 1107, 400, "이미 해당 이메일의 유저가 있습니다."),
    ALREADY_ASSIGNED("AlreadyAssigned", 1110, 400, "이미 배차된 데이터입니다."),
    UNAUTHORIZED("Unauthorized", 1201, 401, "토큰이 잘못되었습니다."),
    WRONG_KEY("WrongKey", 1202, 401, "만료되었거나 존재하지 않는 인증 키입니다."),
    NO_AUTHORITY("NoAuthority", 1203, 403, "현재 로그인한 계정은 해당 기능 권한을 가지고 있지 않습니다."),
    MAX_USAGE("MaxUsage", 1204, 403, "일일 사용 가능량을 초과하였습니다."),
    SERVER_ERROR("ServerError", 1004, 500, "처리 중 오류가 발생하였습니다."),
    GEO_CODING_ERROR("GeoCodingError", 1005, 500, "좌표 변환 중 오류가 발생하였습니다."),
    ENCRYPTION_ERROR("EncryptionError", 1008, 500, "비밀번호 암호화 중 오류가 발생하였습니다."),
    TOKEN_ERROR("TokenError", 1009, 500, "토큰 생성 중 오류가 발생하였습니다.");

    private final String name;
    private final int code;
    private final int statusCode;
    private final String message;


    LemonErrorStatus(String name, int code, int statusCode, String message) {
        this.name = name;
        this.code = code;
        this.statusCode = statusCode;
        this.message = message;
    }
}
