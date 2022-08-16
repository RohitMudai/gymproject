package com.gym.globalgym.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class GymInfo {
    private String name;
    private String address;
    private String owner;
    private String fees;
    private String timing;
}
