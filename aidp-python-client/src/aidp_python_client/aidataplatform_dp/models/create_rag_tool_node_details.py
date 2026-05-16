# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .create_agent_flow_node_details import CreateAgentFlowNodeDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateRagToolNodeDetails(CreateAgentFlowNodeDetails):
    """
    Details to create a RAG Tool Node in an Agent Flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateRagToolNodeDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CreateRagToolNodeDetails.type` attribute
        of this class is ``RAG_TOOL`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateRagToolNodeDetails.
            Allowed values for this property are: "START_NODE", "GUARDRAILS", "AGENT", "SUPERVISOR_AGENT", "NESTED_AGENT_FLOW", "EXTERNAL_AGENT", "HUMAN_IN_THE_LOOP", "SQL_TOOL", "PROMPT_TOOL", "RAG_TOOL", "MCP_TOOL", "HTTP_TOOL", "CUSTOM_TOOL"
        :type type: str

        :param node_type:
            The value to assign to the node_type property of this CreateRagToolNodeDetails.
        :type node_type: str

        :param name:
            The value to assign to the name property of this CreateRagToolNodeDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateRagToolNodeDetails.
        :type description: str

        :param position_x:
            The value to assign to the position_x property of this CreateRagToolNodeDetails.
        :type position_x: float

        :param position_y:
            The value to assign to the position_y property of this CreateRagToolNodeDetails.
        :type position_y: float

        :param is_expanded:
            The value to assign to the is_expanded property of this CreateRagToolNodeDetails.
        :type is_expanded: bool

        :param parent_node_id:
            The value to assign to the parent_node_id property of this CreateRagToolNodeDetails.
        :type parent_node_id: str

        :param src_node_id:
            The value to assign to the src_node_id property of this CreateRagToolNodeDetails.
        :type src_node_id: str

        :param configuration:
            The value to assign to the configuration property of this CreateRagToolNodeDetails.
        :type configuration: dict(str, object)

        :param node_type_id:
            The value to assign to the node_type_id property of this CreateRagToolNodeDetails.
        :type node_type_id: str

        :param tool_key:
            The value to assign to the tool_key property of this CreateRagToolNodeDetails.
        :type tool_key: str

        :param input_schema:
            The value to assign to the input_schema property of this CreateRagToolNodeDetails.
        :type input_schema: oci.aidataplatform_dp.models.RagToolInputSchema

        :param tool_config:
            The value to assign to the tool_config property of this CreateRagToolNodeDetails.
        :type tool_config: oci.aidataplatform_dp.models.RagToolConfiguration

        """
        self.swagger_types = {
            'type': 'str',
            'node_type': 'str',
            'name': 'str',
            'description': 'str',
            'position_x': 'float',
            'position_y': 'float',
            'is_expanded': 'bool',
            'parent_node_id': 'str',
            'src_node_id': 'str',
            'configuration': 'dict(str, object)',
            'node_type_id': 'str',
            'tool_key': 'str',
            'input_schema': 'RagToolInputSchema',
            'tool_config': 'RagToolConfiguration'
        }

        self.attribute_map = {
            'type': 'type',
            'node_type': 'nodeType',
            'name': 'name',
            'description': 'description',
            'position_x': 'positionX',
            'position_y': 'positionY',
            'is_expanded': 'isExpanded',
            'parent_node_id': 'parentNodeId',
            'src_node_id': 'srcNodeId',
            'configuration': 'configuration',
            'node_type_id': 'nodeTypeId',
            'tool_key': 'toolKey',
            'input_schema': 'inputSchema',
            'tool_config': 'toolConfig'
        }

        self._type = None
        self._node_type = None
        self._name = None
        self._description = None
        self._position_x = None
        self._position_y = None
        self._is_expanded = None
        self._parent_node_id = None
        self._src_node_id = None
        self._configuration = None
        self._node_type_id = None
        self._tool_key = None
        self._input_schema = None
        self._tool_config = None
        self._type = 'RAG_TOOL'

    @property
    def tool_key(self):
        """
        Gets the tool_key of this CreateRagToolNodeDetails.
        The unique identifier (key) of the saved AI tool


        :return: The tool_key of this CreateRagToolNodeDetails.
        :rtype: str
        """
        return self._tool_key

    @tool_key.setter
    def tool_key(self, tool_key):
        """
        Sets the tool_key of this CreateRagToolNodeDetails.
        The unique identifier (key) of the saved AI tool


        :param tool_key: The tool_key of this CreateRagToolNodeDetails.
        :type: str
        """
        self._tool_key = tool_key

    @property
    def input_schema(self):
        """
        Gets the input_schema of this CreateRagToolNodeDetails.

        :return: The input_schema of this CreateRagToolNodeDetails.
        :rtype: oci.aidataplatform_dp.models.RagToolInputSchema
        """
        return self._input_schema

    @input_schema.setter
    def input_schema(self, input_schema):
        """
        Sets the input_schema of this CreateRagToolNodeDetails.

        :param input_schema: The input_schema of this CreateRagToolNodeDetails.
        :type: oci.aidataplatform_dp.models.RagToolInputSchema
        """
        self._input_schema = input_schema

    @property
    def tool_config(self):
        """
        Gets the tool_config of this CreateRagToolNodeDetails.

        :return: The tool_config of this CreateRagToolNodeDetails.
        :rtype: oci.aidataplatform_dp.models.RagToolConfiguration
        """
        return self._tool_config

    @tool_config.setter
    def tool_config(self, tool_config):
        """
        Sets the tool_config of this CreateRagToolNodeDetails.

        :param tool_config: The tool_config of this CreateRagToolNodeDetails.
        :type: oci.aidataplatform_dp.models.RagToolConfiguration
        """
        self._tool_config = tool_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
