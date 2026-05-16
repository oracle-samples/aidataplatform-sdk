# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Role(object):
    """
    Role details.
    """

    #: A constant which can be used with the role_type property of a Role.
    #: This constant has a value of "SYSTEM"
    ROLE_TYPE_SYSTEM = "SYSTEM"

    #: A constant which can be used with the role_type property of a Role.
    #: This constant has a value of "CUSTOM"
    ROLE_TYPE_CUSTOM = "CUSTOM"

    #: A constant which can be used with the lifecycle_state property of a Role.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new Role object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Role.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Role.
        :type display_name: str

        :param role_type:
            The value to assign to the role_type property of this Role.
            Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type role_type: str

        :param time_created:
            The value to assign to the time_created property of this Role.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Role.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Role.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Role.
        :type updated_by: str

        :param is_assigned:
            The value to assign to the is_assigned property of this Role.
        :type is_assigned: bool

        :param assignees:
            The value to assign to the assignees property of this Role.
        :type assignees: list[oci.aidataplatform_dp.models.RoleAssignee]

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Role.
            Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this Role.
        :type lifecycle_details: str

        :param description:
            The value to assign to the description property of this Role.
        :type description: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'role_type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'is_assigned': 'bool',
            'assignees': 'list[RoleAssignee]',
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
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'is_assigned': 'isAssigned',
            'assignees': 'assignees',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'description': 'description'
        }

        self._key = None
        self._display_name = None
        self._role_type = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._is_assigned = None
        self._assignees = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._description = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Role.
        A unique key for the role. It cannot be changed.


        :return: The key of this Role.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Role.
        A unique key for the role. It cannot be changed.


        :param key: The key of this Role.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this Role.
        The role name. It can be changed.


        :return: The display_name of this Role.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Role.
        The role name. It can be changed.


        :param display_name: The display_name of this Role.
        :type: str
        """
        self._display_name = display_name

    @property
    def role_type(self):
        """
        Gets the role_type of this Role.
        Type of role.

        Allowed values for this property are: "SYSTEM", "CUSTOM", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The role_type of this Role.
        :rtype: str
        """
        return self._role_type

    @role_type.setter
    def role_type(self, role_type):
        """
        Sets the role_type of this Role.
        Type of role.


        :param role_type: The role_type of this Role.
        :type: str
        """
        allowed_values = ["SYSTEM", "CUSTOM"]
        if not value_allowed_none_or_none_sentinel(role_type, allowed_values):
            role_type = 'UNKNOWN_ENUM_VALUE'
        self._role_type = role_type

    @property
    def time_created(self):
        """
        Gets the time_created of this Role.
        The time the role was created. An RFC3339 formatted datetime string.


        :return: The time_created of this Role.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Role.
        The time the role was created. An RFC3339 formatted datetime string.


        :param time_created: The time_created of this Role.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Role.
        The time the Role was updated. An RFC3339 formatted datetime string.


        :return: The time_updated of this Role.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Role.
        The time the Role was updated. An RFC3339 formatted datetime string.


        :param time_updated: The time_updated of this Role.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Role.
        The user name of the user/principal who created the role.


        :return: The created_by of this Role.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Role.
        The user name of the user/principal who created the role.


        :param created_by: The created_by of this Role.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Role.
        The user name of the user/principal who updated the role.


        :return: The updated_by of this Role.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Role.
        The user name of the user/principal who updated the role.


        :param updated_by: The updated_by of this Role.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def is_assigned(self):
        """
        Gets the is_assigned of this Role.
        The role is assigned to the current user or a group that the user is part of.


        :return: The is_assigned of this Role.
        :rtype: bool
        """
        return self._is_assigned

    @is_assigned.setter
    def is_assigned(self, is_assigned):
        """
        Sets the is_assigned of this Role.
        The role is assigned to the current user or a group that the user is part of.


        :param is_assigned: The is_assigned of this Role.
        :type: bool
        """
        self._is_assigned = is_assigned

    @property
    def assignees(self):
        """
        Gets the assignees of this Role.
        The users and groups this role is assigned to.


        :return: The assignees of this Role.
        :rtype: list[oci.aidataplatform_dp.models.RoleAssignee]
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this Role.
        The users and groups this role is assigned to.


        :param assignees: The assignees of this Role.
        :type: list[oci.aidataplatform_dp.models.RoleAssignee]
        """
        self._assignees = assignees

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Role.
        The state of the role.

        Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Role.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Role.
        The state of the role.


        :param lifecycle_state: The lifecycle_state of this Role.
        :type: str
        """
        allowed_values = ["ACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this Role.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_details of this Role.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this Role.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_details: The lifecycle_details of this Role.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def description(self):
        """
        Gets the description of this Role.
        The description of the role.


        :return: The description of this Role.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Role.
        The description of the role.


        :param description: The description of this Role.
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
