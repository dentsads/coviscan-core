/*-
 * ---license-start
 * Copyright (C) 2022 Coviscan and all other contributors
 * ---
 * European Digital COVID Certificate Validation Decorator Service / dgca-validation-decorator
 * ---
 * Copyright (C) 2021 T-Systems International GmbH and all other contributors
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---license-end
 */

package eu.europa.ec.dgc.validation.decorator.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DccTokenRequest {

    // Chosen Validator Service from Identity Document
    @NotBlank
    private String service;

    // The request body contains the public ECDSA (P-256)/RSA-PSS key 
    // generated by the service frontend in plain text (base64).
    @NotBlank
    private String pubKey;
}
