# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowGuardrailsSummary(object):
    """
    Guardrails Summary information
    """

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "CONTENT_MODERATION"
    POLICY_TYPE_CONTENT_MODERATION = "CONTENT_MODERATION"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "PROMPT_ATTACKS_PREVENTION"
    POLICY_TYPE_PROMPT_ATTACKS_PREVENTION = "PROMPT_ATTACKS_PREVENTION"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "PII_DETECTION"
    POLICY_TYPE_PII_DETECTION = "PII_DETECTION"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "DENIED_TOPICS"
    POLICY_TYPE_DENIED_TOPICS = "DENIED_TOPICS"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "WORD_FILTERS"
    POLICY_TYPE_WORD_FILTERS = "WORD_FILTERS"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "CONTEXTUAL_GROUNDING"
    POLICY_TYPE_CONTEXTUAL_GROUNDING = "CONTEXTUAL_GROUNDING"

    #: A constant which can be used with the policy_type property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "CUSTOM_POLICY"
    POLICY_TYPE_CUSTOM_POLICY = "CUSTOM_POLICY"

    #: A constant which can be used with the action property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "BLOCK"
    ACTION_BLOCK = "BLOCK"

    #: A constant which can be used with the action property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "INFORM"
    ACTION_INFORM = "INFORM"

    #: A constant which can be used with the action property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "MASK"
    ACTION_MASK = "MASK"

    #: A constant which can be used with the scope property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "USER_REQUEST"
    SCOPE_USER_REQUEST = "USER_REQUEST"

    #: A constant which can be used with the scope property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "AGENT_RESPONSE"
    SCOPE_AGENT_RESPONSE = "AGENT_RESPONSE"

    #: A constant which can be used with the scope property of a AgentFlowGuardrailsSummary.
    #: This constant has a value of "BOTH"
    SCOPE_BOTH = "BOTH"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowGuardrailsSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param policy_type:
            The value to assign to the policy_type property of this AgentFlowGuardrailsSummary.
            Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"
        :type policy_type: str

        :param policy_name:
            The value to assign to the policy_name property of this AgentFlowGuardrailsSummary.
        :type policy_name: str

        :param policy_description:
            The value to assign to the policy_description property of this AgentFlowGuardrailsSummary.
        :type policy_description: str

        :param action:
            The value to assign to the action property of this AgentFlowGuardrailsSummary.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        :param scope:
            The value to assign to the scope property of this AgentFlowGuardrailsSummary.
            Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH"
        :type scope: str

        :param threshold:
            The value to assign to the threshold property of this AgentFlowGuardrailsSummary.
        :type threshold: float

        :param categories:
            The value to assign to the categories property of this AgentFlowGuardrailsSummary.
        :type categories: list[oci.aidataplatform_dp.models.CategoryConfig]

        """
        self.swagger_types = {
            'policy_type': 'str',
            'policy_name': 'str',
            'policy_description': 'str',
            'action': 'str',
            'scope': 'str',
            'threshold': 'float',
            'categories': 'list[CategoryConfig]'
        }

        self.attribute_map = {
            'policy_type': 'policyType',
            'policy_name': 'policyName',
            'policy_description': 'policyDescription',
            'action': 'action',
            'scope': 'scope',
            'threshold': 'threshold',
            'categories': 'categories'
        }

        self._policy_type = None
        self._policy_name = None
        self._policy_description = None
        self._action = None
        self._scope = None
        self._threshold = None
        self._categories = None

    @property
    def policy_type(self):
        """
        Gets the policy_type of this AgentFlowGuardrailsSummary.
        Type of safety policy

        Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"


        :return: The policy_type of this AgentFlowGuardrailsSummary.
        :rtype: str
        """
        return self._policy_type

    @policy_type.setter
    def policy_type(self, policy_type):
        """
        Sets the policy_type of this AgentFlowGuardrailsSummary.
        Type of safety policy


        :param policy_type: The policy_type of this AgentFlowGuardrailsSummary.
        :type: str
        """
        allowed_values = ["CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"]
        if not value_allowed_none_or_none_sentinel(policy_type, allowed_values):
            raise ValueError(
                "Invalid value for `policy_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._policy_type = policy_type

    @property
    def policy_name(self):
        """
        Gets the policy_name of this AgentFlowGuardrailsSummary.
        Custom name for the policy


        :return: The policy_name of this AgentFlowGuardrailsSummary.
        :rtype: str
        """
        return self._policy_name

    @policy_name.setter
    def policy_name(self, policy_name):
        """
        Sets the policy_name of this AgentFlowGuardrailsSummary.
        Custom name for the policy


        :param policy_name: The policy_name of this AgentFlowGuardrailsSummary.
        :type: str
        """
        self._policy_name = policy_name

    @property
    def policy_description(self):
        """
        Gets the policy_description of this AgentFlowGuardrailsSummary.
        Description of the policy


        :return: The policy_description of this AgentFlowGuardrailsSummary.
        :rtype: str
        """
        return self._policy_description

    @policy_description.setter
    def policy_description(self, policy_description):
        """
        Sets the policy_description of this AgentFlowGuardrailsSummary.
        Description of the policy


        :param policy_description: The policy_description of this AgentFlowGuardrailsSummary.
        :type: str
        """
        self._policy_description = policy_description

    @property
    def action(self):
        """
        Gets the action of this AgentFlowGuardrailsSummary.
        Action to take when policy is violated

        Allowed values for this property are: "BLOCK", "INFORM", "MASK"


        :return: The action of this AgentFlowGuardrailsSummary.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this AgentFlowGuardrailsSummary.
        Action to take when policy is violated


        :param action: The action of this AgentFlowGuardrailsSummary.
        :type: str
        """
        allowed_values = ["BLOCK", "INFORM", "MASK"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def scope(self):
        """
        Gets the scope of this AgentFlowGuardrailsSummary.
        Scope of policy application

        Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH"


        :return: The scope of this AgentFlowGuardrailsSummary.
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """
        Sets the scope of this AgentFlowGuardrailsSummary.
        Scope of policy application


        :param scope: The scope of this AgentFlowGuardrailsSummary.
        :type: str
        """
        allowed_values = ["USER_REQUEST", "AGENT_RESPONSE", "BOTH"]
        if not value_allowed_none_or_none_sentinel(scope, allowed_values):
            raise ValueError(
                "Invalid value for `scope`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._scope = scope

    @property
    def threshold(self):
        """
        Gets the threshold of this AgentFlowGuardrailsSummary.
        Threshold value for policy violation (0.0 to 1.0)


        :return: The threshold of this AgentFlowGuardrailsSummary.
        :rtype: float
        """
        return self._threshold

    @threshold.setter
    def threshold(self, threshold):
        """
        Sets the threshold of this AgentFlowGuardrailsSummary.
        Threshold value for policy violation (0.0 to 1.0)


        :param threshold: The threshold of this AgentFlowGuardrailsSummary.
        :type: float
        """
        self._threshold = threshold

    @property
    def categories(self):
        """
        Gets the categories of this AgentFlowGuardrailsSummary.
        Guardrail categories for this policy and their configurations


        :return: The categories of this AgentFlowGuardrailsSummary.
        :rtype: list[oci.aidataplatform_dp.models.CategoryConfig]
        """
        return self._categories

    @categories.setter
    def categories(self, categories):
        """
        Sets the categories of this AgentFlowGuardrailsSummary.
        Guardrail categories for this policy and their configurations


        :param categories: The categories of this AgentFlowGuardrailsSummary.
        :type: list[oci.aidataplatform_dp.models.CategoryConfig]
        """
        self._categories = categories

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
