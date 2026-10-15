# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationMetadata(object):
    """
    Metadata recorded with the inference request and response events.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationMetadata object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param region:
            The value to assign to the region property of this InferenceInvocationMetadata.
        :type region: str

        :param replica_id:
            The value to assign to the replica_id property of this InferenceInvocationMetadata.
        :type replica_id: str

        :param caller:
            The value to assign to the caller property of this InferenceInvocationMetadata.
        :type caller: str

        """
        self.swagger_types = {
            'region': 'str',
            'replica_id': 'str',
            'caller': 'str'
        }
        self.attribute_map = {
            'region': 'region',
            'replica_id': 'replicaId',
            'caller': 'caller'
        }
        self._region = None
        self._replica_id = None
        self._caller = None

    @property
    def region(self):
        """
        Gets the region of this InferenceInvocationMetadata.
        OCI region that served the inference invocation.


        :return: The region of this InferenceInvocationMetadata.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region):
        """
        Sets the region of this InferenceInvocationMetadata.
        OCI region that served the inference invocation.


        :param region: The region of this InferenceInvocationMetadata.
        :type: str
        """
        self._region = region

    @property
    def replica_id(self):
        """
        Gets the replica_id of this InferenceInvocationMetadata.
        Identifier of the model deployment replica that served the invocation.


        :return: The replica_id of this InferenceInvocationMetadata.
        :rtype: str
        """
        return self._replica_id

    @replica_id.setter
    def replica_id(self, replica_id):
        """
        Sets the replica_id of this InferenceInvocationMetadata.
        Identifier of the model deployment replica that served the invocation.


        :param replica_id: The replica_id of this InferenceInvocationMetadata.
        :type: str
        """
        self._replica_id = replica_id

    @property
    def caller(self):
        """
        Gets the caller of this InferenceInvocationMetadata.
        Caller recorded on the inference request event.


        :return: The caller of this InferenceInvocationMetadata.
        :rtype: str
        """
        return self._caller

    @caller.setter
    def caller(self, caller):
        """
        Sets the caller of this InferenceInvocationMetadata.
        Caller recorded on the inference request event.


        :param caller: The caller of this InferenceInvocationMetadata.
        :type: str
        """
        self._caller = caller

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
