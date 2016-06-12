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
 * Location data service version 2.0 Definitions
 */
public final class LocationService {
    /**
     * Location Service name.
     */
    public static final String SERVICE_NAME = "com.mirrorlink.location";

    /**
     * Location data service maximum version supported by these definitions - Major component
     * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
     */
    public static final int MAX_VERSION_MAJOR = 2;
    /**
     * Location data service maximum version supported by these definitions - Minor component
     * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
     */
    public static final int MAX_VERSION_MINOR = 0;

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
     * GeoLocation Object uid.
     * @see GeoLocation
     */
    public static final int GEOLOCATION_OBJECT_UID = 0x572a6461;
    /**
     * Coordinates Structure uid.
     * @see Coordinates
     */
    public static final int COORDINATES_STRUCTURE_UID = 0x345d2c16;

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
     * AvailableCoordinateSystems Object Definitions (1.0 service version and upward)
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
        public static final int MIN_VERSION_MAJOR = 1;

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
     * GeoLocation Object Definitions (2.0 service version and upward)
     */
    public static final class GeoLocation {
        /**
         * GeoLocation Object uid.
         */
        public static final int OBJECT_UID = 0x572a6461;

        /**
         * Minimum Version of the service supporting the GeoLocation Object - Major component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MAJOR
         */
        public static final int MIN_VERSION_MAJOR = 2;

        /**
         * Minimum Version of the service supporting the GeoLocation Object - Minor component
         * @see com.mirrorlink.android.commonapi.Defs.ServiceInformation#VERSION_MINOR
         */
        public static final int MIN_VERSION_MINOR = 0;

        /**
         * GeoLocation#COORD Bundle Key (a COORDINATES STRUCTURE)
         */
        public static final String COORD_FIELD_UID = "0xbad026d0";
        /**
         * GeoLocation#TIMESTAMP Bundle Key (a LONG)
         */
        public static final String TIMESTAMP_FIELD_UID = "0x59413fd1";
    }

    /**
     * Coordinates Structure Definitions
     */
    public static final class Coordinates {
        /**
         * Coordinates Structure uid.
         */
        public static final int STRUCTURE_UID = 0x345d2c16;

        /**
         * Coordinates#LATITUDE Bundle Key (a DOUBLE)
         */
        public static final String LATITUDE_FIELD_UID = "0x64f8f3f1";
        /**
         * Coordinates#LONGITUDE Bundle Key (a DOUBLE)
         */
        public static final String LONGITUDE_FIELD_UID = "0x7581892a";
        /**
         * Coordinates#ALTITUDE Bundle Key (a DOUBLE)
         */
        public static final String ALTITUDE_FIELD_UID = "0x970e9047";
        /**
         * Coordinates#ACCURACY Bundle Key (a DOUBLE)
         */
        public static final String ACCURACY_FIELD_UID = "0x5ec654de";
        /**
         * Coordinates#ALTITUDEACCURACY Bundle Key (a DOUBLE)
         */
        public static final String ALTITUDEACCURACY_FIELD_UID = "0xc28b9440";
        /**
         * Coordinates#HEADING Bundle Key (a DOUBLE)
         */
        public static final String HEADING_FIELD_UID = "0x813c675d";
        /**
         * Coordinates#SPEED Bundle Key (a DOUBLE)
         */
        public static final String SPEED_FIELD_UID = "0x23234962";
    }
}
