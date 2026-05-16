# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PrincipalsWithWorkspaceAccessSummary(object):
    """
    This is a object containing the user and the type of permission they have
    """

    #: A constant which can be used with the grantee_type property of a PrincipalsWithWorkspaceAccessSummary.
    #: This constant has a value of "USER"
    GRANTEE_TYPE_USER = "USER"

    #: A constant which can be used with the grantee_type property of a PrincipalsWithWorkspaceAccessSummary.
    #: This constant has a value of "ROLE"
    GRANTEE_TYPE_ROLE = "ROLE"

    #: A constant which can be used with the grantee_type property of a PrincipalsWithWorkspaceAccessSummary.
    #: This constant has a value of "GROUP"
    GRANTEE_TYPE_GROUP = "GROUP"

    def __init__(self, **kwargs):
        """
        Initializes a new PrincipalsWithWorkspaceAccessSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param grantee:
            The value to assign to the grantee property of this PrincipalsWithWorkspaceAccessSummary.
        :type grantee: str

        :param grantee_name:
            The value to assign to the grantee_name property of this PrincipalsWithWorkspaceAccessSummary.
        :type grantee_name: str

        :param grantee_type:
            The value to assign to the grantee_type property of this PrincipalsWithWorkspaceAccessSummary.
            Allowed values for this property are: "USER", "ROLE", "GROUP"
        :type grantee_type: str

        """
        self.swagger_types = {
            'grantee': 'str',
            'grantee_name': 'str',
            'grantee_type': 'str'
        }

        self.attribute_map = {
            'grantee': 'grantee',
            'grantee_name': 'granteeName',
            'grantee_type': 'granteeType'
        }

        self._grantee = None
        self._grantee_name = None
        self._grantee_type = None

    @property
    def grantee(self):
        """
        **[Required]** Gets the grantee of this PrincipalsWithWorkspaceAccessSummary.
        The OCID of user/group and name in case of role.


        :return: The grantee of this PrincipalsWithWorkspaceAccessSummary.
        :rtype: str
        """
        return self._grantee

    @grantee.setter
    def grantee(self, grantee):
        """
        Sets the grantee of this PrincipalsWithWorkspaceAccessSummary.
        The OCID of user/group and name in case of role.


        :param grantee: The grantee of this PrincipalsWithWorkspaceAccessSummary.
        :type: str
        """
        self._grantee = grantee

    @property
    def grantee_name(self):
        """
        **[Required]** Gets the grantee_name of this PrincipalsWithWorkspaceAccessSummary.
        The simplified name of the grantee.


        :return: The grantee_name of this PrincipalsWithWorkspaceAccessSummary.
        :rtype: str
        """
        return self._grantee_name

    @grantee_name.setter
    def grantee_name(self, grantee_name):
        """
        Sets the grantee_name of this PrincipalsWithWorkspaceAccessSummary.
        The simplified name of the grantee.


        :param grantee_name: The grantee_name of this PrincipalsWithWorkspaceAccessSummary.
        :type: str
        """
        self._grantee_name = grantee_name

    @property
    def grantee_type(self):
        """
        **[Required]** Gets the grantee_type of this PrincipalsWithWorkspaceAccessSummary.
        The type of grantee.

        Allowed values for this property are: "USER", "ROLE", "GROUP"


        :return: The grantee_type of this PrincipalsWithWorkspaceAccessSummary.
        :rtype: str
        """
        return self._grantee_type

    @grantee_type.setter
    def grantee_type(self, grantee_type):
        """
        Sets the grantee_type of this PrincipalsWithWorkspaceAccessSummary.
        The type of grantee.


        :param grantee_type: The grantee_type of this PrincipalsWithWorkspaceAccessSummary.
        :type: str
        """
        allowed_values = ["USER", "ROLE", "GROUP"]
        if not value_allowed_none_or_none_sentinel(grantee_type, allowed_values):
            raise ValueError(
                "Invalid value for `grantee_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._grantee_type = grantee_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
