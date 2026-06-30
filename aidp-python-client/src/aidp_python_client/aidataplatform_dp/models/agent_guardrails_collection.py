# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentGuardrailsCollection(object):
    """
    Result of listing Guardrails available for configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentGuardrailsCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this AgentGuardrailsCollection.
        :type items: list[oci.aidataplatform_dp.models.AgentGuardrailsSummary]

        """
        self.swagger_types = {
            'items': 'list[AgentGuardrailsSummary]'
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this AgentGuardrailsCollection.
        List of safety policies available to configure in this guardrails.


        :return: The items of this AgentGuardrailsCollection.
        :rtype: list[oci.aidataplatform_dp.models.AgentGuardrailsSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this AgentGuardrailsCollection.
        List of safety policies available to configure in this guardrails.


        :param items: The items of this AgentGuardrailsCollection.
        :type: list[oci.aidataplatform_dp.models.AgentGuardrailsSummary]
        """
        self._items = items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
