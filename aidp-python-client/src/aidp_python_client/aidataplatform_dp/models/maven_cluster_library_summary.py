# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_library_summary import ClusterLibrarySummary
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MavenClusterLibrarySummary(ClusterLibrarySummary):
    """
    Details of a Maven module installed as a library on a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MavenClusterLibrarySummary object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.MavenClusterLibrarySummary.type` attribute
        of this class is ``MAVEN`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this MavenClusterLibrarySummary.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this MavenClusterLibrarySummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this MavenClusterLibrarySummary.
        :type time_updated: datetime

        :param installed_by:
            The value to assign to the installed_by property of this MavenClusterLibrarySummary.
        :type installed_by: str

        :param installed_by_name:
            The value to assign to the installed_by_name property of this MavenClusterLibrarySummary.
        :type installed_by_name: str

        :param state_message:
            The value to assign to the state_message property of this MavenClusterLibrarySummary.
        :type state_message: str

        :param status:
            The value to assign to the status property of this MavenClusterLibrarySummary.
            Allowed values for this property are: "PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED"
        :type status: str

        :param coordinate:
            The value to assign to the coordinate property of this MavenClusterLibrarySummary.
        :type coordinate: str

        :param repository:
            The value to assign to the repository property of this MavenClusterLibrarySummary.
        :type repository: str

        :param exclusions:
            The value to assign to the exclusions property of this MavenClusterLibrarySummary.
        :type exclusions: list[str]

        """
        self.swagger_types = {
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'installed_by': 'str',
            'installed_by_name': 'str',
            'state_message': 'str',
            'status': 'str',
            'coordinate': 'str',
            'repository': 'str',
            'exclusions': 'list[str]'
        }

        self.attribute_map = {
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'installed_by': 'installedBy',
            'installed_by_name': 'installedByName',
            'state_message': 'stateMessage',
            'status': 'status',
            'coordinate': 'coordinate',
            'repository': 'repository',
            'exclusions': 'exclusions'
        }

        self._type = None
        self._time_created = None
        self._time_updated = None
        self._installed_by = None
        self._installed_by_name = None
        self._state_message = None
        self._status = None
        self._coordinate = None
        self._repository = None
        self._exclusions = None
        self._type = 'MAVEN'

    @property
    def coordinate(self):
        """
        Gets the coordinate of this MavenClusterLibrarySummary.
        Maven coordinate in `groupId:artifactId:version` format.


        :return: The coordinate of this MavenClusterLibrarySummary.
        :rtype: str
        """
        return self._coordinate

    @coordinate.setter
    def coordinate(self, coordinate):
        """
        Sets the coordinate of this MavenClusterLibrarySummary.
        Maven coordinate in `groupId:artifactId:version` format.


        :param coordinate: The coordinate of this MavenClusterLibrarySummary.
        :type: str
        """
        self._coordinate = coordinate

    @property
    def repository(self):
        """
        Gets the repository of this MavenClusterLibrarySummary.
        Optional Maven repository name or URL used to resolve the module.


        :return: The repository of this MavenClusterLibrarySummary.
        :rtype: str
        """
        return self._repository

    @repository.setter
    def repository(self, repository):
        """
        Sets the repository of this MavenClusterLibrarySummary.
        Optional Maven repository name or URL used to resolve the module.


        :param repository: The repository of this MavenClusterLibrarySummary.
        :type: str
        """
        self._repository = repository

    @property
    def exclusions(self):
        """
        Gets the exclusions of this MavenClusterLibrarySummary.
        Optional Maven dependency exclusions.


        :return: The exclusions of this MavenClusterLibrarySummary.
        :rtype: list[str]
        """
        return self._exclusions

    @exclusions.setter
    def exclusions(self, exclusions):
        """
        Sets the exclusions of this MavenClusterLibrarySummary.
        Optional Maven dependency exclusions.


        :param exclusions: The exclusions of this MavenClusterLibrarySummary.
        :type: list[str]
        """
        self._exclusions = exclusions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
