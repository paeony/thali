/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

THIS CODE IS PROVIDED ON AN *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER EXPRESS OR IMPLIED,
INCLUDING WITHOUT LIMITATION ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A PARTICULAR PURPOSE,
MERCHANTABLITY OR NON-INFRINGEMENT.

See the Apache 2 License for the specific language governing permissions and limitations under the License.
*/

package com.msopentech.thali.utilities.java.test;

import com.msopentech.thali.CouchDBListener.java.JavaThaliListenerContext;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Creates context using a temporary directory. It's not clear if this is safe in Android and so it lives in the Java
 * Utilities project.
 */
class CreateContextInTemp extends JavaThaliListenerContext {
    public CreateContextInTemp() throws IOException {
        super(Files.createTempDirectory("javacoretest").toFile());
        getRootDirectory().deleteOnExit();
    }
}
