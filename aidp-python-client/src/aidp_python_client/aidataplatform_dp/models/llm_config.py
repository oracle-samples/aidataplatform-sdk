# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LlmConfig(object):
    """
    Large Language Model configuration
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LlmConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_id:
            The value to assign to the model_id property of this LlmConfig.
        :type model_id: str

        :param provider:
            The value to assign to the provider property of this LlmConfig.
        :type provider: str

        :param region_id:
            The value to assign to the region_id property of this LlmConfig.
        :type region_id: str

        """
        self.swagger_types = {
            'model_id': 'str',
            'provider': 'str',
            'region_id': 'str'
        }

        self.attribute_map = {
            'model_id': 'modelId',
            'provider': 'provider',
            'region_id': 'regionId'
        }

        self._model_id = None
        self._provider = None
        self._region_id = None

    @property
    def model_id(self):
        """
        Gets the model_id of this LlmConfig.
        The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool


        :return: The model_id of this LlmConfig.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this LlmConfig.
        The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool


        :param model_id: The model_id of this LlmConfig.
        :type: str
        """
        self._model_id = model_id

    @property
    def provider(self):
        """
        Gets the provider of this LlmConfig.
        The Large language model provider name


        :return: The provider of this LlmConfig.
        :rtype: str
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """
        Sets the provider of this LlmConfig.
        The Large language model provider name


        :param provider: The provider of this LlmConfig.
        :type: str
        """
        self._provider = provider

    @property
    def region_id(self):
        """
        Gets the region_id of this LlmConfig.
        The Large language model Region ID


        :return: The region_id of this LlmConfig.
        :rtype: str
        """
        return self._region_id

    @region_id.setter
    def region_id(self, region_id):
        """
        Sets the region_id of this LlmConfig.
        The Large language model Region ID


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
