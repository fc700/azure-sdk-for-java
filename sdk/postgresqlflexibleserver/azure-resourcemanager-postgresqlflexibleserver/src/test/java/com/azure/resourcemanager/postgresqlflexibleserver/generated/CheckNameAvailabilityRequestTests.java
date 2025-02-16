// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model =
            BinaryData
                .fromString("{\"name\":\"jdkirsoodqx\",\"type\":\"rmnohj\"}")
                .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("jdkirsoodqx", model.name());
        Assertions.assertEquals("rmnohj", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model =
            new CheckNameAvailabilityRequest().withName("jdkirsoodqx").withType("rmnohj");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("jdkirsoodqx", model.name());
        Assertions.assertEquals("rmnohj", model.type());
    }
}
