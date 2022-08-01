package api;

import api.endpoints.ResourceEndpoints;
import api.models.getResource.Resource;
import api.models.getUser.User;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.ResourceEndpoints.SINGLE;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class ResourcesApi {

    public static Resource getResourceSuccess(int resourceId) {
        return given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(SINGLE.getResourceUrl(), resourceId))
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(Resource.class);
    }

}
