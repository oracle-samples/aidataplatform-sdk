# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GuardrailsConfiguration(object):
    """
    Safety guardrails configuration for an agent flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GuardrailsConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this GuardrailsConfiguration.
        :type name: str

        :param description:
            The value to assign to the description property of this GuardrailsConfiguration.
        :type description: str

        :param policies:
            The value to assign to the policies property of this GuardrailsConfiguration.
        :type policies: list[oci.aidataplatform_dp.models.SafetyPolicy]

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'policies': 'list[SafetyPolicy]'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'policies': 'policies'
        }

        self._name = None
        self._description = None
        self._policies = None

    @property
    def name(self):
        """
        Gets the name of this GuardrailsConfiguration.
        Name of the guardrails configuration


        :return: The name of this GuardrailsConfiguration.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this GuardrailsConfiguration.
        Name of the guardrails configuration


        :param name: The name of this GuardrailsConfiguration.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this GuardrailsConfiguration.
        Description of the guardrails configuration


        :return: The description of this GuardrailsConfiguration.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this GuardrailsConfiguration.
        Description of the guardrails configuration


        :param description: The description of this GuardrailsConfiguration.
        :type: str
        """
        self._description = description

    @property
    def policies(self):
        """
        Gets the policies of this GuardrailsConfiguration.
        List of safety policies configured in this guardrails


        :return: The policies of this GuardrailsConfiguration.
        :rtype: list[oci.aidataplatform_dp.models.SafetyPolicy]
        """
        return self._policies

    @policies.setter
    def policies(self, policies):
        """
        Sets the policies of this GuardrailsConfiguration.
        List of safety policies configured in this guardrails


        :param policies: The policies of this GuardrailsConfiguration.
        :type: list[oci.aidataplatform_dp.models.SafetyPolicy]
        """
        self._policies = policies

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
