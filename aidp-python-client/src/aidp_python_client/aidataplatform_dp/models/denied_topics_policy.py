# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .safety_policy import SafetyPolicy
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeniedTopicsPolicy(SafetyPolicy):
    """
    Denied topics safety policy.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeniedTopicsPolicy object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.DeniedTopicsPolicy.policy_type` attribute
        of this class is ``DENIED_TOPICS`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param policy_type:
            The value to assign to the policy_type property of this DeniedTopicsPolicy.
            Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"
        :type policy_type: str

        :param policy_name:
            The value to assign to the policy_name property of this DeniedTopicsPolicy.
        :type policy_name: str

        :param policy_description:
            The value to assign to the policy_description property of this DeniedTopicsPolicy.
        :type policy_description: str

        :param scope:
            The value to assign to the scope property of this DeniedTopicsPolicy.
            Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH"
        :type scope: str

        :param action:
            The value to assign to the action property of this DeniedTopicsPolicy.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        :param threshold:
            The value to assign to the threshold property of this DeniedTopicsPolicy.
        :type threshold: float

        :param topics:
            The value to assign to the topics property of this DeniedTopicsPolicy.
        :type topics: list[oci.aidataplatform_dp.models.DeniedTopic]

        """
        self.swagger_types = {
            'policy_type': 'str',
            'policy_name': 'str',
            'policy_description': 'str',
            'scope': 'str',
            'action': 'str',
            'threshold': 'float',
            'topics': 'list[DeniedTopic]'
        }

        self.attribute_map = {
            'policy_type': 'policyType',
            'policy_name': 'policyName',
            'policy_description': 'policyDescription',
            'scope': 'scope',
            'action': 'action',
            'threshold': 'threshold',
            'topics': 'topics'
        }

        self._policy_type = None
        self._policy_name = None
        self._policy_description = None
        self._scope = None
        self._action = None
        self._threshold = None
        self._topics = None
        self._policy_type = 'DENIED_TOPICS'

    @property
    def topics(self):
        """
        Gets the topics of this DeniedTopicsPolicy.
        List of denied topics.


        :return: The topics of this DeniedTopicsPolicy.
        :rtype: list[oci.aidataplatform_dp.models.DeniedTopic]
        """
        return self._topics

    @topics.setter
    def topics(self, topics):
        """
        Sets the topics of this DeniedTopicsPolicy.
        List of denied topics.


        :param topics: The topics of this DeniedTopicsPolicy.
        :type: list[oci.aidataplatform_dp.models.DeniedTopic]
        """
        self._topics = topics

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
