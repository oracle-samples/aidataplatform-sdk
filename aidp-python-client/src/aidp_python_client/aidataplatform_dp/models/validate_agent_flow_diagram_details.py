# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ValidateAgentFlowDiagramDetails(object):
    """
    Request payload for validating an Agent Flow diagram without persisting changes.
    """

    #: A constant which can be used with the validation_level property of a ValidateAgentFlowDiagramDetails.
    #: This constant has a value of "BASIC"
    VALIDATION_LEVEL_BASIC = "BASIC"

    #: A constant which can be used with the validation_level property of a ValidateAgentFlowDiagramDetails.
    #: This constant has a value of "DEEP"
    VALIDATION_LEVEL_DEEP = "DEEP"

    def __init__(self, **kwargs):
        """
        Initializes a new ValidateAgentFlowDiagramDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this ValidateAgentFlowDiagramDetails.
        :type agent_flow_key: str

        :param agent_flow_diagram:
            The value to assign to the agent_flow_diagram property of this ValidateAgentFlowDiagramDetails.
        :type agent_flow_diagram: oci.aidataplatform_dp.models.AgentFlowDiagram

        :param model_version:
            The value to assign to the model_version property of this ValidateAgentFlowDiagramDetails.
        :type model_version: str

        :param validation_level:
            The value to assign to the validation_level property of this ValidateAgentFlowDiagramDetails.
            Allowed values for this property are: "BASIC", "DEEP"
        :type validation_level: str

        :param options:
            The value to assign to the options property of this ValidateAgentFlowDiagramDetails.
        :type options: oci.aidataplatform_dp.models.AgentFlowValidationOptions

        """
        self.swagger_types = {
            'agent_flow_key': 'str',
            'agent_flow_diagram': 'AgentFlowDiagram',
            'model_version': 'str',
            'validation_level': 'str',
            'options': 'AgentFlowValidationOptions'
        }

        self.attribute_map = {
            'agent_flow_key': 'agentFlowKey',
            'agent_flow_diagram': 'agentFlowDiagram',
            'model_version': 'modelVersion',
            'validation_level': 'validationLevel',
            'options': 'options'
        }

        self._agent_flow_key = None
        self._agent_flow_diagram = None
        self._model_version = None
        self._validation_level = None
        self._options = None

    @property
    def agent_flow_key(self):
        """
        Gets the agent_flow_key of this ValidateAgentFlowDiagramDetails.
        Optional Agent Flow key used to resolve persisted validation context.


        :return: The agent_flow_key of this ValidateAgentFlowDiagramDetails.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this ValidateAgentFlowDiagramDetails.
        Optional Agent Flow key used to resolve persisted validation context.


        :param agent_flow_key: The agent_flow_key of this ValidateAgentFlowDiagramDetails.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def agent_flow_diagram(self):
        """
        **[Required]** Gets the agent_flow_diagram of this ValidateAgentFlowDiagramDetails.

        :return: The agent_flow_diagram of this ValidateAgentFlowDiagramDetails.
        :rtype: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        return self._agent_flow_diagram

    @agent_flow_diagram.setter
    def agent_flow_diagram(self, agent_flow_diagram):
        """
        Sets the agent_flow_diagram of this ValidateAgentFlowDiagramDetails.

        :param agent_flow_diagram: The agent_flow_diagram of this ValidateAgentFlowDiagramDetails.
        :type: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        self._agent_flow_diagram = agent_flow_diagram

    @property
    def model_version(self):
        """
        Gets the model_version of this ValidateAgentFlowDiagramDetails.
        The model and upgrade compatibility version for this validation request.


        :return: The model_version of this ValidateAgentFlowDiagramDetails.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this ValidateAgentFlowDiagramDetails.
        The model and upgrade compatibility version for this validation request.


        :param model_version: The model_version of this ValidateAgentFlowDiagramDetails.
        :type: str
        """
        self._model_version = model_version

    @property
    def validation_level(self):
        """
        Gets the validation_level of this ValidateAgentFlowDiagramDetails.
        Validation depth to apply.

        Allowed values for this property are: "BASIC", "DEEP"


        :return: The validation_level of this ValidateAgentFlowDiagramDetails.
        :rtype: str
        """
        return self._validation_level

    @validation_level.setter
    def validation_level(self, validation_level):
        """
        Sets the validation_level of this ValidateAgentFlowDiagramDetails.
        Validation depth to apply.


        :param validation_level: The validation_level of this ValidateAgentFlowDiagramDetails.
        :type: str
        """
        allowed_values = ["BASIC", "DEEP"]
        if not value_allowed_none_or_none_sentinel(validation_level, allowed_values):
            raise ValueError(
                "Invalid value for `validation_level`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._validation_level = validation_level

    @property
    def options(self):
        """
        Gets the options of this ValidateAgentFlowDiagramDetails.

        :return: The options of this ValidateAgentFlowDiagramDetails.
        :rtype: oci.aidataplatform_dp.models.AgentFlowValidationOptions
        """
        return self._options

    @options.setter
    def options(self, options):
        """
        Sets the options of this ValidateAgentFlowDiagramDetails.

        :param options: The options of this ValidateAgentFlowDiagramDetails.
        :type: oci.aidataplatform_dp.models.AgentFlowValidationOptions
        """
        self._options = options

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
