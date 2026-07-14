# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SafetyPolicy(object):
    """
    Individual safety policy configuration.
    """

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "CONTENT_MODERATION"
    POLICY_TYPE_CONTENT_MODERATION = "CONTENT_MODERATION"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "PROMPT_ATTACKS_PREVENTION"
    POLICY_TYPE_PROMPT_ATTACKS_PREVENTION = "PROMPT_ATTACKS_PREVENTION"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "PII_DETECTION"
    POLICY_TYPE_PII_DETECTION = "PII_DETECTION"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "DENIED_TOPICS"
    POLICY_TYPE_DENIED_TOPICS = "DENIED_TOPICS"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "WORD_FILTERS"
    POLICY_TYPE_WORD_FILTERS = "WORD_FILTERS"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "CONTEXTUAL_GROUNDING"
    POLICY_TYPE_CONTEXTUAL_GROUNDING = "CONTEXTUAL_GROUNDING"

    #: A constant which can be used with the policy_type property of a SafetyPolicy.
    #: This constant has a value of "CUSTOM_POLICY"
    POLICY_TYPE_CUSTOM_POLICY = "CUSTOM_POLICY"

    #: A constant which can be used with the scope property of a SafetyPolicy.
    #: This constant has a value of "USER_REQUEST"
    SCOPE_USER_REQUEST = "USER_REQUEST"

    #: A constant which can be used with the scope property of a SafetyPolicy.
    #: This constant has a value of "AGENT_RESPONSE"
    SCOPE_AGENT_RESPONSE = "AGENT_RESPONSE"

    #: A constant which can be used with the scope property of a SafetyPolicy.
    #: This constant has a value of "BOTH"
    SCOPE_BOTH = "BOTH"

    #: A constant which can be used with the action property of a SafetyPolicy.
    #: This constant has a value of "BLOCK"
    ACTION_BLOCK = "BLOCK"

    #: A constant which can be used with the action property of a SafetyPolicy.
    #: This constant has a value of "INFORM"
    ACTION_INFORM = "INFORM"

    #: A constant which can be used with the action property of a SafetyPolicy.
    #: This constant has a value of "MASK"
    ACTION_MASK = "MASK"

    def __init__(self, **kwargs):
        """
        Initializes a new SafetyPolicy object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.PiiDetectionPolicy`
        * :class:`~oci.aidataplatform_dp.models.DeniedTopicsPolicy`
        * :class:`~oci.aidataplatform_dp.models.ContentModerationPolicy`
        * :class:`~oci.aidataplatform_dp.models.WordFiltersPolicy`
        * :class:`~oci.aidataplatform_dp.models.PromptAttacksPreventionPolicy`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param policy_type:
            The value to assign to the policy_type property of this SafetyPolicy.
            Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type policy_type: str

        :param policy_name:
            The value to assign to the policy_name property of this SafetyPolicy.
        :type policy_name: str

        :param policy_description:
            The value to assign to the policy_description property of this SafetyPolicy.
        :type policy_description: str

        :param scope:
            The value to assign to the scope property of this SafetyPolicy.
            Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type scope: str

        :param action:
            The value to assign to the action property of this SafetyPolicy.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type action: str

        :param threshold:
            The value to assign to the threshold property of this SafetyPolicy.
        :type threshold: float

        """
        self.swagger_types = {
            'policy_type': 'str',
            'policy_name': 'str',
            'policy_description': 'str',
            'scope': 'str',
            'action': 'str',
            'threshold': 'float'
        }

        self.attribute_map = {
            'policy_type': 'policyType',
            'policy_name': 'policyName',
            'policy_description': 'policyDescription',
            'scope': 'scope',
            'action': 'action',
            'threshold': 'threshold'
        }

        self._policy_type = None
        self._policy_name = None
        self._policy_description = None
        self._scope = None
        self._action = None
        self._threshold = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['policyType']

        if type == 'PII_DETECTION':
            return 'PiiDetectionPolicy'

        if type == 'DENIED_TOPICS':
            return 'DeniedTopicsPolicy'

        if type == 'CONTENT_MODERATION':
            return 'ContentModerationPolicy'

        if type == 'WORD_FILTERS':
            return 'WordFiltersPolicy'

        if type == 'PROMPT_ATTACKS_PREVENTION':
            return 'PromptAttacksPreventionPolicy'
        else:
            return 'SafetyPolicy'

    @property
    def policy_type(self):
        """
        **[Required]** Gets the policy_type of this SafetyPolicy.
        Type of safety policy.

        Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The policy_type of this SafetyPolicy.
        :rtype: str
        """
        return self._policy_type

    @policy_type.setter
    def policy_type(self, policy_type):
        """
        Sets the policy_type of this SafetyPolicy.
        Type of safety policy.


        :param policy_type: The policy_type of this SafetyPolicy.
        :type: str
        """
        allowed_values = ["CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"]
        if not value_allowed_none_or_none_sentinel(policy_type, allowed_values):
            policy_type = 'UNKNOWN_ENUM_VALUE'
        self._policy_type = policy_type

    @property
    def policy_name(self):
        """
        Gets the policy_name of this SafetyPolicy.
        Custom name for the policy.


        :return: The policy_name of this SafetyPolicy.
        :rtype: str
        """
        return self._policy_name

    @policy_name.setter
    def policy_name(self, policy_name):
        """
        Sets the policy_name of this SafetyPolicy.
        Custom name for the policy.


        :param policy_name: The policy_name of this SafetyPolicy.
        :type: str
        """
        self._policy_name = policy_name

    @property
    def policy_description(self):
        """
        Gets the policy_description of this SafetyPolicy.
        Description of the policy.


        :return: The policy_description of this SafetyPolicy.
        :rtype: str
        """
        return self._policy_description

    @policy_description.setter
    def policy_description(self, policy_description):
        """
        Sets the policy_description of this SafetyPolicy.
        Description of the policy.


        :param policy_description: The policy_description of this SafetyPolicy.
        :type: str
        """
        self._policy_description = policy_description

    @property
    def scope(self):
        """
        **[Required]** Gets the scope of this SafetyPolicy.
        Scope of policy application.

        Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The scope of this SafetyPolicy.
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """
        Sets the scope of this SafetyPolicy.
        Scope of policy application.


        :param scope: The scope of this SafetyPolicy.
        :type: str
        """
        allowed_values = ["USER_REQUEST", "AGENT_RESPONSE", "BOTH"]
        if not value_allowed_none_or_none_sentinel(scope, allowed_values):
            scope = 'UNKNOWN_ENUM_VALUE'
        self._scope = scope

    @property
    def action(self):
        """
        **[Required]** Gets the action of this SafetyPolicy.
        Action to take when policy is violated.

        Allowed values for this property are: "BLOCK", "INFORM", "MASK", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The action of this SafetyPolicy.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this SafetyPolicy.
        Action to take when policy is violated.


        :param action: The action of this SafetyPolicy.
        :type: str
        """
        allowed_values = ["BLOCK", "INFORM", "MASK"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            action = 'UNKNOWN_ENUM_VALUE'
        self._action = action

    @property
    def threshold(self):
        """
        Gets the threshold of this SafetyPolicy.
        Threshold value for policy violation (0.0 to 1.0).


        :return: The threshold of this SafetyPolicy.
        :rtype: float
        """
        return self._threshold

    @threshold.setter
    def threshold(self, threshold):
        """
        Sets the threshold of this SafetyPolicy.
        Threshold value for policy violation (0.0 to 1.0).


        :param threshold: The threshold of this SafetyPolicy.
        :type: float
        """
        self._threshold = threshold

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
