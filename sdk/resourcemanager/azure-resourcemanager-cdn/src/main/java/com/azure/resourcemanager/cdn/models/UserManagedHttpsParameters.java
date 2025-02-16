// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the certificate source parameters using user's keyvault certificate for enabling SSL. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "certificateSource")
@JsonTypeName("AzureKeyVault")
@Fluent
public final class UserManagedHttpsParameters extends CustomDomainHttpsParameters {
    /*
     * Defines the certificate source parameters using user's keyvault certificate for enabling SSL.
     */
    @JsonProperty(value = "certificateSourceParameters", required = true)
    private KeyVaultCertificateSourceParameters certificateSourceParameters;

    /**
     * Get the certificateSourceParameters property: Defines the certificate source parameters using user's keyvault
     * certificate for enabling SSL.
     *
     * @return the certificateSourceParameters value.
     */
    public KeyVaultCertificateSourceParameters certificateSourceParameters() {
        return this.certificateSourceParameters;
    }

    /**
     * Set the certificateSourceParameters property: Defines the certificate source parameters using user's keyvault
     * certificate for enabling SSL.
     *
     * @param certificateSourceParameters the certificateSourceParameters value to set.
     * @return the UserManagedHttpsParameters object itself.
     */
    public UserManagedHttpsParameters withCertificateSourceParameters(
        KeyVaultCertificateSourceParameters certificateSourceParameters) {
        this.certificateSourceParameters = certificateSourceParameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserManagedHttpsParameters withProtocolType(ProtocolType protocolType) {
        super.withProtocolType(protocolType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserManagedHttpsParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        super.withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (certificateSourceParameters() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateSourceParameters in model UserManagedHttpsParameters"));
        } else {
            certificateSourceParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserManagedHttpsParameters.class);
}
