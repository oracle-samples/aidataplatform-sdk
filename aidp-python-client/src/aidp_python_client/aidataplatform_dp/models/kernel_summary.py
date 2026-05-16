# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KernelSummary(object):
    """
    Kernel summary
    """

    def __init__(self, **kwargs):
        """
        Initializes a new KernelSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this KernelSummary.
        :type id: str

        :param name:
            The value to assign to the name property of this KernelSummary.
        :type name: str

        :param last_activity:
            The value to assign to the last_activity property of this KernelSummary.
        :type last_activity: str

        :param connections:
            The value to assign to the connections property of this KernelSummary.
        :type connections: int

        :param execution_state:
            The value to assign to the execution_state property of this KernelSummary.
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
        Gets the id of this KernelSummary.
        UUID of the kernel.


        :return: The id of this KernelSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this KernelSummary.
        UUID of the kernel.


        :param id: The id of this KernelSummary.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this KernelSummary.
        Kernel spec name.


        :return: The name of this KernelSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this KernelSummary.
        Kernel spec name.


        :param name: The name of this KernelSummary.
        :type: str
        """
        self._name = name

    @property
    def last_activity(self):
        """
        Gets the last_activity of this KernelSummary.
        ISO 8601 timestamp for the last-seen activity on this kernel.
        Use this in combination with execution_state == 'idle' to identify
        which kernels have been idle since a given time.
        Timestamps will be UTC, indicated 'Z' suffix.
        Added in notebook server 5.0.


        :return: The last_activity of this KernelSummary.
        :rtype: str
        """
        return self._last_activity

    @last_activity.setter
    def last_activity(self, last_activity):
        """
        Sets the last_activity of this KernelSummary.
        ISO 8601 timestamp for the last-seen activity on this kernel.
        Use this in combination with execution_state == 'idle' to identify
        which kernels have been idle since a given time.
        Timestamps will be UTC, indicated 'Z' suffix.
        Added in notebook server 5.0.


        :param last_activity: The last_activity of this KernelSummary.
        :type: str
        """
        self._last_activity = last_activity

    @property
    def connections(self):
        """
        Gets the connections of this KernelSummary.
        The number of active connections to this kernel.


        :return: The connections of this KernelSummary.
        :rtype: int
        """
        return self._connections

    @connections.setter
    def connections(self, connections):
        """
        Sets the connections of this KernelSummary.
        The number of active connections to this kernel.


        :param connections: The connections of this KernelSummary.
        :type: int
        """
        self._connections = connections

    @property
    def execution_state(self):
        """
        Gets the execution_state of this KernelSummary.
        Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.


        :return: The execution_state of this KernelSummary.
        :rtype: str
        """
        return self._execution_state

    @execution_state.setter
    def execution_state(self, execution_state):
        """
        Sets the execution_state of this KernelSummary.
        Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.


        :param execution_state: The execution_state of this KernelSummary.
        :type: str
        """
        self._execution_state = execution_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
