# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoverExistingOntologyProjectDetails(object):
    """
    Request payload for discovering sources into an existing ontology project.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoverExistingOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param discovery:
            The value to assign to the discovery property of this DiscoverExistingOntologyProjectDetails.
        :type discovery: oci.aidataplatform_dp.models.StartDiscoveryDetails

        """
        self.swagger_types = {
            'discovery': 'StartDiscoveryDetails'
        }
        self.attribute_map = {
            'discovery': 'discovery'
        }
        self._discovery = None

    @property
    def discovery(self):
        """
        **[Required]** Gets the discovery of this DiscoverExistingOntologyProjectDetails.

        :return: The discovery of this DiscoverExistingOntologyProjectDetails.
        :rtype: oci.aidataplatform_dp.models.StartDiscoveryDetails
        """
        return self._discovery

    @discovery.setter
    def discovery(self, discovery):
        """
        Sets the discovery of this DiscoverExistingOntologyProjectDetails.

        :param discovery: The discovery of this DiscoverExistingOntologyProjectDetails.
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
