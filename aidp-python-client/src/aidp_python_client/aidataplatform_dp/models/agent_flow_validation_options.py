# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowValidationOptions(object):
    """
    Options controlling Agent Flow diagram validation behavior.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowValidationOptions object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param should_skip_lake_flow_validation:
            The value to assign to the should_skip_lake_flow_validation property of this AgentFlowValidationOptions.
        :type should_skip_lake_flow_validation: bool

        :param should_include_warnings:
            The value to assign to the should_include_warnings property of this AgentFlowValidationOptions.
        :type should_include_warnings: bool

        """
        self.swagger_types = {
            'should_skip_lake_flow_validation': 'bool',
            'should_include_warnings': 'bool'
        }

        self.attribute_map = {
            'should_skip_lake_flow_validation': 'shouldSkipLakeFlowValidation',
            'should_include_warnings': 'shouldIncludeWarnings'
        }

        self._should_skip_lake_flow_validation = None
        self._should_include_warnings = None

    @property
    def should_skip_lake_flow_validation(self):
        """
        Gets the should_skip_lake_flow_validation of this AgentFlowValidationOptions.
        Whether to skip optional LakeFlow validation when deep validation is requested.


        :return: The should_skip_lake_flow_validation of this AgentFlowValidationOptions.
        :rtype: bool
        """
        return self._should_skip_lake_flow_validation

    @should_skip_lake_flow_validation.setter
    def should_skip_lake_flow_validation(self, should_skip_lake_flow_validation):
        """
        Sets the should_skip_lake_flow_validation of this AgentFlowValidationOptions.
        Whether to skip optional LakeFlow validation when deep validation is requested.


        :param should_skip_lake_flow_validation: The should_skip_lake_flow_validation of this AgentFlowValidationOptions.
        :type: bool
        """
        self._should_skip_lake_flow_validation = should_skip_lake_flow_validation

    @property
    def should_include_warnings(self):
        """
        Gets the should_include_warnings of this AgentFlowValidationOptions.
        Whether warning issues should be included in the validation result.


        :return: The should_include_warnings of this AgentFlowValidationOptions.
        :rtype: bool
        """
        return self._should_include_warnings

    @should_include_warnings.setter
    def should_include_warnings(self, should_include_warnings):
        """
        Sets the should_include_warnings of this AgentFlowValidationOptions.
        Whether warning issues should be included in the validation result.


        :param should_include_warnings: The should_include_warnings of this AgentFlowValidationOptions.
        :type: bool
        """
        self._should_include_warnings = should_include_warnings

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
