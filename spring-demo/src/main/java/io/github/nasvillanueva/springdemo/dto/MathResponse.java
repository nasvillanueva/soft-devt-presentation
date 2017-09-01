package io.github.nasvillanueva.springdemo.dto;

import java.math.BigInteger;

public class MathResponse {
    private BigInteger answer;

    public BigInteger getAnswer() {
        return answer;
    }

    public void setAnswer(BigInteger answer) {
        this.answer = answer;
    }
}
