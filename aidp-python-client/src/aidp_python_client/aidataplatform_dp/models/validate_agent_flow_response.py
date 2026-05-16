# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ValidateAgentFlowResponse(object):
    """
    The response object for validating the agent flow json
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ValidateAgentFlowResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_valid_agent_flow:
            The value to assign to the is_valid_agent_flow property of this ValidateAgentFlowResponse.
        :type is_valid_agent_flow: bool

        :param validation_error:
            The value to assign to the validation_error property of this ValidateAgentFlowResponse.
        :type validation_error: list[oci.aidataplatform_dp.models.ValidationError]

        """
        self.swagger_types = {
            'is_valid_agent_flow': 'bool',
            'validation_error': 'list[ValidationError]'
        }

        self.attribute_map = {
            'is_valid_agent_flow': 'isValidAgentFlow',
            'validation_error': 'validationError'
        }

        self._is_valid_agent_flow = None
        self._validation_error = None

    @property
    def is_valid_agent_flow(self):
        """
        **[Required]** Gets the is_valid_agent_flow of this ValidateAgentFlowResponse.
        true if valid, else false


        :return: The is_valid_agent_flow of this ValidateAgentFlowResponse.
        :rtype: bool
        """
        return self._is_valid_agent_flow

    @is_valid_agent_flow.setter
    def is_valid_agent_flow(self, is_valid_agent_flow):
        """
        Sets the is_valid_agent_flow of this ValidateAgentFlowResponse.
        true if valid, else false


        :param is_valid_agent_flow: The is_valid_agent_flow of this ValidateAgentFlowResponse.
        :type: bool
        """
        self._is_valid_agent_flow = is_valid_agent_flow

    @property
    def validation_error(self):
        """
        Gets the validation_error of this ValidateAgentFlowResponse.
        List of validation errors encountered in the diagram.


        :return: The validation_error of this ValidateAgentFlowResponse.
        :rtype: list[oci.aidataplatform_dp.models.ValidationError]
        """
        return self._validation_error

    @validation_error.setter
    def validation_error(self, validation_error):
        """
        Sets the validation_error of this ValidateAgentFlowResponse.
        List of validation errors encountered in the diagram.


        :param validation_error: The validation_error of this ValidateAgentFlowResponse.
        :type: list[oci.aidataplatform_dp.models.ValidationError]
        """
        self._validation_error = validation_error

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
