/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.snowdrop.licenses.sanitiser.provider;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * <br>
 * Date: 10/20/17
 * <p>
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalLicensesDto {
    private Set<ExternalLicenseDto> licenses;

    public Set<ExternalLicenseDto> getLicenses() {
        return licenses;
    }

    public void setLicenses(Set<ExternalLicenseDto> licenses) {
        this.licenses = licenses;
    }
}