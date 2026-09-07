# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_library_details import ClusterLibraryDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UninstallClusterLibraryDetails(ClusterLibraryDetails):
    """
    Details required to uninstall a library from a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UninstallClusterLibraryDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.UninstallClusterLibraryDetails.operation` attribute
        of this class is ``UNINSTALL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param operation:
            The value to assign to the operation property of this UninstallClusterLibraryDetails.
            Allowed values for this property are: "INSTALL", "UNINSTALL"
        :type operation: str

        :param type:
            The value to assign to the type property of this UninstallClusterLibraryDetails.
            Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE", "PYPI", "MAVEN"
        :type type: str

        :param name:
            The value to assign to the name property of this UninstallClusterLibraryDetails.
        :type name: str

        :param python_package:
            The value to assign to the python_package property of this UninstallClusterLibraryDetails.
        :type python_package: str

        :param pip_index_url:
            The value to assign to the pip_index_url property of this UninstallClusterLibraryDetails.
        :type pip_index_url: str

        :param coordinate:
            The value to assign to the coordinate property of this UninstallClusterLibraryDetails.
        :type coordinate: str

        :param repository:
            The value to assign to the repository property of this UninstallClusterLibraryDetails.
        :type repository: str

        :param exclusions:
            The value to assign to the exclusions property of this UninstallClusterLibraryDetails.
        :type exclusions: list[str]

        """
        self.swagger_types = {
            'operation': 'str',
            'type': 'str',
            'name': 'str',
            'python_package': 'str',
            'pip_index_url': 'str',
            'coordinate': 'str',
            'repository': 'str',
            'exclusions': 'list[str]'
        }

        self.attribute_map = {
            'operation': 'operation',
            'type': 'type',
            'name': 'name',
            'python_package': 'pythonPackage',
            'pip_index_url': 'pipIndexUrl',
            'coordinate': 'coordinate',
            'repository': 'repository',
            'exclusions': 'exclusions'
        }

        self._operation = None
        self._type = None
        self._name = None
        self._python_package = None
        self._pip_index_url = None
        self._coordinate = None
        self._repository = None
        self._exclusions = None
        self._operation = 'UNINSTALL'

    @property
    def name(self):
        """
        Gets the name of this UninstallClusterLibraryDetails.
        Name of the workspace or volume file library to uninstall.


        :return: The name of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UninstallClusterLibraryDetails.
        Name of the workspace or volume file library to uninstall.


        :param name: The name of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._name = name

    @property
    def python_package(self):
        """
        Gets the python_package of this UninstallClusterLibraryDetails.
        PyPI package specifier to uninstall. Example - `requests==2.31.0`.


        :return: The python_package of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._python_package

    @python_package.setter
    def python_package(self, python_package):
        """
        Sets the python_package of this UninstallClusterLibraryDetails.
        PyPI package specifier to uninstall. Example - `requests==2.31.0`.


        :param python_package: The python_package of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._python_package = python_package

    @property
    def pip_index_url(self):
        """
        Gets the pip_index_url of this UninstallClusterLibraryDetails.
        Optional pip index URL associated with the PyPI package. Example - `https://pypi.org/simple`.


        :return: The pip_index_url of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._pip_index_url

    @pip_index_url.setter
    def pip_index_url(self, pip_index_url):
        """
        Sets the pip_index_url of this UninstallClusterLibraryDetails.
        Optional pip index URL associated with the PyPI package. Example - `https://pypi.org/simple`.


        :param pip_index_url: The pip_index_url of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._pip_index_url = pip_index_url

    @property
    def coordinate(self):
        """
        Gets the coordinate of this UninstallClusterLibraryDetails.
        Maven coordinate in `groupId:artifactId:version` format.


        :return: The coordinate of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._coordinate

    @coordinate.setter
    def coordinate(self, coordinate):
        """
        Sets the coordinate of this UninstallClusterLibraryDetails.
        Maven coordinate in `groupId:artifactId:version` format.


        :param coordinate: The coordinate of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._coordinate = coordinate

    @property
    def repository(self):
        """
        Gets the repository of this UninstallClusterLibraryDetails.
        Optional Maven repository name or URL associated with the module.


        :return: The repository of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._repository

    @repository.setter
    def repository(self, repository):
        """
        Sets the repository of this UninstallClusterLibraryDetails.
        Optional Maven repository name or URL associated with the module.


        :param repository: The repository of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._repository = repository

    @property
    def exclusions(self):
        """
        Gets the exclusions of this UninstallClusterLibraryDetails.
        Optional Maven dependency exclusions.


        :return: The exclusions of this UninstallClusterLibraryDetails.
        :rtype: list[str]
        """
        return self._exclusions

    @exclusions.setter
    def exclusions(self, exclusions):
        """
        Sets the exclusions of this UninstallClusterLibraryDetails.
        Optional Maven dependency exclusions.


        :param exclusions: The exclusions of this UninstallClusterLibraryDetails.
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
