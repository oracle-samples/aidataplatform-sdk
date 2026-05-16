# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CustomToolConfiguration(object):
    """
    Configuration for a custom tool package uploaded to the workspace volume.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CustomToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CustomToolConfiguration.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CustomToolConfiguration.
        :type description: str

        :param version:
            The value to assign to the version property of this CustomToolConfiguration.
        :type version: str

        :param package_path:
            The value to assign to the package_path property of this CustomToolConfiguration.
        :type package_path: str

        :param requirements_hash:
            The value to assign to the requirements_hash property of this CustomToolConfiguration.
        :type requirements_hash: str

        :param auth:
            The value to assign to the auth property of this CustomToolConfiguration.
        :type auth: oci.aidataplatform_dp.models.Auth

        :param tool_provider:
            The value to assign to the tool_provider property of this CustomToolConfiguration.
        :type tool_provider: str

        :param tools:
            The value to assign to the tools property of this CustomToolConfiguration.
        :type tools: list[oci.aidataplatform_dp.models.CustomToolEntry]

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'version': 'str',
            'package_path': 'str',
            'requirements_hash': 'str',
            'auth': 'Auth',
            'tool_provider': 'str',
            'tools': 'list[CustomToolEntry]'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'version': 'version',
            'package_path': 'packagePath',
            'requirements_hash': 'requirementsHash',
            'auth': 'auth',
            'tool_provider': 'toolProvider',
            'tools': 'tools'
        }

        self._display_name = None
        self._description = None
        self._version = None
        self._package_path = None
        self._requirements_hash = None
        self._auth = None
        self._tool_provider = None
        self._tools = None

    @property
    def display_name(self):
        """
        Gets the display_name of this CustomToolConfiguration.
        Human-readable name for this tool package


        :return: The display_name of this CustomToolConfiguration.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CustomToolConfiguration.
        Human-readable name for this tool package


        :param display_name: The display_name of this CustomToolConfiguration.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CustomToolConfiguration.
        Description of the tool package


        :return: The description of this CustomToolConfiguration.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CustomToolConfiguration.
        Description of the tool package


        :param description: The description of this CustomToolConfiguration.
        :type: str
        """
        self._description = description

    @property
    def version(self):
        """
        Gets the version of this CustomToolConfiguration.
        Tool package version


        :return: The version of this CustomToolConfiguration.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this CustomToolConfiguration.
        Tool package version


        :param version: The version of this CustomToolConfiguration.
        :type: str
        """
        self._version = version

    @property
    def package_path(self):
        """
        Gets the package_path of this CustomToolConfiguration.
        Workspace volume path to the uploaded ZIP file


        :return: The package_path of this CustomToolConfiguration.
        :rtype: str
        """
        return self._package_path

    @package_path.setter
    def package_path(self, package_path):
        """
        Sets the package_path of this CustomToolConfiguration.
        Workspace volume path to the uploaded ZIP file


        :param package_path: The package_path of this CustomToolConfiguration.
        :type: str
        """
        self._package_path = package_path

    @property
    def requirements_hash(self):
        """
        Gets the requirements_hash of this CustomToolConfiguration.
        SHA256 hash of requirements.txt for dependency caching


        :return: The requirements_hash of this CustomToolConfiguration.
        :rtype: str
        """
        return self._requirements_hash

    @requirements_hash.setter
    def requirements_hash(self, requirements_hash):
        """
        Sets the requirements_hash of this CustomToolConfiguration.
        SHA256 hash of requirements.txt for dependency caching


        :param requirements_hash: The requirements_hash of this CustomToolConfiguration.
        :type: str
        """
        self._requirements_hash = requirements_hash

    @property
    def auth(self):
        """
        Gets the auth of this CustomToolConfiguration.

        :return: The auth of this CustomToolConfiguration.
        :rtype: oci.aidataplatform_dp.models.Auth
        """
        return self._auth

    @auth.setter
    def auth(self, auth):
        """
        Sets the auth of this CustomToolConfiguration.

        :param auth: The auth of this CustomToolConfiguration.
        :type: oci.aidataplatform_dp.models.Auth
        """
        self._auth = auth

    @property
    def tool_provider(self):
        """
        Gets the tool_provider of this CustomToolConfiguration.
        Tool provider identifier


        :return: The tool_provider of this CustomToolConfiguration.
        :rtype: str
        """
        return self._tool_provider

    @tool_provider.setter
    def tool_provider(self, tool_provider):
        """
        Sets the tool_provider of this CustomToolConfiguration.
        Tool provider identifier


        :param tool_provider: The tool_provider of this CustomToolConfiguration.
        :type: str
        """
        self._tool_provider = tool_provider

    @property
    def tools(self):
        """
        Gets the tools of this CustomToolConfiguration.
        List of tool class entries in this package (multi-tool support)


        :return: The tools of this CustomToolConfiguration.
        :rtype: list[oci.aidataplatform_dp.models.CustomToolEntry]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """
        Sets the tools of this CustomToolConfiguration.
        List of tool class entries in this package (multi-tool support)


        :param tools: The tools of this CustomToolConfiguration.
        :type: list[oci.aidataplatform_dp.models.CustomToolEntry]
        """
        self._tools = tools

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
