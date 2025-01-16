package com.example.relationprac.domain.user.dto;

import com.example.relationprac.domain.user.User;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class UserOrdersResponseDto {
    private final Long id;
    private final String username;
    private final String nickname;
    private final int age;
    private final String team;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private final List<String> orders;

    public static UserOrdersResponseDto from(User entity) {
        return UserOrdersResponseDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .team(entity.getTeam().getTeamName())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .orders(entity.getOrders().stream().map(
                        o -> o.getProduct().getProductName()).toList()
                ).build();
    }
}
