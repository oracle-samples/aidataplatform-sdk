# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class StartDiscoveryDetails(object):
    """
    Source selection and options for ontology discovery.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new StartDiscoveryDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace:
            The value to assign to the workspace property of this StartDiscoveryDetails.
        :type workspace: str

        :param project_key:
            The value to assign to the project_key property of this StartDiscoveryDetails.
        :type project_key: str

        :param display_name:
            The value to assign to the display_name property of this StartDiscoveryDetails.
        :type display_name: str

        :param sources:
            The value to assign to the sources property of this StartDiscoveryDetails.
        :type sources: list[oci.aidataplatform_dp.models.DiscoverySource]

        :param options:
            The value to assign to the options property of this StartDiscoveryDetails.
        :type options: oci.aidataplatform_dp.models.DiscoveryOptions

        """
        self.swagger_types = {
            'workspace': 'str',
            'project_key': 'str',
            'display_name': 'str',
            'sources': 'list[DiscoverySource]',
            'options': 'DiscoveryOptions'
        }
        self.attribute_map = {
            'workspace': 'workspace',
            'project_key': 'projectKey',
            'display_name': 'displayName',
            'sources': 'sources',
            'options': 'options'
        }
        self._workspace = None
        self._project_key = None
        self._display_name = None
        self._sources = None
        self._options = None

    @property
    def workspace(self):
        """
        Gets the workspace of this StartDiscoveryDetails.
        Workspace key associated with the discovery request.


        :return: The workspace of this StartDiscoveryDetails.
        :rtype: str
        """
        return self._workspace

    @workspace.setter
    def workspace(self, workspace):
        """
        Sets the workspace of this StartDiscoveryDetails.
        Workspace key associated with the discovery request.


        :param workspace: The workspace of this StartDiscoveryDetails.
        :type: str
        """
        self._workspace = workspace

    @property
    def project_key(self):
        """
        Gets the project_key of this StartDiscoveryDetails.
        Project key. The service derives this from the target project for the action route.


        :return: The project_key of this StartDiscoveryDetails.
        :rtype: str
        """
        return self._project_key

    @project_key.setter
    def project_key(self, project_key):
        """
        Sets the project_key of this StartDiscoveryDetails.
        Project key. The service derives this from the target project for the action route.


        :param project_key: The project_key of this StartDiscoveryDetails.
        :type: str
        """
        self._project_key = project_key

    @property
    def display_name(self):
        """
        Gets the display_name of this StartDiscoveryDetails.
        Optional label for the discovery job.


        :return: The display_name of this StartDiscoveryDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this StartDiscoveryDetails.
        Optional label for the discovery job.


        :param display_name: The display_name of this StartDiscoveryDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def sources(self):
        """
        **[Required]** Gets the sources of this StartDiscoveryDetails.
        Sources selected for ontology discovery.


        :return: The sources of this StartDiscoveryDetails.
        :rtype: list[oci.aidataplatform_dp.models.DiscoverySource]
        """
        return self._sources

    @sources.setter
    def sources(self, sources):
        """
        Sets the sources of this StartDiscoveryDetails.
        Sources selected for ontology discovery.


        :param sources: The sources of this StartDiscoveryDetails.
        :type: list[oci.aidataplatform_dp.models.DiscoverySource]
        """
        self._sources = sources

    @property
    def options(self):
        """
        Gets the options of this StartDiscoveryDetails.

        :return: The options of this StartDiscoveryDetails.
        :rtype: oci.aidataplatform_dp.models.DiscoveryOptions
        """
        return self._options

    @options.setter
    def options(self, options):
        """
        Sets the options of this StartDiscoveryDetails.

        :param options: The options of this StartDiscoveryDetails.
        :type: oci.aidataplatform_dp.models.DiscoveryOptions
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
