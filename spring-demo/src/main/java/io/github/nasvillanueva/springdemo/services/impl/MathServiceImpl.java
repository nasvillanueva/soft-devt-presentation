package io.github.nasvillanueva.springdemo.services.impl;

import io.github.nasvillanueva.springdemo.dto.MathRequest;
import io.github.nasvillanueva.springdemo.dto.MathResponse;
import io.github.nasvillanueva.springdemo.services.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {


    @Override
    public MathResponse solve(MathRequest request) {
        return null;
    }
}
