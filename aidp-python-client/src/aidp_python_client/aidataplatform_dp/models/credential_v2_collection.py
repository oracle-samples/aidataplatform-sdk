# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CredentialV2Collection(object):
    """
    Result of CredentialV2Collection.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CredentialV2Collection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this CredentialV2Collection.
        :type items: list[oci.aidataplatform_dp.models.CredentialV2Summary]

        """
        self.swagger_types = {
            'items': 'list[CredentialV2Summary]'
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this CredentialV2Collection.
        List of CredentialV2 summaries.


        :return: The items of this CredentialV2Collection.
        :rtype: list[oci.aidataplatform_dp.models.CredentialV2Summary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this CredentialV2Collection.
        List of CredentialV2 summaries.


        :param items: The items of this CredentialV2Collection.
        :type: list[oci.aidataplatform_dp.models.CredentialV2Summary]
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
