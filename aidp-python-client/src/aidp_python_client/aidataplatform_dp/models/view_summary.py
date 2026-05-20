# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ViewSummary(object):
    """
    Summary information of view in the schema.
    """

    #: A constant which can be used with the lifecycle_state property of a ViewSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new ViewSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ViewSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ViewSummary.
        :type display_name: str

        :param is_temporary:
            The value to assign to the is_temporary property of this ViewSummary.
        :type is_temporary: bool

        :param time_created:
            The value to assign to the time_created property of this ViewSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ViewSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this ViewSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this ViewSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this ViewSummary.
            Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'is_temporary': 'bool',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'is_temporary': 'isTemporary',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState'
        }

        self._key = None
        self._display_name = None
        self._is_temporary = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None

    @property
    def key(self):
        """
        Gets the key of this ViewSummary.
        The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>


        :return: The key of this ViewSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ViewSummary.
        The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>


        :param key: The key of this ViewSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this ViewSummary.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :return: The display_name of this ViewSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ViewSummary.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :param display_name: The display_name of this ViewSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def is_temporary(self):
        """
        Gets the is_temporary of this ViewSummary.
        Denotes whether the view is temporary or permanent.


        :return: The is_temporary of this ViewSummary.
        :rtype: bool
        """
        return self._is_temporary

    @is_temporary.setter
    def is_temporary(self, is_temporary):
        """
        Sets the is_temporary of this ViewSummary.
        Denotes whether the view is temporary or permanent.


        :param is_temporary: The is_temporary of this ViewSummary.
        :type: bool
        """
        self._is_temporary = is_temporary

    @property
    def time_created(self):
        """
        Gets the time_created of this ViewSummary.
        The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this ViewSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ViewSummary.
        The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this ViewSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ViewSummary.
        The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this ViewSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ViewSummary.
        The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this ViewSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this ViewSummary.
        The ID of the user/principal who created the view.


        :return: The created_by of this ViewSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ViewSummary.
        The ID of the user/principal who created the view.


        :param created_by: The created_by of this ViewSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this ViewSummary.
        The ID of the user who last updated the view.


        :return: The updated_by of this ViewSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ViewSummary.
        The ID of the user who last updated the view.


        :param updated_by: The updated_by of this ViewSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this ViewSummary.
        The state of the Table.

        Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this ViewSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this ViewSummary.
        The state of the Table.


        :param lifecycle_state: The lifecycle_state of this ViewSummary.
        :type: str
        """
        allowed_values = ["ACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
