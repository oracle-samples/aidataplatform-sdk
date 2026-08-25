# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_library_summary import ClusterLibrarySummary
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class VolumeFileClusterLibrarySummary(ClusterLibrarySummary):
    """
    Details of a volume file installed as a library on a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new VolumeFileClusterLibrarySummary object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.VolumeFileClusterLibrarySummary.type` attribute
        of this class is ``VOLUME_FILE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this VolumeFileClusterLibrarySummary.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this VolumeFileClusterLibrarySummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this VolumeFileClusterLibrarySummary.
        :type time_updated: datetime

        :param installed_by:
            The value to assign to the installed_by property of this VolumeFileClusterLibrarySummary.
        :type installed_by: str

        :param installed_by_name:
            The value to assign to the installed_by_name property of this VolumeFileClusterLibrarySummary.
        :type installed_by_name: str

        :param state_message:
            The value to assign to the state_message property of this VolumeFileClusterLibrarySummary.
        :type state_message: str

        :param status:
            The value to assign to the status property of this VolumeFileClusterLibrarySummary.
            Allowed values for this property are: "PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED"
        :type status: str

        :param name:
            The value to assign to the name property of this VolumeFileClusterLibrarySummary.
        :type name: str

        :param path:
            The value to assign to the path property of this VolumeFileClusterLibrarySummary.
        :type path: str

        """
        self.swagger_types = {
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'installed_by': 'str',
            'installed_by_name': 'str',
            'state_message': 'str',
            'status': 'str',
            'name': 'str',
            'path': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'installed_by': 'installedBy',
            'installed_by_name': 'installedByName',
            'state_message': 'stateMessage',
            'status': 'status',
            'name': 'name',
            'path': 'path'
        }

        self._type = None
        self._time_created = None
        self._time_updated = None
        self._installed_by = None
        self._installed_by_name = None
        self._state_message = None
        self._status = None
        self._name = None
        self._path = None
        self._type = 'VOLUME_FILE'

    @property
    def name(self):
        """
        Gets the name of this VolumeFileClusterLibrarySummary.
        Library name.


        :return: The name of this VolumeFileClusterLibrarySummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this VolumeFileClusterLibrarySummary.
        Library name.


        :param name: The name of this VolumeFileClusterLibrarySummary.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this VolumeFileClusterLibrarySummary.
        Full path of the library.


        :return: The path of this VolumeFileClusterLibrarySummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this VolumeFileClusterLibrarySummary.
        Full path of the library.


        :param path: The path of this VolumeFileClusterLibrarySummary.
        :type: str
        """
        self._path = path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
