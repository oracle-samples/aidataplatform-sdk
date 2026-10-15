# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .access_granted_for_resource import AccessGrantedForResource
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForMasterCatalogResource(AccessGrantedForResource):
    """
    Lakeproxy MasterCatalog resource.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForMasterCatalogResource object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AccessGrantedForMasterCatalogResource.resource_type` attribute
        of this class is ``CENTRIFYCATALOG`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource_type:
            The value to assign to the resource_type property of this AccessGrantedForMasterCatalogResource.
        :type resource_type: str

        """
        self.swagger_types = {
            'resource_type': 'str'
        }
        self.attribute_map = {
            'resource_type': 'resourceType'
        }
        self._resource_type = None
        self._resource_type = 'CENTRIFYCATALOG'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
