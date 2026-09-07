# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_library_summary import ClusterLibrarySummary
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PypiClusterLibrarySummary(ClusterLibrarySummary):
    """
    Details of a PyPI package installed as a library on a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PypiClusterLibrarySummary object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.PypiClusterLibrarySummary.type` attribute
        of this class is ``PYPI`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this PypiClusterLibrarySummary.
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this PypiClusterLibrarySummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this PypiClusterLibrarySummary.
        :type time_updated: datetime

        :param installed_by:
            The value to assign to the installed_by property of this PypiClusterLibrarySummary.
        :type installed_by: str

        :param installed_by_name:
            The value to assign to the installed_by_name property of this PypiClusterLibrarySummary.
        :type installed_by_name: str

        :param state_message:
            The value to assign to the state_message property of this PypiClusterLibrarySummary.
        :type state_message: str

        :param status:
            The value to assign to the status property of this PypiClusterLibrarySummary.
            Allowed values for this property are: "PENDING", "RESOLVING", "INSTALLING", "INSTALLED", "FAILED", "INSTALL_ON_RESTART", "UNINSTALL_ON_RESTART", "SKIPPED", "DELETED"
        :type status: str

        :param python_package:
            The value to assign to the python_package property of this PypiClusterLibrarySummary.
        :type python_package: str

        :param pip_index_url:
            The value to assign to the pip_index_url property of this PypiClusterLibrarySummary.
        :type pip_index_url: str

        """
        self.swagger_types = {
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'installed_by': 'str',
            'installed_by_name': 'str',
            'state_message': 'str',
            'status': 'str',
            'python_package': 'str',
            'pip_index_url': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'installed_by': 'installedBy',
            'installed_by_name': 'installedByName',
            'state_message': 'stateMessage',
            'status': 'status',
            'python_package': 'pythonPackage',
            'pip_index_url': 'pipIndexUrl'
        }

        self._type = None
        self._time_created = None
        self._time_updated = None
        self._installed_by = None
        self._installed_by_name = None
        self._state_message = None
        self._status = None
        self._python_package = None
        self._pip_index_url = None
        self._type = 'PYPI'

    @property
    def python_package(self):
        """
        Gets the python_package of this PypiClusterLibrarySummary.
        PyPI package specifier, for example `requests==2.31.0`.


        :return: The python_package of this PypiClusterLibrarySummary.
        :rtype: str
        """
        return self._python_package

    @python_package.setter
    def python_package(self, python_package):
        """
        Sets the python_package of this PypiClusterLibrarySummary.
        PyPI package specifier, for example `requests==2.31.0`.


        :param python_package: The python_package of this PypiClusterLibrarySummary.
        :type: str
        """
        self._python_package = python_package

    @property
    def pip_index_url(self):
        """
        Gets the pip_index_url of this PypiClusterLibrarySummary.
        Optional pip index URL used to resolve the package, for example `https://pypi.org/simple`.


        :return: The pip_index_url of this PypiClusterLibrarySummary.
        :rtype: str
        """
        return self._pip_index_url

    @pip_index_url.setter
    def pip_index_url(self, pip_index_url):
        """
        Sets the pip_index_url of this PypiClusterLibrarySummary.
        Optional pip index URL used to resolve the package, for example `https://pypi.org/simple`.


        :param pip_index_url: The pip_index_url of this PypiClusterLibrarySummary.
        :type: str
        """
        self._pip_index_url = pip_index_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
