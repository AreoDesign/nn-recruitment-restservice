package com.it.aro.nnrestservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {

    private Long id;
    private String login;
    private String name;
    private UserType type;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "{\n" +
                "\t \"id\"" + ": \"" + id + "\", \n" +
                "\t \"login\"" + ": \"" + login + "\", \n" +
                "\t \"name\"" + ": \"" + name + "\", \n" +
                "\t \"type\"" + ": \"" + type + "\", \n" +
                "\t \"avatarUrl\"" + ": \"" + avatarUrl + "\", \n" +
                "\t \"createdAt\"" + ": \"" + createdAt + "\" \n" +
                '}';
    }
}
