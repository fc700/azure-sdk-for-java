// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolPropertiesInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.RegistrationInfoInner;
import com.azure.resourcemanager.desktopvirtualization.models.AgentUpdateProperties;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolProperties;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.LoadBalancerType;
import com.azure.resourcemanager.desktopvirtualization.models.PersonalDesktopAssignmentType;
import com.azure.resourcemanager.desktopvirtualization.models.PreferredAppGroupType;
import com.azure.resourcemanager.desktopvirtualization.models.RegistrationInfo;
import com.azure.resourcemanager.desktopvirtualization.models.SsoSecretType;
import java.util.Collections;
import java.util.List;

public final class HostPoolPropertiesImpl implements HostPoolProperties {
    private HostPoolPropertiesInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    HostPoolPropertiesImpl(
        HostPoolPropertiesInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public HostPoolType hostPoolType() {
        return this.innerModel().hostPoolType();
    }

    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.innerModel().personalDesktopAssignmentType();
    }

    public String customRdpProperty() {
        return this.innerModel().customRdpProperty();
    }

    public Integer maxSessionLimit() {
        return this.innerModel().maxSessionLimit();
    }

    public LoadBalancerType loadBalancerType() {
        return this.innerModel().loadBalancerType();
    }

    public Integer ring() {
        return this.innerModel().ring();
    }

    public Boolean validationEnvironment() {
        return this.innerModel().validationEnvironment();
    }

    public RegistrationInfo registrationInfo() {
        RegistrationInfoInner inner = this.innerModel().registrationInfo();
        if (inner != null) {
            return new RegistrationInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String vmTemplate() {
        return this.innerModel().vmTemplate();
    }

    public List<String> applicationGroupReferences() {
        List<String> inner = this.innerModel().applicationGroupReferences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ssoadfsAuthority() {
        return this.innerModel().ssoadfsAuthority();
    }

    public String ssoClientId() {
        return this.innerModel().ssoClientId();
    }

    public String ssoClientSecretKeyVaultPath() {
        return this.innerModel().ssoClientSecretKeyVaultPath();
    }

    public SsoSecretType ssoSecretType() {
        return this.innerModel().ssoSecretType();
    }

    public PreferredAppGroupType preferredAppGroupType() {
        return this.innerModel().preferredAppGroupType();
    }

    public Boolean startVMOnConnect() {
        return this.innerModel().startVMOnConnect();
    }

    public Boolean cloudPcResource() {
        return this.innerModel().cloudPcResource();
    }

    public AgentUpdateProperties agentUpdate() {
        return this.innerModel().agentUpdate();
    }

    public HostPoolPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
