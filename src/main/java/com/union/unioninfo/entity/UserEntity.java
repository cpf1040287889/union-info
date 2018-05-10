package com.union.unioninfo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private Integer id;
    private String userName;
    private String email;
    private String password;
    private Long createTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
