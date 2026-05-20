# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowDiagram(object):
    """
    Diagrammatic representation of the Agent Flow with all node and edge details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowDiagram object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AgentFlowDiagram.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this AgentFlowDiagram.
        :type display_name: str

        :param description:
            The value to assign to the description property of this AgentFlowDiagram.
        :type description: str

        :param model_version:
            The value to assign to the model_version property of this AgentFlowDiagram.
        :type model_version: str

        :param nodes:
            The value to assign to the nodes property of this AgentFlowDiagram.
        :type nodes: dict(str, AgentFlowNode)

        :param edges:
            The value to assign to the edges property of this AgentFlowDiagram.
        :type edges: dict(str, AgentFlowEdge)

        :param tools_map:
            The value to assign to the tools_map property of this AgentFlowDiagram.
        :type tools_map: dict(str, Tool)

        :param guardrails_map:
            The value to assign to the guardrails_map property of this AgentFlowDiagram.
        :type guardrails_map: dict(str, GuardrailsConfiguration)

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'model_version': 'str',
            'nodes': 'dict(str, AgentFlowNode)',
            'edges': 'dict(str, AgentFlowEdge)',
            'tools_map': 'dict(str, Tool)',
            'guardrails_map': 'dict(str, GuardrailsConfiguration)'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'model_version': 'modelVersion',
            'nodes': 'nodes',
            'edges': 'edges',
            'tools_map': 'toolsMap',
            'guardrails_map': 'guardrailsMap'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._model_version = None
        self._nodes = None
        self._edges = None
        self._tools_map = None
        self._guardrails_map = None

    @property
    def key(self):
        """
        Gets the key of this AgentFlowDiagram.
        The unique identifier (UUID) of the Agent flow


        :return: The key of this AgentFlowDiagram.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlowDiagram.
        The unique identifier (UUID) of the Agent flow


        :param key: The key of this AgentFlowDiagram.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this AgentFlowDiagram.
        AgentFlow name.


        :return: The display_name of this AgentFlowDiagram.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this AgentFlowDiagram.
        AgentFlow name.


        :param display_name: The display_name of this AgentFlowDiagram.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this AgentFlowDiagram.
        AgentFlow description.


        :return: The description of this AgentFlowDiagram.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentFlowDiagram.
        AgentFlow description.


        :param description: The description of this AgentFlowDiagram.
        :type: str
        """
        self._description = description

    @property
    def model_version(self):
        """
        Gets the model_version of this AgentFlowDiagram.
        The model and upgrade compatibility version for this agent flow diagram.


        :return: The model_version of this AgentFlowDiagram.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this AgentFlowDiagram.
        The model and upgrade compatibility version for this agent flow diagram.


        :param model_version: The model_version of this AgentFlowDiagram.
        :type: str
        """
        self._model_version = model_version

    @property
    def nodes(self):
        """
        Gets the nodes of this AgentFlowDiagram.
        Mapping of nodeId to node objects.


        :return: The nodes of this AgentFlowDiagram.
        :rtype: dict(str, AgentFlowNode)
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this AgentFlowDiagram.
        Mapping of nodeId to node objects.


        :param nodes: The nodes of this AgentFlowDiagram.
        :type: dict(str, AgentFlowNode)
        """
        self._nodes = nodes

    @property
    def edges(self):
        """
        Gets the edges of this AgentFlowDiagram.
        Mapping of edgeId to edge objects.


        :return: The edges of this AgentFlowDiagram.
        :rtype: dict(str, AgentFlowEdge)
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """
        Sets the edges of this AgentFlowDiagram.
        Mapping of edgeId to edge objects.


        :param edges: The edges of this AgentFlowDiagram.
        :type: dict(str, AgentFlowEdge)
        """
        self._edges = edges

    @property
    def tools_map(self):
        """
        Gets the tools_map of this AgentFlowDiagram.
        A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.


        :return: The tools_map of this AgentFlowDiagram.
        :rtype: dict(str, Tool)
        """
        return self._tools_map

    @tools_map.setter
    def tools_map(self, tools_map):
        """
        Sets the tools_map of this AgentFlowDiagram.
        A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.


        :param tools_map: The tools_map of this AgentFlowDiagram.
        :type: dict(str, Tool)
        """
        self._tools_map = tools_map

    @property
    def guardrails_map(self):
        """
        Gets the guardrails_map of this AgentFlowDiagram.
        A hash map with key=guardrails config key, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.


        :return: The guardrails_map of this AgentFlowDiagram.
        :rtype: dict(str, GuardrailsConfiguration)
        """
        return self._guardrails_map

    @guardrails_map.setter
    def guardrails_map(self, guardrails_map):
        """
        Sets the guardrails_map of this AgentFlowDiagram.
        A hash map with key=guardrails config key, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.


        :param guardrails_map: The guardrails_map of this AgentFlowDiagram.
        :type: dict(str, GuardrailsConfiguration)
        """
        self._guardrails_map = guardrails_map

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
