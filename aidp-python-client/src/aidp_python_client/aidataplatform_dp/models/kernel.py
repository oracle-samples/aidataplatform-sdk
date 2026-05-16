# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Kernel(object):
    """
    Notebook kernel information.
    """

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "unknown"
    EXECUTION_STATE_UNKNOWN = "unknown"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "starting"
    EXECUTION_STATE_STARTING = "starting"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "idle"
    EXECUTION_STATE_IDLE = "idle"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "busy"
    EXECUTION_STATE_BUSY = "busy"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "terminating"
    EXECUTION_STATE_TERMINATING = "terminating"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "restarting"
    EXECUTION_STATE_RESTARTING = "restarting"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "autorestarting"
    EXECUTION_STATE_AUTORESTARTING = "autorestarting"

    #: A constant which can be used with the execution_state property of a Kernel.
    #: This constant has a value of "dead"
    EXECUTION_STATE_DEAD = "dead"

    def __init__(self, **kwargs):
        """
        Initializes a new Kernel object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this Kernel.
        :type id: str

        :param name:
            The value to assign to the name property of this Kernel.
        :type name: str

        :param last_activity:
            The value to assign to the last_activity property of this Kernel.
        :type last_activity: str

        :param connections:
            The value to assign to the connections property of this Kernel.
        :type connections: int

        :param execution_state:
            The value to assign to the execution_state property of this Kernel.
            Allowed values for this property are: "unknown", "starting", "idle", "busy", "terminating", "restarting", "autorestarting", "dead", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type execution_state: str

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'last_activity': 'str',
            'connections': 'int',
            'execution_state': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'last_activity': 'last_activity',
            'connections': 'connections',
            'execution_state': 'execution_state'
        }

        self._id = None
        self._name = None
        self._last_activity = None
        self._connections = None
        self._execution_state = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this Kernel.
        UUID of kernel.


        :return: The id of this Kernel.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Kernel.
        UUID of kernel.


        :param id: The id of this Kernel.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        Gets the name of this Kernel.
        Kernel spec name. (Example python3)


        :return: The name of this Kernel.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Kernel.
        Kernel spec name. (Example python3)


        :param name: The name of this Kernel.
        :type: str
        """
        self._name = name

    @property
    def last_activity(self):
        """
        Gets the last_activity of this Kernel.
        ISO 8601 timestamp for last-seen activity on this kernel.
        Use this in combination with execution_state == 'idle' to identify
        which kernels have been idle since a given time.
        Timestamps will be UTC, indicated 'Z' suffix.


        :return: The last_activity of this Kernel.
        :rtype: str
        """
        return self._last_activity

    @last_activity.setter
    def last_activity(self, last_activity):
        """
        Sets the last_activity of this Kernel.
        ISO 8601 timestamp for last-seen activity on this kernel.
        Use this in combination with execution_state == 'idle' to identify
        which kernels have been idle since a given time.
        Timestamps will be UTC, indicated 'Z' suffix.


        :param last_activity: The last_activity of this Kernel.
        :type: str
        """
        self._last_activity = last_activity

    @property
    def connections(self):
        """
        Gets the connections of this Kernel.
        The number of active connections to this kernel.


        :return: The connections of this Kernel.
        :rtype: int
        """
        return self._connections

    @connections.setter
    def connections(self, connections):
        """
        Sets the connections of this Kernel.
        The number of active connections to this kernel.


        :param connections: The connections of this Kernel.
        :type: int
        """
        self._connections = connections

    @property
    def execution_state(self):
        """
        Gets the execution_state of this Kernel.
        Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
        Added in notebook server 5.0.

        Allowed values for this property are: "unknown", "starting", "idle", "busy", "terminating", "restarting", "autorestarting", "dead", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The execution_state of this Kernel.
        :rtype: str
        """
        return self._execution_state

    @execution_state.setter
    def execution_state(self, execution_state):
        """
        Sets the execution_state of this Kernel.
        Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
        Added in notebook server 5.0.


        :param execution_state: The execution_state of this Kernel.
        :type: str
        """
        allowed_values = ["unknown", "starting", "idle", "busy", "terminating", "restarting", "autorestarting", "dead"]
        if not value_allowed_none_or_none_sentinel(execution_state, allowed_values):
            execution_state = 'UNKNOWN_ENUM_VALUE'
        self._execution_state = execution_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
