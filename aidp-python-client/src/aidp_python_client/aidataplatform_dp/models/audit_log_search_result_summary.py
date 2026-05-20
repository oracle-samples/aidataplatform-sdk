# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AuditLogSearchResultSummary(object):
    """
    Search result for audit log search request.
    """

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "DATA_LAKE"
    OBJECT_TYPE_DATA_LAKE = "DATA_LAKE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "ROLE"
    OBJECT_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "CATALOG"
    OBJECT_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "SCHEMA"
    OBJECT_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "TABLE"
    OBJECT_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VOLUME"
    OBJECT_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VIEW"
    OBJECT_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "WORKSPACE"
    OBJECT_TYPE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "WORKSPACE_FILE"
    OBJECT_TYPE_WORKSPACE_FILE = "WORKSPACE_FILE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "WORKSPACE_FOLDER"
    OBJECT_TYPE_WORKSPACE_FOLDER = "WORKSPACE_FOLDER"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "COMPUTE"
    OBJECT_TYPE_COMPUTE = "COMPUTE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "FOLDER"
    OBJECT_TYPE_FOLDER = "FOLDER"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "FILE"
    OBJECT_TYPE_FILE = "FILE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "AUTO_POPULATE"
    OBJECT_TYPE_AUTO_POPULATE = "AUTO_POPULATE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VOLUME_FILE"
    OBJECT_TYPE_VOLUME_FILE = "VOLUME_FILE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VOLUME_FOLDER"
    OBJECT_TYPE_VOLUME_FOLDER = "VOLUME_FOLDER"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "KNOWLEDGE_BASE"
    OBJECT_TYPE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB"
    OBJECT_TYPE_KNOWLEDGE_BASE_JOB = "KNOWLEDGE_BASE_JOB"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB_RUN"
    OBJECT_TYPE_KNOWLEDGE_BASE_JOB_RUN = "KNOWLEDGE_BASE_JOB_RUN"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "KNOWLEDGE_BASE_OWNERSHIP"
    OBJECT_TYPE_KNOWLEDGE_BASE_OWNERSHIP = "KNOWLEDGE_BASE_OWNERSHIP"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VECTOR_STORE_CREDENTIALS"
    OBJECT_TYPE_VECTOR_STORE_CREDENTIALS = "VECTOR_STORE_CREDENTIALS"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "AUDIT_LOG"
    OBJECT_TYPE_AUDIT_LOG = "AUDIT_LOG"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "WORKFLOW"
    OBJECT_TYPE_WORKFLOW = "WORKFLOW"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "CREDENTIAL"
    OBJECT_TYPE_CREDENTIAL = "CREDENTIAL"

    #: A constant which can be used with the object_type property of a AuditLogSearchResultSummary.
    #: This constant has a value of "AGENT_FLOW"
    OBJECT_TYPE_AGENT_FLOW = "AGENT_FLOW"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "CREATE"
    OPERATION_CREATE = "CREATE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "UPDATE"
    OPERATION_UPDATE = "UPDATE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "DELETE"
    OPERATION_DELETE = "DELETE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VIEW"
    OPERATION_VIEW = "VIEW"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "GRANT"
    OPERATION_GRANT = "GRANT"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "REVOKE"
    OPERATION_REVOKE = "REVOKE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "ATTACH"
    OPERATION_ATTACH = "ATTACH"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "DETACH"
    OPERATION_DETACH = "DETACH"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "VIEW_LOGS"
    OPERATION_VIEW_LOGS = "VIEW_LOGS"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "RENAME"
    OPERATION_RENAME = "RENAME"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "TERMINATE"
    OPERATION_TERMINATE = "TERMINATE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "MOVE"
    OPERATION_MOVE = "MOVE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "EXECUTE"
    OPERATION_EXECUTE = "EXECUTE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "MANAGE_ACCESS"
    OPERATION_MANAGE_ACCESS = "MANAGE_ACCESS"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "QUERY"
    OPERATION_QUERY = "QUERY"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "MANAGE"
    OPERATION_MANAGE = "MANAGE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "READ"
    OPERATION_READ = "READ"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "WRITE"
    OPERATION_WRITE = "WRITE"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "START"
    OPERATION_START = "START"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "STOP"
    OPERATION_STOP = "STOP"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "COPY"
    OPERATION_COPY = "COPY"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "DEPLOY"
    OPERATION_DEPLOY = "DEPLOY"

    #: A constant which can be used with the operation property of a AuditLogSearchResultSummary.
    #: This constant has a value of "UNDEPLOY"
    OPERATION_UNDEPLOY = "UNDEPLOY"

    #: A constant which can be used with the status property of a AuditLogSearchResultSummary.
    #: This constant has a value of "SUCCEEDED"
    STATUS_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the status property of a AuditLogSearchResultSummary.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new AuditLogSearchResultSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param event_id:
            The value to assign to the event_id property of this AuditLogSearchResultSummary.
        :type event_id: str

        :param time_of_log:
            The value to assign to the time_of_log property of this AuditLogSearchResultSummary.
        :type time_of_log: datetime

        :param object_type:
            The value to assign to the object_type property of this AuditLogSearchResultSummary.
            Allowed values for this property are: "DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL", "AGENT_FLOW", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type object_type: str

        :param object_name:
            The value to assign to the object_name property of this AuditLogSearchResultSummary.
        :type object_name: str

        :param operation:
            The value to assign to the operation property of this AuditLogSearchResultSummary.
            Allowed values for this property are: "CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP", "COPY", "DEPLOY", "UNDEPLOY", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type operation: str

        :param status:
            The value to assign to the status property of this AuditLogSearchResultSummary.
            Allowed values for this property are: "SUCCEEDED", "FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param started_by:
            The value to assign to the started_by property of this AuditLogSearchResultSummary.
        :type started_by: str

        :param source:
            The value to assign to the source property of this AuditLogSearchResultSummary.
        :type source: str

        :param payload:
            The value to assign to the payload property of this AuditLogSearchResultSummary.
        :type payload: str

        """
        self.swagger_types = {
            'event_id': 'str',
            'time_of_log': 'datetime',
            'object_type': 'str',
            'object_name': 'str',
            'operation': 'str',
            'status': 'str',
            'started_by': 'str',
            'source': 'str',
            'payload': 'str'
        }

        self.attribute_map = {
            'event_id': 'eventId',
            'time_of_log': 'timeOfLog',
            'object_type': 'objectType',
            'object_name': 'objectName',
            'operation': 'operation',
            'status': 'status',
            'started_by': 'startedBy',
            'source': 'source',
            'payload': 'payload'
        }

        self._event_id = None
        self._time_of_log = None
        self._object_type = None
        self._object_name = None
        self._operation = None
        self._status = None
        self._started_by = None
        self._source = None
        self._payload = None

    @property
    def event_id(self):
        """
        Gets the event_id of this AuditLogSearchResultSummary.
        Unique ID of the result.


        :return: The event_id of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._event_id

    @event_id.setter
    def event_id(self, event_id):
        """
        Sets the event_id of this AuditLogSearchResultSummary.
        Unique ID of the result.


        :param event_id: The event_id of this AuditLogSearchResultSummary.
        :type: str
        """
        self._event_id = event_id

    @property
    def time_of_log(self):
        """
        Gets the time_of_log of this AuditLogSearchResultSummary.
        Time of the log.


        :return: The time_of_log of this AuditLogSearchResultSummary.
        :rtype: datetime
        """
        return self._time_of_log

    @time_of_log.setter
    def time_of_log(self, time_of_log):
        """
        Sets the time_of_log of this AuditLogSearchResultSummary.
        Time of the log.


        :param time_of_log: The time_of_log of this AuditLogSearchResultSummary.
        :type: datetime
        """
        self._time_of_log = time_of_log

    @property
    def object_type(self):
        """
        Gets the object_type of this AuditLogSearchResultSummary.
        Type of object.

        Allowed values for this property are: "DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL", "AGENT_FLOW", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The object_type of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._object_type

    @object_type.setter
    def object_type(self, object_type):
        """
        Sets the object_type of this AuditLogSearchResultSummary.
        Type of object.


        :param object_type: The object_type of this AuditLogSearchResultSummary.
        :type: str
        """
        allowed_values = ["DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL", "AGENT_FLOW"]
        if not value_allowed_none_or_none_sentinel(object_type, allowed_values):
            object_type = 'UNKNOWN_ENUM_VALUE'
        self._object_type = object_type

    @property
    def object_name(self):
        """
        Gets the object_name of this AuditLogSearchResultSummary.
        Name of the object.


        :return: The object_name of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._object_name

    @object_name.setter
    def object_name(self, object_name):
        """
        Sets the object_name of this AuditLogSearchResultSummary.
        Name of the object.


        :param object_name: The object_name of this AuditLogSearchResultSummary.
        :type: str
        """
        self._object_name = object_name

    @property
    def operation(self):
        """
        Gets the operation of this AuditLogSearchResultSummary.
        Type of operation.

        Allowed values for this property are: "CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP", "COPY", "DEPLOY", "UNDEPLOY", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The operation of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """
        Sets the operation of this AuditLogSearchResultSummary.
        Type of operation.


        :param operation: The operation of this AuditLogSearchResultSummary.
        :type: str
        """
        allowed_values = ["CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP", "COPY", "DEPLOY", "UNDEPLOY"]
        if not value_allowed_none_or_none_sentinel(operation, allowed_values):
            operation = 'UNKNOWN_ENUM_VALUE'
        self._operation = operation

    @property
    def status(self):
        """
        Gets the status of this AuditLogSearchResultSummary.
        Status of log.

        Allowed values for this property are: "SUCCEEDED", "FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this AuditLogSearchResultSummary.
        Status of log.


        :param status: The status of this AuditLogSearchResultSummary.
        :type: str
        """
        allowed_values = ["SUCCEEDED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def started_by(self):
        """
        Gets the started_by of this AuditLogSearchResultSummary.
        Operation started by.


        :return: The started_by of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._started_by

    @started_by.setter
    def started_by(self, started_by):
        """
        Sets the started_by of this AuditLogSearchResultSummary.
        Operation started by.


        :param started_by: The started_by of this AuditLogSearchResultSummary.
        :type: str
        """
        self._started_by = started_by

    @property
    def source(self):
        """
        Gets the source of this AuditLogSearchResultSummary.
        Source of logs.


        :return: The source of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this AuditLogSearchResultSummary.
        Source of logs.


        :param source: The source of this AuditLogSearchResultSummary.
        :type: str
        """
        self._source = source

    @property
    def payload(self):
        """
        Gets the payload of this AuditLogSearchResultSummary.
        Payload of logs.


        :return: The payload of this AuditLogSearchResultSummary.
        :rtype: str
        """
        return self._payload

    @payload.setter
    def payload(self, payload):
        """
        Sets the payload of this AuditLogSearchResultSummary.
        Payload of logs.


        :param payload: The payload of this AuditLogSearchResultSummary.
        :type: str
        """
        self._payload = payload

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
