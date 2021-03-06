package com.tinyurl.app.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestObject {
    String actualUrl;
    String tinyUrl;
    Date expiryDate;
}
