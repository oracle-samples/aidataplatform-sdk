# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForCatalogDetails(object):
    """
    Lakeproxy Catalog resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForCatalogDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_name:
            The value to assign to the catalog_name property of this AccessGrantedForCatalogDetails.
        :type catalog_name: str

        """
        self.swagger_types = {
            'catalog_name': 'str'
        }
        self.attribute_map = {
            'catalog_name': 'catalogName'
        }
        self._catalog_name = None

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this AccessGrantedForCatalogDetails.
        Lakeproxy catalogName.


        :return: The catalog_name of this AccessGrantedForCatalogDetails.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this AccessGrantedForCatalogDetails.
        Lakeproxy catalogName.


        :param catalog_name: The catalog_name of this AccessGrantedForCatalogDetails.
        :type: str
        """
        self._catalog_name = catalog_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
