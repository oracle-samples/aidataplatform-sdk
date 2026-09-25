# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectObjectCollectionResponse(object):
    """
    Response envelope for operations returning ontology project folder contents.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectObjectCollectionResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data:
            The value to assign to the data property of this OntologyProjectObjectCollectionResponse.
        :type data: oci.aidataplatform_dp.models.OntologyProjectObjectCollection

        :param status:
            The value to assign to the status property of this OntologyProjectObjectCollectionResponse.
        :type status: int

        :param opc_request_id:
            The value to assign to the opc_request_id property of this OntologyProjectObjectCollectionResponse.
        :type opc_request_id: str

        :param timestamp:
            The value to assign to the timestamp property of this OntologyProjectObjectCollectionResponse.
        :type timestamp: datetime

        :param message:
            The value to assign to the message property of this OntologyProjectObjectCollectionResponse.
        :type message: str

        """
        self.swagger_types = {
            'data': 'OntologyProjectObjectCollection',
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
        Gets the data of this OntologyProjectObjectCollectionResponse.

        :return: The data of this OntologyProjectObjectCollectionResponse.
        :rtype: oci.aidataplatform_dp.models.OntologyProjectObjectCollection
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this OntologyProjectObjectCollectionResponse.

        :param data: The data of this OntologyProjectObjectCollectionResponse.
        :type: oci.aidataplatform_dp.models.OntologyProjectObjectCollection
        """
        self._data = data

    @property
    def status(self):
        """
        Gets the status of this OntologyProjectObjectCollectionResponse.
        HTTP-equivalent status code reported by the Ontology Manager backend.


        :return: The status of this OntologyProjectObjectCollectionResponse.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyProjectObjectCollectionResponse.
        HTTP-equivalent status code reported by the Ontology Manager backend.


        :param status: The status of this OntologyProjectObjectCollectionResponse.
        :type: int
        """
        self._status = status

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this OntologyProjectObjectCollectionResponse.
        Backend request identifier for tracing.


        :return: The opc_request_id of this OntologyProjectObjectCollectionResponse.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this OntologyProjectObjectCollectionResponse.
        Backend request identifier for tracing.


        :param opc_request_id: The opc_request_id of this OntologyProjectObjectCollectionResponse.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def timestamp(self):
        """
        Gets the timestamp of this OntologyProjectObjectCollectionResponse.
        Time the response was produced.


        :return: The timestamp of this OntologyProjectObjectCollectionResponse.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this OntologyProjectObjectCollectionResponse.
        Time the response was produced.


        :param timestamp: The timestamp of this OntologyProjectObjectCollectionResponse.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def message(self):
        """
        Gets the message of this OntologyProjectObjectCollectionResponse.
        Optional human-readable message describing the response.


        :return: The message of this OntologyProjectObjectCollectionResponse.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this OntologyProjectObjectCollectionResponse.
        Optional human-readable message describing the response.


        :param message: The message of this OntologyProjectObjectCollectionResponse.
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
