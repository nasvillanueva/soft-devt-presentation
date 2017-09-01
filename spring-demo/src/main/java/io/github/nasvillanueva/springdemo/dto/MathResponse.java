package io.github.nasvillanueva.springdemo.dto;

public class MathResponse {
    private int answer;

    public MathResponse(int answer) {
        this.answer = answer;
    }

    public MathResponse() {
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
