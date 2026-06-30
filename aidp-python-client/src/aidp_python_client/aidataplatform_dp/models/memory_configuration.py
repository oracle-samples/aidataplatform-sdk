# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MemoryConfiguration(object):
    """
    Memory configuration for an agent node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MemoryConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this MemoryConfiguration.
        :type is_enabled: bool

        :param limit:
            The value to assign to the limit property of this MemoryConfiguration.
        :type limit: oci.aidataplatform_dp.models.MemoryLimitConfiguration

        :param context_management:
            The value to assign to the context_management property of this MemoryConfiguration.
        :type context_management: oci.aidataplatform_dp.models.ContextManagementConfiguration

        :param memory_properties:
            The value to assign to the memory_properties property of this MemoryConfiguration.
        :type memory_properties: dict(str, object)

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'limit': 'MemoryLimitConfiguration',
            'context_management': 'ContextManagementConfiguration',
            'memory_properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'limit': 'limit',
            'context_management': 'contextManagement',
            'memory_properties': 'memoryProperties'
        }

        self._is_enabled = None
        self._limit = None
        self._context_management = None
        self._memory_properties = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this MemoryConfiguration.
        Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.


        :return: The is_enabled of this MemoryConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this MemoryConfiguration.
        Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.


        :param is_enabled: The is_enabled of this MemoryConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def limit(self):
        """
        Gets the limit of this MemoryConfiguration.

        :return: The limit of this MemoryConfiguration.
        :rtype: oci.aidataplatform_dp.models.MemoryLimitConfiguration
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this MemoryConfiguration.

        :param limit: The limit of this MemoryConfiguration.
        :type: oci.aidataplatform_dp.models.MemoryLimitConfiguration
        """
        self._limit = limit

    @property
    def context_management(self):
        """
        Gets the context_management of this MemoryConfiguration.

        :return: The context_management of this MemoryConfiguration.
        :rtype: oci.aidataplatform_dp.models.ContextManagementConfiguration
        """
        return self._context_management

    @context_management.setter
    def context_management(self, context_management):
        """
        Sets the context_management of this MemoryConfiguration.

        :param context_management: The context_management of this MemoryConfiguration.
        :type: oci.aidataplatform_dp.models.ContextManagementConfiguration
        """
        self._context_management = context_management

    @property
    def memory_properties(self):
        """
        Gets the memory_properties of this MemoryConfiguration.
        Some extra named memory properties.


        :return: The memory_properties of this MemoryConfiguration.
        :rtype: dict(str, object)
        """
        return self._memory_properties

    @memory_properties.setter
    def memory_properties(self, memory_properties):
        """
        Sets the memory_properties of this MemoryConfiguration.
        Some extra named memory properties.


        :param memory_properties: The memory_properties of this MemoryConfiguration.
        :type: dict(str, object)
        """
        self._memory_properties = memory_properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
