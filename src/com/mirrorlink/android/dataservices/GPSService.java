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

package com.mirrorlink.android.dataservices;

import com.mirrorlink.android.commonapi.Defs;

/**
 * GPS data service version 2.0 Definitions
 */
public final class GPSService {
    /**
     * GPS Service name.
     */
    public static final String SERVICE_NAME = "com.mirrorlink.GPS";

    /**
     * GPS data service maximum version supported by these definitions - Major component
     * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
     */
    public static final int MAX_VERSION_MAJOR = 2;
    /**
     * GPS data service maximum version supported by these definitions - Minor component
     * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
     */
    public static final int MAX_VERSION_MINOR = 0;

    /**
     * NMEA Object uid.
     * @see NMEA
     */
    public static final int NMEA_OBJECT_UID = 0x0aac4540;
    /**
     * AvailableCoordinateSystems Object uid.
     * @see AvailableCoordinateSystems
     */
    public static final int AVAILABLECOORDINATESYSTEMS_OBJECT_UID = 0x6f1c2428;
    /**
     * CurrentCoordinateSystem Object uid.
     * @see CurrentCoordinateSystem
     */
    public static final int CURRENTCOORDINATESYSTEM_OBJECT_UID = 0x17ab51db;
    /**
     * NMEA_description Object uid.
     * @see NMEA_description
     */
    public static final int NMEA_DESCRIPTION_OBJECT_UID = 0x9d08b19d;

    /**
     * NMEA Object Definitions (1.0 service version and upward)
     */
    public static final class NMEA {
        /**
         * NMEA Object uid.
         */
        public static final int OBJECT_UID = 0x0aac4540;

        /**
         * Minimum Version of the service supporting the NMEA Object - Major component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
         */
        public static final int MIN_VERSION_MAJOR = 1;

        /**
         * Minimum Version of the service supporting the NMEA Object - Minor component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
         */
        public static final int MIN_VERSION_MINOR = 0;

        /**
         * NMEA#DATA Bundle Key (a BYTES)
         */
        public static final String DATA_FIELD_UID = "0x144a776f";
        /**
         * NMEA#TIMESTAMP Bundle Key (a LONG)
         */
        public static final String TIMESTAMP_FIELD_UID = "0x59413fd1";
    }

    /**
     * Flags used to identify and mark the availability of coordinate systems
     */
    /**
     * AvailableCoordinateSystems#COORDINATESYSTEMS_FIELD FLAG
     * CurrentCoordinateSystem#COORDINATESYSTEMS_FIELD FLAG
     */
    public static final int COORDINATESYSTEMS_FLAG_WGS84 = 0x00000001;
    /**
     * AvailableCoordinateSystems#COORDINATESYSTEMS_FIELD FLAG
     * CurrentCoordinateSystem#COORDINATESYSTEMS_FIELD FLAG
     */
    public static final int COORDINATESYSTEMS_FLAG_GCJ02 = 0x00000002;
    /**
     * AvailableCoordinateSystems#COORDINATESYSTEMS_FIELD FLAG
     * CurrentCoordinateSystem#COORDINATESYSTEMS_FIELD FLAG
     */
    public static final int COORDINATESYSTEMS_FLAG_PROPRIETARY = 0x80000000;

    /**
     * AvailableCoordinateSystems Object Definitions (2.0 service version and upward)
     */
    public static final class AvailableCoordinateSystems {
        /**
         * AvailableCoordinateSystems Object uid.
         */
        public static final int OBJECT_UID = 0x6f1c2428;

        /**
         * Minimum Version of the service supporting the AvailableCoordinateSystems Object - Major component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
         */
        public static final int MIN_VERSION_MAJOR = 2;

        /**
         * Minimum Version of the service supporting the AvailableCoordinateSystems Object - Minor component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
         */
        public static final int MIN_VERSION_MINOR = 0;

        /**
         * AvailableCoordinateSystems#COORDINATESYSTEMS Bundle Key (a INT)
         */
        public static final String COORDINATESYSTEMS_FIELD_UID = "0x0885cf07";
    }

    /**
     * CurrentCoordinateSystem Object Definitions (2.0 service version and upward)
     */
    public static final class CurrentCoordinateSystem {
        /**
         * CurrentCoordinateSystem Object uid.
         */
        public static final int OBJECT_UID = 0x17ab51db;

        /**
         * Minimum Version of the service supporting the CurrentCoordinateSystem Object - Major component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
         */
        public static final int MIN_VERSION_MAJOR = 2;

        /**
         * Minimum Version of the service supporting the CurrentCoordinateSystem Object - Minor component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
         */
        public static final int MIN_VERSION_MINOR = 0;

        /**
         * CurrentCoordinateSystem#COORDINATESYSTEM Bundle Key (a INT)
         */
        public static final String COORDINATESYSTEM_FIELD_UID = "0xd2394c6c";
    }

    /**
     * NMEA_description Object Definitions (1.0 service version and upward)
     */
    public static final class NMEA_description {
        /**
         * NMEA_description Object uid.
         */
        public static final int OBJECT_UID = 0x9d08b19d;

        /**
         * Minimum Version of the service supporting the NMEA_description Object - Major component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
         */
        public static final int MIN_VERSION_MAJOR = 1;

        /**
         * Minimum Version of the service supporting the NMEA_description Object - Minor component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
         */
        public static final int MIN_VERSION_MINOR = 0;

        /**
         * NMEA_description#SUPPORTEDSENTENCES Bundle Key (a INT)
         */
        public static final String SUPPORTEDSENTENCES_FIELD_UID = "0x6e72b167";

        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_GGA              = 0x01;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_GLL              = 0x02;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_GSA              = 0x04;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_GSV              = 0x08;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_RMC              = 0x10;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_VTG              = 0x20;
        /**
         * NMEA_description#SUPPORTEDSENTENCES FLAG
         */
        public static final int SUPPORT_GST              = 0x40;
    }
}
