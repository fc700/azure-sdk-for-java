// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.DatasetResource;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DatasetsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"type\":\"Dataset\",\"description\":\"om\",\"structure\":\"dataioatzmr\",\"schema\":\"datasrjjajlr\",\"linkedServiceName\":{\"referenceName\":\"lmj\",\"parameters\":{\"pytfdzkbkyt\":\"datawqpnmcwes\",\"dkrmpljzrzvl\":\"dataztwwkvwpbdo\"}},\"parameters\":{\"rlug\":{\"type\":\"Bool\",\"defaultValue\":\"datalygy\"}},\"annotations\":[\"datawh\",\"dataeqzlvjlsyzzk\"],\"folder\":{\"name\":\"eydjagyks\"},\"\":{\"jbxh\":\"datagiwaaz\",\"lx\":\"dataahgbloeaewidum\",\"majirnqcbhviqwfc\":\"datacgbyx\"}},\"name\":\"y\",\"type\":\"afoor\",\"etag\":\"ktdgbombn\",\"id\":\"nxkcp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DatasetResource response =
            manager
                .datasets()
                .getWithResponse("ccnubynr", "encgfz", "btzuddqt", "hxtbcqjvyzotxkhy", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("nxkcp", response.id());
        Assertions.assertEquals("om", response.properties().description());
        Assertions.assertEquals("lmj", response.properties().linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, response.properties().parameters().get("rlug").type());
        Assertions.assertEquals("eydjagyks", response.properties().folder().name());
    }
}
