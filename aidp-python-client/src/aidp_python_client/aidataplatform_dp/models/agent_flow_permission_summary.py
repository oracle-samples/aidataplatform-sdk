# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowPermissionSummary(object):
    """
    Information about a Agent flow permission.
    """

    #: A constant which can be used with the grantee_type property of a AgentFlowPermissionSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a AgentFlowPermissionSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a AgentFlowPermissionSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    #: A constant which can be used with the grantee_permissions property of a AgentFlowPermissionSummary.
    #: This constant has a value of "READ"
    GRANTEE_PERMISSIONS_READ = "READ"

    #: A constant which can be used with the grantee_permissions property of a AgentFlowPermissionSummary.
    #: This constant has a value of "MANAGE"
    GRANTEE_PERMISSIONS_MANAGE = "MANAGE"

    #: A constant which can be used with the grantee_permissions property of a AgentFlowPermissionSummary.
    #: This constant has a value of "ADMIN"
    GRANTEE_PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the grantee_permissions property of a AgentFlowPermissionSummary.
    #: This constant has a value of "USE"
    GRANTEE_PERMISSIONS_USE = "USE"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowPermissionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this AgentFlowPermissionSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this AgentFlowPermissionSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this AgentFlowPermissionSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP"
        :type grantee_type: str

        :param grantee_permissions:
            The value to assign to the grantee_permissions property of this AgentFlowPermissionSummary.
            Allowed values for items in this list are: "READ", "MANAGE", "ADMIN", "USE"
        :type grantee_permissions: list[str]

        :param columns:
            The value to assign to the columns property of this AgentFlowPermissionSummary.
        :type columns: list[str]

        :param exclude_columns:
            The value to assign to the exclude_columns property of this AgentFlowPermissionSummary.
        :type exclude_columns: list[str]

        :param is_inherited:
            The value to assign to the is_inherited property of this AgentFlowPermissionSummary.
        :type is_inherited: bool

        :param resource_name:
            The value to assign to the resource_name property of this AgentFlowPermissionSummary.
        :type resource_name: str

        """
        self.swagger_types = {
            'grantee': 'str',
            'grantee_name': 'str',
            'grantee_type': 'str',
            'grantee_permissions': 'list[str]',
            'columns': 'list[str]',
            'exclude_columns': 'list[str]',
            'is_inherited': 'bool',
            'resource_name': 'str'
        }

        self.attribute_map = {
            'grantee': 'grantee',
            'grantee_name': 'granteeName',
            'grantee_type': 'granteeType',
            'grantee_permissions': 'granteePermissions',
            'columns': 'columns',
            'exclude_columns': 'excludeColumns',
            'is_inherited': 'isInherited',
            'resource_name': 'resourceName'
        }

        self._grantee = None
        self._grantee_name = None
        self._grantee_type = None
        self._grantee_permissions = None
        self._columns = None
        self._exclude_columns = None
        self._is_inherited = None
        self._resource_name = None

    @property
    def grantee(self):
        """
        **[Required]** Gets the grantee of this AgentFlowPermissionSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this AgentFlowPermissionSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this AgentFlowPermissionSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this AgentFlowPermissionSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        Gets the grantee_name of this AgentFlowPermissionSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this AgentFlowPermissionSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this AgentFlowPermissionSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this AgentFlowPermissionSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this AgentFlowPermissionSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP"


        :return: The grantee_type of this AgentFlowPermissionSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this AgentFlowPermissionSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this AgentFlowPermissionSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            raise ValueError(
                "Invalid value for `grantee_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._grantee_type = grantee_type

    @property
    def grantee_permissions(self):
        """
        **[Required]** Gets the grantee_permissions of this AgentFlowPermissionSummary.
        The selected permissions for a Agent flow.

        Allowed values for items in this list are: "READ", "MANAGE", "ADMIN", "USE"


        :return: The grantee_permissions of this AgentFlowPermissionSummary.
        :rtype: list[str]
        """
        return self._grantee_permissions

    @grantee_permissions.setter
    def grantee_permissions(self, grantee_permissions):
        """
        Sets the grantee_permissions of this AgentFlowPermissionSummary.
        The selected permissions for a Agent flow.


        :param grantee_permissions: The grantee_permissions of this AgentFlowPermissionSummary.
        :type: list[str]
        """
        allowed_values = ["READ", "MANAGE", "ADMIN", "USE"]
        
        if grantee_permissions and grantee_permissions is not NONE_SENTINEL:
            for value in grantee_permissions:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `grantee_permissions`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._grantee_permissions = grantee_permissions

    @property
    def columns(self):
        """
        Gets the columns of this AgentFlowPermissionSummary.
        The list of the columns included for permission assignment.


        :return: The columns of this AgentFlowPermissionSummary.
        :rtype: list[str]
        """
        return self._columns

    @columns.setter
    def columns(self, columns):
        """
        Sets the columns of this AgentFlowPermissionSummary.
        The list of the columns included for permission assignment.


        :param columns: The columns of this AgentFlowPermissionSummary.
        :type: list[str]
        """
        self._columns = columns

    @property
    def exclude_columns(self):
        """
        Gets the exclude_columns of this AgentFlowPermissionSummary.
        The list of the columns excluded from permission assignment.


        :return: The exclude_columns of this AgentFlowPermissionSummary.
        :rtype: list[str]
        """
        return self._exclude_columns

    @exclude_columns.setter
    def exclude_columns(self, exclude_columns):
        """
        Sets the exclude_columns of this AgentFlowPermissionSummary.
        The list of the columns excluded from permission assignment.


        :param exclude_columns: The exclude_columns of this AgentFlowPermissionSummary.
        :type: list[str]
        """
        self._exclude_columns = exclude_columns

    @property
    def is_inherited(self):
        """
        Gets the is_inherited of this AgentFlowPermissionSummary.
        If the permission listed is inherited or not from object higher up in hierarchy.


        :return: The is_inherited of this AgentFlowPermissionSummary.
        :rtype: bool
        """
        return self._is_inherited

    @is_inherited.setter
    def is_inherited(self, is_inherited):
        """
        Sets the is_inherited of this AgentFlowPermissionSummary.
        If the permission listed is inherited or not from object higher up in hierarchy.


        :param is_inherited: The is_inherited of this AgentFlowPermissionSummary.
        :type: bool
        """
        self._is_inherited = is_inherited

    @property
    def resource_name(self):
        """
        Gets the resource_name of this AgentFlowPermissionSummary.
        Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.


        :return: The resource_name of this AgentFlowPermissionSummary.
        :rtype: str
        """
        return self._resource_name

    @resource_name.setter
    def resource_name(self, resource_name):
        """
        Sets the resource_name of this AgentFlowPermissionSummary.
        Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.


        :param resource_name: The resource_name of this AgentFlowPermissionSummary.
        :type: str
        """
        self._resource_name = resource_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
