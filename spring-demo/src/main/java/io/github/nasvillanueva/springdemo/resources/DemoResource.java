package io.github.nasvillanueva.springdemo.resources;

import io.github.nasvillanueva.springdemo.dto.MathRequest;
import io.github.nasvillanueva.springdemo.dto.MathResponse;
import io.github.nasvillanueva.springdemo.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

    @Autowired
    private MathService mathService;

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping("/math")
    public ResponseEntity<MathResponse> math(@RequestBody MathRequest request) {
        return ResponseEntity.ok(mathService.solve(request));
    }

}
