# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForExternalCatalogDetails(object):
    """
    Lakeproxy ExternalCatalog resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForExternalCatalogDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param external_catalog_name:
            The value to assign to the external_catalog_name property of this AccessGrantedForExternalCatalogDetails.
        :type external_catalog_name: str

        """
        self.swagger_types = {
            'external_catalog_name': 'str'
        }
        self.attribute_map = {
            'external_catalog_name': 'externalCatalogName'
        }
        self._external_catalog_name = None

    @property
    def external_catalog_name(self):
        """
        **[Required]** Gets the external_catalog_name of this AccessGrantedForExternalCatalogDetails.
        Lakeproxy externalCatalogName.


        :return: The external_catalog_name of this AccessGrantedForExternalCatalogDetails.
        :rtype: str
        """
        return self._external_catalog_name

    @external_catalog_name.setter
    def external_catalog_name(self, external_catalog_name):
        """
        Sets the external_catalog_name of this AccessGrantedForExternalCatalogDetails.
        Lakeproxy externalCatalogName.


        :param external_catalog_name: The external_catalog_name of this AccessGrantedForExternalCatalogDetails.
        :type: str
        """
        self._external_catalog_name = external_catalog_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
