# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentProvider(object):
    """
    Service provider information for an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentProvider object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param organization:
            The value to assign to the organization property of this AgentProvider.
        :type organization: str

        :param url:
            The value to assign to the url property of this AgentProvider.
        :type url: str

        """
        self.swagger_types = {
            'organization': 'str',
            'url': 'str'
        }

        self.attribute_map = {
            'organization': 'organization',
            'url': 'url'
        }

        self._organization = None
        self._url = None

    @property
    def organization(self):
        """
        Gets the organization of this AgentProvider.
        The name of the agent provider's organization.


        :return: The organization of this AgentProvider.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """
        Sets the organization of this AgentProvider.
        The name of the agent provider's organization.


        :param organization: The organization of this AgentProvider.
        :type: str
        """
        self._organization = organization

    @property
    def url(self):
        """
        Gets the url of this AgentProvider.
        A URL for the agent provider's website or documentation.


        :return: The url of this AgentProvider.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """
        Sets the url of this AgentProvider.
        A URL for the agent provider's website or documentation.


        :param url: The url of this AgentProvider.
        :type: str
        """
        self._url = url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
