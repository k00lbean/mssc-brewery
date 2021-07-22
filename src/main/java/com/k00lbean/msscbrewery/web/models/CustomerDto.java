package com.k00lbean.msscbrewery.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;
    private String name;
}
