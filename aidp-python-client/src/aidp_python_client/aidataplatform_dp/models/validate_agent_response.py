# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ValidateAgentResponse(object):
    """
    The response object for validating the agent JSON.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ValidateAgentResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_valid_agent:
            The value to assign to the is_valid_agent property of this ValidateAgentResponse.
        :type is_valid_agent: bool

        :param validation_error:
            The value to assign to the validation_error property of this ValidateAgentResponse.
        :type validation_error: list[oci.aidataplatform_dp.models.ValidationError]

        """
        self.swagger_types = {
            'is_valid_agent': 'bool',
            'validation_error': 'list[ValidationError]'
        }

        self.attribute_map = {
            'is_valid_agent': 'isValidAgent',
            'validation_error': 'validationError'
        }

        self._is_valid_agent = None
        self._validation_error = None

    @property
    def is_valid_agent(self):
        """
        **[Required]** Gets the is_valid_agent of this ValidateAgentResponse.
        true if valid, else false


        :return: The is_valid_agent of this ValidateAgentResponse.
        :rtype: bool
        """
        return self._is_valid_agent

    @is_valid_agent.setter
    def is_valid_agent(self, is_valid_agent):
        """
        Sets the is_valid_agent of this ValidateAgentResponse.
        true if valid, else false


        :param is_valid_agent: The is_valid_agent of this ValidateAgentResponse.
        :type: bool
        """
        self._is_valid_agent = is_valid_agent

    @property
    def validation_error(self):
        """
        Gets the validation_error of this ValidateAgentResponse.
        List of validation errors encountered in the diagram.


        :return: The validation_error of this ValidateAgentResponse.
        :rtype: list[oci.aidataplatform_dp.models.ValidationError]
        """
        return self._validation_error

    @validation_error.setter
    def validation_error(self, validation_error):
        """
        Sets the validation_error of this ValidateAgentResponse.
        List of validation errors encountered in the diagram.


        :param validation_error: The validation_error of this ValidateAgentResponse.
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
