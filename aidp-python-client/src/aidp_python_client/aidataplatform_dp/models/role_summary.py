# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RoleSummary(object):
    """
    The summary of the role.
    """

    #: A constant which can be used with the role_type property of a RoleSummary.
    #: This constant has a value of "SYSTEM"
    ROLE_TYPE_SYSTEM = "SYSTEM"

    #: A constant which can be used with the role_type property of a RoleSummary.
    #: This constant has a value of "CUSTOM"
    ROLE_TYPE_CUSTOM = "CUSTOM"

    def __init__(self, **kwargs):
        """
        Initializes a new RoleSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this RoleSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this RoleSummary.
        :type display_name: str

        :param role_type:
            The value to assign to the role_type property of this RoleSummary.
            Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type role_type: str

        :param time_created:
            The value to assign to the time_created property of this RoleSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this RoleSummary.
        :type time_updated: datetime

        :param is_assigned:
            The value to assign to the is_assigned property of this RoleSummary.
        :type is_assigned: bool

        :param created_by:
            The value to assign to the created_by property of this RoleSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this RoleSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this RoleSummary.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this RoleSummary.
        :type lifecycle_details: str

        :param description:
            The value to assign to the description property of this RoleSummary.
        :type description: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'role_type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'is_assigned': 'bool',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'role_type': 'roleType',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'is_assigned': 'isAssigned',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'description': 'description'
        }

        self._key = None
        self._display_name = None
        self._role_type = None
        self._time_created = None
        self._time_updated = None
        self._is_assigned = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._description = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this RoleSummary.
        A unique key for the role summary. It cannot be changed.


        :return: The key of this RoleSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this RoleSummary.
        A unique key for the role summary. It cannot be changed.


        :param key: The key of this RoleSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this RoleSummary.
        The role summary name. It can be changed.


        :return: The display_name of this RoleSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this RoleSummary.
        The role summary name. It can be changed.


        :param display_name: The display_name of this RoleSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def role_type(self):
        """
        Gets the role_type of this RoleSummary.
        Type of role.

        Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The role_type of this RoleSummary.
        :rtype: str
        """
        return self._role_type

    @role_type.setter
    def role_type(self, role_type):
        """
        Sets the role_type of this RoleSummary.
        Type of role.


        :param role_type: The role_type of this RoleSummary.
        :type: str
        """
        allowed_values = ["SYSTEM", "CUSTOM"]
        if not value_allowed_none_or_none_sentinel(role_type, allowed_values):
            role_type = 'UNKNOWN_ENUM_VALUE'
        self._role_type = role_type

    @property
    def time_created(self):
        """
        Gets the time_created of this RoleSummary.
        The time the role summary was created. An RFC3339 formatted datetime string.


        :return: The time_created of this RoleSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this RoleSummary.
        The time the role summary was created. An RFC3339 formatted datetime string.


        :param time_created: The time_created of this RoleSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this RoleSummary.
        The time the role summary was updated. An RFC3339 formatted datetime string.


        :return: The time_updated of this RoleSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this RoleSummary.
        The time the role summary was updated. An RFC3339 formatted datetime string.


        :param time_updated: The time_updated of this RoleSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def is_assigned(self):
        """
        Gets the is_assigned of this RoleSummary.
        The role summary is assigned to the current user or a group that the user is part of.


        :return: The is_assigned of this RoleSummary.
        :rtype: bool
        """
        return self._is_assigned

    @is_assigned.setter
    def is_assigned(self, is_assigned):
        """
        Sets the is_assigned of this RoleSummary.
        The role summary is assigned to the current user or a group that the user is part of.


        :param is_assigned: The is_assigned of this RoleSummary.
        :type: bool
        """
        self._is_assigned = is_assigned

    @property
    def created_by(self):
        """
        Gets the created_by of this RoleSummary.
        The user name of the user/principal who created the role.


        :return: The created_by of this RoleSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this RoleSummary.
        The user name of the user/principal who created the role.


        :param created_by: The created_by of this RoleSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this RoleSummary.
        The user name of the user/principal who updated the role.


        :return: The updated_by of this RoleSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this RoleSummary.
        The user name of the user/principal who updated the role.


        :param updated_by: The updated_by of this RoleSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this RoleSummary.
        The current state of the role summary.


        :return: The lifecycle_state of this RoleSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this RoleSummary.
        The current state of the role summary.


        :param lifecycle_state: The lifecycle_state of this RoleSummary.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this RoleSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_details of this RoleSummary.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this RoleSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_details: The lifecycle_details of this RoleSummary.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def description(self):
        """
        Gets the description of this RoleSummary.
        The description of the role summary.


        :return: The description of this RoleSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this RoleSummary.
        The description of the role summary.


        :param description: The description of this RoleSummary.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
