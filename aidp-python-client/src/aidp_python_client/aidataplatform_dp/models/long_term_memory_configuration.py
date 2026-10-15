# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LongTermMemoryConfiguration(object):
    """
    Configuration for Oracle Agent Memory long-term memory. When enabled, llmConfig selects the OCI Generative AI model used for memory extraction and summarization.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LongTermMemoryConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this LongTermMemoryConfiguration.
        :type is_enabled: bool

        :param share_between_chat_threads:
            The value to assign to the share_between_chat_threads property of this LongTermMemoryConfiguration.
        :type share_between_chat_threads: bool

        :param llm_config:
            The value to assign to the llm_config property of this LongTermMemoryConfiguration.
        :type llm_config: oci.aidataplatform_dp.models.LlmConfig

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'share_between_chat_threads': 'bool',
            'llm_config': 'LlmConfig'
        }
        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'share_between_chat_threads': 'shareBetweenChatThreads',
            'llm_config': 'llmConfig'
        }
        self._is_enabled = None
        self._share_between_chat_threads = None
        self._llm_config = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this LongTermMemoryConfiguration.
        UI-only authoring state for long-term memory. It is not sent to the deployed runtime.


        :return: The is_enabled of this LongTermMemoryConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this LongTermMemoryConfiguration.
        UI-only authoring state for long-term memory. It is not sent to the deployed runtime.


        :param is_enabled: The is_enabled of this LongTermMemoryConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def share_between_chat_threads(self):
        """
        Gets the share_between_chat_threads of this LongTermMemoryConfiguration.
        Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.


        :return: The share_between_chat_threads of this LongTermMemoryConfiguration.
        :rtype: bool
        """
        return self._share_between_chat_threads

    @share_between_chat_threads.setter
    def share_between_chat_threads(self, share_between_chat_threads):
        """
        Sets the share_between_chat_threads of this LongTermMemoryConfiguration.
        Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.


        :param share_between_chat_threads: The share_between_chat_threads of this LongTermMemoryConfiguration.
        :type: bool
        """
        self._share_between_chat_threads = share_between_chat_threads

    @property
    def llm_config(self):
        """
        Gets the llm_config of this LongTermMemoryConfiguration.

        :return: The llm_config of this LongTermMemoryConfiguration.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm_config

    @llm_config.setter
    def llm_config(self, llm_config):
        """
        Sets the llm_config of this LongTermMemoryConfiguration.

        :param llm_config: The llm_config of this LongTermMemoryConfiguration.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm_config = llm_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
