# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchMcpObjectsDetails(object):
    """
    The required details for testing an mcp tool
    """

    #: A constant which can be used with the type property of a FetchMcpObjectsDetails.
    #: This constant has a value of "TOOL"
    TYPE_TOOL = "TOOL"

    #: A constant which can be used with the type property of a FetchMcpObjectsDetails.
    #: This constant has a value of "PROMPT"
    TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the type property of a FetchMcpObjectsDetails.
    #: This constant has a value of "RESOURCE"
    TYPE_RESOURCE = "RESOURCE"

    #: A constant which can be used with the sort_order property of a FetchMcpObjectsDetails.
    #: This constant has a value of "ASC"
    SORT_ORDER_ASC = "ASC"

    #: A constant which can be used with the sort_order property of a FetchMcpObjectsDetails.
    #: This constant has a value of "DESC"
    SORT_ORDER_DESC = "DESC"

    #: A constant which can be used with the sort_by property of a FetchMcpObjectsDetails.
    #: This constant has a value of "TIME_CREATED"
    SORT_BY_TIME_CREATED = "TIME_CREATED"

    def __init__(self, **kwargs):
        """
        Initializes a new FetchMcpObjectsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this FetchMcpObjectsDetails.
        :type agent_flow_id: str

        :param type:
            The value to assign to the type property of this FetchMcpObjectsDetails.
            Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"
        :type type: str

        :param mcp_tool:
            The value to assign to the mcp_tool property of this FetchMcpObjectsDetails.
        :type mcp_tool: oci.aidataplatform_dp.models.McpTool

        :param sort_order:
            The value to assign to the sort_order property of this FetchMcpObjectsDetails.
            Allowed values for this property are: "ASC", "DESC"
        :type sort_order: str

        :param sort_by:
            The value to assign to the sort_by property of this FetchMcpObjectsDetails.
            Allowed values for this property are: "TIME_CREATED"
        :type sort_by: str

        :param limit:
            The value to assign to the limit property of this FetchMcpObjectsDetails.
        :type limit: int

        :param page:
            The value to assign to the page property of this FetchMcpObjectsDetails.
        :type page: str

        :param param_values:
            The value to assign to the param_values property of this FetchMcpObjectsDetails.
        :type param_values: dict(str, str)

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'type': 'str',
            'mcp_tool': 'McpTool',
            'sort_order': 'str',
            'sort_by': 'str',
            'limit': 'int',
            'page': 'str',
            'param_values': 'dict(str, str)'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'type': 'type',
            'mcp_tool': 'mcpTool',
            'sort_order': 'sortOrder',
            'sort_by': 'sortBy',
            'limit': 'limit',
            'page': 'page',
            'param_values': 'paramValues'
        }

        self._agent_flow_id = None
        self._type = None
        self._mcp_tool = None
        self._sort_order = None
        self._sort_by = None
        self._limit = None
        self._page = None
        self._param_values = None

    @property
    def agent_flow_id(self):
        """
        Gets the agent_flow_id of this FetchMcpObjectsDetails.
        Agent flow id for which the tool is being tested


        :return: The agent_flow_id of this FetchMcpObjectsDetails.
        :rtype: str
        """
        return self._agent_flow_id

    @agent_flow_id.setter
    def agent_flow_id(self, agent_flow_id):
        """
        Sets the agent_flow_id of this FetchMcpObjectsDetails.
        Agent flow id for which the tool is being tested


        :param agent_flow_id: The agent_flow_id of this FetchMcpObjectsDetails.
        :type: str
        """
        self._agent_flow_id = agent_flow_id

    @property
    def type(self):
        """
        **[Required]** Gets the type of this FetchMcpObjectsDetails.
        Type of object. Tool, prompt or resource hosted on an MCP.

        Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"


        :return: The type of this FetchMcpObjectsDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this FetchMcpObjectsDetails.
        Type of object. Tool, prompt or resource hosted on an MCP.


        :param type: The type of this FetchMcpObjectsDetails.
        :type: str
        """
        allowed_values = ["TOOL", "PROMPT", "RESOURCE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def mcp_tool(self):
        """
        **[Required]** Gets the mcp_tool of this FetchMcpObjectsDetails.

        :return: The mcp_tool of this FetchMcpObjectsDetails.
        :rtype: oci.aidataplatform_dp.models.McpTool
        """
        return self._mcp_tool

    @mcp_tool.setter
    def mcp_tool(self, mcp_tool):
        """
        Sets the mcp_tool of this FetchMcpObjectsDetails.

        :param mcp_tool: The mcp_tool of this FetchMcpObjectsDetails.
        :type: oci.aidataplatform_dp.models.McpTool
        """
        self._mcp_tool = mcp_tool

    @property
    def sort_order(self):
        """
        Gets the sort_order of this FetchMcpObjectsDetails.
        The sort order to use, either ascending (`ASC`) or descending (`DESC`). The `displayName`
        sort order is case sensitive.

        Allowed values for this property are: "ASC", "DESC"


        :return: The sort_order of this FetchMcpObjectsDetails.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order):
        """
        Sets the sort_order of this FetchMcpObjectsDetails.
        The sort order to use, either ascending (`ASC`) or descending (`DESC`). The `displayName`
        sort order is case sensitive.


        :param sort_order: The sort_order of this FetchMcpObjectsDetails.
        :type: str
        """
        allowed_values = ["ASC", "DESC"]
        if not value_allowed_none_or_none_sentinel(sort_order, allowed_values):
            raise ValueError(
                "Invalid value for `sort_order`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_order = sort_order

    @property
    def sort_by(self):
        """
        Gets the sort_by of this FetchMcpObjectsDetails.
        The field to sort by.

        Allowed values for this property are: "TIME_CREATED"


        :return: The sort_by of this FetchMcpObjectsDetails.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """
        Sets the sort_by of this FetchMcpObjectsDetails.
        The field to sort by.


        :param sort_by: The sort_by of this FetchMcpObjectsDetails.
        :type: str
        """
        allowed_values = ["TIME_CREATED"]
        if not value_allowed_none_or_none_sentinel(sort_by, allowed_values):
            raise ValueError(
                "Invalid value for `sort_by`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._sort_by = sort_by

    @property
    def limit(self):
        """
        Gets the limit of this FetchMcpObjectsDetails.
        For list pagination. The maximum number of results per page, or items to return in a
        paginated \"List\" call. For important details about how pagination works, see
        `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :return: The limit of this FetchMcpObjectsDetails.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this FetchMcpObjectsDetails.
        For list pagination. The maximum number of results per page, or items to return in a
        paginated \"List\" call. For important details about how pagination works, see
        `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :param limit: The limit of this FetchMcpObjectsDetails.
        :type: int
        """
        self._limit = limit

    @property
    def page(self):
        """
        Gets the page of this FetchMcpObjectsDetails.
        For list pagination. The value of the opc-next-page response header from the previous
        \"List\" call. For important details about how pagination works, see
        `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :return: The page of this FetchMcpObjectsDetails.
        :rtype: str
        """
        return self._page

    @page.setter
    def page(self, page):
        """
        Sets the page of this FetchMcpObjectsDetails.
        For list pagination. The value of the opc-next-page response header from the previous
        \"List\" call. For important details about how pagination works, see
        `List Pagination`__.

        __ https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine


        :param page: The page of this FetchMcpObjectsDetails.
        :type: str
        """
        self._page = page

    @property
    def param_values(self):
        """
        Gets the param_values of this FetchMcpObjectsDetails.
        Map of parameter names to their string values.


        :return: The param_values of this FetchMcpObjectsDetails.
        :rtype: dict(str, str)
        """
        return self._param_values

    @param_values.setter
    def param_values(self, param_values):
        """
        Sets the param_values of this FetchMcpObjectsDetails.
        Map of parameter names to their string values.


        :param param_values: The param_values of this FetchMcpObjectsDetails.
        :type: dict(str, str)
        """
        self._param_values = param_values

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
