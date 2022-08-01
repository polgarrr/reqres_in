package tests.api.delayedResponse;

import api.DelayedResponseApi;
import api.models.getDelayedResponse.DelayedResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GettingDelayedResponseTest {

    @Test
    public void checkingGetDelayedResponse() {
        String delay = "?delay=3";
        int page = 1;
        int perPage = 6;
        int total = 12;
        int totalPages = 2;

        DelayedResponse delayedResponse = DelayedResponseApi.getDelayedResponseSuccess(delay);

        assertEquals(page, delayedResponse.getPage());
        assertEquals(perPage, delayedResponse.getPerPage());
        assertEquals(total, delayedResponse.getTotal());
        assertEquals(totalPages, delayedResponse.getTotalPages());
    }

}
