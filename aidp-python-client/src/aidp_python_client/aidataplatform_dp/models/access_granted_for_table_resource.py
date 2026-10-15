# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .access_granted_for_resource import AccessGrantedForResource
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForTableResource(AccessGrantedForResource):
    """
    Lakeproxy Table resource.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForTableResource object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AccessGrantedForTableResource.resource_type` attribute
        of this class is ``TABLE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource_type:
            The value to assign to the resource_type property of this AccessGrantedForTableResource.
        :type resource_type: str

        :param resource_details:
            The value to assign to the resource_details property of this AccessGrantedForTableResource.
        :type resource_details: oci.aidataplatform_dp.models.AccessGrantedForTableDetails

        """
        self.swagger_types = {
            'resource_type': 'str',
            'resource_details': 'AccessGrantedForTableDetails'
        }
        self.attribute_map = {
            'resource_type': 'resourceType',
            'resource_details': 'resourceDetails'
        }
        self._resource_type = None
        self._resource_details = None
        self._resource_type = 'TABLE'

    @property
    def resource_details(self):
        """
        **[Required]** Gets the resource_details of this AccessGrantedForTableResource.

        :return: The resource_details of this AccessGrantedForTableResource.
        :rtype: oci.aidataplatform_dp.models.AccessGrantedForTableDetails
        """
        return self._resource_details

    @resource_details.setter
    def resource_details(self, resource_details):
        """
        Sets the resource_details of this AccessGrantedForTableResource.

        :param resource_details: The resource_details of this AccessGrantedForTableResource.
        :type: oci.aidataplatform_dp.models.AccessGrantedForTableDetails
        """
        self._resource_details = resource_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
