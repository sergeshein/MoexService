package com.eralash.moexservice.dto;

import lombok.Value;

@Value
public class BondDto {
    String ticker;
    String name;
    Double price;
}
