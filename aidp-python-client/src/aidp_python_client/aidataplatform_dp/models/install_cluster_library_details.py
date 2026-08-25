# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_library_details import ClusterLibraryDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InstallClusterLibraryDetails(ClusterLibraryDetails):
    """
    Details required to install a library on a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InstallClusterLibraryDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.InstallClusterLibraryDetails.operation` attribute
        of this class is ``INSTALL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param operation:
            The value to assign to the operation property of this InstallClusterLibraryDetails.
            Allowed values for this property are: "INSTALL", "UNINSTALL"
        :type operation: str

        :param type:
            The value to assign to the type property of this InstallClusterLibraryDetails.
            Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE", "PYPI", "MAVEN"
        :type type: str

        :param path:
            The value to assign to the path property of this InstallClusterLibraryDetails.
        :type path: str

        :param python_package:
            The value to assign to the python_package property of this InstallClusterLibraryDetails.
        :type python_package: str

        :param pip_index_url:
            The value to assign to the pip_index_url property of this InstallClusterLibraryDetails.
        :type pip_index_url: str

        :param coordinate:
            The value to assign to the coordinate property of this InstallClusterLibraryDetails.
        :type coordinate: str

        :param repository:
            The value to assign to the repository property of this InstallClusterLibraryDetails.
        :type repository: str

        :param exclusions:
            The value to assign to the exclusions property of this InstallClusterLibraryDetails.
        :type exclusions: list[str]

        """
        self.swagger_types = {
            'operation': 'str',
            'type': 'str',
            'path': 'str',
            'python_package': 'str',
            'pip_index_url': 'str',
            'coordinate': 'str',
            'repository': 'str',
            'exclusions': 'list[str]'
        }

        self.attribute_map = {
            'operation': 'operation',
            'type': 'type',
            'path': 'path',
            'python_package': 'pythonPackage',
            'pip_index_url': 'pipIndexUrl',
            'coordinate': 'coordinate',
            'repository': 'repository',
            'exclusions': 'exclusions'
        }

        self._operation = None
        self._type = None
        self._path = None
        self._python_package = None
        self._pip_index_url = None
        self._coordinate = None
        self._repository = None
        self._exclusions = None
        self._operation = 'INSTALL'

    @property
    def path(self):
        """
        Gets the path of this InstallClusterLibraryDetails.
        File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt


        :return: The path of this InstallClusterLibraryDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this InstallClusterLibraryDetails.
        File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt


        :param path: The path of this InstallClusterLibraryDetails.
        :type: str
        """
        self._path = path

    @property
    def python_package(self):
        """
        Gets the python_package of this InstallClusterLibraryDetails.
        PyPI package specifier to install. Example - `requests==2.31.0`.


        :return: The python_package of this InstallClusterLibraryDetails.
        :rtype: str
        """
        return self._python_package

    @python_package.setter
    def python_package(self, python_package):
        """
        Sets the python_package of this InstallClusterLibraryDetails.
        PyPI package specifier to install. Example - `requests==2.31.0`.


        :param python_package: The python_package of this InstallClusterLibraryDetails.
        :type: str
        """
        self._python_package = python_package

    @property
    def pip_index_url(self):
        """
        Gets the pip_index_url of this InstallClusterLibraryDetails.
        Optional pip index URL used to resolve a PyPI package. Example - `https://pypi.org/simple`.


        :return: The pip_index_url of this InstallClusterLibraryDetails.
        :rtype: str
        """
        return self._pip_index_url

    @pip_index_url.setter
    def pip_index_url(self, pip_index_url):
        """
        Sets the pip_index_url of this InstallClusterLibraryDetails.
        Optional pip index URL used to resolve a PyPI package. Example - `https://pypi.org/simple`.


        :param pip_index_url: The pip_index_url of this InstallClusterLibraryDetails.
        :type: str
        """
        self._pip_index_url = pip_index_url

    @property
    def coordinate(self):
        """
        Gets the coordinate of this InstallClusterLibraryDetails.
        Maven coordinate in `groupId:artifactId:version` format.


        :return: The coordinate of this InstallClusterLibraryDetails.
        :rtype: str
        """
        return self._coordinate

    @coordinate.setter
    def coordinate(self, coordinate):
        """
        Sets the coordinate of this InstallClusterLibraryDetails.
        Maven coordinate in `groupId:artifactId:version` format.


        :param coordinate: The coordinate of this InstallClusterLibraryDetails.
        :type: str
        """
        self._coordinate = coordinate

    @property
    def repository(self):
        """
        Gets the repository of this InstallClusterLibraryDetails.
        Optional Maven repository name or URL used to resolve the module.


        :return: The repository of this InstallClusterLibraryDetails.
        :rtype: str
        """
        return self._repository

    @repository.setter
    def repository(self, repository):
        """
        Sets the repository of this InstallClusterLibraryDetails.
        Optional Maven repository name or URL used to resolve the module.


        :param repository: The repository of this InstallClusterLibraryDetails.
        :type: str
        """
        self._repository = repository

    @property
    def exclusions(self):
        """
        Gets the exclusions of this InstallClusterLibraryDetails.
        Optional Maven dependency exclusions.


        :return: The exclusions of this InstallClusterLibraryDetails.
        :rtype: list[str]
        """
        return self._exclusions

    @exclusions.setter
    def exclusions(self, exclusions):
        """
        Sets the exclusions of this InstallClusterLibraryDetails.
        Optional Maven dependency exclusions.


        :param exclusions: The exclusions of this InstallClusterLibraryDetails.
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
