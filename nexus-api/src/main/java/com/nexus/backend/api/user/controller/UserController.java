package com.nexus.backend.api.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nexus.backend.api.user.entity.User;
import com.nexus.backend.api.user.service.UserService;

/**
 * 사용자 관리 컨트롤러
 */
@Tag(name = "사용자 관리", description = "사용자 관련 API")
@Slf4j
@RestController  
@RequestMapping("/api/users")  
@RequiredArgsConstructor 
public class UserController {

    private final UserService userService;

}
