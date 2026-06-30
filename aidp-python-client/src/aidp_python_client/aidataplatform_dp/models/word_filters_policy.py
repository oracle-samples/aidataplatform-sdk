# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .safety_policy import SafetyPolicy
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WordFiltersPolicy(SafetyPolicy):
    """
    Word filters safety policy.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new WordFiltersPolicy object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.WordFiltersPolicy.policy_type` attribute
        of this class is ``WORD_FILTERS`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param policy_type:
            The value to assign to the policy_type property of this WordFiltersPolicy.
            Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"
        :type policy_type: str

        :param policy_name:
            The value to assign to the policy_name property of this WordFiltersPolicy.
        :type policy_name: str

        :param policy_description:
            The value to assign to the policy_description property of this WordFiltersPolicy.
        :type policy_description: str

        :param scope:
            The value to assign to the scope property of this WordFiltersPolicy.
            Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH"
        :type scope: str

        :param action:
            The value to assign to the action property of this WordFiltersPolicy.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        :param threshold:
            The value to assign to the threshold property of this WordFiltersPolicy.
        :type threshold: float

        :param words:
            The value to assign to the words property of this WordFiltersPolicy.
        :type words: list[str]

        :param regex_patterns:
            The value to assign to the regex_patterns property of this WordFiltersPolicy.
        :type regex_patterns: list[str]

        """
        self.swagger_types = {
            'policy_type': 'str',
            'policy_name': 'str',
            'policy_description': 'str',
            'scope': 'str',
            'action': 'str',
            'threshold': 'float',
            'words': 'list[str]',
            'regex_patterns': 'list[str]'
        }

        self.attribute_map = {
            'policy_type': 'policyType',
            'policy_name': 'policyName',
            'policy_description': 'policyDescription',
            'scope': 'scope',
            'action': 'action',
            'threshold': 'threshold',
            'words': 'words',
            'regex_patterns': 'regexPatterns'
        }

        self._policy_type = None
        self._policy_name = None
        self._policy_description = None
        self._scope = None
        self._action = None
        self._threshold = None
        self._words = None
        self._regex_patterns = None
        self._policy_type = 'WORD_FILTERS'

    @property
    def words(self):
        """
        Gets the words of this WordFiltersPolicy.
        List of banned words or regex patterns.


        :return: The words of this WordFiltersPolicy.
        :rtype: list[str]
        """
        return self._words

    @words.setter
    def words(self, words):
        """
        Sets the words of this WordFiltersPolicy.
        List of banned words or regex patterns.


        :param words: The words of this WordFiltersPolicy.
        :type: list[str]
        """
        self._words = words

    @property
    def regex_patterns(self):
        """
        Gets the regex_patterns of this WordFiltersPolicy.
        List of regex patterns to filter.


        :return: The regex_patterns of this WordFiltersPolicy.
        :rtype: list[str]
        """
        return self._regex_patterns

    @regex_patterns.setter
    def regex_patterns(self, regex_patterns):
        """
        Sets the regex_patterns of this WordFiltersPolicy.
        List of regex patterns to filter.


        :param regex_patterns: The regex_patterns of this WordFiltersPolicy.
        :type: list[str]
        """
        self._regex_patterns = regex_patterns

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
