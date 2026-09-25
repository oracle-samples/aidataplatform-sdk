# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GetModelDeploymentContractResponse(object):
    """
    Model contract for the query-endpoint playground: input/output signatures and a sample request.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GetModelDeploymentContractResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param input_contract:
            The value to assign to the input_contract property of this GetModelDeploymentContractResponse.
        :type input_contract: str

        :param output_contract:
            The value to assign to the output_contract property of this GetModelDeploymentContractResponse.
        :type output_contract: str

        :param input_example:
            The value to assign to the input_example property of this GetModelDeploymentContractResponse.
        :type input_example: str

        """
        self.swagger_types = {
            'input_contract': 'str',
            'output_contract': 'str',
            'input_example': 'str'
        }

        self.attribute_map = {
            'input_contract': 'input_contract',
            'output_contract': 'output_contract',
            'input_example': 'input_example'
        }

        self._input_contract = None
        self._output_contract = None
        self._input_example = None

    @property
    def input_contract(self):
        """
        Gets the input_contract of this GetModelDeploymentContractResponse.
        Model input signature (contract), captured at activation; null if the model has no signature.


        :return: The input_contract of this GetModelDeploymentContractResponse.
        :rtype: str
        """
        return self._input_contract

    @input_contract.setter
    def input_contract(self, input_contract):
        """
        Sets the input_contract of this GetModelDeploymentContractResponse.
        Model input signature (contract), captured at activation; null if the model has no signature.


        :param input_contract: The input_contract of this GetModelDeploymentContractResponse.
        :type: str
        """
        self._input_contract = input_contract

    @property
    def output_contract(self):
        """
        Gets the output_contract of this GetModelDeploymentContractResponse.
        Model output signature (contract), captured at activation; null if the model has no signature.


        :return: The output_contract of this GetModelDeploymentContractResponse.
        :rtype: str
        """
        return self._output_contract

    @output_contract.setter
    def output_contract(self, output_contract):
        """
        Sets the output_contract of this GetModelDeploymentContractResponse.
        Model output signature (contract), captured at activation; null if the model has no signature.


        :param output_contract: The output_contract of this GetModelDeploymentContractResponse.
        :type: str
        """
        self._output_contract = output_contract

    @property
    def input_example(self):
        """
        Gets the input_example of this GetModelDeploymentContractResponse.
        Sample request payload (input example), captured at activation; null if the model has no example.


        :return: The input_example of this GetModelDeploymentContractResponse.
        :rtype: str
        """
        return self._input_example

    @input_example.setter
    def input_example(self, input_example):
        """
        Sets the input_example of this GetModelDeploymentContractResponse.
        Sample request payload (input example), captured at activation; null if the model has no example.


        :param input_example: The input_example of this GetModelDeploymentContractResponse.
        :type: str
        """
        self._input_example = input_example

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
