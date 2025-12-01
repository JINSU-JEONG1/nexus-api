package com.nexus.backend.api.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexus.backend.api.user.entity.User;
import com.nexus.backend.api.user.dto.UserDto;
import com.nexus.backend.api.user.repository.UserRepository;

import java.util.List;

/**
 * 사용자 서비스
 */
@Service  
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    /**
     * 전체 사용자 목록 조회
     */
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserDto::from)
                .toList();
    }

    /**
     * 사용자 상세 조회
     */
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));
        return UserDto.from(user);
    }
}
