package com.nexus.backend.api.shortUrl.dto;

import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class shortDTO {
    
    private Long id;
    private String shortUrl;
    private String longUrl;
    private String createdAt;
    private String updatedAt;
}
