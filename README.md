# MirrorLink Android Common API

The API is defined using AIDL files. For reference on using them please see the Android documentation.

The mechanism for connecting to the MirrorLink service is defined in the com.mirrorlink.android.commonapi.Defs class. The application can obtain a connection to the server by sending the com.mirrorlink.android.commonapi.Defs.Intents.BIND_MIRRORLINK_API Intent. As a result it will obtain a handle to an com.mirrorlink.android.commonapi.ICommonAPIService object. From this object handles to all the available MirrorLink services can be retrieved.

# Legal Information

Copyright © 2013-2016 RealVNC Ltd.
Portions © Copyright 2011-2016 Car Connectivity Consortium LLC.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# LEGAL NOTICE

The copyright in the Android Common API Specification is owned by the Car Connectivity Consortium LLC ("CCC LLC"). Use of this Specification and any related intellectual property (collectively, the "Specification"), is governed by these license terms, the Developer Agreement found on the Developer Portal ("Developer Agreement") and the CCC LLC Limited Liability Company Agreement (the "LLC Agreement").

Use of the Specification by anyone who is not a registered developer ("Developer") or a member of the CCC LLC (each such person or party, a "Member") is prohibited. The legal rights and obligations of Developers are governed by the Developer Agreement found on the Developer Portal. The legal rights and obligations of each Member are governed by the Car Connectivity Consortium LLC Agreement and their applicable Membership Agreement, including without limitation those contained in Article 10 of the LLC Agreement.
FOR MEMBERS AND DEVELOPERS

CCC LLC hereby grants each Member and Developer a right to use and to make verbatim copies of the Specification for the purposes of implementing the technologies specified in the Specification in their products ("Implementing Products") under the terms of the LLC Agreement or Developer Agreement, as appropriate (the "Purpose"). No other license, express or implied, by estoppel or otherwise, to any intellectual property rights are granted herein.

THE SPECIFICATION IS PROVIDED "AS IS" WITH NO WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION ANY WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT OF ANY THIRD PARTY INTELLECTUAL PROPERTY RIGHTS, AND COMPLIANCE WITH APPLICABLE LAWS.

NOTHING IN THE SPECIFICATION CREATES ANY WARRANTIES, EITHER EXPRESS OR IMPLIED, REGARDING SUCH LAWS OR REGULATIONS. ALL LIABILITY, INCLUDING LIABILITY FOR INFRINGEMENT OF ANY INTELLECTUAL PROPERTY RIGHTS OR FOR NONCOMPLIANCE WITH LAWS, RELATING TO USE OF THE SPECIFICATION IS EXPRESSLY DISCLAIMED. BY USE OF THE SPECIFICATION, EACH MEMBER EXPRESSLY WAIVES ANY CLAIM AGAINST CCC LLC AND ITS MEMBERS RELATED TO USE OF THE SPECIFICATION.

CCC LLC reserves the right to adopt any changes or alterations to the Specification as it deems necessary or appropriate.

Each Member or Developer, as appropriate, (i) hereby acknowledges that its Implementing Products may be subject to various regulatory controls under the laws and regulations of various jurisdictions worldwide. Such laws and regulatory controls may govern, among other things, the combination, operation, use, implementation and distribution of Implementing Products. Examples of such laws and regulatory controls include, but are not limited to, road safety regulations, telecommunications regulations, technology transfer controls and health and safety regulations, (ii) is solely responsible for the compliance by their Implementing Products with any such laws and regulations and for obtaining any and all required authorizations, permits, or licenses for their Implementing Products related to such regulations within the applicable jurisdictions, and (iii) acknowledges that nothing in the Specification provides any information or assistance in connection with securing such compliance, authorizations or licenses.
FOR DEVELOPERS ONLY

Any use of the Specification not in compliance with the terms of this Legal Notice and the Developer Agreement is prohibited and any such prohibited use may result in termination of the Developer Agreement and in other liability as permitted by the Developer Agreement or by applicable law to the CCC LLC or any of its Members for patent, copyright and/or trademark infringement. Developers are not permitted to make available or distribute this Specification or any copies thereof to any third party.
FOR MEMBERS ONLY

Any use of the Specification not in compliance with the terms of this Legal Notice, the LLC Agreement, and the Membership Agreement is prohibited and any such prohibited use may result in termination of the applicable Membership Agreement and in other liability as permitted by the such Membership Agreement or by applicable law to the CCC LLC or any of its Members for patent, copyright and/or trademark infringement.

This Specification may not be provided to any third party other than to Affiliates of Members (as defined in the LLC Agreement) and subcontractors but only to the extent that such Affiliates and subcontractors have a need to know for carrying out the Purpose and provided that such Affiliates and subcontractors accept confidentiality obligations similar to those contained in the LLC Agreement. Each Member shall be responsible for the observance and proper performance by such of its Affiliates and subcontractors of the terms and conditions of this Legal Notice and the LLC Agreement.

Copyright © CCC LLC.
