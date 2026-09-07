# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterLibraryDetails(object):
    """
    Information about a cluster library to install or uninstall.
    """

    #: A constant which can be used with the operation property of a ClusterLibraryDetails.
    #: This constant has a value of "INSTALL"
    OPERATION_INSTALL = "INSTALL"

    #: A constant which can be used with the operation property of a ClusterLibraryDetails.
    #: This constant has a value of "UNINSTALL"
    OPERATION_UNINSTALL = "UNINSTALL"

    #: A constant which can be used with the type property of a ClusterLibraryDetails.
    #: This constant has a value of "WORKSPACE_FILE"
    TYPE_WORKSPACE_FILE = "WORKSPACE_FILE"

    #: A constant which can be used with the type property of a ClusterLibraryDetails.
    #: This constant has a value of "VOLUME_FILE"
    TYPE_VOLUME_FILE = "VOLUME_FILE"

    #: A constant which can be used with the type property of a ClusterLibraryDetails.
    #: This constant has a value of "PYPI"
    TYPE_PYPI = "PYPI"

    #: A constant which can be used with the type property of a ClusterLibraryDetails.
    #: This constant has a value of "MAVEN"
    TYPE_MAVEN = "MAVEN"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterLibraryDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.UninstallClusterLibraryDetails`
        * :class:`~oci.aidataplatform_dp.models.InstallClusterLibraryDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param operation:
            The value to assign to the operation property of this ClusterLibraryDetails.
            Allowed values for this property are: "INSTALL", "UNINSTALL"
        :type operation: str

        :param type:
            The value to assign to the type property of this ClusterLibraryDetails.
            Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE", "PYPI", "MAVEN"
        :type type: str

        """
        self.swagger_types = {
            'operation': 'str',
            'type': 'str'
        }

        self.attribute_map = {
            'operation': 'operation',
            'type': 'type'
        }

        self._operation = None
        self._type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['operation']

        if type == 'UNINSTALL':
            return 'UninstallClusterLibraryDetails'

        if type == 'INSTALL':
            return 'InstallClusterLibraryDetails'
        else:
            return 'ClusterLibraryDetails'

    @property
    def operation(self):
        """
        **[Required]** Gets the operation of this ClusterLibraryDetails.
        Operation to perform on this library from the cluster. Install or uninstall.

        Allowed values for this property are: "INSTALL", "UNINSTALL"


        :return: The operation of this ClusterLibraryDetails.
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """
        Sets the operation of this ClusterLibraryDetails.
        Operation to perform on this library from the cluster. Install or uninstall.


        :param operation: The operation of this ClusterLibraryDetails.
        :type: str
        """
        allowed_values = ["INSTALL", "UNINSTALL"]
        if not value_allowed_none_or_none_sentinel(operation, allowed_values):
            raise ValueError(
                "Invalid value for `operation`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._operation = operation

    @property
    def type(self):
        """
        Gets the type of this ClusterLibraryDetails.
        Library type.

        Allowed values for this property are: "WORKSPACE_FILE", "VOLUME_FILE", "PYPI", "MAVEN"


        :return: The type of this ClusterLibraryDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ClusterLibraryDetails.
        Library type.


        :param type: The type of this ClusterLibraryDetails.
        :type: str
        """
        allowed_values = ["WORKSPACE_FILE", "VOLUME_FILE", "PYPI", "MAVEN"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
