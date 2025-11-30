package com.nexus.api.dto;

import com.nexus.api.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 사용자 DTO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    
    private Long id;
    private String userId;
    private String userName;
    private Boolean isActive;
    
    /**
     * Entity에서 DTO로 변환하는 정적 팩토리 메서드
     */
    public static UserDto from(User user) {
        return UserDto.builder()
                .id(user.getId())
                .userId(user.getUserId())
                .isActive(user.getIsActive())
                .build();
    }
}
