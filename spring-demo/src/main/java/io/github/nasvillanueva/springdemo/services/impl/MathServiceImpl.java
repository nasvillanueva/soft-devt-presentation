package io.github.nasvillanueva.springdemo.services.impl;

import io.github.nasvillanueva.springdemo.dto.MathRequest;
import io.github.nasvillanueva.springdemo.dto.MathResponse;
import io.github.nasvillanueva.springdemo.services.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public MathResponse solve(MathRequest request) {
        int solution = 0;
        switch (request.getOp()) {
            case ADD:
                solution = request.getX() + request.getY();
                break;
            case SUB:
                solution = request.getX() - request.getY();
                break;
            case MUL:
                solution = request.getX() * request.getY();
                break;
            case DIV:
                solution = request.getX() / request.getY();
                break;
        }
        return new MathResponse(solution);
    }
}
