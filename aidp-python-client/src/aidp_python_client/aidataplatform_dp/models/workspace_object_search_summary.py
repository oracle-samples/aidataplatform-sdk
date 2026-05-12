# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceObjectSearchSummary(object):
    """
    An object in a Data Lake Workspace
    """

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceObjectSearchSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this WorkspaceObjectSearchSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this WorkspaceObjectSearchSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this WorkspaceObjectSearchSummary.
        :type description: str

        :param type:
            The value to assign to the type property of this WorkspaceObjectSearchSummary.
        :type type: str

        :param workspace_key:
            The value to assign to the workspace_key property of this WorkspaceObjectSearchSummary.
        :type workspace_key: str

        :param path:
            The value to assign to the path property of this WorkspaceObjectSearchSummary.
        :type path: str

        :param time_created:
            The value to assign to the time_created property of this WorkspaceObjectSearchSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this WorkspaceObjectSearchSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this WorkspaceObjectSearchSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this WorkspaceObjectSearchSummary.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this WorkspaceObjectSearchSummary.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this WorkspaceObjectSearchSummary.
        :type updated_by_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'type': 'str',
            'workspace_key': 'str',
            'path': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'type': 'type',
            'workspace_key': 'workspaceKey',
            'path': 'path',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._type = None
        self._workspace_key = None
        self._path = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this WorkspaceObjectSearchSummary.
        The key of the object


        :return: The key of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this WorkspaceObjectSearchSummary.
        The key of the object


        :param key: The key of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this WorkspaceObjectSearchSummary.
        A user-friendly name.


        :return: The display_name of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this WorkspaceObjectSearchSummary.
        A user-friendly name.


        :param display_name: The display_name of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this WorkspaceObjectSearchSummary.
        Description of the object


        :return: The description of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this WorkspaceObjectSearchSummary.
        Description of the object


        :param description: The description of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this WorkspaceObjectSearchSummary.
        The type of the Workspace Object


        :return: The type of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this WorkspaceObjectSearchSummary.
        The type of the Workspace Object


        :param type: The type of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._type = type

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this WorkspaceObjectSearchSummary.
        Key of the workspace.


        :return: The workspace_key of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this WorkspaceObjectSearchSummary.
        Key of the workspace.


        :param workspace_key: The workspace_key of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def path(self):
        """
        Gets the path of this WorkspaceObjectSearchSummary.
        Path of workspace object.


        :return: The path of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this WorkspaceObjectSearchSummary.
        Path of workspace object.


        :param path: The path of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._path = path

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this WorkspaceObjectSearchSummary.
        The date and time when the object was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_created of this WorkspaceObjectSearchSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this WorkspaceObjectSearchSummary.
        The date and time when the object was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_created: The time_created of this WorkspaceObjectSearchSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this WorkspaceObjectSearchSummary.
        The date and time when the object was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_updated of this WorkspaceObjectSearchSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this WorkspaceObjectSearchSummary.
        The date and time when the object was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_updated: The time_updated of this WorkspaceObjectSearchSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this WorkspaceObjectSearchSummary.
        OCID of the user who created this record


        :return: The created_by of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this WorkspaceObjectSearchSummary.
        OCID of the user who created this record


        :param created_by: The created_by of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this WorkspaceObjectSearchSummary.
        Name of the user who created this record


        :return: The created_by_name of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this WorkspaceObjectSearchSummary.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this WorkspaceObjectSearchSummary.
        OCID of the user who updated this record


        :return: The updated_by of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this WorkspaceObjectSearchSummary.
        OCID of the user who updated this record


        :param updated_by: The updated_by of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this WorkspaceObjectSearchSummary.
        Name of the user who updated this record


        :return: The updated_by_name of this WorkspaceObjectSearchSummary.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this WorkspaceObjectSearchSummary.
        Name of the user who updated this record


        :param updated_by_name: The updated_by_name of this WorkspaceObjectSearchSummary.
        :type: str
        """
        self._updated_by_name = updated_by_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
