package id.indrasudirman.belajarspringboot1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotBlank;
import java.util.UUID;


public class Person {

    private final UUID id;
    @NotBlank
    private final String name;

    @JsonPropertyOrder({"name", "id"})
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
