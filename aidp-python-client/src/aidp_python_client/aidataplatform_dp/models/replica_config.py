# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ReplicaConfig(object):
    """
    AI Compute replica configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ReplicaConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param min_replica:
            The value to assign to the min_replica property of this ReplicaConfig.
        :type min_replica: int

        :param max_replica:
            The value to assign to the max_replica property of this ReplicaConfig.
        :type max_replica: int

        """
        self.swagger_types = {
            'min_replica': 'int',
            'max_replica': 'int'
        }

        self.attribute_map = {
            'min_replica': 'minReplica',
            'max_replica': 'maxReplica'
        }

        self._min_replica = None
        self._max_replica = None

    @property
    def min_replica(self):
        """
        Gets the min_replica of this ReplicaConfig.
        Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.


        :return: The min_replica of this ReplicaConfig.
        :rtype: int
        """
        return self._min_replica

    @min_replica.setter
    def min_replica(self, min_replica):
        """
        Sets the min_replica of this ReplicaConfig.
        Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.


        :param min_replica: The min_replica of this ReplicaConfig.
        :type: int
        """
        self._min_replica = min_replica

    @property
    def max_replica(self):
        """
        Gets the max_replica of this ReplicaConfig.
        Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.


        :return: The max_replica of this ReplicaConfig.
        :rtype: int
        """
        return self._max_replica

    @max_replica.setter
    def max_replica(self, max_replica):
        """
        Sets the max_replica of this ReplicaConfig.
        Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.


        :param max_replica: The max_replica of this ReplicaConfig.
        :type: int
        """
        self._max_replica = max_replica

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
