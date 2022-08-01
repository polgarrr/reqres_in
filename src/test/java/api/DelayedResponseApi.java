package api;

import api.models.getDelayedResponse.DelayedResponse;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.DelayedResponseEndpoints.DELAYED_RESPONSE;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class DelayedResponseApi {

    public static DelayedResponse getDelayedResponseSuccess(String delay) {
        return given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(DELAYED_RESPONSE.getDelayedResponseUrl(), delay))
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(DelayedResponse.class);
    }

}
