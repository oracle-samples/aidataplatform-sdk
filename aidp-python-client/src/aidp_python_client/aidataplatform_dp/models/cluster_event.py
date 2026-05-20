# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterEvent(object):
    """
    Properties of a event provided by the cluster.
    """

    #: A constant which can be used with the type property of a ClusterEvent.
    #: This constant has a value of "CLUSTER_PATCH_EVENT"
    TYPE_CLUSTER_PATCH_EVENT = "CLUSTER_PATCH_EVENT"

    #: A constant which can be used with the type property of a ClusterEvent.
    #: This constant has a value of "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT"
    TYPE_CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT = "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT"

    #: A constant which can be used with the type property of a ClusterEvent.
    #: This constant has a value of "CLUSTER_STATE_EVENT"
    TYPE_CLUSTER_STATE_EVENT = "CLUSTER_STATE_EVENT"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterEvent object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.ClusterStateEvent`
        * :class:`~oci.aidataplatform_dp.models.ClusterPatchEvent`
        * :class:`~oci.aidataplatform_dp.models.ClusterExecutionContextAvailabilityEvent`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClusterEvent.
            Allowed values for this property are: "CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT"
        :type type: str

        """
        self.swagger_types = {
            'type': 'str'
        }

        self.attribute_map = {
            'type': 'type'
        }

        self._type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'CLUSTER_STATE_EVENT':
            return 'ClusterStateEvent'

        if type == 'CLUSTER_PATCH_EVENT':
            return 'ClusterPatchEvent'

        if type == 'CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT':
            return 'ClusterExecutionContextAvailabilityEvent'
        else:
            return 'ClusterEvent'

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ClusterEvent.
        The type of the cluster event

        Allowed values for this property are: "CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT"


        :return: The type of this ClusterEvent.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ClusterEvent.
        The type of the cluster event


        :param type: The type of this ClusterEvent.
        :type: str
        """
        allowed_values = ["CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
