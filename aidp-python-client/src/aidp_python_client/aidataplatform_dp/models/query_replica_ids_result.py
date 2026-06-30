# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class QueryReplicaIdsResult(object):
    """
    Response payload containing compute replica identifiers that emitted matching metric data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new QueryReplicaIdsResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param replica_ids:
            The value to assign to the replica_ids property of this QueryReplicaIdsResult.
        :type replica_ids: list[str]

        """
        self.swagger_types = {
            'replica_ids': 'list[str]'
        }

        self.attribute_map = {
            'replica_ids': 'replicaIds'
        }

        self._replica_ids = None

    @property
    def replica_ids(self):
        """
        **[Required]** Gets the replica_ids of this QueryReplicaIdsResult.
        Distinct compute replica identifiers derived from the Monitoring `agentNode` dimension.


        :return: The replica_ids of this QueryReplicaIdsResult.
        :rtype: list[str]
        """
        return self._replica_ids

    @replica_ids.setter
    def replica_ids(self, replica_ids):
        """
        Sets the replica_ids of this QueryReplicaIdsResult.
        Distinct compute replica identifiers derived from the Monitoring `agentNode` dimension.


        :param replica_ids: The replica_ids of this QueryReplicaIdsResult.
        :type: list[str]
        """
        self._replica_ids = replica_ids

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
