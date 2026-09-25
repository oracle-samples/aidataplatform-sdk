# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .base_llm_config import BaseLlmConfig
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ThirdPartyLlmConfig(BaseLlmConfig):
    """
    Third-party/BYO Large Language Model configuration.
    """

    #: A constant which can be used with the provider property of a ThirdPartyLlmConfig.
    #: This constant has a value of "openai"
    PROVIDER_OPENAI = "openai"

    #: A constant which can be used with the provider property of a ThirdPartyLlmConfig.
    #: This constant has a value of "anthropic"
    PROVIDER_ANTHROPIC = "anthropic"

    #: A constant which can be used with the provider property of a ThirdPartyLlmConfig.
    #: This constant has a value of "gemini"
    PROVIDER_GEMINI = "gemini"

    def __init__(self, **kwargs):
        """
        Initializes a new ThirdPartyLlmConfig object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ThirdPartyLlmConfig.type` attribute
        of this class is ``THIRD_PARTY`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ThirdPartyLlmConfig.
            Allowed values for this property are: "OCI_GEN_AI", "THIRD_PARTY", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param model_id:
            The value to assign to the model_id property of this ThirdPartyLlmConfig.
        :type model_id: str

        :param compartment_id:
            The value to assign to the compartment_id property of this ThirdPartyLlmConfig.
        :type compartment_id: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this ThirdPartyLlmConfig.
        :type endpoint_url: str

        :param provider:
            The value to assign to the provider property of this ThirdPartyLlmConfig.
            Allowed values for this property are: "openai", "anthropic", "gemini", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type provider: str

        :param api_key_credstore_ref:
            The value to assign to the api_key_credstore_ref property of this ThirdPartyLlmConfig.
        :type api_key_credstore_ref: oci.aidataplatform_dp.models.CredentialV2NameAndSecretKey

        :param llm_connection_settings:
            The value to assign to the llm_connection_settings property of this ThirdPartyLlmConfig.
        :type llm_connection_settings: oci.aidataplatform_dp.models.LlmConnectionSettings

        """
        self.swagger_types = {
            'type': 'str',
            'model_id': 'str',
            'compartment_id': 'str',
            'endpoint_url': 'str',
            'provider': 'str',
            'api_key_credstore_ref': 'CredentialV2NameAndSecretKey',
            'llm_connection_settings': 'LlmConnectionSettings'
        }

        self.attribute_map = {
            'type': 'type',
            'model_id': 'modelId',
            'compartment_id': 'compartmentId',
            'endpoint_url': 'endpointUrl',
            'provider': 'provider',
            'api_key_credstore_ref': 'apiKeyCredstoreRef',
            'llm_connection_settings': 'llmConnectionSettings'
        }

        self._type = None
        self._model_id = None
        self._compartment_id = None
        self._endpoint_url = None
        self._provider = None
        self._api_key_credstore_ref = None
        self._llm_connection_settings = None
        self._type = 'THIRD_PARTY'

    @property
    def provider(self):
        """
        **[Required]** Gets the provider of this ThirdPartyLlmConfig.
        The third-party provider wire value; currently openai, anthropic, or gemini.

        Allowed values for this property are: "openai", "anthropic", "gemini", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The provider of this ThirdPartyLlmConfig.
        :rtype: str
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """
        Sets the provider of this ThirdPartyLlmConfig.
        The third-party provider wire value; currently openai, anthropic, or gemini.


        :param provider: The provider of this ThirdPartyLlmConfig.
        :type: str
        """
        allowed_values = ["openai", "anthropic", "gemini"]
        if not value_allowed_none_or_none_sentinel(provider, allowed_values):
            provider = 'UNKNOWN_ENUM_VALUE'
        self._provider = provider

    @property
    def api_key_credstore_ref(self):
        """
        **[Required]** Gets the api_key_credstore_ref of this ThirdPartyLlmConfig.

        :return: The api_key_credstore_ref of this ThirdPartyLlmConfig.
        :rtype: oci.aidataplatform_dp.models.CredentialV2NameAndSecretKey
        """
        return self._api_key_credstore_ref

    @api_key_credstore_ref.setter
    def api_key_credstore_ref(self, api_key_credstore_ref):
        """
        Sets the api_key_credstore_ref of this ThirdPartyLlmConfig.

        :param api_key_credstore_ref: The api_key_credstore_ref of this ThirdPartyLlmConfig.
        :type: oci.aidataplatform_dp.models.CredentialV2NameAndSecretKey
        """
        self._api_key_credstore_ref = api_key_credstore_ref

    @property
    def llm_connection_settings(self):
        """
        Gets the llm_connection_settings of this ThirdPartyLlmConfig.

        :return: The llm_connection_settings of this ThirdPartyLlmConfig.
        :rtype: oci.aidataplatform_dp.models.LlmConnectionSettings
        """
        return self._llm_connection_settings

    @llm_connection_settings.setter
    def llm_connection_settings(self, llm_connection_settings):
        """
        Sets the llm_connection_settings of this ThirdPartyLlmConfig.

        :param llm_connection_settings: The llm_connection_settings of this ThirdPartyLlmConfig.
        :type: oci.aidataplatform_dp.models.LlmConnectionSettings
        """
        self._llm_connection_settings = llm_connection_settings

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
