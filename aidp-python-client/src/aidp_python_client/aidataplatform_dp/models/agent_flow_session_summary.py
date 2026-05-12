# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowSessionSummary(object):
    """
    Agent flow session summary.
    """

    #: A constant which can be used with the lifecycle_state property of a AgentFlowSessionSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowSessionSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowSessionSummary.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowSessionSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the lifecycle_state property of a AgentFlowSessionSummary.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowSessionSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this AgentFlowSessionSummary.
        :type display_name: str

        :param key:
            The value to assign to the key property of this AgentFlowSessionSummary.
        :type key: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this AgentFlowSessionSummary.
        :type agent_flow_key: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AgentFlowSessionSummary.
            Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"
        :type lifecycle_state: str

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this AgentFlowSessionSummary.
        :type agent_flow_compute_key: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this AgentFlowSessionSummary.
        :type endpoint_url: str

        :param time_created:
            The value to assign to the time_created property of this AgentFlowSessionSummary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this AgentFlowSessionSummary.
        :type created_by: str

        :param time_started:
            The value to assign to the time_started property of this AgentFlowSessionSummary.
        :type time_started: datetime

        :param time_ended:
            The value to assign to the time_ended property of this AgentFlowSessionSummary.
        :type time_ended: datetime

        :param duration:
            The value to assign to the duration property of this AgentFlowSessionSummary.
        :type duration: float

        :param tokens:
            The value to assign to the tokens property of this AgentFlowSessionSummary.
        :type tokens: int

        """
        self.swagger_types = {
            'display_name': 'str',
            'key': 'str',
            'agent_flow_key': 'str',
            'lifecycle_state': 'str',
            'agent_flow_compute_key': 'str',
            'endpoint_url': 'str',
            'time_created': 'datetime',
            'created_by': 'str',
            'time_started': 'datetime',
            'time_ended': 'datetime',
            'duration': 'float',
            'tokens': 'int'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'key': 'key',
            'agent_flow_key': 'agentFlowKey',
            'lifecycle_state': 'lifecycleState',
            'agent_flow_compute_key': 'agentFlowComputeKey',
            'endpoint_url': 'endpointUrl',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'time_started': 'timeStarted',
            'time_ended': 'timeEnded',
            'duration': 'duration',
            'tokens': 'tokens'
        }

        self._display_name = None
        self._key = None
        self._agent_flow_key = None
        self._lifecycle_state = None
        self._agent_flow_compute_key = None
        self._endpoint_url = None
        self._time_created = None
        self._created_by = None
        self._time_started = None
        self._time_ended = None
        self._duration = None
        self._tokens = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this AgentFlowSessionSummary.
        Display name.


        :return: The display_name of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentFlowSessionSummary.
        Display name.


        :param display_name: The display_name of this AgentFlowSessionSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentFlowSessionSummary.
        Agent Flow Session identifier.


        :return: The key of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlowSessionSummary.
        Agent Flow Session identifier.


        :param key: The key of this AgentFlowSessionSummary.
        :type: str
        """
        self._key = key

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this AgentFlowSessionSummary.
        The Agent Flow key for which the session is started.


        :return: The agent_flow_key of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this AgentFlowSessionSummary.
        The Agent Flow key for which the session is started.


        :param agent_flow_key: The agent_flow_key of this AgentFlowSessionSummary.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this AgentFlowSessionSummary.
        LifecycleState of an Agent Flow Session or Deployment.

        Allowed values for this property are: "CREATING", "ACTIVE", "INACTIVE", "FAILED", "DELETED"


        :return: The lifecycle_state of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this AgentFlowSessionSummary.
        LifecycleState of an Agent Flow Session or Deployment.


        :param lifecycle_state: The lifecycle_state of this AgentFlowSessionSummary.
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
    def agent_flow_compute_key(self):
        """
        Gets the agent_flow_compute_key of this AgentFlowSessionSummary.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :return: The agent_flow_compute_key of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this AgentFlowSessionSummary.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :param agent_flow_compute_key: The agent_flow_compute_key of this AgentFlowSessionSummary.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    @property
    def endpoint_url(self):
        """
        Gets the endpoint_url of this AgentFlowSessionSummary.
        The endpointUrl where the client should connect to communicate with the Agent.


        :return: The endpoint_url of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._endpoint_url

    @endpoint_url.setter
    def endpoint_url(self, endpoint_url):
        """
        Sets the endpoint_url of this AgentFlowSessionSummary.
        The endpointUrl where the client should connect to communicate with the Agent.


        :param endpoint_url: The endpoint_url of this AgentFlowSessionSummary.
        :type: str
        """
        self._endpoint_url = endpoint_url

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this AgentFlowSessionSummary.
        The date and time the Agent flow session was created.


        :return: The time_created of this AgentFlowSessionSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentFlowSessionSummary.
        The date and time the Agent flow session was created.


        :param time_created: The time_created of this AgentFlowSessionSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this AgentFlowSessionSummary.
        The OCID of the user/principal who created the Agent flow session.


        :return: The created_by of this AgentFlowSessionSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this AgentFlowSessionSummary.
        The OCID of the user/principal who created the Agent flow session.


        :param created_by: The created_by of this AgentFlowSessionSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def time_started(self):
        """
        Gets the time_started of this AgentFlowSessionSummary.
        The date and time the session was started


        :return: The time_started of this AgentFlowSessionSummary.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this AgentFlowSessionSummary.
        The date and time the session was started


        :param time_started: The time_started of this AgentFlowSessionSummary.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_ended(self):
        """
        Gets the time_ended of this AgentFlowSessionSummary.
        The date and time the session was ended


        :return: The time_ended of this AgentFlowSessionSummary.
        :rtype: datetime
        """
        return self._time_ended

    @time_ended.setter
    def time_ended(self, time_ended):
        """
        Sets the time_ended of this AgentFlowSessionSummary.
        The date and time the session was ended


        :param time_ended: The time_ended of this AgentFlowSessionSummary.
        :type: datetime
        """
        self._time_ended = time_ended

    @property
    def duration(self):
        """
        Gets the duration of this AgentFlowSessionSummary.
        Agent flow session duration


        :return: The duration of this AgentFlowSessionSummary.
        :rtype: float
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """
        Sets the duration of this AgentFlowSessionSummary.
        Agent flow session duration


        :param duration: The duration of this AgentFlowSessionSummary.
        :type: float
        """
        self._duration = duration

    @property
    def tokens(self):
        """
        Gets the tokens of this AgentFlowSessionSummary.
        Agent flow session token usage


        :return: The tokens of this AgentFlowSessionSummary.
        :rtype: int
        """
        return self._tokens

    @tokens.setter
    def tokens(self, tokens):
        """
        Sets the tokens of this AgentFlowSessionSummary.
        Agent flow session token usage


        :param tokens: The tokens of this AgentFlowSessionSummary.
        :type: int
        """
        self._tokens = tokens

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
