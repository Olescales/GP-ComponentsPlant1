package com.example.componentsplant.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MakeOrderResponse {
    private Goods id;
}
