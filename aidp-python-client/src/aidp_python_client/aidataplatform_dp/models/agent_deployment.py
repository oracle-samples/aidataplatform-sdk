# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDeployment(object):
    """
    Agent deployment details.
    """

    #: A constant which can be used with the deployment_type property of a AgentDeployment.
    #: This constant has a value of "TEST"
    DEPLOYMENT_TYPE_TEST = "TEST"

    #: A constant which can be used with the deployment_type property of a AgentDeployment.
    #: This constant has a value of "PROD"
    DEPLOYMENT_TYPE_PROD = "PROD"

    #: A constant which can be used with the deployment_type property of a AgentDeployment.
    #: This constant has a value of "CODE"
    DEPLOYMENT_TYPE_CODE = "CODE"

    #: A constant which can be used with the lifecycle_state property of a AgentDeployment.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a AgentDeployment.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentDeployment.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentDeployment.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the lifecycle_state property of a AgentDeployment.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDeployment object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AgentDeployment.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this AgentDeployment.
        :type display_name: str

        :param agent_key:
            The value to assign to the agent_key property of this AgentDeployment.
        :type agent_key: str

        :param agent_compute_key:
            The value to assign to the agent_compute_key property of this AgentDeployment.
        :type agent_compute_key: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this AgentDeployment.
        :type endpoint_url: str

        :param description:
            The value to assign to the description property of this AgentDeployment.
        :type description: str

        :param deployment_type:
            The value to assign to the deployment_type property of this AgentDeployment.
            Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type deployment_type: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AgentDeployment.
            Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param deployment_version:
            The value to assign to the deployment_version property of this AgentDeployment.
        :type deployment_version: str

        :param time_created:
            The value to assign to the time_created property of this AgentDeployment.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this AgentDeployment.
        :type created_by: str

        :param time_updated:
            The value to assign to the time_updated property of this AgentDeployment.
        :type time_updated: datetime

        :param updated_by:
            The value to assign to the updated_by property of this AgentDeployment.
        :type updated_by: str

        :param session_retention_config:
            The value to assign to the session_retention_config property of this AgentDeployment.
        :type session_retention_config: oci.aidataplatform_dp.models.SessionRetentionConfiguration

        :param o_auth_config:
            The value to assign to the o_auth_config property of this AgentDeployment.
        :type o_auth_config: oci.aidataplatform_dp.models.OAuthConfiguration

        :param agent_card_url:
            The value to assign to the agent_card_url property of this AgentDeployment.
        :type agent_card_url: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'agent_key': 'str',
            'agent_compute_key': 'str',
            'endpoint_url': 'str',
            'description': 'str',
            'deployment_type': 'str',
            'lifecycle_state': 'str',
            'deployment_version': 'str',
            'time_created': 'datetime',
            'created_by': 'str',
            'time_updated': 'datetime',
            'updated_by': 'str',
            'session_retention_config': 'SessionRetentionConfiguration',
            'o_auth_config': 'OAuthConfiguration',
            'agent_card_url': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'agent_key': 'agentKey',
            'agent_compute_key': 'agentComputeKey',
            'endpoint_url': 'endpointUrl',
            'description': 'description',
            'deployment_type': 'deploymentType',
            'lifecycle_state': 'lifecycleState',
            'deployment_version': 'deploymentVersion',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'time_updated': 'timeUpdated',
            'updated_by': 'updatedBy',
            'session_retention_config': 'sessionRetentionConfig',
            'o_auth_config': 'oAuthConfig',
            'agent_card_url': 'agentCardUrl'
        }

        self._key = None
        self._display_name = None
        self._agent_key = None
        self._agent_compute_key = None
        self._endpoint_url = None
        self._description = None
        self._deployment_type = None
        self._lifecycle_state = None
        self._deployment_version = None
        self._time_created = None
        self._created_by = None
        self._time_updated = None
        self._updated_by = None
        self._session_retention_config = None
        self._o_auth_config = None
        self._agent_card_url = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentDeployment.
        Identifier, generally UUID.


        :return: The key of this AgentDeployment.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentDeployment.
        Identifier, generally UUID.


        :param key: The key of this AgentDeployment.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this AgentDeployment.
        Display name.


        :return: The display_name of this AgentDeployment.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentDeployment.
        Display name.


        :param display_name: The display_name of this AgentDeployment.
        :type: str
        """
        self._display_name = display_name

    @property
    def agent_key(self):
        """
        **[Required]** Gets the agent_key of this AgentDeployment.
        The Agent key for which the session is started.


        :return: The agent_key of this AgentDeployment.
        :rtype: str
        """
        return self._agent_key

    @agent_key.setter
    def agent_key(self, agent_key):
        """
        Sets the agent_key of this AgentDeployment.
        The Agent key for which the session is started.


        :param agent_key: The agent_key of this AgentDeployment.
        :type: str
        """
        self._agent_key = agent_key

    @property
    def agent_compute_key(self):
        """
        Gets the agent_compute_key of this AgentDeployment.
        The Agent Compute Key where client can run or test the agent.


        :return: The agent_compute_key of this AgentDeployment.
        :rtype: str
        """
        return self._agent_compute_key

    @agent_compute_key.setter
    def agent_compute_key(self, agent_compute_key):
        """
        Sets the agent_compute_key of this AgentDeployment.
        The Agent Compute Key where client can run or test the agent.


        :param agent_compute_key: The agent_compute_key of this AgentDeployment.
        :type: str
        """
        self._agent_compute_key = agent_compute_key

    @property
    def endpoint_url(self):
        """
        **[Required]** Gets the endpoint_url of this AgentDeployment.
        The endpointUrl where the client should connect to communicate with the agent.


        :return: The endpoint_url of this AgentDeployment.
        :rtype: str
        """
        return self._endpoint_url

    @endpoint_url.setter
    def endpoint_url(self, endpoint_url):
        """
        Sets the endpoint_url of this AgentDeployment.
        The endpointUrl where the client should connect to communicate with the agent.


        :param endpoint_url: The endpoint_url of this AgentDeployment.
        :type: str
        """
        self._endpoint_url = endpoint_url

    @property
    def description(self):
        """
        Gets the description of this AgentDeployment.
        deployment description.


        :return: The description of this AgentDeployment.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentDeployment.
        deployment description.


        :param description: The description of this AgentDeployment.
        :type: str
        """
        self._description = description

    @property
    def deployment_type(self):
        """
        **[Required]** Gets the deployment_type of this AgentDeployment.
        Type of an agent deployment.

        Allowed values for this property are: "TEST", "PROD", "CODE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The deployment_type of this AgentDeployment.
        :rtype: str
        """
        return self._deployment_type

    @deployment_type.setter
    def deployment_type(self, deployment_type):
        """
        Sets the deployment_type of this AgentDeployment.
        Type of an agent deployment.


        :param deployment_type: The deployment_type of this AgentDeployment.
        :type: str
        """
        allowed_values = ["TEST", "PROD", "CODE"]
        if not value_allowed_none_or_none_sentinel(deployment_type, allowed_values):
            deployment_type = 'UNKNOWN_ENUM_VALUE'
        self._deployment_type = deployment_type

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this AgentDeployment.
        LifecycleState of an Agent Session or Deployment.

        Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this AgentDeployment.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this AgentDeployment.
        LifecycleState of an Agent Session or Deployment.


        :param lifecycle_state: The lifecycle_state of this AgentDeployment.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def deployment_version(self):
        """
        **[Required]** Gets the deployment_version of this AgentDeployment.
        Version of agent deployed on compute.


        :return: The deployment_version of this AgentDeployment.
        :rtype: str
        """
        return self._deployment_version

    @deployment_version.setter
    def deployment_version(self, deployment_version):
        """
        Sets the deployment_version of this AgentDeployment.
        Version of agent deployed on compute.


        :param deployment_version: The deployment_version of this AgentDeployment.
        :type: str
        """
        self._deployment_version = deployment_version

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this AgentDeployment.
        The date and time the Agent session was created.


        :return: The time_created of this AgentDeployment.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentDeployment.
        The date and time the Agent session was created.


        :param time_created: The time_created of this AgentDeployment.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this AgentDeployment.
        The OCID of the user/principal who created the agent session.


        :return: The created_by of this AgentDeployment.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AgentDeployment.
        The OCID of the user/principal who created the agent session.


        :param created_by: The created_by of this AgentDeployment.
        :type: str
        """
        self._created_by = created_by

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentDeployment.
        The date and time the agent deployment was updated.


        :return: The time_updated of this AgentDeployment.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentDeployment.
        The date and time the agent deployment was updated.


        :param time_updated: The time_updated of this AgentDeployment.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def updated_by(self):
        """
        Gets the updated_by of this AgentDeployment.
        The OCID of the user/principal who re-deployed the existing agent deployment.


        :return: The updated_by of this AgentDeployment.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this AgentDeployment.
        The OCID of the user/principal who re-deployed the existing agent deployment.


        :param updated_by: The updated_by of this AgentDeployment.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def session_retention_config(self):
        """
        Gets the session_retention_config of this AgentDeployment.

        :return: The session_retention_config of this AgentDeployment.
        :rtype: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        return self._session_retention_config

    @session_retention_config.setter
    def session_retention_config(self, session_retention_config):
        """
        Sets the session_retention_config of this AgentDeployment.

        :param session_retention_config: The session_retention_config of this AgentDeployment.
        :type: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        self._session_retention_config = session_retention_config

    @property
    def o_auth_config(self):
        """
        Gets the o_auth_config of this AgentDeployment.

        :return: The o_auth_config of this AgentDeployment.
        :rtype: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        return self._o_auth_config

    @o_auth_config.setter
    def o_auth_config(self, o_auth_config):
        """
        Sets the o_auth_config of this AgentDeployment.

        :param o_auth_config: The o_auth_config of this AgentDeployment.
        :type: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        self._o_auth_config = o_auth_config

    @property
    def agent_card_url(self):
        """
        Gets the agent_card_url of this AgentDeployment.
        AgentCard base URL.


        :return: The agent_card_url of this AgentDeployment.
        :rtype: str
        """
        return self._agent_card_url

    @agent_card_url.setter
    def agent_card_url(self, agent_card_url):
        """
        Sets the agent_card_url of this AgentDeployment.
        AgentCard base URL.


        :param agent_card_url: The agent_card_url of this AgentDeployment.
        :type: str
        """
        self._agent_card_url = agent_card_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
