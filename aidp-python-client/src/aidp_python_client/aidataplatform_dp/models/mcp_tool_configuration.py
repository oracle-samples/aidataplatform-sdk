# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpToolConfiguration(object):
    """
    Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
    """

    def __init__(self, **kwargs):
        """
        Initializes a new McpToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param endpoint:
            The value to assign to the endpoint property of this McpToolConfiguration.
        :type endpoint: str

        :param auth:
            The value to assign to the auth property of this McpToolConfiguration.
        :type auth: oci.aidataplatform_dp.models.Auth

        :param allowed_tools:
            The value to assign to the allowed_tools property of this McpToolConfiguration.
        :type allowed_tools: list[oci.aidataplatform_dp.models.AllowedToolDetails]

        :param custom_headers:
            The value to assign to the custom_headers property of this McpToolConfiguration.
        :type custom_headers: dict(str, str)

        """
        self.swagger_types = {
            'endpoint': 'str',
            'auth': 'Auth',
            'allowed_tools': 'list[AllowedToolDetails]',
            'custom_headers': 'dict(str, str)'
        }

        self.attribute_map = {
            'endpoint': 'endpoint',
            'auth': 'auth',
            'allowed_tools': 'allowedTools',
            'custom_headers': 'customHeaders'
        }

        self._endpoint = None
        self._auth = None
        self._allowed_tools = None
        self._custom_headers = None

    @property
    def endpoint(self):
        """
        **[Required]** Gets the endpoint of this McpToolConfiguration.
        The endpoint of the mcp to connect to


        :return: The endpoint of this McpToolConfiguration.
        :rtype: str
        """
        return self._endpoint

    @endpoint.setter
    def endpoint(self, endpoint):
        """
        Sets the endpoint of this McpToolConfiguration.
        The endpoint of the mcp to connect to


        :param endpoint: The endpoint of this McpToolConfiguration.
        :type: str
        """
        self._endpoint = endpoint

    @property
    def auth(self):
        """
        Gets the auth of this McpToolConfiguration.

        :return: The auth of this McpToolConfiguration.
        :rtype: oci.aidataplatform_dp.models.Auth
        """
        return self._auth

    @auth.setter
    def auth(self, auth):
        """
        Sets the auth of this McpToolConfiguration.

        :param auth: The auth of this McpToolConfiguration.
        :type: oci.aidataplatform_dp.models.Auth
        """
        self._auth = auth

    @property
    def allowed_tools(self):
        """
        Gets the allowed_tools of this McpToolConfiguration.
        The list of allowed tools on an MCP server.


        :return: The allowed_tools of this McpToolConfiguration.
        :rtype: list[oci.aidataplatform_dp.models.AllowedToolDetails]
        """
        return self._allowed_tools

    @allowed_tools.setter
    def allowed_tools(self, allowed_tools):
        """
        Sets the allowed_tools of this McpToolConfiguration.
        The list of allowed tools on an MCP server.


        :param allowed_tools: The allowed_tools of this McpToolConfiguration.
        :type: list[oci.aidataplatform_dp.models.AllowedToolDetails]
        """
        self._allowed_tools = allowed_tools

    @property
    def custom_headers(self):
        """
        Gets the custom_headers of this McpToolConfiguration.
        Map of header key value pairs.


        :return: The custom_headers of this McpToolConfiguration.
        :rtype: dict(str, str)
        """
        return self._custom_headers

    @custom_headers.setter
    def custom_headers(self, custom_headers):
        """
        Sets the custom_headers of this McpToolConfiguration.
        Map of header key value pairs.


        :param custom_headers: The custom_headers of this McpToolConfiguration.
        :type: dict(str, str)
        """
        self._custom_headers = custom_headers

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
