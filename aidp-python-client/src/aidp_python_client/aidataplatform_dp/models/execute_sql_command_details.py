# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .execute_database_user_workflows_details import ExecuteDatabaseUserWorkflowsDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExecuteSqlCommandDetails(ExecuteDatabaseUserWorkflowsDetails):
    """
    Running SQL command.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExecuteSqlCommandDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ExecuteSqlCommandDetails.action_type` attribute
        of this class is ``EXECUTE_SQL_COMMAND`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action_type:
            The value to assign to the action_type property of this ExecuteSqlCommandDetails.
        :type action_type: str

        :param user_schema_name:
            The value to assign to the user_schema_name property of this ExecuteSqlCommandDetails.
        :type user_schema_name: str

        :param sql_command:
            The value to assign to the sql_command property of this ExecuteSqlCommandDetails.
        :type sql_command: str

        """
        self.swagger_types = {
            'action_type': 'str',
            'user_schema_name': 'str',
            'sql_command': 'str'
        }

        self.attribute_map = {
            'action_type': 'actionType',
            'user_schema_name': 'userSchemaName',
            'sql_command': 'sqlCommand'
        }

        self._action_type = None
        self._user_schema_name = None
        self._sql_command = None
        self._action_type = 'EXECUTE_SQL_COMMAND'

    @property
    def user_schema_name(self):
        """
        Gets the user_schema_name of this ExecuteSqlCommandDetails.
        The user schema name. Only supports a valid knowledge base user and ADMIN.


        :return: The user_schema_name of this ExecuteSqlCommandDetails.
        :rtype: str
        """
        return self._user_schema_name

    @user_schema_name.setter
    def user_schema_name(self, user_schema_name):
        """
        Sets the user_schema_name of this ExecuteSqlCommandDetails.
        The user schema name. Only supports a valid knowledge base user and ADMIN.


        :param user_schema_name: The user_schema_name of this ExecuteSqlCommandDetails.
        :type: str
        """
        self._user_schema_name = user_schema_name

    @property
    def sql_command(self):
        """
        Gets the sql_command of this ExecuteSqlCommandDetails.
        Base64-encoded SQL command.


        :return: The sql_command of this ExecuteSqlCommandDetails.
        :rtype: str
        """
        return self._sql_command

    @sql_command.setter
    def sql_command(self, sql_command):
        """
        Sets the sql_command of this ExecuteSqlCommandDetails.
        Base64-encoded SQL command.


        :param sql_command: The sql_command of this ExecuteSqlCommandDetails.
        :type: str
        """
        self._sql_command = sql_command

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
