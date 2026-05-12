# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .safety_policy import SafetyPolicy
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PiiDetectionPolicy(SafetyPolicy):
    """
    PII detection safety policy
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PiiDetectionPolicy object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.PiiDetectionPolicy.policy_type` attribute
        of this class is ``PII_DETECTION`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param policy_type:
            The value to assign to the policy_type property of this PiiDetectionPolicy.
            Allowed values for this property are: "CONTENT_MODERATION", "PROMPT_ATTACKS_PREVENTION", "PII_DETECTION", "DENIED_TOPICS", "WORD_FILTERS", "CONTEXTUAL_GROUNDING", "CUSTOM_POLICY"
        :type policy_type: str

        :param policy_name:
            The value to assign to the policy_name property of this PiiDetectionPolicy.
        :type policy_name: str

        :param policy_description:
            The value to assign to the policy_description property of this PiiDetectionPolicy.
        :type policy_description: str

        :param scope:
            The value to assign to the scope property of this PiiDetectionPolicy.
            Allowed values for this property are: "USER_REQUEST", "AGENT_RESPONSE", "BOTH"
        :type scope: str

        :param action:
            The value to assign to the action property of this PiiDetectionPolicy.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        :param threshold:
            The value to assign to the threshold property of this PiiDetectionPolicy.
        :type threshold: float

        :param pii_categories:
            The value to assign to the pii_categories property of this PiiDetectionPolicy.
        :type pii_categories: list[oci.aidataplatform_dp.models.PiiCategory]

        :param custom_pii_rules:
            The value to assign to the custom_pii_rules property of this PiiDetectionPolicy.
        :type custom_pii_rules: list[oci.aidataplatform_dp.models.CustomPiiRule]

        """
        self.swagger_types = {
            'policy_type': 'str',
            'policy_name': 'str',
            'policy_description': 'str',
            'scope': 'str',
            'action': 'str',
            'threshold': 'float',
            'pii_categories': 'list[PiiCategory]',
            'custom_pii_rules': 'list[CustomPiiRule]'
        }

        self.attribute_map = {
            'policy_type': 'policyType',
            'policy_name': 'policyName',
            'policy_description': 'policyDescription',
            'scope': 'scope',
            'action': 'action',
            'threshold': 'threshold',
            'pii_categories': 'piiCategories',
            'custom_pii_rules': 'customPiiRules'
        }

        self._policy_type = None
        self._policy_name = None
        self._policy_description = None
        self._scope = None
        self._action = None
        self._threshold = None
        self._pii_categories = None
        self._custom_pii_rules = None
        self._policy_type = 'PII_DETECTION'

    @property
    def pii_categories(self):
        """
        Gets the pii_categories of this PiiDetectionPolicy.
        List of PII categories to detect


        :return: The pii_categories of this PiiDetectionPolicy.
        :rtype: list[oci.aidataplatform_dp.models.PiiCategory]
        """
        return self._pii_categories

    @pii_categories.setter
    def pii_categories(self, pii_categories):
        """
        Sets the pii_categories of this PiiDetectionPolicy.
        List of PII categories to detect


        :param pii_categories: The pii_categories of this PiiDetectionPolicy.
        :type: list[oci.aidataplatform_dp.models.PiiCategory]
        """
        self._pii_categories = pii_categories

    @property
    def custom_pii_rules(self):
        """
        Gets the custom_pii_rules of this PiiDetectionPolicy.
        Custom PII detection rules


        :return: The custom_pii_rules of this PiiDetectionPolicy.
        :rtype: list[oci.aidataplatform_dp.models.CustomPiiRule]
        """
        return self._custom_pii_rules

    @custom_pii_rules.setter
    def custom_pii_rules(self, custom_pii_rules):
        """
        Sets the custom_pii_rules of this PiiDetectionPolicy.
        Custom PII detection rules


        :param custom_pii_rules: The custom_pii_rules of this PiiDetectionPolicy.
        :type: list[oci.aidataplatform_dp.models.CustomPiiRule]
        """
        self._custom_pii_rules = custom_pii_rules

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
