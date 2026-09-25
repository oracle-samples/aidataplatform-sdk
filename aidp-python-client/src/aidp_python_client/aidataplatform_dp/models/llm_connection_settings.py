# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LlmConnectionSettings(object):
    """
    Serializable provider connection settings.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LlmConnectionSettings object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param organization:
            The value to assign to the organization property of this LlmConnectionSettings.
        :type organization: str

        :param project:
            The value to assign to the project property of this LlmConnectionSettings.
        :type project: str

        :param timeout:
            The value to assign to the timeout property of this LlmConnectionSettings.
        :type timeout: float

        :param max_retries:
            The value to assign to the max_retries property of this LlmConnectionSettings.
        :type max_retries: int

        :param default_query:
            The value to assign to the default_query property of this LlmConnectionSettings.
        :type default_query: dict(str, str)

        """
        self.swagger_types = {
            'organization': 'str',
            'project': 'str',
            'timeout': 'float',
            'max_retries': 'int',
            'default_query': 'dict(str, str)'
        }

        self.attribute_map = {
            'organization': 'organization',
            'project': 'project',
            'timeout': 'timeout',
            'max_retries': 'maxRetries',
            'default_query': 'defaultQuery'
        }

        self._organization = None
        self._project = None
        self._timeout = None
        self._max_retries = None
        self._default_query = None

    @property
    def organization(self):
        """
        Gets the organization of this LlmConnectionSettings.
        Optional provider organization identifier.


        :return: The organization of this LlmConnectionSettings.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """
        Sets the organization of this LlmConnectionSettings.
        Optional provider organization identifier.


        :param organization: The organization of this LlmConnectionSettings.
        :type: str
        """
        self._organization = organization

    @property
    def project(self):
        """
        Gets the project of this LlmConnectionSettings.
        Optional provider project identifier.


        :return: The project of this LlmConnectionSettings.
        :rtype: str
        """
        return self._project

    @project.setter
    def project(self, project):
        """
        Sets the project of this LlmConnectionSettings.
        Optional provider project identifier.


        :param project: The project of this LlmConnectionSettings.
        :type: str
        """
        self._project = project

    @property
    def timeout(self):
        """
        Gets the timeout of this LlmConnectionSettings.
        Optional provider request timeout in seconds.


        :return: The timeout of this LlmConnectionSettings.
        :rtype: float
        """
        return self._timeout

    @timeout.setter
    def timeout(self, timeout):
        """
        Sets the timeout of this LlmConnectionSettings.
        Optional provider request timeout in seconds.


        :param timeout: The timeout of this LlmConnectionSettings.
        :type: float
        """
        self._timeout = timeout

    @property
    def max_retries(self):
        """
        Gets the max_retries of this LlmConnectionSettings.
        Optional maximum number of provider request retries.


        :return: The max_retries of this LlmConnectionSettings.
        :rtype: int
        """
        return self._max_retries

    @max_retries.setter
    def max_retries(self, max_retries):
        """
        Sets the max_retries of this LlmConnectionSettings.
        Optional maximum number of provider request retries.


        :param max_retries: The max_retries of this LlmConnectionSettings.
        :type: int
        """
        self._max_retries = max_retries

    @property
    def default_query(self):
        """
        Gets the default_query of this LlmConnectionSettings.
        Optional provider query parameters to send by default.


        :return: The default_query of this LlmConnectionSettings.
        :rtype: dict(str, str)
        """
        return self._default_query

    @default_query.setter
    def default_query(self, default_query):
        """
        Sets the default_query of this LlmConnectionSettings.
        Optional provider query parameters to send by default.


        :param default_query: The default_query of this LlmConnectionSettings.
        :type: dict(str, str)
        """
        self._default_query = default_query

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
