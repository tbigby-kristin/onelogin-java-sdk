package com.onelogin.sdk.util;

import java.util.Map;
import java.util.HashMap;


public class Endpoints {
	public static Map<String, String> resource_matrix = new HashMap<String, String>();
	public static Map<String, Integer[]> version_matrix = new HashMap<String, Integer[]>();
	static {
		resource_matrix.put("GET_USERS_URL", "user");
		resource_matrix.put("GET_USER_URL", "user");
		resource_matrix.put("GET_APPS_FOR_USER_URL", "user");
        resource_matrix.put("GET_ROLES_FOR_USER_URL", "user");
        resource_matrix.put("GET_CUSTOM_ATTRIBUTES_URL", "user");
        resource_matrix.put("CREATE_USER_URL", "user");
        resource_matrix.put("UPDATE_USER_URL", "user");
        resource_matrix.put("DELETE_USER_URL", "user");
        resource_matrix.put("ADD_ROLE_TO_USER_URL", "user");
        resource_matrix.put("DELETE_ROLE_TO_USER_URL", "user");
        resource_matrix.put("SET_PW_CLEARTEXT", "user");
        resource_matrix.put("SET_PW_SALT", "user");
        resource_matrix.put("SET_STATE_TO_USER_URL", "user");
        resource_matrix.put("SET_CUSTOM_ATTRIBUTE_TO_USER_URL", "user");
        resource_matrix.put("LOG_USER_OUT_URL", "user");
        resource_matrix.put("LOCK_USER_URL", "user");
        resource_matrix.put("GENERATE_MFA_TOKEN_URL", "user");
        resource_matrix.put("GET_CONNECTORS_URL", "connector");
        resource_matrix.put("GET_APPS_URL", "app");
        resource_matrix.put("CREATE_APP_URL", "app");
        resource_matrix.put("GET_APP_URL", "app");
        resource_matrix.put("UPDATE_APP_URL", "app");
        resource_matrix.put("DELETE_APP_URL", "app");
        resource_matrix.put("DELETE_APP_PARAMETER_URL", "app");
        resource_matrix.put("GET_APP_USERS_URL", "app");
        resource_matrix.put("GET_APP_RULES_URL", "app_rule");
        resource_matrix.put("CREATE_APP_RULE_URL", "app_rule");
        resource_matrix.put("GET_APP_RULE_URL", "app_rule");
        resource_matrix.put("UPDATE_APP_RULE_URL", "app_rule");
        resource_matrix.put("DELETE_APP_RULE_URL", "app_rule");
        resource_matrix.put("GET_APP_CONDITIONS_URL", "app_rule");
        resource_matrix.put("GET_APP_CONDITION_OPERATORS_URL", "app_rule");
        resource_matrix.put("GET_APP_CONDITION_VALUES_URL", "app_rule");
        resource_matrix.put("GET_APP_ACTIONS_URL", "app_rule");
        resource_matrix.put("GET_APP_ACTION_VALUES_URL", "app_rule");
        resource_matrix.put("APP_RULE_SORT_URL", "app_rule");
        resource_matrix.put("GET_ROLES_URL", "role");
        resource_matrix.put("CREATE_ROLE_URL", "role");
        resource_matrix.put("GET_ROLE_URL", "role");
        resource_matrix.put("UPDATE_ROLE_URL", "role");
        resource_matrix.put("GET_ROLE_APPS_URL", "role");
        resource_matrix.put("SET_ROLE_APPS_URL", "role");
        resource_matrix.put("GET_ROLE_USERS_URL", "role");
        resource_matrix.put("ADD_ROLE_USERS_URL", "role");
        resource_matrix.put("REMOVE_ROLE_USERS_URL", "role");
        resource_matrix.put("GET_ROLE_ADMINS_URL", "role");
        resource_matrix.put("ADD_ROLE_ADMINS_URL", "role");
        resource_matrix.put("REMOVE_ROLE_ADMINS_URL", "role");
        resource_matrix.put("DELETE_ROLE_URL", "role");
        resource_matrix.put("GET_EVENT_TYPES_URL", "event");
        resource_matrix.put("GET_EVENTS_URL", "event");
        resource_matrix.put("CREATE_EVENT_URL", "event");
        resource_matrix.put("GET_EVENT_URL", "event");
        resource_matrix.put("GET_GROUPS_URL", "group");
        resource_matrix.put("CREATE_GROUP_URL", "group");
        resource_matrix.put("GET_GROUP_URL", "group");
        resource_matrix.put("SESSION_LOGIN_TOKEN_URL", "custom_login");
        resource_matrix.put("GET_TOKEN_VERIFY_FACTOR", "custom_login");
        resource_matrix.put("GET_SAML_ASSERTION_URL", "assertion");
        resource_matrix.put("GET_SAML_VERIFY_FACTOR", "assertion");
        resource_matrix.put("GET_FACTORS_URL", "mfa");
        resource_matrix.put("ENROLL_FACTOR_URL", "mfa");
        resource_matrix.put("VERIFY_ENROLLMENT_SMS_EMAIL_PROTECT_AUTH_URL", "mfa");
        resource_matrix.put("VERIFY_ENROLLMENT__PROTECTPUSH_VOICE_URL", "mfa");
        resource_matrix.put("GET_ENROLLED_FACTORS_URL", "mfa");
        resource_matrix.put("ACTIVATE_FACTOR_URL", "mfa");
        resource_matrix.put("VERIFY_FACTOR_URL", "mfa");
        resource_matrix.put("VERIFY_FACTOR_SMS_EMAIL_PROTECT_AUTH_URL", "mfa");
        resource_matrix.put("VERIFY_FACTOR_PROTECTPUSH_VOICE_URL", "mfa");
        resource_matrix.put("DELETE_FACTOR_URL", "mfa");
        resource_matrix.put("GENERATE_INVITE_LINK_URL", "invite");
        resource_matrix.put("SEND_INVITE_LINK_URL", "invite");
        resource_matrix.put("LIST_PRIVILEGES_URL", "privilege");
        resource_matrix.put("CREATE_PRIVILEGE_URL", "privilege");
        resource_matrix.put("UPDATE_PRIVILEGE_URL", "privilege");
        resource_matrix.put("GET_PRIVILEGE_URL", "privilege");
        resource_matrix.put("DELETE_PRIVILEGE_URL", "privilege");
        resource_matrix.put("GET_ROLES_ASSIGNED_TO_PRIVILEGE_URL", "privilege");
        resource_matrix.put("ASSIGN_ROLES_TO_PRIVILEGE_URL", "privilege");
        resource_matrix.put("REMOVE_ROLE_FROM_PRIVILEGE_URL", "privilege");
        resource_matrix.put("GET_USERS_ASSIGNED_TO_PRIVILEGE_URL", "privilege");
        resource_matrix.put("ASSIGN_USERS_TO_PRIVILEGE_URL", "privilege");
        resource_matrix.put("REMOVE_USER_FROM_PRIVILEGE_URL", "privilege");
        resource_matrix.put("GET_ACCOUNT_BRANDS_URL", "branding");
        resource_matrix.put("CREATE_ACCOUNT_BRAND_URL", "branding");
        resource_matrix.put("GET_ACCOUNT_BRAND_URL", "branding");
        resource_matrix.put("UPDATE_ACCOUNT_BRAND_URL", "branding");
        resource_matrix.put("DELETE_ACCOUNT_BRAND_URL", "branding");
        resource_matrix.put("GET_APPS_BRAND_URL", "branding");
        resource_matrix.put("GET_ACCOUNT_EMAIL_SETTINGS", "branding");
        resource_matrix.put("UPDATE_ACCOUNT_EMAIL_SETTINGS", "branding");
        resource_matrix.put("RESET_ACCOUNT_EMAIL_SETTINGS", "branding");
        resource_matrix.put("GET_HOOKS_URL", "smarthook");
        resource_matrix.put("CREATE_HOOK_URL", "smarthook");
        resource_matrix.put("GET_HOOK_URL", "smarthook");
        resource_matrix.put("UPDATE_HOOK_URL", "smarthook");
        resource_matrix.put("DELETE_HOOK_URL", "smarthook");
        resource_matrix.put("GET_HOOK_LOGS_URL", "smarthook");
        resource_matrix.put("GET_HOOK_ENVS_URL", "smarthook");
        resource_matrix.put("CREATE_HOOK_ENV_URL", "smarthook");
        resource_matrix.put("GET_HOOK_ENV_URL", "smarthook");
        resource_matrix.put("UPDATE_HOOK_ENV_URL", "smarthook");
        resource_matrix.put("DELETE_HOOK_ENV_URL", "smarthook");
        resource_matrix.put("SMART_MFA_VALIDATE_USER", "smartmfa");
        resource_matrix.put("SMART_MFA_VERFY_TOKEN", "smartmfa");
        resource_matrix.put("TRACK_EVENT_URL", "risk");
        resource_matrix.put("GET_RISK_SCORE_URL", "risk");
        resource_matrix.put("GET_RISK_RULES_URL", "risk");
        resource_matrix.put("CREATE_RISK_RULE_URL", "risk");
        resource_matrix.put("GET_RISK_RULE_URL", "risk");
        resource_matrix.put("UPDATE_RISK_RULE_URL", "risk");
        resource_matrix.put("DELETE_RISK_RULE_URL", "risk");
        resource_matrix.put("GET_SCORE_INSIGHTS", "risk");
        resource_matrix.put("GET_MAPPINGS_URL", "user_mapping");
        resource_matrix.put("CREATE_MAPPING_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_URL", "user_mapping");
        resource_matrix.put("UPDATE_MAPPING_URL", "user_mapping");
        resource_matrix.put("DELETE_MAPPING_URL", "user_mapping");
        resource_matrix.put("DRYRUN_MAPPING_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_CONDITIONS_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_CONDITION_OPERATORS_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_CONDITION_VALUES_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_ACTIONS_URL", "user_mapping");
        resource_matrix.put("GET_MAPPING_ACTION_VALUES_URL", "user_mapping");
        resource_matrix.put("MAPPING_SORT_URL", "user_mapping");

		version_matrix.put("GET_USERS_URL", new Integer[]{1, 2});
        version_matrix.put("GET_USER_URL", new Integer[]{1, 2});
        version_matrix.put("GET_APPS_FOR_USER_URL", new Integer[]{1, 2});
        version_matrix.put("GET_ROLES_FOR_USER_URL", new Integer[]{1});
        version_matrix.put("GET_CUSTOM_ATTRIBUTES_URL", new Integer[]{1});
        version_matrix.put("CREATE_USER_URL", new Integer[]{1, 2});
        version_matrix.put("UPDATE_USER_URL", new Integer[]{1, 2});
        version_matrix.put("DELETE_USER_URL", new Integer[]{1, 2});
        version_matrix.put("ADD_ROLE_TO_USER_URL", new Integer[]{1});
        version_matrix.put("DELETE_ROLE_TO_USER_URL", new Integer[]{1});
        version_matrix.put("SET_PW_CLEARTEXT", new Integer[]{1});
        version_matrix.put("SET_PW_SALT", new Integer[]{1});
        version_matrix.put("SET_STATE_TO_USER_URL", new Integer[]{1});
        version_matrix.put("SET_CUSTOM_ATTRIBUTE_TO_USER_URL", new Integer[]{1});
        version_matrix.put("LOG_USER_OUT_URL", new Integer[]{1});
        version_matrix.put("LOCK_USER_URL", new Integer[]{1});
        version_matrix.put("GENERATE_MFA_TOKEN_URL", new Integer[]{1, 2});
		version_matrix.put("GET_CONNECTORS_URL", new Integer[]{2});
        version_matrix.put("GET_APPS_URL", new Integer[]{1, 2});
        version_matrix.put("CREATE_APP_URL", new Integer[]{2});
        version_matrix.put("GET_APP_URL", new Integer[]{2});
        version_matrix.put("UPDATE_APP_URL", new Integer[]{2});
        version_matrix.put("DELETE_APP_URL", new Integer[]{2});
        version_matrix.put("DELETE_APP_PARAMETER_URL", new Integer[]{2});
        version_matrix.put("GET_APP_USERS_URL", new Integer[]{2});
        version_matrix.put("GET_APP_RULES_URL", new Integer[]{2});
        version_matrix.put("CREATE_APP_RULE_URL", new Integer[]{2});
        version_matrix.put("GET_APP_RULE_URL", new Integer[]{2});
        version_matrix.put("UPDATE_APP_RULE_URL", new Integer[]{2});
        version_matrix.put("DELETE_APP_RULE_URL", new Integer[]{2});
        version_matrix.put("GET_APP_CONDITIONS_URL", new Integer[]{2});
        version_matrix.put("GET_APP_CONDITION_OPERATORS_URL", new Integer[]{2});
        version_matrix.put("GET_APP_CONDITION_VALUES_URL", new Integer[]{2});
        version_matrix.put("GET_APP_ACTIONS_URL", new Integer[]{2});
        version_matrix.put("GET_APP_ACTION_VALUES_URL", new Integer[]{2});
        version_matrix.put("APP_RULE_SORT_URL", new Integer[]{2});
        version_matrix.put("GET_ROLES_URL", new Integer[]{1, 2});
        version_matrix.put("CREATE_ROLE_URL", new Integer[]{2});
        version_matrix.put("GET_ROLE_URL", new Integer[]{1, 2});
        version_matrix.put("UPDATE_ROLE_URL", new Integer[]{2});
        version_matrix.put("GET_ROLE_APPS_URL", new Integer[]{2});
        version_matrix.put("SET_ROLE_APPS_URL", new Integer[]{2});
        version_matrix.put("GET_ROLE_USERS_URL", new Integer[]{2});
        version_matrix.put("ADD_ROLE_USERS_URL", new Integer[]{2});
        version_matrix.put("REMOVE_ROLE_USERS_URL", new Integer[]{2});
        version_matrix.put("GET_ROLE_ADMINS_URL", new Integer[]{2});
        version_matrix.put("ADD_ROLE_ADMINS_URL", new Integer[]{2});
        version_matrix.put("REMOVE_ROLE_ADMINS_URL", new Integer[]{2});
        version_matrix.put("DELETE_ROLE_URL", new Integer[]{2});
        version_matrix.put("GET_EVENT_TYPES_URL", new Integer[]{1});
        version_matrix.put("GET_EVENTS_URL", new Integer[]{1});
        version_matrix.put("CREATE_EVENT_URL", new Integer[]{1});
        version_matrix.put("GET_EVENT_URL", new Integer[]{1});
        version_matrix.put("GET_GROUPS_URL", new Integer[]{1});
        version_matrix.put("CREATE_GROUP_URL", new Integer[]{1});
        version_matrix.put("GET_GROUP_URL", new Integer[]{1});
        version_matrix.put("SESSION_LOGIN_TOKEN_URL", new Integer[]{1});
        version_matrix.put("GET_TOKEN_VERIFY_FACTOR", new Integer[]{1});
        version_matrix.put("GET_SAML_ASSERTION_URL", new Integer[]{1, 2});
        version_matrix.put("GET_SAML_VERIFY_FACTOR", new Integer[]{1, 2});
        version_matrix.put("GET_FACTORS_URL", new Integer[]{1, 2});
        version_matrix.put("ENROLL_FACTOR_URL", new Integer[]{1, 2});
        version_matrix.put("VERIFY_ENROLLMENT_SMS_EMAIL_PROTECT_AUTH_URL", new Integer[]{2});
        version_matrix.put("VERIFY_ENROLLMENT__PROTECTPUSH_VOICE_URL", new Integer[]{2});
        version_matrix.put("GET_ENROLLED_FACTORS_URL", new Integer[]{1, 2});
        version_matrix.put("ACTIVATE_FACTOR_URL", new Integer[]{1, 2});
        version_matrix.put("VERIFY_FACTOR_URL", new Integer[]{1});
        version_matrix.put("VERIFY_FACTOR_SMS_EMAIL_PROTECT_AUTH_URL", new Integer[]{2});
        version_matrix.put("VERIFY_FACTOR_PROTECTPUSH_VOICE_URL", new Integer[]{2});
        version_matrix.put("DELETE_FACTOR_URL", new Integer[]{1, 2});
        version_matrix.put("GENERATE_INVITE_LINK_URL", new Integer[]{1});
        version_matrix.put("SEND_INVITE_LINK_URL", new Integer[]{1});
        version_matrix.put("LIST_PRIVILEGES_URL", new Integer[]{1});
        version_matrix.put("CREATE_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("UPDATE_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("GET_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("DELETE_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("GET_ROLES_ASSIGNED_TO_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("ASSIGN_ROLES_TO_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("REMOVE_ROLE_FROM_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("GET_USERS_ASSIGNED_TO_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("ASSIGN_USERS_TO_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("REMOVE_USER_FROM_PRIVILEGE_URL", new Integer[]{1});
        version_matrix.put("GET_ACCOUNT_BRANDS_URL", new Integer[]{2});
        version_matrix.put("CREATE_ACCOUNT_BRAND_URL", new Integer[]{2});
        version_matrix.put("GET_ACCOUNT_BRAND_URL", new Integer[]{2});
        version_matrix.put("UPDATE_ACCOUNT_BRAND_URL", new Integer[]{2});
        version_matrix.put("DELETE_ACCOUNT_BRAND_URL", new Integer[]{2});
        version_matrix.put("GET_APPS_BRAND_URL", new Integer[]{2});
        version_matrix.put("GET_ACCOUNT_EMAIL_SETTINGS", new Integer[]{2});
        version_matrix.put("UPDATE_ACCOUNT_EMAIL_SETTINGS", new Integer[]{2});
        version_matrix.put("RESET_ACCOUNT_EMAIL_SETTINGS", new Integer[]{2});
        version_matrix.put("GET_HOOKS_URL", new Integer[]{2});
        version_matrix.put("CREATE_HOOK_URL", new Integer[]{2});
        version_matrix.put("GET_HOOK_URL", new Integer[]{2});
        version_matrix.put("UPDATE_HOOK_URL", new Integer[]{2});
        version_matrix.put("DELETE_HOOK_URL", new Integer[]{2});
        version_matrix.put("GET_HOOK_LOGS_URL", new Integer[]{2});
        version_matrix.put("GET_HOOK_ENVS_URL", new Integer[]{2});
        version_matrix.put("CREATE_HOOK_ENV_URL", new Integer[]{2});
        version_matrix.put("GET_HOOK_ENV_URL", new Integer[]{2});
        version_matrix.put("UPDATE_HOOK_ENV_URL", new Integer[]{2});
        version_matrix.put("DELETE_HOOK_ENV_URL", new Integer[]{2});
        version_matrix.put("SMART_MFA_VALIDATE_USER", new Integer[]{2});
        version_matrix.put("SMART_MFA_VERFY_TOKEN", new Integer[]{2});
        version_matrix.put("TRACK_EVENT_URL", new Integer[]{2});
        version_matrix.put("GET_RISK_SCORE_URL", new Integer[]{2});
        version_matrix.put("GET_RISK_RULES_URL", new Integer[]{2});
        version_matrix.put("CREATE_RISK_RULE_URL", new Integer[]{2});
        version_matrix.put("GET_RISK_RULE_URL", new Integer[]{2});
        version_matrix.put("UPDATE_RISK_RULE_URL", new Integer[]{2});
        version_matrix.put("DELETE_RISK_RULE_URL", new Integer[]{2});
        version_matrix.put("GET_SCORE_INSIGHTS", new Integer[]{2});
        version_matrix.put("GET_MAPPINGS_URL", new Integer[]{2});
        version_matrix.put("CREATE_MAPPING_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_URL", new Integer[]{2});
        version_matrix.put("UPDATE_MAPPING_URL", new Integer[]{2});
        version_matrix.put("DELETE_MAPPING_URL", new Integer[]{2});
        version_matrix.put("DRYRUN_MAPPING_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_CONDITIONS_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_CONDITION_OPERATORS_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_CONDITION_VALUES_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_ACTIONS_URL", new Integer[]{2});
        version_matrix.put("GET_MAPPING_ACTION_VALUES_URL", new Integer[]{2});
        version_matrix.put("MAPPING_SORT_URL", new Integer[]{2});
	};  
}