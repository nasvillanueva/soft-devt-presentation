package io.github.nasvillanueva.springdemo.services;

import io.github.nasvillanueva.springdemo.dto.MathRequest;
import io.github.nasvillanueva.springdemo.dto.MathResponse;

public interface MathService {

    MathResponse solve(MathRequest request);
}
