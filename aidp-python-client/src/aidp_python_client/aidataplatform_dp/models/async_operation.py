# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AsyncOperation(object):
    """
    An async operation.
    """

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "UNKNOWN"
    RESOURCE_TYPE_UNKNOWN = "UNKNOWN"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "CATALOG"
    RESOURCE_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "SCHEMA"
    RESOURCE_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "TABLE"
    RESOURCE_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "VIEW"
    RESOURCE_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "VOLUME"
    RESOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "VOLUME_FILE"
    RESOURCE_TYPE_VOLUME_FILE = "VOLUME_FILE"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "WORKSPACE"
    RESOURCE_TYPE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "WORKSPACE_OBJECT"
    RESOURCE_TYPE_WORKSPACE_OBJECT = "WORKSPACE_OBJECT"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "CLUSTER"
    RESOURCE_TYPE_CLUSTER = "CLUSTER"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "AI_COMPUTE"
    RESOURCE_TYPE_AI_COMPUTE = "AI_COMPUTE"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "KNOWLEDGE_BASE"
    RESOURCE_TYPE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB"
    RESOURCE_TYPE_KNOWLEDGE_BASE_JOB = "KNOWLEDGE_BASE_JOB"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB_RUN"
    RESOURCE_TYPE_KNOWLEDGE_BASE_JOB_RUN = "KNOWLEDGE_BASE_JOB_RUN"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "AGENT"
    RESOURCE_TYPE_AGENT = "AGENT"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION"
    RESOURCE_TYPE_GIT_OPERATION = "GIT_OPERATION"

    #: A constant which can be used with the resource_type property of a AsyncOperation.
    #: This constant has a value of "BUNDLE_OPERATION"
    RESOURCE_TYPE_BUNDLE_OPERATION = "BUNDLE_OPERATION"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UNKNOWN"
    ACTION_TYPE_UNKNOWN = "UNKNOWN"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_CATALOG"
    ACTION_TYPE_CREATE_CATALOG = "CREATE_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_CATALOG"
    ACTION_TYPE_UPDATE_CATALOG = "UPDATE_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_CATALOG"
    ACTION_TYPE_DELETE_CATALOG = "DELETE_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "TEST_CONNECTION_CATALOG"
    ACTION_TYPE_TEST_CONNECTION_CATALOG = "TEST_CONNECTION_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_USER_SCHEMA_IN_CATALOG"
    ACTION_TYPE_CREATE_USER_SCHEMA_IN_CATALOG = "CREATE_USER_SCHEMA_IN_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_SCHEMA"
    ACTION_TYPE_CREATE_SCHEMA = "CREATE_SCHEMA"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_SCHEMA"
    ACTION_TYPE_DELETE_SCHEMA = "DELETE_SCHEMA"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_TABLE"
    ACTION_TYPE_CREATE_TABLE = "CREATE_TABLE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_TABLE"
    ACTION_TYPE_UPDATE_TABLE = "UPDATE_TABLE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_TABLE"
    ACTION_TYPE_DELETE_TABLE = "DELETE_TABLE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_VOLUME"
    ACTION_TYPE_CREATE_VOLUME = "CREATE_VOLUME"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_VOLUME"
    ACTION_TYPE_DELETE_VOLUME = "DELETE_VOLUME"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "COPY_VOLUME_FILE"
    ACTION_TYPE_COPY_VOLUME_FILE = "COPY_VOLUME_FILE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "MOVE_VOLUME_FILE"
    ACTION_TYPE_MOVE_VOLUME_FILE = "MOVE_VOLUME_FILE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_VOLUME_FILE"
    ACTION_TYPE_DELETE_VOLUME_FILE = "DELETE_VOLUME_FILE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_VOLUME_FOLDER"
    ACTION_TYPE_DELETE_VOLUME_FOLDER = "DELETE_VOLUME_FOLDER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_WORKSPACE"
    ACTION_TYPE_CREATE_WORKSPACE = "CREATE_WORKSPACE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_WORKSPACE"
    ACTION_TYPE_UPDATE_WORKSPACE = "UPDATE_WORKSPACE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_WORKSPACE"
    ACTION_TYPE_DELETE_WORKSPACE = "DELETE_WORKSPACE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_CLUSTER"
    ACTION_TYPE_CREATE_CLUSTER = "CREATE_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_CLUSTER"
    ACTION_TYPE_UPDATE_CLUSTER = "UPDATE_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "START_CLUSTER"
    ACTION_TYPE_START_CLUSTER = "START_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "STOP_CLUSTER"
    ACTION_TYPE_STOP_CLUSTER = "STOP_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "RESTART_CLUSTER"
    ACTION_TYPE_RESTART_CLUSTER = "RESTART_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "PATCH_CLUSTER_LIBRARIES"
    ACTION_TYPE_PATCH_CLUSTER_LIBRARIES = "PATCH_CLUSTER_LIBRARIES"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_CLUSTER"
    ACTION_TYPE_DELETE_CLUSTER = "DELETE_CLUSTER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "MANAGE_EXTRACTED_ENTITIES"
    ACTION_TYPE_MANAGE_EXTRACTED_ENTITIES = "MANAGE_EXTRACTED_ENTITIES"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "REFRESH_ENTITY"
    ACTION_TYPE_REFRESH_ENTITY = "REFRESH_ENTITY"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DOWNLOAD_CLUSTER_LOG"
    ACTION_TYPE_DOWNLOAD_CLUSTER_LOG = "DOWNLOAD_CLUSTER_LOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "MIGRATE_EXTERNAL_CATALOG"
    ACTION_TYPE_MIGRATE_EXTERNAL_CATALOG = "MIGRATE_EXTERNAL_CATALOG"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_KNOWLEDGE_BASE"
    ACTION_TYPE_UPDATE_KNOWLEDGE_BASE = "UPDATE_KNOWLEDGE_BASE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_KNOWLEDGE_BASE"
    ACTION_TYPE_DELETE_KNOWLEDGE_BASE = "DELETE_KNOWLEDGE_BASE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_KNOWLEDGE_BASE"
    ACTION_TYPE_CREATE_KNOWLEDGE_BASE = "CREATE_KNOWLEDGE_BASE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DELETE_KNOWLEDGE_BASE_JOB"
    ACTION_TYPE_DELETE_KNOWLEDGE_BASE_JOB = "DELETE_KNOWLEDGE_BASE_JOB"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_KNOWLEDGE_BASE_JOB"
    ACTION_TYPE_CREATE_KNOWLEDGE_BASE_JOB = "CREATE_KNOWLEDGE_BASE_JOB"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_KNOWLEDGE_BASE_JOB_RUN"
    ACTION_TYPE_CREATE_KNOWLEDGE_BASE_JOB_RUN = "CREATE_KNOWLEDGE_BASE_JOB_RUN"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "DEPLOY_AGENT"
    ACTION_TYPE_DEPLOY_AGENT = "DEPLOY_AGENT"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_GIT_FOLDER"
    ACTION_TYPE_CREATE_GIT_FOLDER = "CREATE_GIT_FOLDER"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "UPDATE_GIT_REPOSITORY"
    ACTION_TYPE_UPDATE_GIT_REPOSITORY = "UPDATE_GIT_REPOSITORY"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "CREATE_BUNDLE"
    ACTION_TYPE_CREATE_BUNDLE = "CREATE_BUNDLE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "BUNDLE_DEPLOY"
    ACTION_TYPE_BUNDLE_DEPLOY = "BUNDLE_DEPLOY"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "BUNDLE_PURGE"
    ACTION_TYPE_BUNDLE_PURGE = "BUNDLE_PURGE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "BUNDLE_SYNC"
    ACTION_TYPE_BUNDLE_SYNC = "BUNDLE_SYNC"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "MARK_AS_BUNDLE"
    ACTION_TYPE_MARK_AS_BUNDLE = "MARK_AS_BUNDLE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_COMMIT_PUSH"
    ACTION_TYPE_GIT_COMMIT_PUSH = "GIT_COMMIT_PUSH"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_CREATE_BRANCH"
    ACTION_TYPE_GIT_CREATE_BRANCH = "GIT_CREATE_BRANCH"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_CHECKOUT_BRANCH"
    ACTION_TYPE_GIT_CHECKOUT_BRANCH = "GIT_CHECKOUT_BRANCH"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION_PULL"
    ACTION_TYPE_GIT_OPERATION_PULL = "GIT_OPERATION_PULL"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION_MERGE"
    ACTION_TYPE_GIT_OPERATION_MERGE = "GIT_OPERATION_MERGE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION_REBASE"
    ACTION_TYPE_GIT_OPERATION_REBASE = "GIT_OPERATION_REBASE"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION_RESET"
    ACTION_TYPE_GIT_OPERATION_RESET = "GIT_OPERATION_RESET"

    #: A constant which can be used with the action_type property of a AsyncOperation.
    #: This constant has a value of "GIT_OPERATION_RESET_STATE"
    ACTION_TYPE_GIT_OPERATION_RESET_STATE = "GIT_OPERATION_RESET_STATE"

    #: A constant which can be used with the status property of a AsyncOperation.
    #: This constant has a value of "IN_PROGRESS"
    STATUS_IN_PROGRESS = "IN_PROGRESS"

    #: A constant which can be used with the status property of a AsyncOperation.
    #: This constant has a value of "SUCCEEDED"
    STATUS_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the status property of a AsyncOperation.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a AsyncOperation.
    #: This constant has a value of "CANCELED"
    STATUS_CANCELED = "CANCELED"

    def __init__(self, **kwargs):
        """
        Initializes a new AsyncOperation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AsyncOperation.
        :type key: str

        :param resource_type:
            The value to assign to the resource_type property of this AsyncOperation.
            Allowed values for this property are: "UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT", "GIT_OPERATION", "BUNDLE_OPERATION", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type resource_type: str

        :param action_type:
            The value to assign to the action_type property of this AsyncOperation.
            Allowed values for this property are: "UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type action_type: str

        :param resource_name:
            The value to assign to the resource_name property of this AsyncOperation.
        :type resource_name: str

        :param resource_display_name:
            The value to assign to the resource_display_name property of this AsyncOperation.
        :type resource_display_name: str

        :param created_by:
            The value to assign to the created_by property of this AsyncOperation.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this AsyncOperation.
        :type created_by_name: str

        :param time_started:
            The value to assign to the time_started property of this AsyncOperation.
        :type time_started: datetime

        :param time_finished:
            The value to assign to the time_finished property of this AsyncOperation.
        :type time_finished: datetime

        :param status:
            The value to assign to the status property of this AsyncOperation.
            Allowed values for this property are: "IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param error_code:
            The value to assign to the error_code property of this AsyncOperation.
        :type error_code: str

        :param error_message:
            The value to assign to the error_message property of this AsyncOperation.
        :type error_message: str

        """
        self.swagger_types = {
            'key': 'str',
            'resource_type': 'str',
            'action_type': 'str',
            'resource_name': 'str',
            'resource_display_name': 'str',
            'created_by': 'str',
            'created_by_name': 'str',
            'time_started': 'datetime',
            'time_finished': 'datetime',
            'status': 'str',
            'error_code': 'str',
            'error_message': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'resource_type': 'resourceType',
            'action_type': 'actionType',
            'resource_name': 'resourceName',
            'resource_display_name': 'resourceDisplayName',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'time_started': 'timeStarted',
            'time_finished': 'timeFinished',
            'status': 'status',
            'error_code': 'errorCode',
            'error_message': 'errorMessage'
        }

        self._key = None
        self._resource_type = None
        self._action_type = None
        self._resource_name = None
        self._resource_display_name = None
        self._created_by = None
        self._created_by_name = None
        self._time_started = None
        self._time_finished = None
        self._status = None
        self._error_code = None
        self._error_message = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AsyncOperation.
        The unique key that identifies an async operation


        :return: The key of this AsyncOperation.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AsyncOperation.
        The unique key that identifies an async operation


        :param key: The key of this AsyncOperation.
        :type: str
        """
        self._key = key

    @property
    def resource_type(self):
        """
        **[Required]** Gets the resource_type of this AsyncOperation.
        The resource type of the async operation.

        Allowed values for this property are: "UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT", "GIT_OPERATION", "BUNDLE_OPERATION", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The resource_type of this AsyncOperation.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this AsyncOperation.
        The resource type of the async operation.


        :param resource_type: The resource_type of this AsyncOperation.
        :type: str
        """
        allowed_values = ["UNKNOWN", "CATALOG", "SCHEMA", "TABLE", "VIEW", "VOLUME", "VOLUME_FILE", "WORKSPACE", "WORKSPACE_OBJECT", "CLUSTER", "AI_COMPUTE", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "AGENT", "GIT_OPERATION", "BUNDLE_OPERATION"]
        if not value_allowed_none_or_none_sentinel(resource_type, allowed_values):
            resource_type = 'UNKNOWN_ENUM_VALUE'
        self._resource_type = resource_type

    @property
    def action_type(self):
        """
        **[Required]** Gets the action_type of this AsyncOperation.
        The action type of the async operation.

        Allowed values for this property are: "UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The action_type of this AsyncOperation.
        :rtype: str
        """
        return self._action_type

    @action_type.setter
    def action_type(self, action_type):
        """
        Sets the action_type of this AsyncOperation.
        The action type of the async operation.


        :param action_type: The action_type of this AsyncOperation.
        :type: str
        """
        allowed_values = ["UNKNOWN", "CREATE_CATALOG", "UPDATE_CATALOG", "DELETE_CATALOG", "TEST_CONNECTION_CATALOG", "CREATE_USER_SCHEMA_IN_CATALOG", "CREATE_SCHEMA", "DELETE_SCHEMA", "CREATE_TABLE", "UPDATE_TABLE", "DELETE_TABLE", "CREATE_VOLUME", "DELETE_VOLUME", "COPY_VOLUME_FILE", "MOVE_VOLUME_FILE", "DELETE_VOLUME_FILE", "DELETE_VOLUME_FOLDER", "CREATE_WORKSPACE", "UPDATE_WORKSPACE", "DELETE_WORKSPACE", "CREATE_CLUSTER", "UPDATE_CLUSTER", "START_CLUSTER", "STOP_CLUSTER", "RESTART_CLUSTER", "PATCH_CLUSTER_LIBRARIES", "DELETE_CLUSTER", "MANAGE_EXTRACTED_ENTITIES", "REFRESH_ENTITY", "DOWNLOAD_CLUSTER_LOG", "MIGRATE_EXTERNAL_CATALOG", "UPDATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE", "CREATE_KNOWLEDGE_BASE", "DELETE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB", "CREATE_KNOWLEDGE_BASE_JOB_RUN", "DEPLOY_AGENT", "CREATE_GIT_FOLDER", "UPDATE_GIT_REPOSITORY", "CREATE_BUNDLE", "BUNDLE_DEPLOY", "BUNDLE_PURGE", "BUNDLE_SYNC", "MARK_AS_BUNDLE", "GIT_COMMIT_PUSH", "GIT_CREATE_BRANCH", "GIT_CHECKOUT_BRANCH", "GIT_OPERATION_PULL", "GIT_OPERATION_MERGE", "GIT_OPERATION_REBASE", "GIT_OPERATION_RESET", "GIT_OPERATION_RESET_STATE"]
        if not value_allowed_none_or_none_sentinel(action_type, allowed_values):
            action_type = 'UNKNOWN_ENUM_VALUE'
        self._action_type = action_type

    @property
    def resource_name(self):
        """
        **[Required]** Gets the resource_name of this AsyncOperation.
        The fully qualified name of the Data Lake resource. Example: For table, it is
        <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>


        :return: The resource_name of this AsyncOperation.
        :rtype: str
        """
        return self._resource_name

    @resource_name.setter
    def resource_name(self, resource_name):
        """
        Sets the resource_name of this AsyncOperation.
        The fully qualified name of the Data Lake resource. Example: For table, it is
        <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>


        :param resource_name: The resource_name of this AsyncOperation.
        :type: str
        """
        self._resource_name = resource_name

    @property
    def resource_display_name(self):
        """
        Gets the resource_display_name of this AsyncOperation.
        The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
        But for workspace/cluster it is workspace and cluster displayName field.


        :return: The resource_display_name of this AsyncOperation.
        :rtype: str
        """
        return self._resource_display_name

    @resource_display_name.setter
    def resource_display_name(self, resource_display_name):
        """
        Sets the resource_display_name of this AsyncOperation.
        The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
        But for workspace/cluster it is workspace and cluster displayName field.


        :param resource_display_name: The resource_display_name of this AsyncOperation.
        :type: str
        """
        self._resource_display_name = resource_display_name

    @property
    def created_by(self):
        """
        Gets the created_by of this AsyncOperation.
        The principal Id who started the async operation


        :return: The created_by of this AsyncOperation.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AsyncOperation.
        The principal Id who started the async operation


        :param created_by: The created_by of this AsyncOperation.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this AsyncOperation.
        The principal name who started the async operation


        :return: The created_by_name of this AsyncOperation.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this AsyncOperation.
        The principal name who started the async operation


        :param created_by_name: The created_by_name of this AsyncOperation.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def time_started(self):
        """
        **[Required]** Gets the time_started of this AsyncOperation.
        The date and time the Async operation was started, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_started of this AsyncOperation.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this AsyncOperation.
        The date and time the Async operation was started, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_started: The time_started of this AsyncOperation.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_finished(self):
        """
        Gets the time_finished of this AsyncOperation.
        The date and time the Async operation finished, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_finished of this AsyncOperation.
        :rtype: datetime
        """
        return self._time_finished

    @time_finished.setter
    def time_finished(self, time_finished):
        """
        Sets the time_finished of this AsyncOperation.
        The date and time the Async operation finished, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_finished: The time_finished of this AsyncOperation.
        :type: datetime
        """
        self._time_finished = time_finished

    @property
    def status(self):
        """
        **[Required]** Gets the status of this AsyncOperation.
        The state of the Table.

        Allowed values for this property are: "IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this AsyncOperation.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this AsyncOperation.
        The state of the Table.


        :param status: The status of this AsyncOperation.
        :type: str
        """
        allowed_values = ["IN_PROGRESS", "SUCCEEDED", "FAILED", "CANCELED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def error_code(self):
        """
        Gets the error_code of this AsyncOperation.
        Represents the error code of a failure


        :return: The error_code of this AsyncOperation.
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """
        Sets the error_code of this AsyncOperation.
        Represents the error code of a failure


        :param error_code: The error_code of this AsyncOperation.
        :type: str
        """
        self._error_code = error_code

    @property
    def error_message(self):
        """
        Gets the error_message of this AsyncOperation.
        Representss extra error information of a failure


        :return: The error_message of this AsyncOperation.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this AsyncOperation.
        Representss extra error information of a failure


        :param error_message: The error_message of this AsyncOperation.
        :type: str
        """
        self._error_message = error_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
