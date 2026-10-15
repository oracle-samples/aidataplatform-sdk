# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogMetadata(object):
    """
    Selected metadata of a log event. Every field may be null when the event does not carry it.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogMetadata object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param replica_id:
            The value to assign to the replica_id property of this DeploymentLogMetadata.
        :type replica_id: str

        :param opc_request_id:
            The value to assign to the opc_request_id property of this DeploymentLogMetadata.
        :type opc_request_id: str

        :param source:
            The value to assign to the source property of this DeploymentLogMetadata.
        :type source: str

        :param region:
            The value to assign to the region property of this DeploymentLogMetadata.
        :type region: str

        :param error_code:
            The value to assign to the error_code property of this DeploymentLogMetadata.
        :type error_code: str

        """
        self.swagger_types = {
            'replica_id': 'str',
            'opc_request_id': 'str',
            'source': 'str',
            'region': 'str',
            'error_code': 'str'
        }
        self.attribute_map = {
            'replica_id': 'replicaId',
            'opc_request_id': 'opcRequestId',
            'source': 'source',
            'region': 'region',
            'error_code': 'errorCode'
        }
        self._replica_id = None
        self._opc_request_id = None
        self._source = None
        self._region = None
        self._error_code = None

    @property
    def replica_id(self):
        """
        Gets the replica_id of this DeploymentLogMetadata.
        Emitting replica or source scope, when the event carries one.


        :return: The replica_id of this DeploymentLogMetadata.
        :rtype: str
        """
        return self._replica_id

    @replica_id.setter
    def replica_id(self, replica_id):
        """
        Sets the replica_id of this DeploymentLogMetadata.
        Emitting replica or source scope, when the event carries one.


        :param replica_id: The replica_id of this DeploymentLogMetadata.
        :type: str
        """
        self._replica_id = replica_id

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this DeploymentLogMetadata.
        Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.


        :return: The opc_request_id of this DeploymentLogMetadata.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this DeploymentLogMetadata.
        Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.


        :param opc_request_id: The opc_request_id of this DeploymentLogMetadata.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def source(self):
        """
        Gets the source of this DeploymentLogMetadata.
        Logical producer of the event within the deployment runtime.


        :return: The source of this DeploymentLogMetadata.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this DeploymentLogMetadata.
        Logical producer of the event within the deployment runtime.


        :param source: The source of this DeploymentLogMetadata.
        :type: str
        """
        self._source = source

    @property
    def region(self):
        """
        Gets the region of this DeploymentLogMetadata.
        Region the event was emitted from, when the event carries one.


        :return: The region of this DeploymentLogMetadata.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region):
        """
        Sets the region of this DeploymentLogMetadata.
        Region the event was emitted from, when the event carries one.


        :param region: The region of this DeploymentLogMetadata.
        :type: str
        """
        self._region = region

    @property
    def error_code(self):
        """
        Gets the error_code of this DeploymentLogMetadata.
        Producer error code, when the event carries one.


        :return: The error_code of this DeploymentLogMetadata.
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """
        Sets the error_code of this DeploymentLogMetadata.
        Producer error code, when the event carries one.


        :param error_code: The error_code of this DeploymentLogMetadata.
        :type: str
        """
        self._error_code = error_code

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
