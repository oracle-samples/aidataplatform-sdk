# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PromptToolConfiguration(object):
    """
    Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can not modify their values
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PromptToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param llm:
            The value to assign to the llm property of this PromptToolConfiguration.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param prompt_text:
            The value to assign to the prompt_text property of this PromptToolConfiguration.
        :type prompt_text: str

        :param model_settings:
            The value to assign to the model_settings property of this PromptToolConfiguration.
        :type model_settings: dict(str, object)

        """
        self.swagger_types = {
            'llm': 'LlmConfig',
            'prompt_text': 'str',
            'model_settings': 'dict(str, object)'
        }

        self.attribute_map = {
            'llm': 'llm',
            'prompt_text': 'promptText',
            'model_settings': 'modelSettings'
        }

        self._llm = None
        self._prompt_text = None
        self._model_settings = None

    @property
    def llm(self):
        """
        Gets the llm of this PromptToolConfiguration.

        :return: The llm of this PromptToolConfiguration.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this PromptToolConfiguration.

        :param llm: The llm of this PromptToolConfiguration.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def prompt_text(self):
        """
        Gets the prompt_text of this PromptToolConfiguration.
        The generative AI prompt


        :return: The prompt_text of this PromptToolConfiguration.
        :rtype: str
        """
        return self._prompt_text

    @prompt_text.setter
    def prompt_text(self, prompt_text):
        """
        Sets the prompt_text of this PromptToolConfiguration.
        The generative AI prompt


        :param prompt_text: The prompt_text of this PromptToolConfiguration.
        :type: str
        """
        self._prompt_text = prompt_text

    @property
    def model_settings(self):
        """
        Gets the model_settings of this PromptToolConfiguration.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this PromptToolConfiguration.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this PromptToolConfiguration.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this PromptToolConfiguration.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
