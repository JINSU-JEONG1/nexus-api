package com.nexus.backend.api.user.dto;

import com.nexus.backend.api.user.entity.User;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 사용자 DTO
 */

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserDto {
    
    private Long id;
    private String userId;
    private String userName;
    private Boolean isActive;

}
