package com.apr.backend.controller;

import com.apr.backend.common.ApiResponseDto;
import com.apr.backend.entity.User;
import com.apr.backend.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @Operation(summary = "사용자 목록 조회", description = "전체 사용자 목록을 조회합니다")
    @GetMapping
    public ResponseEntity<ApiResponseDto<Object>> getUsers() {
        return ResponseEntity.ok(ApiResponseDto.success(userService.getAllUsers(), "사용자 목록을 성공적으로 조회했습니다."));
    }

    @Operation(summary = "사용자 상세 조회", description = "특정 사용자의 상세 정보를 조회합니다")
    @GetMapping("/{userId}")
    public ResponseEntity<ApiResponseDto<User>> getUser(
            @Parameter(description = "사용자 ID", required = true)
            @PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(ApiResponseDto.success(user, "사용자 정보를 성공적으로 조회했습니다."));
    }
}
