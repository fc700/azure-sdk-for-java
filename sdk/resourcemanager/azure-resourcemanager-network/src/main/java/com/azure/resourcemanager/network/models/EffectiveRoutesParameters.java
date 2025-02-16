// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters specifying the resource whose effective routes are being requested. */
@Fluent
public final class EffectiveRoutesParameters {
    /*
     * The resource whose effective routes are being requested.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The type of the specified resource like RouteTable, ExpressRouteConnection, HubVirtualNetworkConnection,
     * VpnConnection and P2SConnection.
     */
    @JsonProperty(value = "virtualWanResourceType")
    private String virtualWanResourceType;

    /** Creates an instance of EffectiveRoutesParameters class. */
    public EffectiveRoutesParameters() {
    }

    /**
     * Get the resourceId property: The resource whose effective routes are being requested.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource whose effective routes are being requested.
     *
     * @param resourceId the resourceId value to set.
     * @return the EffectiveRoutesParameters object itself.
     */
    public EffectiveRoutesParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the virtualWanResourceType property: The type of the specified resource like RouteTable,
     * ExpressRouteConnection, HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     *
     * @return the virtualWanResourceType value.
     */
    public String virtualWanResourceType() {
        return this.virtualWanResourceType;
    }

    /**
     * Set the virtualWanResourceType property: The type of the specified resource like RouteTable,
     * ExpressRouteConnection, HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     *
     * @param virtualWanResourceType the virtualWanResourceType value to set.
     * @return the EffectiveRoutesParameters object itself.
     */
    public EffectiveRoutesParameters withVirtualWanResourceType(String virtualWanResourceType) {
        this.virtualWanResourceType = virtualWanResourceType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
