package api.models.getResource;

import api.models.Support;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {
    @JsonProperty("data")
    private Data data;
    @JsonProperty("support")
    private Support support;

    public Data getData() {
        return data;
    }
}
