/*
 * Created by bijay
 * GOFLEX :: WP2 :: foa-core
 * Copyright (c) 2018.
 *
 *  Permission is hereby granted, free of charge, to any person
 *  obtaining  a copy of this software and associated documentation
 *  files (the "Software") to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge,
 *  publish, distribute, sublicense, and/or sell copies of the Software,
 *  and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions: The above copyright notice and
 *  this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 *  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON
 *  INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE.
 *
 *  Last Modified 8/26/17 6:45 PM
 */

package org.goflex.wp2.fogenerator.event;

import org.goflex.wp2.core.models.DeviceDetail;
import org.goflex.wp2.core.models.Organization;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Ivan Bizaca on 21/07/2017.
 */
public class TCLFOGeneration extends ApplicationEvent {
    private String eventName;
    private String securityToken;
    private DeviceDetail deviceDetail;
    private Organization organization;

    public TCLFOGeneration(Object source, String eventName, String securityToken,
                           DeviceDetail deviceDetail, Organization organization) {
        super(source);
        this.eventName = eventName;
        this.securityToken = securityToken;
        this.deviceDetail = deviceDetail;
        this.organization = organization;

    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }


    public DeviceDetail getDeviceDetail() {
        return deviceDetail;
    }

    public void setDeviceDetail(DeviceDetail deviceDetail) {
        this.deviceDetail = deviceDetail;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
