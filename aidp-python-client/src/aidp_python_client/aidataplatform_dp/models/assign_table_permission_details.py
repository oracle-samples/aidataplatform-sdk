# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AssignTablePermissionDetails(object):
    """
    The details of the permissions assigned on the table to assignee.
    """

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "SELECT"
    PERMISSIONS_SELECT = "SELECT"

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "INSERT"
    PERMISSIONS_INSERT = "INSERT"

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "UPDATE"
    PERMISSIONS_UPDATE = "UPDATE"

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "DELETE"
    PERMISSIONS_DELETE = "DELETE"

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "ALTER"
    PERMISSIONS_ALTER = "ALTER"

    #: A constant which can be used with the permissions property of a AssignTablePermissionDetails.
    #: This constant has a value of "ADMIN"
    PERMISSIONS_ADMIN = "ADMIN"

    #: A constant which can be used with the row_filter_type property of a AssignTablePermissionDetails.
    #: This constant has a value of "SQL"
    ROW_FILTER_TYPE_SQL = "SQL"

    def __init__(self, **kwargs):
        """
        Initializes a new AssignTablePermissionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param assignees:
            The value to assign to the assignees property of this AssignTablePermissionDetails.
        :type assignees: oci.aidataplatform_dp.models.PermissionAssignees

        :param permissions:
            The value to assign to the permissions property of this AssignTablePermissionDetails.
            Allowed values for items in this list are: "SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN"
        :type permissions: list[str]

        :param include_columns:
            The value to assign to the include_columns property of this AssignTablePermissionDetails.
        :type include_columns: list[str]

        :param exclude_columns:
            The value to assign to the exclude_columns property of this AssignTablePermissionDetails.
        :type exclude_columns: list[str]

        :param row_filter_type:
            The value to assign to the row_filter_type property of this AssignTablePermissionDetails.
            Allowed values for this property are: "SQL"
        :type row_filter_type: str

        :param row_filter:
            The value to assign to the row_filter property of this AssignTablePermissionDetails.
        :type row_filter: str

        """
        self.swagger_types = {
            'assignees': 'PermissionAssignees',
            'permissions': 'list[str]',
            'include_columns': 'list[str]',
            'exclude_columns': 'list[str]',
            'row_filter_type': 'str',
            'row_filter': 'str'
        }

        self.attribute_map = {
            'assignees': 'assignees',
            'permissions': 'permissions',
            'include_columns': 'includeColumns',
            'exclude_columns': 'excludeColumns',
            'row_filter_type': 'rowFilterType',
            'row_filter': 'rowFilter'
        }

        self._assignees = None
        self._permissions = None
        self._include_columns = None
        self._exclude_columns = None
        self._row_filter_type = None
        self._row_filter = None

    @property
    def assignees(self):
        """
        **[Required]** Gets the assignees of this AssignTablePermissionDetails.

        :return: The assignees of this AssignTablePermissionDetails.
        :rtype: oci.aidataplatform_dp.models.PermissionAssignees
        """
        return self._assignees

    @assignees.setter
    def assignees(self, assignees):
        """
        Sets the assignees of this AssignTablePermissionDetails.

        :param assignees: The assignees of this AssignTablePermissionDetails.
        :type: oci.aidataplatform_dp.models.PermissionAssignees
        """
        self._assignees = assignees

    @property
    def permissions(self):
        """
        **[Required]** Gets the permissions of this AssignTablePermissionDetails.
        The permissions assigned to the assignees.

        Allowed values for items in this list are: "SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN"


        :return: The permissions of this AssignTablePermissionDetails.
        :rtype: list[str]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """
        Sets the permissions of this AssignTablePermissionDetails.
        The permissions assigned to the assignees.


        :param permissions: The permissions of this AssignTablePermissionDetails.
        :type: list[str]
        """
        allowed_values = ["SELECT", "INSERT", "UPDATE", "DELETE", "ALTER", "ADMIN"]
        
        if permissions and permissions is not NONE_SENTINEL:
            for value in permissions:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `permissions`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._permissions = permissions

    @property
    def include_columns(self):
        """
        **[Required]** Gets the include_columns of this AssignTablePermissionDetails.
        The list of columns to be included for the assigning of permissions.


        :return: The include_columns of this AssignTablePermissionDetails.
        :rtype: list[str]
        """
        return self._include_columns

    @include_columns.setter
    def include_columns(self, include_columns):
        """
        Sets the include_columns of this AssignTablePermissionDetails.
        The list of columns to be included for the assigning of permissions.


        :param include_columns: The include_columns of this AssignTablePermissionDetails.
        :type: list[str]
        """
        self._include_columns = include_columns

    @property
    def exclude_columns(self):
        """
        **[Required]** Gets the exclude_columns of this AssignTablePermissionDetails.
        The list of columns to be excluded for the assigning of permissions.


        :return: The exclude_columns of this AssignTablePermissionDetails.
        :rtype: list[str]
        """
        return self._exclude_columns

    @exclude_columns.setter
    def exclude_columns(self, exclude_columns):
        """
        Sets the exclude_columns of this AssignTablePermissionDetails.
        The list of columns to be excluded for the assigning of permissions.


        :param exclude_columns: The exclude_columns of this AssignTablePermissionDetails.
        :type: list[str]
        """
        self._exclude_columns = exclude_columns

    @property
    def row_filter_type(self):
        """
        Gets the row_filter_type of this AssignTablePermissionDetails.
        Type of row filter expression.

        Allowed values for this property are: "SQL"


        :return: The row_filter_type of this AssignTablePermissionDetails.
        :rtype: str
        """
        return self._row_filter_type

    @row_filter_type.setter
    def row_filter_type(self, row_filter_type):
        """
        Sets the row_filter_type of this AssignTablePermissionDetails.
        Type of row filter expression.


        :param row_filter_type: The row_filter_type of this AssignTablePermissionDetails.
        :type: str
        """
        allowed_values = ["SQL"]
        if not value_allowed_none_or_none_sentinel(row_filter_type, allowed_values):
            raise ValueError(
                "Invalid value for `row_filter_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._row_filter_type = row_filter_type

    @property
    def row_filter(self):
        """
        Gets the row_filter of this AssignTablePermissionDetails.
        Row filter expression applied while assigning table permissions.


        :return: The row_filter of this AssignTablePermissionDetails.
        :rtype: str
        """
        return self._row_filter

    @row_filter.setter
    def row_filter(self, row_filter):
        """
        Sets the row_filter of this AssignTablePermissionDetails.
        Row filter expression applied while assigning table permissions.


        :param row_filter: The row_filter of this AssignTablePermissionDetails.
        :type: str
        """
        self._row_filter = row_filter

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
