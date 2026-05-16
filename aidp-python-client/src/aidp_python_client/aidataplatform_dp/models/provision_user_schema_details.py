# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .execute_database_user_workflows_details import ExecuteDatabaseUserWorkflowsDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ProvisionUserSchemaDetails(ExecuteDatabaseUserWorkflowsDetails):
    """
    Provision user schema which includes creating user schema, persist credentials in credential store.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ProvisionUserSchemaDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ProvisionUserSchemaDetails.action_type` attribute
        of this class is ``PROVISION_USER_SCHEMA`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action_type:
            The value to assign to the action_type property of this ProvisionUserSchemaDetails.
        :type action_type: str

        :param user_schema_name:
            The value to assign to the user_schema_name property of this ProvisionUserSchemaDetails.
        :type user_schema_name: str

        :param grants:
            The value to assign to the grants property of this ProvisionUserSchemaDetails.
        :type grants: list[str]

        """
        self.swagger_types = {
            'action_type': 'str',
            'user_schema_name': 'str',
            'grants': 'list[str]'
        }

        self.attribute_map = {
            'action_type': 'actionType',
            'user_schema_name': 'userSchemaName',
            'grants': 'grants'
        }

        self._action_type = None
        self._user_schema_name = None
        self._grants = None
        self._action_type = 'PROVISION_USER_SCHEMA'

    @property
    def user_schema_name(self):
        """
        Gets the user_schema_name of this ProvisionUserSchemaDetails.
        The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.


        :return: The user_schema_name of this ProvisionUserSchemaDetails.
        :rtype: str
        """
        return self._user_schema_name

    @user_schema_name.setter
    def user_schema_name(self, user_schema_name):
        """
        Sets the user_schema_name of this ProvisionUserSchemaDetails.
        The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.


        :param user_schema_name: The user_schema_name of this ProvisionUserSchemaDetails.
        :type: str
        """
        self._user_schema_name = user_schema_name

    @property
    def grants(self):
        """
        Gets the grants of this ProvisionUserSchemaDetails.
        The grants to be assigned to the user schema.


        :return: The grants of this ProvisionUserSchemaDetails.
        :rtype: list[str]
        """
        return self._grants

    @grants.setter
    def grants(self, grants):
        """
        Sets the grants of this ProvisionUserSchemaDetails.
        The grants to be assigned to the user schema.


        :param grants: The grants of this ProvisionUserSchemaDetails.
        :type: list[str]
        """
        self._grants = grants

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
