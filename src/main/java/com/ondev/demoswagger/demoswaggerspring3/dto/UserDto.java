package com.ondev.demoswagger.demoswaggerspring3.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.Builder.Default;
import lombok.experimental.FieldDefaults;

/**
 * @author MJean-Claude
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonSerialize
@JsonDeserialize
@JsonInclude(value = Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserDto {
    String id;
    @NotBlank(message = "Name is mandatory")
    String name;
    @Default
    String surname= "";
    Long age;
    public static boolean isMajor(UserDto user){
        return user.age>=18;
    }
    public static boolean isMinor(UserDto user){
        return user.age>=0 && user.age<18;
    }
}
