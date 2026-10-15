# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForResponseDetails(object):
    """
    Flattened results in subject order and resource order. Unknown response fields are preserved by the HTTP proxy.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this AccessGrantedForResponseDetails.
        :type items: list[oci.aidataplatform_dp.models.AccessGrantedForResult]

        """
        self.swagger_types = {
            'items': 'list[AccessGrantedForResult]'
        }
        self.attribute_map = {
            'items': 'items'
        }
        self._items = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this AccessGrantedForResponseDetails.
        One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.


        :return: The items of this AccessGrantedForResponseDetails.
        :rtype: list[oci.aidataplatform_dp.models.AccessGrantedForResult]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this AccessGrantedForResponseDetails.
        One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.


        :param items: The items of this AccessGrantedForResponseDetails.
        :type: list[oci.aidataplatform_dp.models.AccessGrantedForResult]
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
