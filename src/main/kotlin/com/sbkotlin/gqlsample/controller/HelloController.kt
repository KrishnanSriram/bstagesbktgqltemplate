package com.sbkotlin.gqlsample.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/hello")
@RestController
class HelloController {
    @GetMapping
    fun sayHello(): ResponseEntity<String> {
        return ResponseEntity("Welcome to GraphQL example", HttpStatus.OK)
    }
}