# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_event import ClusterEvent
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterExecutionContextAvailabilityEvent(ClusterEvent):
    """
    The information about the cluster execution context availability event.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterExecutionContextAvailabilityEvent object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ClusterExecutionContextAvailabilityEvent.type` attribute
        of this class is ``CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClusterExecutionContextAvailabilityEvent.
            Allowed values for this property are: "CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT"
        :type type: str

        :param number_of_execution_contexts:
            The value to assign to the number_of_execution_contexts property of this ClusterExecutionContextAvailabilityEvent.
        :type number_of_execution_contexts: int

        """
        self.swagger_types = {
            'type': 'str',
            'number_of_execution_contexts': 'int'
        }

        self.attribute_map = {
            'type': 'type',
            'number_of_execution_contexts': 'numberOfExecutionContexts'
        }

        self._type = None
        self._number_of_execution_contexts = None
        self._type = 'CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT'

    @property
    def number_of_execution_contexts(self):
        """
        **[Required]** Gets the number_of_execution_contexts of this ClusterExecutionContextAvailabilityEvent.
        Number of available execution contexts for this cluster.


        :return: The number_of_execution_contexts of this ClusterExecutionContextAvailabilityEvent.
        :rtype: int
        """
        return self._number_of_execution_contexts

    @number_of_execution_contexts.setter
    def number_of_execution_contexts(self, number_of_execution_contexts):
        """
        Sets the number_of_execution_contexts of this ClusterExecutionContextAvailabilityEvent.
        Number of available execution contexts for this cluster.


        :param number_of_execution_contexts: The number_of_execution_contexts of this ClusterExecutionContextAvailabilityEvent.
        :type: int
        """
        self._number_of_execution_contexts = number_of_execution_contexts

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
