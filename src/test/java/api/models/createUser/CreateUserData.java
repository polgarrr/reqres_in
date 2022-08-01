package api.models.createUser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserData {
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("id")
    private String id;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public CreateUserData(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public CreateUserData() {}
}
