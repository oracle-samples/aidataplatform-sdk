# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyDflConnection(object):
    """
    Summary of one DFL connection registry entry.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyDflConnection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param uri:
            The value to assign to the uri property of this OntologyDflConnection.
        :type uri: str

        :param kind:
            The value to assign to the kind property of this OntologyDflConnection.
        :type kind: str

        :param health_status:
            The value to assign to the health_status property of this OntologyDflConnection.
        :type health_status: str

        """
        self.swagger_types = {
            'uri': 'str',
            'kind': 'str',
            'health_status': 'str'
        }
        self.attribute_map = {
            'uri': 'uri',
            'kind': 'kind',
            'health_status': 'healthStatus'
        }
        self._uri = None
        self._kind = None
        self._health_status = None

    @property
    def uri(self):
        """
        Gets the uri of this OntologyDflConnection.
        Exact DFL connection URI, for example `oracle://biairline`.


        :return: The uri of this OntologyDflConnection.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """
        Sets the uri of this OntologyDflConnection.
        Exact DFL connection URI, for example `oracle://biairline`.


        :param uri: The uri of this OntologyDflConnection.
        :type: str
        """
        self._uri = uri

    @property
    def kind(self):
        """
        Gets the kind of this OntologyDflConnection.
        DFL connection kind reported by the registry, for example `jdbc` or `duckdb`.


        :return: The kind of this OntologyDflConnection.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this OntologyDflConnection.
        DFL connection kind reported by the registry, for example `jdbc` or `duckdb`.


        :param kind: The kind of this OntologyDflConnection.
        :type: str
        """
        self._kind = kind

    @property
    def health_status(self):
        """
        Gets the health_status of this OntologyDflConnection.
        DFL's verdict from its last probe of this connection, for example `healthy` or `degraded`.
        Registration succeeding does not mean the connection works; this is what says whether it does.
        Absent until DFL has probed the connection, which happens shortly after it is registered.


        :return: The health_status of this OntologyDflConnection.
        :rtype: str
        """
        return self._health_status

    @health_status.setter
    def health_status(self, health_status):
        """
        Sets the health_status of this OntologyDflConnection.
        DFL's verdict from its last probe of this connection, for example `healthy` or `degraded`.
        Registration succeeding does not mean the connection works; this is what says whether it does.
        Absent until DFL has probed the connection, which happens shortly after it is registered.


        :param health_status: The health_status of this OntologyDflConnection.
        :type: str
        """
        self._health_status = health_status

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
