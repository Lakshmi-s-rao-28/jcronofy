package org.biacode.jcronofy.api.model.request;

import org.biacode.jcronofy.api.model.common.AbstractAccessTokenAwareCronofyRequest;

/**
 * User: Arthur Asatryan
 * Date: 10/4/16
 * Time: 4:33 PM
 */
public class ListCalendarsRequest extends AbstractAccessTokenAwareCronofyRequest {
    private static final long serialVersionUID = 3308300414169780108L;

    //region Properties
    //endregion

    //region Constructors
    public ListCalendarsRequest() {
    }

    public ListCalendarsRequest(final String accessToken) {
        super(accessToken);
    }
    //endregion

    //region Equals, HashCode and ToString
    //endregion

    //region Properties getters and setters
    //endregion
}
