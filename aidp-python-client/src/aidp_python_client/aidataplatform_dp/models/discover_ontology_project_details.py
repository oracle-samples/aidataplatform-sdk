# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoverOntologyProjectDetails(object):
    """
    Request payload for creating an ontology project from discovered sources.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoverOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project:
            The value to assign to the project property of this DiscoverOntologyProjectDetails.
        :type project: oci.aidataplatform_dp.models.CreateOntologyProjectDetails

        :param discovery:
            The value to assign to the discovery property of this DiscoverOntologyProjectDetails.
        :type discovery: oci.aidataplatform_dp.models.StartDiscoveryDetails

        """
        self.swagger_types = {
            'project': 'CreateOntologyProjectDetails',
            'discovery': 'StartDiscoveryDetails'
        }
        self.attribute_map = {
            'project': 'project',
            'discovery': 'discovery'
        }
        self._project = None
        self._discovery = None

    @property
    def project(self):
        """
        **[Required]** Gets the project of this DiscoverOntologyProjectDetails.

        :return: The project of this DiscoverOntologyProjectDetails.
        :rtype: oci.aidataplatform_dp.models.CreateOntologyProjectDetails
        """
        return self._project

    @project.setter
    def project(self, project):
        """
        Sets the project of this DiscoverOntologyProjectDetails.

        :param project: The project of this DiscoverOntologyProjectDetails.
        :type: oci.aidataplatform_dp.models.CreateOntologyProjectDetails
        """
        self._project = project

    @property
    def discovery(self):
        """
        **[Required]** Gets the discovery of this DiscoverOntologyProjectDetails.

        :return: The discovery of this DiscoverOntologyProjectDetails.
        :rtype: oci.aidataplatform_dp.models.StartDiscoveryDetails
        """
        return self._discovery

    @discovery.setter
    def discovery(self, discovery):
        """
        Sets the discovery of this DiscoverOntologyProjectDetails.

        :param discovery: The discovery of this DiscoverOntologyProjectDetails.
        :type: oci.aidataplatform_dp.models.StartDiscoveryDetails
        """
        self._discovery = discovery

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
