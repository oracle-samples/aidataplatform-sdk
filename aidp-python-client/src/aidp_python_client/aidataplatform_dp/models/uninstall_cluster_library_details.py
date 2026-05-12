# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

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
            Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE"
        :type type: str

        :param name:
            The value to assign to the name property of this UninstallClusterLibraryDetails.
        :type name: str

        """
        self.swagger_types = {
            'operation': 'str',
            'type': 'str',
            'name': 'str'
        }

        self.attribute_map = {
            'operation': 'operation',
            'type': 'type',
            'name': 'name'
        }

        self._operation = None
        self._type = None
        self._name = None
        self._operation = 'UNINSTALL'

    @property
    def name(self):
        """
        Gets the name of this UninstallClusterLibraryDetails.
        Name of the library to uninstall.


        :return: The name of this UninstallClusterLibraryDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UninstallClusterLibraryDetails.
        Name of the library to uninstall.


        :param name: The name of this UninstallClusterLibraryDetails.
        :type: str
        """
        self._name = name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
