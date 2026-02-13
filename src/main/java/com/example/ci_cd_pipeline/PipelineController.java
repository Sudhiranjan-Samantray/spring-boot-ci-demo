package com.example.ci_cd_pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelineController {

    @GetMapping("ci-cd")
    public String data()
    {
        return "Cicd pipe_line building";
    }
}
