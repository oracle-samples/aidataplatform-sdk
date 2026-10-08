# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .base_llm_config import BaseLlmConfig
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LlmConfig(BaseLlmConfig):
    """
    OCI Generative AI Large Language Model configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LlmConfig object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.LlmConfig.type` attribute
        of this class is ``OCI_GEN_AI`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this LlmConfig.
            Allowed values for this property are: "OCI_GEN_AI", "THIRD_PARTY"
        :type type: str

        :param model_id:
            The value to assign to the model_id property of this LlmConfig.
        :type model_id: str

        :param compartment_id:
            The value to assign to the compartment_id property of this LlmConfig.
        :type compartment_id: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this LlmConfig.
        :type endpoint_url: str

        :param provider:
            The value to assign to the provider property of this LlmConfig.
        :type provider: str

        :param region_id:
            The value to assign to the region_id property of this LlmConfig.
        :type region_id: str

        """
        self.swagger_types = {
            'type': 'str',
            'model_id': 'str',
            'compartment_id': 'str',
            'endpoint_url': 'str',
            'provider': 'str',
            'region_id': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'model_id': 'modelId',
            'compartment_id': 'compartmentId',
            'endpoint_url': 'endpointUrl',
            'provider': 'provider',
            'region_id': 'regionId'
        }

        self._type = None
        self._model_id = None
        self._compartment_id = None
        self._endpoint_url = None
        self._provider = None
        self._region_id = None
        self._type = 'OCI_GEN_AI'

    @property
    def provider(self):
        """
        Gets the provider of this LlmConfig.
        The OCI Generative AI provider name.


        :return: The provider of this LlmConfig.
        :rtype: str
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """
        Sets the provider of this LlmConfig.
        The OCI Generative AI provider name.


        :param provider: The provider of this LlmConfig.
        :type: str
        """
        self._provider = provider

    @property
    def region_id(self):
        """
        Gets the region_id of this LlmConfig.
        The OCI Generative AI region ID.


        :return: The region_id of this LlmConfig.
        :rtype: str
        """
        return self._region_id

    @region_id.setter
    def region_id(self, region_id):
        """
        Sets the region_id of this LlmConfig.
        The OCI Generative AI region ID.


        :param region_id: The region_id of this LlmConfig.
        :type: str
        """
        self._region_id = region_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
