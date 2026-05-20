# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AiComputeOverrideItem(object):
    """
    Aggregated override candidate for an aicompute dependency.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AiComputeOverrideItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this AiComputeOverrideItem.
        :type name: str

        :param variable_name:
            The value to assign to the variable_name property of this AiComputeOverrideItem.
        :type variable_name: str

        :param default_value:
            The value to assign to the default_value property of this AiComputeOverrideItem.
        :type default_value: str

        :param override_value:
            The value to assign to the override_value property of this AiComputeOverrideItem.
        :type override_value: str

        :param agentflows:
            The value to assign to the agentflows property of this AiComputeOverrideItem.
        :type agentflows: list[str]

        """
        self.swagger_types = {
            'name': 'str',
            'variable_name': 'str',
            'default_value': 'str',
            'override_value': 'str',
            'agentflows': 'list[str]'
        }

        self.attribute_map = {
            'name': 'name',
            'variable_name': 'variableName',
            'default_value': 'defaultValue',
            'override_value': 'overrideValue',
            'agentflows': 'agentflows'
        }

        self._name = None
        self._variable_name = None
        self._default_value = None
        self._override_value = None
        self._agentflows = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this AiComputeOverrideItem.
        Aicompute dependency name.


        :return: The name of this AiComputeOverrideItem.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AiComputeOverrideItem.
        Aicompute dependency name.


        :param name: The name of this AiComputeOverrideItem.
        :type: str
        """
        self._name = name

    @property
    def variable_name(self):
        """
        **[Required]** Gets the variable_name of this AiComputeOverrideItem.
        Variable name used for this override candidate.


        :return: The variable_name of this AiComputeOverrideItem.
        :rtype: str
        """
        return self._variable_name

    @variable_name.setter
    def variable_name(self, variable_name):
        """
        Sets the variable_name of this AiComputeOverrideItem.
        Variable name used for this override candidate.


        :param variable_name: The variable_name of this AiComputeOverrideItem.
        :type: str
        """
        self._variable_name = variable_name

    @property
    def default_value(self):
        """
        **[Required]** Gets the default_value of this AiComputeOverrideItem.
        Canonical dependency token using `.key`.


        :return: The default_value of this AiComputeOverrideItem.
        :rtype: str
        """
        return self._default_value

    @default_value.setter
    def default_value(self, default_value):
        """
        Sets the default_value of this AiComputeOverrideItem.
        Canonical dependency token using `.key`.


        :param default_value: The default_value of this AiComputeOverrideItem.
        :type: str
        """
        self._default_value = default_value

    @property
    def override_value(self):
        """
        **[Required]** Gets the override_value of this AiComputeOverrideItem.
        Current override value resolved from `.aidp/overrides.yaml` if present.


        :return: The override_value of this AiComputeOverrideItem.
        :rtype: str
        """
        return self._override_value

    @override_value.setter
    def override_value(self, override_value):
        """
        Sets the override_value of this AiComputeOverrideItem.
        Current override value resolved from `.aidp/overrides.yaml` if present.


        :param override_value: The override_value of this AiComputeOverrideItem.
        :type: str
        """
        self._override_value = override_value

    @property
    def agentflows(self):
        """
        Gets the agentflows of this AiComputeOverrideItem.
        Top-level agentflows that reference this aicompute dependency.


        :return: The agentflows of this AiComputeOverrideItem.
        :rtype: list[str]
        """
        return self._agentflows

    @agentflows.setter
    def agentflows(self, agentflows):
        """
        Sets the agentflows of this AiComputeOverrideItem.
        Top-level agentflows that reference this aicompute dependency.


        :param agentflows: The agentflows of this AiComputeOverrideItem.
        :type: list[str]
        """
        self._agentflows = agentflows

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
