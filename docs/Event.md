

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **Integer** | Account that triggered the event. |  [optional] |
|**actorSystem** | **String** | Acting system that triggered the event when the actor is not a user. |  [optional] |
|**actorUserId** | **Integer** | ID of the user whose action triggered the event. |  [optional] |
|**actorUserName** | **String** | First and last name of the user whose action triggered the event. |  [optional] |
|**appId** | **Integer** | ID of the app involved in the event, if applicable. |  [optional] |
|**appName** | **String** | Name of the app involved in the event, if applicable. |  [optional] |
|**assumingActingUserId** | **Integer** | ID of the user who assumed the role of the acting user to trigger the event, if applicable. |  [optional] |
|**clientId** | **String** | Client ID used to generate the access token that made the API call that generated the event. |  [optional] |
|**createdAt** | **String** | ISO8601 Time and date at which the event was created. This value is autogenerated by OneLogin. |  [optional] |
|**customMessage** | **String** | More details about the event. |  [optional] |
|**directorySyncRunId** | **Integer** | Directory sync run ID. |  [optional] |
|**errorDescription** | **String** | Provisioning error details, if applicable. |  [optional] |
|**eventTypeId** | [**EventTypeIdEnum**](#EventTypeIdEnum) | Type of event triggered. |  [optional] |
|**groupId** | **Integer** | ID of a group involved in the event. |  [optional] |
|**groupName** | **String** | Name of a group involved in the event. |  [optional] |
|**id** | **Integer** | Event&#39;s unique ID in OneLogin. Autogenerated by OneLogin. |  [optional] |
|**ipaddr** | **String** | IP address of the machine used to trigger the event. |  [optional] |
|**notes** | **String** | More details about the event. |  [optional] |
|**otpDeviceId** | **Integer** | ID of a device involved in the event. |  [optional] |
|**otpDeviceName** | **String** | Name of a device involved in the event. |  [optional] |
|**policyId** | **Integer** | ID of the policy involved in the event. |  [optional] |
|**policyName** | **String** | Name of the policy involved in the event. |  [optional] |
|**resourceTypeId** | **Integer** | ID of the resource (user, role, group, and so forth) associated with the event. |  [optional] |
|**roleId** | **Integer** | ID of a role involved in the event. |  [optional] |
|**roleName** | **String** | Name of a role involved in the event. |  [optional] |
|**userId** | **Integer** | ID of the user that was acted upon to trigger the event. |  [optional] |
|**userName** | **String** | Name of the user that was acted upon to trigger the event. |  [optional] |
|**riskCookieId** | **String** |  |  [optional] |
|**assumedBySuperadminOrReseller** | **Integer** |  |  [optional] |
|**certificateId** | **Integer** |  |  [optional] |
|**mappingId** | **Integer** |  |  [optional] |
|**radiusConfigId** | **Integer** |  |  [optional] |
|**riskScore** | **Integer** |  |  [optional] |
|**param** | **String** |  |  [optional] |
|**adcId** | **Integer** |  |  [optional] |
|**solved** | **Boolean** |  |  [optional] |
|**serviceDirectoryId** | **Integer** |  |  [optional] |
|**objectId** | **Integer** |  |  [optional] |
|**userFieldId** | **Integer** |  |  [optional] |
|**riskReasons** | **String** |  |  [optional] |
|**policyType** | **String** |  |  [optional] |
|**resolvedAt** | **String** |  |  [optional] |
|**trustedIdpId** | **Integer** |  |  [optional] |
|**privilegeId** | **Integer** |  |  [optional] |
|**proxyIp** | **String** |  |  [optional] |



## Enum: EventTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |
| NUMBER_28 | 28 |
| NUMBER_29 | 29 |
| NUMBER_30 | 30 |
| NUMBER_31 | 31 |
| NUMBER_32 | 32 |
| NUMBER_33 | 33 |
| NUMBER_34 | 34 |
| NUMBER_35 | 35 |
| NUMBER_36 | 36 |
| NUMBER_37 | 37 |
| NUMBER_38 | 38 |
| NUMBER_39 | 39 |
| NUMBER_40 | 40 |
| NUMBER_41 | 41 |
| NUMBER_42 | 42 |
| NUMBER_43 | 43 |
| NUMBER_44 | 44 |
| NUMBER_45 | 45 |
| NUMBER_46 | 46 |
| NUMBER_47 | 47 |
| NUMBER_48 | 48 |
| NUMBER_49 | 49 |
| NUMBER_50 | 50 |
| NUMBER_51 | 51 |
| NUMBER_52 | 52 |
| NUMBER_53 | 53 |
| NUMBER_54 | 54 |
| NUMBER_55 | 55 |
| NUMBER_56 | 56 |
| NUMBER_57 | 57 |
| NUMBER_58 | 58 |
| NUMBER_59 | 59 |
| NUMBER_60 | 60 |
| NUMBER_61 | 61 |
| NUMBER_62 | 62 |
| NUMBER_63 | 63 |
| NUMBER_64 | 64 |
| NUMBER_65 | 65 |
| NUMBER_66 | 66 |
| NUMBER_67 | 67 |
| NUMBER_68 | 68 |
| NUMBER_69 | 69 |
| NUMBER_70 | 70 |
| NUMBER_71 | 71 |
| NUMBER_72 | 72 |
| NUMBER_73 | 73 |
| NUMBER_74 | 74 |
| NUMBER_75 | 75 |
| NUMBER_76 | 76 |
| NUMBER_77 | 77 |
| NUMBER_78 | 78 |
| NUMBER_79 | 79 |
| NUMBER_80 | 80 |
| NUMBER_81 | 81 |
| NUMBER_82 | 82 |
| NUMBER_83 | 83 |
| NUMBER_84 | 84 |
| NUMBER_85 | 85 |
| NUMBER_86 | 86 |
| NUMBER_87 | 87 |
| NUMBER_88 | 88 |
| NUMBER_89 | 89 |
| NUMBER_90 | 90 |
| NUMBER_91 | 91 |
| NUMBER_92 | 92 |
| NUMBER_95 | 95 |
| NUMBER_96 | 96 |
| NUMBER_100 | 100 |
| NUMBER_101 | 101 |
| NUMBER_102 | 102 |
| NUMBER_103 | 103 |
| NUMBER_104 | 104 |
| NUMBER_105 | 105 |
| NUMBER_106 | 106 |
| NUMBER_110 | 110 |
| NUMBER_111 | 111 |
| NUMBER_112 | 112 |
| NUMBER_113 | 113 |
| NUMBER_114 | 114 |
| NUMBER_115 | 115 |
| NUMBER_116 | 116 |
| NUMBER_117 | 117 |
| NUMBER_118 | 118 |
| NUMBER_119 | 119 |
| NUMBER_120 | 120 |
| NUMBER_121 | 121 |
| NUMBER_122 | 122 |
| NUMBER_123 | 123 |
| NUMBER_124 | 124 |
| NUMBER_125 | 125 |
| NUMBER_126 | 126 |
| NUMBER_127 | 127 |
| NUMBER_128 | 128 |
| NUMBER_129 | 129 |
| NUMBER_130 | 130 |
| NUMBER_131 | 131 |
| NUMBER_132 | 132 |
| NUMBER_133 | 133 |
| NUMBER_134 | 134 |
| NUMBER_135 | 135 |
| NUMBER_136 | 136 |
| NUMBER_137 | 137 |
| NUMBER_138 | 138 |
| NUMBER_139 | 139 |
| NUMBER_140 | 140 |
| NUMBER_141 | 141 |
| NUMBER_145 | 145 |
| NUMBER_146 | 146 |
| NUMBER_147 | 147 |
| NUMBER_148 | 148 |
| NUMBER_149 | 149 |
| NUMBER_150 | 150 |
| NUMBER_151 | 151 |
| NUMBER_152 | 152 |
| NUMBER_153 | 153 |
| NUMBER_154 | 154 |
| NUMBER_155 | 155 |
| NUMBER_156 | 156 |
| NUMBER_157 | 157 |
| NUMBER_158 | 158 |
| NUMBER_159 | 159 |
| NUMBER_160 | 160 |
| NUMBER_161 | 161 |
| NUMBER_162 | 162 |
| NUMBER_163 | 163 |
| NUMBER_164 | 164 |
| NUMBER_165 | 165 |
| NUMBER_166 | 166 |
| NUMBER_167 | 167 |
| NUMBER_168 | 168 |
| NUMBER_169 | 169 |
| NUMBER_170 | 170 |
| NUMBER_171 | 171 |
| NUMBER_172 | 172 |
| NUMBER_173 | 173 |
| NUMBER_174 | 174 |
| NUMBER_175 | 175 |
| NUMBER_176 | 176 |
| NUMBER_177 | 177 |
| NUMBER_178 | 178 |
| NUMBER_179 | 179 |
| NUMBER_180 | 180 |
| NUMBER_181 | 181 |
| NUMBER_182 | 182 |
| NUMBER_183 | 183 |
| NUMBER_184 | 184 |
| NUMBER_185 | 185 |
| NUMBER_186 | 186 |
| NUMBER_187 | 187 |
| NUMBER_188 | 188 |
| NUMBER_189 | 189 |
| NUMBER_190 | 190 |
| NUMBER_191 | 191 |
| NUMBER_192 | 192 |
| NUMBER_193 | 193 |
| NUMBER_194 | 194 |
| NUMBER_195 | 195 |
| NUMBER_196 | 196 |
| NUMBER_197 | 197 |
| NUMBER_198 | 198 |
| NUMBER_199 | 199 |
| NUMBER_200 | 200 |
| NUMBER_201 | 201 |
| NUMBER_202 | 202 |
| NUMBER_203 | 203 |
| NUMBER_204 | 204 |
| NUMBER_205 | 205 |
| NUMBER_206 | 206 |
| NUMBER_207 | 207 |
| NUMBER_208 | 208 |
| NUMBER_209 | 209 |
| NUMBER_210 | 210 |
| NUMBER_211 | 211 |
| NUMBER_212 | 212 |
| NUMBER_213 | 213 |
| NUMBER_214 | 214 |
| NUMBER_215 | 215 |
| NUMBER_216 | 216 |
| NUMBER_217 | 217 |
| NUMBER_218 | 218 |
| NUMBER_219 | 219 |
| NUMBER_220 | 220 |
| NUMBER_221 | 221 |
| NUMBER_222 | 222 |
| NUMBER_223 | 223 |
| NUMBER_224 | 224 |
| NUMBER_225 | 225 |
| NUMBER_226 | 226 |
| NUMBER_227 | 227 |
| NUMBER_228 | 228 |
| NUMBER_229 | 229 |
| NUMBER_230 | 230 |
| NUMBER_231 | 231 |
| NUMBER_232 | 232 |
| NUMBER_233 | 233 |
| NUMBER_234 | 234 |
| NUMBER_235 | 235 |
| NUMBER_236 | 236 |
| NUMBER_237 | 237 |
| NUMBER_238 | 238 |
| NUMBER_239 | 239 |
| NUMBER_240 | 240 |
| NUMBER_241 | 241 |
| NUMBER_242 | 242 |
| NUMBER_243 | 243 |
| NUMBER_244 | 244 |
| NUMBER_245 | 245 |
| NUMBER_246 | 246 |
| NUMBER_247 | 247 |
| NUMBER_248 | 248 |
| NUMBER_249 | 249 |
| NUMBER_250 | 250 |
| NUMBER_251 | 251 |
| NUMBER_252 | 252 |
| NUMBER_253 | 253 |
| NUMBER_254 | 254 |
| NUMBER_255 | 255 |
| NUMBER_291 | 291 |
| NUMBER_300 | 300 |
| NUMBER_301 | 301 |
| NUMBER_303 | 303 |
| NUMBER_304 | 304 |
| NUMBER_305 | 305 |
| NUMBER_306 | 306 |
| NUMBER_307 | 307 |
| NUMBER_330 | 330 |
| NUMBER_331 | 331 |
| NUMBER_332 | 332 |
| NUMBER_333 | 333 |
| NUMBER_334 | 334 |
| NUMBER_400 | 400 |
| NUMBER_401 | 401 |
| NUMBER_402 | 402 |
| NUMBER_410 | 410 |
| NUMBER_411 | 411 |
| NUMBER_412 | 412 |
| NUMBER_501 | 501 |
| NUMBER_502 | 502 |
| NUMBER_503 | 503 |
| NUMBER_510 | 510 |
| NUMBER_511 | 511 |
| NUMBER_512 | 512 |
| NUMBER_513 | 513 |
| NUMBER_514 | 514 |
| NUMBER_515 | 515 |
| NUMBER_516 | 516 |
| NUMBER_517 | 517 |
| NUMBER_518 | 518 |
| NUMBER_519 | 519 |
| NUMBER_520 | 520 |
| NUMBER_521 | 521 |
| NUMBER_522 | 522 |
| NUMBER_523 | 523 |
| NUMBER_524 | 524 |
| NUMBER_525 | 525 |
| NUMBER_526 | 526 |
| NUMBER_527 | 527 |
| NUMBER_528 | 528 |
| NUMBER_529 | 529 |
| NUMBER_530 | 530 |
| NUMBER_531 | 531 |
| NUMBER_532 | 532 |
| NUMBER_533 | 533 |
| NUMBER_534 | 534 |
| NUMBER_535 | 535 |
| NUMBER_536 | 536 |
| NUMBER_537 | 537 |
| NUMBER_538 | 538 |
| NUMBER_539 | 539 |
| NUMBER_540 | 540 |
| NUMBER_541 | 541 |
| NUMBER_542 | 542 |
| NUMBER_545 | 545 |
| NUMBER_546 | 546 |
| NUMBER_550 | 550 |
| NUMBER_551 | 551 |
| NUMBER_552 | 552 |
| NUMBER_553 | 553 |
| NUMBER_554 | 554 |
| NUMBER_555 | 555 |
| NUMBER_600 | 600 |
| NUMBER_601 | 601 |
| NUMBER_602 | 602 |
| NUMBER_700 | 700 |
| NUMBER_701 | 701 |
| NUMBER_702 | 702 |
| NUMBER_703 | 703 |
| NUMBER_704 | 704 |
| NUMBER_705 | 705 |
| NUMBER_706 | 706 |
| NUMBER_800 | 800 |
| NUMBER_801 | 801 |
| NUMBER_802 | 802 |
| NUMBER_803 | 803 |
| NUMBER_804 | 804 |
| NUMBER_805 | 805 |
| NUMBER_900 | 900 |
| NUMBER_901 | 901 |
| NUMBER_902 | 902 |
| NUMBER_903 | 903 |
| NUMBER_904 | 904 |
| NUMBER_905 | 905 |
| NUMBER_906 | 906 |
| NUMBER_907 | 907 |
| NUMBER_911 | 911 |
| NUMBER_912 | 912 |
| NUMBER_931 | 931 |
| NUMBER_932 | 932 |
| NUMBER_950 | 950 |
| NUMBER_1001 | 1001 |
| NUMBER_1002 | 1002 |
| NUMBER_1010 | 1010 |
| NUMBER_1100 | 1100 |
| NUMBER_1101 | 1101 |
| NUMBER_1200 | 1200 |
| NUMBER_1201 | 1201 |
| NUMBER_1244 | 1244 |
| NUMBER_1245 | 1245 |
| NUMBER_1300 | 1300 |
| NUMBER_1301 | 1301 |
| NUMBER_1302 | 1302 |
| NUMBER_1303 | 1303 |
| NUMBER_1304 | 1304 |
| NUMBER_1305 | 1305 |
| NUMBER_1400 | 1400 |
| NUMBER_1401 | 1401 |
| NUMBER_1402 | 1402 |
| NUMBER_1403 | 1403 |
| NUMBER_1404 | 1404 |
| NUMBER_1405 | 1405 |
| NUMBER_1406 | 1406 |
| NUMBER_1407 | 1407 |
| NUMBER_1408 | 1408 |
| NUMBER_1409 | 1409 |
| NUMBER_1410 | 1410 |
| NUMBER_1411 | 1411 |
| NUMBER_1412 | 1412 |
| NUMBER_1413 | 1413 |
| NUMBER_1414 | 1414 |
| NUMBER_1415 | 1415 |
| NUMBER_1416 | 1416 |
| NUMBER_1417 | 1417 |
| NUMBER_1418 | 1418 |
| NUMBER_1419 | 1419 |
| NUMBER_1420 | 1420 |
| NUMBER_1421 | 1421 |
| NUMBER_1422 | 1422 |
| NUMBER_1423 | 1423 |
| NUMBER_1424 | 1424 |
| NUMBER_1500 | 1500 |
| NUMBER_1501 | 1501 |
| NUMBER_1502 | 1502 |
| NUMBER_1503 | 1503 |
| NUMBER_1504 | 1504 |
| NUMBER_1505 | 1505 |
| NUMBER_1506 | 1506 |
| NUMBER_1507 | 1507 |
| NUMBER_1508 | 1508 |
| NUMBER_1509 | 1509 |
| NUMBER_1510 | 1510 |
| NUMBER_1511 | 1511 |
| NUMBER_1512 | 1512 |
| NUMBER_1513 | 1513 |
| NUMBER_1514 | 1514 |
| NUMBER_1600 | 1600 |
| NUMBER_1601 | 1601 |
| NUMBER_1602 | 1602 |
| NUMBER_1603 | 1603 |
| NUMBER_1604 | 1604 |
| NUMBER_1605 | 1605 |
| NUMBER_1606 | 1606 |
| NUMBER_1607 | 1607 |
| NUMBER_1608 | 1608 |
| NUMBER_1609 | 1609 |
| NUMBER_1700 | 1700 |
| NUMBER_1701 | 1701 |
| NUMBER_1702 | 1702 |
| NUMBER_1801 | 1801 |
| NUMBER_1802 | 1802 |
| NUMBER_1900 | 1900 |
| NUMBER_1901 | 1901 |
| NUMBER_1902 | 1902 |
| NUMBER_1903 | 1903 |
| NUMBER_1904 | 1904 |
| NUMBER_1905 | 1905 |
| NUMBER_2000 | 2000 |
| NUMBER_2001 | 2001 |
| NUMBER_2002 | 2002 |
| NUMBER_2003 | 2003 |
| NUMBER_2004 | 2004 |
| NUMBER_2005 | 2005 |
| NUMBER_2006 | 2006 |
| NUMBER_2007 | 2007 |
| NUMBER_2008 | 2008 |
| NUMBER_2009 | 2009 |
| NUMBER_2010 | 2010 |
| NUMBER_2011 | 2011 |
| NUMBER_2012 | 2012 |
| NUMBER_2013 | 2013 |
| NUMBER_2014 | 2014 |
| NUMBER_2015 | 2015 |
| NUMBER_2016 | 2016 |
| NUMBER_2017 | 2017 |
| NUMBER_2018 | 2018 |
| NUMBER_2100 | 2100 |
| NUMBER_2101 | 2101 |
| NUMBER_2102 | 2102 |
| NUMBER_2103 | 2103 |
| NUMBER_2104 | 2104 |
| NUMBER_2105 | 2105 |
| NUMBER_2106 | 2106 |
| NUMBER_2107 | 2107 |
| NUMBER_2108 | 2108 |
| NUMBER_2109 | 2109 |
| NUMBER_2110 | 2110 |
| NUMBER_2111 | 2111 |
| NUMBER_2112 | 2112 |
| NUMBER_2113 | 2113 |
| NUMBER_2114 | 2114 |
| NUMBER_2201 | 2201 |
| NUMBER_2202 | 2202 |
| NUMBER_2203 | 2203 |
| NUMBER_2204 | 2204 |
| NUMBER_3000 | 3000 |
| NUMBER_3001 | 3001 |
| NUMBER_3002 | 3002 |
| NUMBER_3003 | 3003 |
| NUMBER_3004 | 3004 |
| NUMBER_3005 | 3005 |
| NUMBER_3006 | 3006 |
| NUMBER_3007 | 3007 |
| NUMBER_3008 | 3008 |
| NUMBER_3009 | 3009 |
| NUMBER_3010 | 3010 |
| NUMBER_3011 | 3011 |
| NUMBER_3012 | 3012 |
| NUMBER_3013 | 3013 |
| NUMBER_3014 | 3014 |
| NUMBER_3015 | 3015 |
| NUMBER_3016 | 3016 |
| NUMBER_3017 | 3017 |
| NUMBER_3018 | 3018 |
| NUMBER_3019 | 3019 |
| NUMBER_3020 | 3020 |
| NUMBER_3021 | 3021 |
| NUMBER_3022 | 3022 |
| NUMBER_3023 | 3023 |
| NUMBER_3024 | 3024 |
| NUMBER_3025 | 3025 |
| NUMBER_3026 | 3026 |
| NUMBER_3027 | 3027 |
| NUMBER_3028 | 3028 |
| NUMBER_9000 | 9000 |
| NUMBER_9001 | 9001 |
| NUMBER_9002 | 9002 |
| NUMBER_9003 | 9003 |
| NUMBER_9004 | 9004 |
| NUMBER_9005 | 9005 |
| NUMBER_9006 | 9006 |
| NUMBER_9007 | 9007 |
| NUMBER_9008 | 9008 |
| NUMBER_9009 | 9009 |
| NUMBER_9010 | 9010 |
| NUMBER_9011 | 9011 |
| NUMBER_9012 | 9012 |
| NUMBER_9013 | 9013 |
| NUMBER_9014 | 9014 |
| NUMBER_9015 | 9015 |
| NUMBER_9016 | 9016 |
| NUMBER_9017 | 9017 |
| NUMBER_9018 | 9018 |
| NUMBER_9019 | 9019 |
| NUMBER_9020 | 9020 |
| NUMBER_9021 | 9021 |
| NUMBER_9022 | 9022 |
| NUMBER_9023 | 9023 |
| NUMBER_9024 | 9024 |
| NUMBER_9025 | 9025 |
| NUMBER_9026 | 9026 |
| NUMBER_9027 | 9027 |
| NUMBER_9028 | 9028 |
| NUMBER_9029 | 9029 |
| NUMBER_9030 | 9030 |
| NUMBER_9031 | 9031 |
| NUMBER_9032 | 9032 |
| NUMBER_9033 | 9033 |
| NUMBER_9034 | 9034 |
| NUMBER_9035 | 9035 |
| NUMBER_9036 | 9036 |
| NUMBER_9037 | 9037 |
| NUMBER_9038 | 9038 |
| NUMBER_9039 | 9039 |
| NUMBER_9040 | 9040 |
| NUMBER_9041 | 9041 |
| NUMBER_9042 | 9042 |
| NUMBER_9043 | 9043 |
| NUMBER_9044 | 9044 |
| NUMBER_9045 | 9045 |
| NUMBER_9046 | 9046 |
| NUMBER_9047 | 9047 |
| NUMBER_9048 | 9048 |
| NUMBER_9049 | 9049 |
| NUMBER_9050 | 9050 |
| NUMBER_9051 | 9051 |
| NUMBER_9052 | 9052 |
| NUMBER_9053 | 9053 |
| NUMBER_9054 | 9054 |
| NUMBER_9055 | 9055 |
| NUMBER_9056 | 9056 |
| NUMBER_9057 | 9057 |
| NUMBER_9058 | 9058 |
| NUMBER_9059 | 9059 |



