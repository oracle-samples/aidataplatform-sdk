# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowDeploymentSummary(object):
    """
    Agent flow deployment summary.
    """

    #: A constant which can be used with the lifecycle_state property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the deployment_type property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "TEST"
    DEPLOYMENT_TYPE_TEST = "TEST"

    #: A constant which can be used with the deployment_type property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "PROD"
    DEPLOYMENT_TYPE_PROD = "PROD"

    #: A constant which can be used with the deployment_type property of a AgentFlowDeploymentSummary.
    #: This constant has a value of "CODE"
    DEPLOYMENT_TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowDeploymentSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this AgentFlowDeploymentSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this AgentFlowDeploymentSummary.
        :type description: str

        :param key:
            The value to assign to the key property of this AgentFlowDeploymentSummary.
        :type key: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AgentFlowDeploymentSummary.
            Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"
        :type lifecycle_state: str

        :param deployment_type:
            The value to assign to the deployment_type property of this AgentFlowDeploymentSummary.
            Allowed values for this property are: "TEST", "PROD", "CODE"
        :type deployment_type: str

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this AgentFlowDeploymentSummary.
        :type agent_flow_compute_key: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this AgentFlowDeploymentSummary.
        :type agent_flow_key: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this AgentFlowDeploymentSummary.
        :type endpoint_url: str

        :param deployment_version:
            The value to assign to the deployment_version property of this AgentFlowDeploymentSummary.
        :type deployment_version: str

        :param time_created:
            The value to assign to the time_created property of this AgentFlowDeploymentSummary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this AgentFlowDeploymentSummary.
        :type created_by: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'key': 'str',
            'lifecycle_state': 'str',
            'deployment_type': 'str',
            'agent_flow_compute_key': 'str',
            'agent_flow_key': 'str',
            'endpoint_url': 'str',
            'deployment_version': 'str',
            'time_created': 'datetime',
            'created_by': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'key': 'key',
            'lifecycle_state': 'lifecycleState',
            'deployment_type': 'deploymentType',
            'agent_flow_compute_key': 'agentFlowComputeKey',
            'agent_flow_key': 'agentFlowKey',
            'endpoint_url': 'endpointUrl',
            'deployment_version': 'deploymentVersion',
            'time_created': 'timeCreated',
            'created_by': 'createdBy'
        }

        self._display_name = None
        self._description = None
        self._key = None
        self._lifecycle_state = None
        self._deployment_type = None
        self._agent_flow_compute_key = None
        self._agent_flow_key = None
        self._endpoint_url = None
        self._deployment_version = None
        self._time_created = None
        self._created_by = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this AgentFlowDeploymentSummary.
        Display name.


        :return: The display_name of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentFlowDeploymentSummary.
        Display name.


        :param display_name: The display_name of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this AgentFlowDeploymentSummary.
        deployment description.


        :return: The description of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentFlowDeploymentSummary.
        deployment description.


        :param description: The description of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._description = description

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentFlowDeploymentSummary.
        Identifier, generally uuid.


        :return: The key of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlowDeploymentSummary.
        Identifier, generally uuid.


        :param key: The key of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._key = key

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this AgentFlowDeploymentSummary.
        LifecycleState of an Agent Flow Session or Deployment.

        Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"


        :return: The lifecycle_state of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this AgentFlowDeploymentSummary.
        LifecycleState of an Agent Flow Session or Deployment.


        :param lifecycle_state: The lifecycle_state of this AgentFlowDeploymentSummary.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def deployment_type(self):
        """
        **[Required]** Gets the deployment_type of this AgentFlowDeploymentSummary.
        Type of an Agent Flow Deployment.

        Allowed values for this property are: "TEST", "PROD", "CODE"


        :return: The deployment_type of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._deployment_type

    @deployment_type.setter
    def deployment_type(self, deployment_type):
        """
        Sets the deployment_type of this AgentFlowDeploymentSummary.
        Type of an Agent Flow Deployment.


        :param deployment_type: The deployment_type of this AgentFlowDeploymentSummary.
        :type: str
        """
        allowed_values = ["TEST", "PROD", "CODE"]
        if not value_allowed_none_or_none_sentinel(deployment_type, allowed_values):
            raise ValueError(
                "Invalid value for `deployment_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._deployment_type = deployment_type

    @property
    def agent_flow_compute_key(self):
        """
        Gets the agent_flow_compute_key of this AgentFlowDeploymentSummary.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :return: The agent_flow_compute_key of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this AgentFlowDeploymentSummary.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :param agent_flow_compute_key: The agent_flow_compute_key of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    @property
    def agent_flow_key(self):
        """
        Gets the agent_flow_key of this AgentFlowDeploymentSummary.
        The Agent Flow key for which the session is started.


        :return: The agent_flow_key of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this AgentFlowDeploymentSummary.
        The Agent Flow key for which the session is started.


        :param agent_flow_key: The agent_flow_key of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def endpoint_url(self):
        """
        Gets the endpoint_url of this AgentFlowDeploymentSummary.
        The endpointUrl where the client should connect to communicate with the Agent.


        :return: The endpoint_url of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._endpoint_url

    @endpoint_url.setter
    def endpoint_url(self, endpoint_url):
        """
        Sets the endpoint_url of this AgentFlowDeploymentSummary.
        The endpointUrl where the client should connect to communicate with the Agent.


        :param endpoint_url: The endpoint_url of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._endpoint_url = endpoint_url

    @property
    def deployment_version(self):
        """
        **[Required]** Gets the deployment_version of this AgentFlowDeploymentSummary.
        version of agent flow deployed on compute.


        :return: The deployment_version of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._deployment_version

    @deployment_version.setter
    def deployment_version(self, deployment_version):
        """
        Sets the deployment_version of this AgentFlowDeploymentSummary.
        version of agent flow deployed on compute.


        :param deployment_version: The deployment_version of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._deployment_version = deployment_version

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this AgentFlowDeploymentSummary.
        The date and time the Agent flow session was created.


        :return: The time_created of this AgentFlowDeploymentSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentFlowDeploymentSummary.
        The date and time the Agent flow session was created.


        :param time_created: The time_created of this AgentFlowDeploymentSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this AgentFlowDeploymentSummary.
        The OCID of the user/principal who created the Agent flow session.


        :return: The created_by of this AgentFlowDeploymentSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AgentFlowDeploymentSummary.
        The OCID of the user/principal who created the Agent flow session.


        :param created_by: The created_by of this AgentFlowDeploymentSummary.
        :type: str
        """
        self._created_by = created_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
