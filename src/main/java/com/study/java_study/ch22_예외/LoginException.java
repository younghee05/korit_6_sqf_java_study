package com.study.java_study.ch22_예외;

import lombok.Data;

@Data
public class LoginException extends RuntimeException {
    private String username;

    // Alt + Ins 를 눌러 Constructor에 들어가 무슨 String massage 누르고 그안에 것을 눌러 불러옴
    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }

    public String getErrorMessage() {
        return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다";
    }
}
