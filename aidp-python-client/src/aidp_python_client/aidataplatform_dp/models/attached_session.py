# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AttachedSession(object):
    """
    Details of attached sessions to a cluster
    """

    #: A constant which can be used with the type property of a AttachedSession.
    #: This constant has a value of "NOTEBOOK"
    TYPE_NOTEBOOK = "NOTEBOOK"

    #: A constant which can be used with the type property of a AttachedSession.
    #: This constant has a value of "FILE"
    TYPE_FILE = "FILE"

    #: A constant which can be used with the state property of a AttachedSession.
    #: This constant has a value of "ACTIVE"
    STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the state property of a AttachedSession.
    #: This constant has a value of "IDLE"
    STATE_IDLE = "IDLE"

    def __init__(self, **kwargs):
        """
        Initializes a new AttachedSession object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AttachedSession.
            Allowed values for this property are: "NOTEBOOK", "FILE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param path:
            The value to assign to the path property of this AttachedSession.
        :type path: str

        :param state:
            The value to assign to the state property of this AttachedSession.
            Allowed values for this property are: "ACTIVE", "IDLE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param last_command_run:
            The value to assign to the last_command_run property of this AttachedSession.
        :type last_command_run: str

        """
        self.swagger_types = {
            'type': 'str',
            'path': 'str',
            'state': 'str',
            'last_command_run': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'path': 'path',
            'state': 'state',
            'last_command_run': 'lastCommandRun'
        }

        self._type = None
        self._path = None
        self._state = None
        self._last_command_run = None

    @property
    def type(self):
        """
        Gets the type of this AttachedSession.
        The type of the attached session.

        Allowed values for this property are: "NOTEBOOK", "FILE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this AttachedSession.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AttachedSession.
        The type of the attached session.


        :param type: The type of this AttachedSession.
        :type: str
        """
        allowed_values = ["NOTEBOOK", "FILE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def path(self):
        """
        Gets the path of this AttachedSession.
        The path of the attached file.


        :return: The path of this AttachedSession.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this AttachedSession.
        The path of the attached file.


        :param path: The path of this AttachedSession.
        :type: str
        """
        self._path = path

    @property
    def state(self):
        """
        Gets the state of this AttachedSession.
        The state of the attached file.

        Allowed values for this property are: "ACTIVE", "IDLE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The state of this AttachedSession.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this AttachedSession.
        The state of the attached file.


        :param state: The state of this AttachedSession.
        :type: str
        """
        allowed_values = ["ACTIVE", "IDLE"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            state = 'UNKNOWN_ENUM_VALUE'
        self._state = state

    @property
    def last_command_run(self):
        """
        Gets the last_command_run of this AttachedSession.
        The time of the last command of file was run in this cluster.


        :return: The last_command_run of this AttachedSession.
        :rtype: str
        """
        return self._last_command_run

    @last_command_run.setter
    def last_command_run(self, last_command_run):
        """
        Sets the last_command_run of this AttachedSession.
        The time of the last command of file was run in this cluster.


        :param last_command_run: The last_command_run of this AttachedSession.
        :type: str
        """
        self._last_command_run = last_command_run

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
