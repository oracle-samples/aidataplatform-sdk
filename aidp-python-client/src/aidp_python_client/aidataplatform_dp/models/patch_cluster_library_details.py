# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PatchClusterLibraryDetails(object):
    """
    Cluster library details to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PatchClusterLibraryDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this PatchClusterLibraryDetails.
        :type items: list[oci.aidataplatform_dp.models.ClusterLibraryDetails]

        """
        self.swagger_types = {
            'items': 'list[ClusterLibraryDetails]'
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = None

    @property
    def items(self):
        """
        Gets the items of this PatchClusterLibraryDetails.
        List of library changes to make.


        :return: The items of this PatchClusterLibraryDetails.
        :rtype: list[oci.aidataplatform_dp.models.ClusterLibraryDetails]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this PatchClusterLibraryDetails.
        List of library changes to make.


        :param items: The items of this PatchClusterLibraryDetails.
        :type: list[oci.aidataplatform_dp.models.ClusterLibraryDetails]
        """
        self._items = items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
