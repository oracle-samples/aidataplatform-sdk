# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyManagerDflCompute(object):
    """
    Address and state of the service-managed DFL compute for a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyManagerDflCompute object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param gateway_uri:
            The value to assign to the gateway_uri property of this OntologyManagerDflCompute.
        :type gateway_uri: str

        :param cluster_key:
            The value to assign to the cluster_key property of this OntologyManagerDflCompute.
        :type cluster_key: str

        :param state:
            The value to assign to the state property of this OntologyManagerDflCompute.
        :type state: str

        :param is_enabled:
            The value to assign to the is_enabled property of this OntologyManagerDflCompute.
        :type is_enabled: bool

        """
        self.swagger_types = {
            'gateway_uri': 'str',
            'cluster_key': 'str',
            'state': 'str',
            'is_enabled': 'bool'
        }
        self.attribute_map = {
            'gateway_uri': 'gatewayUri',
            'cluster_key': 'clusterKey',
            'state': 'state',
            'is_enabled': 'isEnabled'
        }
        self._gateway_uri = None
        self._cluster_key = None
        self._state = None
        self._is_enabled = None

    @property
    def gateway_uri(self):
        """
        Gets the gateway_uri of this OntologyManagerDflCompute.
        Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.


        :return: The gateway_uri of this OntologyManagerDflCompute.
        :rtype: str
        """
        return self._gateway_uri

    @gateway_uri.setter
    def gateway_uri(self, gateway_uri):
        """
        Sets the gateway_uri of this OntologyManagerDflCompute.
        Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.


        :param gateway_uri: The gateway_uri of this OntologyManagerDflCompute.
        :type: str
        """
        self._gateway_uri = gateway_uri

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this OntologyManagerDflCompute.
        Key of the DFL compute.


        :return: The cluster_key of this OntologyManagerDflCompute.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this OntologyManagerDflCompute.
        Key of the DFL compute.


        :param cluster_key: The cluster_key of this OntologyManagerDflCompute.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def state(self):
        """
        Gets the state of this OntologyManagerDflCompute.
        Lifecycle state of the compute, when it is known.


        :return: The state of this OntologyManagerDflCompute.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this OntologyManagerDflCompute.
        Lifecycle state of the compute, when it is known.


        :param state: The state of this OntologyManagerDflCompute.
        :type: str
        """
        self._state = state

    @property
    def is_enabled(self):
        """
        **[Required]** Gets the is_enabled of this OntologyManagerDflCompute.
        Whether DI Agent compute is enabled for this AI Data Platform instance.


        :return: The is_enabled of this OntologyManagerDflCompute.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this OntologyManagerDflCompute.
        Whether DI Agent compute is enabled for this AI Data Platform instance.


        :param is_enabled: The is_enabled of this OntologyManagerDflCompute.
        :type: bool
        """
        self._is_enabled = is_enabled

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
