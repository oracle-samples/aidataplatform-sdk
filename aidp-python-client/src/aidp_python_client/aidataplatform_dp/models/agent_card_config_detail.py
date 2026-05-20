# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentCardConfigDetail(object):
    """
    Details of the A2A publish request payload.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentCardConfigDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this AgentCardConfigDetail.
        :type name: str

        :param description:
            The value to assign to the description property of this AgentCardConfigDetail.
        :type description: str

        :param skills:
            The value to assign to the skills property of this AgentCardConfigDetail.
        :type skills: list[oci.aidataplatform_dp.models.AgentCardSkillDetail]

        :param capabilities:
            The value to assign to the capabilities property of this AgentCardConfigDetail.
        :type capabilities: oci.aidataplatform_dp.models.AgentCardCapabilitiesDetail

        :param version:
            The value to assign to the version property of this AgentCardConfigDetail.
        :type version: str

        :param provider:
            The value to assign to the provider property of this AgentCardConfigDetail.
        :type provider: oci.aidataplatform_dp.models.AgentProvider

        :param documentation_url:
            The value to assign to the documentation_url property of this AgentCardConfigDetail.
        :type documentation_url: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'skills': 'list[AgentCardSkillDetail]',
            'capabilities': 'AgentCardCapabilitiesDetail',
            'version': 'str',
            'provider': 'AgentProvider',
            'documentation_url': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'skills': 'skills',
            'capabilities': 'capabilities',
            'version': 'version',
            'provider': 'provider',
            'documentation_url': 'documentationUrl'
        }

        self._name = None
        self._description = None
        self._skills = None
        self._capabilities = None
        self._version = None
        self._provider = None
        self._documentation_url = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this AgentCardConfigDetail.
        Human-readable agent name.


        :return: The name of this AgentCardConfigDetail.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this AgentCardConfigDetail.
        Human-readable agent name.


        :param name: The name of this AgentCardConfigDetail.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this AgentCardConfigDetail.
        Human-readable agent description.


        :return: The description of this AgentCardConfigDetail.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this AgentCardConfigDetail.
        Human-readable agent description.


        :param description: The description of this AgentCardConfigDetail.
        :type: str
        """
        self._description = description

    @property
    def skills(self):
        """
        Gets the skills of this AgentCardConfigDetail.
        List of skills supported by the agent.


        :return: The skills of this AgentCardConfigDetail.
        :rtype: list[oci.aidataplatform_dp.models.AgentCardSkillDetail]
        """
        return self._skills

    @skills.setter
    def skills(self, skills):
        """
        Sets the skills of this AgentCardConfigDetail.
        List of skills supported by the agent.


        :param skills: The skills of this AgentCardConfigDetail.
        :type: list[oci.aidataplatform_dp.models.AgentCardSkillDetail]
        """
        self._skills = skills

    @property
    def capabilities(self):
        """
        Gets the capabilities of this AgentCardConfigDetail.

        :return: The capabilities of this AgentCardConfigDetail.
        :rtype: oci.aidataplatform_dp.models.AgentCardCapabilitiesDetail
        """
        return self._capabilities

    @capabilities.setter
    def capabilities(self, capabilities):
        """
        Sets the capabilities of this AgentCardConfigDetail.

        :param capabilities: The capabilities of this AgentCardConfigDetail.
        :type: oci.aidataplatform_dp.models.AgentCardCapabilitiesDetail
        """
        self._capabilities = capabilities

    @property
    def version(self):
        """
        Gets the version of this AgentCardConfigDetail.
        Agent version string.


        :return: The version of this AgentCardConfigDetail.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this AgentCardConfigDetail.
        Agent version string.


        :param version: The version of this AgentCardConfigDetail.
        :type: str
        """
        self._version = version

    @property
    def provider(self):
        """
        Gets the provider of this AgentCardConfigDetail.

        :return: The provider of this AgentCardConfigDetail.
        :rtype: oci.aidataplatform_dp.models.AgentProvider
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """
        Sets the provider of this AgentCardConfigDetail.

        :param provider: The provider of this AgentCardConfigDetail.
        :type: oci.aidataplatform_dp.models.AgentProvider
        """
        self._provider = provider

    @property
    def documentation_url(self):
        """
        Gets the documentation_url of this AgentCardConfigDetail.
        Documentation URL for the agent. Serialized as `documentation_url`.


        :return: The documentation_url of this AgentCardConfigDetail.
        :rtype: str
        """
        return self._documentation_url

    @documentation_url.setter
    def documentation_url(self, documentation_url):
        """
        Sets the documentation_url of this AgentCardConfigDetail.
        Documentation URL for the agent. Serialized as `documentation_url`.


        :param documentation_url: The documentation_url of this AgentCardConfigDetail.
        :type: str
        """
        self._documentation_url = documentation_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
