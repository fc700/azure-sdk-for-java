// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetwork;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedVirtualNetworkListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedVirtualNetworkListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"vNetId\":\"o\",\"alias\":\"vmfqhppubo\",\"\":{\"juahokqto\":\"datapdfgkmtdherngbt\",\"hfphwpnulaiywze\":\"datakauxof\",\"wrpqafgfugsnnf\":\"dataywhslwkojpllndnp\",\"coc\":\"datayetefyp\"}},\"name\":\"jgtixr\",\"type\":\"zuyt\",\"etag\":\"mlmuowol\",\"id\":\"uir\"}],\"nextLink\":\"ionszonwp\"}")
                .toObject(ManagedVirtualNetworkListResponse.class);
        Assertions.assertEquals("uir", model.value().get(0).id());
        Assertions.assertEquals("ionszonwp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedVirtualNetworkListResponse model =
            new ManagedVirtualNetworkListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedVirtualNetworkResourceInner()
                                .withId("uir")
                                .withProperties(
                                    new ManagedVirtualNetwork()
                                        .withAdditionalProperties(mapOf("vNetId", "o", "alias", "vmfqhppubo")))))
                .withNextLink("ionszonwp");
        model = BinaryData.fromObject(model).toObject(ManagedVirtualNetworkListResponse.class);
        Assertions.assertEquals("uir", model.value().get(0).id());
        Assertions.assertEquals("ionszonwp", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
