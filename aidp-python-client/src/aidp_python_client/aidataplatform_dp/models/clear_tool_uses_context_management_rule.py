# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .context_management_rule import ContextManagementRule
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClearToolUsesContextManagementRule(ContextManagementRule):
    """
    Context management rule for clearing older tool-use outputs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClearToolUsesContextManagementRule object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ClearToolUsesContextManagementRule.type` attribute
        of this class is ``CLEAR_TOOL_USES`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClearToolUsesContextManagementRule.
            Allowed values for this property are: "CLEAR_TOOL_USES"
        :type type: str

        :param config:
            The value to assign to the config property of this ClearToolUsesContextManagementRule.
        :type config: oci.aidataplatform_dp.models.ClearToolUsesContextManagementDetails

        """
        self.swagger_types = {
            'type': 'str',
            'config': 'ClearToolUsesContextManagementDetails'
        }

        self.attribute_map = {
            'type': 'type',
            'config': 'config'
        }

        self._type = None
        self._config = None
        self._type = 'CLEAR_TOOL_USES'

    @property
    def config(self):
        """
        Gets the config of this ClearToolUsesContextManagementRule.

        :return: The config of this ClearToolUsesContextManagementRule.
        :rtype: oci.aidataplatform_dp.models.ClearToolUsesContextManagementDetails
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this ClearToolUsesContextManagementRule.

        :param config: The config of this ClearToolUsesContextManagementRule.
        :type: oci.aidataplatform_dp.models.ClearToolUsesContextManagementDetails
        """
        self._config = config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
