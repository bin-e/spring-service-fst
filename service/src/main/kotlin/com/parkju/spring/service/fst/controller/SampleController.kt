package com.parkju.spring.service.fst.controller

import com.parkju.spring.service.fst.contract.SampleContract
import com.parkju.spring.service.fst.service.SampleService
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) : SampleContract {
    // fun
}