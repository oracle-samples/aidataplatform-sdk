# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecentResourceItem(object):
    """
    The list of the recent resources accessed by a user
    """

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "NOTEBOOK"
    RESOURCE_TYPE_NOTEBOOK = "NOTEBOOK"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "FILE"
    RESOURCE_TYPE_FILE = "FILE"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "CATALOG"
    RESOURCE_TYPE_CATALOG = "CATALOG"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "SCHEMA"
    RESOURCE_TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "TABLE"
    RESOURCE_TYPE_TABLE = "TABLE"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "VOLUME"
    RESOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "JOB"
    RESOURCE_TYPE_JOB = "JOB"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "JOB_RUN"
    RESOURCE_TYPE_JOB_RUN = "JOB_RUN"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "LAKE_FLOW"
    RESOURCE_TYPE_LAKE_FLOW = "LAKE_FLOW"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "AGENT_LAKE_FLOW"
    RESOURCE_TYPE_AGENT_LAKE_FLOW = "AGENT_LAKE_FLOW"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "CLUSTER"
    RESOURCE_TYPE_CLUSTER = "CLUSTER"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "AI_COMPUTE"
    RESOURCE_TYPE_AI_COMPUTE = "AI_COMPUTE"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "FOLDER"
    RESOURCE_TYPE_FOLDER = "FOLDER"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "VOLUME_DIR"
    RESOURCE_TYPE_VOLUME_DIR = "VOLUME_DIR"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "VOLUME_FILE"
    RESOURCE_TYPE_VOLUME_FILE = "VOLUME_FILE"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "VIEW"
    RESOURCE_TYPE_VIEW = "VIEW"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "SHARE"
    RESOURCE_TYPE_SHARE = "SHARE"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "RECIPIENT"
    RESOURCE_TYPE_RECIPIENT = "RECIPIENT"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "EXTRACTOR"
    RESOURCE_TYPE_EXTRACTOR = "EXTRACTOR"

    #: A constant which can be used with the resource_type property of a RecentResourceItem.
    #: This constant has a value of "AGENT_FLOW"
    RESOURCE_TYPE_AGENT_FLOW = "AGENT_FLOW"

    def __init__(self, **kwargs):
        """
        Initializes a new RecentResourceItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace_key:
            The value to assign to the workspace_key property of this RecentResourceItem.
        :type workspace_key: str

        :param resource_type:
            The value to assign to the resource_type property of this RecentResourceItem.
            Allowed values for this property are: "NOTEBOOK", "FILE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "JOB", "JOB_RUN", "LAKE_FLOW", "AGENT_LAKE_FLOW", "CLUSTER", "AI_COMPUTE", "FOLDER", "VOLUME_DIR", "VOLUME_FILE", "VIEW", "SHARE", "RECIPIENT", "EXTRACTOR", "AGENT_FLOW"
        :type resource_type: str

        :param resource_id:
            The value to assign to the resource_id property of this RecentResourceItem.
        :type resource_id: str

        :param resource_name:
            The value to assign to the resource_name property of this RecentResourceItem.
        :type resource_name: str

        :param time_accessed:
            The value to assign to the time_accessed property of this RecentResourceItem.
        :type time_accessed: datetime

        """
        self.swagger_types = {
            'workspace_key': 'str',
            'resource_type': 'str',
            'resource_id': 'str',
            'resource_name': 'str',
            'time_accessed': 'datetime'
        }

        self.attribute_map = {
            'workspace_key': 'workspaceKey',
            'resource_type': 'resourceType',
            'resource_id': 'resourceId',
            'resource_name': 'resourceName',
            'time_accessed': 'timeAccessed'
        }

        self._workspace_key = None
        self._resource_type = None
        self._resource_id = None
        self._resource_name = None
        self._time_accessed = None

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this RecentResourceItem.
        Key of the workspace. Null in the case of a global resource.


        :return: The workspace_key of this RecentResourceItem.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this RecentResourceItem.
        Key of the workspace. Null in the case of a global resource.


        :param workspace_key: The workspace_key of this RecentResourceItem.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def resource_type(self):
        """
        Gets the resource_type of this RecentResourceItem.
        Type of the resource.

        Allowed values for this property are: "NOTEBOOK", "FILE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "JOB", "JOB_RUN", "LAKE_FLOW", "AGENT_LAKE_FLOW", "CLUSTER", "AI_COMPUTE", "FOLDER", "VOLUME_DIR", "VOLUME_FILE", "VIEW", "SHARE", "RECIPIENT", "EXTRACTOR", "AGENT_FLOW"


        :return: The resource_type of this RecentResourceItem.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this RecentResourceItem.
        Type of the resource.


        :param resource_type: The resource_type of this RecentResourceItem.
        :type: str
        """
        allowed_values = ["NOTEBOOK", "FILE", "CATALOG", "SCHEMA", "TABLE", "VOLUME", "JOB", "JOB_RUN", "LAKE_FLOW", "AGENT_LAKE_FLOW", "CLUSTER", "AI_COMPUTE", "FOLDER", "VOLUME_DIR", "VOLUME_FILE", "VIEW", "SHARE", "RECIPIENT", "EXTRACTOR", "AGENT_FLOW"]
        if not value_allowed_none_or_none_sentinel(resource_type, allowed_values):
            raise ValueError(
                "Invalid value for `resource_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._resource_type = resource_type

    @property
    def resource_id(self):
        """
        Gets the resource_id of this RecentResourceItem.
        Unique identifier of the resource or path.


        :return: The resource_id of this RecentResourceItem.
        :rtype: str
        """
        return self._resource_id

    @resource_id.setter
    def resource_id(self, resource_id):
        """
        Sets the resource_id of this RecentResourceItem.
        Unique identifier of the resource or path.


        :param resource_id: The resource_id of this RecentResourceItem.
        :type: str
        """
        self._resource_id = resource_id

    @property
    def resource_name(self):
        """
        Gets the resource_name of this RecentResourceItem.
        Resource name associated with the resourceId field.


        :return: The resource_name of this RecentResourceItem.
        :rtype: str
        """
        return self._resource_name

    @resource_name.setter
    def resource_name(self, resource_name):
        """
        Sets the resource_name of this RecentResourceItem.
        Resource name associated with the resourceId field.


        :param resource_name: The resource_name of this RecentResourceItem.
        :type: str
        """
        self._resource_name = resource_name

    @property
    def time_accessed(self):
        """
        Gets the time_accessed of this RecentResourceItem.
        Timestamp of when the resource was created, read, or updated.


        :return: The time_accessed of this RecentResourceItem.
        :rtype: datetime
        """
        return self._time_accessed

    @time_accessed.setter
    def time_accessed(self, time_accessed):
        """
        Sets the time_accessed of this RecentResourceItem.
        Timestamp of when the resource was created, read, or updated.


        :param time_accessed: The time_accessed of this RecentResourceItem.
        :type: datetime
        """
        self._time_accessed = time_accessed

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
