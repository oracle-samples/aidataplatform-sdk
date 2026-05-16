# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .execute_database_user_workflows_details import ExecuteDatabaseUserWorkflowsDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeProvisionUserSchemasDetails(ExecuteDatabaseUserWorkflowsDetails):
    """
    Deprovision user schemas created by AI Data Platform Workbench.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeProvisionUserSchemasDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.DeProvisionUserSchemasDetails.action_type` attribute
        of this class is ``DEPROVISION_USER_SCHEMAS`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action_type:
            The value to assign to the action_type property of this DeProvisionUserSchemasDetails.
        :type action_type: str

        """
        self.swagger_types = {
            'action_type': 'str'
        }

        self.attribute_map = {
            'action_type': 'actionType'
        }

        self._action_type = None
        self._action_type = 'DEPROVISION_USER_SCHEMAS'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
