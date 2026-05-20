# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MemoryLimitConfiguration(object):
    """
    Memory limit configuration for an agent node.
    """

    #: A constant which can be used with the type property of a MemoryLimitConfiguration.
    #: This constant has a value of "TRUNCATION"
    TYPE_TRUNCATION = "TRUNCATION"

    def __init__(self, **kwargs):
        """
        Initializes a new MemoryLimitConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this MemoryLimitConfiguration.
            Allowed values for this property are: "TRUNCATION"
        :type type: str

        :param config:
            The value to assign to the config property of this MemoryLimitConfiguration.
        :type config: oci.aidataplatform_dp.models.MemoryLimitConfigurationDetails

        """
        self.swagger_types = {
            'type': 'str',
            'config': 'MemoryLimitConfigurationDetails'
        }

        self.attribute_map = {
            'type': 'type',
            'config': 'config'
        }

        self._type = None
        self._config = None

    @property
    def type(self):
        """
        Gets the type of this MemoryLimitConfiguration.
        Type used for memory limiting. TRUNCATION applies truncation middleware.

        Allowed values for this property are: "TRUNCATION"


        :return: The type of this MemoryLimitConfiguration.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this MemoryLimitConfiguration.
        Type used for memory limiting. TRUNCATION applies truncation middleware.


        :param type: The type of this MemoryLimitConfiguration.
        :type: str
        """
        allowed_values = ["TRUNCATION"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def config(self):
        """
        Gets the config of this MemoryLimitConfiguration.

        :return: The config of this MemoryLimitConfiguration.
        :rtype: oci.aidataplatform_dp.models.MemoryLimitConfigurationDetails
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this MemoryLimitConfiguration.

        :param config: The config of this MemoryLimitConfiguration.
        :type: oci.aidataplatform_dp.models.MemoryLimitConfigurationDetails
        """
        self._config = config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
