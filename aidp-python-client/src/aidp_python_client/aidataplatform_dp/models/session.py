# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Session(object):
    """
    Notebook Session describes the Session context for a running instance of a Notebook. Each opened Notebook has a separate Session,
    but different Notebook kernels can use same Session if user wants to share data across various opened Notebooks.
    """

    #: A constant which can be used with the type property of a Session.
    #: This constant has a value of "notebook"
    TYPE_NOTEBOOK = "notebook"

    #: A constant which can be used with the type property of a Session.
    #: This constant has a value of "file"
    TYPE_FILE = "file"

    #: A constant which can be used with the type property of a Session.
    #: This constant has a value of "agentflow"
    TYPE_AGENTFLOW = "agentflow"

    #: A constant which can be used with the lifecycle_state property of a Session.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Session.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Session.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new Session object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this Session.
        :type id: str

        :param name:
            The value to assign to the name property of this Session.
        :type name: str

        :param path:
            The value to assign to the path property of this Session.
        :type path: str

        :param type:
            The value to assign to the type property of this Session.
            Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param cluster_id:
            The value to assign to the cluster_id property of this Session.
        :type cluster_id: str

        :param kernel:
            The value to assign to the kernel property of this Session.
        :type kernel: oci.aidataplatform_dp.models.Kernel

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this Session.
        :type agent_flow_key: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Session.
            Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'path': 'str',
            'type': 'str',
            'cluster_id': 'str',
            'kernel': 'Kernel',
            'agent_flow_key': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'path': 'path',
            'type': 'type',
            'cluster_id': 'cluster_id',
            'kernel': 'kernel',
            'agent_flow_key': 'agentFlowKey',
            'lifecycle_state': 'lifecycleState'
        }

        self._id = None
        self._name = None
        self._path = None
        self._type = None
        self._cluster_id = None
        self._kernel = None
        self._agent_flow_key = None
        self._lifecycle_state = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this Session.
        UUID of the notebook session.


        :return: The id of this Session.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Session.
        UUID of the notebook session.


        :param id: The id of this Session.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Session.
        A user-friendly name for the notebook session.


        :return: The name of this Session.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Session.
        A user-friendly name for the notebook session.


        :param name: The name of this Session.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this Session.
        Path to notebook session. For example, /data/test.ipynb


        :return: The path of this Session.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this Session.
        Path to notebook session. For example, /data/test.ipynb


        :param path: The path of this Session.
        :type: str
        """
        self._path = path

    @property
    def type(self):
        """
        Gets the type of this Session.
        Notebook session type.

        Allowed values for this property are: "notebook", "file", "agentflow", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this Session.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Session.
        Notebook session type.


        :param type: The type of this Session.
        :type: str
        """
        allowed_values = ["notebook", "file", "agentflow"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def cluster_id(self):
        """
        Gets the cluster_id of this Session.
        Cluster ID.


        :return: The cluster_id of this Session.
        :rtype: str
        """
        return self._cluster_id

    @cluster_id.setter
    def cluster_id(self, cluster_id):
        """
        Sets the cluster_id of this Session.
        Cluster ID.


        :param cluster_id: The cluster_id of this Session.
        :type: str
        """
        self._cluster_id = cluster_id

    @property
    def kernel(self):
        """
        Gets the kernel of this Session.

        :return: The kernel of this Session.
        :rtype: oci.aidataplatform_dp.models.Kernel
        """
        return self._kernel

    @kernel.setter
    def kernel(self, kernel):
        """
        Sets the kernel of this Session.

        :param kernel: The kernel of this Session.
        :type: oci.aidataplatform_dp.models.Kernel
        """
        self._kernel = kernel

    @property
    def agent_flow_key(self):
        """
        Gets the agent_flow_key of this Session.
        Agent Flow Key of an agent flow.


        :return: The agent_flow_key of this Session.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this Session.
        Agent Flow Key of an agent flow.


        :param agent_flow_key: The agent_flow_key of this Session.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Session.
        lifecycleState of a Notebook Session.

        Allowed values for this property are: "CREATING", "ACTIVE", "FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Session.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Session.
        lifecycleState of a Notebook Session.


        :param lifecycle_state: The lifecycle_state of this Session.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
