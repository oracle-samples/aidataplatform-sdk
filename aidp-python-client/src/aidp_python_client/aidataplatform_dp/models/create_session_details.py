# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateSessionDetails(object):
    """
    Details to create a session.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this CreateSessionDetails.
        :type id: str

        :param path:
            The value to assign to the path property of this CreateSessionDetails.
        :type path: str

        :param name:
            The value to assign to the name property of this CreateSessionDetails.
        :type name: str

        :param type:
            The value to assign to the type property of this CreateSessionDetails.
        :type type: str

        :param cluster_id:
            The value to assign to the cluster_id property of this CreateSessionDetails.
        :type cluster_id: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this CreateSessionDetails.
        :type agent_flow_key: str

        :param kernel:
            The value to assign to the kernel property of this CreateSessionDetails.
        :type kernel: oci.aidataplatform_dp.models.Kernel

        """
        self.swagger_types = {
            'id': 'str',
            'path': 'str',
            'name': 'str',
            'type': 'str',
            'cluster_id': 'str',
            'agent_flow_key': 'str',
            'kernel': 'Kernel'
        }

        self.attribute_map = {
            'id': 'id',
            'path': 'path',
            'name': 'name',
            'type': 'type',
            'cluster_id': 'cluster_id',
            'agent_flow_key': 'agentFlowKey',
            'kernel': 'kernel'
        }

        self._id = None
        self._path = None
        self._name = None
        self._type = None
        self._cluster_id = None
        self._agent_flow_key = None
        self._kernel = None

    @property
    def id(self):
        """
        Gets the id of this CreateSessionDetails.
        UUID of the session.


        :return: The id of this CreateSessionDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this CreateSessionDetails.
        UUID of the session.


        :param id: The id of this CreateSessionDetails.
        :type: str
        """
        self._id = id

    @property
    def path(self):
        """
        Gets the path of this CreateSessionDetails.
        Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.


        :return: The path of this CreateSessionDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this CreateSessionDetails.
        Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.


        :param path: The path of this CreateSessionDetails.
        :type: str
        """
        self._path = path

    @property
    def name(self):
        """
        Gets the name of this CreateSessionDetails.
        A user-friendly name for the session.


        :return: The name of this CreateSessionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateSessionDetails.
        A user-friendly name for the session.


        :param name: The name of this CreateSessionDetails.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        Gets the type of this CreateSessionDetails.
        Type of session.


        :return: The type of this CreateSessionDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateSessionDetails.
        Type of session.


        :param type: The type of this CreateSessionDetails.
        :type: str
        """
        self._type = type

    @property
    def cluster_id(self):
        """
        Gets the cluster_id of this CreateSessionDetails.
        Cluster ID.


        :return: The cluster_id of this CreateSessionDetails.
        :rtype: str
        """
        return self._cluster_id

    @cluster_id.setter
    def cluster_id(self, cluster_id):
        """
        Sets the cluster_id of this CreateSessionDetails.
        Cluster ID.


        :param cluster_id: The cluster_id of this CreateSessionDetails.
        :type: str
        """
        self._cluster_id = cluster_id

    @property
    def agent_flow_key(self):
        """
        Gets the agent_flow_key of this CreateSessionDetails.
        Key of the agent flow.


        :return: The agent_flow_key of this CreateSessionDetails.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this CreateSessionDetails.
        Key of the agent flow.


        :param agent_flow_key: The agent_flow_key of this CreateSessionDetails.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def kernel(self):
        """
        Gets the kernel of this CreateSessionDetails.

        :return: The kernel of this CreateSessionDetails.
        :rtype: oci.aidataplatform_dp.models.Kernel
        """
        return self._kernel

    @kernel.setter
    def kernel(self, kernel):
        """
        Sets the kernel of this CreateSessionDetails.

        :param kernel: The kernel of this CreateSessionDetails.
        :type: oci.aidataplatform_dp.models.Kernel
        """
        self._kernel = kernel

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
