package com.github.seratch.jslack.lightning.handler;

import com.github.seratch.jslack.lightning.request.builtin.OAuthCallbackRequest;
import com.github.seratch.jslack.lightning.response.Response;

@FunctionalInterface
public interface OAuthErrorHandler {

    Response handle(OAuthCallbackRequest req);

}
