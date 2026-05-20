# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestToolDetails(object):
    """
    Base model for testing any tool.  `toolType` drives the subtype.
    """

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "SQL"
    TOOL_TYPE_SQL = "SQL"

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "PROMPT"
    TOOL_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "RAG"
    TOOL_TYPE_RAG = "RAG"

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "MCP"
    TOOL_TYPE_MCP = "MCP"

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "HTTP"
    TOOL_TYPE_HTTP = "HTTP"

    #: A constant which can be used with the tool_type property of a TestToolDetails.
    #: This constant has a value of "CUSTOM"
    TOOL_TYPE_CUSTOM = "CUSTOM"

    def __init__(self, **kwargs):
        """
        Initializes a new TestToolDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.TestCustomToolDetails`
        * :class:`~oci.aidataplatform_dp.models.TestHttpToolDetails`
        * :class:`~oci.aidataplatform_dp.models.TestSqlToolDetails`
        * :class:`~oci.aidataplatform_dp.models.TestRagToolDetails`
        * :class:`~oci.aidataplatform_dp.models.TestMcpToolDetails`
        * :class:`~oci.aidataplatform_dp.models.TestPromptToolDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this TestToolDetails.
        :type agent_flow_id: str

        :param tool_type:
            The value to assign to the tool_type property of this TestToolDetails.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'tool_type': 'str'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'tool_type': 'toolType'
        }

        self._agent_flow_id = None
        self._tool_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['toolType']

        if type == 'CUSTOM':
            return 'TestCustomToolDetails'

        if type == 'HTTP':
            return 'TestHttpToolDetails'

        if type == 'SQL':
            return 'TestSqlToolDetails'

        if type == 'RAG':
            return 'TestRagToolDetails'

        if type == 'MCP':
            return 'TestMcpToolDetails'

        if type == 'PROMPT':
            return 'TestPromptToolDetails'
        else:
            return 'TestToolDetails'

    @property
    def agent_flow_id(self):
        """
        **[Required]** Gets the agent_flow_id of this TestToolDetails.
        Agent flow id for which the tool is being tested


        :return: The agent_flow_id of this TestToolDetails.
        :rtype: str
        """
        return self._agent_flow_id

    @agent_flow_id.setter
    def agent_flow_id(self, agent_flow_id):
        """
        Sets the agent_flow_id of this TestToolDetails.
        Agent flow id for which the tool is being tested


        :param agent_flow_id: The agent_flow_id of this TestToolDetails.
        :type: str
        """
        self._agent_flow_id = agent_flow_id

    @property
    def tool_type(self):
        """
        **[Required]** Gets the tool_type of this TestToolDetails.
        Which kind of tool this test is for (chooses the subtype).

        Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"


        :return: The tool_type of this TestToolDetails.
        :rtype: str
        """
        return self._tool_type

    @tool_type.setter
    def tool_type(self, tool_type):
        """
        Sets the tool_type of this TestToolDetails.
        Which kind of tool this test is for (chooses the subtype).


        :param tool_type: The tool_type of this TestToolDetails.
        :type: str
        """
        allowed_values = ["SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"]
        if not value_allowed_none_or_none_sentinel(tool_type, allowed_values):
            raise ValueError(
                "Invalid value for `tool_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._tool_type = tool_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
