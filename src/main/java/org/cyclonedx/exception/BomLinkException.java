/*
 * This file is part of CycloneDX Core (Java).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) OWASP Foundation. All Rights Reserved.
 */
package org.cyclonedx.exception;

/**
 * Exception throws when parsing CycloneDX BOM-Link URNs.
 *
 * @author Steve Springett
 * @since 7.1.4
 */
public class BomLinkException extends Exception {

    /**
     * Constructs a new exception.
     * @param message the detail message.
     * @since 7.1.4
     */
    public BomLinkException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception.
     * @param cause the cause
     * @since 7.1.4
     */
    public BomLinkException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new exception.
     * @param message the detail message.
     * @param cause the cause
     * @since 7.1.4
     */
    public BomLinkException(String message, Throwable cause) {
        super(message, cause);
    }
}
