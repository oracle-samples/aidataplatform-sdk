# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchAuditLogsDetails(object):
    """
    Information needed to search the audit logs
    """

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "DATA_LAKE"
    OBJECT_TYPE_DATA_LAKE = "DATA_LAKE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "ROLE"
    OBJECT_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "CATALOG"
    OBJECT_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "SCHEMA"
    OBJECT_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "TABLE"
    OBJECT_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "VOLUME"
    OBJECT_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "VIEW"
    OBJECT_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "WORKSPACE"
    OBJECT_TYPE_WORKSPACE = "WORKSPACE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "WORKSPACE_FILE"
    OBJECT_TYPE_WORKSPACE_FILE = "WORKSPACE_FILE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "WORKSPACE_FOLDER"
    OBJECT_TYPE_WORKSPACE_FOLDER = "WORKSPACE_FOLDER"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "COMPUTE"
    OBJECT_TYPE_COMPUTE = "COMPUTE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "FOLDER"
    OBJECT_TYPE_FOLDER = "FOLDER"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "FILE"
    OBJECT_TYPE_FILE = "FILE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "AUTO_POPULATE"
    OBJECT_TYPE_AUTO_POPULATE = "AUTO_POPULATE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "VOLUME_FILE"
    OBJECT_TYPE_VOLUME_FILE = "VOLUME_FILE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "VOLUME_FOLDER"
    OBJECT_TYPE_VOLUME_FOLDER = "VOLUME_FOLDER"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "KNOWLEDGE_BASE"
    OBJECT_TYPE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB"
    OBJECT_TYPE_KNOWLEDGE_BASE_JOB = "KNOWLEDGE_BASE_JOB"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "KNOWLEDGE_BASE_JOB_RUN"
    OBJECT_TYPE_KNOWLEDGE_BASE_JOB_RUN = "KNOWLEDGE_BASE_JOB_RUN"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "KNOWLEDGE_BASE_OWNERSHIP"
    OBJECT_TYPE_KNOWLEDGE_BASE_OWNERSHIP = "KNOWLEDGE_BASE_OWNERSHIP"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "VECTOR_STORE_CREDENTIALS"
    OBJECT_TYPE_VECTOR_STORE_CREDENTIALS = "VECTOR_STORE_CREDENTIALS"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "AUDIT_LOG"
    OBJECT_TYPE_AUDIT_LOG = "AUDIT_LOG"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "WORKFLOW"
    OBJECT_TYPE_WORKFLOW = "WORKFLOW"

    #: A constant which can be used with the object_type property of a SearchAuditLogsDetails.
    #: This constant has a value of "CREDENTIAL"
    OBJECT_TYPE_CREDENTIAL = "CREDENTIAL"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "CREATE"
    OPERATION_CREATE = "CREATE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "UPDATE"
    OPERATION_UPDATE = "UPDATE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "DELETE"
    OPERATION_DELETE = "DELETE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "VIEW"
    OPERATION_VIEW = "VIEW"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "GRANT"
    OPERATION_GRANT = "GRANT"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "REVOKE"
    OPERATION_REVOKE = "REVOKE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "ATTACH"
    OPERATION_ATTACH = "ATTACH"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "DETACH"
    OPERATION_DETACH = "DETACH"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "VIEW_LOGS"
    OPERATION_VIEW_LOGS = "VIEW_LOGS"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "RENAME"
    OPERATION_RENAME = "RENAME"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "TERMINATE"
    OPERATION_TERMINATE = "TERMINATE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "MOVE"
    OPERATION_MOVE = "MOVE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "EXECUTE"
    OPERATION_EXECUTE = "EXECUTE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "MANAGE_ACCESS"
    OPERATION_MANAGE_ACCESS = "MANAGE_ACCESS"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "QUERY"
    OPERATION_QUERY = "QUERY"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "MANAGE"
    OPERATION_MANAGE = "MANAGE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "READ"
    OPERATION_READ = "READ"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "WRITE"
    OPERATION_WRITE = "WRITE"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "START"
    OPERATION_START = "START"

    #: A constant which can be used with the operation property of a SearchAuditLogsDetails.
    #: This constant has a value of "STOP"
    OPERATION_STOP = "STOP"

    #: A constant which can be used with the status property of a SearchAuditLogsDetails.
    #: This constant has a value of "SUCCEEDED"
    STATUS_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the status property of a SearchAuditLogsDetails.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "startedBy"
    SORT_BY_STARTED_BY = "startedBy"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "status"
    SORT_BY_STATUS = "status"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "operation"
    SORT_BY_OPERATION = "operation"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "objectType"
    SORT_BY_OBJECT_TYPE = "objectType"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "objectName"
    SORT_BY_OBJECT_NAME = "objectName"

    #: A constant which can be used with the sort_by property of a SearchAuditLogsDetails.
    #: This constant has a value of "time"
    SORT_BY_TIME = "time"

    #: A constant which can be used with the sort_order property of a SearchAuditLogsDetails.
    #: This constant has a value of "ASC"
    SORT_ORDER_ASC = "ASC"

    #: A constant which can be used with the sort_order property of a SearchAuditLogsDetails.
    #: This constant has a value of "DESC"
    SORT_ORDER_DESC = "DESC"

    def __init__(self, **kwargs):
        """
        Initializes a new SearchAuditLogsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_begin:
            The value to assign to the time_begin property of this SearchAuditLogsDetails.
        :type time_begin: datetime

        :param time_end:
            The value to assign to the time_end property of this SearchAuditLogsDetails.
        :type time_end: datetime

        :param object_type:
            The value to assign to the object_type property of this SearchAuditLogsDetails.
            Allowed values for this property are: "DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL"
        :type object_type: str

        :param object_name:
            The value to assign to the object_name property of this SearchAuditLogsDetails.
        :type object_name: str

        :param operation:
            The value to assign to the operation property of this SearchAuditLogsDetails.
            Allowed values for this property are: "CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP"
        :type operation: str

        :param status:
            The value to assign to the status property of this SearchAuditLogsDetails.
            Allowed values for this property are: "SUCCEEDED", "FAILED"
        :type status: str

        :param started_by:
            The value to assign to the started_by property of this SearchAuditLogsDetails.
        :type started_by: str

        :param query:
            The value to assign to the query property of this SearchAuditLogsDetails.
        :type query: str

        :param sort_by:
            The value to assign to the sort_by property of this SearchAuditLogsDetails.
            Allowed values for this property are: "startedBy", "status", "operation", "objectType", "objectName", "time"
        :type sort_by: str

        :param sort_order:
            The value to assign to the sort_order property of this SearchAuditLogsDetails.
            Allowed values for this property are: "ASC", "DESC"
        :type sort_order: str

        """
        self.swagger_types = {
            'time_begin': 'datetime',
            'time_end': 'datetime',
            'object_type': 'str',
            'object_name': 'str',
            'operation': 'str',
            'status': 'str',
            'started_by': 'str',
            'query': 'str',
            'sort_by': 'str',
            'sort_order': 'str'
        }

        self.attribute_map = {
            'time_begin': 'timeBegin',
            'time_end': 'timeEnd',
            'object_type': 'objectType',
            'object_name': 'objectName',
            'operation': 'operation',
            'status': 'status',
            'started_by': 'startedBy',
            'query': 'query',
            'sort_by': 'sortBy',
            'sort_order': 'sortOrder'
        }

        self._time_begin = None
        self._time_end = None
        self._object_type = None
        self._object_name = None
        self._operation = None
        self._status = None
        self._started_by = None
        self._query = None
        self._sort_by = None
        self._sort_order = None

    @property
    def time_begin(self):
        """
        Gets the time_begin of this SearchAuditLogsDetails.
        Start time of the logs


        :return: The time_begin of this SearchAuditLogsDetails.
        :rtype: datetime
        """
        return self._time_begin

    @time_begin.setter
    def time_begin(self, time_begin):
        """
        Sets the time_begin of this SearchAuditLogsDetails.
        Start time of the logs


        :param time_begin: The time_begin of this SearchAuditLogsDetails.
        :type: datetime
        """
        self._time_begin = time_begin

    @property
    def time_end(self):
        """
        Gets the time_end of this SearchAuditLogsDetails.
        End time of the logs


        :return: The time_end of this SearchAuditLogsDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this SearchAuditLogsDetails.
        End time of the logs


        :param time_end: The time_end of this SearchAuditLogsDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def object_type(self):
        """
        Gets the object_type of this SearchAuditLogsDetails.
        Type of Object

        Allowed values for this property are: "DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL"


        :return: The object_type of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._object_type

    @object_type.setter
    def object_type(self, object_type):
        """
        Sets the object_type of this SearchAuditLogsDetails.
        Type of Object


        :param object_type: The object_type of this SearchAuditLogsDetails.
        :type: str
        """
        allowed_values = ["DATA_LAKE", "ROLE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "VIEW", "WORKSPACE", "WORKSPACE_FILE", "WORKSPACE_FOLDER", "COMPUTE", "FOLDER", "FILE", "AUTO_POPULATE", "VOLUME_FILE", "VOLUME_FOLDER", "KNOWLEDGE_BASE", "KNOWLEDGE_BASE_JOB", "KNOWLEDGE_BASE_JOB_RUN", "KNOWLEDGE_BASE_OWNERSHIP", "VECTOR_STORE_CREDENTIALS", "AUDIT_LOG", "WORKFLOW", "CREDENTIAL"]
        if not value_allowed_none_or_none_sentinel(object_type, allowed_values):
            raise ValueError(
                "Invalid value for `object_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._object_type = object_type

    @property
    def object_name(self):
        """
        Gets the object_name of this SearchAuditLogsDetails.
        Name of the object


        :return: The object_name of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._object_name

    @object_name.setter
    def object_name(self, object_name):
        """
        Sets the object_name of this SearchAuditLogsDetails.
        Name of the object


        :param object_name: The object_name of this SearchAuditLogsDetails.
        :type: str
        """
        self._object_name = object_name

    @property
    def operation(self):
        """
        Gets the operation of this SearchAuditLogsDetails.
        Type of operation

        Allowed values for this property are: "CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP"


        :return: The operation of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """
        Sets the operation of this SearchAuditLogsDetails.
        Type of operation


        :param operation: The operation of this SearchAuditLogsDetails.
        :type: str
        """
        allowed_values = ["CREATE", "UPDATE", "DELETE", "VIEW", "GRANT", "REVOKE", "ATTACH", "DETACH", "VIEW_LOGS", "RENAME", "TERMINATE", "MOVE", "EXECUTE", "MANAGE_ACCESS", "QUERY", "MANAGE", "READ", "WRITE", "START", "STOP"]
        if not value_allowed_none_or_none_sentinel(operation, allowed_values):
            raise ValueError(
                "Invalid value for `operation`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._operation = operation

    @property
    def status(self):
        """
        Gets the status of this SearchAuditLogsDetails.
        Status of log

        Allowed values for this property are: "SUCCEEDED", "FAILED"


        :return: The status of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this SearchAuditLogsDetails.
        Status of log


        :param status: The status of this SearchAuditLogsDetails.
        :type: str
        """
        allowed_values = ["SUCCEEDED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def started_by(self):
        """
        Gets the started_by of this SearchAuditLogsDetails.
        Operation started by


        :return: The started_by of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._started_by

    @started_by.setter
    def started_by(self, started_by):
        """
        Sets the started_by of this SearchAuditLogsDetails.
        Operation started by


        :param started_by: The started_by of this SearchAuditLogsDetails.
        :type: str
        """
        self._started_by = started_by

    @property
    def query(self):
        """
        Gets the query of this SearchAuditLogsDetails.
        Query to search the log


        :return: The query of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this SearchAuditLogsDetails.
        Query to search the log


        :param query: The query of this SearchAuditLogsDetails.
        :type: str
        """
        self._query = query

    @property
    def sort_by(self):
        """
        Gets the sort_by of this SearchAuditLogsDetails.
        The field to sort by.

        Allowed values for this property are: "startedBy", "status", "operation", "objectType", "objectName", "time"


        :return: The sort_by of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """
        Sets the sort_by of this SearchAuditLogsDetails.
        The field to sort by.


        :param sort_by: The sort_by of this SearchAuditLogsDetails.
        :type: str
        """
        allowed_values = ["startedBy", "status", "operation", "objectType", "objectName", "time"]
        if not value_allowed_none_or_none_sentinel(sort_by, allowed_values):
            raise ValueError(
                "Invalid value for `sort_by`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_by = sort_by

    @property
    def sort_order(self):
        """
        Gets the sort_order of this SearchAuditLogsDetails.
        Sort order for search results.

        Allowed values for this property are: "ASC", "DESC"


        :return: The sort_order of this SearchAuditLogsDetails.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order):
        """
        Sets the sort_order of this SearchAuditLogsDetails.
        Sort order for search results.


        :param sort_order: The sort_order of this SearchAuditLogsDetails.
        :type: str
        """
        allowed_values = ["ASC", "DESC"]
        if not value_allowed_none_or_none_sentinel(sort_order, allowed_values):
            raise ValueError(
                "Invalid value for `sort_order`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_order = sort_order

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
