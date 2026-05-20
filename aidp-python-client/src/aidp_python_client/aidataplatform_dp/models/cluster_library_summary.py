# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterLibrarySummary(object):
    """
    Summary information about a cluster library.
    """

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "PENDING"
    STATUS_PENDING = "PENDING"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "RESOLVING"
    STATUS_RESOLVING = "RESOLVING"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "INSTALLING"
    STATUS_INSTALLING = "INSTALLING"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "INSTALLED"
    STATUS_INSTALLED = "INSTALLED"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "INSTALL_ON_RESTART"
    STATUS_INSTALL_ON_RESTART = "INSTALL_ON_RESTART"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "UNINSTALL_ON_RESTART"
    STATUS_UNINSTALL_ON_RESTART = "UNINSTALL_ON_RESTART"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "SKIPPED"
    STATUS_SKIPPED = "SKIPPED"

    #: A constant which can be used with the status property of a ClusterLibrarySummary.
    #: This constant has a value of "DELETED"
    STATUS_DELETED = "DELETED"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterLibrarySummary object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.WorkspaceFileClusterLibrarySummary`
        * :class:`~oci.aidataplatform_dp.models.VolumeFileClusterLibrarySummary`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClusterLibrarySummary.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this ClusterLibrarySummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ClusterLibrarySummary.
        :type time_updated: datetime

        :param state_message:
            The value to assign to the state_message property of this ClusterLibrarySummary.
        :type state_message: str

        :param status:
            The value to assign to the status property of this ClusterLibrarySummary.
            Allowed values for this property are: "PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        """
        self.swagger_types = {
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'state_message': 'str',
            'status': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'state_message': 'stateMessage',
            'status': 'status'
        }

        self._type = None
        self._time_created = None
        self._time_updated = None
        self._state_message = None
        self._status = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'WORKSPACE_FILE':
            return 'WorkspaceFileClusterLibrarySummary'

        if type == 'VOLUME_FILE':
            return 'VolumeFileClusterLibrarySummary'
        else:
            return 'ClusterLibrarySummary'

    @property
    def type(self):
        """
        Gets the type of this ClusterLibrarySummary.
        Library type.


        :return: The type of this ClusterLibrarySummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ClusterLibrarySummary.
        Library type.


        :param type: The type of this ClusterLibrarySummary.
        :type: str
        """
        self._type = type

    @property
    def time_created(self):
        """
        Gets the time_created of this ClusterLibrarySummary.
        Date and time the library was installed.


        :return: The time_created of this ClusterLibrarySummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ClusterLibrarySummary.
        Date and time the library was installed.


        :param time_created: The time_created of this ClusterLibrarySummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ClusterLibrarySummary.
        Date and time the library was updated.


        :return: The time_updated of this ClusterLibrarySummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ClusterLibrarySummary.
        Date and time the library was updated.


        :param time_updated: The time_updated of this ClusterLibrarySummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def state_message(self):
        """
        Gets the state_message of this ClusterLibrarySummary.
        Additional context or detail about the current state of the library, especially useful when the status is `FAILED`, `SKIPPED`, or requires user intervention.
        This message can contain information such as the reason for failure, the step where the installation failed, or other diagnostic messages.


        :return: The state_message of this ClusterLibrarySummary.
        :rtype: str
        """
        return self._state_message

    @state_message.setter
    def state_message(self, state_message):
        """
        Sets the state_message of this ClusterLibrarySummary.
        Additional context or detail about the current state of the library, especially useful when the status is `FAILED`, `SKIPPED`, or requires user intervention.
        This message can contain information such as the reason for failure, the step where the installation failed, or other diagnostic messages.


        :param state_message: The state_message of this ClusterLibrarySummary.
        :type: str
        """
        self._state_message = state_message

    @property
    def status(self):
        """
        Gets the status of this ClusterLibrarySummary.
        Status of the library installed on the cluster.

        Allowed values for this property are: "PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this ClusterLibrarySummary.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ClusterLibrarySummary.
        Status of the library installed on the cluster.


        :param status: The status of this ClusterLibrarySummary.
        :type: str
        """
        allowed_values = ["PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
