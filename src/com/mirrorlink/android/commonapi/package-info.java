/* Copyright 2013-2016 RealVNC ltd.
 * Portions Copyright 2011-2016 Car Connectivity Consortium LLC
 *
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
 */
/**
 * This package containes the MirrorLink Android Common API interface.
 * <br>
 * MirrorLink is exposed to applications as a regular Android Service.
 * <br>
 * The API is based on the "Android Interface Definition Language" (AIDL).
 * This provides the necessary flexibility and extensibility of the API.
 * <br>
 * Applications access the MirrorLink server by communicating with an Android service.
 * The package name for the service is unique across all Android MirrorLink servers.
 * The name used for the package is: com.mirrorlink.android.service.
 * <br>
 * Developlers have to import this API Definitions (AIDL files) in order
 * to be able to use the service.
 * <br>
 * For an application to be MirrorLink aware there need to be some requirements that must be met:
 * <ul>
 * <li>
 * The application MUST listen to the com.mirrorlink.android.app.LAUNCH and com.mirrorlink.android.app.TERMINATE Intents.
 * It MUST use the android.intent.category.DEFAULT category to filter on these intents.
 * There MUST be only one Activity that receives each of these Intents. The same Activity MAY receive both intents,
 * but equally the Application MAY have separate Activities for each event.
 * </li>
 * <li>
 * Upon receiving the TERMINATE intent, the application MUST go or stay in the background
 * To avoid TERMINTE triggering a move of the Application into the foreground it is recommended that the Application receives
 * it into an Activity which has the following properties:
 * <pre>
 * android:excludeFromRecents="true"
 * android:noHistory="true"
 * android:theme="@android:style/Theme.NoDisplay"
 * </pre>
 * </li>
 * <li>
 * The application MUST have the "com.mirrorlink.android.service.ACCESS_PERMISSION" permission.
 * </li>
 * <li>
 * The application, when started, either by the MirrorLink server, or by the user from a Launcher on the device,
 * MUST bind within 3 seconds to the MirrorLink Service by sending the "com.mirrorlink.android.service.BIND" Intent.
 * </li>
 * <li>
 * The application MUST use the IConnectionManager from the Common API and MUST register a listener for its callbacks.
 * It MUST stay registered for the entire duration while it is running.
 * If the application unregisters from the Connection Manager Service, then the Server MAY consider
 * it as not running anymore. The Server MAY also consider the application as running if it is still registered
 * to at least one Service, even though that Service might not be the IConnectionManager.
 * </li>
 * <li>
 * The application MUST provide its package name when accessing any of the MirrorLink Services.
 * This is in order to correctly identify the APK where the call originates from when shared UIDs are used.
 * </li>
 * <li>
 * An application MUST NOT access more than once concurrently the same MirrorLink Service.
 * There MUST be only one connection between an application and a Service.
 * </li>
 * <li>
 * The application MUST not unbind from the MirrorLink server for the entire duration of it running.
 * The unbinding MUST be made only when the application is closed.
 * </li>
 * <li>
 * The application MUST call the unregister() method on any of the Managers that it bound to when
 * it no longer needs to use them. This is to notify the MirrorLink Server that the application
 * is no longer using one of the services.
 * </li>
 * <li>
 * It SHOULD react and respond to callbacks as soon as it is reasonably possible.
 * </li>
 * <li>
 * The application MUST NOT request platform permissions from the end user when in a MirrorLink session.
 * The application SHALL try to get all necessary permissions when the application is launched out of MirrorLink.
 * The application MUST otherwise remain fully functional to the exclusion of features requiring unacquired permissions.
 * </li>
 *</ul>
 */
package com.mirrorlink.android.commonapi;