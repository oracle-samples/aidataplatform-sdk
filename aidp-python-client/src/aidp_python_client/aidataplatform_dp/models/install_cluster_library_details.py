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
            Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE"
        :type type: str

        :param path:
            The value to assign to the path property of this InstallClusterLibraryDetails.
        :type path: str

        """
        self.swagger_types = {
            'operation': 'str',
            'type': 'str',
            'path': 'str'
        }

        self.attribute_map = {
            'operation': 'operation',
            'type': 'type',
            'path': 'path'
        }

        self._operation = None
        self._type = None
        self._path = None
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

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
