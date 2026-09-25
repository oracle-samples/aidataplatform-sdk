# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeSearchResponse(object):
    """
    Response envelope for design-time ontology tree search results.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeSearchResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data:
            The value to assign to the data property of this OntologyGraphTreeSearchResponse.
        :type data: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResult

        :param status:
            The value to assign to the status property of this OntologyGraphTreeSearchResponse.
        :type status: int

        :param opc_request_id:
            The value to assign to the opc_request_id property of this OntologyGraphTreeSearchResponse.
        :type opc_request_id: str

        :param timestamp:
            The value to assign to the timestamp property of this OntologyGraphTreeSearchResponse.
        :type timestamp: datetime

        :param message:
            The value to assign to the message property of this OntologyGraphTreeSearchResponse.
        :type message: str

        """
        self.swagger_types = {
            'data': 'OntologyGraphTreeSearchResult',
            'status': 'int',
            'opc_request_id': 'str',
            'timestamp': 'datetime',
            'message': 'str'
        }

        self.attribute_map = {
            'data': 'data',
            'status': 'status',
            'opc_request_id': 'opcRequestId',
            'timestamp': 'timestamp',
            'message': 'message'
        }

        self._data = None
        self._status = None
        self._opc_request_id = None
        self._timestamp = None
        self._message = None

    @property
    def data(self):
        """
        Gets the data of this OntologyGraphTreeSearchResponse.

        :return: The data of this OntologyGraphTreeSearchResponse.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResult
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this OntologyGraphTreeSearchResponse.

        :param data: The data of this OntologyGraphTreeSearchResponse.
        :type: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResult
        """
        self._data = data

    @property
    def status(self):
        """
        Gets the status of this OntologyGraphTreeSearchResponse.
        HTTP-equivalent status code reported by the Ontology Manager backend.


        :return: The status of this OntologyGraphTreeSearchResponse.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyGraphTreeSearchResponse.
        HTTP-equivalent status code reported by the Ontology Manager backend.


        :param status: The status of this OntologyGraphTreeSearchResponse.
        :type: int
        """
        self._status = status

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this OntologyGraphTreeSearchResponse.
        Backend request identifier for tracing.


        :return: The opc_request_id of this OntologyGraphTreeSearchResponse.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this OntologyGraphTreeSearchResponse.
        Backend request identifier for tracing.


        :param opc_request_id: The opc_request_id of this OntologyGraphTreeSearchResponse.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def timestamp(self):
        """
        Gets the timestamp of this OntologyGraphTreeSearchResponse.
        Time the response was produced.


        :return: The timestamp of this OntologyGraphTreeSearchResponse.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this OntologyGraphTreeSearchResponse.
        Time the response was produced.


        :param timestamp: The timestamp of this OntologyGraphTreeSearchResponse.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def message(self):
        """
        Gets the message of this OntologyGraphTreeSearchResponse.
        Optional human-readable message describing the response.


        :return: The message of this OntologyGraphTreeSearchResponse.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this OntologyGraphTreeSearchResponse.
        Optional human-readable message describing the response.


        :param message: The message of this OntologyGraphTreeSearchResponse.
        :type: str
        """
        self._message = message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
