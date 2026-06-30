# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentSessionContext(object):
    """
    Agent session context.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentSessionContext object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param retention_config:
            The value to assign to the retention_config property of this AgentSessionContext.
        :type retention_config: oci.aidataplatform_dp.models.SessionRetentionConfiguration

        """
        self.swagger_types = {
            'retention_config': 'SessionRetentionConfiguration'
        }

        self.attribute_map = {
            'retention_config': 'retentionConfig'
        }

        self._retention_config = None

    @property
    def retention_config(self):
        """
        Gets the retention_config of this AgentSessionContext.

        :return: The retention_config of this AgentSessionContext.
        :rtype: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        return self._retention_config

    @retention_config.setter
    def retention_config(self, retention_config):
        """
        Sets the retention_config of this AgentSessionContext.

        :param retention_config: The retention_config of this AgentSessionContext.
        :type: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        self._retention_config = retention_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
